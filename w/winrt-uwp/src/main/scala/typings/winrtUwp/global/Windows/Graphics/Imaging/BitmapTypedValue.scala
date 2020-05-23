package typings.winrtUwp.global.Windows.Graphics.Imaging

import typings.winrtUwp.Windows.Foundation.PropertyType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A value along with an enumeration specifying its data type. */
@JSGlobal("Windows.Graphics.Imaging.BitmapTypedValue")
@js.native
class BitmapTypedValue protected ()
  extends typings.winrtUwp.Windows.Graphics.Imaging.BitmapTypedValue {
  /**
    * Creates a new BitmapTypedValue object.
    * @param value The value to store.
    * @param type The type of the value parameter.
    */
  def this(value: js.Any, `type`: PropertyType) = this()
  /** Gets the PropertyType of the stored value. */
  /* CompleteClass */
  override var `type`: PropertyType = js.native
  /** Gets the stored value. */
  /* CompleteClass */
  override var value: js.Any = js.native
}

