package typings.utilDotPromisify.utilDotPromisifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable:ban-types
@js.native
trait CustomPromisify[TCustom /* <: js.Function */]
  extends js.Function {
  var __promisify__ : TCustom = js.native
}

