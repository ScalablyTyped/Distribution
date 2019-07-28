package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Several node kinds share function-like features such as a signature,
  * a name, and a body. These nodes should extend FunctionLikeDeclarationBase.
  * Examples:
  * - FunctionDeclaration
  * - MethodDeclaration
  * - AccessorDeclaration
  */
@js.native
trait FunctionLikeDeclarationBase extends SignatureDeclarationBase {
  var _functionLikeDeclarationBrand: js.Any = js.native
  var asteriskToken: js.UndefOr[AsteriskToken] = js.native
  var body: js.UndefOr[Block | Expression] = js.native
  var exclamationToken: js.UndefOr[ExclamationToken] = js.native
  var questionToken: js.UndefOr[QuestionToken] = js.native
}

