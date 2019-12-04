package typings.tablesorter.parsingParserMod

import typings.tablesorter.parsingParserTypeMod.ParserType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parser[TElement] extends js.Object {
  /**
    * The id of the parser.
    */
  var id: String
  /**
    * A value indicating whether the tablesorter should use parsed text for searching.
    */
  var parsed: Boolean
  /**
    * The type of the parser.
    */
  var `type`: ParserType
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
  def format(text: String, table: TElement): String
  /**
    * Checks whether a text is applicable to the parser.
    *
    * @param text
    * The text to check.
    *
    * @returns
    * A value indicating whether the parser is applicable to the `text`.
    */
  def is(text: String): Boolean
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
}

