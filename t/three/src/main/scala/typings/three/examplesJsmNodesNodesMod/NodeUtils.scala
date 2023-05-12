package typings.three.examplesJsmNodesNodesMod

import typings.std.Generator
import typings.three.examplesJsmNodesCoreConstantsMod.NodeValueOption
import typings.three.examplesJsmNodesCoreNodeMod.default
import typings.three.examplesJsmNodesCoreNodeUtilsMod.NodeChild
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NodeUtils {
  
  @JSImport("three/examples/jsm/nodes/Nodes", "NodeUtils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCacheKey(`object`: default): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCacheKey")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getNodeChildren(`object`: default): Generator[NodeChild, Unit, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeChildren")(`object`.asInstanceOf[js.Any]).asInstanceOf[Generator[NodeChild, Unit, Any]]
  
  inline def getValueFromType(`type`: String, params: Double*): NodeValueOption | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getValueFromType")(scala.List(`type`.asInstanceOf[js.Any]).`++`(params.asInstanceOf[Seq[js.Any]])*).asInstanceOf[NodeValueOption | Null]
  
  inline def getValueType(value: NodeValueOption): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getValueType")(value.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
