package typings.typescript

import typings.typescript.mod.CompletionsTriggerCharacter
import typings.typescript.mod.RefactorTriggerReason
import typings.typescript.mod.SignatureHelpRetriggerCharacter
import typings.typescript.mod.SignatureHelpTriggerCharacter
import typings.typescript.mod.TypeOfTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typescriptStrings {
  
  @scala.inline
  def `@`: `@` = "@".asInstanceOf[`@`]
  
  @scala.inline
  def Apostrophe: Apostrophe = "'".asInstanceOf[Apostrophe]
  
  @scala.inline
  def Comma: Comma = ",".asInstanceOf[Comma]
  
  @scala.inline
  def CreatePackageJsonAutoImportProvider: CreatePackageJsonAutoImportProvider = "CreatePackageJsonAutoImportProvider".asInstanceOf[CreatePackageJsonAutoImportProvider]
  
  @scala.inline
  def Dot: Dot = ".".asInstanceOf[Dot]
  
  @scala.inline
  def Graveaccent: Graveaccent = "`".asInstanceOf[Graveaccent]
  
  @scala.inline
  def Leftparenthesis: Leftparenthesis = "(".asInstanceOf[Leftparenthesis]
  
  @scala.inline
  def Lessthansign: Lessthansign = "<".asInstanceOf[Lessthansign]
  
  @scala.inline
  def Numbersign: Numbersign = "#".asInstanceOf[Numbersign]
  
  @scala.inline
  def Quotationmark: Quotationmark = "\"".asInstanceOf[Quotationmark]
  
  @scala.inline
  def Rightparenthesis: Rightparenthesis = ")".asInstanceOf[Rightparenthesis]
  
  @scala.inline
  def Slash: Slash = "/".asInstanceOf[Slash]
  
  @scala.inline
  def UpdateGraph: UpdateGraph = "UpdateGraph".asInstanceOf[UpdateGraph]
  
  @scala.inline
  def actionColonColoninvalidate: actionColonColoninvalidate = "action::invalidate".asInstanceOf[actionColonColoninvalidate]
  
  @scala.inline
  def actionColonColonpackageInstalled: actionColonColonpackageInstalled = "action::packageInstalled".asInstanceOf[actionColonColonpackageInstalled]
  
  @scala.inline
  def actionColonColonset: actionColonColonset = "action::set".asInstanceOf[actionColonColonset]
  
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  
  @scala.inline
  def bigint: bigint = "bigint".asInstanceOf[bigint]
  
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  
  @scala.inline
  def camelCase: camelCase = "camelCase".asInstanceOf[camelCase]
  
  @scala.inline
  def characterTyped: characterTyped = "characterTyped".asInstanceOf[characterTyped]
  
  @scala.inline
  def closeProject: closeProject = "closeProject".asInstanceOf[closeProject]
  
  @scala.inline
  def discover: discover = "discover".asInstanceOf[discover]
  
  @scala.inline
  def double: double = "double".asInstanceOf[double]
  
  @scala.inline
  def dts: dts = "dts".asInstanceOf[dts]
  
  @scala.inline
  def eventColonColonbeginInstallTypes: eventColonColonbeginInstallTypes = "event::beginInstallTypes".asInstanceOf[eventColonColonbeginInstallTypes]
  
  @scala.inline
  def eventColonColonendInstallTypes: eventColonColonendInstallTypes = "event::endInstallTypes".asInstanceOf[eventColonColonendInstallTypes]
  
  @scala.inline
  def eventColonColoninitializationFailed: eventColonColoninitializationFailed = "event::initializationFailed".asInstanceOf[eventColonColoninitializationFailed]
  
  @scala.inline
  def eventColonColontypesRegistry: eventColonColontypesRegistry = "event::typesRegistry".asInstanceOf[eventColonColontypesRegistry]
  
  @scala.inline
  def exact: exact = "exact".asInstanceOf[exact]
  
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  
  @scala.inline
  def function: function = "function".asInstanceOf[function]
  
  @scala.inline
  def `implicit`: `implicit` = "implicit".asInstanceOf[`implicit`]
  
  @scala.inline
  def index: index = "index".asInstanceOf[index]
  
  @scala.inline
  def installPackage: installPackage = "installPackage".asInstanceOf[installPackage]
  
  @scala.inline
  def invoked: invoked = "invoked".asInstanceOf[invoked]
  
  @scala.inline
  def js_ : js_ = "js".asInstanceOf[js_]
  
  @scala.inline
  def minimal: minimal = "minimal".asInstanceOf[minimal]
  
  @scala.inline
  def `non-relative`: `non-relative` = "non-relative".asInstanceOf[`non-relative`]
  
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  
  @scala.inline
  def `object`: `object` = "object".asInstanceOf[`object`]
  
  @scala.inline
  def off: off = "off".asInstanceOf[off]
  
  @scala.inline
  def on: on = "on".asInstanceOf[on]
  
  @scala.inline
  def prefix: prefix = "prefix".asInstanceOf[prefix]
  
  @scala.inline
  def quit: quit = "quit".asInstanceOf[quit]
  
  @scala.inline
  def relative: relative = "relative".asInstanceOf[relative]
  
  @scala.inline
  def retrigger: retrigger = "retrigger".asInstanceOf[retrigger]
  
  @scala.inline
  def single: single = "single".asInstanceOf[single]
  
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  
  @scala.inline
  def substring: substring = "substring".asInstanceOf[substring]
  
  @scala.inline
  def symbol: symbol = "symbol".asInstanceOf[symbol]
  
  @scala.inline
  def typesRegistry: typesRegistry = "typesRegistry".asInstanceOf[typesRegistry]
  
  @scala.inline
  def undefined: undefined = "undefined".asInstanceOf[undefined]
  
  @js.native
  sealed trait `@` extends CompletionsTriggerCharacter
  
  @js.native
  sealed trait Apostrophe extends CompletionsTriggerCharacter
  
  @js.native
  sealed trait Comma
    extends SignatureHelpRetriggerCharacter
       with SignatureHelpTriggerCharacter
  
  @js.native
  sealed trait CreatePackageJsonAutoImportProvider extends js.Object
  
  @js.native
  sealed trait Dot extends CompletionsTriggerCharacter
  
  @js.native
  sealed trait Graveaccent extends CompletionsTriggerCharacter
  
  @js.native
  sealed trait Leftparenthesis
    extends SignatureHelpRetriggerCharacter
       with SignatureHelpTriggerCharacter
  
  @js.native
  sealed trait Lessthansign
    extends CompletionsTriggerCharacter
       with SignatureHelpRetriggerCharacter
       with SignatureHelpTriggerCharacter
  
  @js.native
  sealed trait Numbersign extends CompletionsTriggerCharacter
  
  @js.native
  sealed trait Quotationmark extends CompletionsTriggerCharacter
  
  @js.native
  sealed trait Rightparenthesis extends SignatureHelpRetriggerCharacter
  
  @js.native
  sealed trait Slash extends CompletionsTriggerCharacter
  
  @js.native
  sealed trait UpdateGraph extends js.Object
  
  @js.native
  sealed trait actionColonColoninvalidate extends js.Object
  
  @js.native
  sealed trait actionColonColonpackageInstalled extends js.Object
  
  @js.native
  sealed trait actionColonColonset extends js.Object
  
  @js.native
  sealed trait auto extends js.Object
  
  @js.native
  sealed trait bigint extends TypeOfTag
  
  @js.native
  sealed trait boolean extends TypeOfTag
  
  @js.native
  sealed trait camelCase extends js.Object
  
  @js.native
  sealed trait characterTyped extends js.Object
  
  @js.native
  sealed trait closeProject extends js.Object
  
  @js.native
  sealed trait discover extends js.Object
  
  @js.native
  sealed trait double extends js.Object
  
  @js.native
  sealed trait dts extends js.Object
  
  @js.native
  sealed trait eventColonColonbeginInstallTypes extends js.Object
  
  @js.native
  sealed trait eventColonColonendInstallTypes extends js.Object
  
  @js.native
  sealed trait eventColonColoninitializationFailed extends js.Object
  
  @js.native
  sealed trait eventColonColontypesRegistry extends js.Object
  
  @js.native
  sealed trait exact extends js.Object
  
  @js.native
  sealed trait file extends js.Object
  
  @js.native
  sealed trait function extends TypeOfTag
  
  @js.native
  sealed trait `implicit` extends RefactorTriggerReason
  
  @js.native
  sealed trait index extends js.Object
  
  @js.native
  sealed trait installPackage extends js.Object
  
  @js.native
  sealed trait invoked extends RefactorTriggerReason
  
  @js.native
  sealed trait js_ extends js.Object
  
  @js.native
  sealed trait minimal extends js.Object
  
  @js.native
  sealed trait `non-relative` extends js.Object
  
  @js.native
  sealed trait number extends TypeOfTag
  
  @js.native
  sealed trait `object` extends TypeOfTag
  
  @js.native
  sealed trait off extends js.Object
  
  @js.native
  sealed trait on extends js.Object
  
  @js.native
  sealed trait prefix extends js.Object
  
  @js.native
  sealed trait quit extends js.Object
  
  @js.native
  sealed trait relative extends js.Object
  
  @js.native
  sealed trait retrigger extends js.Object
  
  @js.native
  sealed trait single extends js.Object
  
  @js.native
  sealed trait string extends TypeOfTag
  
  @js.native
  sealed trait substring extends js.Object
  
  @js.native
  sealed trait symbol extends TypeOfTag
  
  @js.native
  sealed trait typesRegistry extends js.Object
  
  @js.native
  sealed trait undefined extends TypeOfTag
}
