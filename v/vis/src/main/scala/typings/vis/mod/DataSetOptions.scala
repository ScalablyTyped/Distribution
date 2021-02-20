package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSetOptions extends DataSetQueueOptions {
  
  /**
    * The name of the field containing the id of the items.
    * When data is fetched from a server which uses some specific field to identify items,
    * this field name can be specified in the DataSet using the option fieldId.
    * For example CouchDB uses the field "_id" to identify documents.
    */
  var fieldId: js.UndefOr[String] = js.native
  
  /**
    * An object containing field names as key, and data types as value.
    * By default, the type of the properties of items are left unchanged.
    * Item properties can be normalized by specifying a field type.
    * This is useful for example to automatically convert stringified dates coming
    * from a server into JavaScript Date objects.
    * The available data types are listed in section Data Types.
    */
  var `type`: js.UndefOr[js.Any] = js.native
}
object DataSetOptions {
  
  @scala.inline
  def apply(): DataSetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSetOptions]
  }
  
  @scala.inline
  implicit class DataSetOptionsMutableBuilder[Self <: DataSetOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldId(value: String): Self = StObject.set(x, "fieldId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldIdUndefined: Self = StObject.set(x, "fieldId", js.undefined)
    
    @scala.inline
    def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
