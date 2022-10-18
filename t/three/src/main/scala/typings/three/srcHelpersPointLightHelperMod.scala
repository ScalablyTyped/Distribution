package typings.three

import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcLightsPointLightMod.PointLight
import typings.three.srcUtilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHelpersPointLightHelperMod {
  
  @JSImport("three/src/helpers/PointLightHelper", "PointLightHelper")
  @js.native
  open class PointLightHelper protected () extends Object3D[Event] {
    def this(light: PointLight) = this()
    def this(light: PointLight, sphereSize: Double) = this()
    def this(light: PointLight, sphereSize: Double, color: ColorRepresentation) = this()
    def this(light: PointLight, sphereSize: Unit, color: ColorRepresentation) = this()
    
    var color: js.UndefOr[ColorRepresentation] = js.native
    
    def dispose(): Unit = js.native
    
    var light: PointLight = js.native
    
    def update(): Unit = js.native
  }
}
