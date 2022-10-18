package typings.tern.libTernMod

import typings.tern.ternBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASyncConstructorOptions extends StObject {
  
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
      /* callback */ js.Function2[/* error */ js.UndefOr[js.Error], /* content */ js.UndefOr[String], Unit], 
      Unit
    ]
  ] = js.undefined
}
object ASyncConstructorOptions {
  
  inline def apply(): ASyncConstructorOptions = {
    val __obj = js.Dynamic.literal(async = true)
    __obj.asInstanceOf[ASyncConstructorOptions]
  }
  
  extension [Self <: ASyncConstructorOptions](x: Self) {
    
    inline def setAsync(value: `true`): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setGetFile(
      value: (/* filename */ String, /* callback */ js.Function2[/* error */ js.UndefOr[js.Error], /* content */ js.UndefOr[String], Unit]) => Unit
    ): Self = StObject.set(x, "getFile", js.Any.fromFunction2(value))
    
    inline def setGetFileUndefined: Self = StObject.set(x, "getFile", js.undefined)
  }
}
