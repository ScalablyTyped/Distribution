package typings.winrtUwp.Windows.Media.Protection.PlayReady

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the result of the PlayReady-ND license fetch. */
trait INDLicenseFetchResult extends StObject {
  
  /** Gets the custom data from a license fetch response. */
  var responseCustomData: INDCustomData
}
object INDLicenseFetchResult {
  
  inline def apply(responseCustomData: INDCustomData): INDLicenseFetchResult = {
    val __obj = js.Dynamic.literal(responseCustomData = responseCustomData.asInstanceOf[js.Any])
    __obj.asInstanceOf[INDLicenseFetchResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: INDLicenseFetchResult] (val x: Self) extends AnyVal {
    
    inline def setResponseCustomData(value: INDCustomData): Self = StObject.set(x, "responseCustomData", value.asInstanceOf[js.Any])
  }
}
