package typings.winrt.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICallControlStatics extends StObject {
  
  def fromId(deviceInterfaceId: String): CallControl = js.native
  
  def getDefault(): CallControl = js.native
}
object ICallControlStatics {
  
  @scala.inline
  def apply(fromId: String => CallControl, getDefault: () => CallControl): ICallControlStatics = {
    val __obj = js.Dynamic.literal(fromId = js.Any.fromFunction1(fromId), getDefault = js.Any.fromFunction0(getDefault))
    __obj.asInstanceOf[ICallControlStatics]
  }
  
  @scala.inline
  implicit class ICallControlStaticsMutableBuilder[Self <: ICallControlStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromId(value: String => CallControl): Self = StObject.set(x, "fromId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDefault(value: () => CallControl): Self = StObject.set(x, "getDefault", js.Any.fromFunction0(value))
  }
}
