package typings.typeorm

import typings.typeorm.anon.Items
import typings.typeorm.commonObjectLiteralMod.ObjectLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilOrmUtilsMod {
  
  @JSImport("typeorm/util/OrmUtils", "OrmUtils")
  @js.native
  class OrmUtils () extends StObject
  /* static members */
  object OrmUtils {
    
    @JSImport("typeorm/util/OrmUtils", "OrmUtils")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Chunks array into peaces.
      */
    @JSImport("typeorm/util/OrmUtils", "OrmUtils.chunk")
    @js.native
    def chunk[T](array: js.Array[T], size: Double): js.Array[js.Array[T]] = js.native
    
    @JSImport("typeorm/util/OrmUtils", "OrmUtils.compare2Objects")
    @js.native
    def compare2Objects: js.Any = js.native
    @scala.inline
    def compare2Objects_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compare2Objects")(x.asInstanceOf[js.Any])
    
    /**
      * Check if two entity-id-maps are the same
      */
    @JSImport("typeorm/util/OrmUtils", "OrmUtils.compareIds")
    @js.native
    def compareIds(): Boolean = js.native
    @JSImport("typeorm/util/OrmUtils", "OrmUtils.compareIds")
    @js.native
    def compareIds(firstId: js.UndefOr[scala.Nothing], secondId: ObjectLiteral): Boolean = js.native
    @JSImport("typeorm/util/OrmUtils", "OrmUtils.compareIds")
    @js.native
    def compareIds(firstId: ObjectLiteral): Boolean = js.native
    @JSImport("typeorm/util/OrmUtils", "OrmUtils.compareIds")
    @js.native
    def compareIds(firstId: ObjectLiteral, secondId: ObjectLiteral): Boolean = js.native
    
    /**
      * Deep compare objects.
      *
      * @see http://stackoverflow.com/a/1144249
      */
    @JSImport("typeorm/util/OrmUtils", "OrmUtils.deepCompare")
    @js.native
    def deepCompare(args: js.Any*): Boolean = js.native
    
    @JSImport("typeorm/util/OrmUtils", "OrmUtils.groupBy")
    @js.native
    def groupBy[T, R](array: js.Array[T], propertyCallback: js.Function1[/* item */ T, R]): js.Array[Items[R, T]] = js.native
    
    /**
      * Compares two arrays.
      */
    @JSImport("typeorm/util/OrmUtils", "OrmUtils.isArraysEqual")
    @js.native
    def isArraysEqual(arr1: js.Array[_], arr2: js.Array[_]): Boolean = js.native
    
    @JSImport("typeorm/util/OrmUtils", "OrmUtils.isObject")
    @js.native
    def isObject(item: js.Any): Boolean = js.native
    
    /**
      * Deep Object.assign.
      *
      * @see http://stackoverflow.com/a/34749873
      */
    @JSImport("typeorm/util/OrmUtils", "OrmUtils.mergeDeep")
    @js.native
    def mergeDeep(target: js.Any, sources: js.Any*): js.Any = js.native
    
    @JSImport("typeorm/util/OrmUtils", "OrmUtils.splitClassesAndStrings")
    @js.native
    def splitClassesAndStrings[T](clsesAndStrings: js.Array[String | T]): js.Tuple2[js.Array[T], js.Array[String]] = js.native
    
    /**
      * Transforms given value into boolean value.
      */
    @JSImport("typeorm/util/OrmUtils", "OrmUtils.toBoolean")
    @js.native
    def toBoolean(value: js.Any): Boolean = js.native
    
    @JSImport("typeorm/util/OrmUtils", "OrmUtils.uniq")
    @js.native
    def uniq[T](array: js.Array[T]): js.Array[T] = js.native
    @JSImport("typeorm/util/OrmUtils", "OrmUtils.uniq")
    @js.native
    def uniq[T](array: js.Array[T], criteria: js.Function1[/* item */ T, _]): js.Array[T] = js.native
    @JSImport("typeorm/util/OrmUtils", "OrmUtils.uniq")
    @js.native
    def uniq[T, K /* <: /* keyof T */ String */](array: js.Array[T], property: K): js.Array[T] = js.native
    
    /**
      * Composes an object from the given array of keys and values.
      */
    @JSImport("typeorm/util/OrmUtils", "OrmUtils.zipObject")
    @js.native
    def zipObject(keys: js.Array[_], values: js.Array[_]): ObjectLiteral = js.native
  }
}
