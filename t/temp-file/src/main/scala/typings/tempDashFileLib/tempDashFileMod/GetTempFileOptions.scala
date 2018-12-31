package typings
package tempDashFileLib.tempDashFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTempFileOptions extends js.Object {
  var disposer: js.UndefOr[(js.Function1[/* file */ java.lang.String, js.Promise[scala.Unit]]) | scala.Null] = js.undefined
  var prefix: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var suffix: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

