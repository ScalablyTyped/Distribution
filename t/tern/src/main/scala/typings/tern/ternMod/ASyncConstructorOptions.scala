package typings.tern.ternMod

import typings.std.Error
import typings.tern.ternBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ASyncConstructorOptions extends StObject {
  
  /** Indicates whether `getFile` is asynchronous. Default is `false`. */
  var async: `true` = js.native
  
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
  ] = js.native
}
object ASyncConstructorOptions {
  
  @scala.inline
  def apply(async: `true`): ASyncConstructorOptions = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASyncConstructorOptions]
  }
  
  @scala.inline
  implicit class ASyncConstructorOptionsMutableBuilder[Self <: ASyncConstructorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsync(value: `true`): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFile(
      value: (/* filename */ String, /* callback */ js.Function2[/* error */ js.UndefOr[Error], /* content */ js.UndefOr[String], Unit]) => Unit
    ): Self = StObject.set(x, "getFile", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetFileUndefined: Self = StObject.set(x, "getFile", js.undefined)
  }
}
