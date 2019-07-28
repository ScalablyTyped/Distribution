package typings.wonderDotJs.distEs2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "ProgramTable")
@js.native
class ProgramTable ()
  extends typings.wonderDotJs.distEs2015CoreEntityObjectSceneCacheProgramTableMod.ProgramTable

/* static members */
@JSImport("wonder.js/dist/es2015", "ProgramTable")
@js.native
object ProgramTable extends js.Object {
  var lastUsedProgram: typings.wonderDotJs.distEs2015RendererProgramProgramMod.Program = js.native
  def addProgram(key: String, program: typings.wonderDotJs.distEs2015RendererProgramProgramMod.Program): Unit = js.native
  def clearAll(): Unit = js.native
  def dispose(): Unit = js.native
  def getProgram(key: String): typings.wonderDotJs.distEs2015RendererProgramProgramMod.Program = js.native
  def hasProgram(key: String): Boolean = js.native
}

