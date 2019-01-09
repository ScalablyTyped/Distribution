package typings
package waterlineLib.waterlineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WaterlineNs {
  type Adapter = js.Object
  type ArrayAttribute = BaseAttribute[_] with waterlineLib.Anon_Array
  type Attribute = java.lang.String | StringAttribute | EmailAttribute | IntegerAttribute | FloatAttribute | DateAttribute | TimeAttribute | DatetimeAttribute | BooleanAttribute | BinaryAttribute | ArrayAttribute | JsonAttribute | OneToOneAttribute | OneToManyAttribute | ManyToManyAttribute | FunctionAttribute
  type AttributeType = waterlineLib.waterlineLibStrings.string | waterlineLib.waterlineLibStrings.text | waterlineLib.waterlineLibStrings.integer | waterlineLib.waterlineLibStrings.float | waterlineLib.waterlineLibStrings.date | waterlineLib.waterlineLibStrings.time | waterlineLib.waterlineLibStrings.datetime | waterlineLib.waterlineLibStrings.boolean | waterlineLib.waterlineLibStrings.binary | waterlineLib.waterlineLibStrings.array | waterlineLib.waterlineLibStrings.json
  type AttributeValidation[T] = T | AttributeValidationSyncFn[T] | AttributeValidationAsyncFn[T]
  type AttributeValidationAsyncFn[T] = js.Function1[/* cb */ js.Function1[/* value */ T, js.Any], scala.Unit]
  type AttributeValidationSyncFn[T] = js.Function0[T]
  type BaseAttribute[T] = AttributeValidations with waterlineLib.Anon_ColumnName[T]
  type BinaryAttribute = BaseAttribute[_] with waterlineLib.Anon_Binary
  type BooleanAttribute = BaseAttribute[scala.Boolean] with waterlineLib.Anon_Boolean
  type Callback[T] = js.Function2[/* err */ js.Any, /* result */ T, js.Any]
  type Collection = CollectionDefinition
  type CollectionClass = js.Function0[Collection]
  type CollectionDefinition = LifecycleCallbacks with waterlineLib.Anon_Alter
  type DateAttribute = BaseAttribute[stdLib.Date] with waterlineLib.Anon_Date
  type DatetimeAttribute = BaseAttribute[stdLib.Date] with waterlineLib.Anon_Datetime
  type DefaultsToFn[T] = js.Function0[T]
  type EmailAttribute = BaseAttribute[java.lang.String] with waterlineLib.Anon_Email
  type FloatAttribute = BaseAttribute[scala.Double] with waterlineLib.Anon_Float
  type FunctionAttribute = js.Function0[js.Any]
  type IntegerAttribute = BaseAttribute[scala.Double] with waterlineLib.Anon_AutoIncrement
  type JsonAttribute = BaseAttribute[_] with waterlineLib.Anon_Json
  type ManyToManyAttribute = BaseAttribute[_] with waterlineLib.Anon_CollectionDominant
  type OneToManyAttribute = BaseAttribute[_] with waterlineLib.Anon_Collection
  type OneToOneAttribute = BaseAttribute[_] with waterlineLib.Anon_Model
  type QueryBuilder[T] = WaterlinePromise[T] with waterlineLib.Anon_Association
  type StringAttribute = BaseAttribute[java.lang.String] with waterlineLib.Anon_String
  type TextAttribute = BaseAttribute[java.lang.String] with waterlineLib.Anon_Text
  type TimeAttribute = BaseAttribute[stdLib.Date] with waterlineLib.Anon_Time
  type WaterlinePromise[T] = bluebirdLib.bluebirdMod.namespaced[T] with waterlineLib.Anon_Cb[T]
}
