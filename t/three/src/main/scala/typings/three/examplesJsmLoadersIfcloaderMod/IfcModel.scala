package typings.three.examplesJsmLoadersIfcloaderMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IfcModel extends StObject {
  
  var items: GeometriesByMaterials
  
  var jsonData: NumberDictionary[JSONObject]
  
  var mesh: IfcMesh
  
  var modelID: Double
  
  var types: TypesMap
}
object IfcModel {
  
  inline def apply(
    items: GeometriesByMaterials,
    jsonData: NumberDictionary[JSONObject],
    mesh: IfcMesh,
    modelID: Double,
    types: TypesMap
  ): IfcModel = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], jsonData = jsonData.asInstanceOf[js.Any], mesh = mesh.asInstanceOf[js.Any], modelID = modelID.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[IfcModel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IfcModel] (val x: Self) extends AnyVal {
    
    inline def setItems(value: GeometriesByMaterials): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setJsonData(value: NumberDictionary[JSONObject]): Self = StObject.set(x, "jsonData", value.asInstanceOf[js.Any])
    
    inline def setMesh(value: IfcMesh): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
    
    inline def setModelID(value: Double): Self = StObject.set(x, "modelID", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: TypesMap): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
  }
}
