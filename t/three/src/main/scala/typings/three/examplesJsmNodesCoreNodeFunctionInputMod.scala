package typings.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesCoreNodeFunctionInputMod {
  
  @JSImport("three/examples/jsm/nodes/core/NodeFunctionInput", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with NodeFunctionInput {
    def this(`type`: String, name: String) = this()
    def this(`type`: String, name: String, count: Double) = this()
    def this(`type`: String, name: String, count: Double, qualifier: String) = this()
    def this(`type`: String, name: String, count: Unit, qualifier: String) = this()
    def this(`type`: String, name: String, count: Double, qualifier: String, isConst: Boolean) = this()
    def this(`type`: String, name: String, count: Double, qualifier: Unit, isConst: Boolean) = this()
    def this(`type`: String, name: String, count: Unit, qualifier: String, isConst: Boolean) = this()
    def this(`type`: String, name: String, count: Unit, qualifier: Unit, isConst: Boolean) = this()
    
    /* CompleteClass */
    var count: Null | Double = js.native
    
    /* CompleteClass */
    var isConst: Boolean = js.native
    
    /* CompleteClass */
    var isNodeFunctionInput: true = js.native
    
    /* CompleteClass */
    var qualifier: String = js.native
  }
  
  trait NodeFunctionInput extends StObject {
    
    var count: Null | Double
    
    var isConst: Boolean
    
    var isNodeFunctionInput: true
    
    var qualifier: String
  }
  object NodeFunctionInput {
    
    inline def apply(isConst: Boolean, qualifier: String): NodeFunctionInput = {
      val __obj = js.Dynamic.literal(isConst = isConst.asInstanceOf[js.Any], isNodeFunctionInput = true, qualifier = qualifier.asInstanceOf[js.Any], count = null)
      __obj.asInstanceOf[NodeFunctionInput]
    }
    
    extension [Self <: NodeFunctionInput](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountNull: Self = StObject.set(x, "count", null)
      
      inline def setIsConst(value: Boolean): Self = StObject.set(x, "isConst", value.asInstanceOf[js.Any])
      
      inline def setIsNodeFunctionInput(value: true): Self = StObject.set(x, "isNodeFunctionInput", value.asInstanceOf[js.Any])
      
      inline def setQualifier(value: String): Self = StObject.set(x, "qualifier", value.asInstanceOf[js.Any])
    }
  }
}
