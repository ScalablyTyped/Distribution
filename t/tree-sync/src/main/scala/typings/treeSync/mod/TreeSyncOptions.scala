package typings.treeSync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeSyncOptions extends js.Object {
  
  /**
    * An array of globs. Only files and directories that match at least one of the provided globs
    * will be returned.
    * If using this option, it's important to ensure that you've included parent directories of files
    * you add, otherwise you might run into an ENOENT error!
    */
  var globs: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * An array of globs. Files and directories that match at least one of the provided globs will be
    * pruned while searching.
    */
  var ignore: js.UndefOr[js.Array[String]] = js.native
}
object TreeSyncOptions {
  
  @scala.inline
  def apply(): TreeSyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeSyncOptions]
  }
  
  @scala.inline
  implicit class TreeSyncOptionsOps[Self <: TreeSyncOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGlobsVarargs(value: String*): Self = this.set("globs", js.Array(value :_*))
    
    @scala.inline
    def setGlobs(value: js.Array[String]): Self = this.set("globs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobs: Self = this.set("globs", js.undefined)
    
    @scala.inline
    def setIgnoreVarargs(value: String*): Self = this.set("ignore", js.Array(value :_*))
    
    @scala.inline
    def setIgnore(value: js.Array[String]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
  }
}
