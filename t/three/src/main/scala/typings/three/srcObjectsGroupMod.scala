package typings.three

import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsGroupMod {
  
  @JSImport("three/src/objects/Group", "Group")
  @js.native
  /**
    * Creates a new {@link Bone}.
    */
  open class Group () extends Object3D[Event] {
    
    /**
      * Read-only flag to check if a given object is of type {@link Group}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isGroup: `true` = js.native
    
    /**
      * @override
      * @defaultValue `Group`
      */
    @JSName("type")
    val type_Group: String | typings.three.threeStrings.Group = js.native
  }
}
