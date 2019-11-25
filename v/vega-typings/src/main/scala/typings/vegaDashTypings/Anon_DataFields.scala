package typings.vegaDashTypings

import typings.vegaDashTypings.typesSpecScaleMod.MultiDataRef
import typings.vegaDashTypings.typesSpecScaleMod.ScaleField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataFields extends MultiDataRef {
  var data: String
  var fields: js.Array[ScaleField]
}

object Anon_DataFields {
  @scala.inline
  def apply(data: String, fields: js.Array[ScaleField]): Anon_DataFields = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DataFields]
  }
}

