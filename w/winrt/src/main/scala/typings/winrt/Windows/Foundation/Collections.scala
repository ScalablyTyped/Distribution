package typings.winrt.Windows.Foundation

import typings.winrt.anon.First
import typings.winrt.anon.Index
import typings.winrt.anon.Items
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Collections {
  
  @js.native
  sealed trait CollectionChange extends StObject
  @JSGlobal("Windows.Foundation.Collections.CollectionChange")
  @js.native
  object CollectionChange extends StObject {
    
    @js.native
    sealed trait itemChanged extends CollectionChange
    
    @js.native
    sealed trait itemInserted extends CollectionChange
    
    @js.native
    sealed trait itemRemoved extends CollectionChange
    
    @js.native
    sealed trait reset extends CollectionChange
  }
  
  @js.native
  trait IIterable[T] extends StObject {
    
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
  
  @js.native
  trait IIterator[T] extends StObject {
    
    var current: T = js.native
    
    def getMany(): Items[T] = js.native
    
    var hasCurrent: Boolean = js.native
    
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
  
  @js.native
  trait IKeyValuePair[K, V] extends StObject {
    
    var key: K = js.native
    
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
  
  @js.native
  trait IMap[K, V] extends IIterable[IKeyValuePair[K, V]] {
    
    def clear(): Unit = js.native
    
    def getView(): IMapView[K, V] = js.native
    
    def hasKey(key: K): Boolean = js.native
    
    def insert(key: K, value: V): Boolean = js.native
    
    def lookup(key: K): V = js.native
    
    def remove(key: K): Unit = js.native
    
    var size: Double = js.native
  }
  object IMap {
    
    @scala.inline
    def apply[K, V](
      clear: () => Unit,
      first: () => IIterator[IKeyValuePair[K, V]],
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
  
  @js.native
  trait IMapChangedEventArgs[K] extends StObject {
    
    var collectionChange: CollectionChange = js.native
    
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
  
  @js.native
  trait IMapView[K, V] extends IIterable[IKeyValuePair[K, V]] {
    
    def hasKey(key: K): Boolean = js.native
    
    def lookup(key: K): V = js.native
    
    var size: Double = js.native
    
    def split(): First[K, V] = js.native
  }
  object IMapView {
    
    @scala.inline
    def apply[K, V](
      first: () => IIterator[IKeyValuePair[K, V]],
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
  
  @js.native
  trait IObservableMap[K, V] extends IMap[K, V] {
    
    var onmapchanged: js.Any = js.native
  }
  object IObservableMap {
    
    @scala.inline
    def apply[K, V](
      clear: () => Unit,
      first: () => IIterator[IKeyValuePair[K, V]],
      getView: () => IMapView[K, V],
      hasKey: K => Boolean,
      insert: (K, V) => Boolean,
      lookup: K => V,
      onmapchanged: js.Any,
      remove: K => Unit,
      size: Double
    ): IObservableMap[K, V] = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), first = js.Any.fromFunction0(first), getView = js.Any.fromFunction0(getView), hasKey = js.Any.fromFunction1(hasKey), insert = js.Any.fromFunction2(insert), lookup = js.Any.fromFunction1(lookup), onmapchanged = onmapchanged.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[IObservableMap[K, V]]
    }
    
    @scala.inline
    implicit class IObservableMapMutableBuilder[Self <: IObservableMap[_, _], K, V] (val x: Self with (IObservableMap[K, V])) extends AnyVal {
      
      @scala.inline
      def setOnmapchanged(value: js.Any): Self = StObject.set(x, "onmapchanged", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IObservableVector[T] extends IVector[T] {
    
    var onvectorchanged: js.Any = js.native
  }
  
  @js.native
  trait IPropertySet
    extends IObservableMap[String, js.Any]
  object IPropertySet {
    
    @scala.inline
    def apply(
      clear: () => Unit,
      first: () => IIterator[IKeyValuePair[String, js.Any]],
      getView: () => IMapView[String, js.Any],
      hasKey: String => Boolean,
      insert: (String, js.Any) => Boolean,
      lookup: String => js.Any,
      onmapchanged: js.Any,
      remove: String => Unit,
      size: Double
    ): IPropertySet = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), first = js.Any.fromFunction0(first), getView = js.Any.fromFunction0(getView), hasKey = js.Any.fromFunction1(hasKey), insert = js.Any.fromFunction2(insert), lookup = js.Any.fromFunction1(lookup), onmapchanged = onmapchanged.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPropertySet]
    }
  }
  
  @js.native
  trait IVector[T] extends IIterable[T] {
    
    def append(value: T): Unit = js.native
    
    def clear(): Unit = js.native
    
    def concat(items: js.Array[T]*): js.Array[T] = js.native
    
    def every(callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean]): Boolean = js.native
    def every(
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean],
      thisArg: js.Any
    ): Boolean = js.native
    
    def filter(callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean]): js.Array[T] = js.native
    def filter(
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean],
      thisArg: js.Any
    ): js.Array[T] = js.native
    
    def forEach(callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit]): Unit = js.native
    def forEach(
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit],
      thisArg: js.Any
    ): Unit = js.native
    
    def getAt(index: Double): T = js.native
    
    def getMany(startIndex: Double): Items[T] = js.native
    
    def getView(): IVectorView[T] = js.native
    
    def indexOf(value: T): Index = js.native
    
    def insertAt(index: Double, value: T): Unit = js.native
    
    def join(seperator: String): String = js.native
    
    def lastIndexOf(searchElement: T): Double = js.native
    def lastIndexOf(searchElement: T, fromIndex: Double): Double = js.native
    
    var length: Double = js.native
    
    def map(callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], _]): js.Array[_] = js.native
    def map(
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], _],
      thisArg: js.Any
    ): js.Array[_] = js.native
    
    def pop(): T = js.native
    
    def push(items: T*): Unit = js.native
    
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ js.Any, 
          /* currentValue */ js.Any, 
          /* currentIndex */ Double, 
          /* array */ js.Array[T], 
          _
        ]
    ): js.Any = js.native
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ js.Any, 
          /* currentValue */ js.Any, 
          /* currentIndex */ Double, 
          /* array */ js.Array[T], 
          _
        ],
      initialValue: js.Any
    ): js.Any = js.native
    
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ js.Any, 
          /* currentValue */ js.Any, 
          /* currentIndex */ Double, 
          /* array */ js.Array[T], 
          _
        ]
    ): js.Any = js.native
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ js.Any, 
          /* currentValue */ js.Any, 
          /* currentIndex */ Double, 
          /* array */ js.Array[T], 
          _
        ],
      initialValue: js.Any
    ): js.Any = js.native
    
    def removeAt(index: Double): Unit = js.native
    
    def removeAtEnd(): Unit = js.native
    
    def replaceAll(items: js.Array[T]): Unit = js.native
    
    def reverse(): js.Array[T] = js.native
    
    def setAt(index: Double, value: T): Unit = js.native
    
    def shift(): T = js.native
    
    var size: Double = js.native
    
    def slice(start: Double): js.Array[T] = js.native
    def slice(start: Double, end: Double): js.Array[T] = js.native
    
    def some(callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean]): Boolean = js.native
    def some(
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean],
      thisArg: js.Any
    ): Boolean = js.native
    
    def sort(): js.Array[T] = js.native
    def sort(compareFn: js.Function2[/* a */ T, /* b */ T, Double]): js.Array[T] = js.native
    
    def splice(start: Double): js.Array[T] = js.native
    def splice(start: Double, deleteCount: Double, items: T*): js.Array[T] = js.native
    
    def unshift(items: T*): Double = js.native
  }
  
  @js.native
  trait IVectorChangedEventArgs extends StObject {
    
    var collectionChange: CollectionChange = js.native
    
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
  
  @js.native
  trait IVectorView[T] extends IIterable[T] {
    
    def concat(items: js.Array[T]*): js.Array[T] = js.native
    
    def every(callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean]): Boolean = js.native
    def every(
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean],
      thisArg: js.Any
    ): Boolean = js.native
    
    def filter(callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean]): js.Array[T] = js.native
    def filter(
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean],
      thisArg: js.Any
    ): js.Array[T] = js.native
    
    def forEach(callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit]): Unit = js.native
    def forEach(
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit],
      thisArg: js.Any
    ): Unit = js.native
    
    def getAt(index: Double): T = js.native
    
    def getMany(startIndex: Double): Items[T] = js.native
    
    def indexOf(value: T): Index = js.native
    
    def join(seperator: String): String = js.native
    
    def lastIndexOf(searchElement: T): Double = js.native
    def lastIndexOf(searchElement: T, fromIndex: Double): Double = js.native
    
    var length: Double = js.native
    
    def map(callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], _]): js.Array[_] = js.native
    def map(
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], _],
      thisArg: js.Any
    ): js.Array[_] = js.native
    
    def pop(): T = js.native
    
    def push(items: T*): Unit = js.native
    
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ js.Any, 
          /* currentValue */ js.Any, 
          /* currentIndex */ Double, 
          /* array */ js.Array[T], 
          _
        ]
    ): js.Any = js.native
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ js.Any, 
          /* currentValue */ js.Any, 
          /* currentIndex */ Double, 
          /* array */ js.Array[T], 
          _
        ],
      initialValue: js.Any
    ): js.Any = js.native
    
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ js.Any, 
          /* currentValue */ js.Any, 
          /* currentIndex */ Double, 
          /* array */ js.Array[T], 
          _
        ]
    ): js.Any = js.native
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ js.Any, 
          /* currentValue */ js.Any, 
          /* currentIndex */ Double, 
          /* array */ js.Array[T], 
          _
        ],
      initialValue: js.Any
    ): js.Any = js.native
    
    def reverse(): js.Array[T] = js.native
    
    def shift(): T = js.native
    
    var size: Double = js.native
    
    def slice(start: Double): js.Array[T] = js.native
    def slice(start: Double, end: Double): js.Array[T] = js.native
    
    def some(callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean]): Boolean = js.native
    def some(
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean],
      thisArg: js.Any
    ): Boolean = js.native
    
    def sort(): js.Array[T] = js.native
    def sort(compareFn: js.Function2[/* a */ T, /* b */ T, Double]): js.Array[T] = js.native
    
    def splice(start: Double): js.Array[T] = js.native
    def splice(start: Double, deleteCount: Double, items: T*): js.Array[T] = js.native
    
    def unshift(items: T*): Double = js.native
  }
  
  type MapChangedEventHandler[K, V] = js.Function2[/* sender */ IObservableMap[K, V], /* event */ IMapChangedEventArgs[K], Unit]
  
  @js.native
  trait PropertySet extends IPropertySet
  object PropertySet {
    
    @scala.inline
    def apply(
      clear: () => Unit,
      first: () => IIterator[IKeyValuePair[String, js.Any]],
      getView: () => IMapView[String, js.Any],
      hasKey: String => Boolean,
      insert: (String, js.Any) => Boolean,
      lookup: String => js.Any,
      onmapchanged: js.Any,
      remove: String => Unit,
      size: Double
    ): PropertySet = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), first = js.Any.fromFunction0(first), getView = js.Any.fromFunction0(getView), hasKey = js.Any.fromFunction1(hasKey), insert = js.Any.fromFunction2(insert), lookup = js.Any.fromFunction1(lookup), onmapchanged = onmapchanged.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropertySet]
    }
  }
  
  @js.native
  trait ValueSet extends IPropertySet
  object ValueSet {
    
    @scala.inline
    def apply(
      clear: () => Unit,
      first: () => IIterator[IKeyValuePair[String, js.Any]],
      getView: () => IMapView[String, js.Any],
      hasKey: String => Boolean,
      insert: (String, js.Any) => Boolean,
      lookup: String => js.Any,
      onmapchanged: js.Any,
      remove: String => Unit,
      size: Double
    ): ValueSet = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), first = js.Any.fromFunction0(first), getView = js.Any.fromFunction0(getView), hasKey = js.Any.fromFunction1(hasKey), insert = js.Any.fromFunction2(insert), lookup = js.Any.fromFunction1(lookup), onmapchanged = onmapchanged.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueSet]
    }
  }
  
  type VectorChangedEventHandler[T] = js.Function2[/* sender */ IObservableVector[T], /* event */ IVectorChangedEventArgs, Unit]
}
