package typings.unimodulesReactNativeAdapter.syntheticPlatformEmitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyntheticPlatformEmitter extends js.Object {
  var _emitter: js.Any
  def emit(eventName: String, props: js.Any): Unit
}

object SyntheticPlatformEmitter {
  @scala.inline
  def apply(_emitter: js.Any, emit: (String, js.Any) => Unit): SyntheticPlatformEmitter = {
    val __obj = js.Dynamic.literal(_emitter = _emitter.asInstanceOf[js.Any], emit = js.Any.fromFunction2(emit))
  
    __obj.asInstanceOf[SyntheticPlatformEmitter]
  }
}

