package typings.tsLoader.interfacesMod

import typings.tsLoader.anon.OutputFileName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSFile extends js.Object {
  
  var projectReference: js.UndefOr[OutputFileName] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var version: Double = js.native
}
object TSFile {
  
  @scala.inline
  def apply(version: Double): TSFile = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSFile]
  }
  
  @scala.inline
  implicit class TSFileOps[Self <: TSFile] (val x: Self) extends AnyVal {
    
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
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectReference(value: OutputFileName): Self = this.set("projectReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectReference: Self = this.set("projectReference", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
