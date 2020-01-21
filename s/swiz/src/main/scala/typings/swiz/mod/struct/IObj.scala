package typings.swiz.mod.struct

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObj extends js.Object {
  var fields: js.Array[IField]
  var name: String
  var options: IObjOptions
  var plural: String
  var singular: String
}

object IObj {
  @scala.inline
  def apply(fields: js.Array[IField], name: String, options: IObjOptions, plural: String, singular: String): IObj = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], singular = singular.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IObj]
  }
}

