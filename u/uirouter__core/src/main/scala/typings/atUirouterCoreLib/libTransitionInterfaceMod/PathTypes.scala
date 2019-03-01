package typings
package atUirouterCoreLib.libTransitionInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathTypes
  extends /* key */ org.scalablytyped.runtime.StringDictionary[PathType] {
  var entering: PathType
  var exiting: PathType
  var from: PathType
  var retained: PathType
  var to: PathType
}

object PathTypes {
  @scala.inline
  def apply(
    entering: PathType,
    exiting: PathType,
    from: PathType,
    retained: PathType,
    to: PathType,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[PathType] = null
  ): PathTypes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("entering")(entering)
    __obj.updateDynamic("exiting")(exiting)
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("retained")(retained)
    __obj.updateDynamic("to")(to)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[PathTypes]
  }
}

