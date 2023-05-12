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
  /**
    * Creates a new {@link Bone}.
    */
  open class Bone () extends Object3D[Event] {
    
    /**
      * Read-only flag to check if a given object is of type {@link Bone}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isBone: `true` = js.native
    
    /**
      * @override
      * @defaultValue `Bone`
      */
    @JSName("type")
    val type_Bone: String | typings.three.threeStrings.Bone = js.native
  }
}
