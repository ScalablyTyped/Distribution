package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LocationLink extends js.Object {
  /**
       * Span of the origin of this link.
       *
       * Used as the underlined span for mouse definition hover. Defaults to the word range at
       * the definition position.
       */
  var originSelectionRange: js.UndefOr[Range] = js.undefined
  /**
       * The full target range of this link. If the target for example is a symbol then target range is the
       * range enclosing this symbol not including leading/trailing whitespace but everything else
       * like comments. This information is typically used to highlight the range in the editor.
       */
  var targetRange: Range
  /**
       * The range that should be selected and revealed when this link is being followed, e.g the name of a function.
       * Must be contained by the the `targetRange`. See also `DocumentSymbol#range`
       */
  var targetSelectionRange: Range
  /**
       * The target resource identifier of this link.
       */
  var targetUri: java.lang.String
}

