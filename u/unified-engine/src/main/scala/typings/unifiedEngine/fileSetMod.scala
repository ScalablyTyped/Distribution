package typings.unifiedEngine

import typings.node.eventsMod.EventEmitter
import typings.unifiedEngine.anon.PluginId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileSetMod {
  
  @JSImport("unified-engine/lib/file-set", "FileSet")
  @js.native
  /**
    * FileSet constructor.
    * A FileSet is created to process multiple files through unified processors.
    * This set, containing all files, is exposed to plugins as an argument to the
    * attacher.
    */
  open class FileSet () extends EventEmitter {
    
    /** @type {number} */
    var actual: Double = js.native
    
    /**
      * Add a file to be processed.
      * The given file is processed like other files with a few differences:
      *
      * *   Ignored when their file path is already added
      * *   Never written to the file system or streamOut
      * *   Not reported for
      *
      * @param {string|VFile} file
      */
    def add(file: String): FileSet = js.native
    def add(file: VFile): FileSet = js.native
    
    /** @type {number} */
    var expected: Double = js.native
    
    /** @type {Array<VFile>} */
    var files: js.Array[VFile] = js.native
    
    /** @type {Array<string>} */
    var origins: js.Array[String] = js.native
    
    /** @type {Pipeline} */
    var pipeline: Pipeline = js.native
    
    /** @type {Array<Completer>} */
    var plugins: js.Array[Completer] = js.native
    
    /**
      * Attach middleware to the pipeline on `fileSet`.
      *
      * @param {Completer} plugin
      */
    def use(plugin: Completer): FileSet = js.native
  }
  
  type Completer = (CompleterCallback & PluginId) | (CompleterAsync & PluginId) | (CompleterSync & PluginId)
  
  type CompleterAsync = js.Function1[/* set */ FileSet, js.Promise[Unit]]
  
  type CompleterCallback = js.Function2[
    /* set */ FileSet, 
    /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
    Unit
  ]
  
  type CompleterSync = js.Function1[/* set */ FileSet, Unit]
  
  type Pipeline = typings.trough.mod.Pipeline
  
  type VFile = typings.vfile.mod.VFile
}
