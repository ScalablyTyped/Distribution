package typings.typescriptServices.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "PullTypeResolver")
@js.native
class PullTypeResolver protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.PullTypeResolver {
  def this(
    compilationSettings: typings.typescriptServices.TypeScript.ImmutableCompilationSettings,
    semanticInfoChain: typings.typescriptServices.TypeScript.SemanticInfoChain
  ) = this()
}
object PullTypeResolver {
  
  @JSImport("typescript-services", "PullTypeResolver")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("typescript-services", "PullTypeResolver.globalTypeCheckPhase")
  @js.native
  def globalTypeCheckPhase: Double = js.native
  @scala.inline
  def globalTypeCheckPhase_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalTypeCheckPhase")(x.asInstanceOf[js.Any])
  
  /* static member */
  @scala.inline
  def hasSetAccessorParameterTypeAnnotation(setAccessor: typings.typescriptServices.TypeScript.SetAccessor): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasSetAccessorParameterTypeAnnotation")(setAccessor.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* static member */
  @scala.inline
  def typeCheck(
    compilationSettings: typings.typescriptServices.TypeScript.ImmutableCompilationSettings,
    semanticInfoChain: typings.typescriptServices.TypeScript.SemanticInfoChain,
    document: typings.typescriptServices.TypeScript.Document
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("typeCheck")(compilationSettings.asInstanceOf[js.Any], semanticInfoChain.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
