package typings.yaml.yamlMod.ast

import typings.yaml.yamlMod.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schema extends js.Object {
  var merge: Boolean
  var name: String
  var schema: js.Array[Tag]
}

object Schema {
  @scala.inline
  def apply(merge: Boolean, name: String, schema: js.Array[Tag]): Schema = {
    val __obj = js.Dynamic.literal(merge = merge.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Schema]
  }
}

