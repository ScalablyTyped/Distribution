package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DocumentHighlight extends js.Object {
  /**
       * The highlight kind, default is [text](#DocumentHighlightKind.Text).
       */
  var kind: js.UndefOr[DocumentHighlightKind] = js.undefined
  /**
       * The range this highlight applies to.
       */
  var range: Range
}

