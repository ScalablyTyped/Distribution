package typings.tedious.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnType extends StObject {
  
  /**
    * The column's type, such as VarChar, Int or Binary.
    */
  var name: String
}
object ColumnType {
  
  inline def apply(name: String): ColumnType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnType]
  }
  
  extension [Self <: ColumnType](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
