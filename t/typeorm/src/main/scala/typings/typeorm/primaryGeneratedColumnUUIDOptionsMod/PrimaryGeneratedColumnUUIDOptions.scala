package typings.typeorm.primaryGeneratedColumnUUIDOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrimaryGeneratedColumnUUIDOptions extends js.Object {
  
  /**
    * Column comment. Not supported by all database types.
    */
  var comment: js.UndefOr[String] = js.native
  
  /**
    * Column name in the database.
    */
  var name: js.UndefOr[String] = js.native
}
object PrimaryGeneratedColumnUUIDOptions {
  
  @scala.inline
  def apply(): PrimaryGeneratedColumnUUIDOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrimaryGeneratedColumnUUIDOptions]
  }
  
  @scala.inline
  implicit class PrimaryGeneratedColumnUUIDOptionsOps[Self <: PrimaryGeneratedColumnUUIDOptions] (val x: Self) extends AnyVal {
    
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
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
