package typings
package webpackLib.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "NamedChunksPlugin")
@js.native
class NamedChunksPlugin ()
  extends webpackLib.webpackMod.webpackNs.NamedChunksPlugin {
  def this(nameResolver: js.Function1[/* chunk */ js.Any, java.lang.String | scala.Null]) = this()
  /* CompleteClass */
  @JSName("apply")
  override def apply(args: js.Any*): scala.Unit = js.native
  /* CompleteClass */
  @JSName("apply")
  override def apply(compiler: webpackLib.webpackMod.webpackNs.Compiler): scala.Unit = js.native
}

