package typings.winrtUwp.global.Windows.Graphics.Printing3D

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a composite material that's defined by a mixture of base materials. */
@JSGlobal("Windows.Graphics.Printing3D.Printing3DCompositeMaterial")
@js.native
/** Creates an instance of the Printing3DCompositeMaterial class. */
class Printing3DCompositeMaterial ()
  extends typings.winrtUwp.Windows.Graphics.Printing3D.Printing3DCompositeMaterial {
  /** Gets the mixture of base materials used in the composite material. Each mixture is defined by listing the proportion of the overall mixture for each base material (values between 0 and 1). */
  /* CompleteClass */
  override var values: IVector[Double] = js.native
}

