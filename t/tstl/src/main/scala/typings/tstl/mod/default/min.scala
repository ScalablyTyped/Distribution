package typings.tstl.mod.default

import typings.tstl.comparatorMod.Comparator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl", "min")
@js.native
object min extends js.Object {
  
  def apply[T](items: js.Array[T]): T = js.native
  def apply[T](items: js.Array[T], comp: Comparator[T, T]): T = js.native
}
