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
/* key */ StringDictionary[js.UndefOr[Boolean | Double | String]] {
  
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
  var tabSize: Double
  
  /**
    * Trim all newlines after the final newline at the end of the file.
    *
    * @since 3.15.0
    */
  var trimFinalNewlines: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Trim trailing whitespaces on a line.
    *
    * @since 3.15.0
    */
  var trimTrailingWhitespace: js.UndefOr[Boolean] = js.undefined
}
object FormattingOptions {
  
  @scala.inline
  def apply(insertSpaces: Boolean, tabSize: Double): FormattingOptions = {
    val __obj = js.Dynamic.literal(insertSpaces = insertSpaces.asInstanceOf[js.Any], tabSize = tabSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormattingOptions]
  }
  
  @JSImport("vscode-languageserver-types", "FormattingOptions")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new FormattingOptions literal.
    */
  @scala.inline
  def create(tabSize: Double, insertSpaces: Boolean): FormattingOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(tabSize.asInstanceOf[js.Any], insertSpaces.asInstanceOf[js.Any])).asInstanceOf[FormattingOptions]
  
  /**
    * Checks whether the given literal conforms to the [FormattingOptions](#FormattingOptions) interface.
    */
  @scala.inline
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.FormattingOptions */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.FormattingOptions */ Boolean]
  
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
