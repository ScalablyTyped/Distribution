package typings.typedoc.optionsDeclarationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def convert(value: js.Any, option: typings.typedoc.optionsDeclarationMod.ArrayDeclarationOption): typings.typedoc.optionsDeclarationMod.DeclarationOptionToOptionType[typings.typedoc.optionsDeclarationMod.ArrayDeclarationOption] = (typings.typedoc.optionsDeclarationMod.^.asInstanceOf[js.Dynamic].applyDynamic("convert")(value.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[typings.typedoc.optionsDeclarationMod.DeclarationOptionToOptionType[typings.typedoc.optionsDeclarationMod.ArrayDeclarationOption]]
inline def convert(value: js.Any, option: typings.typedoc.optionsDeclarationMod.BooleanDeclarationOption): typings.typedoc.optionsDeclarationMod.DeclarationOptionToOptionType[typings.typedoc.optionsDeclarationMod.BooleanDeclarationOption] = (typings.typedoc.optionsDeclarationMod.^.asInstanceOf[js.Dynamic].applyDynamic("convert")(value.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[typings.typedoc.optionsDeclarationMod.DeclarationOptionToOptionType[typings.typedoc.optionsDeclarationMod.BooleanDeclarationOption]]
inline def convert(value: js.Any, option: typings.typedoc.optionsDeclarationMod.MapDeclarationOption[js.Any]): typings.typedoc.optionsDeclarationMod.DeclarationOptionToOptionType[typings.typedoc.optionsDeclarationMod.MapDeclarationOption[js.Any]] = (typings.typedoc.optionsDeclarationMod.^.asInstanceOf[js.Dynamic].applyDynamic("convert")(value.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[typings.typedoc.optionsDeclarationMod.DeclarationOptionToOptionType[typings.typedoc.optionsDeclarationMod.MapDeclarationOption[js.Any]]]
inline def convert(value: js.Any, option: typings.typedoc.optionsDeclarationMod.MixedDeclarationOption): typings.typedoc.optionsDeclarationMod.DeclarationOptionToOptionType[typings.typedoc.optionsDeclarationMod.MixedDeclarationOption] = (typings.typedoc.optionsDeclarationMod.^.asInstanceOf[js.Dynamic].applyDynamic("convert")(value.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[typings.typedoc.optionsDeclarationMod.DeclarationOptionToOptionType[typings.typedoc.optionsDeclarationMod.MixedDeclarationOption]]
inline def convert(value: js.Any, option: typings.typedoc.optionsDeclarationMod.NumberDeclarationOption): typings.typedoc.optionsDeclarationMod.DeclarationOptionToOptionType[typings.typedoc.optionsDeclarationMod.NumberDeclarationOption] = (typings.typedoc.optionsDeclarationMod.^.asInstanceOf[js.Dynamic].applyDynamic("convert")(value.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[typings.typedoc.optionsDeclarationMod.DeclarationOptionToOptionType[typings.typedoc.optionsDeclarationMod.NumberDeclarationOption]]
inline def convert(value: js.Any, option: typings.typedoc.optionsDeclarationMod.StringDeclarationOption): typings.typedoc.optionsDeclarationMod.DeclarationOptionToOptionType[typings.typedoc.optionsDeclarationMod.StringDeclarationOption] = (typings.typedoc.optionsDeclarationMod.^.asInstanceOf[js.Dynamic].applyDynamic("convert")(value.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[typings.typedoc.optionsDeclarationMod.DeclarationOptionToOptionType[typings.typedoc.optionsDeclarationMod.StringDeclarationOption]]

/* Rewritten from type alias, can be one of: 
  - typings.typedoc.optionsDeclarationMod.StringDeclarationOption
  - typings.typedoc.optionsDeclarationMod.NumberDeclarationOption
  - typings.typedoc.optionsDeclarationMod.BooleanDeclarationOption
  - typings.typedoc.optionsDeclarationMod.MixedDeclarationOption
  - typings.typedoc.optionsDeclarationMod.MapDeclarationOption[js.Any]
  - typings.typedoc.optionsDeclarationMod.ArrayDeclarationOption
*/
type DeclarationOption = typings.typedoc.optionsDeclarationMod._DeclarationOption | typings.typedoc.optionsDeclarationMod.MapDeclarationOption[js.Any]

type DeclarationOptionToOptionType[T /* <: typings.typedoc.optionsDeclarationMod.DeclarationOption */] = js.Array[java.lang.String] | js.Any | scala.Boolean | scala.Double | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.typedoc.optionsDeclarationMod.MapDeclarationOption[js.Any]
  - typings.typedoc.optionsDeclarationMod.MixedDeclarationOption
  - typings.typedoc.optionsDeclarationMod.ArrayDeclarationOption
  - typings.typedoc.optionsDeclarationMod.NumberDeclarationOption
  - typings.typedoc.optionsDeclarationMod.StringDeclarationOption
  - typings.typedoc.optionsDeclarationMod.BooleanDeclarationOption
*/
type KeyToDeclaration[K /* <: typings.typedoc.typedocStrings.options | typings.typedoc.typedocStrings.tsconfig | typings.typedoc.typedocStrings.inputFiles | typings.typedoc.typedocStrings.mode | typings.typedoc.typedocStrings.includeDeclarations | typings.typedoc.typedocStrings.entryPoint | typings.typedoc.typedocStrings.exclude | typings.typedoc.typedocStrings.externalPattern | typings.typedoc.typedocStrings.excludeExternals | typings.typedoc.typedocStrings.excludeNotExported | typings.typedoc.typedocStrings.excludePrivate | typings.typedoc.typedocStrings.excludeProtected | typings.typedoc.typedocStrings.excludeNotDocumented | typings.typedoc.typedocStrings.ignoreCompilerErrors | typings.typedoc.typedocStrings.disableSources | typings.typedoc.typedocStrings.includes | typings.typedoc.typedocStrings.media | typings.typedoc.typedocStrings.out | typings.typedoc.typedocStrings.json | typings.typedoc.typedocStrings.theme | typings.typedoc.typedocStrings.name | typings.typedoc.typedocStrings.includeVersion | typings.typedoc.typedocStrings.excludeTags | typings.typedoc.typedocStrings.readme | typings.typedoc.typedocStrings.defaultCategory | typings.typedoc.typedocStrings.categoryOrder | typings.typedoc.typedocStrings.categorizeByGroup | typings.typedoc.typedocStrings.gitRevision | typings.typedoc.typedocStrings.gitRemote | typings.typedoc.typedocStrings.gaID | typings.typedoc.typedocStrings.gaSite | typings.typedoc.typedocStrings.hideGenerator | typings.typedoc.typedocStrings.toc | typings.typedoc.typedocStrings.disableOutputCheck | typings.typedoc.typedocStrings.help | typings.typedoc.typedocStrings.version | typings.typedoc.typedocStrings.plugin | typings.typedoc.typedocStrings.logger | typings.typedoc.typedocStrings.listInvalidSymbolLinks */] = typings.typedoc.optionsDeclarationMod._KeyToDeclaration[K] | typings.typedoc.optionsDeclarationMod.MapDeclarationOption[js.Any]

type KnownKeys[T] = js.Any

type TypeDocAndTSOptions = typings.typedoc.optionsDeclarationMod.TypeDocOptions & (typings.std.Pick[
typings.typescript.mod.CompilerOptions, 
typings.std.Exclude[
  typings.typedoc.optionsDeclarationMod.KnownKeys[typings.typescript.mod.CompilerOptions], 
  typings.typedoc.typescriptMod.IgnoredTsOptionKeys
]])
