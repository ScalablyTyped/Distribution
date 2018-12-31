package typings
package vinylLib.vinylMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructorOptions
  extends /**
  * Any custom option properties will be directly assigned to the new Vinyl object.
  */
/* customOption */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * Used for relative pathing. Typically where a glob starts. Default: options.cwd
    */
  var base: js.UndefOr[java.lang.String] = js.undefined
  /**
    * File contents.
    * Type: `Buffer`, `Stream`, or null
    * Default: null
    */
  var contents: js.UndefOr[nodeLib.Buffer | nodeLib.NodeJSNs.ReadableStream | scala.Null] = js.undefined
  /**
    * The current working directory of the file. Default: process.cwd()
    */
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Stores the path history. If `options.path` and `options.history` are both passed,
    * `options.path` is appended to `options.history`. All `options.history` paths are
    * normalized by the `file.path` setter.
    * Default: `[]` (or `[options.path]` if `options.path` is passed)
    */
  var history: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Full path to the file.
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The result of an fs.stat call. This is how you mark the file as a directory or
    * symbolic link. See `isDirectory()`, `isSymbolic()` and `fs.Stats` for more information.
    * http://nodejs.org/api/fs.html#fs_class_fs_stats
    */
  var stat: js.UndefOr[nodeLib.fsMod.Stats] = js.undefined
}

