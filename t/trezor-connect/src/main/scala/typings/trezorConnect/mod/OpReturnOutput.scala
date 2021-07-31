package typings.trezorConnect.mod

import typings.trezorConnect.trezorConnectStrings.opreturn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpReturnOutput
  extends StObject
     with Output {
  
  var dataHex: String
  
  var `type`: opreturn
}
object OpReturnOutput {
  
  @scala.inline
  def apply(dataHex: String): OpReturnOutput = {
    val __obj = js.Dynamic.literal(dataHex = dataHex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("opreturn")
    __obj.asInstanceOf[OpReturnOutput]
  }
  
  @scala.inline
  implicit class OpReturnOutputMutableBuilder[Self <: OpReturnOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataHex(value: String): Self = StObject.set(x, "dataHex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: opreturn): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
