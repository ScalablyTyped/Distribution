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
  
  @scala.inline
  def apply(name: String): ColumnType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnType]
  }
  
  @scala.inline
  implicit class ColumnTypeMutableBuilder[Self <: ColumnType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
