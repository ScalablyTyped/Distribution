package typings.three

import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsBoneMod {
  
  @JSImport("three/src/objects/Bone", "Bone")
  @js.native
  open class Bone () extends Object3D[Event] {
    
    val isBone: `true` = js.native
    
    @JSName("type")
    var type_Bone: typings.three.threeStrings.Bone = js.native
  }
}
