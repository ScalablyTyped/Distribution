package typings.stylableWebpackPlugin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassNameOptimizations extends StObject {
  
  var classNameOptimizations: Boolean
  
  var minify: Boolean
  
  var removeComments: Boolean
  
  var removeEmptyNodes: Boolean
  
  var removeStylableDirectives: Boolean
  
  var removeUnusedComponents: Boolean
  
  var shortNamespaces: Boolean
}
object ClassNameOptimizations {
  
  inline def apply(
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
  
  extension [Self <: ClassNameOptimizations](x: Self) {
    
    inline def setClassNameOptimizations(value: Boolean): Self = StObject.set(x, "classNameOptimizations", value.asInstanceOf[js.Any])
    
    inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
    
    inline def setRemoveComments(value: Boolean): Self = StObject.set(x, "removeComments", value.asInstanceOf[js.Any])
    
    inline def setRemoveEmptyNodes(value: Boolean): Self = StObject.set(x, "removeEmptyNodes", value.asInstanceOf[js.Any])
    
    inline def setRemoveStylableDirectives(value: Boolean): Self = StObject.set(x, "removeStylableDirectives", value.asInstanceOf[js.Any])
    
    inline def setRemoveUnusedComponents(value: Boolean): Self = StObject.set(x, "removeUnusedComponents", value.asInstanceOf[js.Any])
    
    inline def setShortNamespaces(value: Boolean): Self = StObject.set(x, "shortNamespaces", value.asInstanceOf[js.Any])
  }
}
