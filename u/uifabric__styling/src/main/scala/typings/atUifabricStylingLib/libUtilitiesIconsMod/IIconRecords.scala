package typings
package atUifabricStylingLib.libUtilitiesIconsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIconRecords
  extends /* key */ org.scalablytyped.runtime.StringDictionary[IIconRecord | js.Object] {
  var __options: IIconOptions
  var __remapped: org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

object IIconRecords {
  @scala.inline
  def apply(
    __options: IIconOptions,
    __remapped: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[IIconRecord | js.Object] = null
  ): IIconRecords = {
    val __obj = js.Dynamic.literal(__options = __options, __remapped = __remapped)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IIconRecords]
  }
}

