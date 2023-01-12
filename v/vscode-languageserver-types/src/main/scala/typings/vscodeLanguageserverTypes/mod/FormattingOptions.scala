package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormattingOptions
  extends StObject
     with /**
  * Signature for further properties.
  */
/* key */ StringDictionary[js.UndefOr[Boolean | integer | String]] {
  
  /**
    * Insert a newline character at the end of the file if one does not exist.
    *
    * @since 3.15.0
    */
  var insertFinalNewline: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Prefer spaces over tabs.
    */
  var insertSpaces: Boolean
  
  /**
    * Size of a tab in spaces.
    */
  var tabSize: uinteger
  
  /**
    * Trim all newlines after the final newline at the end of the file.
    *
    * @since 3.15.0
    */
  var trimFinalNewlines: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Trim trailing whitespace on a line.
    *
    * @since 3.15.0
    */
  var trimTrailingWhitespace: js.UndefOr[Boolean] = js.undefined
}
object FormattingOptions {
  
  inline def apply(insertSpaces: Boolean, tabSize: uinteger): FormattingOptions = {
    val __obj = js.Dynamic.literal(insertSpaces = insertSpaces.asInstanceOf[js.Any], tabSize = tabSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormattingOptions]
  }
  
  @JSImport("vscode-languageserver-types", "FormattingOptions")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new FormattingOptions literal.
    */
  inline def create(tabSize: uinteger, insertSpaces: Boolean): FormattingOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tabSize.asInstanceOf[js.Any], insertSpaces.asInstanceOf[js.Any])).asInstanceOf[FormattingOptions]
  
  /**
    * Checks whether the given literal conforms to the [FormattingOptions](#FormattingOptions) interface.
    */
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.FormattingOptions */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.FormattingOptions */ Boolean]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormattingOptions] (val x: Self) extends AnyVal {
    
    inline def setInsertFinalNewline(value: Boolean): Self = StObject.set(x, "insertFinalNewline", value.asInstanceOf[js.Any])
    
    inline def setInsertFinalNewlineUndefined: Self = StObject.set(x, "insertFinalNewline", js.undefined)
    
    inline def setInsertSpaces(value: Boolean): Self = StObject.set(x, "insertSpaces", value.asInstanceOf[js.Any])
    
    inline def setTabSize(value: uinteger): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
    
    inline def setTrimFinalNewlines(value: Boolean): Self = StObject.set(x, "trimFinalNewlines", value.asInstanceOf[js.Any])
    
    inline def setTrimFinalNewlinesUndefined: Self = StObject.set(x, "trimFinalNewlines", js.undefined)
    
    inline def setTrimTrailingWhitespace(value: Boolean): Self = StObject.set(x, "trimTrailingWhitespace", value.asInstanceOf[js.Any])
    
    inline def setTrimTrailingWhitespaceUndefined: Self = StObject.set(x, "trimTrailingWhitespace", js.undefined)
  }
}
