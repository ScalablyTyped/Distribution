package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Document conversion settings. */
trait Conversions extends StObject {
  
  /** A list of HTML conversion settings. */
  var html: js.UndefOr[HtmlSettings] = js.undefined
  
  /** Defines operations that can be used to transform the final output JSON into a normalized form. Operations are executed in the order that they appear in the array. */
  var json_normalizations: js.UndefOr[js.Array[NormalizationOperation]] = js.undefined
  
  /** A list of PDF conversion settings. */
  var pdf: js.UndefOr[PdfSettings] = js.undefined
  
  /** A list of Document Segmentation settings. */
  var segment: js.UndefOr[SegmentSettings] = js.undefined
  
  /** A list of Word conversion settings. */
  var word: js.UndefOr[WordSettings] = js.undefined
}
object Conversions {
  
  inline def apply(): Conversions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Conversions]
  }
  
  extension [Self <: Conversions](x: Self) {
    
    inline def setHtml(value: HtmlSettings): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    inline def setJson_normalizations(value: js.Array[NormalizationOperation]): Self = StObject.set(x, "json_normalizations", value.asInstanceOf[js.Any])
    
    inline def setJson_normalizationsUndefined: Self = StObject.set(x, "json_normalizations", js.undefined)
    
    inline def setJson_normalizationsVarargs(value: NormalizationOperation*): Self = StObject.set(x, "json_normalizations", js.Array(value*))
    
    inline def setPdf(value: PdfSettings): Self = StObject.set(x, "pdf", value.asInstanceOf[js.Any])
    
    inline def setPdfUndefined: Self = StObject.set(x, "pdf", js.undefined)
    
    inline def setSegment(value: SegmentSettings): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    inline def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
    
    inline def setWord(value: WordSettings): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
    
    inline def setWordUndefined: Self = StObject.set(x, "word", js.undefined)
  }
}
