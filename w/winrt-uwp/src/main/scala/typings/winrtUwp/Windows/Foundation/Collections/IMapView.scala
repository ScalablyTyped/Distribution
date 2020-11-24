package typings.winrtUwp.Windows.Foundation.Collections

import typings.winrtUwp.anon.First
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an immutable view into a map. */
@js.native
trait IMapView[K, V]
  extends IIterable[IKeyValuePair[js.Any, js.Any]] {
  
  /**
    * Determines whether the map view contains the specified key.
    * @param key The key to locate in the map view.
    * @return True if the key is found; otherwise, false.
    */
  def hasKey(key: K): Boolean = js.native
  
  /**
    * Returns the item at the specified key in the map view.
    * @param key The key to locate in the map view.
    * @return The item associated with the specified key.
    */
  def lookup(key: K): V = js.native
  
  /** Gets the number of elements in the map. */
  var size: Double = js.native
  
  /**
    * Splits the map view into two views.
    */
  def split(): First[K, V] = js.native
}
object IMapView {
  
  @scala.inline
  def apply[K, V](
    first: () => IIterator[IKeyValuePair[js.Any, js.Any]],
    hasKey: K => Boolean,
    lookup: K => V,
    size: Double,
    split: () => First[K, V]
  ): IMapView[K, V] = {
    val __obj = js.Dynamic.literal(first = js.Any.fromFunction0(first), hasKey = js.Any.fromFunction1(hasKey), lookup = js.Any.fromFunction1(lookup), size = size.asInstanceOf[js.Any], split = js.Any.fromFunction0(split))
    __obj.asInstanceOf[IMapView[K, V]]
  }
  
  @scala.inline
  implicit class IMapViewOps[Self <: IMapView[_, _], K, V] (val x: Self with (IMapView[K, V])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHasKey(value: K => Boolean): Self = this.set("hasKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLookup(value: K => V): Self = this.set("lookup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplit(value: () => First[K, V]): Self = this.set("split", js.Any.fromFunction0(value))
  }
}
