package typings.typescriptServices.mod.Services

import typings.typescriptServices.TypeScript.Services.IShimFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.ShimBase")
@js.native
class ShimBase protected ()
  extends typings.typescriptServices.TypeScript.Services.ShimBase {
  def this(factory: IShimFactory) = this()
  /* CompleteClass */
  override var factory: js.Any = js.native
  /* CompleteClass */
  override def dispose(dummy: js.Any): Unit = js.native
}

