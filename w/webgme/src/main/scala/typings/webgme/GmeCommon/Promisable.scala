package typings.webgme.GmeCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Promisable extends js.Object {
  def `catch`(callback: CatchCallback): Promisable
  def `then`(callback: ThenCallback): Promisable
}

object Promisable {
  @scala.inline
  def apply(`catch`: CatchCallback => Promisable, `then`: ThenCallback => Promisable): Promisable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction1(`catch`))
    __obj.updateDynamic("then")(js.Any.fromFunction1(`then`))
    __obj.asInstanceOf[Promisable]
  }
}

