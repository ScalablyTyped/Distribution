package typings.three

import typings.std.Generator
import typings.three.examplesJsmNodesCoreConstantsMod.NodeValueOption
import typings.three.examplesJsmNodesCoreNodeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesCoreNodeUtilsMod {
  
  @JSImport("three/examples/jsm/nodes/core/NodeUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCacheKey(`object`: default): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCacheKey")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getNodeChildren(`object`: default): Generator[NodeChild, Unit, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeChildren")(`object`.asInstanceOf[js.Any]).asInstanceOf[Generator[NodeChild, Unit, Any]]
  
  inline def getValueFromType(`type`: String, params: Double*): NodeValueOption | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getValueFromType")(scala.List(`type`.asInstanceOf[js.Any]).`++`(params.asInstanceOf[Seq[js.Any]])*).asInstanceOf[NodeValueOption | Null]
  
  inline def getValueType(value: NodeValueOption): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getValueType")(value.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  trait NodeChild extends StObject {
    
    var childNode: default
    
    var index: js.UndefOr[Double | String] = js.undefined
    
    var property: String
  }
  object NodeChild {
    
    inline def apply(childNode: default, property: String): NodeChild = {
      val __obj = js.Dynamic.literal(childNode = childNode.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeChild]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeChild] (val x: Self) extends AnyVal {
      
      inline def setChildNode(value: default): Self = StObject.set(x, "childNode", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double | String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    }
  }
}
