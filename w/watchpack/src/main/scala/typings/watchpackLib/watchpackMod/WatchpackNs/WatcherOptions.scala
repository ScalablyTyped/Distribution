package typings
package watchpackLib.watchpackMod.WatchpackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatcherOptions extends js.Object {
  var ignored: js.UndefOr[
    js.Array[java.lang.String] | java.lang.String | stdLib.RegExp | (js.Function1[/* path */ java.lang.String, scala.Boolean])
  ] = js.undefined
  var poll: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
}

