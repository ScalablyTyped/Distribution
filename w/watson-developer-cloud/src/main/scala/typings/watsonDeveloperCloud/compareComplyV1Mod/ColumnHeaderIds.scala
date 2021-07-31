package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An array of values, each being the `id` value of a column header that is applicable to the current cell. */
trait ColumnHeaderIds extends StObject {
  
  /** The `id` value of a column header. */
  var id: js.UndefOr[String] = js.undefined
}
object ColumnHeaderIds {
  
  @scala.inline
  def apply(): ColumnHeaderIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnHeaderIds]
  }
  
  @scala.inline
  implicit class ColumnHeaderIdsMutableBuilder[Self <: ColumnHeaderIds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
