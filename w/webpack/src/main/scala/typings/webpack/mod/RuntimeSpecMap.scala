package typings.webpack.mod

import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuntimeSpecMap[T] extends StObject {
  
  def delete(): Unit = js.native
  def delete(runtime: Any): Unit = js.native
  
  def get(runtime: RuntimeSpec): T = js.native
  
  def has(runtime: RuntimeSpec): Boolean = js.native
  
  def keys(): js.Array[RuntimeSpec] = js.native
  
  def provide(): Any = js.native
  def provide(runtime: Any): Any = js.native
  def provide(runtime: Any, computer: Any): Any = js.native
  def provide(runtime: Unit, computer: Any): Any = js.native
  
  def set(): Unit = js.native
  def set(runtime: Any): Unit = js.native
  def set(runtime: Any, value: Any): Unit = js.native
  def set(runtime: Unit, value: Any): Unit = js.native
  
  def size: Double = js.native
  
  def update(): Unit = js.native
  def update(runtime: Any): Unit = js.native
  def update(runtime: Any, fn: Any): Unit = js.native
  def update(runtime: Unit, fn: Any): Unit = js.native
  
  def values(): IterableIterator[T] = js.native
}
