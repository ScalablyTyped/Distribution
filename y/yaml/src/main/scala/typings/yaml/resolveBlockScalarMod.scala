package typings.yaml

import typings.yaml.anon.Range
import typings.yaml.composerMod.ComposeErrorHandler
import typings.yaml.cstMod.BlockScalar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolveBlockScalarMod {
  
  @JSImport("yaml/dist/compose/resolve-block-scalar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveBlockScalar(scalar: BlockScalar, strict: Boolean, onError: ComposeErrorHandler): Range = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveBlockScalar")(scalar.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Range]
}
