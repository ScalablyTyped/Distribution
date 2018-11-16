package typings
package webpackLib.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated use webpack.NoEmitOnErrorsPlugin */
@JSImport("webpack", "NormalModuleReplacementPlugin")
@js.native
class NormalModuleReplacementPlugin protected ()
  extends webpackLib.webpackMod.webpackNs.NormalModuleReplacementPlugin {
  def this(resourceRegExp: js.Any, newResource: js.Any) = this()
  /* CompleteClass */
  @JSName("apply")
  override def apply(args: js.Any*): scala.Unit = js.native
  /* CompleteClass */
  @JSName("apply")
  override def apply(compiler: webpackLib.webpackMod.webpackNs.Compiler): scala.Unit = js.native
}

