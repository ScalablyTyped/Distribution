package typings.titanium

import org.scalablytyped.runtime.StObject
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
trait StringSearchOptions extends StObject {
  
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
  implicit class StringSearchOptionsMutableBuilder[Self <: StringSearchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackward(value: Boolean): Self = StObject.set(x, "backward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackwardUndefined: Self = StObject.set(x, "backward", js.undefined)
    
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    @scala.inline
    def setWraps(value: Boolean): Self = StObject.set(x, "wraps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapsUndefined: Self = StObject.set(x, "wraps", js.undefined)
  }
}
