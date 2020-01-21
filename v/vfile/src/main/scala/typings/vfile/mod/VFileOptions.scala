package typings.vfile.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VFileOptions
  extends /* key */ StringDictionary[js.Any]
     with _VFileCompatible {
  var basename: js.UndefOr[String] = js.undefined
  var contents: js.UndefOr[VFileContents] = js.undefined
  var cwd: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var dirname: js.UndefOr[String] = js.undefined
  var extname: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var stem: js.UndefOr[String] = js.undefined
}

object VFileOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    basename: String = null,
    contents: VFileContents = null,
    cwd: String = null,
    data: js.Any = null,
    dirname: String = null,
    extname: String = null,
    path: String = null,
    stem: String = null
  ): VFileOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (basename != null) __obj.updateDynamic("basename")(basename.asInstanceOf[js.Any])
    if (contents != null) __obj.updateDynamic("contents")(contents.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dirname != null) __obj.updateDynamic("dirname")(dirname.asInstanceOf[js.Any])
    if (extname != null) __obj.updateDynamic("extname")(extname.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (stem != null) __obj.updateDynamic("stem")(stem.asInstanceOf[js.Any])
    __obj.asInstanceOf[VFileOptions]
  }
}

