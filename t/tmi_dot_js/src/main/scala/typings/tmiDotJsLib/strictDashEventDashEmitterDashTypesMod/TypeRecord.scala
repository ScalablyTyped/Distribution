package typings
package tmiDotJsLib.strictDashEventDashEmitterDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeRecord[T, U, V] extends js.Object {
  var ` _emitType`: js.UndefOr[V] = js.undefined
  var ` _emitterType`: js.UndefOr[T] = js.undefined
  var ` _eventsType`: js.UndefOr[U] = js.undefined
}

object TypeRecord {
  @scala.inline
  def apply[T, U, V](` _emitType`: V = null, ` _emitterType`: T = null, ` _eventsType`: U = null): TypeRecord[T, U, V] = {
    val __obj = js.Dynamic.literal()
    if (` _emitType` != null) __obj.updateDynamic(" _emitType")(` _emitType`.asInstanceOf[js.Any])
    if (` _emitterType` != null) __obj.updateDynamic(" _emitterType")(` _emitterType`.asInstanceOf[js.Any])
    if (` _eventsType` != null) __obj.updateDynamic(" _eventsType")(` _eventsType`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeRecord[T, U, V]]
  }
}

