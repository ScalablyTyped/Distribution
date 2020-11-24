package typings.typeorm

import typings.typeorm.anon.Items
import typings.typeorm.commonObjectLiteralMod.ObjectLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/util/OrmUtils", JSImport.Namespace)
@js.native
object utilOrmUtilsMod extends js.Object {
  
  @js.native
  class OrmUtils () extends js.Object
  /* static members */
  @js.native
  object OrmUtils extends js.Object {
    
    /**
      * Chunks array into peaces.
      */
    def chunk[T](array: js.Array[T], size: Double): js.Array[js.Array[T]] = js.native
    
    var compare2Objects: js.Any = js.native
    
    /**
      * Check if two entity-id-maps are the same
      */
    def compareIds(): Boolean = js.native
    def compareIds(firstId: js.UndefOr[scala.Nothing], secondId: ObjectLiteral): Boolean = js.native
    def compareIds(firstId: ObjectLiteral): Boolean = js.native
    def compareIds(firstId: ObjectLiteral, secondId: ObjectLiteral): Boolean = js.native
    
    /**
      * Deep compare objects.
      *
      * @see http://stackoverflow.com/a/1144249
      */
    def deepCompare(args: js.Any*): Boolean = js.native
    
    def groupBy[T, R](array: js.Array[T], propertyCallback: js.Function1[/* item */ T, R]): js.Array[Items[R, T]] = js.native
    
    /**
      * Compares two arrays.
      */
    def isArraysEqual(arr1: js.Array[_], arr2: js.Array[_]): Boolean = js.native
    
    def isObject(item: js.Any): Boolean = js.native
    
    /**
      * Deep Object.assign.
      *
      * @see http://stackoverflow.com/a/34749873
      */
    def mergeDeep(target: js.Any, sources: js.Any*): js.Any = js.native
    
    def splitClassesAndStrings[T](clsesAndStrings: js.Array[String | T]): js.Tuple2[js.Array[T], js.Array[String]] = js.native
    
    /**
      * Transforms given value into boolean value.
      */
    def toBoolean(value: js.Any): Boolean = js.native
    
    def uniq[T](array: js.Array[T]): js.Array[T] = js.native
    def uniq[T](array: js.Array[T], criteria: js.Function1[/* item */ T, _]): js.Array[T] = js.native
    def uniq[T, K /* <: /* keyof T */ String */](array: js.Array[T], property: K): js.Array[T] = js.native
    
    /**
      * Composes an object from the given array of keys and values.
      */
    def zipObject(keys: js.Array[_], values: js.Array[_]): ObjectLiteral = js.native
  }
}
