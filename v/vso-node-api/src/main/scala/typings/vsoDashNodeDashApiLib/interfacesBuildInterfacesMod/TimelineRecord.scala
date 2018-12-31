package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineRecord extends js.Object {
  var _links: js.Any
  /**
    * The change ID.
    */
  var changeId: scala.Double
  /**
    * A string that indicates the current operation.
    */
  var currentOperation: java.lang.String
  /**
    * A reference to a sub-timeline.
    */
  var details: TimelineReference
  /**
    * The number of errors produced by this operation.
    */
  var errorCount: scala.Double
  /**
    * The finish time.
    */
  var finishTime: stdLib.Date
  /**
    * The ID of the record.
    */
  var id: java.lang.String
  var issues: js.Array[Issue]
  /**
    * The time the record was last modified.
    */
  var lastModified: stdLib.Date
  /**
    * A reference to the log produced by this operation.
    */
  var log: BuildLogReference
  /**
    * The name.
    */
  var name: java.lang.String
  /**
    * An ordinal value relative to other records.
    */
  var order: scala.Double
  /**
    * The ID of the record's parent.
    */
  var parentId: java.lang.String
  /**
    * The current completion percentage.
    */
  var percentComplete: scala.Double
  /**
    * The result.
    */
  var result: TaskResult
  /**
    * The result code.
    */
  var resultCode: java.lang.String
  /**
    * The start time.
    */
  var startTime: stdLib.Date
  /**
    * The state of the record.
    */
  var state: TimelineRecordState
  /**
    * A reference to the task represented by this timeline record.
    */
  var task: TaskReference
  /**
    * The type of the record.
    */
  var `type`: java.lang.String
  /**
    * The REST URL of the timeline record.
    */
  var url: java.lang.String
  /**
    * The number of warnings produced by this operation.
    */
  var warningCount: scala.Double
  /**
    * The name of the agent running the operation.
    */
  var workerName: java.lang.String
}

