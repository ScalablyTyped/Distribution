package typings.vegaTypings.anon

import typings.vegaTypings.dataMod.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  $request :string} & {  $format :vega-typings.vega-typings/types/spec.Format | undefined} */
trait requeststringformatFormat extends StObject {
  
  /**
    * format of data
    */
  @JSName("$format")
  var $format: js.UndefOr[Format] = js.undefined
  
  /**
    * URL to data
    */
  @JSName("$request")
  var $request: String
}
object requeststringformatFormat {
  
  inline def apply($request: String): requeststringformatFormat = {
    val __obj = js.Dynamic.literal($request = $request.asInstanceOf[js.Any])
    __obj.asInstanceOf[requeststringformatFormat]
  }
  
  extension [Self <: requeststringformatFormat](x: Self) {
    
    inline def set$format(value: Format): Self = StObject.set(x, "$format", value.asInstanceOf[js.Any])
    
    inline def set$formatUndefined: Self = StObject.set(x, "$format", js.undefined)
    
    inline def set$request(value: String): Self = StObject.set(x, "$request", value.asInstanceOf[js.Any])
  }
}
