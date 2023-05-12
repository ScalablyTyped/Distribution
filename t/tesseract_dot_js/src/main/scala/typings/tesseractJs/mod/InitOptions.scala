package typings.tesseractJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitOptions extends StObject {
  
  var load_bigram_dawg: String
  
  var load_freq_dawg: String
  
  var load_number_dawg: String
  
  var load_punc_dawg: String
  
  var load_system_dawg: String
  
  var load_unambig_dawg: String
}
object InitOptions {
  
  inline def apply(
    load_bigram_dawg: String,
    load_freq_dawg: String,
    load_number_dawg: String,
    load_punc_dawg: String,
    load_system_dawg: String,
    load_unambig_dawg: String
  ): InitOptions = {
    val __obj = js.Dynamic.literal(load_bigram_dawg = load_bigram_dawg.asInstanceOf[js.Any], load_freq_dawg = load_freq_dawg.asInstanceOf[js.Any], load_number_dawg = load_number_dawg.asInstanceOf[js.Any], load_punc_dawg = load_punc_dawg.asInstanceOf[js.Any], load_system_dawg = load_system_dawg.asInstanceOf[js.Any], load_unambig_dawg = load_unambig_dawg.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InitOptions] (val x: Self) extends AnyVal {
    
    inline def setLoad_bigram_dawg(value: String): Self = StObject.set(x, "load_bigram_dawg", value.asInstanceOf[js.Any])
    
    inline def setLoad_freq_dawg(value: String): Self = StObject.set(x, "load_freq_dawg", value.asInstanceOf[js.Any])
    
    inline def setLoad_number_dawg(value: String): Self = StObject.set(x, "load_number_dawg", value.asInstanceOf[js.Any])
    
    inline def setLoad_punc_dawg(value: String): Self = StObject.set(x, "load_punc_dawg", value.asInstanceOf[js.Any])
    
    inline def setLoad_system_dawg(value: String): Self = StObject.set(x, "load_system_dawg", value.asInstanceOf[js.Any])
    
    inline def setLoad_unambig_dawg(value: String): Self = StObject.set(x, "load_unambig_dawg", value.asInstanceOf[js.Any])
  }
}
