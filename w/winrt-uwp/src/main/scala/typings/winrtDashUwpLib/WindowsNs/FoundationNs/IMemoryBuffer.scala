package typings
package winrtDashUwpLib.WindowsNs.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a reference counted memory buffer. */
trait IMemoryBuffer extends IClosable {
  /**
    * Returns a new managed object that implements the IMemoryBufferReference interface.
    * @return A new managed object that implements the IMemoryBufferReference interface.
    */
  def createReference(): IMemoryBufferReference
}

object IMemoryBuffer {
  @scala.inline
  def apply(close: js.Function0[scala.Unit], createReference: js.Function0[IMemoryBufferReference]): IMemoryBuffer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("createReference")(createReference)
    __obj.asInstanceOf[IMemoryBuffer]
  }
}

