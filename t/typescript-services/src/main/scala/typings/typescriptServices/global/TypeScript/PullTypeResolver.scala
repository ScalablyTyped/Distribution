package typings.typescriptServices.global.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.PullTypeResolver")
@js.native
class PullTypeResolver protected ()
  extends typings.typescriptServices.TypeScript.PullTypeResolver {
  def this(
    compilationSettings: typings.typescriptServices.TypeScript.ImmutableCompilationSettings,
    semanticInfoChain: typings.typescriptServices.TypeScript.SemanticInfoChain
  ) = this()
}
object PullTypeResolver {
  
  @JSGlobal("TypeScript.PullTypeResolver")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("TypeScript.PullTypeResolver.globalTypeCheckPhase")
  @js.native
  def globalTypeCheckPhase: Double = js.native
  @scala.inline
  def globalTypeCheckPhase_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalTypeCheckPhase")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("TypeScript.PullTypeResolver.hasSetAccessorParameterTypeAnnotation")
  @js.native
  def hasSetAccessorParameterTypeAnnotation(setAccessor: typings.typescriptServices.TypeScript.SetAccessor): Boolean = js.native
  
  /* static member */
  @JSGlobal("TypeScript.PullTypeResolver.typeCheck")
  @js.native
  def typeCheck(
    compilationSettings: typings.typescriptServices.TypeScript.ImmutableCompilationSettings,
    semanticInfoChain: typings.typescriptServices.TypeScript.SemanticInfoChain,
    document: typings.typescriptServices.TypeScript.Document
  ): Unit = js.native
}
