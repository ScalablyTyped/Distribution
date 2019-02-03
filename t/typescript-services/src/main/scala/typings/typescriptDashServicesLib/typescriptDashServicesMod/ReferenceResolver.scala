package typings
package typescriptDashServicesLib.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ReferenceResolver")
@js.native
class ReferenceResolver protected ()
  extends typescriptDashServicesLib.TypeScriptNs.ReferenceResolver {
  def this(inputFileNames: js.Array[java.lang.String], host: typescriptDashServicesLib.TypeScriptNs.IReferenceResolverHost, useCaseSensitiveFileResolution: scala.Boolean) = this()
}

/* static members */
@JSImport("typescript-services", "ReferenceResolver")
@js.native
object ReferenceResolver extends js.Object {
  def resolve(
    inputFileNames: js.Array[java.lang.String],
    host: typescriptDashServicesLib.TypeScriptNs.IReferenceResolverHost,
    useCaseSensitiveFileResolution: scala.Boolean
  ): typescriptDashServicesLib.TypeScriptNs.ReferenceResolutionResult = js.native
}

