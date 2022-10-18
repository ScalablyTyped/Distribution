package typings.three

import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesCoreNodeFunctionMod {
  
  /* note: abstract class */ @JSImport("three/examples/jsm/nodes/core/NodeFunction", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with NodeFunction {
    def this(`type`: String, inputs: js.Array[typings.three.examplesJsmNodesCoreNodeFunctionInputMod.default]) = this()
    def this(
      `type`: String,
      inputs: js.Array[typings.three.examplesJsmNodesCoreNodeFunctionInputMod.default],
      name: String
    ) = this()
    def this(
      `type`: String,
      inputs: js.Array[typings.three.examplesJsmNodesCoreNodeFunctionInputMod.default],
      name: String,
      presicion: String
    ) = this()
    def this(
      `type`: String,
      inputs: js.Array[typings.three.examplesJsmNodesCoreNodeFunctionInputMod.default],
      name: Unit,
      presicion: String
    ) = this()
  }
  
  @js.native
  trait NodeFunction extends StObject {
    
    def getCode(): String = js.native
    def getCode(name: String): String = js.native
    
    var inputs: js.Array[typings.three.examplesJsmNodesCoreNodeFunctionInputMod.default] = js.native
    
    var isNodeFunction: `true` = js.native
    
    var name: String = js.native
    
    var presicion: String = js.native
    
    var `type`: String = js.native
  }
}
