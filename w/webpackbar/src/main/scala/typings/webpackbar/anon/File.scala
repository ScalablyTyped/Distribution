package typings.webpackbar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait File extends js.Object {
  
  val file: Null | String = js.native
  
  val loaders: js.Array[String] = js.native
}
object File {
  
  @scala.inline
  def apply(loaders: js.Array[String]): File = {
    val __obj = js.Dynamic.literal(loaders = loaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  
  @scala.inline
  implicit class FileOps[Self <: File] (val x: Self) extends AnyVal {
    
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
    def setLoadersVarargs(value: String*): Self = this.set("loaders", js.Array(value :_*))
    
    @scala.inline
    def setLoaders(value: js.Array[String]): Self = this.set("loaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNull: Self = this.set("file", null)
  }
}
