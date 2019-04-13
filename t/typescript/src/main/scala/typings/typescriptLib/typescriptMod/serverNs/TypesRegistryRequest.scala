package typings
package typescriptLib.typescriptMod.serverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypesRegistryRequest extends js.Object {
  val kind: typescriptLib.typescriptLibStrings.typesRegistry
}

object TypesRegistryRequest {
  @scala.inline
  def apply(kind: typescriptLib.typescriptLibStrings.typesRegistry): TypesRegistryRequest = {
    val __obj = js.Dynamic.literal(kind = kind)
  
    __obj.asInstanceOf[TypesRegistryRequest]
  }
}

