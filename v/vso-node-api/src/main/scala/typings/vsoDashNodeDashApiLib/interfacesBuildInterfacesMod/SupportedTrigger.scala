package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SupportedTrigger extends js.Object {
  /**
       * The default interval to wait between polls (only relevant when NotificationType is Polling).
       */
  var defaultPollingInterval: scala.Double
  /**
       * How the trigger is notified of changes.
       */
  var notificationType: java.lang.String
  /**
       * The capabilities supported by this trigger.
       */
  var supportedCapabilities: org.scalablytyped.runtime.StringDictionary[SupportLevel]
  /**
       * The type of trigger.
       */
  var `type`: DefinitionTriggerType
}

