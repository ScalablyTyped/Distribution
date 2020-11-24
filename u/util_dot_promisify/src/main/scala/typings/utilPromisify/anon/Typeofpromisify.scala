package typings.utilPromisify.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofpromisify extends js.Object {
  
  /**
    * @deprecated
    * Not exposed by native `util.promisify` or supported by browserify's `util.promisify`.
    *
    * Use `util.promisify.custom` instead.
    */
  val customPromisifyArgs: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof polyfill.customPromisifyArgs */ js.Any
  ] = js.native
}
object Typeofpromisify {
  
  @scala.inline
  def apply(): Typeofpromisify = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Typeofpromisify]
  }
  
  @scala.inline
  implicit class TypeofpromisifyOps[Self <: Typeofpromisify] (val x: Self) extends AnyVal {
    
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
    def setCustomPromisifyArgs(
      value: /* import warning: importer.ImportType#apply Failed type conversion: typeof polyfill.customPromisifyArgs */ js.Any
    ): Self = this.set("customPromisifyArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomPromisifyArgs: Self = this.set("customPromisifyArgs", js.undefined)
  }
}
