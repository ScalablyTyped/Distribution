package typings.swaggerSchemaOfficial.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Path extends js.Object {
  
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.native
  
  var delete: js.UndefOr[Operation] = js.native
  
  var get: js.UndefOr[Operation] = js.native
  
  var head: js.UndefOr[Operation] = js.native
  
  var options: js.UndefOr[Operation] = js.native
  
  var parameters: js.UndefOr[js.Array[Parameter | Reference]] = js.native
  
  var patch: js.UndefOr[Operation] = js.native
  
  var post: js.UndefOr[Operation] = js.native
  
  var put: js.UndefOr[Operation] = js.native
}
object Path {
  
  @scala.inline
  def apply(): Path = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Path]
  }
  
  @scala.inline
  implicit class PathOps[Self <: Path] (val x: Self) extends AnyVal {
    
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
    def set$ref(value: String): Self = this.set("$ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$ref: Self = this.set("$ref", js.undefined)
    
    @scala.inline
    def setDelete(value: Operation): Self = this.set("delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelete: Self = this.set("delete", js.undefined)
    
    @scala.inline
    def setGet(value: Operation): Self = this.set("get", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGet: Self = this.set("get", js.undefined)
    
    @scala.inline
    def setHead(value: Operation): Self = this.set("head", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHead: Self = this.set("head", js.undefined)
    
    @scala.inline
    def setOptions(value: Operation): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: (Parameter | Reference)*): Self = this.set("parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: js.Array[Parameter | Reference]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setPatch(value: Operation): Self = this.set("patch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatch: Self = this.set("patch", js.undefined)
    
    @scala.inline
    def setPost(value: Operation): Self = this.set("post", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePost: Self = this.set("post", js.undefined)
    
    @scala.inline
    def setPut(value: Operation): Self = this.set("put", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePut: Self = this.set("put", js.undefined)
  }
}
