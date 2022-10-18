package typings.three.examplesJsmNodesNodesMod

import typings.three.srcThreeMod.Material
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/examples/jsm/nodes/Nodes", "NodeMaterial")
@js.native
open class NodeMaterial ()
  extends typings.three.examplesJsmNodesMaterialsMaterialsMod.NodeMaterial
/* static members */
object NodeMaterial {
  
  @JSImport("three/examples/jsm/nodes/Nodes", "NodeMaterial")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromMaterial(m: Material): typings.three.examplesJsmNodesMaterialsNodeMaterialMod.NodeMaterial = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMaterial")(m.asInstanceOf[js.Any]).asInstanceOf[typings.three.examplesJsmNodesMaterialsNodeMaterialMod.NodeMaterial]
}
