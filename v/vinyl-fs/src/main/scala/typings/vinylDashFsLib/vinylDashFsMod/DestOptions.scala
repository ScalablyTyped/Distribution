package typings
package vinylDashFsLib.vinylDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DestOptions extends js.Object {
  /**
      * Specify the working directory the folder is relative to
      * Default is process.cwd()
      */
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  /** Specify the mode the directory should be created with. Default is the process mode */
  var dirMode: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
      * Specify the mode the files should be created with
      * Default is the mode of the input file (file.stat.mode)
      * or the process mode if the input file has no mode property
      */
  var mode: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** Specify if existing files with the same path should be overwritten or not. Default is true, to always overwrite existing files */
  var overwrite: js.UndefOr[scala.Boolean] = js.undefined
  /**
      * When creating a symlink, whether or not the created symlink should be relative. If false,
      * the symlink will be absolute. Note: This option will be ignored if a junction is being created.
      */
  var relativeSymlinks: js.UndefOr[scala.Boolean] = js.undefined
  /**
      * Enables sourcemap support on files passed through the stream. Will write inline soucemaps if
      * specified as true. Specifying a string path will write external sourcemaps at the given path.
      */
  var sourcemaps: js.UndefOr[vinylDashFsLib.vinylDashFsLibNumbers.`true` | java.lang.String] = js.undefined
  /* When creating a symlink, whether or not a directory symlink should be created as a junction. */
  var useJunctions: js.UndefOr[scala.Boolean] = js.undefined
}

