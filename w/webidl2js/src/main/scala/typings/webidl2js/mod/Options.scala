package typings.webidl2js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The optional suffix present on implementation files.
    *
    * @default ""
    */
  var implSuffix: js.UndefOr[String] = js.undefined
  /**
    * The function used to modify attributes and operations
    * with the `[CEReactions]` extended attribute.
    *
    * The default value is the identity function.
    */
  var processCEReactions: js.UndefOr[CodeProcessor] = js.undefined
  /**
    * The function used to modify attributes and operations
    * with the `[HTMLConstructor]` extended attribute.
    *
    * The default value is the identity function.
    */
  var processHTMLConstructor: js.UndefOr[CodeProcessor] = js.undefined
  /**
    * The function used to generate attributes and operations
    * with the `[Reflect]` extended attribute.
    *
    * @default null
    */
  var processReflect: js.UndefOr[AttributeProcessor | Null] = js.undefined
  /**
    * Whether non-fatal errors should be ignored.
    *
    * @default false
    */
  var suppressErrors: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    implSuffix: String = null,
    processCEReactions: CodeProcessor = null,
    processHTMLConstructor: CodeProcessor = null,
    processReflect: js.UndefOr[Null | AttributeProcessor] = js.undefined,
    suppressErrors: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (implSuffix != null) __obj.updateDynamic("implSuffix")(implSuffix.asInstanceOf[js.Any])
    if (processCEReactions != null) __obj.updateDynamic("processCEReactions")(processCEReactions.asInstanceOf[js.Any])
    if (processHTMLConstructor != null) __obj.updateDynamic("processHTMLConstructor")(processHTMLConstructor.asInstanceOf[js.Any])
    if (!js.isUndefined(processReflect)) __obj.updateDynamic("processReflect")(processReflect.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressErrors)) __obj.updateDynamic("suppressErrors")(suppressErrors.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

