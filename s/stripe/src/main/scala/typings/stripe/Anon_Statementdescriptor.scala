package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Statementdescriptor extends js.Object {
  /**
    * The default text that appears on credit card statements when a charge is
    * made. This field prefixes any dynamic statement_descriptor specified on the
    * charge.
    */
  var statement_descriptor: js.UndefOr[String] = js.undefined
}

object Anon_Statementdescriptor {
  @scala.inline
  def apply(statement_descriptor: String = null): Anon_Statementdescriptor = {
    val __obj = js.Dynamic.literal()
    if (statement_descriptor != null) __obj.updateDynamic("statement_descriptor")(statement_descriptor)
    __obj.asInstanceOf[Anon_Statementdescriptor]
  }
}

