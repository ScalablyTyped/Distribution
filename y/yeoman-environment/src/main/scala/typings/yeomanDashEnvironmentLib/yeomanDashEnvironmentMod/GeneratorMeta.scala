package typings
package yeomanDashEnvironmentLib.yeomanDashEnvironmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneratorMeta extends js.Object {
  var namespace: java.lang.String
  var resolved: java.lang.String
}

object GeneratorMeta {
  @scala.inline
  def apply(namespace: java.lang.String, resolved: java.lang.String): GeneratorMeta = {
    val __obj = js.Dynamic.literal(namespace = namespace, resolved = resolved)
  
    __obj.asInstanceOf[GeneratorMeta]
  }
}

