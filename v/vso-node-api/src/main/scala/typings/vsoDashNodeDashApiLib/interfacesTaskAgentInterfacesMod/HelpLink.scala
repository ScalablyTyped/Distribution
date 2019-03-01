package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelpLink extends js.Object {
  var text: java.lang.String
  var url: java.lang.String
}

object HelpLink {
  @scala.inline
  def apply(text: java.lang.String, url: java.lang.String): HelpLink = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[HelpLink]
  }
}

