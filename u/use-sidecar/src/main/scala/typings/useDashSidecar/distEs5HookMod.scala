package typings.useDashSidecar

import typings.react.reactMod.ComponentType
import typings.std.Error
import typings.useDashSidecar.distEs5TypesMod.Importer
import typings.useDashSidecar.distEs5TypesMod.SideMedium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("use-sidecar/dist/es5/hook", JSImport.Namespace)
@js.native
object distEs5HookMod extends js.Object {
  def useSidecar[T](importer: Importer[T]): js.Tuple2[ComponentType[T] | Null, Error | Null] = js.native
  def useSidecar[T](importer: Importer[T], effect: SideMedium[_]): js.Tuple2[ComponentType[T] | Null, Error | Null] = js.native
}

