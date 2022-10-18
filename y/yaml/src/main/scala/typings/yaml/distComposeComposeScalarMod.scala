package typings.yaml

import typings.yaml.distComposeComposeNodeMod.ComposeContext
import typings.yaml.distComposeComposerMod.ComposeErrorHandler
import typings.yaml.distNodesScalarMod.Scalar.Parsed
import typings.yaml.distParseCstMod.BlockScalar
import typings.yaml.distParseCstMod.FlowScalar
import typings.yaml.distParseCstMod.SourceToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComposeComposeScalarMod {
  
  @JSImport("yaml/dist/compose/compose-scalar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def composeScalar(ctx: ComposeContext, token: BlockScalar, tagToken: Null, onError: ComposeErrorHandler): Parsed = (^.asInstanceOf[js.Dynamic].applyDynamic("composeScalar")(ctx.asInstanceOf[js.Any], token.asInstanceOf[js.Any], tagToken.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Parsed]
  inline def composeScalar(ctx: ComposeContext, token: BlockScalar, tagToken: SourceToken, onError: ComposeErrorHandler): Parsed = (^.asInstanceOf[js.Dynamic].applyDynamic("composeScalar")(ctx.asInstanceOf[js.Any], token.asInstanceOf[js.Any], tagToken.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Parsed]
  inline def composeScalar(ctx: ComposeContext, token: FlowScalar, tagToken: Null, onError: ComposeErrorHandler): Parsed = (^.asInstanceOf[js.Dynamic].applyDynamic("composeScalar")(ctx.asInstanceOf[js.Any], token.asInstanceOf[js.Any], tagToken.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Parsed]
  inline def composeScalar(ctx: ComposeContext, token: FlowScalar, tagToken: SourceToken, onError: ComposeErrorHandler): Parsed = (^.asInstanceOf[js.Dynamic].applyDynamic("composeScalar")(ctx.asInstanceOf[js.Any], token.asInstanceOf[js.Any], tagToken.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Parsed]
}
