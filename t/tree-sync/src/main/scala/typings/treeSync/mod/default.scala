package typings.treeSync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tree-sync", JSImport.Default)
@js.native
class default protected () extends TreeSync {
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
}
