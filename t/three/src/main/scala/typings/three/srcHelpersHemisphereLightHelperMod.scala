package typings.three

import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcLightsHemisphereLightMod.HemisphereLight
import typings.three.srcMaterialsMeshBasicMaterialMod.MeshBasicMaterial
import typings.three.srcUtilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHelpersHemisphereLightHelperMod {
  
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
