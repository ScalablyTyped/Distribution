package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The optional options to pass to the <Titanium.UI.WebView.findString>. Pass a
  * dictionary with one or more of the following string-keys:
  *     * `caseSensitive` (Boolean value)
  *     * `backward` (Boolean value)
  *     * `wraps` (Boolean value)
  */
@js.native
trait StringSearchOptions extends js.Object {
  
  /**
    * The direction to search from the current selection. The search will respect the writing direction of the document
    */
  var backward: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether or not the search should be case sensitive.
    */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the search should start at the beginning of the document once it reaches the end.
    */
  var wraps: js.UndefOr[Boolean] = js.native
}
object StringSearchOptions {
  
  @scala.inline
  def apply(): StringSearchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringSearchOptions]
  }
  
  @scala.inline
  implicit class StringSearchOptionsOps[Self <: StringSearchOptions] (val x: Self) extends AnyVal {
    
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
    def setBackward(value: Boolean): Self = this.set("backward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackward: Self = this.set("backward", js.undefined)
    
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    
    @scala.inline
    def setWraps(value: Boolean): Self = this.set("wraps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWraps: Self = this.set("wraps", js.undefined)
  }
}
