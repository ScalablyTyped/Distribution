package typings.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object schemaMod {
  type ModelToObject[T] = typings.typedoc.schemaMod._ModelToObject[T] | js.Array[typings.typedoc.schemaMod._ModelToObject[js.Any]]
  type Primitive = js.UndefOr[java.lang.String | scala.Double | scala.Null | scala.Boolean]
  type ProjectReflection = typings.typedoc.schemaMod.ContainerReflection
  type S[T, K /* <: java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {-readonly [ K2 in K ]: T[K2] extends typedoc.typedoc/dist/lib/serialization/schema.Primitive? T[K2] : typedoc.typedoc/dist/lib/serialization/schema.ModelToObject<T[K2]>}
    */ typings.typedoc.typedocStrings.S with js.Any
  /* Rewritten from type alias, can be one of: 
    - typings.typedoc.schemaMod.SourceReference
    - typings.typedoc.schemaMod.Decorator
    - typings.typedoc.schemaMod.CommentTag
    - typings.typedoc.schemaMod.Comment
    - typings.typedoc.schemaMod.SomeType
    - typings.typedoc.schemaMod.UnknownType
    - typings.typedoc.schemaMod.TupleType
    - typings.typedoc.schemaMod.StringLiteralType
    - typings.typedoc.schemaMod.ReflectionType
    - typings.typedoc.schemaMod.ReferenceType
    - typings.typedoc.schemaMod.PredicateType
    - typings.typedoc.schemaMod.IntrinsicType
    - typings.typedoc.schemaMod.IntersectionType
    - typings.typedoc.schemaMod.InferredType
    - typings.typedoc.schemaMod.IndexedAccessType
    - typings.typedoc.schemaMod.ConditionalType
    - typings.typedoc.schemaMod.ArrayType
    - typings.typedoc.schemaMod.Reflection
    - typings.typedoc.schemaMod.ReferenceReflection
    - typings.typedoc.schemaMod.ContainerReflection
    - typings.typedoc.schemaMod.ProjectReflection
    - typings.typedoc.schemaMod.TypeParameterReflection
    - typings.typedoc.schemaMod.DeclarationReflection
    - typings.typedoc.schemaMod.ReflectionPointer
    - typings.typedoc.schemaMod.ParameterReflection
    - typings.typedoc.schemaMod.SignatureReflection
    - typings.typedoc.schemaMod.ReflectionCategory
    - typings.typedoc.schemaMod.ReflectionGroup
  */
  type _ModelToObject[T] = typings.typedoc.schemaMod.__ModelToObject[T] | typings.typedoc.schemaMod.ProjectReflection
}
