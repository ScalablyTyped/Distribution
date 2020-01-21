package typings.vsoNodeApi.coreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebApiCreateTagRequestData extends js.Object {
  /**
    * Name of the tag definition that will be created.
    */
  var name: String
}

object WebApiCreateTagRequestData {
  @scala.inline
  def apply(name: String): WebApiCreateTagRequestData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebApiCreateTagRequestData]
  }
}

