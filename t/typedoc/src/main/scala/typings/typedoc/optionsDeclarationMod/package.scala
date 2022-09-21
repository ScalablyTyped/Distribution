package typings.typedoc.optionsDeclarationMod

import typings.std.Record
import typings.typedoc.optionsDeclarationMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def convert(value: Any, option: DeclarationOption, configPath: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(value.asInstanceOf[js.Any], option.asInstanceOf[js.Any], configPath.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def convert(value: Any, option: DeclarationOption, configPath: String, oldValue: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(value.asInstanceOf[js.Any], option.asInstanceOf[js.Any], configPath.asInstanceOf[js.Any], oldValue.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def getDefaultValue(option: DeclarationOption): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultValue")(option.asInstanceOf[js.Any]).asInstanceOf[Any]

/* Rewritten from type alias, can be one of: 
  - typings.typedoc.optionsDeclarationMod.StringDeclarationOption
  - typings.typedoc.optionsDeclarationMod.NumberDeclarationOption
  - typings.typedoc.optionsDeclarationMod.BooleanDeclarationOption
  - typings.typedoc.optionsDeclarationMod.MixedDeclarationOption
  - typings.typedoc.optionsDeclarationMod.ObjectDeclarationOption
  - typings.typedoc.optionsDeclarationMod.MapDeclarationOption[scala.Any]
  - typings.typedoc.optionsDeclarationMod.ArrayDeclarationOption
  - typings.typedoc.optionsDeclarationMod.FlagsDeclarationOption[typings.std.Record[java.lang.String, scala.Boolean]]
*/
type DeclarationOption = _DeclarationOption | MapDeclarationOption[Any] | (FlagsDeclarationOption[Record[String, Boolean]])

type DeclarationOptionToOptionType[T /* <: DeclarationOption */] = /* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/utils/options/declaration.ParameterTypeToOptionTypeMap[std.Exclude<T['type'], undefined>] */ js.Any

/* Rewritten from type alias, can be one of: 
  - typings.typedoc.optionsDeclarationMod.MapDeclarationOption[scala.Any]
  - typings.typedoc.optionsDeclarationMod.FlagsDeclarationOption[
/ * import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/utils/options/declaration.TypeDocOptionMap[K] * / js.Any]
  - typings.typedoc.anon.MixedDeclarationOptionval
  - typings.typedoc.anon.ObjectDeclarationOptionva
  - typings.typedoc.optionsDeclarationMod.MixedDeclarationOption
  - typings.typedoc.optionsDeclarationMod.ObjectDeclarationOption
  - typings.typedoc.optionsDeclarationMod.ArrayDeclarationOption
  - typings.typedoc.optionsDeclarationMod.NumberDeclarationOption
  - typings.typedoc.optionsDeclarationMod.StringDeclarationOption
  - typings.typedoc.optionsDeclarationMod.BooleanDeclarationOption
*/
type KeyToDeclaration[K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63 */ Any */] = _KeyToDeclaration[K] | MapDeclarationOption[Any] | (FlagsDeclarationOption[
/* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/utils/options/declaration.TypeDocOptionMap[K] */ js.Any])
