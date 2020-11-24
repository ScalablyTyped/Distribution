package typings.tensorflowTfjsCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaveConfig extends js.Object {
  
  /**
    * Whether the optimizer will be saved (if exists).
    *
    * Default: `false`.
    */
  var includeOptimizer: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to save only the trainable weights of the model, ignoring the
    * non-trainable ones.
    */
  var trainableOnly: js.UndefOr[Boolean] = js.native
}
object SaveConfig {
  
  @scala.inline
  def apply(): SaveConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveConfig]
  }
  
  @scala.inline
  implicit class SaveConfigOps[Self <: SaveConfig] (val x: Self) extends AnyVal {
    
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
    def setIncludeOptimizer(value: Boolean): Self = this.set("includeOptimizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeOptimizer: Self = this.set("includeOptimizer", js.undefined)
    
    @scala.inline
    def setTrainableOnly(value: Boolean): Self = this.set("trainableOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrainableOnly: Self = this.set("trainableOnly", js.undefined)
  }
}
