package typings.tern.ternMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenameQueryResult extends js.Object {
  
  /** Array of changes that must be performed to apply the rename. The client is responsible for doing the actual modification. */
  var changes: js.Array[typings.tern.anon.File] = js.native
}
object RenameQueryResult {
  
  @scala.inline
  def apply(changes: js.Array[typings.tern.anon.File]): RenameQueryResult = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameQueryResult]
  }
  
  @scala.inline
  implicit class RenameQueryResultOps[Self <: RenameQueryResult] (val x: Self) extends AnyVal {
    
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
    def setChangesVarargs(value: typings.tern.anon.File*): Self = this.set("changes", js.Array(value :_*))
    
    @scala.inline
    def setChanges(value: js.Array[typings.tern.anon.File]): Self = this.set("changes", value.asInstanceOf[js.Any])
  }
}
