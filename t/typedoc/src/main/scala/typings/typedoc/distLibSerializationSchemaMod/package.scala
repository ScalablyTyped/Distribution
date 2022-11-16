package typings.typedoc.distLibSerializationSchemaMod

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BoolKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: -? T[K] extends boolean? K : never}[keyof T] */ js.Any

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends std.Array<infer U> ? std.Array<typedoc.typedoc/dist/lib/serialization/schema._ModelToObject<U>> : typedoc.typedoc/dist/lib/serialization/schema._ModelToObject<T>
  }}}
  */
type ModelToObject[T] = T

type Primitive = js.UndefOr[String | Double | Null | Boolean]

type ProjectReflection = ContainerReflection

type ReflectionFlags = Partial[
S[
  typings.typedoc.distLibModelsMod.ReflectionFlags, 
  BoolKeys[typings.typedoc.distLibModelsMod.ReflectionFlags]
]]

type SomeType = ModelToObject[typings.typedoc.distLibModelsTypesMod.SomeType]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends typedoc.typedoc/dist/lib/serialization/schema.Primitive ? T : T extends bigint ? {  value :string,   negative :boolean} : typedoc.typedoc/dist/lib/serialization/schema.ModelToObject<T>
  }}}
  */
type ToSerialized[T] = T

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends typedoc.typedoc/dist/lib/serialization/schema.Primitive ? T : T extends typedoc.typedoc/dist/lib/models.ReflectionGroup ? typedoc.typedoc/dist/lib/serialization/schema.ReflectionGroup : T extends typedoc.typedoc/dist/lib/models.ReflectionCategory ? typedoc.typedoc/dist/lib/serialization/schema.ReflectionCategory : T extends typedoc.typedoc/dist/lib/models.SignatureReflection ? typedoc.typedoc/dist/lib/serialization/schema.SignatureReflection : T extends typedoc.typedoc/dist/lib/models.ParameterReflection ? typedoc.typedoc/dist/lib/serialization/schema.ParameterReflection : T extends typedoc.typedoc/dist/lib/models.DeclarationReflection ? typedoc.typedoc/dist/lib/serialization/schema.DeclarationReflection : T extends typedoc.typedoc/dist/lib/models.TypeParameterReflection ? typedoc.typedoc/dist/lib/serialization/schema.TypeParameterReflection : T extends typedoc.typedoc/dist/lib/models.ProjectReflection ? typedoc.typedoc/dist/lib/serialization/schema.ProjectReflection : T extends typedoc.typedoc/dist/lib/models.ContainerReflection ? typedoc.typedoc/dist/lib/serialization/schema.ContainerReflection : T extends typedoc.typedoc/dist/lib/models.ReferenceReflection ? typedoc.typedoc/dist/lib/serialization/schema.ReferenceReflection : T extends typedoc.typedoc/dist/lib/models.Reflection ? typedoc.typedoc/dist/lib/serialization/schema.Reflection : T extends typedoc.typedoc/dist/lib/models/types.SomeType ? typedoc.typedoc/dist/lib/serialization/schema.TypeKindMap[T['type']] : T extends typedoc.typedoc/dist/lib/models.Type ? typedoc.typedoc/dist/lib/serialization/schema.SomeType : T extends typedoc.typedoc/dist/lib/models.Comment ? typedoc.typedoc/dist/lib/serialization/schema.Comment : T extends typedoc.typedoc/dist/lib/models.CommentTag ? typedoc.typedoc/dist/lib/serialization/schema.CommentTag : T extends typedoc.typedoc/dist/lib/models/comments/comment.CommentDisplayPart ? typedoc.typedoc/dist/lib/serialization/schema.CommentDisplayPart : T extends typedoc.typedoc/dist/lib/models.SourceReference ? typedoc.typedoc/dist/lib/serialization/schema.SourceReference : never
  }}}
  */
type _ModelToObject[T] = T
