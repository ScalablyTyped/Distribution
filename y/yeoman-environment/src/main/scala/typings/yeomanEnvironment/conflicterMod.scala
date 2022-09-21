package typings.yeomanEnvironment

import typings.node.bufferMod.global.Buffer
import typings.std.ReadableStream
import typings.vinyl.mod.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conflicterMod {
  
  @JSImport("yeoman-environment/lib/util/conflicter", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Conflicter {
    
    /**
      * Detects conflicts between the actual file located at the `path` and the `contents` passed to the function.
      *
      * @param file
      * The file to check for conflicts.
      *
      * @returns
      * A value indicating whether there is a conflict.
      */
    /* CompleteClass */
    override def _detectConflict(file: ConflicterFile): Boolean = js.native
    
    /**
      * Prints the differences of the specified `file` to the console.
      *
      * @param file
      * The file to print the diff for.
      */
    /* CompleteClass */
    override def _printDiff(file: ConflicterFile): Unit = js.native
    
    /**
      * Checks whether the specified `file` conflicts with the file saved on the disk.
      *
      * @param file
      * The file to check for conflicts.
      */
    /* CompleteClass */
    override def checkForCollision(file: File): js.Promise[CheckedFile] = js.native
    
    /**
      * A value indicating whether conflicts shouldn't be checked.
      */
    /* CompleteClass */
    var force: Boolean = js.native
  }
  
  /**
    * Represents a checked file.
    */
  @js.native
  trait CheckedFile
    extends StObject
       with File {
    
    /**
      * The status of the file.
      */
    var conflicter: Status = js.native
  }
  
  trait Conflicter extends StObject {
    
    /**
      * Detects conflicts between the actual file located at the `path` and the `contents` passed to the function.
      *
      * @param file
      * The file to check for conflicts.
      *
      * @returns
      * A value indicating whether there is a conflict.
      */
    def _detectConflict(file: ConflicterFile): Boolean
    
    /**
      * Prints the differences of the specified `file` to the console.
      *
      * @param file
      * The file to print the diff for.
      */
    def _printDiff(file: ConflicterFile): Unit
    
    /**
      * Checks whether the specified `file` conflicts with the file saved on the disk.
      *
      * @param file
      * The file to check for conflicts.
      */
    def checkForCollision(file: File): js.Promise[CheckedFile]
    
    /**
      * A value indicating whether conflicts shouldn't be checked.
      */
    var force: Boolean
  }
  object Conflicter {
    
    inline def apply(
      _detectConflict: ConflicterFile => Boolean,
      _printDiff: ConflicterFile => Unit,
      checkForCollision: File => js.Promise[CheckedFile],
      force: Boolean
    ): Conflicter = {
      val __obj = js.Dynamic.literal(_detectConflict = js.Any.fromFunction1(_detectConflict), _printDiff = js.Any.fromFunction1(_printDiff), checkForCollision = js.Any.fromFunction1(checkForCollision), force = force.asInstanceOf[js.Any])
      __obj.asInstanceOf[Conflicter]
    }
    
    extension [Self <: Conflicter](x: Self) {
      
      inline def setCheckForCollision(value: File => js.Promise[CheckedFile]): Self = StObject.set(x, "checkForCollision", js.Any.fromFunction1(value))
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def set_detectConflict(value: ConflicterFile => Boolean): Self = StObject.set(x, "_detectConflict", js.Any.fromFunction1(value))
      
      inline def set_printDiff(value: ConflicterFile => Unit): Self = StObject.set(x, "_printDiff", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Represents a file which can be checked for conflicts.
    */
  /* Inlined std.Pick<vinyl.vinyl.^, 'path' | 'contents'> */
  trait ConflicterFile extends StObject {
    
    var contents: Buffer | ReadableStream[Any] | Null
    
    var path: String
  }
  object ConflicterFile {
    
    inline def apply(path: String): ConflicterFile = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], contents = null)
      __obj.asInstanceOf[ConflicterFile]
    }
    
    extension [Self <: ConflicterFile](x: Self) {
      
      inline def setContents(value: Buffer | ReadableStream[Any]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      inline def setContentsNull: Self = StObject.set(x, "contents", null)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Provides options for creating a conflicter.
    */
  trait ConflicterOptions extends StObject {
    
    /**
      * A value indicating whether the conflicter should stop when the first conflict occurs.
      */
    var bail: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The path to be used as a reference for relative paths.
      */
    var cwd: js.UndefOr[String] = js.undefined
    
    /**
      * A value indicating whether no operations should be executed.
      */
    var dryRun: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A value indicating whether conflicts shouldn't be checked.
      */
    var force: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A value indicating whether whitespace characters should be ignored when checking for changes.
      */
    var ignoreWhitespace: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A value indicating whether identical files should be written to the disk as well.
      */
    var regenerate: js.UndefOr[Boolean] = js.undefined
  }
  object ConflicterOptions {
    
    inline def apply(): ConflicterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConflicterOptions]
    }
    
    extension [Self <: ConflicterOptions](x: Self) {
      
      inline def setBail(value: Boolean): Self = StObject.set(x, "bail", value.asInstanceOf[js.Any])
      
      inline def setBailUndefined: Self = StObject.set(x, "bail", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
      
      inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      inline def setIgnoreWhitespace(value: Boolean): Self = StObject.set(x, "ignoreWhitespace", value.asInstanceOf[js.Any])
      
      inline def setIgnoreWhitespaceUndefined: Self = StObject.set(x, "ignoreWhitespace", js.undefined)
      
      inline def setRegenerate(value: Boolean): Self = StObject.set(x, "regenerate", value.asInstanceOf[js.Any])
      
      inline def setRegenerateUndefined: Self = StObject.set(x, "regenerate", js.undefined)
    }
  }
  
  /**
    * The status of a checked file.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.yeomanEnvironment.yeomanEnvironmentStrings.skip
    - typings.yeomanEnvironment.yeomanEnvironmentStrings.create
    - typings.yeomanEnvironment.yeomanEnvironmentStrings.force
    - typings.yeomanEnvironment.yeomanEnvironmentStrings.identical
  */
  trait Status extends StObject
  object Status {
    
    inline def create: typings.yeomanEnvironment.yeomanEnvironmentStrings.create = "create".asInstanceOf[typings.yeomanEnvironment.yeomanEnvironmentStrings.create]
    
    inline def force: typings.yeomanEnvironment.yeomanEnvironmentStrings.force = "force".asInstanceOf[typings.yeomanEnvironment.yeomanEnvironmentStrings.force]
    
    inline def identical: typings.yeomanEnvironment.yeomanEnvironmentStrings.identical = "identical".asInstanceOf[typings.yeomanEnvironment.yeomanEnvironmentStrings.identical]
    
    inline def skip: typings.yeomanEnvironment.yeomanEnvironmentStrings.skip = "skip".asInstanceOf[typings.yeomanEnvironment.yeomanEnvironmentStrings.skip]
  }
}
