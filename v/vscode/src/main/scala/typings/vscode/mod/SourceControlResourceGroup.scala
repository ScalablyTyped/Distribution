package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceControlResourceGroup extends js.Object {
  /**
    * Whether this source control resource group is hidden when it contains
    * no [source control resource states](#SourceControlResourceState).
    */
  var hideWhenEmpty: js.UndefOr[Boolean] = js.native
  /**
    * The id of this source control resource group.
    */
  val id: String = js.native
  /**
    * The label of this source control resource group.
    */
  var label: String = js.native
  /**
    * This group's collection of
    * [source control resource states](#SourceControlResourceState).
    */
  var resourceStates: js.Array[SourceControlResourceState] = js.native
  /**
    * Dispose this source control resource group.
    */
  def dispose(): Unit = js.native
}

object SourceControlResourceGroup {
  @scala.inline
  def apply(
    dispose: () => Unit,
    id: String,
    label: String,
    resourceStates: js.Array[SourceControlResourceState]
  ): SourceControlResourceGroup = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], resourceStates = resourceStates.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceControlResourceGroup]
  }
  @scala.inline
  implicit class SourceControlResourceGroupOps[Self <: SourceControlResourceGroup] (val x: Self) extends AnyVal {
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
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceStatesVarargs(value: SourceControlResourceState*): Self = this.set("resourceStates", js.Array(value :_*))
    @scala.inline
    def setResourceStates(value: js.Array[SourceControlResourceState]): Self = this.set("resourceStates", value.asInstanceOf[js.Any])
    @scala.inline
    def setHideWhenEmpty(value: Boolean): Self = this.set("hideWhenEmpty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideWhenEmpty: Self = this.set("hideWhenEmpty", js.undefined)
  }
  
}

