package typings.vinyl.anon

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined vinyl.vinyl.ConstructorOptions & {  contents  :null} */
trait ConstructorOptionscontent
  extends /* customProperty */ StringDictionary[js.Any] {
  /**
    * Used for relative pathing. Typically where a glob starts. Default: options.cwd
    */
  var base: js.UndefOr[String] = js.undefined
  /**
    * File contents.
    * Type: `Buffer`, `Stream`, or null
    * Default: null
    */
  var contents: js.UndefOr[(Buffer | ReadableStream | Null) with Null] = js.undefined
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

object ConstructorOptionscontent {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    base: String = null,
    contents: (Buffer | ReadableStream | Null) with Null = null,
    cwd: String = null,
    history: js.Array[String] = null,
    path: String = null,
    stat: Stats = null
  ): ConstructorOptionscontent = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (contents != null) __obj.updateDynamic("contents")(contents.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (stat != null) __obj.updateDynamic("stat")(stat.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructorOptionscontent]
  }
}

