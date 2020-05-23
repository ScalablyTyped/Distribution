package typings.tar.mod

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
    devmaj: js.UndefOr[Double] = js.undefined,
    devmin: js.UndefOr[Double] = js.undefined,
    gid: js.UndefOr[Double] = js.undefined,
    gname: String = null,
    mode: js.UndefOr[Double] = js.undefined,
    mtime: js.UndefOr[Double] = js.undefined,
    noProprietary: js.UndefOr[Boolean] = js.undefined,
    size: js.UndefOr[Double] = js.undefined,
    `type`: String = null,
    uid: js.UndefOr[Double] = js.undefined,
    uname: String = null
  ): HeaderProperties = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(devmaj)) __obj.updateDynamic("devmaj")(devmaj.get.asInstanceOf[js.Any])
    if (!js.isUndefined(devmin)) __obj.updateDynamic("devmin")(devmin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gid)) __obj.updateDynamic("gid")(gid.get.asInstanceOf[js.Any])
    if (gname != null) __obj.updateDynamic("gname")(gname.asInstanceOf[js.Any])
    if (!js.isUndefined(mode)) __obj.updateDynamic("mode")(mode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mtime)) __obj.updateDynamic("mtime")(mtime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noProprietary)) __obj.updateDynamic("noProprietary")(noProprietary.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(uid)) __obj.updateDynamic("uid")(uid.get.asInstanceOf[js.Any])
    if (uname != null) __obj.updateDynamic("uname")(uname.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderProperties]
  }
}

