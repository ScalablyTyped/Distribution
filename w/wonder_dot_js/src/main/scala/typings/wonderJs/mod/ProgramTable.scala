package typings.wonderJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "ProgramTable")
@js.native
class ProgramTable ()
  extends typings.wonderJs.programTableMod.ProgramTable
/* static members */
object ProgramTable {
  
  @JSImport("wonder.js/dist/es2015", "ProgramTable")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addProgram(key: String, program: typings.wonderJs.programMod.Program): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addProgram")(key.asInstanceOf[js.Any], program.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def clearAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearAll")().asInstanceOf[Unit]
  
  inline def dispose(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dispose")().asInstanceOf[Unit]
  
  inline def getProgram(key: String): typings.wonderJs.programMod.Program = ^.asInstanceOf[js.Dynamic].applyDynamic("getProgram")(key.asInstanceOf[js.Any]).asInstanceOf[typings.wonderJs.programMod.Program]
  
  inline def hasProgram(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasProgram")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("wonder.js/dist/es2015", "ProgramTable.lastUsedProgram")
  @js.native
  def lastUsedProgram: typings.wonderJs.programMod.Program = js.native
  inline def lastUsedProgram_=(x: typings.wonderJs.programMod.Program): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lastUsedProgram")(x.asInstanceOf[js.Any])
}
