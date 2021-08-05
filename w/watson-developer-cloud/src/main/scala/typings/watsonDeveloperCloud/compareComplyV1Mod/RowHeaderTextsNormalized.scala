package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** If you provide customization input, the normalized version of the row header texts according to the customization; otherwise, the same value as `row_header_texts`. */
trait RowHeaderTextsNormalized extends StObject {
  
  /** The normalized version of a row header text. */
  var text_normalized: js.UndefOr[String] = js.undefined
}
object RowHeaderTextsNormalized {
  
  inline def apply(): RowHeaderTextsNormalized = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowHeaderTextsNormalized]
  }
  
  extension [Self <: RowHeaderTextsNormalized](x: Self) {
    
    inline def setText_normalized(value: String): Self = StObject.set(x, "text_normalized", value.asInstanceOf[js.Any])
    
    inline def setText_normalizedUndefined: Self = StObject.set(x, "text_normalized", js.undefined)
  }
}
