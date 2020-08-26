package typings.vinylFs.mod

import typings.globStream.mod.Options
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SrcOptions extends Options {
  /**
    * Setting this to false will make file.contents a paused stream
    * If true it will buffer the file contents
    * Default: true
    */
  var buffer: js.UndefOr[Boolean] = js.native
  /**
    * The mode the directory should be created with.
    * Default: the process mode
    */
  var dirMode: js.UndefOr[Double] = js.native
  /**
    * Whether or not to recursively resolve symlinks to their targets.
    * Setting to `false` to preserve them as symlinks and make `file.symlink`
    * equal the original symlink's target path.
    * Default: true
    */
  var followSymlinks: js.UndefOr[Boolean] = js.native
  /**
    * Setting this to true will create a duplex stream, one that passes
    * through items and emits globbed files.
    * Default: false
    */
  var passthrough: js.UndefOr[Boolean] = js.native
  /**
    * Setting this to false will ignore the contents of the file and disable
    * writing to disk to speed up operations
    * Default: true
    */
  var read: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not the symlink should be relative or absolute.
    * Default: false
    */
  var relative: js.UndefOr[Boolean] = js.native
  /**
    * Causes the BOM to be removed on UTF-8 encoded files. Set to false if you need the BOM for some reason.
    * Default: true
    */
  var removeBOM: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not to recursively resolve symlinks to their targets. Setting to false to
    * preserve them as symlinks and make file.symlink equal the original symlink's target path.
    * Default: false
    */
  var resolveSymlinks: js.UndefOr[Boolean] = js.native
  /** Only find files that have been modified since the time specified */
  var since: js.UndefOr[Date | Double] = js.native
  /**
    * Setting this to true will enable sourcemaps.
    * Default: false
    */
  var sourcemaps: js.UndefOr[Boolean] = js.native
  /**
    * Causes the BOM to be stripped on UTF-8 encoded files. Set to `false`
    * if you need the BOM for some reason.
    */
  var stripBOM: js.UndefOr[Boolean] = js.native
}

object SrcOptions {
  @scala.inline
  def apply(): SrcOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SrcOptions]
  }
  @scala.inline
  implicit class SrcOptionsOps[Self <: SrcOptions] (val x: Self) extends AnyVal {
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
    def setBuffer(value: Boolean): Self = this.set("buffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuffer: Self = this.set("buffer", js.undefined)
    @scala.inline
    def setDirMode(value: Double): Self = this.set("dirMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirMode: Self = this.set("dirMode", js.undefined)
    @scala.inline
    def setFollowSymlinks(value: Boolean): Self = this.set("followSymlinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollowSymlinks: Self = this.set("followSymlinks", js.undefined)
    @scala.inline
    def setPassthrough(value: Boolean): Self = this.set("passthrough", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassthrough: Self = this.set("passthrough", js.undefined)
    @scala.inline
    def setRead(value: Boolean): Self = this.set("read", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
    @scala.inline
    def setRelative(value: Boolean): Self = this.set("relative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelative: Self = this.set("relative", js.undefined)
    @scala.inline
    def setRemoveBOM(value: Boolean): Self = this.set("removeBOM", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveBOM: Self = this.set("removeBOM", js.undefined)
    @scala.inline
    def setResolveSymlinks(value: Boolean): Self = this.set("resolveSymlinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolveSymlinks: Self = this.set("resolveSymlinks", js.undefined)
    @scala.inline
    def setSince(value: Date | Double): Self = this.set("since", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSince: Self = this.set("since", js.undefined)
    @scala.inline
    def setSourcemaps(value: Boolean): Self = this.set("sourcemaps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourcemaps: Self = this.set("sourcemaps", js.undefined)
    @scala.inline
    def setStripBOM(value: Boolean): Self = this.set("stripBOM", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripBOM: Self = this.set("stripBOM", js.undefined)
  }
  
}

