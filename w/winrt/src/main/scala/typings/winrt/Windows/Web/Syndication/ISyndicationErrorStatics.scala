package typings.winrt.Windows.Web.Syndication

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISyndicationErrorStatics extends StObject {
  
  def getStatus(hresult: Double): SyndicationErrorStatus
}
object ISyndicationErrorStatics {
  
  inline def apply(getStatus: Double => SyndicationErrorStatus): ISyndicationErrorStatics = {
    val __obj = js.Dynamic.literal(getStatus = js.Any.fromFunction1(getStatus))
    __obj.asInstanceOf[ISyndicationErrorStatics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISyndicationErrorStatics] (val x: Self) extends AnyVal {
    
    inline def setGetStatus(value: Double => SyndicationErrorStatus): Self = StObject.set(x, "getStatus", js.Any.fromFunction1(value))
  }
}
