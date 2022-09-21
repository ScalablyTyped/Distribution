package typings.swaggerJsdoc.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaType
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var encoding: js.UndefOr[StringDictionary[Encoding]] = js.undefined
  
  var example: js.UndefOr[Any] = js.undefined
  
  var examples: js.UndefOr[StringDictionary[Example | Reference]] = js.undefined
  
  var schema: js.UndefOr[Schema | Reference] = js.undefined
}
object MediaType {
  
  inline def apply(): MediaType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaType]
  }
  
  extension [Self <: MediaType](x: Self) {
    
    inline def setEncoding(value: StringDictionary[Encoding]): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setExample(value: Any): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
    
    inline def setExampleUndefined: Self = StObject.set(x, "example", js.undefined)
    
    inline def setExamples(value: StringDictionary[Example | Reference]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
    
    inline def setExamplesUndefined: Self = StObject.set(x, "examples", js.undefined)
    
    inline def setSchema(value: Schema | Reference): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
