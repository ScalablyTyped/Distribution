package typings.umbraco.umbraco.resources

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.resources.sectionResource
  * @description Loads in data for section
  **/
@js.native
trait ISectionResource extends js.Object {
  /** Loads in the data to display the section list */
  def getSections(): Unit = js.native
}

object ISectionResource {
  @scala.inline
  def apply(getSections: () => Unit): ISectionResource = {
    val __obj = js.Dynamic.literal(getSections = js.Any.fromFunction0(getSections))
    __obj.asInstanceOf[ISectionResource]
  }
  @scala.inline
  implicit class ISectionResourceOps[Self <: ISectionResource] (val x: Self) extends AnyVal {
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
    def setGetSections(value: () => Unit): Self = this.set("getSections", js.Any.fromFunction0(value))
  }
  
}

