package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SuccessResCompleteFail[T] extends js.Object {
  var complete: js.Function0[scala.Unit]
  var fail: js.Function0[scala.Unit]
  var success: js.Function1[/* res */ T, scala.Unit]
}

