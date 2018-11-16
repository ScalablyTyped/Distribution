package typings
package webpackLib.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "EnvironmentPlugin")
@js.native
class EnvironmentPlugin protected ()
  extends webpackLib.webpackMod.webpackNs.EnvironmentPlugin {
  def this(envs: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
  def this(envs: js.Array[java.lang.String]) = this()
  /* CompleteClass */
  @JSName("apply")
  override def apply(args: js.Any*): scala.Unit = js.native
  /* CompleteClass */
  @JSName("apply")
  override def apply(compiler: webpackLib.webpackMod.webpackNs.Compiler): scala.Unit = js.native
}

