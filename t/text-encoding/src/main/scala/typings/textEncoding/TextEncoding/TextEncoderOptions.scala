package typings.textEncoding.TextEncoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextEncoderOptions extends js.Object {
  
  var NONSTANDARD_allowLegacyEncoding: js.UndefOr[Boolean] = js.native
}
object TextEncoderOptions {
  
  @scala.inline
  def apply(): TextEncoderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextEncoderOptions]
  }
  
  @scala.inline
  implicit class TextEncoderOptionsOps[Self <: TextEncoderOptions] (val x: Self) extends AnyVal {
    
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
    def setNONSTANDARD_allowLegacyEncoding(value: Boolean): Self = this.set("NONSTANDARD_allowLegacyEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNONSTANDARD_allowLegacyEncoding: Self = this.set("NONSTANDARD_allowLegacyEncoding", js.undefined)
  }
}
