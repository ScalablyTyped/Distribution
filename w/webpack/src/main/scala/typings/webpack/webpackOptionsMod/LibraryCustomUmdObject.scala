package typings.webpack.webpackOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LibraryCustomUmdObject extends js.Object {
  
  /**
  	 * Name of the exposed AMD library in the UMD
  	 */
  var amd: js.UndefOr[String] = js.native
  
  /**
  	 * Name of the exposed commonjs export in the UMD
  	 */
  var commonjs: js.UndefOr[String] = js.native
  
  /**
  	 * Name of the property exposed globally by a UMD library
  	 */
  var root: js.UndefOr[String | ArrayOfStringValues] = js.native
}
object LibraryCustomUmdObject {
  
  @scala.inline
  def apply(): LibraryCustomUmdObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LibraryCustomUmdObject]
  }
  
  @scala.inline
  implicit class LibraryCustomUmdObjectOps[Self <: LibraryCustomUmdObject] (val x: Self) extends AnyVal {
    
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
    def setAmd(value: String): Self = this.set("amd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmd: Self = this.set("amd", js.undefined)
    
    @scala.inline
    def setCommonjs(value: String): Self = this.set("commonjs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommonjs: Self = this.set("commonjs", js.undefined)
    
    @scala.inline
    def setRootVarargs(value: String*): Self = this.set("root", js.Array(value :_*))
    
    @scala.inline
    def setRoot(value: String | ArrayOfStringValues): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
}
