package typings.vueComponentCompilerUtils.compileStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncStyleCompileOptions extends StyleCompileOptions {
  
  var isAsync: js.UndefOr[Boolean] = js.native
}
object AsyncStyleCompileOptions {
  
  @scala.inline
  def apply(filename: String, id: String, source: String): AsyncStyleCompileOptions = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncStyleCompileOptions]
  }
  
  @scala.inline
  implicit class AsyncStyleCompileOptionsOps[Self <: AsyncStyleCompileOptions] (val x: Self) extends AnyVal {
    
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
    def setIsAsync(value: Boolean): Self = this.set("isAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAsync: Self = this.set("isAsync", js.undefined)
  }
}
