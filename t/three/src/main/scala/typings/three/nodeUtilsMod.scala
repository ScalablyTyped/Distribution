package typings.three

import typings.three.constantsMod.NodeValueOption
import typings.three.nodeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeUtilsMod {
  
  @JSImport("three/examples/jsm/nodes/core/NodeUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCacheKey(`object`: default): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCacheKey")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getNodesKeys(`object`: default): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodesKeys")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def getValueFromType(`type`: String, params: Double*): NodeValueOption | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getValueFromType")(scala.List(`type`.asInstanceOf[js.Any]).`++`(params.asInstanceOf[Seq[js.Any]])*).asInstanceOf[NodeValueOption | Null]
  
  inline def getValueType(value: NodeValueOption): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getValueType")(value.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
