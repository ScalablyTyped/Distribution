package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameInfoSuccess extends js.Object {
  var canRename: typescriptLib.typescriptLibNumbers.`true`
  var displayName: java.lang.String
  /**
    * File or directory to rename.
    * If set, `getEditsForFileRename` should be called instead of `findRenameLocations`.
    */
  var fileToRename: js.UndefOr[java.lang.String] = js.undefined
  var fullDisplayName: java.lang.String
  var kind: ScriptElementKind
  var kindModifiers: java.lang.String
  var triggerSpan: TextSpan
}

