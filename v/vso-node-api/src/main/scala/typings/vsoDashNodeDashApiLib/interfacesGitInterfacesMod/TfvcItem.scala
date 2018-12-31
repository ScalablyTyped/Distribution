package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcItem extends ItemModel {
  var changeDate: stdLib.Date
  var deletionId: scala.Double
  /**
    * MD5 hash as a base 64 string, applies to files only.
    */
  var hashValue: java.lang.String
  var isBranch: scala.Boolean
  var isPendingChange: scala.Boolean
  /**
    * The size of the file, if applicable.
    */
  var size: scala.Double
  var version: scala.Double
}

