package typings.typescriptDashServices.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "PullTypeResolver")
@js.native
class PullTypeResolver protected ()
  extends typings.typescriptDashServices.TypeScriptNs.PullTypeResolver {
  def this(
    compilationSettings: typings.typescriptDashServices.TypeScriptNs.ImmutableCompilationSettings,
    semanticInfoChain: typings.typescriptDashServices.TypeScriptNs.SemanticInfoChain
  ) = this()
}

/* static members */
@JSImport("typescript-services", "PullTypeResolver")
@js.native
object PullTypeResolver extends js.Object {
  var globalTypeCheckPhase: Double = js.native
  def hasSetAccessorParameterTypeAnnotation(setAccessor: typings.typescriptDashServices.TypeScriptNs.SetAccessor): Boolean = js.native
  def typeCheck(
    compilationSettings: typings.typescriptDashServices.TypeScriptNs.ImmutableCompilationSettings,
    semanticInfoChain: typings.typescriptDashServices.TypeScriptNs.SemanticInfoChain,
    document: typings.typescriptDashServices.TypeScriptNs.Document
  ): Unit = js.native
}

