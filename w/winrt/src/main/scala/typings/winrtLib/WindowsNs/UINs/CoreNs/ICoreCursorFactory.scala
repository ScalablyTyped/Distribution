package typings
package winrtLib.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreCursorFactory extends js.Object {
  def createCursor(`type`: CoreCursorType, id: scala.Double): CoreCursor
}

object ICoreCursorFactory {
  @scala.inline
  def apply(createCursor: js.Function2[CoreCursorType, scala.Double, CoreCursor]): ICoreCursorFactory = {
    val __obj = js.Dynamic.literal(createCursor = createCursor)
  
    __obj.asInstanceOf[ICoreCursorFactory]
  }
}

