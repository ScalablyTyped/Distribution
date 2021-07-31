package typings.vegaLite.anon

import typings.vegaLite.utilMod.Dict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Feature extends StObject {
  
  var feature: js.UndefOr[String] = js.undefined
  
  var mesh: js.UndefOr[String] = js.undefined
  
  var parse: js.UndefOr[String | Dict[js.Any]] = js.undefined
  
  var property: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object Feature {
  
  @scala.inline
  def apply(): Feature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Feature]
  }
  
  @scala.inline
  implicit class FeatureMutableBuilder[Self <: Feature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeature(value: String): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureUndefined: Self = StObject.set(x, "feature", js.undefined)
    
    @scala.inline
    def setMesh(value: String): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshUndefined: Self = StObject.set(x, "mesh", js.undefined)
    
    @scala.inline
    def setParse(value: String | Dict[js.Any]): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
    
    @scala.inline
    def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
