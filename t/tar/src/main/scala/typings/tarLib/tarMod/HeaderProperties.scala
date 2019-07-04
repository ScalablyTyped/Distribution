package typings
package tarLib.tarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderProperties extends js.Object {
  var devmaj: js.UndefOr[scala.Double] = js.undefined
  var devmin: js.UndefOr[scala.Double] = js.undefined
  var gid: js.UndefOr[scala.Double] = js.undefined
  var gname: js.UndefOr[java.lang.String] = js.undefined
  var mode: js.UndefOr[scala.Double] = js.undefined
  var mtime: js.UndefOr[scala.Double] = js.undefined
  var noProprietary: js.UndefOr[scala.Boolean] = js.undefined
  var path: java.lang.String
  var size: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var uid: js.UndefOr[scala.Double] = js.undefined
  var uname: js.UndefOr[java.lang.String] = js.undefined
}

object HeaderProperties {
  @scala.inline
  def apply(
    path: java.lang.String,
    devmaj: scala.Int | scala.Double = null,
    devmin: scala.Int | scala.Double = null,
    gid: scala.Int | scala.Double = null,
    gname: java.lang.String = null,
    mode: scala.Int | scala.Double = null,
    mtime: scala.Int | scala.Double = null,
    noProprietary: js.UndefOr[scala.Boolean] = js.undefined,
    size: scala.Int | scala.Double = null,
    `type`: java.lang.String = null,
    uid: scala.Int | scala.Double = null,
    uname: java.lang.String = null
  ): HeaderProperties = {
    val __obj = js.Dynamic.literal(path = path)
    if (devmaj != null) __obj.updateDynamic("devmaj")(devmaj.asInstanceOf[js.Any])
    if (devmin != null) __obj.updateDynamic("devmin")(devmin.asInstanceOf[js.Any])
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (gname != null) __obj.updateDynamic("gname")(gname)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (mtime != null) __obj.updateDynamic("mtime")(mtime.asInstanceOf[js.Any])
    if (!js.isUndefined(noProprietary)) __obj.updateDynamic("noProprietary")(noProprietary)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (uname != null) __obj.updateDynamic("uname")(uname)
    __obj.asInstanceOf[HeaderProperties]
  }
}

