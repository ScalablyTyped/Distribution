package typings.typesettable.buildSrcContextsMod

import typings.typesettable.buildSrcWritersWriterMod.IPen
import typings.typesettable.buildSrcWritersWriterMod.IPenFactory
import typings.typesettable.buildSrcWritersWriterMod.ITransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPenFactoryContext[T] extends js.Object {
  @JSName("createPen")
  var createPen_Original: IPenFactory[T] = js.native
  def createPen(text: String, transform: ITransform): IPen = js.native
  def createPen(text: String, transform: ITransform, container: T): IPen = js.native
}

