package typings.winrtUwp.Windows.Foundation

import typings.std.Array
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.anon.First
import typings.winrtUwp.anon.Index
import typings.winrtUwp.anon.Items
import typings.winrtUwp.winrtUwpStrings.mapchanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines standard, specialized, and generic collection objects. This includes the IIterable<T> , IVector<T> and IMap<K,V> generic interfaces, which are used as the pattern for basic collection support throughout the Windows Runtime API. */
object Collections {
  
  @js.native
  sealed trait CollectionChange extends StObject
  /** Describes the action that causes a change to a collection. */
  @JSGlobal("Windows.Foundation.Collections.CollectionChange")
  @js.native
  object CollectionChange extends StObject {
    
    /** An item is changed in the collection. */
    @js.native
    sealed trait itemChanged extends CollectionChange
    
    /** An item is added to the collection. */
    @js.native
    sealed trait itemInserted extends CollectionChange
    
    /** An item is removed from the collection. */
    @js.native
    sealed trait itemRemoved extends CollectionChange
    
    /** The collection is changed. */
    @js.native
    sealed trait reset extends CollectionChange
  }
  
  /** Exposes an iterator that supports simple iteration over a collection of a specified type. */
  @js.native
  trait IIterable[T] extends StObject {
    
    /**
      * Returns an iterator for the items in the collection.
      * @return The iterator.
      */
    def first(): IIterator[T] = js.native
  }
  object IIterable {
    
    @scala.inline
    def apply[T](first: () => IIterator[T]): IIterable[T] = {
      val __obj = js.Dynamic.literal(first = js.Any.fromFunction0(first))
      __obj.asInstanceOf[IIterable[T]]
    }
    
    @scala.inline
    implicit class IIterableMutableBuilder[Self <: IIterable[_], T] (val x: Self with IIterable[T]) extends AnyVal {
      
      @scala.inline
      def setFirst(value: () => IIterator[T]): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
    }
  }
  
  /** Supports simple iteration over a collection. */
  @js.native
  trait IIterator[T] extends StObject {
    
    /** Gets the current item in the collection. */
    var current: T = js.native
    
    /**
      * Retrieves all items in the collection.
      */
    def getMany(): Items[T] = js.native
    
    /** Gets a value that indicates whether the iterator refers to a current item or is at the end of the collection. */
    var hasCurrent: Boolean = js.native
    
    /**
      * Advances the iterator to the next item in the collection.
      * @return True if the iterator refers to a valid item in the collection; false if the iterator passes the end of the collection.
      */
    def moveNext(): Boolean = js.native
  }
  object IIterator {
    
