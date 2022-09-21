package typings.three

import typings.three.eventDispatcherMod.Event
import typings.three.hemisphereLightMod.HemisphereLight
import typings.three.meshBasicMaterialMod.MeshBasicMaterial
import typings.three.object3DMod.Object3D
import typings.three.utilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hemisphereLightHelperMod {
  
  @JSImport("three/src/helpers/HemisphereLightHelper", "HemisphereLightHelper")
  @js.native
  open class HemisphereLightHelper protected () extends Object3D[Event] {
    def this(light: HemisphereLight, size: Double) = this()
    def this(light: HemisphereLight, size: Double, color: ColorRepresentation) = this()
    
    var color: js.UndefOr[ColorRepresentation] = js.native
    
    def dispose(): Unit = js.native
    
    var light: HemisphereLight = js.native
    
    var material: MeshBasicMaterial = js.native
    
    def update(): Unit = js.native
  }
}
