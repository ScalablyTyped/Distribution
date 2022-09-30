package typings.tabulatorTables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedEditorParams extends StObject {
  
  var elementAttributes: js.UndefOr[JSONRecord] = js.undefined
  
  /**
    * Built-in editors based on input elements such as the input, number, textarea and autocomplete editors have the ability to mask the users input to restrict it to match a given pattern.
    *
    * This can be set by passing a string to the the mask option in the columns editorParams
    * Each character in the string passed to the mask option defines what type of character can be entered in that position in the editor.
    *
    * - A - Only a letter is valid in this position
    * - 9 - Only a number is valid in this position
    * - `*` - Any character is valid in this position
    *
    * Any other character - The character in this position must be the same as the mask
    * For example, a mask string of "AAA-999" would require the user to enter three letters followed by a hyphen followed by three numbers
    *
    * If you want to use the characters A, 9 or * as fixed characters then it is possible to change the characters looked for in the mask by using the maskLetterChar, maskNumberChar and maskWildcardChar options in the editorParams
    */
  var mask: js.UndefOr[String] = js.undefined
  
  /** you are using fixed characters in your mask (any character other that A, 9 or *), then you can get the mask to automatically fill in these characters for you as you type by setting the maskAutoFill option in the editorParams to true. */
  var maskAutoFill: js.UndefOr[Boolean] = js.undefined
  
  var maskLetterChar: js.UndefOr[String] = js.undefined
  
  var maskNumberChar: js.UndefOr[String] = js.undefined
  
  var maskWildcardChar: js.UndefOr[String] = js.undefined
}
object SharedEditorParams {
  
  inline def apply(): SharedEditorParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedEditorParams]
  }
  
  extension [Self <: SharedEditorParams](x: Self) {
    
    inline def setElementAttributes(value: JSONRecord): Self = StObject.set(x, "elementAttributes", value.asInstanceOf[js.Any])
    
    inline def setElementAttributesUndefined: Self = StObject.set(x, "elementAttributes", js.undefined)
    
    inline def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskAutoFill(value: Boolean): Self = StObject.set(x, "maskAutoFill", value.asInstanceOf[js.Any])
    
    inline def setMaskAutoFillUndefined: Self = StObject.set(x, "maskAutoFill", js.undefined)
    
    inline def setMaskLetterChar(value: String): Self = StObject.set(x, "maskLetterChar", value.asInstanceOf[js.Any])
    
    inline def setMaskLetterCharUndefined: Self = StObject.set(x, "maskLetterChar", js.undefined)
    
    inline def setMaskNumberChar(value: String): Self = StObject.set(x, "maskNumberChar", value.asInstanceOf[js.Any])
    
    inline def setMaskNumberCharUndefined: Self = StObject.set(x, "maskNumberChar", js.undefined)
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    inline def setMaskWildcardChar(value: String): Self = StObject.set(x, "maskWildcardChar", value.asInstanceOf[js.Any])
    
    inline def setMaskWildcardCharUndefined: Self = StObject.set(x, "maskWildcardChar", js.undefined)
  }
}
