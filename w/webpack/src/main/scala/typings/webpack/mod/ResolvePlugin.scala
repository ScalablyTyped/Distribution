package typings.webpack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "ResolvePlugin")
@js.native
abstract class ResolvePlugin ()
  extends typings.tapable.mod.Tapable.Plugin {
  /* CompleteClass */
  @JSName("apply")
  override def apply(args: js.Any*): Unit = js.native
  @JSName("apply")
  def apply(resolver: js.Any): Unit = js.native
}

