package typings.vegaLite.srcDataMod

import typings.vegaLite.vegaLiteStrings.topojson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopoDataFormat
  extends StObject
     with DataFormatBase
     with DataFormat {
  
  /**
    * The name of the TopoJSON object set to convert to a GeoJSON feature collection.
    * For example, in a map of the world, there may be an object set named `"countries"`.
    * Using the feature property, we can extract this set and generate a GeoJSON feature object for each country.
    */
  var feature: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the TopoJSON object set to convert to mesh.
    * Similar to the `feature` option, `mesh` extracts a named TopoJSON object set.
    *  Unlike the `feature` option, the corresponding geo data is returned as a single, unified mesh instance, not as individual GeoJSON features.
    * Extracting a mesh is useful for more efficiently drawing borders or other geographic elements that you do not need to associate with specific regions such as individual countries, states or counties.
    */
  var mesh: js.UndefOr[String] = js.undefined
  
  @JSName("type")
  var type_TopoDataFormat: js.UndefOr[topojson] = js.undefined
}
object TopoDataFormat {
  
  inline def apply(): TopoDataFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopoDataFormat]
  }
  
  extension [Self <: TopoDataFormat](x: Self) {
    
    inline def setFeature(value: String): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setFeatureUndefined: Self = StObject.set(x, "feature", js.undefined)
    
    inline def setMesh(value: String): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
    
    inline def setMeshUndefined: Self = StObject.set(x, "mesh", js.undefined)
    
    inline def setType(value: topojson): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
