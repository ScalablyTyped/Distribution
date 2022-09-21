package typings.three

import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeFunctionMod {
  
  @JSImport("three/examples/jsm/nodes/core/NodeFunction", JSImport.Default)
  @js.native
  abstract class default protected ()
    extends StObject
       with NodeFunction {
    def this(`type`: String, inputs: js.Array[typings.three.nodeFunctionInputMod.default]) = this()
    def this(`type`: String, inputs: js.Array[typings.three.nodeFunctionInputMod.default], name: String) = this()
    def this(
      `type`: String,
      inputs: js.Array[typings.three.nodeFunctionInputMod.default],
      name: String,
      presicion: String
    ) = this()
    def this(
      `type`: String,
      inputs: js.Array[typings.three.nodeFunctionInputMod.default],
      name: Unit,
      presicion: String
    ) = this()
  }
  
  @js.native
  trait NodeFunction extends StObject {
    
    def getCode(): String = js.native
    def getCode(name: String): String = js.native
    
    var inputs: js.Array[typings.three.nodeFunctionInputMod.default] = js.native
    
    var isNodeFunction: `true` = js.native
    
    var name: String = js.native
    
    var presicion: String = js.native
    
    var `type`: String = js.native
  }
}
