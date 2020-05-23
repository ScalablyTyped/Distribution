package typings.typescriptServices.global.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PullTypeResolver")
@js.native
class PullTypeResolver protected ()
  extends typings.typescriptServices.TypeScript.PullTypeResolver {
  def this(
    compilationSettings: typings.typescriptServices.TypeScript.ImmutableCompilationSettings,
    semanticInfoChain: typings.typescriptServices.TypeScript.SemanticInfoChain
  ) = this()
}

/* static members */
@JSGlobal("TypeScript.PullTypeResolver")
@js.native
object PullTypeResolver extends js.Object {
  var globalTypeCheckPhase: Double = js.native
  def hasSetAccessorParameterTypeAnnotation(setAccessor: typings.typescriptServices.TypeScript.SetAccessor): Boolean = js.native
  def typeCheck(
    compilationSettings: typings.typescriptServices.TypeScript.ImmutableCompilationSettings,
    semanticInfoChain: typings.typescriptServices.TypeScript.SemanticInfoChain,
    document: typings.typescriptServices.TypeScript.Document
  ): Unit = js.native
}

