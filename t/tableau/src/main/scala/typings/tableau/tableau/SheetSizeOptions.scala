package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetSizeOptions extends js.Object {
  /** Contains an enumeration value of one of the following: AUTOMATIC, EXACTLY, RANGE, ATLEAST, and ATMOST. */
  var behavior: SheetSizeBehaviour
  /** This is only defined when behavior is EXACTLY, RANGE or ATMOST. */
  var maxSize: Double
  /** This is only defined when behavior is EXACTLY, RANGE, or ATLEAST. */
  var minSize: Double
}

object SheetSizeOptions {
  @scala.inline
  def apply(behavior: SheetSizeBehaviour, maxSize: Double, minSize: Double): SheetSizeOptions = {
    val __obj = js.Dynamic.literal(behavior = behavior.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SheetSizeOptions]
  }
}

