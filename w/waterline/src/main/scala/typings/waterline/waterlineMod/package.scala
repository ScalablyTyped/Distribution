package typings.waterline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object waterlineMod {
  import typings.std.Date
  import typings.waterline.Anon_Alter
  import typings.waterline.Anon_Array
  import typings.waterline.Anon_Association
  import typings.waterline.Anon_AutoIncrement
  import typings.waterline.Anon_Binary
  import typings.waterline.Anon_Boolean
  import typings.waterline.Anon_Cb
  import typings.waterline.Anon_Collection
  import typings.waterline.Anon_CollectionDominant
  import typings.waterline.Anon_ColumnName
  import typings.waterline.Anon_Date
  import typings.waterline.Anon_Datetime
  import typings.waterline.Anon_Email
  import typings.waterline.Anon_Float
  import typings.waterline.Anon_Json
  import typings.waterline.Anon_Model
  import typings.waterline.Anon_String
  import typings.waterline.Anon_Text
  import typings.waterline.Anon_Time

  type Adapter = js.Object
  type ArrayAttribute = BaseAttribute[_] with Anon_Array
  type Attribute = String | StringAttribute | EmailAttribute | IntegerAttribute | FloatAttribute | DateAttribute | TimeAttribute | DatetimeAttribute | BooleanAttribute | BinaryAttribute | ArrayAttribute | JsonAttribute | OneToOneAttribute | OneToManyAttribute | ManyToManyAttribute | FunctionAttribute
  type AttributeValidation[T] = T | AttributeValidationSyncFn[T] | AttributeValidationAsyncFn[T]
  type AttributeValidationAsyncFn[T] = js.Function1[/* cb */ js.Function1[/* value */ T, js.Any], Unit]
  type AttributeValidationSyncFn[T] = js.Function0[T]
  type BaseAttribute[T] = AttributeValidations with Anon_ColumnName[T]
  type BinaryAttribute = BaseAttribute[_] with Anon_Binary
  type BooleanAttribute = BaseAttribute[Boolean] with Anon_Boolean
  type Callback[T] = js.Function2[/* err */ js.Any, /* result */ T, js.Any]
  type Collection = CollectionDefinition
  type CollectionClass = js.Function0[Collection]
  type CollectionDefinition = LifecycleCallbacks with Anon_Alter
  type DateAttribute = BaseAttribute[Date] with Anon_Date
  type DatetimeAttribute = BaseAttribute[Date] with Anon_Datetime
  type DefaultsToFn[T] = js.Function0[T]
  type EmailAttribute = BaseAttribute[String] with Anon_Email
  type FloatAttribute = BaseAttribute[Double] with Anon_Float
  type FunctionAttribute = js.Function0[js.Any]
  type IntegerAttribute = BaseAttribute[Double] with Anon_AutoIncrement
  type JsonAttribute = BaseAttribute[_] with Anon_Json
  type ManyToManyAttribute = BaseAttribute[_] with Anon_CollectionDominant
  type OneToManyAttribute = BaseAttribute[_] with Anon_Collection
  type OneToOneAttribute = BaseAttribute[_] with Anon_Model
  type QueryBuilder[T] = WaterlinePromise[T] with Anon_Association
  type StringAttribute = BaseAttribute[String] with Anon_String
  type TextAttribute = BaseAttribute[String] with Anon_Text
  type TimeAttribute = BaseAttribute[Date] with Anon_Time
  type WaterlinePromise[T] = typings.bluebird.bluebirdMod.^[T] with Anon_Cb[T]
}
