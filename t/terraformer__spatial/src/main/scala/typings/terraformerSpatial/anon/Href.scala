package typings.terraformerSpatial.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Href extends js.Object {
  var href: String
  var `type`: String
}

object Href {
  @scala.inline
  def apply(href: String, `type`: String): Href = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Href]
  }
}

