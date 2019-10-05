package typings.typescriptDashServices.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SourceMapper")
@js.native
class SourceMapper protected ()
  extends typings.typescriptDashServices.TypeScript.SourceMapper {
  def this(
    jsFile: typings.typescriptDashServices.TypeScript.TextWriter,
    sourceMapOut: typings.typescriptDashServices.TypeScript.TextWriter,
    document: typings.typescriptDashServices.TypeScript.Document,
    jsFilePath: String,
    emitOptions: typings.typescriptDashServices.TypeScript.EmitOptions,
    resolvePath: js.Function1[/* path */ String, String]
  ) = this()
}

/* static members */
@JSImport("typescript-services", "SourceMapper")
@js.native
object SourceMapper extends js.Object {
  var MapFileExtension: String = js.native
}

