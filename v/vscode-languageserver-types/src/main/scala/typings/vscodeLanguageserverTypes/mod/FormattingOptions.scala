package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormattingOptions
  extends /**
  * Signature for further properties.
  */
/* key */ StringDictionary[js.UndefOr[Boolean | Double | String]] {
  
  /**
    * Insert a newline character at the end of the file if one does not exist.
    *
    * @since 3.15.0
    */
  var insertFinalNewline: js.UndefOr[Boolean] = js.native
  
  /**
    * Prefer spaces over tabs.
    */
  var insertSpaces: Boolean = js.native
  
  /**
    * Size of a tab in spaces.
    */
  var tabSize: Double = js.native
  
  /**
    * Trim all newlines after the final newline at the end of the file.
    *
    * @since 3.15.0
    */
  var trimFinalNewlines: js.UndefOr[Boolean] = js.native
  
  /**
    * Trim trailing whitespaces on a line.
    *
    * @since 3.15.0
    */
  var trimTrailingWhitespace: js.UndefOr[Boolean] = js.native
}
object FormattingOptions {
  
  @scala.inline
  def apply(insertSpaces: Boolean, tabSize: Double): FormattingOptions = {
    val __obj = js.Dynamic.literal(insertSpaces = insertSpaces.asInstanceOf[js.Any], tabSize = tabSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormattingOptions]
  }
  
  /**
    * Creates a new FormattingOptions literal.
    */
  @JSImport("vscode-languageserver-types", "FormattingOptions.create")
  @js.native
  def create(tabSize: Double, insertSpaces: Boolean): FormattingOptions = js.native
  
  /**
    * Checks whether the given literal conforms to the [FormattingOptions](#FormattingOptions) interface.
    */
  @JSImport("vscode-languageserver-types", "FormattingOptions.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.FormattingOptions */ Boolean = js.native
  
  @scala.inline
  implicit class FormattingOptionsMutableBuilder[Self <: FormattingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsertFinalNewline(value: Boolean): Self = StObject.set(x, "insertFinalNewline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertFinalNewlineUndefined: Self = StObject.set(x, "insertFinalNewline", js.undefined)
    
    @scala.inline
    def setInsertSpaces(value: Boolean): Self = StObject.set(x, "insertSpaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabSize(value: Double): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrimFinalNewlines(value: Boolean): Self = StObject.set(x, "trimFinalNewlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrimFinalNewlinesUndefined: Self = StObject.set(x, "trimFinalNewlines", js.undefined)
    
    @scala.inline
    def setTrimTrailingWhitespace(value: Boolean): Self = StObject.set(x, "trimTrailingWhitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrimTrailingWhitespaceUndefined: Self = StObject.set(x, "trimTrailingWhitespace", js.undefined)
  }
}
