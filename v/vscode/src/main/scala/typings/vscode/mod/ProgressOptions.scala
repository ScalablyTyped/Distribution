package typings.vscode.mod

import typings.vscode.anon.ViewId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressOptions extends js.Object {
  
  /**
    * Controls if a cancel button should show to allow the user to
    * cancel the long running operation.  Note that currently only
    * `ProgressLocation.Notification` is supporting to show a cancel
    * button.
    */
  var cancellable: js.UndefOr[Boolean] = js.native
  
  /**
    * The location at which progress should show.
    */
  var location: ProgressLocation | ViewId = js.native
  
  /**
    * A human-readable string which will be used to describe the
    * operation.
    */
  var title: js.UndefOr[String] = js.native
}
object ProgressOptions {
  
  @scala.inline
  def apply(location: ProgressLocation | ViewId): ProgressOptions = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressOptions]
  }
  
  @scala.inline
  implicit class ProgressOptionsOps[Self <: ProgressOptions] (val x: Self) extends AnyVal {
    
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
    def setLocation(value: ProgressLocation | ViewId): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancellable(value: Boolean): Self = this.set("cancellable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancellable: Self = this.set("cancellable", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