    @scala.inline
    def apply[T](current: T, getMany: () => Items[T], hasCurrent: Boolean, moveNext: () => Boolean): IIterator[T] = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], getMany = js.Any.fromFunction0(getMany), hasCurrent = hasCurrent.asInstanceOf[js.Any], moveNext = js.Any.fromFunction0(moveNext))
      __obj.asInstanceOf[IIterator[T]]
    }
    
    @scala.inline
    implicit class IIteratorMutableBuilder[Self <: IIterator[_], T] (val x: Self with IIterator[T]) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: T): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetMany(value: () => Items[T]): Self = StObject.set(x, "getMany", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasCurrent(value: Boolean): Self = StObject.set(x, "hasCurrent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoveNext(value: () => Boolean): Self = StObject.set(x, "moveNext", js.Any.fromFunction0(value))
    }
  }
  
  /** Represents a key-value pair. This is typically used as a constraint type when you need to encapsulate two type parameters into one to satisfy the constraints of another generic interface. */
  @js.native
  trait IKeyValuePair[K, V] extends StObject {
    
    /** Gets the key of the key-value pair. */
    var key: K = js.native
    
    /** Gets the value of the key-value pair. */
    var value: V = js.native
  }
  object IKeyValuePair {
    
    @scala.inline
    def apply[K, V](key: K, value: V): IKeyValuePair[K, V] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IKeyValuePair[K, V]]
    }
    
    @scala.inline
    implicit class IKeyValuePairMutableBuilder[Self <: IKeyValuePair[_, _], K, V] (val x: Self with (IKeyValuePair[K, V])) extends AnyVal {
      
      @scala.inline
      def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents an associative collection, also known as a map or a dictionary. */
  @js.native
  trait IMap[K, V]
    extends IIterable[IKeyValuePair[js.Any, js.Any]] {
    
    /** Removes all items from the map. */
    def clear(): Unit = js.native
    
    /**
      * Returns an immutable view of the map.
      * @return The view of the map.
      */
    def getView(): IMapView[K, V] = js.native
    
    /**
      * Determines whether the map contains the specified key.
      * @param key The key associated with the item to locate.
      * @return True if the key is found; otherwise, false.
      */
    def hasKey(key: K): Boolean = js.native
    
    /**
      * Inserts or replaces an item in the map.
      * @param key The key associated with the item to insert.
      * @param value The item to insert.
      * @return True if an item with the specified key is an existing item that was replaced; otherwise, false.
      */
    def insert(key: K, value: V): Boolean = js.native
    
    /**
      * Returns the item at the specified key in the map.
      * @param key The key associated with the item to locate.
      * @return The item associated with the specified key.
      */
    def lookup(key: K): V = js.native
    
    /**
      * Removes an item from the map.
      * @param key The key associated with the item to remove.
      */
    def remove(key: K): Unit = js.native
    
    /** Gets the number of items in the map. */
    var size: Double = js.native
  }
  object IMap {
    
    @scala.inline
    def apply[K, V](
      clear: () => Unit,
      first: () => IIterator[IKeyValuePair[js.Any, js.Any]],
      getView: () => IMapView[K, V],
      hasKey: K => Boolean,
      insert: (K, V) => Boolean,
      lookup: K => V,
      remove: K => Unit,
      size: Double
    ): IMap[K, V] = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), first = js.Any.fromFunction0(first), getView = js.Any.fromFunction0(getView), hasKey = js.Any.fromFunction1(hasKey), insert = js.Any.fromFunction2(insert), lookup = js.Any.fromFunction1(lookup), remove = js.Any.fromFunction1(remove), size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMap[K, V]]
    }
    
    @scala.inline
    implicit class IMapMutableBuilder[Self <: IMap[_, _], K, V] (val x: Self with (IMap[K, V])) extends AnyVal {
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetView(value: () => IMapView[K, V]): Self = StObject.set(x, "getView", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasKey(value: K => Boolean): Self = StObject.set(x, "hasKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInsert(value: (K, V) => Boolean): Self = StObject.set(x, "insert", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLookup(value: K => V): Self = StObject.set(x, "lookup", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemove(value: K => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  /** Provides data for the changed event of a map collection. */
  @js.native
  trait IMapChangedEventArgs[K] extends StObject {
    
    /** Gets the type of change that occurred in the map. */
    var collectionChange: CollectionChange = js.native
    
    /** Gets the key of the item that changed. */
    var key: K = js.native
  }
  object IMapChangedEventArgs {
    
    @scala.inline
    def apply[K](collectionChange: CollectionChange, key: K): IMapChangedEventArgs[K] = {
      val __obj = js.Dynamic.literal(collectionChange = collectionChange.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMapChangedEventArgs[K]]
    }
    
    @scala.inline
    implicit class IMapChangedEventArgsMutableBuilder[Self <: IMapChangedEventArgs[_], K] (val x: Self with IMapChangedEventArgs[K]) extends AnyVal {
      
      @scala.inline
      def setCollectionChange(value: CollectionChange): Self = StObject.set(x, "collectionChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
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
    implicit class IMapViewMutableBuilder[Self <: IMapView[_, _], K, V] (val x: Self with (IMapView[K, V])) extends AnyVal {
      
      @scala.inline
      def setHasKey(value: K => Boolean): Self = StObject.set(x, "hasKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLookup(value: K => V): Self = StObject.set(x, "lookup", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplit(value: () => First[K, V]): Self = StObject.set(x, "split", js.Any.fromFunction0(value))
    }
  }
  
  /** Notifies listeners of dynamic changes to a map, such as when items are added or removed. */
  @js.native
  trait IObservableMap[K, V] extends IMap[K, V]
  object IObservableMap {
    
    @scala.inline
    def apply[K, V](
      clear: () => Unit,
      first: () => IIterator[IKeyValuePair[js.Any, js.Any]],
      getView: () => IMapView[K, V],
      hasKey: K => Boolean,
      insert: (K, V) => Boolean,
      lookup: K => V,
      remove: K => Unit,
      size: Double
    ): IObservableMap[K, V] = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), first = js.Any.fromFunction0(first), getView = js.Any.fromFunction0(getView), hasKey = js.Any.fromFunction1(hasKey), insert = js.Any.fromFunction2(insert), lookup = js.Any.fromFunction1(lookup), remove = js.Any.fromFunction1(remove), size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[IObservableMap[K, V]]
    }
  }
  
  /** Notifies listeners of changes to the vector. */
  @js.native
  trait IObservableVector[T] extends IVector[T]
  
  /** Represents a collection of key-value pairs, correlating several other collection interfaces. */
  @js.native
  trait IPropertySet
    extends IObservableMap[String, js.Any]
  object IPropertySet {
    
    @scala.inline
    def apply(
      clear: () => Unit,
      first: () => IIterator[IKeyValuePair[js.Any, js.Any]],
      getView: () => IMapView[String, js.Any],
      hasKey: String => Boolean,
      insert: (String, js.Any) => Boolean,
      lookup: String => js.Any,
      remove: String => Unit,
      size: Double
    ): IPropertySet = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), first = js.Any.fromFunction0(first), getView = js.Any.fromFunction0(getView), hasKey = js.Any.fromFunction1(hasKey), insert = js.Any.fromFunction2(insert), lookup = js.Any.fromFunction1(lookup), remove = js.Any.fromFunction1(remove), size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPropertySet]
    }
  }
  
  /** Represents a random-access collection of elements. */
  @js.native
  trait IVector[T]
    extends Array[T]
       with IIterable[T] {
    
    /**
      * Appends an item to the end of the vector.
      * @param value The item to append to the vector.
      */
    def append(value: T): Unit = js.native
    
    /** Removes all items from the vector. */
    def clear(): Unit = js.native
    
    /**
      * Returns the item at the specified index in the vector.
      * @param index The zero-based index of the item.
      * @return The item at the specified index.
      */
    def getAt(index: Double): T = js.native
    
    /**
      * Retrieves the items that start at the specified index in the vector.
      * @param startIndex The zero-based index of the start of the items in the vector.
      */
    def getMany(startIndex: Double): Items[T] = js.native
    
    /**
      * Returns an immutable view of the vector.
      * @return The view of the vector.
      */
    def getView(): IVectorView[T] = js.native
    
    def indexOf(value: T, extra: js.Any*): Index = js.native
    /* hack */
    @JSName("indexOf")
    def indexOf_Double(searchElement: T): Double = js.native
    
    /**
      * Inserts an item at a specified index in the vector.
      * @param index The zero-based index.
      * @param value The item to insert.
      */
    def insertAt(index: Double, value: T): Unit = js.native
    
    /**
      * Removes the item at the specified index in the vector.
      * @param index The zero-based index of the vector item to remove.
      */
    def removeAt(index: Double): Unit = js.native
    
    /** Removes the last item from the vector. */
    def removeAtEnd(): Unit = js.native
    
    /**
      * Replaces all the items in the vector with the specified items.
      * @param items The collection of items to add to the vector.
      */
    def replaceAll(items: T): Unit = js.native
    
    /**
      * Sets the value at the specified index in the vector.
      * @param index The zero-based index at which to set the value.
      * @param value The item to set.
      */
    def setAt(index: Double, value: T): Unit = js.native
    
    /** Gets the number of items in the vector. */
    var size: Double = js.native
  }
  
  /** Provides data for the changed event of a vector. */
  @js.native
  trait IVectorChangedEventArgs extends StObject {
    
    /** Gets the type of change that occurred in the vector. */
    var collectionChange: CollectionChange = js.native
    
    /** Gets the position where the change occurred in the vector. */
    var index: Double = js.native
  }
  object IVectorChangedEventArgs {
    
    @scala.inline
    def apply(collectionChange: CollectionChange, index: Double): IVectorChangedEventArgs = {
      val __obj = js.Dynamic.literal(collectionChange = collectionChange.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[IVectorChangedEventArgs]
    }
    
    @scala.inline
    implicit class IVectorChangedEventArgsMutableBuilder[Self <: IVectorChangedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollectionChange(value: CollectionChange): Self = StObject.set(x, "collectionChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents an immutable view into a vector. */
  @js.native
  trait IVectorView[T]
    extends Array[T]
       with IIterable[T] {
    
    /**
      * Returns the item at the specified index in the vector view.
      * @param index The zero-based index of the item.
      * @return The item at the specified index.
      */
    def getAt(index: Double): T = js.native
    
    /**
      * Retrieves the items that start at the specified index in the vector view.
      * @param startIndex The zero-based index of the start of the items in the vector view.
      */
    def getMany(startIndex: Double): Items[T] = js.native
    
    def indexOf(value: T, extra: js.Any*): Index = js.native
    /* hack */
    @JSName("indexOf")
    def indexOf_Double(searchElement: T): Double = js.native
    
    /** Gets the number of items in the vector view. */
    var size: Double = js.native
  }
  
  /** Represents the method that handles the changed event of an observable map. */
  type MapChangedEventHandler[K, V] = js.Function1[/* ev */ IMapChangedEventArgs[K] with (WinRTEvent[IObservableMap[K, V]]), Unit]
  
  /** Represents a property set, which is a set of PropertyValue objects with string keys. */
  @js.native
  trait PropertySet extends StObject {
    
    def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mapchanged(`type`: mapchanged, listener: MapChangedEventHandler[String, _]): Unit = js.native
    
    /** Removes all items from the property set. */
    def clear(): Unit = js.native
    
    /**
      * Returns an iterator to enumerate the items in the property set.
      * @return The iterator. The current position of the iterator is index 0, or the end of the property set if the property set is empty.
      */
    def first(): IIterator[IKeyValuePair[_, _]] = js.native
    
    /**
      * Gets an immutable view of the property set.
      * @return The immutable view.
      */
    def getView(): IMapView[String, _] = js.native
    
    /**
      * Indicates whether the property set has an item with the specified key.
      * @param key The key.
      * @return True if the property set has an item with the specified key; otherwise, false.
      */
    def hasKey(key: String): Boolean = js.native
    
    /**
      * Adds an item to the property set.
      * @param key The key to insert.
      * @param value The value to insert.
      * @return True if the method replaces a value that already exists for the key; false if this is a new key.
      */
    def insert(key: String, value: js.Any): Boolean = js.native
    
    /**
      * Retrieves the value for the specified key.
      * @param key The key.
      * @return The value, if an item with the specified key exists; otherwise, null.
      */
    def lookup(key: String): js.Any = js.native
    
    /** Occurs when the observable map has changed. */
    def onmapchanged(ev: IMapChangedEventArgs[String] with (WinRTEvent[IObservableMap[String, _]])): Unit = js.native
    /** Occurs when the observable map has changed. */
    @JSName("onmapchanged")
    var onmapchanged_Original: MapChangedEventHandler[String, _] = js.native
    
    /**
      * Removes a specific item from the PropertySet .
      * @param key The key of the item to remove.
      * @return true if the item was removed, otherwise false.
      */
    def remove(key: String): Boolean = js.native
    
    def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mapchanged(`type`: mapchanged, listener: MapChangedEventHandler[String, _]): Unit = js.native
    
    /**
      * Removes an item from the property set.
      * @param key The key.
      */
    @JSName("remove")
    def remove_Unit(key: String): Unit = js.native
    
    /** Gets the number of items contained in the property set. */
    var size: Double = js.native
  }
  
  /** An associative collection, also known as a map or a dictionary. */
  @js.native
  trait StringMap extends StObject {
    
    def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mapchanged(`type`: mapchanged, listener: MapChangedEventHandler[String, String]): Unit = js.native
    
    /** Removes all items from the map. */
    def clear(): Unit = js.native
    
    /**
      * Returns an iterator containing the items in the collection.
      * @return The items in the collection.
      */
    def first(): IIterator[IKeyValuePair[_, _]] = js.native
    
    /**
      * Returns an immutable view of the map.
      * @return The view of the map.
      */
    def getView(): IMapView[String, String] = js.native
    
    /**
      * Determines whether the map contains the specified key.
      * @param key The key associated with the item to locate.
      * @return True if the key is found; otherwise, false.
      */
    def hasKey(key: String): Boolean = js.native
    
    /**
      * Inserts or replaces an item in the map.
      * @param key The key associated with the item to insert.
      * @param value The item to insert.
      * @return True if an item with the specified key is an existing item that was replaced; otherwise, false.
      */
    def insert(key: String, value: String): Boolean = js.native
    
    /**
      * Returns the item at the specified key in the map.
      * @param key The key associated with the item to locate.
      * @return The item associated with the specified key.
      */
    def lookup(key: String): String = js.native
    
    /** Occurs when the contents of the map change. */
    def onmapchanged(ev: IMapChangedEventArgs[String] with (WinRTEvent[IObservableMap[String, String]])): Unit = js.native
    /** Occurs when the contents of the map change. */
    @JSName("onmapchanged")
    var onmapchanged_Original: MapChangedEventHandler[String, String] = js.native
    
    /**
      * Removes an item from the map.
      * @param key The key associated with the item to remove.
      */
    def remove(key: String): Unit = js.native
    
    def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mapchanged(`type`: mapchanged, listener: MapChangedEventHandler[String, String]): Unit = js.native
    
    /** Gets the number of items in the map. */
    var size: Double = js.native
  }
  
  /** Implements a map with keys of type String and values of type Object . This class prevents non-serializable types from being put into the map. */
  @js.native
  trait ValueSet extends StObject {
    
    def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_mapchanged(`type`: mapchanged, listener: MapChangedEventHandler[String, _]): Unit = js.native
    
    /** Removes all items from the value set. */
    def clear(): Unit = js.native
    
    /**
      * Returns an iterator to enumerate the items in the value set.
      * @return The iterator. The current position of the iterator is index 0, or the end of the value set if the value set is empty.
      */
    def first(): IIterator[IKeyValuePair[_, _]] = js.native
    
    /**
      * Gets an immutable view of the value set.
      * @return The immutable view.
      */
    def getView(): IMapView[String, _] = js.native
    
    /**
      * Indicates whether the value set has an item with the specified key.
      * @param key The key.
      * @return True if the value set has an item with the specified key; otherwise, false.
      */
    def hasKey(key: String): Boolean = js.native
    
    /**
      * Adds an item to the value set.
      * @param key The key to insert.
      * @param value The value to insert.
      * @return True if the method replaces a value that already exists for the key; false if this is a new key.
      */
    def insert(key: String, value: js.Any): Boolean = js.native
    
    /**
      * Retrieves the value for the specified key.
      * @param key The key.
      * @return The value, if an item with the specified key exists; otherwise, null.
      */
    def lookup(key: String): js.Any = js.native
    
    /** Occurs when the observable map has changed. */
    def onmapchanged(ev: IMapChangedEventArgs[String] with (WinRTEvent[IObservableMap[String, _]])): Unit = js.native
    /** Occurs when the observable map has changed. */
    @JSName("onmapchanged")
    var onmapchanged_Original: MapChangedEventHandler[String, _] = js.native
    
    /**
      * Removes an item from the value set.
      * @param key The key.
      */
    def remove(key: String): Unit = js.native
    
    def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_mapchanged(`type`: mapchanged, listener: MapChangedEventHandler[String, _]): Unit = js.native
    
    /**
      * Removes a specific item from the ValueSet .
      * @param key The key of the item to remove.
      * @return true if the item was removed, otherwise false.
      */
    @JSName("remove")
    def remove_Boolean(key: String): Boolean = js.native
    
    /** Gets the number of items contained in the value set. */
    var size: Double = js.native
  }
}
