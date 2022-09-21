package typings.yaml

import typings.yaml.anon.Type
import typings.yaml.composerMod.ComposeErrorHandler
import typings.yaml.cstMod.FlowScalar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolveFlowScalarMod {
  
  @JSImport("yaml/dist/compose/resolve-flow-scalar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveFlowScalar(scalar: FlowScalar, strict: Boolean, onError: ComposeErrorHandler): Type = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveFlowScalar")(scalar.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Type]
}
