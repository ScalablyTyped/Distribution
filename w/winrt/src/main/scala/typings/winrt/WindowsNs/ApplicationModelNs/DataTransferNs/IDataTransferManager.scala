package typings.winrt.WindowsNs.ApplicationModelNs.DataTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataTransferManager extends js.Object {
  var ondatarequested: js.Any
  var ontargetapplicationchosen: js.Any
}

object IDataTransferManager {
  @scala.inline
  def apply(ondatarequested: js.Any, ontargetapplicationchosen: js.Any): IDataTransferManager = {
    val __obj = js.Dynamic.literal(ondatarequested = ondatarequested, ontargetapplicationchosen = ontargetapplicationchosen)
  
    __obj.asInstanceOf[IDataTransferManager]
  }
}

