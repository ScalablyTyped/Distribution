package typings.three

import org.scalablytyped.runtime.StringDictionary
import typings.three.examplesJsmNodesCodeCodeNodeMod.CodeNodeInclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesCodeFunctionNodeMod {
  
  @JSImport("three/examples/jsm/nodes/code/FunctionNode", JSImport.Default)
  @js.native
  open class default[P /* <: js.Array[typings.three.examplesJsmNodesCoreNodeMod.default] | StringDictionary[typings.three.examplesJsmNodesCoreNodeMod.default] */] () extends FunctionNode[P] {
    def this(code: String) = this()
    def this(code: String, includes: js.Array[CodeNodeInclude]) = this()
    def this(code: Unit, includes: js.Array[CodeNodeInclude]) = this()
  }
  
  @js.native
  trait FunctionNode[P /* <: js.Array[typings.three.examplesJsmNodesCoreNodeMod.default] | StringDictionary[typings.three.examplesJsmNodesCoreNodeMod.default] */]
    extends typings.three.examplesJsmNodesCodeCodeNodeMod.default {
    
    def call(parameters: P): typings.three.examplesJsmNodesCodeFunctionCallNodeMod.default[P] = js.native
    
    def getInputs(builder: typings.three.examplesJsmNodesCoreNodeBuilderMod.default): js.Array[typings.three.examplesJsmNodesCoreNodeFunctionInputMod.default] = js.native
    
    def getNodeFunction(builder: typings.three.examplesJsmNodesCoreNodeBuilderMod.default): typings.three.examplesJsmNodesCoreNodeFunctionMod.default = js.native
    
    var keywords: StringDictionary[typings.three.examplesJsmNodesCoreNodeMod.default] = js.native
  }
  
  type FunctionNodeArguments = js.Array[typings.three.examplesJsmNodesCoreNodeMod.default] | StringDictionary[typings.three.examplesJsmNodesCoreNodeMod.default]
}
