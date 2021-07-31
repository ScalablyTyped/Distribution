package typings.typedoc.optionsDeclarationMod

import typings.typedoc.optionsDeclarationMod.ParameterType.Array
import typings.typedoc.optionsDeclarationMod.ParameterType.Boolean
import typings.typedoc.optionsDeclarationMod.ParameterType.Mixed
import typings.typedoc.optionsDeclarationMod.ParameterType.Number
import typings.typedoc.typedocStrings.categorizeByGroup
import typings.typedoc.typedocStrings.categoryOrder
import typings.typedoc.typedocStrings.defaultCategory
import typings.typedoc.typedocStrings.disableOutputCheck
import typings.typedoc.typedocStrings.disableSources
import typings.typedoc.typedocStrings.entryPoint
import typings.typedoc.typedocStrings.exclude
import typings.typedoc.typedocStrings.excludeExternals
import typings.typedoc.typedocStrings.excludeNotDocumented
import typings.typedoc.typedocStrings.excludeNotExported
import typings.typedoc.typedocStrings.excludePrivate
import typings.typedoc.typedocStrings.excludeProtected
import typings.typedoc.typedocStrings.excludeTags
import typings.typedoc.typedocStrings.externalPattern
import typings.typedoc.typedocStrings.gaID
import typings.typedoc.typedocStrings.gaSite
import typings.typedoc.typedocStrings.gitRemote
import typings.typedoc.typedocStrings.gitRevision
import typings.typedoc.typedocStrings.help
import typings.typedoc.typedocStrings.hideGenerator
import typings.typedoc.typedocStrings.ignoreCompilerErrors
import typings.typedoc.typedocStrings.includeDeclarations
import typings.typedoc.typedocStrings.includeVersion
import typings.typedoc.typedocStrings.includes
import typings.typedoc.typedocStrings.inputFiles
import typings.typedoc.typedocStrings.json
import typings.typedoc.typedocStrings.listInvalidSymbolLinks
import typings.typedoc.typedocStrings.logger
import typings.typedoc.typedocStrings.media
import typings.typedoc.typedocStrings.mode
import typings.typedoc.typedocStrings.name
import typings.typedoc.typedocStrings.options
import typings.typedoc.typedocStrings.out
import typings.typedoc.typedocStrings.plugin
import typings.typedoc.typedocStrings.readme
import typings.typedoc.typedocStrings.theme
import typings.typedoc.typedocStrings.toc
import typings.typedoc.typedocStrings.tsconfig
import typings.typedoc.typedocStrings.version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _KeyToDeclaration[K /* <: options | tsconfig | inputFiles | mode | includeDeclarations | entryPoint | exclude | externalPattern | excludeExternals | excludeNotExported | excludePrivate | excludeProtected | excludeNotDocumented | ignoreCompilerErrors | disableSources | includes | media | out | json | theme | name | includeVersion | excludeTags | readme | defaultCategory | categoryOrder | categorizeByGroup | gitRevision | gitRemote | gaID | gaSite | hideGenerator | toc | disableOutputCheck | help | version | plugin | logger | listInvalidSymbolLinks */] extends StObject
object _KeyToDeclaration {
  
  @scala.inline
  def ArrayDeclarationOption(help: String, name: String, `type`: Array): typings.typedoc.optionsDeclarationMod.ArrayDeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.optionsDeclarationMod.ArrayDeclarationOption]
  }
  
  @scala.inline
  def BooleanDeclarationOption(help: String, name: String, `type`: Boolean): typings.typedoc.optionsDeclarationMod.BooleanDeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.optionsDeclarationMod.BooleanDeclarationOption]
  }
  
  @scala.inline
  def MixedDeclarationOption(help: String, name: String, `type`: Mixed): typings.typedoc.optionsDeclarationMod.MixedDeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.optionsDeclarationMod.MixedDeclarationOption]
  }
  
  @scala.inline
  def NumberDeclarationOption(help: String, name: String, `type`: Number): typings.typedoc.optionsDeclarationMod.NumberDeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.optionsDeclarationMod.NumberDeclarationOption]
  }
  
  @scala.inline
  def StringDeclarationOption(help: String, name: String): typings.typedoc.optionsDeclarationMod.StringDeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.optionsDeclarationMod.StringDeclarationOption]
  }
}
