package typings.three

import typings.three.srcConstantsMod.Side
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcThreeMod.Mesh
import typings.three.srcThreeMod.ShaderMaterial
import typings.three.srcThreeMod.Texture
import typings.three.srcThreeMod.Vector3
import typings.three.srcUtilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmObjectsWaterMod {
  
  @JSImport("three/examples/jsm/objects/Water", "Water")
  @js.native
  open class Water protected ()
    extends Mesh[BufferGeometry, Material | js.Array[Material]] {
    def this(geometry: typings.three.srcThreeMod.BufferGeometry, options: WaterOptions) = this()
    
    @JSName("material")
    var material_Water: ShaderMaterial = js.native
  }
  
  trait WaterOptions extends StObject {
    
    var alpha: js.UndefOr[Double] = js.undefined
    
    var clipBias: js.UndefOr[Double] = js.undefined
    
    var distortionScale: js.UndefOr[Double] = js.undefined
    
    var eye: js.UndefOr[Vector3] = js.undefined
    
    var fog: js.UndefOr[Boolean] = js.undefined
    
    var side: js.UndefOr[Side] = js.undefined
    
    var sunColor: js.UndefOr[ColorRepresentation] = js.undefined
    
    var sunDirection: js.UndefOr[Vector3] = js.undefined
    
    var textureHeight: js.UndefOr[Double] = js.undefined
    
    var textureWidth: js.UndefOr[Double] = js.undefined
    
    var time: js.UndefOr[Double] = js.undefined
    
    var waterColor: js.UndefOr[ColorRepresentation] = js.undefined
    
    var waterNormals: js.UndefOr[Texture] = js.undefined
  }
  object WaterOptions {
    
    inline def apply(): WaterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WaterOptions]
    }
    
    extension [Self <: WaterOptions](x: Self) {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setClipBias(value: Double): Self = StObject.set(x, "clipBias", value.asInstanceOf[js.Any])
      
      inline def setClipBiasUndefined: Self = StObject.set(x, "clipBias", js.undefined)
      
      inline def setDistortionScale(value: Double): Self = StObject.set(x, "distortionScale", value.asInstanceOf[js.Any])
      
      inline def setDistortionScaleUndefined: Self = StObject.set(x, "distortionScale", js.undefined)
      
      inline def setEye(value: Vector3): Self = StObject.set(x, "eye", value.asInstanceOf[js.Any])
      
      inline def setEyeUndefined: Self = StObject.set(x, "eye", js.undefined)
      
      inline def setFog(value: Boolean): Self = StObject.set(x, "fog", value.asInstanceOf[js.Any])
      
      inline def setFogUndefined: Self = StObject.set(x, "fog", js.undefined)
      
      inline def setSide(value: Side): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
      
      inline def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
      
      inline def setSunColor(value: ColorRepresentation): Self = StObject.set(x, "sunColor", value.asInstanceOf[js.Any])
      
      inline def setSunColorUndefined: Self = StObject.set(x, "sunColor", js.undefined)
      
      inline def setSunDirection(value: Vector3): Self = StObject.set(x, "sunDirection", value.asInstanceOf[js.Any])
      
      inline def setSunDirectionUndefined: Self = StObject.set(x, "sunDirection", js.undefined)
      
      inline def setTextureHeight(value: Double): Self = StObject.set(x, "textureHeight", value.asInstanceOf[js.Any])
      
      inline def setTextureHeightUndefined: Self = StObject.set(x, "textureHeight", js.undefined)
      
      inline def setTextureWidth(value: Double): Self = StObject.set(x, "textureWidth", value.asInstanceOf[js.Any])
      
      inline def setTextureWidthUndefined: Self = StObject.set(x, "textureWidth", js.undefined)
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      
      inline def setWaterColor(value: ColorRepresentation): Self = StObject.set(x, "waterColor", value.asInstanceOf[js.Any])
      
      inline def setWaterColorUndefined: Self = StObject.set(x, "waterColor", js.undefined)
      
      inline def setWaterNormals(value: Texture): Self = StObject.set(x, "waterNormals", value.asInstanceOf[js.Any])
      
      inline def setWaterNormalsUndefined: Self = StObject.set(x, "waterNormals", js.undefined)
    }
  }
}
