package typings.three

import typings.three.anon.Radius
import typings.three.threeMod.IcosahedronGeometry
import typings.three.threeMod.Mesh
import typings.three.threeMod.ShaderMaterial
import typings.three.threeMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groundProjectedEnvMod {
  
  @JSImport("three/examples/jsm/objects/GroundProjectedEnv", "GroundProjectedEnv")
  @js.native
  open class GroundProjectedEnv protected () extends Mesh[IcosahedronGeometry, ShaderMaterial] {
    def this(texture: Texture) = this()
    def this(texture: Texture, options: Radius) = this()
    
    def height: Double = js.native
    def height_=(height: Double): Unit = js.native
    
    def radius: Double = js.native
    def radius_=(radius: Double): Unit = js.native
  }
}
