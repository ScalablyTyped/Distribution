package typings.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IShimFactory extends js.Object {
  
  def registerShim(shim: IShim): Unit = js.native
  
  def unregisterShim(shim: IShim): Unit = js.native
}
object IShimFactory {
  
  @scala.inline
  def apply(registerShim: IShim => Unit, unregisterShim: IShim => Unit): IShimFactory = {
    val __obj = js.Dynamic.literal(registerShim = js.Any.fromFunction1(registerShim), unregisterShim = js.Any.fromFunction1(unregisterShim))
    __obj.asInstanceOf[IShimFactory]
  }
  
  @scala.inline
  implicit class IShimFactoryOps[Self <: IShimFactory] (val x: Self) extends AnyVal {
    
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
    def setRegisterShim(value: IShim => Unit): Self = this.set("registerShim", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnregisterShim(value: IShim => Unit): Self = this.set("unregisterShim", js.Any.fromFunction1(value))
  }
}
