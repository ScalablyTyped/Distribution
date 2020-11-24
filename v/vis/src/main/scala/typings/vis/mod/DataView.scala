package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vis", "DataView")
@js.native
class DataView[T /* <: DataItem | DataGroup */] protected () extends js.Object {
  def this(items: js.Array[T]) = this()
  
  var length: Double = js.native
}
