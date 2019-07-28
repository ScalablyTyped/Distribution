package typings.winrt.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreCursorFactory extends js.Object {
  def createCursor(`type`: CoreCursorType, id: Double): CoreCursor
}

object ICoreCursorFactory {
  @scala.inline
  def apply(createCursor: (CoreCursorType, Double) => CoreCursor): ICoreCursorFactory = {
    val __obj = js.Dynamic.literal(createCursor = js.Any.fromFunction2(createCursor))
  
    __obj.asInstanceOf[ICoreCursorFactory]
  }
}

