package typings.yauzl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var autoClose: js.UndefOr[Boolean] = js.native
  
  var decodeStrings: js.UndefOr[Boolean] = js.native
  
  var lazyEntries: js.UndefOr[Boolean] = js.native
  
  var strictFileNames: js.UndefOr[Boolean] = js.native
  
  var validateEntrySizes: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAutoClose(value: Boolean): Self = this.set("autoClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoClose: Self = this.set("autoClose", js.undefined)
    
    @scala.inline
    def setDecodeStrings(value: Boolean): Self = this.set("decodeStrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecodeStrings: Self = this.set("decodeStrings", js.undefined)
    
    @scala.inline
    def setLazyEntries(value: Boolean): Self = this.set("lazyEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLazyEntries: Self = this.set("lazyEntries", js.undefined)
    
    @scala.inline
    def setStrictFileNames(value: Boolean): Self = this.set("strictFileNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrictFileNames: Self = this.set("strictFileNames", js.undefined)
    
    @scala.inline
    def setValidateEntrySizes(value: Boolean): Self = this.set("validateEntrySizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateEntrySizes: Self = this.set("validateEntrySizes", js.undefined)
  }
}
