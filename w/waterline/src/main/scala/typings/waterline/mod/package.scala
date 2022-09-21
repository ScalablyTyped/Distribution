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
type Attribute = _Attribute | String | FunctionAttribute

type AttributeValidation[T] = T | AttributeValidationSyncFn[T] | AttributeValidationAsyncFn[T]

type AttributeValidationAsyncFn[T] = js.Function1[/* cb */ js.Function1[/* value */ T, Any], Unit]

type AttributeValidationSyncFn[T] = js.Function0[T]

type Callback[T] = js.Function2[/* err */ Any, /* result */ T, Any]

type Collection = CollectionDefinition

type CollectionClass = js.Function0[Collection]

type DefaultsToFn[T] = js.Function0[T]

type FunctionAttribute = js.Function0[Any]
