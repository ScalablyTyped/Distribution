package typings.tern.ternMod

import typings.tern.ternBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyncConstructorOptions extends js.Object {
  
  /** Indicates whether `getFile` is asynchronous. Default is `false`. */
  var async: js.UndefOr[`false`] = js.native
  
  /**
    * Provides a way for the server to try and fetch the content of files.
    * Depending on the `async` option, this is either a function that takes a filename and returns a string (when not `async`), or
    * a function that takes a `filename` and a `callback`, and calls the callback with an optional `error` as the first argument,
    * and the `content` string (if no error) as the second.
    */
  var getFile: js.UndefOr[js.Function1[/* filename */ String, String]] = js.native
}
object SyncConstructorOptions {
  
  @scala.inline
  def apply(): SyncConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncConstructorOptions]
  }
  
  @scala.inline
  implicit class SyncConstructorOptionsOps[Self <: SyncConstructorOptions] (val x: Self) extends AnyVal {
    
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
    def setAsync(value: `false`): Self = this.set("async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    
    @scala.inline
    def setGetFile(value: /* filename */ String => String): Self = this.set("getFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetFile: Self = this.set("getFile", js.undefined)
  }
}
