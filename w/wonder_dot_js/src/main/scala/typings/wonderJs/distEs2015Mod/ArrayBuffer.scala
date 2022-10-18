package typings.wonderJs.distEs2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "ArrayBuffer")
@js.native
open class ArrayBuffer ()
  extends typings.wonderJs.distEs2015RendererBufferArrayBufferMod.ArrayBuffer
/* static members */
object ArrayBuffer {
  
  @JSImport("wonder.js/dist/es2015", "ArrayBuffer")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(data: js.Array[Double], size: Double): typings.wonderJs.distEs2015RendererBufferArrayBufferMod.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[typings.wonderJs.distEs2015RendererBufferArrayBufferMod.ArrayBuffer]
  inline def create(
    data: js.Array[Double],
    size: Double,
    `type`: Unit,
    usage: typings.wonderJs.distEs2015RendererBufferEbufferusageMod.EBufferUsage
  ): typings.wonderJs.distEs2015RendererBufferArrayBufferMod.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], size.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], usage.asInstanceOf[js.Any])).asInstanceOf[typings.wonderJs.distEs2015RendererBufferArrayBufferMod.ArrayBuffer]
  inline def create(
    data: js.Array[Double],
    size: Double,
    `type`: typings.wonderJs.distEs2015RendererBufferEbuffertypeMod.EBufferType
  ): typings.wonderJs.distEs2015RendererBufferArrayBufferMod.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], size.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.wonderJs.distEs2015RendererBufferArrayBufferMod.ArrayBuffer]
  inline def create(
    data: js.Array[Double],
    size: Double,
    `type`: typings.wonderJs.distEs2015RendererBufferEbuffertypeMod.EBufferType,
    usage: typings.wonderJs.distEs2015RendererBufferEbufferusageMod.EBufferUsage
  ): typings.wonderJs.distEs2015RendererBufferArrayBufferMod.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], size.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], usage.asInstanceOf[js.Any])).asInstanceOf[typings.wonderJs.distEs2015RendererBufferArrayBufferMod.ArrayBuffer]
}
