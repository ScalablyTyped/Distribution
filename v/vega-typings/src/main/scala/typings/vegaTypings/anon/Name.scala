package typings.vegaTypings.anon

import typings.vegaTypings.markMod.Facet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends Facet {
  var data: String
  var field: String
  var name: String
}

object Name {
  @scala.inline
  def apply(data: String, field: String, name: String): Name = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

