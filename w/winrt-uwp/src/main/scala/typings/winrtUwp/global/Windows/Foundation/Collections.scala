package typings.winrtUwp.global.Windows.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines standard, specialized, and generic collection objects. This includes the IIterable<T> , IVector<T> and IMap<K,V> generic interfaces, which are used as the pattern for basic collection support throughout the Windows Runtime API. */
object Collections {
  
  /** Describes the action that causes a change to a collection. */
  @JSGlobal("Windows.Foundation.Collections.CollectionChange")
  @js.native
  object CollectionChange extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Foundation.Collections.CollectionChange & Double] = js.native
    
    /* 3 */ val itemChanged: typings.winrtUwp.Windows.Foundation.Collections.CollectionChange.itemChanged & Double = js.native
    
    /* 1 */ val itemInserted: typings.winrtUwp.Windows.Foundation.Collections.CollectionChange.itemInserted & Double = js.native
    
    /* 2 */ val itemRemoved: typings.winrtUwp.Windows.Foundation.Collections.CollectionChange.itemRemoved & Double = js.native
    
    /* 0 */ val reset: typings.winrtUwp.Windows.Foundation.Collections.CollectionChange.reset & Double = js.native
  }
  
  /** Represents a property set, which is a set of PropertyValue objects with string keys. */
  @JSGlobal("Windows.Foundation.Collections.PropertySet")
  @js.native
  /** Creates and initializes a new instance of the property set. */
  open class PropertySet ()
    extends StObject
       with typings.winrtUwp.Windows.Foundation.Collections.PropertySet
  
  /** An associative collection, also known as a map or a dictionary. */
  @JSGlobal("Windows.Foundation.Collections.StringMap")
  @js.native
  /** Creates and initializes a new instance of the StringMap. */
  open class StringMap ()
    extends StObject
       with typings.winrtUwp.Windows.Foundation.Collections.StringMap
  
  /** Implements a map with keys of type String and values of type Object . This class prevents non-serializable types from being put into the map. */
  @JSGlobal("Windows.Foundation.Collections.ValueSet")
  @js.native
  /** Creates and initializes a new instance of the property set. */
  open class ValueSet ()
    extends StObject
       with typings.winrtUwp.Windows.Foundation.Collections.ValueSet
}
