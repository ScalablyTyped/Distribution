package typings.tar.anon

import typings.tar.mod.FileStat
import typings.tar.tarBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined tar.tar.ListOptions & tar.tar.FileOptions & {  sync  :true} */
trait ListOptionsFileOptionssyn extends js.Object {
  /**
    * Alias for cwd.
    */
  var C: js.UndefOr[String] = js.undefined
  /**
    * Extract files relative to the specified directory. Defaults to
    * process.cwd(). If provided, this must exist and must be a directory.
    */
  var cwd: js.UndefOr[String] = js.undefined
  /**
    * Alias for file.
    */
  var f: js.UndefOr[String] = js.undefined
  /**
    * Uses the given file as the input or output of this function.
    */
  var file: js.UndefOr[String] = js.undefined
  /**
    * A function that gets called with (path, stat) for each entry being
    * added. Return true to emit the entry from the archive, or false to skip it.
    */
  var filter: js.UndefOr[js.Function2[/* path */ String, /* entry */ FileStat, Boolean]] = js.undefined
  /**
    * The maximum buffer size for fs.read() operations. Defaults to 16 MB.
    */
  var maxReadSize: js.UndefOr[Double] = js.undefined
  /**
    * By default, entry streams are resumed immediately after the call to
    * onentry. Set noResume: true to suppress this behavior. Note that by
    * opting into this, the stream will never complete until the entry
    * data is consumed.
    */
  var noResume: js.UndefOr[Boolean] = js.undefined
  /**
    * A function that gets called with (entry) for each entry that passes the
    * filter. This is important for when both file and sync are set, because
    * it will be called synchronously.
    */
  var onentry: js.UndefOr[js.Function1[/* entry */ FileStat, Unit]] = js.undefined
  /**
    * Treat warnings as crash-worthy errors. Default false.
    */
  var strict: js.UndefOr[Boolean] = js.undefined
  var sync: `true`
}

object ListOptionsFileOptionssyn {
  @scala.inline
  def apply(
    sync: `true`,
    C: String = null,
    cwd: String = null,
    f: String = null,
    file: String = null,
    filter: (/* path */ String, /* entry */ FileStat) => Boolean = null,
    maxReadSize: js.UndefOr[Double] = js.undefined,
    noResume: js.UndefOr[Boolean] = js.undefined,
    onentry: /* entry */ FileStat => Unit = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): ListOptionsFileOptionssyn = {
    val __obj = js.Dynamic.literal(sync = sync.asInstanceOf[js.Any])
    if (C != null) __obj.updateDynamic("C")(C.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (f != null) __obj.updateDynamic("f")(f.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction2(filter))
    if (!js.isUndefined(maxReadSize)) __obj.updateDynamic("maxReadSize")(maxReadSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noResume)) __obj.updateDynamic("noResume")(noResume.get.asInstanceOf[js.Any])
    if (onentry != null) __obj.updateDynamic("onentry")(js.Any.fromFunction1(onentry))
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOptionsFileOptionssyn]
  }
}

