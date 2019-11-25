package typings.vegaDashTypings

import typings.vegaDashTypings.typesSpecMarkMod.Facet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataField extends Facet {
  var data: String
  var field: String
  var name: String
}

object Anon_DataField {
  @scala.inline
  def apply(data: String, field: String, name: String): Anon_DataField = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DataField]
  }
}

