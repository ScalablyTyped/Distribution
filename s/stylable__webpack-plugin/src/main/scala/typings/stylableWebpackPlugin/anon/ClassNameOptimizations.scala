package typings.stylableWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassNameOptimizations extends js.Object {
  
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
  implicit class ClassNameOptimizationsOps[Self <: ClassNameOptimizations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClassNameOptimizations(value: Boolean): Self = this.set("classNameOptimizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinify(value: Boolean): Self = this.set("minify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveComments(value: Boolean): Self = this.set("removeComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveEmptyNodes(value: Boolean): Self = this.set("removeEmptyNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveStylableDirectives(value: Boolean): Self = this.set("removeStylableDirectives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveUnusedComponents(value: Boolean): Self = this.set("removeUnusedComponents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortNamespaces(value: Boolean): Self = this.set("shortNamespaces", value.asInstanceOf[js.Any])
  }
}
