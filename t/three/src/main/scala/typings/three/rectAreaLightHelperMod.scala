package typings.three

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.materialMod.Material
import typings.three.threeMod.Line
import typings.three.threeMod.RectAreaLight
import typings.three.utilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rectAreaLightHelperMod {
  
  @JSImport("three/examples/jsm/helpers/RectAreaLightHelper", "RectAreaLightHelper")
  @js.native
  open class RectAreaLightHelper protected ()
    extends Line[BufferGeometry, Material | js.Array[Material]] {
    def this(light: RectAreaLight) = this()
    def this(light: RectAreaLight, color: ColorRepresentation) = this()
    
    var color: js.UndefOr[ColorRepresentation] = js.native
    
    def dispose(): Unit = js.native
    
    var light: RectAreaLight = js.native
  }
}
