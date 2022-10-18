package typings.three

import typings.three.anon.Radius
import typings.three.srcThreeMod.IcosahedronGeometry
import typings.three.srcThreeMod.Mesh
import typings.three.srcThreeMod.ShaderMaterial
import typings.three.srcThreeMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmObjectsGroundProjectedEnvMod {
  
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
