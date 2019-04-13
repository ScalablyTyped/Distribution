package typings
package vfileLib.vfileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VFileOptions
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var basename: js.UndefOr[java.lang.String] = js.undefined
  var contents: js.UndefOr[VFileContents] = js.undefined
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var dirname: js.UndefOr[java.lang.String] = js.undefined
  var extname: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var stem: js.UndefOr[java.lang.String] = js.undefined
}

object VFileOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    basename: java.lang.String = null,
    contents: VFileContents = null,
    cwd: java.lang.String = null,
    data: js.Any = null,
    dirname: java.lang.String = null,
    extname: java.lang.String = null,
    path: java.lang.String = null,
    stem: java.lang.String = null
  ): VFileOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (basename != null) __obj.updateDynamic("basename")(basename)
    if (contents != null) __obj.updateDynamic("contents")(contents.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (data != null) __obj.updateDynamic("data")(data)
    if (dirname != null) __obj.updateDynamic("dirname")(dirname)
    if (extname != null) __obj.updateDynamic("extname")(extname)
    if (path != null) __obj.updateDynamic("path")(path)
    if (stem != null) __obj.updateDynamic("stem")(stem)
    __obj.asInstanceOf[VFileOptions]
  }
}

