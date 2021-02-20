package typings.winrt.Windows.Web.Syndication

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISyndicationErrorStatics extends StObject {
  
  def getStatus(hresult: Double): SyndicationErrorStatus = js.native
}
object ISyndicationErrorStatics {
  
  @scala.inline
  def apply(getStatus: Double => SyndicationErrorStatus): ISyndicationErrorStatics = {
    val __obj = js.Dynamic.literal(getStatus = js.Any.fromFunction1(getStatus))
    __obj.asInstanceOf[ISyndicationErrorStatics]
  }
  
  @scala.inline
  implicit class ISyndicationErrorStaticsMutableBuilder[Self <: ISyndicationErrorStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetStatus(value: Double => SyndicationErrorStatus): Self = StObject.set(x, "getStatus", js.Any.fromFunction1(value))
  }
}
