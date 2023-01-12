package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmbientLightColor extends StObject {
  
  var ambientLightColor: IUniform[Any]
  
  var directionalLightShadows: Value
  
  var directionalLights: Properties
  
  var directionalShadowMap: IUniform[Any]
  
  var directionalShadowMatrix: IUniform[Any]
  
  var hemisphereLights: PropertiesDirection
  
  var pointLightShadows: Value
  
  var pointLights: PropertiesDecay
  
  var pointShadowMap: IUniform[Any]
  
  var pointShadowMatrix: IUniform[Any]
  
  var rectAreaLights: PropertiesHeight
  
  var spotLightShadows: Value
  
  var spotLights: PropertiesValue
  
  var spotShadowMap: IUniform[Any]
  
  var spotShadowMatrix: IUniform[Any]
}
object AmbientLightColor {
  
  inline def apply(
    ambientLightColor: IUniform[Any],
    directionalLightShadows: Value,
    directionalLights: Properties,
    directionalShadowMap: IUniform[Any],
    directionalShadowMatrix: IUniform[Any],
    hemisphereLights: PropertiesDirection,
    pointLightShadows: Value,
    pointLights: PropertiesDecay,
    pointShadowMap: IUniform[Any],
    pointShadowMatrix: IUniform[Any],
    rectAreaLights: PropertiesHeight,
    spotLightShadows: Value,
    spotLights: PropertiesValue,
    spotShadowMap: IUniform[Any],
    spotShadowMatrix: IUniform[Any]
  ): AmbientLightColor = {
    val __obj = js.Dynamic.literal(ambientLightColor = ambientLightColor.asInstanceOf[js.Any], directionalLightShadows = directionalLightShadows.asInstanceOf[js.Any], directionalLights = directionalLights.asInstanceOf[js.Any], directionalShadowMap = directionalShadowMap.asInstanceOf[js.Any], directionalShadowMatrix = directionalShadowMatrix.asInstanceOf[js.Any], hemisphereLights = hemisphereLights.asInstanceOf[js.Any], pointLightShadows = pointLightShadows.asInstanceOf[js.Any], pointLights = pointLights.asInstanceOf[js.Any], pointShadowMap = pointShadowMap.asInstanceOf[js.Any], pointShadowMatrix = pointShadowMatrix.asInstanceOf[js.Any], rectAreaLights = rectAreaLights.asInstanceOf[js.Any], spotLightShadows = spotLightShadows.asInstanceOf[js.Any], spotLights = spotLights.asInstanceOf[js.Any], spotShadowMap = spotShadowMap.asInstanceOf[js.Any], spotShadowMatrix = spotShadowMatrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmbientLightColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AmbientLightColor] (val x: Self) extends AnyVal {
    
    inline def setAmbientLightColor(value: IUniform[Any]): Self = StObject.set(x, "ambientLightColor", value.asInstanceOf[js.Any])
    
    inline def setDirectionalLightShadows(value: Value): Self = StObject.set(x, "directionalLightShadows", value.asInstanceOf[js.Any])
    
    inline def setDirectionalLights(value: Properties): Self = StObject.set(x, "directionalLights", value.asInstanceOf[js.Any])
    
    inline def setDirectionalShadowMap(value: IUniform[Any]): Self = StObject.set(x, "directionalShadowMap", value.asInstanceOf[js.Any])
    
    inline def setDirectionalShadowMatrix(value: IUniform[Any]): Self = StObject.set(x, "directionalShadowMatrix", value.asInstanceOf[js.Any])
    
    inline def setHemisphereLights(value: PropertiesDirection): Self = StObject.set(x, "hemisphereLights", value.asInstanceOf[js.Any])
    
    inline def setPointLightShadows(value: Value): Self = StObject.set(x, "pointLightShadows", value.asInstanceOf[js.Any])
    
    inline def setPointLights(value: PropertiesDecay): Self = StObject.set(x, "pointLights", value.asInstanceOf[js.Any])
    
    inline def setPointShadowMap(value: IUniform[Any]): Self = StObject.set(x, "pointShadowMap", value.asInstanceOf[js.Any])
    
    inline def setPointShadowMatrix(value: IUniform[Any]): Self = StObject.set(x, "pointShadowMatrix", value.asInstanceOf[js.Any])
    
    inline def setRectAreaLights(value: PropertiesHeight): Self = StObject.set(x, "rectAreaLights", value.asInstanceOf[js.Any])
    
    inline def setSpotLightShadows(value: Value): Self = StObject.set(x, "spotLightShadows", value.asInstanceOf[js.Any])
    
    inline def setSpotLights(value: PropertiesValue): Self = StObject.set(x, "spotLights", value.asInstanceOf[js.Any])
    
    inline def setSpotShadowMap(value: IUniform[Any]): Self = StObject.set(x, "spotShadowMap", value.asInstanceOf[js.Any])
    
    inline def setSpotShadowMatrix(value: IUniform[Any]): Self = StObject.set(x, "spotShadowMatrix", value.asInstanceOf[js.Any])
  }
}
