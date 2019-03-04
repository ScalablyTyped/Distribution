package typings
package tableauLib.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetSizeOptions extends js.Object {
  /** Contains an enumeration value of one of the following: AUTOMATIC, EXACTLY, RANGE, ATLEAST, and ATMOST. */
  var behavior: SheetSizeBehaviour
  /** This is only defined when behavior is EXACTLY, RANGE or ATMOST. */
  var maxSize: scala.Double
  /** This is only defined when behavior is EXACTLY, RANGE, or ATLEAST. */
  var minSize: scala.Double
}

object SheetSizeOptions {
  @scala.inline
  def apply(behavior: SheetSizeBehaviour, maxSize: scala.Double, minSize: scala.Double): SheetSizeOptions = {
    val __obj = js.Dynamic.literal(behavior = behavior, maxSize = maxSize, minSize = minSize)
  
    __obj.asInstanceOf[SheetSizeOptions]
  }
}

