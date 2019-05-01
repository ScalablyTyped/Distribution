package typings
package vueDashServerDashRendererLib.vueDashServerDashRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BundleRenderer extends js.Object {
  def renderToStream(): nodeLib.streamMod.Readable = js.native
  def renderToStream(context: js.Object): nodeLib.streamMod.Readable = js.native
  def renderToString(): js.Promise[java.lang.String] = js.native
  def renderToString(callback: RenderCallback): scala.Unit = js.native
  def renderToString(context: js.Object): js.Promise[java.lang.String] = js.native
  def renderToString(context: js.Object, callback: RenderCallback): scala.Unit = js.native
}

