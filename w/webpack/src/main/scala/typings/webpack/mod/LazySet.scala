package typings.webpack.mod

import typings.std.IterableIterator
import typings.std.Set
import typings.webpack.anon.Write
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LazySet[T] extends StObject {
  
  def add(item: T): LazySet[T] = js.native
  
  def addAll(iterable: js.Iterable[T]): LazySet[T] = js.native
  def addAll(iterable: LazySet[T]): LazySet[T] = js.native
  
  def clear(): Unit = js.native
  
  def delete(value: T): Boolean = js.native
  
  def entries(): IterableIterator[js.Tuple2[T, T]] = js.native
  
  def forEach(callbackFn: js.Function3[/* arg0 */ T, /* arg1 */ T, /* arg2 */ Set[T], Unit]): Unit = js.native
  def forEach(callbackFn: js.Function3[/* arg0 */ T, /* arg1 */ T, /* arg2 */ Set[T], Unit], thisArg: Any): Unit = js.native
  
  def has(item: T): Boolean = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[T]] = js.native
  
  def keys(): IterableIterator[T] = js.native
  
  def serialize(__0: Write): Unit = js.native
  
  def size: Double = js.native
  
  def values(): IterableIterator[T] = js.native
}
