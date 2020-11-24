package typings.typeorm.anon

import typings.typeorm.foreignKeyMetadataMod.ForeignKeyMetadata
import typings.typeorm.uniqueMetadataMod.UniqueMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForeignKey extends js.Object {
  
  var foreignKey: js.UndefOr[ForeignKeyMetadata] = js.native
  
  var uniqueConstraint: js.UndefOr[UniqueMetadata] = js.native
}
object ForeignKey {
  
  @scala.inline
  def apply(): ForeignKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForeignKey]
  }
  
  @scala.inline
  implicit class ForeignKeyOps[Self <: ForeignKey] (val x: Self) extends AnyVal {
    
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
    def setForeignKey(value: ForeignKeyMetadata): Self = this.set("foreignKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForeignKey: Self = this.set("foreignKey", js.undefined)
    
    @scala.inline
    def setUniqueConstraint(value: UniqueMetadata): Self = this.set("uniqueConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniqueConstraint: Self = this.set("uniqueConstraint", js.undefined)
  }
}
