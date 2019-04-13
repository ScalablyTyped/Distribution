package typings
package webpackLib.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "ResolvePlugin")
@js.native
abstract class ResolvePlugin ()
  extends tapableLib.tapableMod.TapableNs.Plugin {
  /* CompleteClass */
  @JSName("apply")
  override def apply(args: js.Any*): scala.Unit = js.native
  @JSName("apply")
  def apply(resolver: js.Any): scala.Unit = js.native
}

