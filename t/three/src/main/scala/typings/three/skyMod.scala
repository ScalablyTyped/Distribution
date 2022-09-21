package typings.three

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.materialMod.Material
import typings.three.threeMod.BoxGeometry
import typings.three.threeMod.Mesh
import typings.three.threeMod.ShaderMaterial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skyMod {
  
  @JSImport("three/examples/jsm/objects/Sky", "Sky")
  @js.native
  open class Sky ()
    extends Mesh[BufferGeometry, Material | js.Array[Material]] {
    
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
