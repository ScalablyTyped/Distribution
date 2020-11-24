package typings.stylelint

import typings.stylelint.mod.Severity
import typings.stylelint.mod.SyntaxType
import typings.stylelint.mod._FormatterType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylelintStrings {
  
  @scala.inline
  def compact: compact = "compact".asInstanceOf[compact]
  
  @scala.inline
  def `css-in-js`: `css-in-js` = "css-in-js".asInstanceOf[`css-in-js`]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def html: html = "html".asInstanceOf[html]
  
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  
  @scala.inline
  def less: less = "less".asInstanceOf[less]
  
  @scala.inline
  def markdown: markdown = "markdown".asInstanceOf[markdown]
  
  @scala.inline
  def sass: sass = "sass".asInstanceOf[sass]
  
  @scala.inline
  def scss: scss = "scss".asInstanceOf[scss]
  
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  
  @scala.inline
  def sugarss: sugarss = "sugarss".asInstanceOf[sugarss]
  
  @scala.inline
  def unix: unix = "unix".asInstanceOf[unix]
  
  @scala.inline
  def verbose: verbose = "verbose".asInstanceOf[verbose]
  
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
  
  @js.native
  sealed trait compact extends _FormatterType
  
  @js.native
  sealed trait `css-in-js` extends SyntaxType
  
  @js.native
  sealed trait error extends Severity
  
  @js.native
  sealed trait html extends SyntaxType
  
  @js.native
  sealed trait json extends _FormatterType
  
  @js.native
  sealed trait less extends SyntaxType
  
  @js.native
  sealed trait markdown extends SyntaxType
  
  @js.native
  sealed trait sass extends SyntaxType
  
  @js.native
  sealed trait scss extends SyntaxType
  
  @js.native
  sealed trait string extends _FormatterType
  
  @js.native
  sealed trait sugarss extends SyntaxType
  
  @js.native
  sealed trait unix extends _FormatterType
  
  @js.native
  sealed trait verbose extends _FormatterType
  
  @js.native
  sealed trait warning extends Severity
}
