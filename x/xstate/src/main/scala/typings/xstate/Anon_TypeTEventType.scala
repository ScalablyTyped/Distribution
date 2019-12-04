package typings.xstate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TypeTEventType[TEventType /* <: String */] extends js.Object {
  var `type`: TEventType
}

object Anon_TypeTEventType {
  @scala.inline
  def apply[TEventType /* <: String */](`type`: TEventType): Anon_TypeTEventType[TEventType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TypeTEventType[TEventType]]
  }
}

