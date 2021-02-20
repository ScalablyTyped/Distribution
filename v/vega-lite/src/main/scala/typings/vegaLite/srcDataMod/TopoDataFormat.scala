package typings.vegaLite.srcDataMod

import typings.vegaLite.vegaLiteStrings.topojson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopoDataFormat
  extends DataFormatBase
     with DataFormat {
  
  /**
    * The name of the TopoJSON object set to convert to a GeoJSON feature collection.
    * For example, in a map of the world, there may be an object set named `"countries"`.
    * Using the feature property, we can extract this set and generate a GeoJSON feature object for each country.
    */
  var feature: js.UndefOr[String] = js.native
  
  /**
    * The name of the TopoJSON object set to convert to mesh.
    * Similar to the `feature` option, `mesh` extracts a named TopoJSON object set.
    *  Unlike the `feature` option, the corresponding geo data is returned as a single, unified mesh instance, not as individual GeoJSON features.
    * Extracting a mesh is useful for more efficiently drawing borders or other geographic elements that you do not need to associate with specific regions such as individual countries, states or counties.
    */
  var mesh: js.UndefOr[String] = js.native
  
  @JSName("type")
  var type_TopoDataFormat: js.UndefOr[topojson] = js.native
}
object TopoDataFormat {
  
  @scala.inline
  def apply(): TopoDataFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopoDataFormat]
  }
  
  @scala.inline
  implicit class TopoDataFormatMutableBuilder[Self <: TopoDataFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeature(value: String): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureUndefined: Self = StObject.set(x, "feature", js.undefined)
    
    @scala.inline
    def setMesh(value: String): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshUndefined: Self = StObject.set(x, "mesh", js.undefined)
    
    @scala.inline
    def setType(value: topojson): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
