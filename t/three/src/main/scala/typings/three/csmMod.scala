package typings.three

import typings.std.Map
import typings.three.csmfrustumMod.default
import typings.three.eventDispatcherMod.Event
import typings.three.threeMod.Camera
import typings.three.threeMod.DirectionalLight
import typings.three.threeMod.Material
import typings.three.threeMod.Object3D
import typings.three.threeMod.Vector2
import typings.three.threeMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object csmMod {
  
  @js.native
  sealed trait CMSMode extends StObject
  @JSImport("three/examples/jsm/csm/CSM", "CMSMode")
  @js.native
  object CMSMode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CMSMode & String] = js.native
    
    @js.native
    sealed trait custom
      extends StObject
         with CMSMode
    /* "custom" */ val custom: typings.three.csmMod.CMSMode.custom & String = js.native
    
    @js.native
    sealed trait logarithmic
      extends StObject
         with CMSMode
    /* "logarithmic" */ val logarithmic: typings.three.csmMod.CMSMode.logarithmic & String = js.native
    
    @js.native
    sealed trait practical
      extends StObject
         with CMSMode
    /* "practical" */ val practical: typings.three.csmMod.CMSMode.practical & String = js.native
    
    @js.native
    sealed trait uniform
      extends StObject
         with CMSMode
    /* "uniform" */ val uniform: typings.three.csmMod.CMSMode.uniform & String = js.native
  }
  
  @JSImport("three/examples/jsm/csm/CSM", "CSM")
  @js.native
  open class CSM () extends StObject {
    def this(data: CMSParameters) = this()
    
    var breaks: js.Array[Double] = js.native
    
    var camera: Camera = js.native
    
    var cascades: Double = js.native
    
    def createLights(): Unit = js.native
    
    def customSplitsCallback(cascades: Double, cameraNear: Double, cameraFar: Double, breaks: js.Array[Double]): Unit = js.native
    
    def dispose(): Unit = js.native
    
    var fade: Boolean = js.native
    
    var frustums: js.Array[default] = js.native
    
    def getBreaks(): Unit = js.native
    
    def getExtendedBreaks(target: js.Array[Vector2]): Unit = js.native
    
    def initCascades(): Unit = js.native
    
    def injectInclude(): Unit = js.native
    
    var lightDirection: Vector3 = js.native
    
    var lightFar: Double = js.native
    
    var lightIntensity: Double = js.native
    
    var lightMargin: Double = js.native
    
    var lightNear: Double = js.native
    
    var lights: js.Array[DirectionalLight] = js.native
    
    var mainFrustum: default = js.native
    
    var maxFar: Double = js.native
    
    var mode: CMSMode = js.native
    
    var parent: Object3D[Event] = js.native
    
    def remove(): Unit = js.native
    
    def setupMaterial(material: Material): Unit = js.native
    
    var shaders: Map[Any, String] = js.native
    
    var shadowBias: Double = js.native
    
    var shadowMapSize: Double = js.native
    
    def update(): Unit = js.native
    
    def updateFrustums(): Unit = js.native
    
    def updateShadowBounds(): Unit = js.native
    
    def updateUniforms(): Unit = js.native
  }
  
  trait CMSParameters extends StObject {
    
    var camera: js.UndefOr[Camera] = js.undefined
    
    var cascades: js.UndefOr[Double] = js.undefined
    
    var customSplitsCallback: js.UndefOr[
        js.Function4[
          /* cascades */ Double, 
          /* cameraNear */ Double, 
          /* cameraFar */ Double, 
          /* breaks */ js.Array[Double], 
          Unit
        ]
      ] = js.undefined
    
    var lightDirection: js.UndefOr[Vector3] = js.undefined
    
    var lightFar: js.UndefOr[Double] = js.undefined
    
    var lightIntensity: js.UndefOr[Double] = js.undefined
    
    var lightMargin: js.UndefOr[Double] = js.undefined
    
    var lightNear: js.UndefOr[Double] = js.undefined
    
    var maxFar: js.UndefOr[Double] = js.undefined
    
    var mode: js.UndefOr[CMSMode] = js.undefined
    
    var parent: js.UndefOr[Object3D[Event]] = js.undefined
    
    var shadowBias: js.UndefOr[Double] = js.undefined
    
    var shadowMapSize: js.UndefOr[Double] = js.undefined
  }
  object CMSParameters {
    
    inline def apply(): CMSParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CMSParameters]
    }
    
    extension [Self <: CMSParameters](x: Self) {
      
      inline def setCamera(value: Camera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
      
      inline def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
      
      inline def setCascades(value: Double): Self = StObject.set(x, "cascades", value.asInstanceOf[js.Any])
      
      inline def setCascadesUndefined: Self = StObject.set(x, "cascades", js.undefined)
      
      inline def setCustomSplitsCallback(
        value: (/* cascades */ Double, /* cameraNear */ Double, /* cameraFar */ Double, /* breaks */ js.Array[Double]) => Unit
      ): Self = StObject.set(x, "customSplitsCallback", js.Any.fromFunction4(value))
      
      inline def setCustomSplitsCallbackUndefined: Self = StObject.set(x, "customSplitsCallback", js.undefined)
      
      inline def setLightDirection(value: Vector3): Self = StObject.set(x, "lightDirection", value.asInstanceOf[js.Any])
      
      inline def setLightDirectionUndefined: Self = StObject.set(x, "lightDirection", js.undefined)
      
      inline def setLightFar(value: Double): Self = StObject.set(x, "lightFar", value.asInstanceOf[js.Any])
      
      inline def setLightFarUndefined: Self = StObject.set(x, "lightFar", js.undefined)
      
      inline def setLightIntensity(value: Double): Self = StObject.set(x, "lightIntensity", value.asInstanceOf[js.Any])
      
      inline def setLightIntensityUndefined: Self = StObject.set(x, "lightIntensity", js.undefined)
      
      inline def setLightMargin(value: Double): Self = StObject.set(x, "lightMargin", value.asInstanceOf[js.Any])
      
      inline def setLightMarginUndefined: Self = StObject.set(x, "lightMargin", js.undefined)
      
      inline def setLightNear(value: Double): Self = StObject.set(x, "lightNear", value.asInstanceOf[js.Any])
      
      inline def setLightNearUndefined: Self = StObject.set(x, "lightNear", js.undefined)
      
      inline def setMaxFar(value: Double): Self = StObject.set(x, "maxFar", value.asInstanceOf[js.Any])
      
      inline def setMaxFarUndefined: Self = StObject.set(x, "maxFar", js.undefined)
      
      inline def setMode(value: CMSMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setParent(value: Object3D[Event]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setShadowBias(value: Double): Self = StObject.set(x, "shadowBias", value.asInstanceOf[js.Any])
      
      inline def setShadowBiasUndefined: Self = StObject.set(x, "shadowBias", js.undefined)
      
      inline def setShadowMapSize(value: Double): Self = StObject.set(x, "shadowMapSize", value.asInstanceOf[js.Any])
      
      inline def setShadowMapSizeUndefined: Self = StObject.set(x, "shadowMapSize", js.undefined)
    }
  }
}
