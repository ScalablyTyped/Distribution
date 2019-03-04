package typings
package atUirouterCoreLib.libTransitionInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMatchingNodes
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode]] {
  var entering: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode]
  var exiting: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode]
  var from: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode]
  var retained: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode]
  var to: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode]
}

object IMatchingNodes {
  @scala.inline
  def apply(
    entering: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode],
    exiting: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode],
    from: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode],
    retained: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode],
    to: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode],
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode]] = null
  ): IMatchingNodes = {
    val __obj = js.Dynamic.literal(entering = entering, exiting = exiting, from = from, retained = retained, to = to)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IMatchingNodes]
  }
}

