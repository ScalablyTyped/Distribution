package typings.vegaTypings.anon

import typings.vegaTypings.dataMod.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  $ingest :unknown} & {  $format :vega-typings.vega-typings/types/spec.Format | undefined} */
trait ingestunknownformatFormat extends StObject {
  
  /**
    * format of data
    */
  @JSName("$format")
  var $format: js.UndefOr[Format] = js.undefined
  
  /**
    * data as string for CSV or TSV, or object, for JSON
    */
  @JSName("$ingest")
  var $ingest: Any
}
object ingestunknownformatFormat {
  
  inline def apply($ingest: Any): ingestunknownformatFormat = {
    val __obj = js.Dynamic.literal($ingest = $ingest.asInstanceOf[js.Any])
    __obj.asInstanceOf[ingestunknownformatFormat]
  }
  
  extension [Self <: ingestunknownformatFormat](x: Self) {
    
    inline def set$format(value: Format): Self = StObject.set(x, "$format", value.asInstanceOf[js.Any])
    
    inline def set$formatUndefined: Self = StObject.set(x, "$format", js.undefined)
    
    inline def set$ingest(value: Any): Self = StObject.set(x, "$ingest", value.asInstanceOf[js.Any])
  }
}
