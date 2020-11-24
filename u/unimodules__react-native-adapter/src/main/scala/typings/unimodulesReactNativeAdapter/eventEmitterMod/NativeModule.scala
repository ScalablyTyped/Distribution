package typings.unimodulesReactNativeAdapter.eventEmitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeModule extends js.Object {
  
  def addListener(eventName: String): Unit = js.native
  
  def removeListeners(count: Double): Unit = js.native
  
  var startObserving: js.UndefOr[js.Function0[Unit]] = js.native
  
  var stopObserving: js.UndefOr[js.Function0[Unit]] = js.native
}
object NativeModule {
  
  @scala.inline
  def apply(addListener: String => Unit, removeListeners: Double => Unit): NativeModule = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener), removeListeners = js.Any.fromFunction1(removeListeners))
    __obj.asInstanceOf[NativeModule]
  }
  
  @scala.inline
  implicit class NativeModuleOps[Self <: NativeModule] (val x: Self) extends AnyVal {
    
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
    def setAddListener(value: String => Unit): Self = this.set("addListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveListeners(value: Double => Unit): Self = this.set("removeListeners", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartObserving(value: () => Unit): Self = this.set("startObserving", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteStartObserving: Self = this.set("startObserving", js.undefined)
    
    @scala.inline
    def setStopObserving(value: () => Unit): Self = this.set("stopObserving", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteStopObserving: Self = this.set("stopObserving", js.undefined)
  }
}
