package typings.unimodulesReactNativeAdapter.syntheticPlatformEmitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyntheticPlatformEmitter extends js.Object {
  var _emitter: js.Any = js.native
  def emit(eventName: String, props: js.Any): Unit = js.native
}

object SyntheticPlatformEmitter {
  @scala.inline
  def apply(_emitter: js.Any, emit: (String, js.Any) => Unit): SyntheticPlatformEmitter = {
    val __obj = js.Dynamic.literal(_emitter = _emitter.asInstanceOf[js.Any], emit = js.Any.fromFunction2(emit))
    __obj.asInstanceOf[SyntheticPlatformEmitter]
  }
  @scala.inline
  implicit class SyntheticPlatformEmitterOps[Self <: SyntheticPlatformEmitter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_emitter(value: js.Any): Self = this.set("_emitter", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmit(value: (String, js.Any) => Unit): Self = this.set("emit", js.Any.fromFunction2(value))
  }
  
}

