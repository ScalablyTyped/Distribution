package typings.vinylFs.mod

import typings.vinylFs.vinylFsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DestOptions extends js.Object {
  
  /**
    * Specify the working directory the folder is relative to
    * Default is process.cwd()
    */
  var cwd: js.UndefOr[String] = js.native
  
  /** Specify the mode the directory should be created with. Default is the process mode */
  var dirMode: js.UndefOr[Double | String] = js.native
  
  /**
    * Specify the mode the files should be created with
    * Default is the mode of the input file (file.stat.mode)
    * or the process mode if the input file has no mode property
    */
  var mode: js.UndefOr[Double | String] = js.native
  
  /** Specify if existing files with the same path should be overwritten or not. Default is true, to always overwrite existing files */
  var overwrite: js.UndefOr[Boolean] = js.native
  
  /**
    * When creating a symlink, whether or not the created symlink should be relative. If false,
    * the symlink will be absolute. Note: This option will be ignored if a junction is being created.
    */
  var relativeSymlinks: js.UndefOr[Boolean] = js.native
  
  /**
    * Enables sourcemap support on files passed through the stream. Will write inline soucemaps if
    * specified as true. Specifying a string path will write external sourcemaps at the given path.
    */
  var sourcemaps: js.UndefOr[`true` | String] = js.native
  
  /* When creating a symlink, whether or not a directory symlink should be created as a junction. */
  var useJunctions: js.UndefOr[Boolean] = js.native
}
object DestOptions {
  
  @scala.inline
  def apply(): DestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestOptions]
  }
  
  @scala.inline
  implicit class DestOptionsOps[Self <: DestOptions] (val x: Self) extends AnyVal {
    
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
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    
    @scala.inline
    def setDirMode(value: Double | String): Self = this.set("dirMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirMode: Self = this.set("dirMode", js.undefined)
    
    @scala.inline
    def setMode(value: Double | String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setOverwrite(value: Boolean): Self = this.set("overwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverwrite: Self = this.set("overwrite", js.undefined)
    
    @scala.inline
    def setRelativeSymlinks(value: Boolean): Self = this.set("relativeSymlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelativeSymlinks: Self = this.set("relativeSymlinks", js.undefined)
    
    @scala.inline
    def setSourcemaps(value: `true` | String): Self = this.set("sourcemaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourcemaps: Self = this.set("sourcemaps", js.undefined)
    
    @scala.inline
    def setUseJunctions(value: Boolean): Self = this.set("useJunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseJunctions: Self = this.set("useJunctions", js.undefined)
  }
}
