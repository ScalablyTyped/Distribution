package typings.vegaTypings.anon

import typings.vegaTypings.typesSpecDataMod.FormatTopoJSON
import typings.vegaTypings.vegaTypingsStrings.topojson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  feature :string} & {  type :'topojson',   property :string | undefined} */
trait featurestringtypetopojson
  extends StObject
     with FormatTopoJSON {
  
  var feature: String
  
  var property: js.UndefOr[String] = js.undefined
  
  var `type`: topojson
}
object featurestringtypetopojson {
  
  inline def apply(feature: String): featurestringtypetopojson = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("topojson")
    __obj.asInstanceOf[featurestringtypetopojson]
  }
  
  extension [Self <: featurestringtypetopojson](x: Self) {
    
    inline def setFeature(value: String): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setType(value: topojson): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
