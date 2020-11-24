package typings.wxServerSdk.anon

import typings.node.Buffer
import typings.node.fsMod.ReadStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudPath extends js.Object {
  
  var cloudPath: String = js.native
  
  var fileContent: Buffer | ReadStream = js.native
}
object CloudPath {
  
  @scala.inline
  def apply(cloudPath: String, fileContent: Buffer | ReadStream): CloudPath = {
    val __obj = js.Dynamic.literal(cloudPath = cloudPath.asInstanceOf[js.Any], fileContent = fileContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudPath]
  }
  
  @scala.inline
  implicit class CloudPathOps[Self <: CloudPath] (val x: Self) extends AnyVal {
    
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
    def setCloudPath(value: String): Self = this.set("cloudPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileContent(value: Buffer | ReadStream): Self = this.set("fileContent", value.asInstanceOf[js.Any])
  }
}
