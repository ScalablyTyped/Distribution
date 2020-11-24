package typings.uslug.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UslugOptions extends js.Object {
  
  var allowedChars: js.UndefOr[String] = js.native
  
  var lower: js.UndefOr[Boolean] = js.native
  
  var spaces: js.UndefOr[Boolean] = js.native
}
object UslugOptions {
  
  @scala.inline
  def apply(): UslugOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UslugOptions]
  }
  
  @scala.inline
  implicit class UslugOptionsOps[Self <: UslugOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowedChars(value: String): Self = this.set("allowedChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedChars: Self = this.set("allowedChars", js.undefined)
    
    @scala.inline
    def setLower(value: Boolean): Self = this.set("lower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLower: Self = this.set("lower", js.undefined)
    
    @scala.inline
    def setSpaces(value: Boolean): Self = this.set("spaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpaces: Self = this.set("spaces", js.undefined)
  }
}
