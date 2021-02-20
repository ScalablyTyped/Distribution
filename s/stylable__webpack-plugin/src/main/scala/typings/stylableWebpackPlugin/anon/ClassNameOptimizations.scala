package typings.stylableWebpackPlugin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassNameOptimizations extends StObject {
  
  var classNameOptimizations: Boolean = js.native
  
  var minify: Boolean = js.native
  
  var removeComments: Boolean = js.native
  
  var removeEmptyNodes: Boolean = js.native
  
  var removeStylableDirectives: Boolean = js.native
  
  var removeUnusedComponents: Boolean = js.native
  
  var shortNamespaces: Boolean = js.native
}
object ClassNameOptimizations {
  
  @scala.inline
  def apply(
    classNameOptimizations: Boolean,
    minify: Boolean,
    removeComments: Boolean,
    removeEmptyNodes: Boolean,
    removeStylableDirectives: Boolean,
    removeUnusedComponents: Boolean,
    shortNamespaces: Boolean
  ): ClassNameOptimizations = {
    val __obj = js.Dynamic.literal(classNameOptimizations = classNameOptimizations.asInstanceOf[js.Any], minify = minify.asInstanceOf[js.Any], removeComments = removeComments.asInstanceOf[js.Any], removeEmptyNodes = removeEmptyNodes.asInstanceOf[js.Any], removeStylableDirectives = removeStylableDirectives.asInstanceOf[js.Any], removeUnusedComponents = removeUnusedComponents.asInstanceOf[js.Any], shortNamespaces = shortNamespaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassNameOptimizations]
  }
  
  @scala.inline
  implicit class ClassNameOptimizationsMutableBuilder[Self <: ClassNameOptimizations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassNameOptimizations(value: Boolean): Self = StObject.set(x, "classNameOptimizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveComments(value: Boolean): Self = StObject.set(x, "removeComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveEmptyNodes(value: Boolean): Self = StObject.set(x, "removeEmptyNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveStylableDirectives(value: Boolean): Self = StObject.set(x, "removeStylableDirectives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveUnusedComponents(value: Boolean): Self = StObject.set(x, "removeUnusedComponents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortNamespaces(value: Boolean): Self = StObject.set(x, "shortNamespaces", value.asInstanceOf[js.Any])
  }
}
