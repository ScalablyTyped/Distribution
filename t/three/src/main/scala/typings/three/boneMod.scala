package typings.three

import typings.three.eventDispatcherMod.Event
import typings.three.object3DMod.Object3D
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boneMod {
  
  @JSImport("three/src/objects/Bone", "Bone")
  @js.native
  open class Bone () extends Object3D[Event] {
    
    val isBone: `true` = js.native
    
    @JSName("type")
    var type_Bone: typings.three.threeStrings.Bone = js.native
  }
}
