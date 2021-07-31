package typings.stylelint

import typings.stylelint.mod.Severity
import typings.stylelint.mod.SyntaxType
import typings.stylelint.mod._FormatterType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylelintStrings {
  
  @js.native
  sealed trait compact
    extends StObject
       with _FormatterType
  @scala.inline
  def compact: compact = "compact".asInstanceOf[compact]
  
  @js.native
  sealed trait `css-in-js`
    extends StObject
       with SyntaxType
  @scala.inline
  def `css-in-js`: `css-in-js` = "css-in-js".asInstanceOf[`css-in-js`]
  
  @js.native
  sealed trait error
    extends StObject
       with Severity
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait html
    extends StObject
       with SyntaxType
  @scala.inline
  def html: html = "html".asInstanceOf[html]
  
  @js.native
  sealed trait json
    extends StObject
       with _FormatterType
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  
  @js.native
  sealed trait less
    extends StObject
       with SyntaxType
  @scala.inline
  def less: less = "less".asInstanceOf[less]
  
  @js.native
  sealed trait markdown
    extends StObject
       with SyntaxType
  @scala.inline
  def markdown: markdown = "markdown".asInstanceOf[markdown]
  
  @js.native
  sealed trait sass
    extends StObject
       with SyntaxType
  @scala.inline
  def sass: sass = "sass".asInstanceOf[sass]
  
  @js.native
  sealed trait scss
    extends StObject
       with SyntaxType
  @scala.inline
  def scss: scss = "scss".asInstanceOf[scss]
  
  @js.native
  sealed trait string
    extends StObject
       with _FormatterType
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait sugarss
    extends StObject
       with SyntaxType
  @scala.inline
  def sugarss: sugarss = "sugarss".asInstanceOf[sugarss]
  
  @js.native
  sealed trait unix
    extends StObject
       with _FormatterType
  @scala.inline
  def unix: unix = "unix".asInstanceOf[unix]
  
  @js.native
  sealed trait verbose
    extends StObject
       with _FormatterType
  @scala.inline
  def verbose: verbose = "verbose".asInstanceOf[verbose]
  
  @js.native
  sealed trait warning
    extends StObject
       with Severity
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
}
