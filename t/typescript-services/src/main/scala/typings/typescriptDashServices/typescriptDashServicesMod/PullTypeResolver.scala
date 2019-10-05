package typings.typescriptDashServices.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "PullTypeResolver")
@js.native
class PullTypeResolver protected ()
  extends typings.typescriptDashServices.TypeScript.PullTypeResolver {
  def this(
    compilationSettings: typings.typescriptDashServices.TypeScript.ImmutableCompilationSettings,
    semanticInfoChain: typings.typescriptDashServices.TypeScript.SemanticInfoChain
  ) = this()
}

/* static members */
@JSImport("typescript-services", "PullTypeResolver")
@js.native
object PullTypeResolver extends js.Object {
  var globalTypeCheckPhase: Double = js.native
  def hasSetAccessorParameterTypeAnnotation(setAccessor: typings.typescriptDashServices.TypeScript.SetAccessor): Boolean = js.native
  def typeCheck(
    compilationSettings: typings.typescriptDashServices.TypeScript.ImmutableCompilationSettings,
    semanticInfoChain: typings.typescriptDashServices.TypeScript.SemanticInfoChain,
    document: typings.typescriptDashServices.TypeScript.Document
  ): Unit = js.native
}

