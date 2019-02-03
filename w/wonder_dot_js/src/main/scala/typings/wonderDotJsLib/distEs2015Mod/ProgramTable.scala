package typings
package wonderDotJsLib.distEs2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "ProgramTable")
@js.native
class ProgramTable ()
  extends wonderDotJsLib.distEs2015CoreEntityObjectSceneCacheProgramTableMod.ProgramTable

/* static members */
@JSImport("wonder.js/dist/es2015", "ProgramTable")
@js.native
object ProgramTable extends js.Object {
  var lastUsedProgram: wonderDotJsLib.distEs2015RendererProgramProgramMod.Program = js.native
  def addProgram(key: java.lang.String, program: wonderDotJsLib.distEs2015RendererProgramProgramMod.Program): scala.Unit = js.native
  def clearAll(): scala.Unit = js.native
  def dispose(): scala.Unit = js.native
  def getProgram(key: java.lang.String): wonderDotJsLib.distEs2015RendererProgramProgramMod.Program = js.native
  def hasProgram(key: java.lang.String): scala.Boolean = js.native
}

