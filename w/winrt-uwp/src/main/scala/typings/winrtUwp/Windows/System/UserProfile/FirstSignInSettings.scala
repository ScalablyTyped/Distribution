package typings.winrtUwp.Windows.System.UserProfile

import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typings.winrtUwp.anon.Second
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a collection of settings that a user can opt-in to during the first run experience. */
@js.native
trait FirstSignInSettings extends js.Object {
  
  /**
    * Returns an iterator for the items in the collection.
    * @return The iterator.
    */
  def first(): IIterator[IKeyValuePair[_, _]] = js.native
  
  /**
    * Determines whether the map view contains the specified key.
    * @param key The key to locate in the map view.
    * @return true if the key is found; otherwise, false.
    */
  def hasKey(key: String): Boolean = js.native
  
  /**
    * Returns the item in the map view with the specified key.
    * @param key The key to locate in the map view.
    * @return The item associated with the specified key.
    */
  def lookup(key: String): js.Any = js.native
  
  /** Returns the number of elements in the map. */
  var size: Double = js.native
  
  /**
    * Splits the map view into two views.
    */
  def split(): Second = js.native
}
object FirstSignInSettings {
  
  @scala.inline
  def apply(
    first: () => IIterator[IKeyValuePair[_, _]],
    hasKey: String => Boolean,
    lookup: String => js.Any,
    size: Double,
    split: () => Second
  ): FirstSignInSettings = {
    val __obj = js.Dynamic.literal(first = js.Any.fromFunction0(first), hasKey = js.Any.fromFunction1(hasKey), lookup = js.Any.fromFunction1(lookup), size = size.asInstanceOf[js.Any], split = js.Any.fromFunction0(split))
    __obj.asInstanceOf[FirstSignInSettings]
  }
  
  @scala.inline
  implicit class FirstSignInSettingsOps[Self <: FirstSignInSettings] (val x: Self) extends AnyVal {
    
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
    def setLookup(value: String => js.Any): Self = this.set("lookup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplit(value: () => Second): Self = this.set("split", js.Any.fromFunction0(value))
  }
}
