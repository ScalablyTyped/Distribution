package typings.superstruct

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object indexEsMod {
  /**
    * Type helper to Flatten the Union of optional and required properties.
    */
  /**
    * Type helper to Flatten the Union of optional and required properties.
    */
  type Flatten[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof any ]: any[K]}
    */ typings.superstruct.superstructStrings.Flatten with org.scalablytyped.runtime.TopLevel[js.Any]
  /**
    * Type helper to extract the optional keys of an object
    */
  /**
    * Type helper to extract the optional keys of an object
    */
  type OptionalKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: undefined extends T[K]? K : never}[keyof T] */ js.Any
  /**
    * Type helper to create optional properties when the property value can be
    * undefined (ie. when `optional()` is used to define a type)
    */
  /**
    * Type helper to create optional properties when the property value can be
    * undefined (ie. when `optional()` is used to define a type)
    */
  type OptionalizeObject[T] = typings.superstruct.indexEsMod.Flatten[
    typings.superstruct.superstructStrings.OptionalizeObject with org.scalablytyped.runtime.TopLevel[T]
  ]
  /**
    * Type helper to extract the required keys of an object
    */
  /**
    * Type helper to extract the required keys of an object
    */
  type RequiredKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: undefined extends T[K]? never : K}[keyof T] */ js.Any
  type StructRecord[T] = typings.std.Record[java.lang.String, typings.superstruct.indexEsMod.Struct_[T, js.Any]]
  /**
    * A `StructResult` is returned from validation functions.
    */
  /**
    * A `StructResult` is returned from validation functions.
    */
  type StructResult = scala.Boolean | typings.std.Iterable[typings.superstruct.indexEsMod.StructFailure]
  type StructTuple[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: superstruct.superstruct/lib/index.es.Struct<T[K], any>}
    */ typings.superstruct.superstructStrings.StructTuple with org.scalablytyped.runtime.TopLevel[T]
  /**
    * A type utility to extract the type from a `Struct` class.
    */
  /**
    * A type utility to extract the type from a `Struct` class.
    */
  type StructType[T /* <: typings.superstruct.indexEsMod.Struct_[_, _] */] = /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T['refiner']>[0] */ js.Any
}
