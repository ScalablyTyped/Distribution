package typings.typeorm.metadataArgsEntityListenerMetadataArgsMod

import typings.typeorm.typesEventListenerTypesMod.EventListenerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntityListenerMetadataArgs extends js.Object {
  
  /**
    * Class's property name to which listener is applied.
    */
  val propertyName: String = js.native
  
  /**
    * Class to which listener is applied.
    */
  val target: js.Function = js.native
  
  /**
    * The type of the listener.
    */
  val `type`: EventListenerType = js.native
}
object EntityListenerMetadataArgs {
  
  @scala.inline
  def apply(propertyName: String, target: js.Function, `type`: EventListenerType): EntityListenerMetadataArgs = {
    val __obj = js.Dynamic.literal(propertyName = propertyName.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityListenerMetadataArgs]
  }
  
  @scala.inline
  implicit class EntityListenerMetadataArgsOps[Self <: EntityListenerMetadataArgs] (val x: Self) extends AnyVal {
    
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
    def setPropertyName(value: String): Self = this.set("propertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: js.Function): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: EventListenerType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
