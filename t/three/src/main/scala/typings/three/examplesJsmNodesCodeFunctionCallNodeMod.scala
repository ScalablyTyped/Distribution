package typings.three

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesCodeFunctionCallNodeMod {
  
  @JSImport("three/examples/jsm/nodes/code/FunctionCallNode", JSImport.Default)
  @js.native
  open class default[P /* <: js.Array[typings.three.examplesJsmNodesCoreNodeMod.default] | StringDictionary[typings.three.examplesJsmNodesCoreNodeMod.default] */] () extends FunctionCallNode[P] {
    def this(functionNode: typings.three.examplesJsmNodesCodeFunctionNodeMod.default[P]) = this()
    def this(functionNode: Unit, parameters: P) = this()
    def this(functionNode: typings.three.examplesJsmNodesCodeFunctionNodeMod.default[P], parameters: P) = this()
  }
  
  @js.native
  trait FunctionCallNode[P /* <: js.Array[typings.three.examplesJsmNodesCoreNodeMod.default] | StringDictionary[typings.three.examplesJsmNodesCoreNodeMod.default] */]
    extends typings.three.examplesJsmNodesCoreTempNodeMod.default {
    
    var functionNode: typings.three.examplesJsmNodesCodeFunctionNodeMod.default[P] = js.native
    
    def getParameters(): P = js.native
    
    var parameters: StringDictionary[typings.three.examplesJsmNodesCoreNodeMod.default] = js.native
    
    def setParameters(parameters: P): this.type = js.native
  }
}
