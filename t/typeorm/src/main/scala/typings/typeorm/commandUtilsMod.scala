package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandUtilsMod {
  
  @JSImport("typeorm/commands/CommandUtils", "CommandUtils")
  @js.native
  class CommandUtils () extends StObject
  /* static members */
  object CommandUtils {
    
    /**
      * Creates directories recursively.
      */
    @JSImport("typeorm/commands/CommandUtils", "CommandUtils.createDirectories")
    @js.native
    def createDirectories(directory: String): js.Promise[js.UndefOr[String]] = js.native
    
    /**
      * Creates a file with the given content in the given path.
      */
    @JSImport("typeorm/commands/CommandUtils", "CommandUtils.createFile")
    @js.native
    def createFile(filePath: String, content: String): js.Promise[Unit] = js.native
    @JSImport("typeorm/commands/CommandUtils", "CommandUtils.createFile")
    @js.native
    def createFile(filePath: String, content: String, `override`: Boolean): js.Promise[Unit] = js.native
    
    @JSImport("typeorm/commands/CommandUtils", "CommandUtils.fileExists")
    @js.native
    def fileExists(filePath: String): js.Promise[Boolean] = js.native
    
    /**
      * Reads everything from a given file and returns its content as a string.
      */
    @JSImport("typeorm/commands/CommandUtils", "CommandUtils.readFile")
    @js.native
    def readFile(filePath: String): js.Promise[String] = js.native
  }
}
