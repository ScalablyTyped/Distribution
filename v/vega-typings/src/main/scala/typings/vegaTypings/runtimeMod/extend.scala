package typings.vegaTypings.runtimeMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-typings/types/runtime", "extend")
@js.native
object extend extends js.Object {
  def apply[T](target: T, source: Partial[T]*): T = js.native
}

