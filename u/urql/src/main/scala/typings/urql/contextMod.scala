package typings.urql

import typings.urqlCore.mod.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("urql/dist/types/context", JSImport.Namespace)
@js.native
object contextMod extends js.Object {
  val Consumer: typings.react.mod.Consumer[Client] = js.native
  val Context: typings.react.mod.Context[Client] = js.native
  val Provider: typings.react.mod.Provider[Client] = js.native
  def useClient(): Client = js.native
}

