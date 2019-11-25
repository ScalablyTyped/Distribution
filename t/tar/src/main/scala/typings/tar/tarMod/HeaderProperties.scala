package typings.tar.tarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderProperties extends js.Object {
  var devmaj: js.UndefOr[Double] = js.undefined
  var devmin: js.UndefOr[Double] = js.undefined
  var gid: js.UndefOr[Double] = js.undefined
  var gname: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[Double] = js.undefined
  var mtime: js.UndefOr[Double] = js.undefined
  var noProprietary: js.UndefOr[Boolean] = js.undefined
  var path: String
  var size: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var uid: js.UndefOr[Double] = js.undefined
  var uname: js.UndefOr[String] = js.undefined
}

object HeaderProperties {
  @scala.inline
  def apply(
    path: String,
    devmaj: Int | Double = null,
    devmin: Int | Double = null,
    gid: Int | Double = null,
    gname: String = null,
    mode: Int | Double = null,
    mtime: Int | Double = null,
    noProprietary: js.UndefOr[Boolean] = js.undefined,
    size: Int | Double = null,
    `type`: String = null,
    uid: Int | Double = null,
    uname: String = null
  ): HeaderProperties = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (devmaj != null) __obj.updateDynamic("devmaj")(devmaj.asInstanceOf[js.Any])
    if (devmin != null) __obj.updateDynamic("devmin")(devmin.asInstanceOf[js.Any])
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (gname != null) __obj.updateDynamic("gname")(gname.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (mtime != null) __obj.updateDynamic("mtime")(mtime.asInstanceOf[js.Any])
    if (!js.isUndefined(noProprietary)) __obj.updateDynamic("noProprietary")(noProprietary.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (uname != null) __obj.updateDynamic("uname")(uname.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderProperties]
  }
}

