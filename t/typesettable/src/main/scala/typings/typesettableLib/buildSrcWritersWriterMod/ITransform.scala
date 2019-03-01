package typings
package typesettableLib.buildSrcWritersWriterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransform extends js.Object {
  /**
    * Rotation in degrees.
    */
  var rotate: scala.Double
  /**
    * Translation in pixels.
    */
  var translate: js.Tuple2[scala.Double, scala.Double]
}

object ITransform {
  @scala.inline
  def apply(rotate: scala.Double, translate: js.Tuple2[scala.Double, scala.Double]): ITransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rotate")(rotate)
    __obj.updateDynamic("translate")(translate)
    __obj.asInstanceOf[ITransform]
  }
}

