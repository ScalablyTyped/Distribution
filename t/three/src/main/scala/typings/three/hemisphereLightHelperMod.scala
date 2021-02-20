package typings.three

import typings.three.colorMod.Color
import typings.three.hemisphereLightMod.HemisphereLight
import typings.three.meshBasicMaterialMod.MeshBasicMaterial
import typings.three.object3DMod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hemisphereLightHelperMod {
  
  @JSImport("three/src/helpers/HemisphereLightHelper", "HemisphereLightHelper")
  @js.native
  class HemisphereLightHelper protected () extends Object3D {
    def this(light: HemisphereLight, size: Double) = this()
    def this(light: HemisphereLight, size: Double, color: String) = this()
    def this(light: HemisphereLight, size: Double, color: Double) = this()
    def this(light: HemisphereLight, size: Double, color: Color) = this()
    
    var color: js.UndefOr[Color | String | Double] = js.native
    
    def dispose(): Unit = js.native
    
    var light: HemisphereLight = js.native
    
    var material: MeshBasicMaterial = js.native
    
    def update(): Unit = js.native
  }
}
