package typings
package webpackLib.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Plugins
  */
@JSImport("webpack", "BannerPlugin")
@js.native
class BannerPlugin protected ()
  extends webpackLib.webpackMod.webpackNs.BannerPlugin {
  def this(options: java.lang.String) = this()
  def this(options: webpackLib.webpackMod.webpackNs.BannerPluginNs.Options) = this()
  /* CompleteClass */
  @JSName("apply")
  override def apply(args: js.Any*): scala.Unit = js.native
  /* CompleteClass */
  @JSName("apply")
  override def apply(compiler: webpackLib.webpackMod.webpackNs.Compiler): scala.Unit = js.native
}

