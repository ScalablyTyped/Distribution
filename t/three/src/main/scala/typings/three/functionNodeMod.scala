package typings.three

import org.scalablytyped.runtime.StringDictionary
import typings.three.codeNodeMod.CodeNodeInclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionNodeMod {
  
  @JSImport("three/examples/jsm/nodes/core/FunctionNode", JSImport.Default)
  @js.native
  open class default[P /* <: js.Array[typings.three.nodeMod.default] | StringDictionary[typings.three.nodeMod.default] */] () extends FunctionNode[P] {
    def this(code: String) = this()
    def this(code: String, includes: js.Array[CodeNodeInclude]) = this()
    def this(code: Unit, includes: js.Array[CodeNodeInclude]) = this()
  }
  
  @js.native
  trait FunctionNode[P /* <: js.Array[typings.three.nodeMod.default] | StringDictionary[typings.three.nodeMod.default] */]
    extends typings.three.codeNodeMod.default {
    
    def call(parameters: P): typings.three.functionCallNodeMod.default[P] = js.native
    
    def getInputs(builder: typings.three.nodeBuilderMod.default): js.Array[typings.three.nodeFunctionInputMod.default] = js.native
    
    def getNodeFunction(builder: typings.three.nodeBuilderMod.default): typings.three.nodeFunctionMod.default = js.native
    
    var keywords: StringDictionary[typings.three.nodeMod.default] = js.native
  }
  
  type FunctionNodeArguments = js.Array[typings.three.nodeMod.default] | StringDictionary[typings.three.nodeMod.default]
}
