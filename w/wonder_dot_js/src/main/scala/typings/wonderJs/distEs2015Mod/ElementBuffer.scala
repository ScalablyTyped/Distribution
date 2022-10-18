package typings.wonderJs.distEs2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "ElementBuffer")
@js.native
open class ElementBuffer ()
  extends typings.wonderJs.distEs2015RendererBufferElementBufferMod.ElementBuffer
/* static members */
object ElementBuffer {
  
  @JSImport("wonder.js/dist/es2015", "ElementBuffer")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(data: js.Array[Double]): typings.wonderJs.distEs2015RendererBufferElementBufferMod.ElementBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any]).asInstanceOf[typings.wonderJs.distEs2015RendererBufferElementBufferMod.ElementBuffer]
  inline def create(
    data: js.Array[Double],
    `type`: Unit,
    usage: typings.wonderJs.distEs2015RendererBufferEbufferusageMod.EBufferUsage
  ): typings.wonderJs.distEs2015RendererBufferElementBufferMod.ElementBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], usage.asInstanceOf[js.Any])).asInstanceOf[typings.wonderJs.distEs2015RendererBufferElementBufferMod.ElementBuffer]
  inline def create(
    data: js.Array[Double],
    `type`: typings.wonderJs.distEs2015RendererBufferEbuffertypeMod.EBufferType
  ): typings.wonderJs.distEs2015RendererBufferElementBufferMod.ElementBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.wonderJs.distEs2015RendererBufferElementBufferMod.ElementBuffer]
  inline def create(
    data: js.Array[Double],
    `type`: typings.wonderJs.distEs2015RendererBufferEbuffertypeMod.EBufferType,
    usage: typings.wonderJs.distEs2015RendererBufferEbufferusageMod.EBufferUsage
  ): typings.wonderJs.distEs2015RendererBufferElementBufferMod.ElementBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], usage.asInstanceOf[js.Any])).asInstanceOf[typings.wonderJs.distEs2015RendererBufferElementBufferMod.ElementBuffer]
}
