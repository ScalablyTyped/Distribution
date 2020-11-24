package typings.typeorm.entityRepositoryMetadataArgsMod

import typings.typeorm.entityTargetMod.EntityTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntityRepositoryMetadataArgs extends js.Object {
  
  /**
    * Entity managed by this custom repository.
    */
  val entity: js.UndefOr[EntityTarget[_]] = js.native
  
  /**
    * Constructor of the custom entity repository.
    */
  val target: js.Function = js.native
}
object EntityRepositoryMetadataArgs {
  
  @scala.inline
  def apply(target: js.Function): EntityRepositoryMetadataArgs = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityRepositoryMetadataArgs]
  }
  
  @scala.inline
  implicit class EntityRepositoryMetadataArgsOps[Self <: EntityRepositoryMetadataArgs] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setEntity(value: EntityTarget[_]): Self = this.set("entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntity: Self = this.set("entity", js.undefined)
  }
}
