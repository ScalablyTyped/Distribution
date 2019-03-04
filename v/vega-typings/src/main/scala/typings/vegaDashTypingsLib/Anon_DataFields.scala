package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataFields
  extends vegaDashTypingsLib.typesSpecScaleMod.MultiDataRef {
  var data: java.lang.String
  var fields: js.Array[vegaDashTypingsLib.typesSpecScaleMod.ScaleField]
}

object Anon_DataFields {
  @scala.inline
  def apply(data: java.lang.String, fields: js.Array[vegaDashTypingsLib.typesSpecScaleMod.ScaleField]): Anon_DataFields = {
    val __obj = js.Dynamic.literal(data = data, fields = fields)
  
    __obj.asInstanceOf[Anon_DataFields]
  }
}

