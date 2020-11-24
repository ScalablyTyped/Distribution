package typings.typeorm.metadataArgsEntitySubscriberMetadataArgsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntitySubscriberMetadataArgs extends js.Object {
  
  /**
    * Class to which subscriber is applied.
    */
  val target: js.Function = js.native
}
object EntitySubscriberMetadataArgs {
  
  @scala.inline
  def apply(target: js.Function): EntitySubscriberMetadataArgs = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntitySubscriberMetadataArgs]
  }
  
  @scala.inline
  implicit class EntitySubscriberMetadataArgsOps[Self <: EntitySubscriberMetadataArgs] (val x: Self) extends AnyVal {
    
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
    def setTarget(value: js.Function): Self = this.set("target", value.asInstanceOf[js.Any])
  }
}
