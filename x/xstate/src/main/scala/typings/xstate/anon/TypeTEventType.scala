package typings.xstate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeTEventType[TEventType /* <: String */] extends js.Object {
  var `type`: TEventType
}

object TypeTEventType {
  @scala.inline
  def apply[TEventType](`type`: TEventType): TypeTEventType[TEventType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeTEventType[TEventType]]
  }
}

