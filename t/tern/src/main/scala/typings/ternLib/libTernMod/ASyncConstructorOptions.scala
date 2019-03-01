package typings
package ternLib.libTernMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASyncConstructorOptions extends js.Object {
  /** Indicates whether `getFile` is asynchronous. Default is `false`. */
  var async: ternLib.ternLibNumbers.`true`
  /**
    * Provides a way for the server to try and fetch the content of files.
    * Depending on the `async` option, this is either a function that takes a filename and returns a string (when not `async`), or
    * a function that takes a `filename` and a `callback`, and calls the callback with an optional `error` as the first argument,
    * and the `content` string (if no error) as the second.
    */
  var getFile: js.UndefOr[
    js.Function2[
      /* filename */ java.lang.String, 
      /* callback */ js.Function2[
        /* error */ js.UndefOr[stdLib.Error], 
        /* content */ js.UndefOr[java.lang.String], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ] = js.undefined
}

object ASyncConstructorOptions {
  @scala.inline
  def apply(
    async: ternLib.ternLibNumbers.`true`,
    getFile: js.Function2[
      /* filename */ java.lang.String, 
      /* callback */ js.Function2[
        /* error */ js.UndefOr[stdLib.Error], 
        /* content */ js.UndefOr[java.lang.String], 
        scala.Unit
      ], 
      scala.Unit
    ] = null
  ): ASyncConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("async")(async)
    if (getFile != null) __obj.updateDynamic("getFile")(getFile)
    __obj.asInstanceOf[ASyncConstructorOptions]
  }
}

