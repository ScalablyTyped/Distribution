package typings.unist.unistMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node
  extends /* key */ StringDictionary[js.Any] {
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
  var `type`: String
}

object Node {
  @scala.inline
  def apply(
    `type`: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    data: Data = null,
    position: Position = null
  ): Node = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

