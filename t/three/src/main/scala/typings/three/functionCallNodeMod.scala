package typings.three

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionCallNodeMod {
  
  @JSImport("three/examples/jsm/nodes/core/FunctionCallNode", JSImport.Default)
  @js.native
  open class default[P /* <: js.Array[typings.three.nodeMod.default] | StringDictionary[typings.three.nodeMod.default] */] () extends FunctionCallNode[P] {
    def this(functionNode: typings.three.functionNodeMod.default[P]) = this()
    def this(functionNode: Unit, parameters: P) = this()
    def this(functionNode: typings.three.functionNodeMod.default[P], parameters: P) = this()
  }
  
  @js.native
  trait FunctionCallNode[P /* <: js.Array[typings.three.nodeMod.default] | StringDictionary[typings.three.nodeMod.default] */]
    extends typings.three.tempNodeMod.default {
    
    var functionNode: typings.three.functionNodeMod.default[P] = js.native
    
    def getParameters(): P = js.native
    
    var parameters: StringDictionary[typings.three.nodeMod.default] = js.native
    
    def setParameters(parameters: P): this.type = js.native
  }
}
