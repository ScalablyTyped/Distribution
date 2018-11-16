package typings
package webpackLib.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "Plugin")
@js.native
abstract class Plugin ()
  extends webpackLib.webpackMod.webpackNs.Plugin {
  /* CompleteClass */
  @JSName("apply")
  override def apply(args: js.Any*): scala.Unit = js.native
  /* CompleteClass */
  @JSName("apply")
  override def apply(compiler: webpackLib.webpackMod.webpackNs.Compiler): scala.Unit = js.native
}

