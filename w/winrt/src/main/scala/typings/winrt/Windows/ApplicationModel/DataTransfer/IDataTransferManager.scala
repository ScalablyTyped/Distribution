package typings.winrt.Windows.ApplicationModel.DataTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDataTransferManager extends StObject {
  
  var ondatarequested: js.Any
  
  var ontargetapplicationchosen: js.Any
}
object IDataTransferManager {
  
  inline def apply(ondatarequested: js.Any, ontargetapplicationchosen: js.Any): IDataTransferManager = {
    val __obj = js.Dynamic.literal(ondatarequested = ondatarequested.asInstanceOf[js.Any], ontargetapplicationchosen = ontargetapplicationchosen.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataTransferManager]
  }
  
  extension [Self <: IDataTransferManager](x: Self) {
    
    inline def setOndatarequested(value: js.Any): Self = StObject.set(x, "ondatarequested", value.asInstanceOf[js.Any])
    
    inline def setOntargetapplicationchosen(value: js.Any): Self = StObject.set(x, "ontargetapplicationchosen", value.asInstanceOf[js.Any])
  }
}
