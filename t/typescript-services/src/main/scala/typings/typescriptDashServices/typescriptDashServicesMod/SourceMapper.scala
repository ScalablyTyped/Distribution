package typings.typescriptDashServices.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SourceMapper")
@js.native
class SourceMapper protected ()
  extends typings.typescriptDashServices.TypeScriptNs.SourceMapper {
  def this(
    jsFile: typings.typescriptDashServices.TypeScriptNs.TextWriter,
    sourceMapOut: typings.typescriptDashServices.TypeScriptNs.TextWriter,
    document: typings.typescriptDashServices.TypeScriptNs.Document,
    jsFilePath: String,
    emitOptions: typings.typescriptDashServices.TypeScriptNs.EmitOptions,
    resolvePath: js.Function1[/* path */ String, String]
  ) = this()
}

/* static members */
@JSImport("typescript-services", "SourceMapper")
@js.native
object SourceMapper extends js.Object {
  var MapFileExtension: String = js.native
}

