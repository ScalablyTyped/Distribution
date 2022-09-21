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
  inline def DefaultHashTableCapacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultHashTableCapacity")(x.asInstanceOf[js.Any])
  
  @JSImport("typescript-services", "Collections.DefaultStringTable")
  @js.native
  def DefaultStringTable: typings.typescriptServices.TypeScript.Collections.StringTable = js.native
  
  @JSImport("typescript-services", "Collections.DefaultStringTableCapacity")
  @js.native
  def DefaultStringTableCapacity: Double = js.native
  inline def DefaultStringTableCapacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultStringTableCapacity")(x.asInstanceOf[js.Any])
  
  inline def DefaultStringTable_=(x: typings.typescriptServices.TypeScript.Collections.StringTable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultStringTable")(x.asInstanceOf[js.Any])
  
  @JSImport("typescript-services", "Collections.HashTable")
  @js.native
  open class HashTable[TKey, TValue] protected ()
    extends StObject
       with typings.typescriptServices.TypeScript.Collections.HashTable[TKey, TValue] {
    def this(capacity: Double, hash: js.Function1[/* k */ TKey, Double]) = this()
    
    /* CompleteClass */
    override def add(key: TKey, value: TValue): Unit = js.native
    
    /* private */ /* CompleteClass */
    override def addEntry(key: Any, value: Any, hashCode: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    override def addOrSet(key: Any, value: Any, throwOnExistingEntry: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    override def computeHashCode(key: Any): Any = js.native
    
    /* CompleteClass */
    override def containsKey(key: TKey): Boolean = js.native
    
    /* private */ /* CompleteClass */
    var count: Any = js.native
    
    /* private */ /* CompleteClass */
    var entries: Any = js.native
    
    /* private */ /* CompleteClass */
    override def findEntry(key: Any, hashCode: Any): Any = js.native
    
    /* CompleteClass */
    override def get(key: TKey): TValue = js.native
    
    /* private */ /* CompleteClass */
    override def grow(): Any = js.native
    
    /* private */ /* CompleteClass */
    var hash: Any = js.native
    
    /* CompleteClass */
    override def set(key: TKey, value: TValue): Unit = js.native
  }
  
  @JSImport("typescript-services", "Collections.StringTable")
  @js.native
  open class StringTable protected ()
    extends StObject
       with typings.typescriptServices.TypeScript.Collections.StringTable {
    def this(capacity: Double) = this()
    
    /* CompleteClass */
    override def addCharArray(key: js.Array[Double], start: Double, len: Double): String = js.native
    
    /* private */ /* CompleteClass */
    override def addEntry(text: Any, hashCode: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    var count: Any = js.native
    
    /* private */ /* CompleteClass */
    var entries: Any = js.native
    
    /* private */ /* CompleteClass */
    override def findCharArrayEntry(key: Any, start: Any, len: Any, hashCode: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    override def grow(): Any = js.native
  }
  object StringTable {
    
    @JSImport("typescript-services", "Collections.StringTable")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def textCharArrayEquals(text: Any, array: Any, start: Any, length: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("textCharArrayEquals")(text.asInstanceOf[js.Any], array.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  inline def createHashTable[TKey, TValue](): typings.typescriptServices.TypeScript.Collections.HashTable[TKey, TValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("createHashTable")().asInstanceOf[typings.typescriptServices.TypeScript.Collections.HashTable[TKey, TValue]]
  inline def createHashTable[TKey, TValue](capacity: Double): typings.typescriptServices.TypeScript.Collections.HashTable[TKey, TValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("createHashTable")(capacity.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptServices.TypeScript.Collections.HashTable[TKey, TValue]]
  inline def createHashTable[TKey, TValue](capacity: Double, hash: js.Function1[/* k */ TKey, Double]): typings.typescriptServices.TypeScript.Collections.HashTable[TKey, TValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("createHashTable")(capacity.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.Collections.HashTable[TKey, TValue]]
  inline def createHashTable[TKey, TValue](capacity: Unit, hash: js.Function1[/* k */ TKey, Double]): typings.typescriptServices.TypeScript.Collections.HashTable[TKey, TValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("createHashTable")(capacity.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.Collections.HashTable[TKey, TValue]]
  
  inline def identityHashCode(value: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("identityHashCode")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
}
