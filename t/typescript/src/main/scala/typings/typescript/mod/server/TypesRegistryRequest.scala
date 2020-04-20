package typings.typescript.mod.server

import typings.typescript.typescriptStrings.typesRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypesRegistryRequest extends js.Object {
  val kind: typesRegistry
}

object TypesRegistryRequest {
  @scala.inline
  def apply(kind: typesRegistry): TypesRegistryRequest = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypesRegistryRequest]
  }
}

