package typings.yaml

import typings.yaml.anon.AfterKey
import typings.yaml.anon.Comment
import typings.yaml.anon.End
import typings.yaml.distErrorsMod.ErrorCode
import typings.yaml.distParseCstMod.BlockScalar
import typings.yaml.distParseCstMod.FlowScalar
import typings.yaml.distParseCstMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distParseCstScalarMod {
  
  @JSImport("yaml/dist/parse/cst-scalar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createScalarToken(value: String, context: End): BlockScalar | FlowScalar = (^.asInstanceOf[js.Dynamic].applyDynamic("createScalarToken")(value.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[BlockScalar | FlowScalar]
  
  inline def resolveAsScalar(): Comment | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")().asInstanceOf[Comment | Null]
  inline def resolveAsScalar(token: Null, strict: Boolean): Comment | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Comment | Null]
  inline def resolveAsScalar(
    token: Null,
    strict: Boolean,
    onError: js.Function3[/* offset */ Double, /* code */ ErrorCode, /* message */ String, Unit]
  ): Comment | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Comment | Null]
  inline def resolveAsScalar(
    token: Null,
    strict: Unit,
    onError: js.Function3[/* offset */ Double, /* code */ ErrorCode, /* message */ String, Unit]
  ): Comment | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Comment | Null]
  inline def resolveAsScalar(token: Unit, strict: Boolean): Comment | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Comment | Null]
  inline def resolveAsScalar(
    token: Unit,
    strict: Boolean,
    onError: js.Function3[/* offset */ Double, /* code */ ErrorCode, /* message */ String, Unit]
  ): Comment | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Comment | Null]
  inline def resolveAsScalar(
    token: Unit,
    strict: Unit,
    onError: js.Function3[/* offset */ Double, /* code */ ErrorCode, /* message */ String, Unit]
  ): Comment | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Comment | Null]
  inline def resolveAsScalar(token: BlockScalar): Comment = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any]).asInstanceOf[Comment]
  inline def resolveAsScalar(token: BlockScalar, strict: Boolean): Comment = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Comment]
  inline def resolveAsScalar(
    token: BlockScalar,
    strict: Boolean,
    onError: js.Function3[/* offset */ Double, /* code */ ErrorCode, /* message */ String, Unit]
  ): Comment = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Comment]
  inline def resolveAsScalar(
    token: BlockScalar,
    strict: Unit,
    onError: js.Function3[/* offset */ Double, /* code */ ErrorCode, /* message */ String, Unit]
  ): Comment = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Comment]
  inline def resolveAsScalar(token: FlowScalar): Comment = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any]).asInstanceOf[Comment]
  inline def resolveAsScalar(token: FlowScalar, strict: Boolean): Comment = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Comment]
  inline def resolveAsScalar(
    token: FlowScalar,
    strict: Boolean,
    onError: js.Function3[/* offset */ Double, /* code */ ErrorCode, /* message */ String, Unit]
  ): Comment = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Comment]
  inline def resolveAsScalar(
    token: FlowScalar,
    strict: Unit,
    onError: js.Function3[/* offset */ Double, /* code */ ErrorCode, /* message */ String, Unit]
  ): Comment = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Comment]
  inline def resolveAsScalar(token: Token): Comment | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any]).asInstanceOf[Comment | Null]
  inline def resolveAsScalar(token: Token, strict: Boolean): Comment | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Comment | Null]
  inline def resolveAsScalar(
    token: Token,
    strict: Boolean,
    onError: js.Function3[/* offset */ Double, /* code */ ErrorCode, /* message */ String, Unit]
  ): Comment | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Comment | Null]
  inline def resolveAsScalar(
    token: Token,
    strict: Unit,
    onError: js.Function3[/* offset */ Double, /* code */ ErrorCode, /* message */ String, Unit]
  ): Comment | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Comment | Null]
  
  inline def setScalarValue(token: Token, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setScalarValue")(token.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setScalarValue(token: Token, value: String, context: AfterKey): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setScalarValue")(token.asInstanceOf[js.Any], value.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
