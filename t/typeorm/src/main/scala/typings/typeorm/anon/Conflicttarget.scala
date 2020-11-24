package typings.typeorm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Conflicttarget extends js.Object {
  
  var columns: js.UndefOr[js.Array[String]] = js.native
  
  var conflict_target: js.UndefOr[String | js.Array[String]] = js.native
  
  var overwrite: js.UndefOr[js.Array[String]] = js.native
}
object Conflicttarget {
  
  @scala.inline
  def apply(): Conflicttarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Conflicttarget]
  }
  
  @scala.inline
  implicit class ConflicttargetOps[Self <: Conflicttarget] (val x: Self) extends AnyVal {
    
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
    def setColumnsVarargs(value: String*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[String]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setConflict_targetVarargs(value: String*): Self = this.set("conflict_target", js.Array(value :_*))
    
    @scala.inline
    def setConflict_target(value: String | js.Array[String]): Self = this.set("conflict_target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConflict_target: Self = this.set("conflict_target", js.undefined)
    
    @scala.inline
    def setOverwriteVarargs(value: String*): Self = this.set("overwrite", js.Array(value :_*))
    
    @scala.inline
    def setOverwrite(value: js.Array[String]): Self = this.set("overwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverwrite: Self = this.set("overwrite", js.undefined)
  }
}
