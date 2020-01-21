package typings.waterline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Adapter = js.Object
  type ArrayAttribute = typings.waterline.mod.BaseAttribute[_] with typings.waterline.AnonArray
  type Attribute = java.lang.String | typings.waterline.mod.StringAttribute | typings.waterline.mod.EmailAttribute | typings.waterline.mod.IntegerAttribute | typings.waterline.mod.FloatAttribute | typings.waterline.mod.DateAttribute | typings.waterline.mod.TimeAttribute | typings.waterline.mod.DatetimeAttribute | typings.waterline.mod.BooleanAttribute | typings.waterline.mod.BinaryAttribute | typings.waterline.mod.ArrayAttribute | typings.waterline.mod.JsonAttribute | typings.waterline.mod.OneToOneAttribute | typings.waterline.mod.OneToManyAttribute | typings.waterline.mod.ManyToManyAttribute | typings.waterline.mod.FunctionAttribute
  type AttributeValidation[T] = T | typings.waterline.mod.AttributeValidationSyncFn[T] | typings.waterline.mod.AttributeValidationAsyncFn[T]
  type AttributeValidationAsyncFn[T] = js.Function1[/* cb */ js.Function1[/* value */ T, js.Any], scala.Unit]
  type AttributeValidationSyncFn[T] = js.Function0[T]
  type BaseAttribute[T] = typings.waterline.mod.AttributeValidations with typings.waterline.AnonColumnName[T]
  type BinaryAttribute = typings.waterline.mod.BaseAttribute[_] with typings.waterline.AnonBinary
  type BooleanAttribute = typings.waterline.mod.BaseAttribute[scala.Boolean] with typings.waterline.AnonBoolean
  type Callback[T] = js.Function2[/* err */ js.Any, /* result */ T, js.Any]
  type Collection = typings.waterline.mod.CollectionDefinition
  type CollectionClass = js.Function0[typings.waterline.mod.Collection]
  type CollectionDefinition = typings.waterline.mod.LifecycleCallbacks with typings.waterline.AnonAlter
  type DateAttribute = typings.waterline.mod.BaseAttribute[typings.std.Date] with typings.waterline.AnonDate
  type DatetimeAttribute = typings.waterline.mod.BaseAttribute[typings.std.Date] with typings.waterline.AnonDatetime
  type DefaultsToFn[T] = js.Function0[T]
  type EmailAttribute = typings.waterline.mod.BaseAttribute[java.lang.String] with typings.waterline.AnonEmail
  type FloatAttribute = typings.waterline.mod.BaseAttribute[scala.Double] with typings.waterline.AnonFloat
  type FunctionAttribute = js.Function0[js.Any]
  type IntegerAttribute = typings.waterline.mod.BaseAttribute[scala.Double] with typings.waterline.AnonAutoIncrement
  type JsonAttribute = typings.waterline.mod.BaseAttribute[_] with typings.waterline.AnonJson
  type ManyToManyAttribute = typings.waterline.mod.BaseAttribute[_] with typings.waterline.AnonCollectionDominant
  type OneToManyAttribute = typings.waterline.mod.BaseAttribute[_] with typings.waterline.AnonCollection
  type OneToOneAttribute = typings.waterline.mod.BaseAttribute[_] with typings.waterline.AnonModel
  type QueryBuilder[T] = typings.waterline.mod.WaterlinePromise[T] with typings.waterline.AnonAssociation
  type StringAttribute = typings.waterline.mod.BaseAttribute[java.lang.String] with typings.waterline.AnonString
  type TextAttribute = typings.waterline.mod.BaseAttribute[java.lang.String] with typings.waterline.AnonText
  type TimeAttribute = typings.waterline.mod.BaseAttribute[typings.std.Date] with typings.waterline.AnonTime
  type WaterlinePromise[T] = typings.bluebird.mod.^[T] with typings.waterline.AnonCb[T]
}
