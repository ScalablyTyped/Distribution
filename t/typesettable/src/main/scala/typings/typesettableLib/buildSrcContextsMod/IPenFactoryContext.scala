package typings
package typesettableLib.buildSrcContextsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPenFactoryContext[T] extends js.Object {
  @JSName("createPen")
  var createPen_Original: typesettableLib.buildSrcWritersWriterMod.IPenFactory[T] = js.native
  def createPen(text: java.lang.String, transform: typesettableLib.buildSrcWritersWriterMod.ITransform): typesettableLib.buildSrcWritersWriterMod.IPen = js.native
  def createPen(
    text: java.lang.String,
    transform: typesettableLib.buildSrcWritersWriterMod.ITransform,
    container: T
  ): typesettableLib.buildSrcWritersWriterMod.IPen = js.native
}

