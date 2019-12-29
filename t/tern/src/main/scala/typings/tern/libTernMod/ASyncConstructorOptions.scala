package typings.tern.libTernMod

import typings.std.Error
import typings.tern.ternBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASyncConstructorOptions extends js.Object {
  /** Indicates whether `getFile` is asynchronous. Default is `false`. */
  var async: `true`
  /**
    * Provides a way for the server to try and fetch the content of files.
    * Depending on the `async` option, this is either a function that takes a filename and returns a string (when not `async`), or
    * a function that takes a `filename` and a `callback`, and calls the callback with an optional `error` as the first argument,
    * and the `content` string (if no error) as the second.
    */
  var getFile: js.UndefOr[
    js.Function2[
      /* filename */ String, 
      /* callback */ js.Function2[/* error */ js.UndefOr[Error], /* content */ js.UndefOr[String], Unit], 
      Unit
    ]
  ] = js.undefined
}

object ASyncConstructorOptions {
  @scala.inline
  def apply(
    async: `true`,
    getFile: (/* filename */ String, /* callback */ js.Function2[/* error */ js.UndefOr[Error], /* content */ js.UndefOr[String], Unit]) => Unit = null
  ): ASyncConstructorOptions = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any])
    if (getFile != null) __obj.updateDynamic("getFile")(js.Any.fromFunction2(getFile))
    __obj.asInstanceOf[ASyncConstructorOptions]
  }
}

