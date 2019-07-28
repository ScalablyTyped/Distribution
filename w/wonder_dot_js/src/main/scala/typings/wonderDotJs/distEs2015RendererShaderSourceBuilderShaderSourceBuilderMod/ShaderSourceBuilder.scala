package typings.wonderDotJs.distEs2015RendererShaderSourceBuilderShaderSourceBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/shader/sourceBuilder/ShaderSourceBuilder", "ShaderSourceBuilder")
@js.native
abstract class ShaderSourceBuilder () extends js.Object {
  var attributes: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Hash<ShaderData> */ js.Any = js.native
  var fsSource: String = js.native
  var uniforms: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Hash<ShaderData> */ js.Any = js.native
  var vsSource: String = js.native
  def build(args: js.Any*): Unit = js.native
  def clearShaderDefinition(): Unit = js.native
  /* protected */ def convertAttributesData(): Unit = js.native
  def dispose(): Unit = js.native
}

