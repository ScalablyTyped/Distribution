package typings.three.anon

import typings.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmbientLightColor extends StObject {
  
  var ambientLightColor: IUniform[js.Array[Any]]
  
  var directionalLightShadows: Value
  
  var directionalLights: Properties
  
  var directionalShadowMap: IUniform[js.Array[Any]]
  
  var directionalShadowMatrix: IUniform[js.Array[Any]]
  
  var hemisphereLights: PropertiesDirection
  
  var lightProbe: IUniform[js.Array[Any]]
  
  var ltc_1: IUniform[Any]
  
  var ltc_2: IUniform[Any]
  
  var pointLightShadows: PropertiesShadowCameraFar
  
  var pointLights: PropertiesDecay
  
  var pointShadowMap: IUniform[js.Array[Any]]
  
  var pointShadowMatrix: IUniform[js.Array[Any]]
  
  var rectAreaLights: PropertiesHeight
  
  var spotLightMap: IUniform[js.Array[Any]]
  
  var spotLightMatrix: IUniform[js.Array[Any]]
  
  var spotLightShadows: Value
  
  var spotLights: PropertiesValue
  
  var spotShadowMap: IUniform[js.Array[Any]]
}
object AmbientLightColor {
  
  inline def apply(
    ambientLightColor: IUniform[js.Array[Any]],
    directionalLightShadows: Value,
    directionalLights: Properties,
    directionalShadowMap: IUniform[js.Array[Any]],
    directionalShadowMatrix: IUniform[js.Array[Any]],
    hemisphereLights: PropertiesDirection,
    lightProbe: IUniform[js.Array[Any]],
    ltc_1: IUniform[Any],
    ltc_2: IUniform[Any],
    pointLightShadows: PropertiesShadowCameraFar,
    pointLights: PropertiesDecay,
    pointShadowMap: IUniform[js.Array[Any]],
    pointShadowMatrix: IUniform[js.Array[Any]],
    rectAreaLights: PropertiesHeight,
    spotLightMap: IUniform[js.Array[Any]],
    spotLightMatrix: IUniform[js.Array[Any]],
    spotLightShadows: Value,
    spotLights: PropertiesValue,
    spotShadowMap: IUniform[js.Array[Any]]
  ): AmbientLightColor = {
    val __obj = js.Dynamic.literal(ambientLightColor = ambientLightColor.asInstanceOf[js.Any], directionalLightShadows = directionalLightShadows.asInstanceOf[js.Any], directionalLights = directionalLights.asInstanceOf[js.Any], directionalShadowMap = directionalShadowMap.asInstanceOf[js.Any], directionalShadowMatrix = directionalShadowMatrix.asInstanceOf[js.Any], hemisphereLights = hemisphereLights.asInstanceOf[js.Any], lightProbe = lightProbe.asInstanceOf[js.Any], ltc_1 = ltc_1.asInstanceOf[js.Any], ltc_2 = ltc_2.asInstanceOf[js.Any], pointLightShadows = pointLightShadows.asInstanceOf[js.Any], pointLights = pointLights.asInstanceOf[js.Any], pointShadowMap = pointShadowMap.asInstanceOf[js.Any], pointShadowMatrix = pointShadowMatrix.asInstanceOf[js.Any], rectAreaLights = rectAreaLights.asInstanceOf[js.Any], spotLightMap = spotLightMap.asInstanceOf[js.Any], spotLightMatrix = spotLightMatrix.asInstanceOf[js.Any], spotLightShadows = spotLightShadows.asInstanceOf[js.Any], spotLights = spotLights.asInstanceOf[js.Any], spotShadowMap = spotShadowMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmbientLightColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AmbientLightColor] (val x: Self) extends AnyVal {
    
    inline def setAmbientLightColor(value: IUniform[js.Array[Any]]): Self = StObject.set(x, "ambientLightColor", value.asInstanceOf[js.Any])
    
    inline def setDirectionalLightShadows(value: Value): Self = StObject.set(x, "directionalLightShadows", value.asInstanceOf[js.Any])
    
    inline def setDirectionalLights(value: Properties): Self = StObject.set(x, "directionalLights", value.asInstanceOf[js.Any])
    
    inline def setDirectionalShadowMap(value: IUniform[js.Array[Any]]): Self = StObject.set(x, "directionalShadowMap", value.asInstanceOf[js.Any])
    
    inline def setDirectionalShadowMatrix(value: IUniform[js.Array[Any]]): Self = StObject.set(x, "directionalShadowMatrix", value.asInstanceOf[js.Any])
    
    inline def setHemisphereLights(value: PropertiesDirection): Self = StObject.set(x, "hemisphereLights", value.asInstanceOf[js.Any])
    
    inline def setLightProbe(value: IUniform[js.Array[Any]]): Self = StObject.set(x, "lightProbe", value.asInstanceOf[js.Any])
    
    inline def setLtc_1(value: IUniform[Any]): Self = StObject.set(x, "ltc_1", value.asInstanceOf[js.Any])
    
    inline def setLtc_2(value: IUniform[Any]): Self = StObject.set(x, "ltc_2", value.asInstanceOf[js.Any])
    
    inline def setPointLightShadows(value: PropertiesShadowCameraFar): Self = StObject.set(x, "pointLightShadows", value.asInstanceOf[js.Any])
    
    inline def setPointLights(value: PropertiesDecay): Self = StObject.set(x, "pointLights", value.asInstanceOf[js.Any])
    
    inline def setPointShadowMap(value: IUniform[js.Array[Any]]): Self = StObject.set(x, "pointShadowMap", value.asInstanceOf[js.Any])
    
    inline def setPointShadowMatrix(value: IUniform[js.Array[Any]]): Self = StObject.set(x, "pointShadowMatrix", value.asInstanceOf[js.Any])
    
    inline def setRectAreaLights(value: PropertiesHeight): Self = StObject.set(x, "rectAreaLights", value.asInstanceOf[js.Any])
    
    inline def setSpotLightMap(value: IUniform[js.Array[Any]]): Self = StObject.set(x, "spotLightMap", value.asInstanceOf[js.Any])
    
    inline def setSpotLightMatrix(value: IUniform[js.Array[Any]]): Self = StObject.set(x, "spotLightMatrix", value.asInstanceOf[js.Any])
    
    inline def setSpotLightShadows(value: Value): Self = StObject.set(x, "spotLightShadows", value.asInstanceOf[js.Any])
    
    inline def setSpotLights(value: PropertiesValue): Self = StObject.set(x, "spotLights", value.asInstanceOf[js.Any])
    
    inline def setSpotShadowMap(value: IUniform[js.Array[Any]]): Self = StObject.set(x, "spotShadowMap", value.asInstanceOf[js.Any])
  }
}
