package typings
package xstateLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventObject
  extends /* other */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * The unique ID that identifies this specific event instance.
    */
  var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * The type of event that is sent.
    */
  var `type`: java.lang.String
}

object EventObject {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    StringDictionary: /* other */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    id: java.lang.String | scala.Double = null
  ): EventObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventObject]
  }
}

