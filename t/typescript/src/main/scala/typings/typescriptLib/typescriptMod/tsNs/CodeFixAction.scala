package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CodeFixAction extends CodeAction {
  var fixAllDescription: js.UndefOr[java.lang.String] = js.undefined
  /**
           * If present, one may call 'getCombinedCodeFix' with this fixId.
           * This may be omitted to indicate that the code fix can't be applied in a group.
           */
  var fixId: js.UndefOr[js.Object] = js.undefined
  /** Short name to identify the fix, for use by telemetry. */
  var fixName: java.lang.String
}

