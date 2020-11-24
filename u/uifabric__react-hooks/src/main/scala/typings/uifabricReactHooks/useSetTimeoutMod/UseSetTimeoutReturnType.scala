package typings.uifabricReactHooks.useSetTimeoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseSetTimeoutReturnType extends js.Object {
  
  def clearTimeout(id: Double): Unit = js.native
  
  def setTimeout(callback: js.Function0[Unit], duration: Double): Double = js.native
}
object UseSetTimeoutReturnType {
  
  @scala.inline
  def apply(clearTimeout: Double => Unit, setTimeout: (js.Function0[Unit], Double) => Double): UseSetTimeoutReturnType = {
    val __obj = js.Dynamic.literal(clearTimeout = js.Any.fromFunction1(clearTimeout), setTimeout = js.Any.fromFunction2(setTimeout))
    __obj.asInstanceOf[UseSetTimeoutReturnType]
  }
  
  @scala.inline
  implicit class UseSetTimeoutReturnTypeOps[Self <: UseSetTimeoutReturnType] (val x: Self) extends AnyVal {
    
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
    def setClearTimeout(value: Double => Unit): Self = this.set("clearTimeout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTimeout(value: (js.Function0[Unit], Double) => Double): Self = this.set("setTimeout", js.Any.fromFunction2(value))
  }
}
