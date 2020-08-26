package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Statementdescriptor extends js.Object {
  /**
    * The default text that appears on credit card statements when a charge is
    * made. This field prefixes any dynamic statement_descriptor specified on the
    * charge.
    */
  var statement_descriptor: js.UndefOr[String] = js.native
  /**
    * The Kana variation of the default text that appears on credit card statements
    * when a charge is made (Japan only)
    */
  var statement_descriptor_kana: js.UndefOr[String | Null] = js.native
  /**
    * The Kanji variation of the default text that appears on credit card statements
    * when a charge is made (Japan only)
    */
  var statement_descriptor_kanji: js.UndefOr[String | Null] = js.native
}

object Statementdescriptor {
  @scala.inline
  def apply(): Statementdescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Statementdescriptor]
  }
  @scala.inline
  implicit class StatementdescriptorOps[Self <: Statementdescriptor] (val x: Self) extends AnyVal {
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
    def setStatement_descriptor(value: String): Self = this.set("statement_descriptor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatement_descriptor: Self = this.set("statement_descriptor", js.undefined)
    @scala.inline
    def setStatement_descriptor_kana(value: String): Self = this.set("statement_descriptor_kana", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatement_descriptor_kana: Self = this.set("statement_descriptor_kana", js.undefined)
    @scala.inline
    def setStatement_descriptor_kanaNull: Self = this.set("statement_descriptor_kana", null)
    @scala.inline
    def setStatement_descriptor_kanji(value: String): Self = this.set("statement_descriptor_kanji", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatement_descriptor_kanji: Self = this.set("statement_descriptor_kanji", js.undefined)
    @scala.inline
    def setStatement_descriptor_kanjiNull: Self = this.set("statement_descriptor_kanji", null)
  }
  
}

