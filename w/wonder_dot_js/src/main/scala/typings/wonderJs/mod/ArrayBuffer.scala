package typings.wonderJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "ArrayBuffer")
@js.native
class ArrayBuffer ()
  extends typings.wonderJs.arrayBufferMod.ArrayBuffer

/* static members */
@JSImport("wonder.js/dist/es2015", "ArrayBuffer")
@js.native
object ArrayBuffer extends js.Object {
  def create(data: js.Array[Double], size: Double): typings.wonderJs.arrayBufferMod.ArrayBuffer = js.native
  def create(data: js.Array[Double], size: Double, `type`: typings.wonderJs.ebuffertypeMod.EBufferType): typings.wonderJs.arrayBufferMod.ArrayBuffer = js.native
  def create(
    data: js.Array[Double],
    size: Double,
    `type`: typings.wonderJs.ebuffertypeMod.EBufferType,
    usage: typings.wonderJs.ebufferusageMod.EBufferUsage
  ): typings.wonderJs.arrayBufferMod.ArrayBuffer = js.native
}

