package typings.wonderDotJs.distEs2015RendererBufferCommonBufferMod

import typings.wonderDotJs.distEs2015RendererBufferBufferMod.Buffer
import typings.wonderDotJs.distEs2015RendererBufferEBufferTypeMod.EBufferType
import typings.wonderDotJs.distEs2015RendererBufferEBufferUsageMod.EBufferUsage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/buffer/CommonBuffer", "CommonBuffer")
@js.native
abstract class CommonBuffer () extends Buffer {
  var count: Double = js.native
  var `type`: EBufferType = js.native
  var usage: EBufferUsage = js.native
  /* protected */ def resetBufferData(glBufferTargetStr: String, typedData: js.Any): Unit = js.native
  /* protected */ def resetBufferData(glBufferTargetStr: String, typedData: js.Any, offset: Double): Unit = js.native
}

