package typings.vegaTypings

import typings.vegaTypings.scaleMod.MultiDataRef
import typings.vegaTypings.scaleMod.ScaleField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataFields extends MultiDataRef {
  var data: String
  var fields: js.Array[ScaleField]
}

object AnonDataFields {
  @scala.inline
  def apply(data: String, fields: js.Array[ScaleField]): AnonDataFields = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDataFields]
  }
}

