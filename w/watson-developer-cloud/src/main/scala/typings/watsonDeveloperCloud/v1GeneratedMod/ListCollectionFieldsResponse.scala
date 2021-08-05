package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The list of fetched fields. The fields are returned using a fully qualified name format, however, the format differs slightly from that used by the query operations. * Fields which contain nested JSON objects are assigned a type of "nested". * Fields which belong to a nested object are prefixed with `.properties` (for example, `warnings.properties.severity` means that the `warnings` object has a property called `severity`). * Fields returned from the News collection are prefixed with `v{N}-fullnews-t3-{YEAR}.mappings` (for example, `v5-fullnews-t3-2016.mappings.text.properties.author`). */
trait ListCollectionFieldsResponse extends StObject {
  
  /** An array containing information about each field in the collections. */
  var fields: js.UndefOr[js.Array[Field]] = js.undefined
}
object ListCollectionFieldsResponse {
  
  inline def apply(): ListCollectionFieldsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCollectionFieldsResponse]
  }
  
  extension [Self <: ListCollectionFieldsResponse](x: Self) {
    
    inline def setFields(value: js.Array[Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value :_*))
  }
}
