package typings.vscode.anon

import typings.vscode.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Inserting extends js.Object {
  
  var inserting: Range = js.native
  
  var replacing: Range = js.native
}
object Inserting {
  
  @scala.inline
  def apply(inserting: Range, replacing: Range): Inserting = {
    val __obj = js.Dynamic.literal(inserting = inserting.asInstanceOf[js.Any], replacing = replacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inserting]
  }
  
  @scala.inline
  implicit class InsertingOps[Self <: Inserting] (val x: Self) extends AnyVal {
    
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
    def setInserting(value: Range): Self = this.set("inserting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacing(value: Range): Self = this.set("replacing", value.asInstanceOf[js.Any])
  }
}
