package typings
package xrmLib.XrmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Interface for a user attribute privilege.
     */

trait Privilege extends js.Object {
  /**
           * True if the user can create.
           */
  var canCreate: scala.Boolean
  /**
           * True if the user can read.
           */
  var canRead: scala.Boolean
  /**
           * True if the user can update.
           */
  var canUpdate: scala.Boolean
}

