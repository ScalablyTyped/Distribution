package typings.three

import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesCodeCodeNodeMod {
  
  @JSImport("three/examples/jsm/nodes/code/CodeNode", JSImport.Default)
  @js.native
  open class default () extends CodeNode {
    def this(code: String) = this()
    def this(code: String, includes: js.Array[CodeNodeInclude]) = this()
    def this(code: Unit, includes: js.Array[CodeNodeInclude]) = this()
  }
  
  @js.native
  trait CodeNode
    extends typings.three.examplesJsmNodesCoreNodeMod.default {
    
    var code: String = js.native
    
    def getIncludes(builder: typings.three.examplesJsmNodesCoreNodeBuilderMod.default): js.Array[CodeNodeInclude] = js.native
    
    var isCodeNode: `true` = js.native
    
    def setIncludes(includes: js.Array[CodeNodeInclude]): this.type = js.native
  }
  
  trait CodeNodeInclude extends StObject {
    
    def build(builder: typings.three.examplesJsmNodesCoreNodeBuilderMod.default): Unit
  }
  object CodeNodeInclude {
    
    inline def apply(build: typings.three.examplesJsmNodesCoreNodeBuilderMod.default => Unit): CodeNodeInclude = {
      val __obj = js.Dynamic.literal(build = js.Any.fromFunction1(build))
      __obj.asInstanceOf[CodeNodeInclude]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CodeNodeInclude] (val x: Self) extends AnyVal {
      
      inline def setBuild(value: typings.three.examplesJsmNodesCoreNodeBuilderMod.default => Unit): Self = StObject.set(x, "build", js.Any.fromFunction1(value))
    }
  }
}
