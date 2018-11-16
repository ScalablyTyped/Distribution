package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ApplyWorkspaceEditParams extends js.Object {
  /**
       * The edits to apply.
       */
  var edit: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.WorkspaceEdit
  /**
       * An optional label of the workspace edit. This label is
       * presented in the user interface for example on an undo
       * stack to undo the workspace edit.
       */
  var label: js.UndefOr[java.lang.String] = js.undefined
}

