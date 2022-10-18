package typings.wonderJs

import typings.wonderJs.distEs2015RendererProgramProgramMod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015CoreEntityObjectSceneCacheProgramTableMod {
  
  @JSImport("wonder.js/dist/es2015/core/entityObject/scene/cache/ProgramTable", "ProgramTable")
  @js.native
  open class ProgramTable () extends StObject
  /* static members */
  object ProgramTable {
    
    @JSImport("wonder.js/dist/es2015/core/entityObject/scene/cache/ProgramTable", "ProgramTable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addProgram(key: String, program: Program): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addProgram")(key.asInstanceOf[js.Any], program.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def clearAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearAll")().asInstanceOf[Unit]
    
    inline def dispose(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dispose")().asInstanceOf[Unit]
    
    inline def getProgram(key: String): Program = ^.asInstanceOf[js.Dynamic].applyDynamic("getProgram")(key.asInstanceOf[js.Any]).asInstanceOf[Program]
    
    inline def hasProgram(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasProgram")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @JSImport("wonder.js/dist/es2015/core/entityObject/scene/cache/ProgramTable", "ProgramTable.lastUsedProgram")
    @js.native
    def lastUsedProgram: Program = js.native
    inline def lastUsedProgram_=(x: Program): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lastUsedProgram")(x.asInstanceOf[js.Any])
  }
}
