package typings.winrtUwp.global.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines standard, specialized, and generic collection objects. This includes the IIterable<T> , IVector<T> and IMap<K,V> generic interfaces, which are used as the pattern for basic collection support throughout the Windows Runtime API. */
@JSGlobal("Windows.Foundation.Collections")
@js.native
object Collections extends js.Object {
  
  /** Describes the action that causes a change to a collection. */
  @js.native
  object CollectionChange extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Foundation.Collections.CollectionChange with Double] = js.native
    
    /* 3 */ val itemChanged: typings.winrtUwp.Windows.Foundation.Collections.CollectionChange.itemChanged with Double = js.native
    
    /* 1 */ val itemInserted: typings.winrtUwp.Windows.Foundation.Collections.CollectionChange.itemInserted with Double = js.native
    
    /* 2 */ val itemRemoved: typings.winrtUwp.Windows.Foundation.Collections.CollectionChange.itemRemoved with Double = js.native
    
    /* 0 */ val reset: typings.winrtUwp.Windows.Foundation.Collections.CollectionChange.reset with Double = js.native
  }
  
  /** Represents a property set, which is a set of PropertyValue objects with string keys. */
  @js.native
  /** Creates and initializes a new instance of the property set. */
  class PropertySet ()
    extends typings.winrtUwp.Windows.Foundation.Collections.PropertySet
  
  /** An associative collection, also known as a map or a dictionary. */
  @js.native
  /** Creates and initializes a new instance of the StringMap. */
  class StringMap ()
    extends typings.winrtUwp.Windows.Foundation.Collections.StringMap
  
  /** Implements a map with keys of type String and values of type Object . This class prevents non-serializable types from being put into the map. */
  @js.native
  /** Creates and initializes a new instance of the property set. */
  class ValueSet ()
    extends typings.winrtUwp.Windows.Foundation.Collections.ValueSet
}
