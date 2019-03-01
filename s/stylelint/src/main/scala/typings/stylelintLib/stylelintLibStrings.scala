package typings
package stylelintLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object stylelintLibStrings {
  @js.native
  sealed trait compact
    extends stylelintLib.stylelintMod.FormatterType
  
  @js.native
  sealed trait json
    extends stylelintLib.stylelintMod.FormatterType
  
  @js.native
  sealed trait less
    extends stylelintLib.stylelintMod.SyntaxType
  
  @js.native
  sealed trait sass
    extends stylelintLib.stylelintMod.SyntaxType
  
  @js.native
  sealed trait scss
    extends stylelintLib.stylelintMod.SyntaxType
  
  @js.native
  sealed trait string
    extends stylelintLib.stylelintMod.FormatterType
  
  @js.native
  sealed trait sugarss
    extends stylelintLib.stylelintMod.SyntaxType
  
  @js.native
  sealed trait verbose
    extends stylelintLib.stylelintMod.FormatterType
  
  @scala.inline
  def compact: compact = "compact".asInstanceOf[compact]
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  @scala.inline
  def less: less = "less".asInstanceOf[less]
  @scala.inline
  def sass: sass = "sass".asInstanceOf[sass]
  @scala.inline
  def scss: scss = "scss".asInstanceOf[scss]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  @scala.inline
  def sugarss: sugarss = "sugarss".asInstanceOf[sugarss]
  @scala.inline
  def verbose: verbose = "verbose".asInstanceOf[verbose]
}

