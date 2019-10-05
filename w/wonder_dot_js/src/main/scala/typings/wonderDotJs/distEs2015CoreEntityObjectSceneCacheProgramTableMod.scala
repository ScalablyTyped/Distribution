package typings.wonderDotJs

import typings.wonderDotJs.distEs2015RendererProgramProgramMod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/core/entityObject/scene/cache/ProgramTable", JSImport.Namespace)
@js.native
object distEs2015CoreEntityObjectSceneCacheProgramTableMod extends js.Object {
  @js.native
  class ProgramTable () extends js.Object
  
  /* static members */
  @js.native
  object ProgramTable extends js.Object {
    var lastUsedProgram: Program = js.native
    def addProgram(key: String, program: Program): Unit = js.native
    def clearAll(): Unit = js.native
    def dispose(): Unit = js.native
    def getProgram(key: String): Program = js.native
    def hasProgram(key: String): Boolean = js.native
  }
  
}

