package typings
package unistLib.unistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * Information from the ecosystem.
    */
  var data: js.UndefOr[Data] = js.undefined
  /**
    * Location of a node in a source document.
    * Must not be present if a node is generated.
    */
  var position: js.UndefOr[Position] = js.undefined
  /**
    * The variant of a node.
    */
  var `type`: java.lang.String
}

object Node {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    data: Data = null,
    position: Position = null
  ): Node = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Node]
  }
}

