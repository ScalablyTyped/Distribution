package typings.typescriptServices.TypeScript.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IShimFactory extends StObject {
  
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
  implicit class IShimFactoryMutableBuilder[Self <: IShimFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegisterShim(value: IShim => Unit): Self = StObject.set(x, "registerShim", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnregisterShim(value: IShim => Unit): Self = StObject.set(x, "unregisterShim", js.Any.fromFunction1(value))
  }
}
