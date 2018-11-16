package typings
package typescriptDashServicesLib.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "PullTypeResolver")
@js.native
class PullTypeResolver protected ()
  extends typescriptDashServicesLib.TypeScriptNs.PullTypeResolver {
  def this(compilationSettings: typescriptDashServicesLib.TypeScriptNs.ImmutableCompilationSettings, semanticInfoChain: typescriptDashServicesLib.TypeScriptNs.SemanticInfoChain) = this()
}

@JSImport("typescript-services", "PullTypeResolver")
@js.native
object PullTypeResolver extends js.Object {
  var globalTypeCheckPhase: scala.Double = js.native
  def hasSetAccessorParameterTypeAnnotation(setAccessor: typescriptDashServicesLib.TypeScriptNs.SetAccessor): scala.Boolean = js.native
  def typeCheck(
    compilationSettings: typescriptDashServicesLib.TypeScriptNs.ImmutableCompilationSettings,
    semanticInfoChain: typescriptDashServicesLib.TypeScriptNs.SemanticInfoChain,
    document: typescriptDashServicesLib.TypeScriptNs.Document
  ): scala.Unit = js.native
}

