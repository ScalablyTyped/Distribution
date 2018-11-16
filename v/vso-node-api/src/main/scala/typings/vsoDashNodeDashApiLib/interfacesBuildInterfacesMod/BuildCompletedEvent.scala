package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BuildCompletedEvent extends BuildUpdatedEvent {
  /**
       * errors associated with a build used for build notifications
       */
  var buildErrors: js.Array[BuildRequestValidationResult]
  /**
       * warnings associated with a build used for build notifications
       */
  var buildWarnings: js.Array[BuildRequestValidationResult]
  /**
       * Changes associated with a build used for build notifications
       */
  var changes: js.Array[Change]
}

