package typings.stylableJest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CanInstrument extends StObject {
    
    var canInstrument: Boolean
    
    def getCacheKey(fileData: String, filename: String, configString: String): String
    def getCacheKey(fileData: String, filename: String, configString: String, options: Instrument): String
    @JSName("getCacheKey")
    var getCacheKey_Original: js.Function4[
        /* fileData */ String, 
        /* filename */ String, 
        /* configString */ String, 
        /* options */ js.UndefOr[Instrument], 
        String
      ]
    
    def process(source: String, path: String): Code
  }
  object CanInstrument {
    
    inline def apply(
      canInstrument: Boolean,
      getCacheKey: (/* fileData */ String, /* filename */ String, /* configString */ String, /* options */ js.UndefOr[Instrument]) => String,
      process: (String, String) => Code
    ): CanInstrument = {
      val __obj = js.Dynamic.literal(canInstrument = canInstrument.asInstanceOf[js.Any], getCacheKey = js.Any.fromFunction4(getCacheKey), process = js.Any.fromFunction2(process))
      __obj.asInstanceOf[CanInstrument]
    }
    
    extension [Self <: CanInstrument](x: Self) {
      
      inline def setCanInstrument(value: Boolean): Self = StObject.set(x, "canInstrument", value.asInstanceOf[js.Any])
      
      inline def setGetCacheKey(
        value: (/* fileData */ String, /* filename */ String, /* configString */ String, /* options */ js.UndefOr[Instrument]) => String
      ): Self = StObject.set(x, "getCacheKey", js.Any.fromFunction4(value))
      
      inline def setProcess(value: (String, String) => Code): Self = StObject.set(x, "process", js.Any.fromFunction2(value))
    }
  }
  
  trait Code extends StObject {
    
    var code: String
  }
  object Code {
    
    inline def apply(code: String): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    extension [Self <: Code](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetCacheKey extends StObject {
    
    var canInstrument: Boolean = js.native
    
    def getCacheKey(fileData: String, filename: String, configString: String): String = js.native
    def getCacheKey(fileData: String, filename: String, configString: String, options: Instrument): String = js.native
    
    def process(source: String, path: String): Code = js.native
  }
  
  trait Instrument extends StObject {
    
    var instrument: Boolean
  }
  object Instrument {
    
    inline def apply(instrument: Boolean): Instrument = {
      val __obj = js.Dynamic.literal(instrument = instrument.asInstanceOf[js.Any])
      __obj.asInstanceOf[Instrument]
    }
    
    extension [Self <: Instrument](x: Self) {
      
      inline def setInstrument(value: Boolean): Self = StObject.set(x, "instrument", value.asInstanceOf[js.Any])
    }
  }
}
