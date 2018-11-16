package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-types", "DocumentLink")
@js.native
class DocumentLink () extends js.Object {
  /**
       * A data entry field that is preserved on a document link between a
       * DocumentLinkRequest and a DocumentLinkResolveRequest.
       */
  var data: js.UndefOr[js.Any] = js.native
  /**
       * The range this link applies to.
       */
  var range: Range = js.native
  /**
       * The uri this link points to.
       */
  var target: js.UndefOr[java.lang.String] = js.native
}

