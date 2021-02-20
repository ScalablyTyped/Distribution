package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An array of values, each being the `text` value of a column header that is applicable to the current cell. */
@js.native
trait ColumnHeaderTexts extends StObject {
  
  /** The `text` value of a column header. */
  var text: js.UndefOr[String] = js.native
}
object ColumnHeaderTexts {
  
  @scala.inline
  def apply(): ColumnHeaderTexts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnHeaderTexts]
  }
  
  @scala.inline
  implicit class ColumnHeaderTextsMutableBuilder[Self <: ColumnHeaderTexts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
