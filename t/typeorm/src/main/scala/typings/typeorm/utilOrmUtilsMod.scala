package typings.typeorm

import typings.typeorm.anon.Items
import typings.typeorm.commonObjectLiteralMod.ObjectLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    @scala.inline
    def chunk[T](array: js.Array[T], size: Double): js.Array[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("chunk")(array.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[T]]]
    
    @JSImport("typeorm/util/OrmUtils", "OrmUtils.compare2Objects")
    @js.native
    def compare2Objects: js.Any = js.native
    @scala.inline
    def compare2Objects_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compare2Objects")(x.asInstanceOf[js.Any])
    
    /**
      * Check if two entity-id-maps are the same
      */
    @scala.inline
    def compareIds(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("compareIds")().asInstanceOf[Boolean]
    @scala.inline
    def compareIds(firstId: Unit, secondId: ObjectLiteral): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareIds")(firstId.asInstanceOf[js.Any], secondId.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def compareIds(firstId: ObjectLiteral): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("compareIds")(firstId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def compareIds(firstId: ObjectLiteral, secondId: ObjectLiteral): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareIds")(firstId.asInstanceOf[js.Any], secondId.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Deep compare objects.
      *
      * @see http://stackoverflow.com/a/1144249
      */
    @scala.inline
    def deepCompare(args: js.Any*): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("deepCompare")(args.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def groupBy[T, R](array: js.Array[T], propertyCallback: js.Function1[/* item */ T, R]): js.Array[Items[R, T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(array.asInstanceOf[js.Any], propertyCallback.asInstanceOf[js.Any])).asInstanceOf[js.Array[Items[R, T]]]
    
    /**
      * Compares two arrays.
      */
    @scala.inline
    def isArraysEqual(arr1: js.Array[js.Any], arr2: js.Array[js.Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArraysEqual")(arr1.asInstanceOf[js.Any], arr2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def isObject(item: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Deep Object.assign.
      *
      * @see http://stackoverflow.com/a/34749873
      */
    @scala.inline
    def mergeDeep(target: js.Any, sources: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeDeep")(target.asInstanceOf[js.Any], sources.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def splitClassesAndStrings[T](clsesAndStrings: js.Array[String | T]): js.Tuple2[js.Array[T], js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitClassesAndStrings")(clsesAndStrings.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Array[T], js.Array[String]]]
    
    /**
      * Transforms given value into boolean value.
      */
    @scala.inline
    def toBoolean(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("toBoolean")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def uniq[T](array: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("uniq")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
    @scala.inline
    def uniq[T](array: js.Array[T], criteria: js.Function1[/* item */ T, js.Any]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("uniq")(array.asInstanceOf[js.Any], criteria.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    @scala.inline
    def uniq[T, K /* <: /* keyof T */ String */](array: js.Array[T], property: K): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("uniq")(array.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    
    /**
      * Composes an object from the given array of keys and values.
      */
    @scala.inline
    def zipObject(keys: js.Array[js.Any], values: js.Array[js.Any]): ObjectLiteral = (^.asInstanceOf[js.Dynamic].applyDynamic("zipObject")(keys.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[ObjectLiteral]
  }
}
