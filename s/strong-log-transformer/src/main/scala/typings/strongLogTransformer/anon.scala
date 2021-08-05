package typings.strongLogTransformer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<strong-log-transformer.strong-log-transformer.Options> */
  trait PartialOptions extends StObject {
    
    var format: js.UndefOr[String] = js.undefined
    
    var mergeMultiline: js.UndefOr[Boolean] = js.undefined
    
    var tag: js.UndefOr[String] = js.undefined
    
    var timeStamp: js.UndefOr[Boolean] = js.undefined
  }
  object PartialOptions {
    
    inline def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    extension [Self <: PartialOptions](x: Self) {
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setMergeMultiline(value: Boolean): Self = StObject.set(x, "mergeMultiline", value.asInstanceOf[js.Any])
      
      inline def setMergeMultilineUndefined: Self = StObject.set(x, "mergeMultiline", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setTimeStamp(value: Boolean): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      inline def setTimeStampUndefined: Self = StObject.set(x, "timeStamp", js.undefined)
    }
  }
}
