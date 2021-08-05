package typings.typedoc.optionsDeclarationMod

import typings.typedoc.optionsDeclarationMod.ParameterType.Array
import typings.typedoc.optionsDeclarationMod.ParameterType.Boolean
import typings.typedoc.optionsDeclarationMod.ParameterType.Mixed
import typings.typedoc.optionsDeclarationMod.ParameterType.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _DeclarationOption extends StObject
object _DeclarationOption {
  
  inline def ArrayDeclarationOption(help: String, name: String, `type`: Array): typings.typedoc.optionsDeclarationMod.ArrayDeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.optionsDeclarationMod.ArrayDeclarationOption]
  }
  
  inline def BooleanDeclarationOption(help: String, name: String, `type`: Boolean): typings.typedoc.optionsDeclarationMod.BooleanDeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.optionsDeclarationMod.BooleanDeclarationOption]
  }
  
  inline def MixedDeclarationOption(help: String, name: String, `type`: Mixed): typings.typedoc.optionsDeclarationMod.MixedDeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.optionsDeclarationMod.MixedDeclarationOption]
  }
  
  inline def NumberDeclarationOption(help: String, name: String, `type`: Number): typings.typedoc.optionsDeclarationMod.NumberDeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.optionsDeclarationMod.NumberDeclarationOption]
  }
  
  inline def StringDeclarationOption(help: String, name: String): typings.typedoc.optionsDeclarationMod.StringDeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.optionsDeclarationMod.StringDeclarationOption]
  }
}
