package typings
package typesettableLib.buildSrcWritersWriterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWriteOptions extends js.Object {
  /**
    * An optional cardinal-direction rotation for the whole text block.
    *
    * Supported rotations are -90, 0, 180, and 90.
    *
    * @default 0
    */
  var textRotation: js.UndefOr[scala.Double] = js.undefined
  /**
    * An optional shear angle. Shearing allows the rotation and re-alignment of
    * individual lines as opposed to the whole text block.
    *
    * Supported shears are between -80 and 80 degrees.
    *
    * @default 0
    */
  var textShear: js.UndefOr[scala.Double] = js.undefined
  /**
    * The x-alignment of text.
    *
    * @default "left"
    */
  var xAlign: js.UndefOr[IXAlign] = js.undefined
  /**
    * The y-alignment of text.
    *
    * @default "top"
    */
  var yAlign: js.UndefOr[IYAlign] = js.undefined
}

object IWriteOptions {
  @scala.inline
  def apply(
    textRotation: scala.Int | scala.Double = null,
    textShear: scala.Int | scala.Double = null,
    xAlign: IXAlign = null,
    yAlign: IYAlign = null
  ): IWriteOptions = {
    val __obj = js.Dynamic.literal()
    if (textRotation != null) __obj.updateDynamic("textRotation")(textRotation.asInstanceOf[js.Any])
    if (textShear != null) __obj.updateDynamic("textShear")(textShear.asInstanceOf[js.Any])
    if (xAlign != null) __obj.updateDynamic("xAlign")(xAlign)
    if (yAlign != null) __obj.updateDynamic("yAlign")(yAlign)
    __obj.asInstanceOf[IWriteOptions]
  }
}

