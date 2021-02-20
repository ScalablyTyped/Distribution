package typings.vegaLite.srcDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataBase extends StObject {
  
  /**
    * An object that specifies the format for parsing the data.
    */
  var format: js.UndefOr[DataFormat] = js.native
  
  /**
    * Provide a placeholder name and bind data at runtime.
    */
  var name: js.UndefOr[String] = js.native
}
object DataBase {
  
  @scala.inline
  def apply(): DataBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataBase]
  }
  
  @scala.inline
  implicit class DataBaseMutableBuilder[Self <: DataBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: DataFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
