package typings.yeomanEnvironment.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneratorMeta extends js.Object {
  var namespace: String
  var resolved: String
}

object GeneratorMeta {
  @scala.inline
  def apply(namespace: String, resolved: String): GeneratorMeta = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneratorMeta]
  }
}

