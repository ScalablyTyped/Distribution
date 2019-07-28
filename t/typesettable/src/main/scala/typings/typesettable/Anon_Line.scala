package typings.typesettable

import typings.typesettable.buildSrcWritersWriterMod.IXAlign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Line extends js.Object {
  def write(line: String, width: Double, xAlign: IXAlign, xOffset: Double, yOffset: Double): Unit
}

object Anon_Line {
  @scala.inline
  def apply(write: (String, Double, IXAlign, Double, Double) => Unit): Anon_Line = {
    val __obj = js.Dynamic.literal(write = js.Any.fromFunction5(write))
  
    __obj.asInstanceOf[Anon_Line]
  }
}

