package typings
package yamlLib.yamlMod.astNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schema extends js.Object {
  var merge: scala.Boolean
  var name: java.lang.String
  var schema: js.Array[yamlLib.yamlMod.Tag]
}

object Schema {
  @scala.inline
  def apply(merge: scala.Boolean, name: java.lang.String, schema: js.Array[yamlLib.yamlMod.Tag]): Schema = {
    val __obj = js.Dynamic.literal(merge = merge, name = name, schema = schema)
  
    __obj.asInstanceOf[Schema]
  }
}

