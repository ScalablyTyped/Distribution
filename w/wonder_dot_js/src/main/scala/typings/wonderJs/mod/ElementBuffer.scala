package typings.wonderJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "ElementBuffer")
@js.native
class ElementBuffer ()
  extends typings.wonderJs.elementBufferMod.ElementBuffer

/* static members */
@JSImport("wonder.js/dist/es2015", "ElementBuffer")
@js.native
object ElementBuffer extends js.Object {
  def create(data: js.Array[Double]): typings.wonderJs.elementBufferMod.ElementBuffer = js.native
  def create(data: js.Array[Double], `type`: typings.wonderJs.ebuffertypeMod.EBufferType): typings.wonderJs.elementBufferMod.ElementBuffer = js.native
  def create(
    data: js.Array[Double],
    `type`: typings.wonderJs.ebuffertypeMod.EBufferType,
    usage: typings.wonderJs.ebufferusageMod.EBufferUsage
  ): typings.wonderJs.elementBufferMod.ElementBuffer = js.native
}

