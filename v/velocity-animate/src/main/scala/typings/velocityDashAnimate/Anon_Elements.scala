package typings.velocityDashAnimate

import typings.std.HTMLCollection
import typings.std.HTMLElement
import typings.std.NodeListOf
import typings.velocityDashAnimate.jqueryNs.velocityNs.Options
import typings.velocityDashAnimate.jqueryNs.velocityNs.Properties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Elements extends js.Object {
  var elements: HTMLCollection | NodeListOf[HTMLElement]
  var options: Options
  var properties: Properties
}

object Anon_Elements {
  @scala.inline
  def apply(elements: HTMLCollection | NodeListOf[HTMLElement], options: Options, properties: Properties): Anon_Elements = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], options = options, properties = properties)
  
    __obj.asInstanceOf[Anon_Elements]
  }
}

