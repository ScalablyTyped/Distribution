package typings.trezorConnect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ledger extends StObject {
  
  // ripple-lib
  var ledger: Double
  
  var seq: Double
}
object Ledger {
  
  inline def apply(ledger: Double, seq: Double): Ledger = {
    val __obj = js.Dynamic.literal(ledger = ledger.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ledger]
  }
  
  extension [Self <: Ledger](x: Self) {
    
    inline def setLedger(value: Double): Self = StObject.set(x, "ledger", value.asInstanceOf[js.Any])
    
    inline def setSeq(value: Double): Self = StObject.set(x, "seq", value.asInstanceOf[js.Any])
  }
}
