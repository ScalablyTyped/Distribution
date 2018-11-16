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

