package typings.winrtUwp.Windows.Media.Protection.PlayReady

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Gets custom data from a PlayReady-ND license fetch operation. This custom data is an argument from a PlayReady-ND LicenseFetchCompleted event. */
trait INDLicenseFetchCompletedEventArgs extends StObject {
  
  /** Gets custom data from a license fetch response. */
  var responseCustomData: INDCustomData
}
object INDLicenseFetchCompletedEventArgs {
  
  inline def apply(responseCustomData: INDCustomData): INDLicenseFetchCompletedEventArgs = {
    val __obj = js.Dynamic.literal(responseCustomData = responseCustomData.asInstanceOf[js.Any])
    __obj.asInstanceOf[INDLicenseFetchCompletedEventArgs]
  }
  
  extension [Self <: INDLicenseFetchCompletedEventArgs](x: Self) {
    
    inline def setResponseCustomData(value: INDCustomData): Self = StObject.set(x, "responseCustomData", value.asInstanceOf[js.Any])
  }
}
