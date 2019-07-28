package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventObject
  extends /* other */ StringDictionary[js.Any] {
  /**
    * The unique ID that identifies this specific event instance.
    */
  var id: js.UndefOr[String | Double] = js.undefined
  /**
    * The type of event that is sent.
    */
  var `type`: String
}

object EventObject {
  @scala.inline
  def apply(
    `type`: String,
    StringDictionary: /* other */ StringDictionary[js.Any] = null,
    id: String | Double = null
  ): EventObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventObject]
  }
}

