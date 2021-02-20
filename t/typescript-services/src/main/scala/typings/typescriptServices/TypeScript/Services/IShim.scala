package typings.typescriptServices.TypeScript.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IShim extends StObject {
  
  def dispose(dummy: js.Any): Unit = js.native
}
object IShim {
  
  @scala.inline
  def apply(dispose: js.Any => Unit): IShim = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction1(dispose))
    __obj.asInstanceOf[IShim]
  }
  
  @scala.inline
  implicit class IShimMutableBuilder[Self <: IShim] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDispose(value: js.Any => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction1(value))
  }
}
