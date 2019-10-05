package typings.swiz.swizMod.struct

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
    val __obj = js.Dynamic.literal(fields = fields, name = name, options = options, plural = plural, singular = singular)
  
    __obj.asInstanceOf[IObj]
  }
}

