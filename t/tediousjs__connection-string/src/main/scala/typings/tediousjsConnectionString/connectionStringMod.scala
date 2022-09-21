package typings.tediousjsConnectionString

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectionStringMod {
  
  @JSImport("@tediousjs/connection-string/lib/parser/connection-string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(connectionString: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(connectionString.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def default(connectionString: String, parserConfig: ParserConfig): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(connectionString.asInstanceOf[js.Any], parserConfig.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  trait CollectionConfig extends StObject {
    
    var quotes: StringDictionary[String]
    
    var terminator: String
  }
  object CollectionConfig {
    
    inline def apply(quotes: StringDictionary[String], terminator: String): CollectionConfig = {
      val __obj = js.Dynamic.literal(quotes = quotes.asInstanceOf[js.Any], terminator = terminator.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollectionConfig]
    }
    
    extension [Self <: CollectionConfig](x: Self) {
      
      inline def setQuotes(value: StringDictionary[String]): Self = StObject.set(x, "quotes", value.asInstanceOf[js.Any])
      
      inline def setTerminator(value: String): Self = StObject.set(x, "terminator", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParserConfig extends StObject {
    
    var key: CollectionConfig
    
    var value: CollectionConfig
  }
  object ParserConfig {
    
    inline def apply(key: CollectionConfig, value: CollectionConfig): ParserConfig = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParserConfig]
    }
    
    extension [Self <: ParserConfig](x: Self) {
      
      inline def setKey(value: CollectionConfig): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: CollectionConfig): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
