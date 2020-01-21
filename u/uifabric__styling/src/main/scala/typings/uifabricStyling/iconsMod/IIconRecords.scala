package typings.uifabricStyling.iconsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIconRecords
  extends /* key */ StringDictionary[IIconRecord | js.Object] {
  var __options: IIconOptions
  var __remapped: StringDictionary[String]
}

object IIconRecords {
  @scala.inline
  def apply(
    __options: IIconOptions,
    __remapped: StringDictionary[String],
    StringDictionary: /* key */ StringDictionary[IIconRecord | js.Object] = null
  ): IIconRecords = {
    val __obj = js.Dynamic.literal(__options = __options.asInstanceOf[js.Any], __remapped = __remapped.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IIconRecords]
  }
}

