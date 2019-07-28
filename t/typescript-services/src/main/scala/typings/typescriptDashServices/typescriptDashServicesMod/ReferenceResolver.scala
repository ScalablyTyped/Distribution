package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.IReferenceResolverHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ReferenceResolver")
@js.native
class ReferenceResolver protected ()
  extends typings.typescriptDashServices.TypeScriptNs.ReferenceResolver {
  def this(
    inputFileNames: js.Array[String],
    host: IReferenceResolverHost,
    useCaseSensitiveFileResolution: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ReferenceResolver")
@js.native
object ReferenceResolver extends js.Object {
  def resolve(
    inputFileNames: js.Array[String],
    host: IReferenceResolverHost,
    useCaseSensitiveFileResolution: Boolean
  ): typings.typescriptDashServices.TypeScriptNs.ReferenceResolutionResult = js.native
}

