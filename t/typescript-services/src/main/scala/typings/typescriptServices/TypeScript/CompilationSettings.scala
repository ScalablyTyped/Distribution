package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompilationSettings extends js.Object {
  var allowAutomaticSemicolonInsertion: Boolean
  var codeGenTarget: LanguageVersion
  var codepage: Double
  var createFileLog: Boolean
  var gatherDiagnostics: Boolean
  var generateDeclarationFiles: Boolean
  var mapRoot: String
  var mapSourceFiles: Boolean
  var moduleGenTarget: ModuleGenTarget
  var noImplicitAny: Boolean
  var noLib: Boolean
  var noResolve: Boolean
  var outDirOption: String
  var outFileOption: String
  var propagateEnumConstants: Boolean
  var removeComments: Boolean
  var sourceRoot: String
  var useCaseSensitiveFileResolution: Boolean
  var watch: Boolean
}

object CompilationSettings {
  @scala.inline
  def apply(
    allowAutomaticSemicolonInsertion: Boolean,
    codeGenTarget: LanguageVersion,
    codepage: Double,
    createFileLog: Boolean,
    gatherDiagnostics: Boolean,
    generateDeclarationFiles: Boolean,
    mapRoot: String,
    mapSourceFiles: Boolean,
    moduleGenTarget: ModuleGenTarget,
    noImplicitAny: Boolean,
    noLib: Boolean,
    noResolve: Boolean,
    outDirOption: String,
    outFileOption: String,
    propagateEnumConstants: Boolean,
    removeComments: Boolean,
    sourceRoot: String,
    useCaseSensitiveFileResolution: Boolean,
    watch: Boolean
  ): CompilationSettings = {
    val __obj = js.Dynamic.literal(allowAutomaticSemicolonInsertion = allowAutomaticSemicolonInsertion.asInstanceOf[js.Any], codeGenTarget = codeGenTarget.asInstanceOf[js.Any], codepage = codepage.asInstanceOf[js.Any], createFileLog = createFileLog.asInstanceOf[js.Any], gatherDiagnostics = gatherDiagnostics.asInstanceOf[js.Any], generateDeclarationFiles = generateDeclarationFiles.asInstanceOf[js.Any], mapRoot = mapRoot.asInstanceOf[js.Any], mapSourceFiles = mapSourceFiles.asInstanceOf[js.Any], moduleGenTarget = moduleGenTarget.asInstanceOf[js.Any], noImplicitAny = noImplicitAny.asInstanceOf[js.Any], noLib = noLib.asInstanceOf[js.Any], noResolve = noResolve.asInstanceOf[js.Any], outDirOption = outDirOption.asInstanceOf[js.Any], outFileOption = outFileOption.asInstanceOf[js.Any], propagateEnumConstants = propagateEnumConstants.asInstanceOf[js.Any], removeComments = removeComments.asInstanceOf[js.Any], sourceRoot = sourceRoot.asInstanceOf[js.Any], useCaseSensitiveFileResolution = useCaseSensitiveFileResolution.asInstanceOf[js.Any], watch = watch.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilationSettings]
  }
}

