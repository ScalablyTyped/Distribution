package typings.tmiDotJs.strictDashEventDashEmitterDashTypesMod

import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictBroadcast[TEmitter /* <: TypeRecord[_, _, _] */, TEmitRecord /* <: NoUndefined[
/* import warning: importer.ImportType#apply Failed type conversion: TEmitter[' _emitType'] */ js.Any] */, VK /* <: VoidKeys[TEmitRecord] */, NVK /* <: Exclude[String, VK] */] extends js.Object {
  def apply(event: VK): js.Any = js.native
  def apply[E /* <: NVK */](
    event: E,
    request: /* import warning: importer.ImportType#apply Failed type conversion: TEmitRecord[E] */ js.Any
  ): js.Any = js.native
}

