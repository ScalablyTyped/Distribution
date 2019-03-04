package typings
package tarDashStreamLib.tarDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Headers extends js.Object {
  var devmajor: js.UndefOr[scala.Double] = js.undefined
  var devminor: js.UndefOr[scala.Double] = js.undefined
  var gid: js.UndefOr[scala.Double] = js.undefined
  var gname: js.UndefOr[java.lang.String] = js.undefined
  var linkname: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var mode: js.UndefOr[scala.Double] = js.undefined
  var mtime: js.UndefOr[stdLib.Date] = js.undefined
  var name: java.lang.String
  var size: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[
    tarDashStreamLib.tarDashStreamLibStrings.file | tarDashStreamLib.tarDashStreamLibStrings.link | tarDashStreamLib.tarDashStreamLibStrings.symlink | tarDashStreamLib.tarDashStreamLibStrings.`character-device` | tarDashStreamLib.tarDashStreamLibStrings.`block-device` | tarDashStreamLib.tarDashStreamLibStrings.directory | tarDashStreamLib.tarDashStreamLibStrings.fifo | tarDashStreamLib.tarDashStreamLibStrings.`contiguous-file` | tarDashStreamLib.tarDashStreamLibStrings.`pax-header` | tarDashStreamLib.tarDashStreamLibStrings.`pax-global-header` | tarDashStreamLib.tarDashStreamLibStrings.`gnu-long-link-path` | tarDashStreamLib.tarDashStreamLibStrings.`gnu-long-path` | scala.Null
  ] = js.undefined
  var uid: js.UndefOr[scala.Double] = js.undefined
  var uname: js.UndefOr[java.lang.String] = js.undefined
}

object Headers {
  @scala.inline
  def apply(
    name: java.lang.String,
    devmajor: scala.Int | scala.Double = null,
    devminor: scala.Int | scala.Double = null,
    gid: scala.Int | scala.Double = null,
    gname: java.lang.String = null,
    linkname: java.lang.String = null,
    mode: scala.Int | scala.Double = null,
    mtime: stdLib.Date = null,
    size: scala.Int | scala.Double = null,
    `type`: tarDashStreamLib.tarDashStreamLibStrings.file | tarDashStreamLib.tarDashStreamLibStrings.link | tarDashStreamLib.tarDashStreamLibStrings.symlink | tarDashStreamLib.tarDashStreamLibStrings.`character-device` | tarDashStreamLib.tarDashStreamLibStrings.`block-device` | tarDashStreamLib.tarDashStreamLibStrings.directory | tarDashStreamLib.tarDashStreamLibStrings.fifo | tarDashStreamLib.tarDashStreamLibStrings.`contiguous-file` | tarDashStreamLib.tarDashStreamLibStrings.`pax-header` | tarDashStreamLib.tarDashStreamLibStrings.`pax-global-header` | tarDashStreamLib.tarDashStreamLibStrings.`gnu-long-link-path` | tarDashStreamLib.tarDashStreamLibStrings.`gnu-long-path` = null,
    uid: scala.Int | scala.Double = null,
    uname: java.lang.String = null
  ): Headers = {
    val __obj = js.Dynamic.literal(name = name)
    if (devmajor != null) __obj.updateDynamic("devmajor")(devmajor.asInstanceOf[js.Any])
    if (devminor != null) __obj.updateDynamic("devminor")(devminor.asInstanceOf[js.Any])
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (gname != null) __obj.updateDynamic("gname")(gname)
    if (linkname != null) __obj.updateDynamic("linkname")(linkname)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (mtime != null) __obj.updateDynamic("mtime")(mtime)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (uname != null) __obj.updateDynamic("uname")(uname)
    __obj.asInstanceOf[Headers]
  }
}

