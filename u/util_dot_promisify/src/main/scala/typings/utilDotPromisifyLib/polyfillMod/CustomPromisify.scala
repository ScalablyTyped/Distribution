package typings
package utilDotPromisifyLib.polyfillMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable:ban-types max-line-length
@js.native
trait CustomPromisify[TCustom /* <: js.Function */]
  extends js.Function {
  var __promisify__ : TCustom = js.native
}

