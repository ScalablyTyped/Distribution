package typings.webpack.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "Plugin")
@js.native
abstract class Plugin ()
  extends typings.tapable.tapableMod.TapableNs.Plugin {
  /* CompleteClass */
  @JSName("apply")
  override def apply(args: js.Any*): Unit = js.native
  @JSName("apply")
  def apply(compiler: Compiler): Unit = js.native
}

