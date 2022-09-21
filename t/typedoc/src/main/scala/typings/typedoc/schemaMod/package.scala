package typings.typedoc.schemaMod

import org.scalablytyped.runtime.TopLevel
import typings.std.Partial
import typings.typedoc.anon.Negative
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BoolKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: -? T[K] extends boolean? K : never}[keyof T] */ js.Any

type ModelToObject[T] = _ModelToObject[T] | js.Array[_ModelToObject[Any]]

type Primitive = js.UndefOr[String | Double | Null | Boolean]

type ProjectReflection = ContainerReflection

type ReflectionFlags = Partial[
S[
  typings.typedoc.modelsMod.ReflectionFlags, 
  BoolKeys[typings.typedoc.modelsMod.ReflectionFlags]
]]

/**
  * Helper to describe a set of serialized properties. Primitive types are returned
  * directly, while other models are first passed through ModelToObject.
  * This helper removes the readonly modifier from properties since the result of serialization
  * is a plain object that consumers may modify as they choose, TypeDoc doesn't care.
  */
type S[T, K /* <: /* keyof T */ String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{-readonly [ K2 in K ]: typedoc.typedoc/dist/lib/serialization/schema.ToSerialized<T[K2]>}
  */ typings.typedoc.typedocStrings.S & TopLevel[T]

type SomeType = ModelToObject[typings.typedoc.modelsTypesMod.SomeType]

type ToSerialized[T] = ModelToObject[T] | Negative | T

/* Rewritten from type alias, can be one of: 
  - typings.typedoc.schemaMod.SourceReference
  - typings.typedoc.schemaMod.CommentDisplayPart
  - typings.typedoc.schemaMod.CommentTag
  - typings.typedoc.schemaMod.Comment
  - / * import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/serialization/schema.TypeKindMap[T['type']] * / js.Any
  - typings.typedoc.schemaMod.Reflection
  - typings.typedoc.schemaMod.ReferenceReflection
  - typings.typedoc.schemaMod.ContainerReflection
  - typings.typedoc.schemaMod.ProjectReflection
  - typings.typedoc.schemaMod.TypeParameterReflection
  - typings.typedoc.schemaMod.DeclarationReflection
  - typings.typedoc.schemaMod.ParameterReflection
  - typings.typedoc.schemaMod.SignatureReflection
  - typings.typedoc.schemaMod.ReflectionCategory
  - typings.typedoc.schemaMod.ReflectionGroup
  - T
*/
type _ModelToObject[T] = __ModelToObject[T] | (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/serialization/schema.TypeKindMap[T['type']] */ js.Any) | ProjectReflection | T
