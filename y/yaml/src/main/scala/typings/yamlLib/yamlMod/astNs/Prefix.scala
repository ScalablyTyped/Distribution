package typings
package yamlLib.yamlMod.astNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Prefix extends js.Object {
  var handle: java.lang.String
  var prefix: java.lang.String
}

object Prefix {
  @scala.inline
  def apply(handle: java.lang.String, prefix: java.lang.String): Prefix = {
    val __obj = js.Dynamic.literal(handle = handle, prefix = prefix)
  
    __obj.asInstanceOf[Prefix]
  }
}

