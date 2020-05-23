package typings.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShimBase extends IShim {
  var factory: js.Any
}

object ShimBase {
  @scala.inline
  def apply(dispose: js.Any => Unit, factory: js.Any): ShimBase = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction1(dispose), factory = factory.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShimBase]
  }
}

