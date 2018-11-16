package typings
package vueDashServerDashRendererLib.vueDashServerDashRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Renderer extends js.Object {
  def renderToStream(vm: vueLib.typesVueMod.Vue): nodeLib.streamMod.Readable = js.native
  def renderToStream(vm: vueLib.typesVueMod.Vue, context: js.Object): nodeLib.streamMod.Readable = js.native
  def renderToString(vm: vueLib.typesVueMod.Vue): stdLib.Promise[java.lang.String] = js.native
  def renderToString(vm: vueLib.typesVueMod.Vue, callback: vueDashServerDashRendererLib.RenderCallback): scala.Unit = js.native
  def renderToString(vm: vueLib.typesVueMod.Vue, context: js.Object): stdLib.Promise[java.lang.String] = js.native
  def renderToString(
    vm: vueLib.typesVueMod.Vue,
    context: js.Object,
    callback: vueDashServerDashRendererLib.RenderCallback
  ): scala.Unit = js.native
}

