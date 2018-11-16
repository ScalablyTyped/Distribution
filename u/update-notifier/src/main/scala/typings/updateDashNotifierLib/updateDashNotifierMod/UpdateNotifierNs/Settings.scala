package typings
package updateDashNotifierLib.updateDashNotifierMod.UpdateNotifierNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Settings extends js.Object {
  var callback: js.UndefOr[
    js.Function2[/* error */ stdLib.Error | scala.Null, /* update */ js.UndefOr[UpdateInfo], _]
  ] = js.undefined
  var packageName: js.UndefOr[java.lang.String] = js.undefined
  var packageVersion: js.UndefOr[java.lang.String] = js.undefined
  var pkg: js.UndefOr[Package] = js.undefined
   // in milliseconds, default 1000 * 60 * 60 * 24 (1 day)
  var shouldNotifyInNpmScript: js.UndefOr[scala.Boolean] = js.undefined
  var updateCheckInterval: js.UndefOr[scala.Double] = js.undefined
}

