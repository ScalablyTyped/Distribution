package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TfvcHistoryEntry extends HistoryEntry[TfvcItem] {
  /**
       * The encoding of the item at this point in history (only relevant for File history, not folders)
       */
  var encoding: scala.Double
  /**
       * The file id of the item at this point in history (only relevant for File history, not folders)
       */
  var fileId: scala.Double
}

