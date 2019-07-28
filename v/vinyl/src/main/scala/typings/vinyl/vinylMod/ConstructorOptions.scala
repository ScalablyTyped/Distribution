package typings.vinyl.vinylMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.NodeJSNs.ReadableStream
import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructorOptions
  extends /**
  * Any custom option properties will be directly assigned to the new Vinyl object.
  */
/* customOption */ StringDictionary[js.Any] {
  /**
    * Used for relative pathing. Typically where a glob starts. Default: options.cwd
    */
  var base: js.UndefOr[String] = js.undefined
  /**
    * File contents.
    * Type: `Buffer`, `Stream`, or null
    * Default: null
    */
  var contents: js.UndefOr[Buffer | ReadableStream | Null] = js.undefined
  /**
    * The current working directory of the file. Default: process.cwd()
    */
  var cwd: js.UndefOr[String] = js.undefined
  /**
    * Stores the path history. If `options.path` and `options.history` are both passed,
    * `options.path` is appended to `options.history`. All `options.history` paths are
    * normalized by the `file.path` setter.
    * Default: `[]` (or `[options.path]` if `options.path` is passed)
    */
  var history: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Full path to the file.
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * The result of an fs.stat call. This is how you mark the file as a directory or
    * symbolic link. See `isDirectory()`, `isSymbolic()` and `fs.Stats` for more information.
    * http://nodejs.org/api/fs.html#fs_class_fs_stats
    */
  var stat: js.UndefOr[Stats] = js.undefined
}

object ConstructorOptions {
  @scala.inline
  def apply(
    StringDictionary: /**
    * Any custom option properties will be directly assigned to the new Vinyl object.
    */
  /* customOption */ StringDictionary[js.Any] = null,
    base: String = null,
    contents: Buffer | ReadableStream = null,
    cwd: String = null,
    history: js.Array[String] = null,
    path: String = null,
    stat: Stats = null
  ): ConstructorOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (base != null) __obj.updateDynamic("base")(base)
    if (contents != null) __obj.updateDynamic("contents")(contents.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (history != null) __obj.updateDynamic("history")(history)
    if (path != null) __obj.updateDynamic("path")(path)
    if (stat != null) __obj.updateDynamic("stat")(stat)
    __obj.asInstanceOf[ConstructorOptions]
  }
}

