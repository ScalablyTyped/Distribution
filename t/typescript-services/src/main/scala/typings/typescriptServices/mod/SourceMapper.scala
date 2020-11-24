package typings.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "SourceMapper")
@js.native
class SourceMapper protected ()
  extends typings.typescriptServices.TypeScript.SourceMapper {
  def this(
    jsFile: typings.typescriptServices.TypeScript.TextWriter,
    sourceMapOut: typings.typescriptServices.TypeScript.TextWriter,
    document: typings.typescriptServices.TypeScript.Document,
    jsFilePath: String,
    emitOptions: typings.typescriptServices.TypeScript.EmitOptions,
    resolvePath: js.Function1[/* path */ String, String]
  ) = this()
}
/* static members */
@JSImport("typescript-services", "SourceMapper")
@js.native
object SourceMapper extends js.Object {
  
  var MapFileExtension: String = js.native
}
