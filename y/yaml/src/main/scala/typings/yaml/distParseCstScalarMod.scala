package typings.yaml

import typings.yaml.anon.AfterKey
import typings.yaml.anon.End
import typings.yaml.anon.Value
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
  
  inline def resolveAsScalar(): Value | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")().asInstanceOf[Value | Null]
  inline def resolveAsScalar(token: Null, strict: Boolean): Value | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Value | Null]
  inline def resolveAsScalar(
    token: Null,
    strict: Boolean,
    onError: js.Function3[/* offset */ Double, /* code */ ErrorCode, /* message */ String, Unit]
  ): Value | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Value | Null]
  inline def resolveAsScalar(
    token: Null,
    strict: Unit,
    onError: js.Function3[/* offset */ Double, /* code */ ErrorCode, /* message */ String, Unit]
  ): Value | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Value | Null]
  inline def resolveAsScalar(token: Unit, strict: Boolean): Value | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Value | Null]
  inline def resolveAsScalar(
    token: Unit,
    strict: Boolean,
    onError: js.Function3[/* offset */ Double, /* code */ ErrorCode, /* message */ String, Unit]
  ): Value | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Value | Null]
  inline def resolveAsScalar(
    token: Unit,
    strict: Unit,
    onError: js.Function3[/* offset */ Double, /* code */ ErrorCode, /* message */ String, Unit]
  ): Value | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Value | Null]
  inline def resolveAsScalar(token: BlockScalar): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any]).asInstanceOf[Value]
  inline def resolveAsScalar(token: BlockScalar, strict: Boolean): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def resolveAsScalar(
    token: BlockScalar,
    strict: Boolean,
    onError: js.Function3[/* offset */ Double, /* code */ ErrorCode, /* message */ String, Unit]
  ): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def resolveAsScalar(
    token: BlockScalar,
    strict: Unit,
    onError: js.Function3[/* offset */ Double, /* code */ ErrorCode, /* message */ String, Unit]
  ): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def resolveAsScalar(token: FlowScalar): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any]).asInstanceOf[Value]
  inline def resolveAsScalar(token: FlowScalar, strict: Boolean): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def resolveAsScalar(
    token: FlowScalar,
    strict: Boolean,
    onError: js.Function3[/* offset */ Double, /* code */ ErrorCode, /* message */ String, Unit]
  ): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def resolveAsScalar(
    token: FlowScalar,
    strict: Unit,
    onError: js.Function3[/* offset */ Double, /* code */ ErrorCode, /* message */ String, Unit]
  ): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Value]
  inline def resolveAsScalar(token: Token): Value | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any]).asInstanceOf[Value | Null]
  inline def resolveAsScalar(token: Token, strict: Boolean): Value | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Value | Null]
  inline def resolveAsScalar(
    token: Token,
    strict: Boolean,
    onError: js.Function3[/* offset */ Double, /* code */ ErrorCode, /* message */ String, Unit]
  ): Value | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Value | Null]
  inline def resolveAsScalar(
    token: Token,
    strict: Unit,
    onError: js.Function3[/* offset */ Double, /* code */ ErrorCode, /* message */ String, Unit]
  ): Value | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Value | Null]
  
  inline def setScalarValue(token: Token, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setScalarValue")(token.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setScalarValue(token: Token, value: String, context: AfterKey): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setScalarValue")(token.asInstanceOf[js.Any], value.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
