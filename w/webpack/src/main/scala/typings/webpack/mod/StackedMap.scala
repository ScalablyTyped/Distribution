package typings.webpack.mod

import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackedMap[K, V] extends StObject {
  
  def asArray(): js.Array[K] = js.native
  
  def asMap(): Map[K, Cell[V]] = js.native
  
  def asPairArray(): js.Array[js.Tuple2[K, Cell[V]]] = js.native
  
  def asSet(): Set[K] = js.native
  
  def createChild(): StackedMap[K, V] = js.native
  
  def delete(item: K): Unit = js.native
  
  def get(item: K): Cell[V] = js.native
  
  def has(item: K): Boolean = js.native
  
  var map: Map[K, InternalCell[V]] = js.native
  
  def set(item: K, value: V): Unit = js.native
  
  def size: Double = js.native
  
  var stack: js.Array[Map[K, InternalCell[V]]] = js.native
}
