package typings.three

import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codeNodeMod {
  
  @JSImport("three/examples/jsm/nodes/core/CodeNode", JSImport.Default)
  @js.native
  open class default () extends CodeNode {
    def this(code: String) = this()
    def this(code: String, includes: js.Array[CodeNodeInclude]) = this()
    def this(code: Unit, includes: js.Array[CodeNodeInclude]) = this()
  }
  
  @js.native
  trait CodeNode
    extends typings.three.nodeMod.default {
    
    var code: String = js.native
    
    def getIncludes(builder: typings.three.nodeBuilderMod.default): js.Array[CodeNodeInclude] = js.native
    
    var isCodeNode: `true` = js.native
    
    def setIncludes(includes: js.Array[CodeNodeInclude]): this.type = js.native
  }
  
  trait CodeNodeInclude extends StObject {
    
    def build(builder: typings.three.nodeBuilderMod.default): Unit
  }
  object CodeNodeInclude {
    
    inline def apply(build: typings.three.nodeBuilderMod.default => Unit): CodeNodeInclude = {
      val __obj = js.Dynamic.literal(build = js.Any.fromFunction1(build))
      __obj.asInstanceOf[CodeNodeInclude]
    }
    
    extension [Self <: CodeNodeInclude](x: Self) {
      
      inline def setBuild(value: typings.three.nodeBuilderMod.default => Unit): Self = StObject.set(x, "build", js.Any.fromFunction1(value))
    }
  }
}
