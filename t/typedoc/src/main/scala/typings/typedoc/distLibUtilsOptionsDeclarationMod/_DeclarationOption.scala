package typings.typedoc.distLibUtilsOptionsDeclarationMod

import typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Array
import typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Boolean
import typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.GlobArray
import typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Mixed
import typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.ModuleArray
import typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Number
import typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Object
import typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.PathArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _DeclarationOption extends StObject
object _DeclarationOption {
  
  inline def ArrayDeclarationOption(help: String, name: String, `type`: Array | PathArray | ModuleArray | GlobArray): typings.typedoc.distLibUtilsOptionsDeclarationMod.ArrayDeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.distLibUtilsOptionsDeclarationMod.ArrayDeclarationOption]
  }
  
  inline def BooleanDeclarationOption(help: String, name: String, `type`: Boolean): typings.typedoc.distLibUtilsOptionsDeclarationMod.BooleanDeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.distLibUtilsOptionsDeclarationMod.BooleanDeclarationOption]
  }
  
  inline def MixedDeclarationOption(help: String, name: String, `type`: Mixed): typings.typedoc.distLibUtilsOptionsDeclarationMod.MixedDeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.distLibUtilsOptionsDeclarationMod.MixedDeclarationOption]
  }
  
  inline def NumberDeclarationOption(help: String, name: String, `type`: Number): typings.typedoc.distLibUtilsOptionsDeclarationMod.NumberDeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.distLibUtilsOptionsDeclarationMod.NumberDeclarationOption]
  }
  
  inline def ObjectDeclarationOption(help: String, name: String, `type`: Object): typings.typedoc.distLibUtilsOptionsDeclarationMod.ObjectDeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.distLibUtilsOptionsDeclarationMod.ObjectDeclarationOption]
  }
  
  inline def StringDeclarationOption(help: String, name: String): typings.typedoc.distLibUtilsOptionsDeclarationMod.StringDeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.distLibUtilsOptionsDeclarationMod.StringDeclarationOption]
  }
}
