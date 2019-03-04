package typings
package velocityDashAnimateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Elements extends js.Object {
  var elements: stdLib.HTMLCollection | stdLib.NodeListOf[stdLib.HTMLElement]
  var options: velocityDashAnimateLib.jqueryNs.velocityNs.Options
  var properties: velocityDashAnimateLib.jqueryNs.velocityNs.Properties
}

object Anon_Elements {
  @scala.inline
  def apply(
    elements: stdLib.HTMLCollection | stdLib.NodeListOf[stdLib.HTMLElement],
    options: velocityDashAnimateLib.jqueryNs.velocityNs.Options,
    properties: velocityDashAnimateLib.jqueryNs.velocityNs.Properties
  ): Anon_Elements = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], options = options, properties = properties)
  
    __obj.asInstanceOf[Anon_Elements]
  }
}

