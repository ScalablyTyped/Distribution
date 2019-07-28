package typings.tress

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tressMod {
  type TressJobCallback = js.ThisFunction1[/* this */ TressJobData, /* repeated */ js.Any, Unit]
  type TressJobData = StringDictionary[js.Object]
  type TressWorkerDoneCallback = js.Function2[/* err */ js.UndefOr[Boolean | Error | Null], /* repeated */ js.Any, Unit]
}
