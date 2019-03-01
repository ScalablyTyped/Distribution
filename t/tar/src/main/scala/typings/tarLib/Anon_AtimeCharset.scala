package typings
package tarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AtimeCharset extends js.Object {
  var atime: scala.Boolean
  var charset: scala.Boolean
  var comment: scala.Boolean
  var ctime: scala.Boolean
  var gid: scala.Boolean
  var gname: scala.Boolean
  var linkpat: scala.Boolean
  var mtime: scala.Boolean
  var path: scala.Boolean
  var realtime: scala.Boolean
  var security: scala.Boolean
  var size: scala.Boolean
  var uid: scala.Boolean
  var uname: scala.Boolean
}

object Anon_AtimeCharset {
  @scala.inline
  def apply(
    atime: scala.Boolean,
    charset: scala.Boolean,
    comment: scala.Boolean,
    ctime: scala.Boolean,
    gid: scala.Boolean,
    gname: scala.Boolean,
    linkpat: scala.Boolean,
    mtime: scala.Boolean,
    path: scala.Boolean,
    realtime: scala.Boolean,
    security: scala.Boolean,
    size: scala.Boolean,
    uid: scala.Boolean,
    uname: scala.Boolean
  ): Anon_AtimeCharset = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("atime")(atime)
    __obj.updateDynamic("charset")(charset)
    __obj.updateDynamic("comment")(comment)
    __obj.updateDynamic("ctime")(ctime)
    __obj.updateDynamic("gid")(gid)
    __obj.updateDynamic("gname")(gname)
    __obj.updateDynamic("linkpat")(linkpat)
    __obj.updateDynamic("mtime")(mtime)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("realtime")(realtime)
    __obj.updateDynamic("security")(security)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("uid")(uid)
    __obj.updateDynamic("uname")(uname)
    __obj.asInstanceOf[Anon_AtimeCharset]
  }
}

