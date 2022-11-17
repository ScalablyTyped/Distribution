package typings.three

import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreObject3DMod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsGroupMod {
  
  @JSImport("three/src/objects/Group", "Group")
  @js.native
  open class Group () extends Object3D[Event] {
    
    val isGroup: true = js.native
    
    @JSName("type")
    var type_Group: "Group" = js.native
  }
}
