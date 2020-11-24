package typings.stylableOptimizer.stylableOptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptimizeConfig extends js.Object {
  
  var classNameOptimizations: js.UndefOr[Boolean] = js.native
  
  var removeComments: js.UndefOr[Boolean] = js.native
  
  var removeEmptyNodes: js.UndefOr[Boolean] = js.native
  
  var removeStylableDirectives: js.UndefOr[Boolean] = js.native
  
  var removeUnusedComponents: js.UndefOr[Boolean] = js.native
}
object OptimizeConfig {
  
  @scala.inline
  def apply(): OptimizeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptimizeConfig]
  }
  
  @scala.inline
  implicit class OptimizeConfigOps[Self <: OptimizeConfig] (val x: Self) extends AnyVal {
    
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
    def deleteClassNameOptimizations: Self = this.set("classNameOptimizations", js.undefined)
    
    @scala.inline
    def setRemoveComments(value: Boolean): Self = this.set("removeComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveComments: Self = this.set("removeComments", js.undefined)
    
    @scala.inline
    def setRemoveEmptyNodes(value: Boolean): Self = this.set("removeEmptyNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveEmptyNodes: Self = this.set("removeEmptyNodes", js.undefined)
    
    @scala.inline
    def setRemoveStylableDirectives(value: Boolean): Self = this.set("removeStylableDirectives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveStylableDirectives: Self = this.set("removeStylableDirectives", js.undefined)
    
    @scala.inline
    def setRemoveUnusedComponents(value: Boolean): Self = this.set("removeUnusedComponents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveUnusedComponents: Self = this.set("removeUnusedComponents", js.undefined)
  }
}
