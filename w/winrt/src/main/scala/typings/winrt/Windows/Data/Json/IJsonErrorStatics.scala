package typings.winrt.Windows.Data.Json

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IJsonErrorStatics extends StObject {
  
  def getStatus(hresult: Double): JsonErrorStatus = js.native
}
object IJsonErrorStatics {
  
  @scala.inline
  def apply(getStatus: Double => JsonErrorStatus): IJsonErrorStatics = {
    val __obj = js.Dynamic.literal(getStatus = js.Any.fromFunction1(getStatus))
    __obj.asInstanceOf[IJsonErrorStatics]
  }
  
  @scala.inline
  implicit class IJsonErrorStaticsMutableBuilder[Self <: IJsonErrorStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetStatus(value: Double => JsonErrorStatus): Self = StObject.set(x, "getStatus", js.Any.fromFunction1(value))
  }
}
