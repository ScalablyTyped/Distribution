package typings.typeorm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/commands/CommandUtils", JSImport.Namespace)
@js.native
object commandUtilsMod extends js.Object {
  
  @js.native
  class CommandUtils () extends js.Object
  /* static members */
  @js.native
  object CommandUtils extends js.Object {
    
    /**
      * Creates directories recursively.
      */
    def createDirectories(directory: String): js.Promise[js.UndefOr[String]] = js.native
    
    /**
      * Creates a file with the given content in the given path.
      */
    def createFile(filePath: String, content: String): js.Promise[Unit] = js.native
    def createFile(filePath: String, content: String, `override`: Boolean): js.Promise[Unit] = js.native
    
    def fileExists(filePath: String): js.Promise[Boolean] = js.native
    
    /**
      * Reads everything from a given file and returns its content as a string.
      */
    def readFile(filePath: String): js.Promise[String] = js.native
  }
}
