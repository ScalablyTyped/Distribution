package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandUtilsMod {
  
  @JSImport("typeorm/commands/CommandUtils", "CommandUtils")
  @js.native
  class CommandUtils () extends StObject
  /* static members */
  object CommandUtils {
    
    @JSImport("typeorm/commands/CommandUtils", "CommandUtils")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates directories recursively.
      */
    @scala.inline
    def createDirectories(directory: String): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDirectories")(directory.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
    
    /**
      * Creates a file with the given content in the given path.
      */
    @scala.inline
    def createFile(filePath: String, content: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFile")(filePath.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    @scala.inline
    def createFile(filePath: String, content: String, `override`: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFile")(filePath.asInstanceOf[js.Any], content.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    @scala.inline
    def fileExists(filePath: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("fileExists")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    
    /**
      * Reads everything from a given file and returns its content as a string.
      */
    @scala.inline
    def readFile(filePath: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  }
}
