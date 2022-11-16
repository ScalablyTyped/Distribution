package typings.typedoc.distLibUtilsOptionsDeclarationMod

import typings.std.Record
import typings.typedoc.distLibUtilsOptionsDeclarationMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def convert(value: Any, option: DeclarationOption, configPath: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(value.asInstanceOf[js.Any], option.asInstanceOf[js.Any], configPath.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def convert(value: Any, option: DeclarationOption, configPath: String, oldValue: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(value.asInstanceOf[js.Any], option.asInstanceOf[js.Any], configPath.asInstanceOf[js.Any], oldValue.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def getDefaultValue(option: DeclarationOption): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultValue")(option.asInstanceOf[js.Any]).asInstanceOf[Any]

/* Rewritten from type alias, can be one of: 
  - typings.typedoc.distLibUtilsOptionsDeclarationMod.StringDeclarationOption
  - typings.typedoc.distLibUtilsOptionsDeclarationMod.NumberDeclarationOption
  - typings.typedoc.distLibUtilsOptionsDeclarationMod.BooleanDeclarationOption
  - typings.typedoc.distLibUtilsOptionsDeclarationMod.MixedDeclarationOption
  - typings.typedoc.distLibUtilsOptionsDeclarationMod.ObjectDeclarationOption
  - typings.typedoc.distLibUtilsOptionsDeclarationMod.MapDeclarationOption[scala.Any]
  - typings.typedoc.distLibUtilsOptionsDeclarationMod.ArrayDeclarationOption
  - typings.typedoc.distLibUtilsOptionsDeclarationMod.FlagsDeclarationOption[typings.std.Record[java.lang.String, scala.Boolean]]
*/
type DeclarationOption = _DeclarationOption | MapDeclarationOption[Any] | (FlagsDeclarationOption[Record[String, Boolean]])

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  typedoc.typedoc/dist/lib/utils/options/declaration.TypeDocOptionMap[K] extends boolean ? typedoc.typedoc/dist/lib/utils/options/declaration.BooleanDeclarationOption : typedoc.typedoc/dist/lib/utils/options/declaration.TypeDocOptionMap[K] extends string ? typedoc.typedoc/dist/lib/utils/options/declaration.StringDeclarationOption : typedoc.typedoc/dist/lib/utils/options/declaration.TypeDocOptionMap[K] extends number ? typedoc.typedoc/dist/lib/utils/options/declaration.NumberDeclarationOption : typedoc.typedoc/dist/lib/utils/options/declaration.TypeDocOptionMap[K] extends std.Array<string> ? typedoc.typedoc/dist/lib/utils/options/declaration.ArrayDeclarationOption : unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.TypeDocOptionMap[K] ? typedoc.typedoc/dist/lib/utils/options/declaration.MixedDeclarationOption | typedoc.typedoc/dist/lib/utils/options/declaration.ObjectDeclarationOption : typedoc.typedoc/dist/lib/utils/options/declaration.TypeDocOptionMap[K] extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<unknown> ? / * Inlined typedoc.typedoc/dist/lib/utils/options/declaration.MixedDeclarationOption & {validate (value : unknown): void} * /
{  type :typedoc.typedoc/dist/lib/utils/options/declaration.ParameterType.Mixed,   defaultValue :unknown | undefined,   validate :(value : unknown): void | undefined,   name :string,   help :string, validate (value : unknown): void} | / * Inlined typedoc.typedoc/dist/lib/utils/options/declaration.ObjectDeclarationOption & {validate (value : unknown): void} * /
{  type :typedoc.typedoc/dist/lib/utils/options/declaration.ParameterType.Object,   defaultValue :unknown | undefined,   validate :(value : unknown): void | undefined,   name :string,   help :string, validate (value : unknown): void} : typedoc.typedoc/dist/lib/utils/options/declaration.TypeDocOptionMap[K] extends std.Record<string, boolean> ? typedoc.typedoc/dist/lib/utils/options/declaration.FlagsDeclarationOption<typedoc.typedoc/dist/lib/utils/options/declaration.TypeDocOptionMap[K]> : typedoc.typedoc/dist/lib/utils/options/declaration.TypeDocOptionMap[K] extends std.Record<string | number, infer U> ? typedoc.typedoc/dist/lib/utils/options/declaration.MapDeclarationOption<U> : never
  }}}
  */
type KeyToDeclaration[K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 67, starting with typings.typedoc.typedocStrings.options, typings.typedoc.typedocStrings.tsconfig, typings.typedoc.typedocStrings.compilerOptions */ Any */] = BooleanDeclarationOption
