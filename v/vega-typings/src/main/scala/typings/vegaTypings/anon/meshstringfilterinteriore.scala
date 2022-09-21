package typings.vegaTypings.anon

import typings.vegaTypings.dataMod.FormatTopoJSON
import typings.vegaTypings.vegaTypingsStrings.exterior
import typings.vegaTypings.vegaTypingsStrings.interior
import typings.vegaTypings.vegaTypingsStrings.topojson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  mesh :string,   filter :'interior' | 'exterior' | null} & {  type :'topojson',   property :string | undefined} */
trait meshstringfilterinteriore
  extends StObject
     with FormatTopoJSON {
  
  var filter: interior | exterior | Null
  
  var mesh: String
  
  var property: js.UndefOr[String] = js.undefined
  
  var `type`: topojson
}
object meshstringfilterinteriore {
  
  inline def apply(mesh: String): meshstringfilterinteriore = {
    val __obj = js.Dynamic.literal(mesh = mesh.asInstanceOf[js.Any], filter = null)
    __obj.updateDynamic("type")("topojson")
    __obj.asInstanceOf[meshstringfilterinteriore]
  }
  
  extension [Self <: meshstringfilterinteriore](x: Self) {
    
    inline def setFilter(value: interior | exterior): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterNull: Self = StObject.set(x, "filter", null)
    
    inline def setMesh(value: String): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setType(value: topojson): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
