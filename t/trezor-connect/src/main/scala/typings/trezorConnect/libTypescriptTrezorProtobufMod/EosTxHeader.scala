package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EosTxHeader extends StObject {
  
  var delay_sec: Double
  
  var expiration: Double
  
  var max_cpu_usage_ms: Double
  
  var max_net_usage_words: Double
  
  var ref_block_num: Double
  
  var ref_block_prefix: Double
}
object EosTxHeader {
  
  inline def apply(
    delay_sec: Double,
    expiration: Double,
    max_cpu_usage_ms: Double,
    max_net_usage_words: Double,
    ref_block_num: Double,
    ref_block_prefix: Double
  ): EosTxHeader = {
    val __obj = js.Dynamic.literal(delay_sec = delay_sec.asInstanceOf[js.Any], expiration = expiration.asInstanceOf[js.Any], max_cpu_usage_ms = max_cpu_usage_ms.asInstanceOf[js.Any], max_net_usage_words = max_net_usage_words.asInstanceOf[js.Any], ref_block_num = ref_block_num.asInstanceOf[js.Any], ref_block_prefix = ref_block_prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[EosTxHeader]
  }
  
  extension [Self <: EosTxHeader](x: Self) {
    
    inline def setDelay_sec(value: Double): Self = StObject.set(x, "delay_sec", value.asInstanceOf[js.Any])
    
    inline def setExpiration(value: Double): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    inline def setMax_cpu_usage_ms(value: Double): Self = StObject.set(x, "max_cpu_usage_ms", value.asInstanceOf[js.Any])
    
    inline def setMax_net_usage_words(value: Double): Self = StObject.set(x, "max_net_usage_words", value.asInstanceOf[js.Any])
    
    inline def setRef_block_num(value: Double): Self = StObject.set(x, "ref_block_num", value.asInstanceOf[js.Any])
    
    inline def setRef_block_prefix(value: Double): Self = StObject.set(x, "ref_block_prefix", value.asInstanceOf[js.Any])
  }
}
