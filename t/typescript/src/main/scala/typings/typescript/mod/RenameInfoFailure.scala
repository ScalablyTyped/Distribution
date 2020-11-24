package typings.typescript.mod

import typings.typescript.typescriptBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenameInfoFailure extends RenameInfo {
  
  var canRename: `false` = js.native
  
  var localizedErrorMessage: java.lang.String = js.native
}
object RenameInfoFailure {
  
  @scala.inline
  def apply(canRename: `false`, localizedErrorMessage: java.lang.String): RenameInfoFailure = {
    val __obj = js.Dynamic.literal(canRename = canRename.asInstanceOf[js.Any], localizedErrorMessage = localizedErrorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameInfoFailure]
  }
  
  @scala.inline
  implicit class RenameInfoFailureOps[Self <: RenameInfoFailure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCanRename(value: `false`): Self = this.set("canRename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalizedErrorMessage(value: java.lang.String): Self = this.set("localizedErrorMessage", value.asInstanceOf[js.Any])
  }
}
