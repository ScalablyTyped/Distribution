package typings.tsconfigPaths.tsconfigLoaderMod

import typings.tsconfigPaths.anon.BaseUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tsconfig extends js.Object {
  
  var compilerOptions: js.UndefOr[BaseUrl] = js.native
  
  var `extends`: js.UndefOr[String] = js.native
}
object Tsconfig {
  
  @scala.inline
  def apply(): Tsconfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tsconfig]
  }
  
  @scala.inline
  implicit class TsconfigOps[Self <: Tsconfig] (val x: Self) extends AnyVal {
    
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
    def setCompilerOptions(value: BaseUrl): Self = this.set("compilerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompilerOptions: Self = this.set("compilerOptions", js.undefined)
    
    @scala.inline
    def setExtends(value: String): Self = this.set("extends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtends: Self = this.set("extends", js.undefined)
  }
}
