package typings.tsLoader.anon

import typings.typescript.mod.ResolvedProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputFileName extends js.Object {
  
  var outputFileName: js.UndefOr[String] = js.native
  
  /**
    * Undefined here means we’ve already checked and confirmed there is no
    * project reference for the file. Don’t bother checking again.
    */
  var project: js.UndefOr[ResolvedProjectReference] = js.native
}
object OutputFileName {
  
  @scala.inline
  def apply(): OutputFileName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputFileName]
  }
  
  @scala.inline
  implicit class OutputFileNameOps[Self <: OutputFileName] (val x: Self) extends AnyVal {
    
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
    def setOutputFileName(value: String): Self = this.set("outputFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputFileName: Self = this.set("outputFileName", js.undefined)
    
    @scala.inline
    def setProject(value: ResolvedProjectReference): Self = this.set("project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProject: Self = this.set("project", js.undefined)
  }
}
