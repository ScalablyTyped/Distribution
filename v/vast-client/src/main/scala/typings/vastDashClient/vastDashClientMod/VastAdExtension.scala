package typings.vastDashClient.vastDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VastAdExtension extends js.Object {
  var attributes: VastAdAttributes
  var children: js.Array[VastAdExtensionChild]
}

object VastAdExtension {
  @scala.inline
  def apply(attributes: VastAdAttributes, children: js.Array[VastAdExtensionChild]): VastAdExtension = {
    val __obj = js.Dynamic.literal(attributes = attributes, children = children)
  
    __obj.asInstanceOf[VastAdExtension]
  }
}

