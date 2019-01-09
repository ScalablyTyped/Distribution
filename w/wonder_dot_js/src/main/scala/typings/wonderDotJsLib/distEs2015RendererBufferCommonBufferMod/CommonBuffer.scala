package typings
package wonderDotJsLib.distEs2015RendererBufferCommonBufferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/buffer/CommonBuffer", "CommonBuffer")
@js.native
abstract class CommonBuffer ()
  extends wonderDotJsLib.distEs2015RendererBufferBufferMod.Buffer {
  var count: scala.Double = js.native
  var `type`: wonderDotJsLib.distEs2015RendererBufferEBufferTypeMod.EBufferType = js.native
  var usage: wonderDotJsLib.distEs2015RendererBufferEBufferUsageMod.EBufferUsage = js.native
  /* protected */ def resetBufferData(glBufferTargetStr: java.lang.String, typedData: js.Any): scala.Unit = js.native
  /* protected */ def resetBufferData(glBufferTargetStr: java.lang.String, typedData: js.Any, offset: scala.Double): scala.Unit = js.native
}

