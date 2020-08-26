package typings.tablesorter.pagerClassesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PagerClasses extends js.Object {
  /**
    * A set of css-classes to apply to the container.
    */
  var container: js.UndefOr[String] = js.native
  /**
    * The css-class to apply to disabled pager-controls.
    */
  var disabled: js.UndefOr[String] = js.native
  /**
    * The css-class to apply to the table-row which displays the error-message in case of an ajax-error.
    */
  var errorRow: js.UndefOr[String] = js.native
}

object PagerClasses {
  @scala.inline
  def apply(): PagerClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PagerClasses]
  }
  @scala.inline
  implicit class PagerClassesOps[Self <: PagerClasses] (val x: Self) extends AnyVal {
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
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setDisabled(value: String): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setErrorRow(value: String): Self = this.set("errorRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorRow: Self = this.set("errorRow", js.undefined)
  }
  
}

