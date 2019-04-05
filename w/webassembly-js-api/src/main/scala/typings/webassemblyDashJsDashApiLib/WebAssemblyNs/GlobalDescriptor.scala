package typings
package webassemblyDashJsDashApiLib.WebAssemblyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * WebAssembly.Global
  */
trait GlobalDescriptor extends js.Object {
  var mutable: js.UndefOr[scala.Boolean] = js.undefined
  var value: webassemblyDashJsDashApiLib.webassemblyDashJsDashApiLibStrings.i32 | webassemblyDashJsDashApiLib.webassemblyDashJsDashApiLibStrings.i64 | webassemblyDashJsDashApiLib.webassemblyDashJsDashApiLibStrings.f32 | webassemblyDashJsDashApiLib.webassemblyDashJsDashApiLibStrings.f64
}

object GlobalDescriptor {
  @scala.inline
  def apply(
    value: webassemblyDashJsDashApiLib.webassemblyDashJsDashApiLibStrings.i32 | webassemblyDashJsDashApiLib.webassemblyDashJsDashApiLibStrings.i64 | webassemblyDashJsDashApiLib.webassemblyDashJsDashApiLibStrings.f32 | webassemblyDashJsDashApiLib.webassemblyDashJsDashApiLibStrings.f64,
    mutable: js.UndefOr[scala.Boolean] = js.undefined
  ): GlobalDescriptor = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(mutable)) __obj.updateDynamic("mutable")(mutable)
    __obj.asInstanceOf[GlobalDescriptor]
  }
}

