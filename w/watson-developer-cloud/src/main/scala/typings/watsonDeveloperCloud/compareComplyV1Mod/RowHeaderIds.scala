package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An array of values, each being the `id` value of a row header that is applicable to this body cell. */
trait RowHeaderIds extends StObject {
  
  /** The `id` values of a row header. */
  var id: js.UndefOr[String] = js.undefined
}
object RowHeaderIds {
  
  inline def apply(): RowHeaderIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowHeaderIds]
  }
  
  extension [Self <: RowHeaderIds](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
