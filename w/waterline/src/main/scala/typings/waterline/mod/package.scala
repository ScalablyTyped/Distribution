package typings.waterline.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Adapter = js.Object

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typings.waterline.mod.StringAttribute
  - typings.waterline.mod.EmailAttribute
  - typings.waterline.mod.IntegerAttribute
  - typings.waterline.mod.NumberAttribute
  - typings.waterline.mod.FloatAttribute
  - typings.waterline.mod.DateAttribute
  - typings.waterline.mod.TimeAttribute
  - typings.waterline.mod.DatetimeAttribute
  - typings.waterline.mod.BooleanAttribute
  - typings.waterline.mod.BinaryAttribute
  - typings.waterline.mod.ArrayAttribute
  - typings.waterline.mod.JsonAttribute
  - typings.waterline.mod.OneToOneAttribute
  - typings.waterline.mod.OneToManyAttribute
  - typings.waterline.mod.ManyToManyAttribute
  - typings.waterline.mod.FunctionAttribute
*/
type Attribute = typings.waterline.mod._Attribute | java.lang.String | typings.waterline.mod.FunctionAttribute

type AttributeValidation[T] = T | typings.waterline.mod.AttributeValidationSyncFn[T] | typings.waterline.mod.AttributeValidationAsyncFn[T]

type AttributeValidationAsyncFn[T] = js.Function1[/* cb */ js.Function1[/* value */ T, js.Any], scala.Unit]

type AttributeValidationSyncFn[T] = js.Function0[T]

type Callback[T] = js.Function2[/* err */ js.Any, /* result */ T, js.Any]

type Collection = typings.waterline.mod.CollectionDefinition

type CollectionClass = js.Function0[typings.waterline.mod.Collection]

type DefaultsToFn[T] = js.Function0[T]

type FunctionAttribute = js.Function0[js.Any]
