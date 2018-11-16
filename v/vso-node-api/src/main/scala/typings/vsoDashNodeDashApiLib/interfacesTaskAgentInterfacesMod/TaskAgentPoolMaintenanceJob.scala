package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TaskAgentPoolMaintenanceJob extends js.Object {
  /**
       * The maintenance definition for the maintenance job
       */
  var definitionId: scala.Double
  /**
       * The total error counts during the maintenance job
       */
  var errorCount: scala.Double
  /**
       * Time that the maintenance job was completed
       */
  var finishTime: stdLib.Date
  /**
       * Id of the maintenance job
       */
  var jobId: scala.Double
  /**
       * The log download url for the maintenance job
       */
  var logsDownloadUrl: java.lang.String
  /**
       * Orchestration/Plan Id for the maintenance job
       */
  var orchestrationId: java.lang.String
  /**
       * Pool reference for the maintenance job
       */
  var pool: TaskAgentPoolReference
  /**
       * Time that the maintenance job was queued
       */
  var queueTime: stdLib.Date
  /**
       * The identity that queued the maintenance job
       */
  var requestedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
       * The maintenance job result
       */
  var result: TaskAgentPoolMaintenanceJobResult
  /**
       * Time that the maintenance job was started
       */
  var startTime: stdLib.Date
  /**
       * Status of the maintenance job
       */
  var status: TaskAgentPoolMaintenanceJobStatus
  var targetAgents: js.Array[TaskAgentReference]
  /**
       * The total warning counts during the maintenance job
       */
  var warningCount: scala.Double
}

