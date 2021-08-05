package typings.treeSync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tree-sync", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with TreeSync {
    /**
      * Initializes a new TreeSync instance. This instance is used to keep an output directory in sync with its
      * input directory. When using the same instance to keep two directories in sync over multiple sync operations,
      * TreeSync will figure out the differences between the two folders and only sync those changes specifically,
      * which in many cases will improve performance.
      *
      * @param inputPath    The originating path to sync contents from.
      * @param outputPath   The resulting path to sync contents to.
      * @param treeSyncOpts Options on how to run tree-sync. Use this to selectively choose or ignore directories
      *                     to sync.
      */
    def this(inputPath: String, outputPath: String) = this()
    def this(inputPath: String, outputPath: String, treeSyncOpts: TreeSyncOptions) = this()
    
    /**
      * Syncs the input directory to the output directory. File I/O is done synchronously.
      */
    /* CompleteClass */
    override def sync(): js.Array[TreeSyncResult] = js.native
  }
  
  trait TreeSync extends StObject {
    
    /**
      * Syncs the input directory to the output directory. File I/O is done synchronously.
      */
    def sync(): js.Array[TreeSyncResult]
  }
  object TreeSync {
    
    inline def apply(sync: () => js.Array[TreeSyncResult]): TreeSync = {
      val __obj = js.Dynamic.literal(sync = js.Any.fromFunction0(sync))
      __obj.asInstanceOf[TreeSync]
    }
    
    extension [Self <: TreeSync](x: Self) {
      
      inline def setSync(value: () => js.Array[TreeSyncResult]): Self = StObject.set(x, "sync", js.Any.fromFunction0(value))
    }
  }
  
  trait TreeSyncOptions extends StObject {
    
    /**
      * An array of globs. Only files and directories that match at least one of the provided globs
      * will be returned.
      * If using this option, it's important to ensure that you've included parent directories of files
      * you add, otherwise you might run into an ENOENT error!
      */
    var globs: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * An array of globs. Files and directories that match at least one of the provided globs will be
      * pruned while searching.
      */
    var ignore: js.UndefOr[js.Array[String]] = js.undefined
  }
  object TreeSyncOptions {
    
    inline def apply(): TreeSyncOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeSyncOptions]
    }
    
    extension [Self <: TreeSyncOptions](x: Self) {
      
      inline def setGlobs(value: js.Array[String]): Self = StObject.set(x, "globs", value.asInstanceOf[js.Any])
      
      inline def setGlobsUndefined: Self = StObject.set(x, "globs", js.undefined)
      
      inline def setGlobsVarargs(value: String*): Self = StObject.set(x, "globs", js.Array(value :_*))
      
      inline def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value :_*))
    }
  }
  
  type TreeSyncResult = js.Tuple2[String, String]
}
