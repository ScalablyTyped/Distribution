package typings.three

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.materialMod.Material
import typings.three.srcConstantsMod.TextureEncoding
import typings.three.threeMod.Mesh
import typings.three.threeMod.ShaderMaterial
import typings.three.threeMod.Texture
import typings.three.threeMod.Vector2
import typings.three.utilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object water2Mod {
  
  @JSImport("three/examples/jsm/objects/Water2", "Water")
  @js.native
  open class Water protected ()
    extends Mesh[BufferGeometry, Material | js.Array[Material]] {
    def this(geometry: typings.three.threeMod.BufferGeometry, options: Water2Options) = this()
    
    @JSName("material")
    var material_Water: ShaderMaterial = js.native
  }
  
  trait Water2Options extends StObject {
    
    var clipBias: js.UndefOr[Double] = js.undefined
    
    var color: js.UndefOr[ColorRepresentation] = js.undefined
    
    var encoding: js.UndefOr[TextureEncoding] = js.undefined
    
    var flowDirection: js.UndefOr[Vector2] = js.undefined
    
    var flowMap: js.UndefOr[Texture] = js.undefined
    
    var flowSpeed: js.UndefOr[Double] = js.undefined
    
    var normalMap0: js.UndefOr[Texture] = js.undefined
    
    var normalMap1: js.UndefOr[Texture] = js.undefined
    
    var reflectivity: js.UndefOr[Double] = js.undefined
    
    var scale: js.UndefOr[Double] = js.undefined
    
    var shader: js.UndefOr[js.Object] = js.undefined
    
    var textureHeight: js.UndefOr[Double] = js.undefined
    
    var textureWidth: js.UndefOr[Double] = js.undefined
  }
  object Water2Options {
    
    inline def apply(): Water2Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Water2Options]
    }
    
    extension [Self <: Water2Options](x: Self) {
      
      inline def setClipBias(value: Double): Self = StObject.set(x, "clipBias", value.asInstanceOf[js.Any])
      
      inline def setClipBiasUndefined: Self = StObject.set(x, "clipBias", js.undefined)
      
      inline def setColor(value: ColorRepresentation): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setEncoding(value: TextureEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFlowDirection(value: Vector2): Self = StObject.set(x, "flowDirection", value.asInstanceOf[js.Any])
      
      inline def setFlowDirectionUndefined: Self = StObject.set(x, "flowDirection", js.undefined)
      
      inline def setFlowMap(value: Texture): Self = StObject.set(x, "flowMap", value.asInstanceOf[js.Any])
      
      inline def setFlowMapUndefined: Self = StObject.set(x, "flowMap", js.undefined)
      
      inline def setFlowSpeed(value: Double): Self = StObject.set(x, "flowSpeed", value.asInstanceOf[js.Any])
      
      inline def setFlowSpeedUndefined: Self = StObject.set(x, "flowSpeed", js.undefined)
      
      inline def setNormalMap0(value: Texture): Self = StObject.set(x, "normalMap0", value.asInstanceOf[js.Any])
      
      inline def setNormalMap0Undefined: Self = StObject.set(x, "normalMap0", js.undefined)
      
      inline def setNormalMap1(value: Texture): Self = StObject.set(x, "normalMap1", value.asInstanceOf[js.Any])
      
      inline def setNormalMap1Undefined: Self = StObject.set(x, "normalMap1", js.undefined)
      
      inline def setReflectivity(value: Double): Self = StObject.set(x, "reflectivity", value.asInstanceOf[js.Any])
      
      inline def setReflectivityUndefined: Self = StObject.set(x, "reflectivity", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setShader(value: js.Object): Self = StObject.set(x, "shader", value.asInstanceOf[js.Any])
      
      inline def setShaderUndefined: Self = StObject.set(x, "shader", js.undefined)
      
      inline def setTextureHeight(value: Double): Self = StObject.set(x, "textureHeight", value.asInstanceOf[js.Any])
      
      inline def setTextureHeightUndefined: Self = StObject.set(x, "textureHeight", js.undefined)
      
      inline def setTextureWidth(value: Double): Self = StObject.set(x, "textureWidth", value.asInstanceOf[js.Any])
      
      inline def setTextureWidthUndefined: Self = StObject.set(x, "textureWidth", js.undefined)
    }
  }
}
