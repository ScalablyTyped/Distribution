package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcThreeMod.BoxGeometry
import typings.three.srcThreeMod.Mesh
import typings.three.srcThreeMod.ShaderMaterial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmObjectsSkyMod {
  
  @JSImport("three/examples/jsm/objects/Sky", "Sky")
  @js.native
  open class Sky ()
    extends Mesh[BufferGeometry[NormalBufferAttributes], Material | js.Array[Material]] {
    
    @JSName("geometry")
    var geometry_Sky: BoxGeometry = js.native
    
    @JSName("material")
    var material_Sky: ShaderMaterial = js.native
  }
  /* static members */
  object Sky {
    
    @JSImport("three/examples/jsm/objects/Sky", "Sky")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/objects/Sky", "Sky.SkyShader")
    @js.native
    def SkyShader: js.Object = js.native
    inline def SkyShader_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SkyShader")(x.asInstanceOf[js.Any])
  }
}
