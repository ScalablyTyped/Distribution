package typings.typescriptServices.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Collections {
  
  @JSImport("typescript-services", "Collections")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("typescript-services", "Collections.DefaultHashTableCapacity")
  @js.native
  def DefaultHashTableCapacity: Double = js.native
  @scala.inline
  def DefaultHashTableCapacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultHashTableCapacity")(x.asInstanceOf[js.Any])
  
  @JSImport("typescript-services", "Collections.DefaultStringTable")
  @js.native
  def DefaultStringTable: typings.typescriptServices.TypeScript.Collections.StringTable = js.native
  
  @JSImport("typescript-services", "Collections.DefaultStringTableCapacity")
  @js.native
  def DefaultStringTableCapacity: Double = js.native
  @scala.inline
  def DefaultStringTableCapacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultStringTableCapacity")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def DefaultStringTable_=(x: typings.typescriptServices.TypeScript.Collections.StringTable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultStringTable")(x.asInstanceOf[js.Any])
  
  @JSImport("typescript-services", "Collections.HashTable")
  @js.native
  class HashTable[TKey, TValue] protected ()
    extends StObject
       with typings.typescriptServices.TypeScript.Collections.HashTable[TKey, TValue] {
    def this(capacity: Double, hash: js.Function1[/* k */ TKey, Double]) = this()
    
    /* CompleteClass */
    override def add(key: TKey, value: TValue): Unit = js.native
    
    /* CompleteClass */
    /* private */ override def addEntry(key: js.Any, value: js.Any, hashCode: js.Any): js.Any = js.native
    
    /* CompleteClass */
    /* private */ override def addOrSet(key: js.Any, value: js.Any, throwOnExistingEntry: js.Any): js.Any = js.native
    
    /* CompleteClass */
    /* private */ override def computeHashCode(key: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def containsKey(key: TKey): Boolean = js.native
    
    /* CompleteClass */
    var count: js.Any = js.native
    
    /* CompleteClass */
    var entries: js.Any = js.native
    
    /* CompleteClass */
    /* private */ override def findEntry(key: js.Any, hashCode: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def get(key: TKey): TValue = js.native
    
    /* CompleteClass */
    /* private */ override def grow(): js.Any = js.native
    
    /* CompleteClass */
    var hash: js.Any = js.native
    
    /* CompleteClass */
    override def set(key: TKey, value: TValue): Unit = js.native
  }
  
  @JSImport("typescript-services", "Collections.StringTable")
  @js.native
  class StringTable protected ()
    extends StObject
       with typings.typescriptServices.TypeScript.Collections.StringTable {
    def this(capacity: Double) = this()
    
    /* CompleteClass */
    override def addCharArray(key: js.Array[Double], start: Double, len: Double): String = js.native
    
    /* CompleteClass */
    /* private */ override def addEntry(text: js.Any, hashCode: js.Any): js.Any = js.native
    
    /* CompleteClass */
    var count: js.Any = js.native
    
    /* CompleteClass */
    var entries: js.Any = js.native
    
    /* CompleteClass */
    /* private */ override def findCharArrayEntry(key: js.Any, start: js.Any, len: js.Any, hashCode: js.Any): js.Any = js.native
    
    /* CompleteClass */
    /* private */ override def grow(): js.Any = js.native
  }
  object StringTable {
    
    @JSImport("typescript-services", "Collections.StringTable")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @scala.inline
    def textCharArrayEquals(text: js.Any, array: js.Any, start: js.Any, length: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("textCharArrayEquals")(text.asInstanceOf[js.Any], array.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
  
  @scala.inline
  def createHashTable[TKey, TValue](): typings.typescriptServices.TypeScript.Collections.HashTable[TKey, TValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("createHashTable")().asInstanceOf[typings.typescriptServices.TypeScript.Collections.HashTable[TKey, TValue]]
  @scala.inline
  def createHashTable[TKey, TValue](capacity: Double): typings.typescriptServices.TypeScript.Collections.HashTable[TKey, TValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("createHashTable")(capacity.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptServices.TypeScript.Collections.HashTable[TKey, TValue]]
  @scala.inline
  def createHashTable[TKey, TValue](capacity: Double, hash: js.Function1[/* k */ TKey, Double]): typings.typescriptServices.TypeScript.Collections.HashTable[TKey, TValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("createHashTable")(capacity.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.Collections.HashTable[TKey, TValue]]
  @scala.inline
  def createHashTable[TKey, TValue](capacity: Unit, hash: js.Function1[/* k */ TKey, Double]): typings.typescriptServices.TypeScript.Collections.HashTable[TKey, TValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("createHashTable")(capacity.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.Collections.HashTable[TKey, TValue]]
  
  @scala.inline
  def identityHashCode(value: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("identityHashCode")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
}
