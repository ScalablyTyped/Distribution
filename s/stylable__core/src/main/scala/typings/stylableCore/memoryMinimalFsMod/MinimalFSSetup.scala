package typings.stylableCore.memoryMinimalFsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MinimalFSSetup extends js.Object {
  
  var files: StringDictionary[File] = js.native
  
  var trimWS: js.UndefOr[Boolean] = js.native
}
object MinimalFSSetup {
  
  @scala.inline
  def apply(files: StringDictionary[File]): MinimalFSSetup = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinimalFSSetup]
  }
  
  @scala.inline
  implicit class MinimalFSSetupOps[Self <: MinimalFSSetup] (val x: Self) extends AnyVal {
    
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
    def setFiles(value: StringDictionary[File]): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrimWS(value: Boolean): Self = this.set("trimWS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrimWS: Self = this.set("trimWS", js.undefined)
  }
}
