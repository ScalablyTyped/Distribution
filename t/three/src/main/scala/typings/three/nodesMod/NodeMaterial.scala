package typings.three.nodesMod

import typings.three.threeMod.Material
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/examples/jsm/nodes/Nodes", "NodeMaterial")
@js.native
open class NodeMaterial ()
  extends typings.three.materialsMod.NodeMaterial
/* static members */
object NodeMaterial {
  
  @JSImport("three/examples/jsm/nodes/Nodes", "NodeMaterial")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromMaterial(m: Material): typings.three.nodeMaterialMod.NodeMaterial = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMaterial")(m.asInstanceOf[js.Any]).asInstanceOf[typings.three.nodeMaterialMod.NodeMaterial]
}
