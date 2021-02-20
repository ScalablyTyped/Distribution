package typings.winrt.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICurrentTimeChangeRequestedEventArgs extends StObject {
  
  var time: Double = js.native
}
object ICurrentTimeChangeRequestedEventArgs {
  
  @scala.inline
  def apply(time: Double): ICurrentTimeChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICurrentTimeChangeRequestedEventArgs]
  }
  
  @scala.inline
  implicit class ICurrentTimeChangeRequestedEventArgsMutableBuilder[Self <: ICurrentTimeChangeRequestedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
