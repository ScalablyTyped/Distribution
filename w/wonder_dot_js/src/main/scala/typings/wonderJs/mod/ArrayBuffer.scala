package typings.wonderJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "ArrayBuffer")
@js.native
class ArrayBuffer ()
  extends typings.wonderJs.arrayBufferMod.ArrayBuffer
/* static members */
object ArrayBuffer {
  
  @JSImport("wonder.js/dist/es2015", "ArrayBuffer")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(data: js.Array[Double], size: Double): typings.wonderJs.arrayBufferMod.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[typings.wonderJs.arrayBufferMod.ArrayBuffer]
  @scala.inline
  def create(
    data: js.Array[Double],
    size: Double,
    `type`: Unit,
    usage: typings.wonderJs.ebufferusageMod.EBufferUsage
  ): typings.wonderJs.arrayBufferMod.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], size.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], usage.asInstanceOf[js.Any])).asInstanceOf[typings.wonderJs.arrayBufferMod.ArrayBuffer]
  @scala.inline
  def create(data: js.Array[Double], size: Double, `type`: typings.wonderJs.ebuffertypeMod.EBufferType): typings.wonderJs.arrayBufferMod.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], size.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.wonderJs.arrayBufferMod.ArrayBuffer]
  @scala.inline
  def create(
    data: js.Array[Double],
    size: Double,
    `type`: typings.wonderJs.ebuffertypeMod.EBufferType,
    usage: typings.wonderJs.ebufferusageMod.EBufferUsage
  ): typings.wonderJs.arrayBufferMod.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], size.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], usage.asInstanceOf[js.Any])).asInstanceOf[typings.wonderJs.arrayBufferMod.ArrayBuffer]
}
