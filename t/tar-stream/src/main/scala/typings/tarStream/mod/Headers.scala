package typings.tarStream.mod

import typings.std.Date
import typings.tarStream.tarStreamStrings.`block-device`
import typings.tarStream.tarStreamStrings.`character-device`
import typings.tarStream.tarStreamStrings.`contiguous-file`
import typings.tarStream.tarStreamStrings.`gnu-long-link-path`
import typings.tarStream.tarStreamStrings.`gnu-long-path`
import typings.tarStream.tarStreamStrings.`pax-global-header`
import typings.tarStream.tarStreamStrings.`pax-header`
import typings.tarStream.tarStreamStrings.directory
import typings.tarStream.tarStreamStrings.fifo
import typings.tarStream.tarStreamStrings.file
import typings.tarStream.tarStreamStrings.link
import typings.tarStream.tarStreamStrings.symlink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Headers extends js.Object {
  var devmajor: js.UndefOr[Double] = js.undefined
  var devminor: js.UndefOr[Double] = js.undefined
  var gid: js.UndefOr[Double] = js.undefined
  var gname: js.UndefOr[String] = js.undefined
  var linkname: js.UndefOr[String | Null] = js.undefined
  var mode: js.UndefOr[Double] = js.undefined
  var mtime: js.UndefOr[Date] = js.undefined
  var name: String
  var size: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[
    file | link | symlink | `character-device` | `block-device` | directory | fifo | `contiguous-file` | `pax-header` | `pax-global-header` | `gnu-long-link-path` | `gnu-long-path` | Null
  ] = js.undefined
  var uid: js.UndefOr[Double] = js.undefined
  var uname: js.UndefOr[String] = js.undefined
}

object Headers {
  @scala.inline
  def apply(
    name: String,
    devmajor: js.UndefOr[Double] = js.undefined,
    devminor: js.UndefOr[Double] = js.undefined,
    gid: js.UndefOr[Double] = js.undefined,
    gname: String = null,
    linkname: js.UndefOr[Null | String] = js.undefined,
    mode: js.UndefOr[Double] = js.undefined,
    mtime: Date = null,
    size: js.UndefOr[Double] = js.undefined,
    `type`: js.UndefOr[
      Null | file | link | symlink | `character-device` | `block-device` | directory | fifo | `contiguous-file` | `pax-header` | `pax-global-header` | `gnu-long-link-path` | `gnu-long-path`
    ] = js.undefined,
    uid: js.UndefOr[Double] = js.undefined,
    uname: String = null
  ): Headers = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(devmajor)) __obj.updateDynamic("devmajor")(devmajor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(devminor)) __obj.updateDynamic("devminor")(devminor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gid)) __obj.updateDynamic("gid")(gid.get.asInstanceOf[js.Any])
    if (gname != null) __obj.updateDynamic("gname")(gname.asInstanceOf[js.Any])
    if (!js.isUndefined(linkname)) __obj.updateDynamic("linkname")(linkname.asInstanceOf[js.Any])
    if (!js.isUndefined(mode)) __obj.updateDynamic("mode")(mode.get.asInstanceOf[js.Any])
    if (mtime != null) __obj.updateDynamic("mtime")(mtime.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(uid)) __obj.updateDynamic("uid")(uid.get.asInstanceOf[js.Any])
    if (uname != null) __obj.updateDynamic("uname")(uname.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
}

