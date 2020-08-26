package typings.vsoNodeApi.coreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebApiProjectCollection extends WebApiProjectCollectionRef {
  /**
    * Project collection description
    */
  var description: String = js.native
  /**
    * Project collection state
    */
  var state: String = js.native
}

object WebApiProjectCollection {
  @scala.inline
  def apply(collectionUrl: String, description: String, id: String, name: String, state: String, url: String): WebApiProjectCollection = {
    val __obj = js.Dynamic.literal(collectionUrl = collectionUrl.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebApiProjectCollection]
  }
  @scala.inline
  implicit class WebApiProjectCollectionOps[Self <: WebApiProjectCollection] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

