package typings.utilPromisify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("util.promisify/polyfill", JSImport.Namespace)
@js.native
object polyfillMod extends js.Object {
  // tslint:disable:ban-types max-line-length
  @js.native
  trait CustomPromisify[TCustom /* <: js.Function */]
    extends js.Function {
    var __promisify__ : TCustom = js.native
  }
  
  def apply(): js.Function1[/* fn */ js.Function, js.Function] = js.native
}

