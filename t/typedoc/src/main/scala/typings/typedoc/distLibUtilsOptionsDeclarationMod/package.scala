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
