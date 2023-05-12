package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcThreeMod.LightProbe
import typings.three.srcThreeMod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmHelpersLightProbeHelperMod {
  
  @JSImport("three/examples/jsm/helpers/LightProbeHelper", "LightProbeHelper")
  @js.native
  open class LightProbeHelper protected ()
    extends Mesh[BufferGeometry[NormalBufferAttributes], Material | js.Array[Material]] {
    def this(lightProbe: LightProbe, size: Double) = this()
    
    def dispose(): Unit = js.native
    
    var lightProbe: LightProbe = js.native
    
    var size: Double = js.native
  }
}
