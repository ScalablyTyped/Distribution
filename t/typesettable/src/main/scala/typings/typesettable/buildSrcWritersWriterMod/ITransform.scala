package typings.typesettable.buildSrcWritersWriterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransform extends js.Object {
  /**
    * Rotation in degrees.
    */
  var rotate: Double
  /**
    * Translation in pixels.
    */
  var translate: js.Tuple2[Double, Double]
}

object ITransform {
  @scala.inline
  def apply(rotate: Double, translate: js.Tuple2[Double, Double]): ITransform = {
    val __obj = js.Dynamic.literal(rotate = rotate, translate = translate)
  
    __obj.asInstanceOf[ITransform]
  }
}

