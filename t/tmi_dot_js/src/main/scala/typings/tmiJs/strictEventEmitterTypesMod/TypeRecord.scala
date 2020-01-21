package typings.tmiJs.strictEventEmitterTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeRecord[T, U, V] extends js.Object {
  @JSName(" _emitType")
  var Space_emitType: js.UndefOr[V] = js.undefined
  @JSName(" _emitterType")
  var Space_emitterType: js.UndefOr[T] = js.undefined
  @JSName(" _eventsType")
  var Space_eventsType: js.UndefOr[U] = js.undefined
}

object TypeRecord {
  @scala.inline
  def apply[T, U, V](Space_emitType: V = null, Space_emitterType: T = null, Space_eventsType: U = null): TypeRecord[T, U, V] = {
    val __obj = js.Dynamic.literal()
    if (Space_emitType != null) __obj.updateDynamic(" _emitType")(Space_emitType.asInstanceOf[js.Any])
    if (Space_emitterType != null) __obj.updateDynamic(" _emitterType")(Space_emitterType.asInstanceOf[js.Any])
    if (Space_eventsType != null) __obj.updateDynamic(" _eventsType")(Space_eventsType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeRecord[T, U, V]]
  }
}

