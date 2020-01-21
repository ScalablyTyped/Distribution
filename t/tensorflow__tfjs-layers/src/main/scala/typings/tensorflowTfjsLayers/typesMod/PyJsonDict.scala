package typings.tensorflowTfjsLayers.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PyJsonDict
  extends /* key */ StringDictionary[PyJsonValue]
     with _PyJsonValue

object PyJsonDict {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[PyJsonValue] = null): PyJsonDict = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[PyJsonDict]
  }
}

