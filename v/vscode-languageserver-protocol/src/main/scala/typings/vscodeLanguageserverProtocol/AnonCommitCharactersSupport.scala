package typings.vscodeLanguageserverProtocol

import typings.vscodeLanguageserverTypes.mod.MarkupKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommitCharactersSupport extends js.Object {
  /**
    * Client supports commit characters on a completion item.
    */
  var commitCharactersSupport: js.UndefOr[Boolean] = js.undefined
  /**
    * Client supports the deprecated property on a completion item.
    */
  var deprecatedSupport: js.UndefOr[Boolean] = js.undefined
  /**
    * Client supports the follow content formats for the documentation
    * property. The order describes the preferred format of the client.
    */
  var documentationFormat: js.UndefOr[js.Array[MarkupKind]] = js.undefined
  /**
    * Client supports the preselect property on a completion item.
    */
  var preselectSupport: js.UndefOr[Boolean] = js.undefined
  /**
    * Client supports snippets as insert text.
    *
    * A snippet can define tab stops and placeholders with `$1`, `$2`
    * and `${3:foo}`. `$0` defines the final tab stop, it defaults to
    * the end of the snippet. Placeholders with equal identifiers are linked,
    * that is typing in one will update others too.
    */
  var snippetSupport: js.UndefOr[Boolean] = js.undefined
}

object AnonCommitCharactersSupport {
  @scala.inline
  def apply(
    commitCharactersSupport: js.UndefOr[Boolean] = js.undefined,
    deprecatedSupport: js.UndefOr[Boolean] = js.undefined,
    documentationFormat: js.Array[MarkupKind] = null,
    preselectSupport: js.UndefOr[Boolean] = js.undefined,
    snippetSupport: js.UndefOr[Boolean] = js.undefined
  ): AnonCommitCharactersSupport = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(commitCharactersSupport)) __obj.updateDynamic("commitCharactersSupport")(commitCharactersSupport.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecatedSupport)) __obj.updateDynamic("deprecatedSupport")(deprecatedSupport.asInstanceOf[js.Any])
    if (documentationFormat != null) __obj.updateDynamic("documentationFormat")(documentationFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(preselectSupport)) __obj.updateDynamic("preselectSupport")(preselectSupport.asInstanceOf[js.Any])
    if (!js.isUndefined(snippetSupport)) __obj.updateDynamic("snippetSupport")(snippetSupport.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCommitCharactersSupport]
  }
}

