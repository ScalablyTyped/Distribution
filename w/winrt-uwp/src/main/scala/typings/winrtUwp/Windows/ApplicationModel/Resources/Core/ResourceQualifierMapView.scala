package typings.winrtUwp.Windows.ApplicationModel.Resources.Core

import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typings.winrtUwp.anon.SecondIMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An unchangeable view into a map of ResourceQualifier objects. */
@js.native
trait ResourceQualifierMapView extends js.Object {
  
  /**
    * Returns an iterator to enumerate the items in the map view.
    * @return The iterator. The current position of the iterator is index 0, or the end of the map view if the map view is empty.
    */
  def first(): IIterator[IKeyValuePair[_, _]] = js.native
  
  /**
    * Determines whether the map view contains the specified key.
    * @param key The key to locate in the map view.
    * @return TRUE if the key is found, otherwise FALSE if it is not found.
    */
  def hasKey(key: String): Boolean = js.native
  
  /**
    * Returns the qualifier name at the specified key in the map view.
    * @param key The key to locate in the map view.
    * @return The qualifier name associated with the specified key.
    */
  def lookup(key: String): String = js.native
  
  /** Gets the number of ResourceQualifier objects in the map. */
  var size: Double = js.native
  
  /**
    * Splits the map view into two views.
    */
  def split(): SecondIMapView = js.native
}
object ResourceQualifierMapView {
  
  @scala.inline
  def apply(
    first: () => IIterator[IKeyValuePair[_, _]],
    hasKey: String => Boolean,
    lookup: String => String,
    size: Double,
    split: () => SecondIMapView
  ): ResourceQualifierMapView = {
    val __obj = js.Dynamic.literal(first = js.Any.fromFunction0(first), hasKey = js.Any.fromFunction1(hasKey), lookup = js.Any.fromFunction1(lookup), size = size.asInstanceOf[js.Any], split = js.Any.fromFunction0(split))
    __obj.asInstanceOf[ResourceQualifierMapView]
  }
  
  @scala.inline
  implicit class ResourceQualifierMapViewOps[Self <: ResourceQualifierMapView] (val x: Self) extends AnyVal {
    
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
    def setFirst(value: () => IIterator[IKeyValuePair[_, _]]): Self = this.set("first", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasKey(value: String => Boolean): Self = this.set("hasKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLookup(value: String => String): Self = this.set("lookup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplit(value: () => SecondIMapView): Self = this.set("split", js.Any.fromFunction0(value))
  }
}
