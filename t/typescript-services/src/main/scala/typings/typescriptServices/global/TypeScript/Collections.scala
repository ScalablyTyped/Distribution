package typings.typescriptServices.global.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Collections {
  
  @JSGlobal("TypeScript.Collections")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("TypeScript.Collections.DefaultHashTableCapacity")
  @js.native
  def DefaultHashTableCapacity: Double = js.native
  @scala.inline
  def DefaultHashTableCapacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultHashTableCapacity")(x.asInstanceOf[js.Any])
  
  @JSGlobal("TypeScript.Collections.DefaultStringTable")
  @js.native
  def DefaultStringTable: typings.typescriptServices.TypeScript.Collections.StringTable = js.native
  
  @JSGlobal("TypeScript.Collections.DefaultStringTableCapacity")
  @js.native
  def DefaultStringTableCapacity: Double = js.native
  @scala.inline
  def DefaultStringTableCapacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultStringTableCapacity")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def DefaultStringTable_=(x: typings.typescriptServices.TypeScript.Collections.StringTable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultStringTable")(x.asInstanceOf[js.Any])
  
  @JSGlobal("TypeScript.Collections.HashTable")
  @js.native
  class HashTable[TKey, TValue] protected ()
    extends typings.typescriptServices.TypeScript.Collections.HashTable[TKey, TValue] {
    def this(capacity: Double, hash: js.Function1[/* k */ TKey, Double]) = this()
  }
  
  @JSGlobal("TypeScript.Collections.StringTable")
  @js.native
  class StringTable protected ()
    extends typings.typescriptServices.TypeScript.Collections.StringTable {
    def this(capacity: Double) = this()
  }
  object StringTable {
    
    /* static member */
    @JSGlobal("TypeScript.Collections.StringTable.textCharArrayEquals")
    @js.native
    def textCharArrayEquals(text: js.Any, array: js.Any, start: js.Any, length: js.Any): js.Any = js.native
  }
  
  @JSGlobal("TypeScript.Collections.createHashTable")
  @js.native
  def createHashTable[TKey, TValue](): typings.typescriptServices.TypeScript.Collections.HashTable[TKey, TValue] = js.native
  @JSGlobal("TypeScript.Collections.createHashTable")
  @js.native
  def createHashTable[TKey, TValue](capacity: js.UndefOr[scala.Nothing], hash: js.Function1[/* k */ TKey, Double]): typings.typescriptServices.TypeScript.Collections.HashTable[TKey, TValue] = js.native
  @JSGlobal("TypeScript.Collections.createHashTable")
  @js.native
  def createHashTable[TKey, TValue](capacity: Double): typings.typescriptServices.TypeScript.Collections.HashTable[TKey, TValue] = js.native
  @JSGlobal("TypeScript.Collections.createHashTable")
  @js.native
  def createHashTable[TKey, TValue](capacity: Double, hash: js.Function1[/* k */ TKey, Double]): typings.typescriptServices.TypeScript.Collections.HashTable[TKey, TValue] = js.native
  
  @JSGlobal("TypeScript.Collections.identityHashCode")
  @js.native
  def identityHashCode(value: js.Any): Double = js.native
}
