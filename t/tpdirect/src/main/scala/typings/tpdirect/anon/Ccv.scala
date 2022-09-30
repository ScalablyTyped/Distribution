package typings.tpdirect.anon

import typings.tpdirect.tpdirectInts.`0`
import typings.tpdirect.tpdirectInts.`1`
import typings.tpdirect.tpdirectInts.`2`
import typings.tpdirect.tpdirectInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ccv extends StObject {
  
  /**
    * ```markdown
    * 0 is successful
    * 1 is empty
    * 2 is error
    * 3 is typing
    * ```
    */
  var ccv: `0` | `1` | `2` | `3`
  
  /**
    * ```markdown
    * 0 is successful
    * 1 is empty
    * 2 is error
    * 3 is typing
    * ```
    */
  var expiry: `0` | `1` | `2` | `3`
  
  /**
    * ```markdown
    * 0 is successful
    * 1 is empty
    * 2 is error
    * 3 is typing
    * ```
    */
  var number: `0` | `1` | `2` | `3`
}
object Ccv {
  
  inline def apply(ccv: `0` | `1` | `2` | `3`, expiry: `0` | `1` | `2` | `3`, number: `0` | `1` | `2` | `3`): Ccv = {
    val __obj = js.Dynamic.literal(ccv = ccv.asInstanceOf[js.Any], expiry = expiry.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ccv]
  }
  
  extension [Self <: Ccv](x: Self) {
    
    inline def setCcv(value: `0` | `1` | `2` | `3`): Self = StObject.set(x, "ccv", value.asInstanceOf[js.Any])
    
    inline def setExpiry(value: `0` | `1` | `2` | `3`): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: `0` | `1` | `2` | `3`): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
  }
}
