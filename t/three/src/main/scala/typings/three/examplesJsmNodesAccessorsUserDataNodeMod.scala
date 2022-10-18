package typings.three

import typings.three.examplesJsmNodesCoreConstantsMod.NodeTypeOption
import typings.three.examplesJsmNodesCoreConstantsMod.NodeUserData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesAccessorsUserDataNodeMod {
  
  @JSImport("three/examples/jsm/nodes/accessors/UserDataNode", JSImport.Default)
  @js.native
  open class default protected () extends UserDataNode {
    def this(property: String, inputType: NodeTypeOption) = this()
    def this(property: String, inputType: NodeTypeOption, userData: NodeUserData) = this()
  }
  
  @js.native
  trait UserDataNode
    extends typings.three.examplesJsmNodesAccessorsReferenceNodeMod.default[NodeUserData] {
    
    var userData: NodeUserData | Null = js.native
  }
}
