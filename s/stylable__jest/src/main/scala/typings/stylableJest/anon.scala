package typings.stylableJest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CanInstrument extends StObject {
    
    var canInstrument: Boolean = js.native
    
    def getCacheKey(fileData: String, filename: String, configString: String): String = js.native
    def getCacheKey(fileData: String, filename: String, configString: String, options: Instrument): String = js.native
    
    def process(source: String, path: String): Code = js.native
  }
  
  trait Code extends StObject {
    
    var code: String
  }
  object Code {
    
    inline def apply(code: String): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetCacheKey extends StObject {
    
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
  object GetCacheKey {
    
    inline def apply(
      canInstrument: Boolean,
      getCacheKey: (/* fileData */ String, /* filename */ String, /* configString */ String, /* options */ js.UndefOr[Instrument]) => String,
      process: (String, String) => Code
    ): GetCacheKey = {
      val __obj = js.Dynamic.literal(canInstrument = canInstrument.asInstanceOf[js.Any], getCacheKey = js.Any.fromFunction4(getCacheKey), process = js.Any.fromFunction2(process))
      __obj.asInstanceOf[GetCacheKey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetCacheKey] (val x: Self) extends AnyVal {
      
      inline def setCanInstrument(value: Boolean): Self = StObject.set(x, "canInstrument", value.asInstanceOf[js.Any])
      
      inline def setGetCacheKey(
        value: (/* fileData */ String, /* filename */ String, /* configString */ String, /* options */ js.UndefOr[Instrument]) => String
      ): Self = StObject.set(x, "getCacheKey", js.Any.fromFunction4(value))
      
      inline def setProcess(value: (String, String) => Code): Self = StObject.set(x, "process", js.Any.fromFunction2(value))
    }
  }
  
  trait Instrument extends StObject {
    
    var instrument: Boolean
  }
  object Instrument {
    
    inline def apply(instrument: Boolean): Instrument = {
      val __obj = js.Dynamic.literal(instrument = instrument.asInstanceOf[js.Any])
      __obj.asInstanceOf[Instrument]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Instrument] (val x: Self) extends AnyVal {
      
      inline def setInstrument(value: Boolean): Self = StObject.set(x, "instrument", value.asInstanceOf[js.Any])
    }
  }
}
