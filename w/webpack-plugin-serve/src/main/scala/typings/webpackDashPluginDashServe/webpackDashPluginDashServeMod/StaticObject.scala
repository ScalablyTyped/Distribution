package typings.webpackDashPluginDashServe.webpackDashPluginDashServeMod

import typings.fastDashGlob.fastDashGlobMod.Options
import typings.fastDashGlob.outTypesEntriesMod.EntryItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticObject extends js.Object {
  var glob: js.UndefOr[String | js.Array[String]] = js.undefined
  var options: js.UndefOr[Options[EntryItem]] = js.undefined
}

object StaticObject {
  @scala.inline
  def apply(glob: String | js.Array[String] = null, options: Options[EntryItem] = null): StaticObject = {
    val __obj = js.Dynamic.literal()
    if (glob != null) __obj.updateDynamic("glob")(glob.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticObject]
  }
}

