package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** If you provide customization input, the normalized version of the column header texts according to the customization; otherwise, the same value as `column_header_texts`. */
trait ColumnHeaderTextsNormalized extends StObject {
  
  /** The normalized version of a column header text. */
  var text_normalized: js.UndefOr[String] = js.undefined
}
object ColumnHeaderTextsNormalized {
  
  inline def apply(): ColumnHeaderTextsNormalized = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnHeaderTextsNormalized]
  }
  
  extension [Self <: ColumnHeaderTextsNormalized](x: Self) {
    
    inline def setText_normalized(value: String): Self = StObject.set(x, "text_normalized", value.asInstanceOf[js.Any])
    
    inline def setText_normalizedUndefined: Self = StObject.set(x, "text_normalized", js.undefined)
  }
}
