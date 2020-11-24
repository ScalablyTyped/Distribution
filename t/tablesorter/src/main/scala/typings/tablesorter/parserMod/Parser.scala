package typings.tablesorter.parserMod

import typings.tablesorter.parserTypeMod.ParserType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parser[TElement] extends js.Object {
  
  /**
    * Formats the text of a cell.
    *
    * @param text
    * The text to format.
    *
    * @param table
    * The table which is being processed.
    *
    * @return
    * The formatted text.
    */
  def format(text: String, table: TElement): String = js.native
  
  /**
    * The id of the parser.
    */
  var id: String = js.native
  
  /**
    * Checks whether a text is applicable to the parser.
    *
    * @param text
    * The text to check.
    *
    * @returns
    * A value indicating whether the parser is applicable to the `text`.
    */
  def is(text: String): Boolean = js.native
  
  /**
    * A value indicating whether the tablesorter should use parsed text for searching.
    */
  var parsed: Boolean = js.native
  
  /**
    * The type of the parser.
    */
  var `type`: ParserType = js.native
}
object Parser {
  
  @scala.inline
  def apply[TElement](
    format: (String, TElement) => String,
    id: String,
    is: String => Boolean,
    parsed: Boolean,
    `type`: ParserType
  ): Parser[TElement] = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction2(format), id = id.asInstanceOf[js.Any], is = js.Any.fromFunction1(is), parsed = parsed.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parser[TElement]]
  }
  
  @scala.inline
  implicit class ParserOps[Self <: Parser[_], TElement] (val x: Self with Parser[TElement]) extends AnyVal {
    
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
    def setFormat(value: (String, TElement) => String): Self = this.set("format", js.Any.fromFunction2(value))
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs(value: String => Boolean): Self = this.set("is", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParsed(value: Boolean): Self = this.set("parsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ParserType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
