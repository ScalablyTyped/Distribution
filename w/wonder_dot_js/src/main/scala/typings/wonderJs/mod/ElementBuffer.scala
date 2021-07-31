package typings.wonderJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "ElementBuffer")
@js.native
class ElementBuffer ()
  extends typings.wonderJs.elementBufferMod.ElementBuffer
/* static members */
object ElementBuffer {
  
  @JSImport("wonder.js/dist/es2015", "ElementBuffer")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(data: js.Array[Double]): typings.wonderJs.elementBufferMod.ElementBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any]).asInstanceOf[typings.wonderJs.elementBufferMod.ElementBuffer]
  @scala.inline
  def create(data: js.Array[Double], `type`: Unit, usage: typings.wonderJs.ebufferusageMod.EBufferUsage): typings.wonderJs.elementBufferMod.ElementBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], usage.asInstanceOf[js.Any])).asInstanceOf[typings.wonderJs.elementBufferMod.ElementBuffer]
  @scala.inline
  def create(data: js.Array[Double], `type`: typings.wonderJs.ebuffertypeMod.EBufferType): typings.wonderJs.elementBufferMod.ElementBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.wonderJs.elementBufferMod.ElementBuffer]
  @scala.inline
  def create(
    data: js.Array[Double],
    `type`: typings.wonderJs.ebuffertypeMod.EBufferType,
    usage: typings.wonderJs.ebufferusageMod.EBufferUsage
  ): typings.wonderJs.elementBufferMod.ElementBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], usage.asInstanceOf[js.Any])).asInstanceOf[typings.wonderJs.elementBufferMod.ElementBuffer]
}
