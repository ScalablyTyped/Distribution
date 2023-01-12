package typings.treeChanges

import typings.std.Record
import typings.treeChanges.treeChangesStrings.added
import typings.treeChanges.treeChangesStrings.decreased
import typings.treeChanges.treeChangesStrings.increased
import typings.treeChanges.treeChangesStrings.removed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  type Comparator = js.Array[String | js.Array[Any]]
  
  trait CompareValuesOptions[T] extends StObject {
    
    var key: js.UndefOr[T] = js.undefined
    
    var `type`: added | removed
    
    var value: js.UndefOr[Value] = js.undefined
  }
  object CompareValuesOptions {
    
    inline def apply[T](`type`: added | removed): CompareValuesOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompareValuesOptions[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompareValuesOptions[?], T] (val x: Self & CompareValuesOptions[T]) extends AnyVal {
      
      inline def setKey(value: T): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setType(value: added | removed): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: ValidTypes*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  type Data = PlainObject | js.Array[ValidTypes]
  
  type Key = String | Double
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    P | D extends std.Array<any> ? tree-changes.tree-changes/dist/types.Key : keyof P | keyof D
    }}}
    */
  type KeyType[P, D] = Key
  
  trait Options[T] extends StObject {
    
    var actual: js.UndefOr[Value] = js.undefined
    
    var filter: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[T] = js.undefined
    
    var previous: js.UndefOr[Value] = js.undefined
    
    var `type`: js.UndefOr[decreased | increased] = js.undefined
  }
  object Options {
    
    inline def apply[T](): Options[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?], T] (val x: Self & Options[T]) extends AnyVal {
      
      inline def setActual(value: Value): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
      
      inline def setActualUndefined: Self = StObject.set(x, "actual", js.undefined)
      
      inline def setActualVarargs(value: ValidTypes*): Self = StObject.set(x, "actual", js.Array(value*))
      
      inline def setFilter(value: Boolean): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setKey(value: T): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setPrevious(value: Value): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
      
      inline def setPreviousVarargs(value: ValidTypes*): Self = StObject.set(x, "previous", js.Array(value*))
      
      inline def setType(value: decreased | increased): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type PlainObject = Record[String, Any]
  
  @js.native
  trait TreeChanges[K] extends StObject {
    
    def added(): Boolean = js.native
    def added(key: K): Boolean = js.native
    def added(key: K, value: Value): Boolean = js.native
    def added(key: Unit, value: Value): Boolean = js.native
    
    def changed(): Boolean = js.native
    def changed(key: K): Boolean = js.native
    def changed(key: K, actual: Unit, previous: Value): Boolean = js.native
    def changed(key: K, actual: Value): Boolean = js.native
    def changed(key: K, actual: Value, previous: Value): Boolean = js.native
    def changed(key: String): Boolean = js.native
    def changed(key: String, actual: Unit, previous: Value): Boolean = js.native
    def changed(key: String, actual: Value): Boolean = js.native
    def changed(key: String, actual: Value, previous: Value): Boolean = js.native
    def changed(key: Unit, actual: Unit, previous: Value): Boolean = js.native
    def changed(key: Unit, actual: Value): Boolean = js.native
    def changed(key: Unit, actual: Value, previous: Value): Boolean = js.native
    
    def changedFrom(key: K, previous: Value): Boolean = js.native
    def changedFrom(key: K, previous: Value, actual: Value): Boolean = js.native
    def changedFrom(key: String, previous: Value): Boolean = js.native
    def changedFrom(key: String, previous: Value, actual: Value): Boolean = js.native
    
    /**
      * @deprecated
      * Use "changed" instead.
      */
    def changedTo(key: K, actual: Value): Boolean = js.native
    def changedTo(key: String, actual: Value): Boolean = js.native
    
    def decreased(key: K): Boolean = js.native
    def decreased(key: K, actual: Unit, previous: Value): Boolean = js.native
    def decreased(key: K, actual: Value): Boolean = js.native
    def decreased(key: K, actual: Value, previous: Value): Boolean = js.native
    
    def emptied(): Boolean = js.native
    def emptied(key: K): Boolean = js.native
    
    def filled(): Boolean = js.native
    def filled(key: K): Boolean = js.native
    
    def increased(key: K): Boolean = js.native
    def increased(key: K, actual: Unit, previous: Value): Boolean = js.native
    def increased(key: K, actual: Value): Boolean = js.native
    def increased(key: K, actual: Value, previous: Value): Boolean = js.native
    
    def removed(): Boolean = js.native
    def removed(key: K): Boolean = js.native
    def removed(key: K, value: Value): Boolean = js.native
    def removed(key: Unit, value: Value): Boolean = js.native
  }
  
  type ValidTypes = String | Boolean | Double | PlainObject
  
  type Value = ValidTypes | js.Array[ValidTypes]
}
