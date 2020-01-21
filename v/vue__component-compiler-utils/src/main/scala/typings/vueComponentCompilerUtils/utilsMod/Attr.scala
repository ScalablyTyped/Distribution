package typings.vueComponentCompilerUtils.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attr extends js.Object {
  var name: String
  var value: String
}

object Attr {
  @scala.inline
  def apply(name: String, value: String): Attr = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Attr]
  }
}

