package typings.vegaLite.srcDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamedData
  extends StObject
     with DataBase
     with DataSource {
  
  /**
    * Provide a placeholder name and bind data at runtime.
    */
  @JSName("name")
  var name_NamedData: String
}
object NamedData {
  
  @scala.inline
  def apply(name: String): NamedData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedData]
  }
  
  @scala.inline
  implicit class NamedDataMutableBuilder[Self <: NamedData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
