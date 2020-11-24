package typings.transducersJs.mod

import typings.std.Iterable
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("transducers.js", "iterator")
@js.native
object iterator extends js.Object {
  
  def apply[T](coll: Iterable[T]): IterableIterator[T] = js.native
}
