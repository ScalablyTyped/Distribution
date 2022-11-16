package typings.typeFest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceSchemaMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    ObjectType extends string ? ValueType : ObjectType extends std.Map<unknown, unknown> ? ValueType : ObjectType extends std.Set<unknown> ? ValueType : ObjectType extends std.ReadonlyMap<unknown, unknown> ? ValueType : ObjectType extends std.ReadonlySet<unknown> ? ValueType : ObjectType extends std.Array<unknown> ? ValueType : ObjectType extends std.Array<unknown> ? ValueType : ObjectType extends (arguments : ...unknown): unknown ? ValueType : ObjectType extends std.Date ? ValueType : ObjectType extends std.Function ? ValueType : ObjectType extends std.RegExp ? ValueType : ObjectType extends object ? type-fest.type-fest/source/schema.SchemaObject<ObjectType, ValueType> : ValueType
    }}}
    */
  type Schema[ObjectType, ValueType] = ValueType
  
  /**
  Same as `Schema`, but accepts only `object`s as inputs. Internal helper for `Schema`.
  */
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ KeyType in keyof ObjectType ]: type-fest.type-fest/source/schema.Schema<ObjectType[KeyType], K> | K}
    }}}
    */
  @js.native
  trait SchemaObject[ObjectType /* <: js.Object */, K] extends StObject
}
