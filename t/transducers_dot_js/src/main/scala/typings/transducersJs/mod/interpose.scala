package typings.transducersJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("transducers.js", "interpose")
@js.native
object interpose extends js.Object {
  
  def apply[TInput](sep: TInput): Transducer[TInput, TInput] = js.native
}
