package typings.xmlcreate.xmlCdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IXmlCdataOptions extends js.Object {
  
  /**
    * The character data of the CDATA section.
    */
  var charData: String = js.native
  
  /**
    * Whether to replace any invalid characters in the character data of the
    * CDATA section with the Unicode replacement character. By default, this
    * is disabled.
    */
  var replaceInvalidCharsInCharData: js.UndefOr[Boolean] = js.native
}
object IXmlCdataOptions {
  
  @scala.inline
  def apply(charData: String): IXmlCdataOptions = {
    val __obj = js.Dynamic.literal(charData = charData.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXmlCdataOptions]
  }
  
  @scala.inline
  implicit class IXmlCdataOptionsOps[Self <: IXmlCdataOptions] (val x: Self) extends AnyVal {
    
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
    def setCharData(value: String): Self = this.set("charData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceInvalidCharsInCharData(value: Boolean): Self = this.set("replaceInvalidCharsInCharData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceInvalidCharsInCharData: Self = this.set("replaceInvalidCharsInCharData", js.undefined)
  }
}
