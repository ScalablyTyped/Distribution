package typings.uirouterCore.transitionInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathTypes extends /* key */ StringDictionary[PathType] {
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
    StringDictionary: /* key */ StringDictionary[PathType] = null
  ): PathTypes = {
    val __obj = js.Dynamic.literal(entering = entering.asInstanceOf[js.Any], exiting = exiting.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], retained = retained.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[PathTypes]
  }
}

