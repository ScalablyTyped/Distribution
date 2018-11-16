package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolDotWorkspaceFoldersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WorkspaceFoldersChangeEvent extends js.Object {
  /**
       * The array of added workspace folders
       */
  var added: js.Array[WorkspaceFolder]
  /**
       * The array of the removed workspace folders
       */
  var removed: js.Array[WorkspaceFolder]
}

