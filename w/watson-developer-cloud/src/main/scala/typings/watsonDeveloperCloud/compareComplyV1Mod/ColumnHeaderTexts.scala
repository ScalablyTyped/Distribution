package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An array of values, each being the `text` value of a column header that is applicable to the current cell. */
trait ColumnHeaderTexts extends StObject {
  
  /** The `text` value of a column header. */
  var text: js.UndefOr[String] = js.undefined
}
object ColumnHeaderTexts {
  
  inline def apply(): ColumnHeaderTexts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnHeaderTexts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnHeaderTexts] (val x: Self) extends AnyVal {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
