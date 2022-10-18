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
  open class Group () extends Object3D[Event] {
    
    val isGroup: `true` = js.native
    
    @JSName("type")
    var type_Group: typings.three.threeStrings.Group = js.native
  }
}
