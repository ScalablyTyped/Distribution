package typings
package atUifabricUtilitiesLib.libMathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFitContentToBoundsOptions extends js.Object {
  /**
    * The size of the bounds.
    */
  var boundsSize: atUifabricUtilitiesLib.libISizeMod.ISize
  /**
    * The size of the content to fit to the bounds.
    * The output will be proportional to this value.
    */
  var contentSize: atUifabricUtilitiesLib.libISizeMod.ISize
  /**
    * An optional maximum scale factor to apply. The default is 1.
    * Use Infinity for an unbounded resize.
    */
  var maxScale: js.UndefOr[scala.Double] = js.undefined
  /**
    * The fit mode to apply, either 'contain' or 'cover'.
    */
  var mode: FitMode
}

