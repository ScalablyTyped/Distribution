package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** If you provide customization input, the normalized version of the column header texts according to the customization; otherwise, the same value as `column_header_texts`. */
@js.native
trait ColumnHeaderTextsNormalized extends StObject {
  
  /** The normalized version of a column header text. */
  var text_normalized: js.UndefOr[String] = js.native
}
object ColumnHeaderTextsNormalized {
  
  @scala.inline
  def apply(): ColumnHeaderTextsNormalized = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnHeaderTextsNormalized]
  }
  
  @scala.inline
  implicit class ColumnHeaderTextsNormalizedMutableBuilder[Self <: ColumnHeaderTextsNormalized] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText_normalized(value: String): Self = StObject.set(x, "text_normalized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText_normalizedUndefined: Self = StObject.set(x, "text_normalized", js.undefined)
  }
}
