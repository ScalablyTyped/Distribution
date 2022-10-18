package typings.typedoc.distLibUtilsOptionsDeclarationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  typedoc.typedoc/dist/lib/utils/options/declaration.TypeDocOptionMap[K] extends boolean ? typedoc.typedoc/dist/lib/utils/options/declaration.BooleanDeclarationOption : typedoc.typedoc/dist/lib/utils/options/declaration.TypeDocOptionMap[K] extends string ? typedoc.typedoc/dist/lib/utils/options/declaration.StringDeclarationOption : typedoc.typedoc/dist/lib/utils/options/declaration.TypeDocOptionMap[K] extends number ? typedoc.typedoc/dist/lib/utils/options/declaration.NumberDeclarationOption : typedoc.typedoc/dist/lib/utils/options/declaration.TypeDocOptionMap[K] extends std.Array<string> ? typedoc.typedoc/dist/lib/utils/options/declaration.ArrayDeclarationOption : unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.TypeDocOptionMap[K] ? typedoc.typedoc/dist/lib/utils/options/declaration.MixedDeclarationOption | typedoc.typedoc/dist/lib/utils/options/declaration.ObjectDeclarationOption : typedoc.typedoc/dist/lib/utils/options/declaration.TypeDocOptionMap[K] extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<unknown> ? / * Inlined typedoc.typedoc/dist/lib/utils/options/declaration.MixedDeclarationOption & {validate (value : unknown): void} * /
{  type :typedoc.typedoc/dist/lib/utils/options/declaration.ParameterType.Mixed,   defaultValue :unknown | undefined,   validate :(value : unknown): void | undefined,   name :string,   help :string, validate (value : unknown): void} | / * Inlined typedoc.typedoc/dist/lib/utils/options/declaration.ObjectDeclarationOption & {validate (value : unknown): void} * /
{  type :typedoc.typedoc/dist/lib/utils/options/declaration.ParameterType.Object,   defaultValue :unknown | undefined,   validate :(value : unknown): void | undefined,   name :string,   help :string, validate (value : unknown): void} : typedoc.typedoc/dist/lib/utils/options/declaration.TypeDocOptionMap[K] extends std.Record<string, boolean> ? typedoc.typedoc/dist/lib/utils/options/declaration.FlagsDeclarationOption<typedoc.typedoc/dist/lib/utils/options/declaration.TypeDocOptionMap[K]> : typedoc.typedoc/dist/lib/utils/options/declaration.TypeDocOptionMap[K] extends std.Record<string | number, infer U> ? typedoc.typedoc/dist/lib/utils/options/declaration.MapDeclarationOption<U> : never
  }}}
  */
@js.native
trait KeyToDeclaration[K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 67, starting with typings.typedoc.typedocStrings.options, typings.typedoc.typedocStrings.tsconfig, typings.typedoc.typedocStrings.compilerOptions */ Any */] extends StObject
