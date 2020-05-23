package typings.winrtUwp.Windows.Graphics.Printing3D

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a composite material that's defined by a mixture of base materials. */
trait Printing3DCompositeMaterial extends js.Object {
  /** Gets the mixture of base materials used in the composite material. Each mixture is defined by listing the proportion of the overall mixture for each base material (values between 0 and 1). */
  var values: IVector[Double]
}

object Printing3DCompositeMaterial {
  @scala.inline
  def apply(values: IVector[Double]): Printing3DCompositeMaterial = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DCompositeMaterial]
  }
}

