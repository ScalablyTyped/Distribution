package typings.umbraco.umbraco.resources

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.resources.treeResource
  * @description Loads in data for trees
  **/
@js.native
trait ITreeResource extends js.Object {
  /** Loads in the data to display the nodes for an application */
  def loadApplication(options: js.Any): Unit = js.native
  /** Loads in the data to display the nodes menu */
  def loadMenu(node: js.Any): Unit = js.native
  /** Loads in the data to display the child nodes for a given node */
  def loadNodes(options: js.Any): Unit = js.native
}

object ITreeResource {
  @scala.inline
  def apply(loadApplication: js.Any => Unit, loadMenu: js.Any => Unit, loadNodes: js.Any => Unit): ITreeResource = {
    val __obj = js.Dynamic.literal(loadApplication = js.Any.fromFunction1(loadApplication), loadMenu = js.Any.fromFunction1(loadMenu), loadNodes = js.Any.fromFunction1(loadNodes))
    __obj.asInstanceOf[ITreeResource]
  }
  @scala.inline
  implicit class ITreeResourceOps[Self <: ITreeResource] (val x: Self) extends AnyVal {
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
    def setLoadApplication(value: js.Any => Unit): Self = this.set("loadApplication", js.Any.fromFunction1(value))
    @scala.inline
    def setLoadMenu(value: js.Any => Unit): Self = this.set("loadMenu", js.Any.fromFunction1(value))
    @scala.inline
    def setLoadNodes(value: js.Any => Unit): Self = this.set("loadNodes", js.Any.fromFunction1(value))
  }
  
}

