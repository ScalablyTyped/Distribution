package typings.winrt.Windows.ApplicationModel.DataTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDataTransferManager extends StObject {
  
  var ondatarequested: js.Any = js.native
  
  var ontargetapplicationchosen: js.Any = js.native
}
object IDataTransferManager {
  
  @scala.inline
  def apply(ondatarequested: js.Any, ontargetapplicationchosen: js.Any): IDataTransferManager = {
    val __obj = js.Dynamic.literal(ondatarequested = ondatarequested.asInstanceOf[js.Any], ontargetapplicationchosen = ontargetapplicationchosen.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataTransferManager]
  }
  
  @scala.inline
  implicit class IDataTransferManagerMutableBuilder[Self <: IDataTransferManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOndatarequested(value: js.Any): Self = StObject.set(x, "ondatarequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOntargetapplicationchosen(value: js.Any): Self = StObject.set(x, "ontargetapplicationchosen", value.asInstanceOf[js.Any])
  }
}
