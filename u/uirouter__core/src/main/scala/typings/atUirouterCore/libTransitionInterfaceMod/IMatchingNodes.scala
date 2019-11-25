package typings.atUirouterCore.libTransitionInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.atUirouterCore.libPathPathNodeMod.PathNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMatchingNodes
  extends /* key */ StringDictionary[js.Array[PathNode]] {
  var entering: js.Array[PathNode]
  var exiting: js.Array[PathNode]
  var from: js.Array[PathNode]
  var retained: js.Array[PathNode]
  var to: js.Array[PathNode]
}

object IMatchingNodes {
  @scala.inline
  def apply(
    entering: js.Array[PathNode],
    exiting: js.Array[PathNode],
    from: js.Array[PathNode],
    retained: js.Array[PathNode],
    to: js.Array[PathNode],
    StringDictionary: /* key */ StringDictionary[js.Array[PathNode]] = null
  ): IMatchingNodes = {
    val __obj = js.Dynamic.literal(entering = entering.asInstanceOf[js.Any], exiting = exiting.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], retained = retained.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IMatchingNodes]
  }
}

