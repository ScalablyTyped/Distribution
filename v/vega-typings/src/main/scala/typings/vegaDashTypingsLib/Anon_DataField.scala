package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataField
  extends vegaDashTypingsLib.typesSpecMarkMod.Facet {
  var data: java.lang.String
  var field: java.lang.String
  var name: java.lang.String
}

object Anon_DataField {
  @scala.inline
  def apply(data: java.lang.String, field: java.lang.String, name: java.lang.String): Anon_DataField = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("field")(field)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_DataField]
  }
}

