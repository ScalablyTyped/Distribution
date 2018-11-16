package typings
package whatwgDashStreamsLib.whatwgDashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait QueuingStrategy[T] extends js.Object {
  var highWaterMark: js.UndefOr[scala.Double] = js.undefined
  var size: js.UndefOr[js.Function1[/* chunk */ T, scala.Double]] = js.undefined
}

