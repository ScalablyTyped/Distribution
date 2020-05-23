package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Statementdescriptor extends js.Object {
  /**
    * The default text that appears on credit card statements when a charge is
    * made. This field prefixes any dynamic statement_descriptor specified on the
    * charge.
    */
  var statement_descriptor: js.UndefOr[String] = js.undefined
  /**
    * The Kana variation of the default text that appears on credit card statements
    * when a charge is made (Japan only)
    */
  var statement_descriptor_kana: js.UndefOr[String | Null] = js.undefined
  /**
    * The Kanji variation of the default text that appears on credit card statements
    * when a charge is made (Japan only)
    */
  var statement_descriptor_kanji: js.UndefOr[String | Null] = js.undefined
}

object Statementdescriptor {
  @scala.inline
  def apply(
    statement_descriptor: String = null,
    statement_descriptor_kana: js.UndefOr[Null | String] = js.undefined,
    statement_descriptor_kanji: js.UndefOr[Null | String] = js.undefined
  ): Statementdescriptor = {
    val __obj = js.Dynamic.literal()
    if (statement_descriptor != null) __obj.updateDynamic("statement_descriptor")(statement_descriptor.asInstanceOf[js.Any])
    if (!js.isUndefined(statement_descriptor_kana)) __obj.updateDynamic("statement_descriptor_kana")(statement_descriptor_kana.asInstanceOf[js.Any])
    if (!js.isUndefined(statement_descriptor_kanji)) __obj.updateDynamic("statement_descriptor_kanji")(statement_descriptor_kanji.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statementdescriptor]
  }
}

