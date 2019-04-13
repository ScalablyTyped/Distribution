package typings
package vitalsignsLib.vitalsignsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * VitalSigns instance.
  */
@js.native
trait VitalSigns extends js.Object {
  /**
    * Gets a request handler.
    * @type {RequestHandler}
    */
  @JSName("express")
  var express_Original: expressLib.expressMod.RequestHandler = js.native
  /**
    * Pushes a health constraint onto this instance's constraint array.
    * Health constraints define scenarios in which VitalSigns will consider the application to be in an unhealthy state.
    * @param {} constraint A constraint.
    */
  def addConstraint(): scala.Unit = js.native
  /**
    * Destroys this VitalSigns instance.
    */
  def destroy(): scala.Unit = js.native
  /**
    * Gets a request handler.
    * @type {RequestHandler}
    */
  def express(
    req: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Request,
    res: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Response,
    next: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.NextFunction
  ): js.Any = js.native
  /**
    * Retrieves an array of human-readable messages that define the specific health constraints that failed when running the last health check.
    * @returns {Array<string>} An array of failure messages.
    */
  def getFailed(): js.Array[java.lang.String] = js.native
  /**
    * Gets a report of all monitors, their fields, and the values of those fields, compiled into Javascript object form.  Additionally, a 'healthy' field is
    * attached. This field will be boolean true if all health constraints passed; false otherwise.
    * @param {ReportOptions} [options] A mapping of options to customize this report.
    * @return {Object} The full health report.
    */
  def getReport(): js.Object = js.native
  def getReport(options: vitalsignsLib.vitalsignsMod.vitalsignsNs.ReportOptions): js.Object = js.native
  /**
    * Generates a health report and checks each health constraint against it. Any constraints that fail will be added to the 'failed' array in the form of
    * a human-readable failure message, which can be retrieved with {@link #getFailed}.
    * @param {Object} [report] A report object on which to run the health constraints. If omitted, this function will generate a health report automatically.
    * @return {boolean} true if all health constraints passed; false otherwise.
    */
  def isHealthy(): scala.Boolean = js.native
  def isHealthy(report: js.Object): scala.Boolean = js.native
  /**
    * Registers monitor.
    * @param {string} monitorName A monitor name.
    * @param {MonitorField} [field] Options.
    */
  def monitor(monitor: java.lang.String): scala.Unit = js.native
  def monitor(monitor: java.lang.String, field: vitalsignsLib.vitalsignsMod.vitalsignsNs.MonitorField): scala.Unit = js.native
  def monitor(monitor: js.Object): scala.Unit = js.native
  def monitor(monitor: js.Object, field: vitalsignsLib.vitalsignsMod.vitalsignsNs.MonitorField): scala.Unit = js.native
  def monitor(monitor: vitalsignsLib.vitalsignsMod.vitalsignsNs.Monitor): scala.Unit = js.native
  def monitor(
    monitor: vitalsignsLib.vitalsignsMod.vitalsignsNs.Monitor,
    field: vitalsignsLib.vitalsignsMod.vitalsignsNs.MonitorField
  ): scala.Unit = js.native
  /**
    * Defines a new health constraint in a chainable, more easily readable format.
    * When called with the monitor name and field name of concern, a wrapper is
    * returned that allows the constraint to be built out with function calls.
    * @param {string} monitorName A monitor name.
    * @param {string} fieldName A field name.
    * @return {ConstraintWrapper} The constraint wrapper.
    */
  def unhealthyWhen(monitorName: java.lang.String, fieldName: java.lang.String): vitalsignsLib.vitalsignsMod.vitalsignsNs.ConstraintWrapper = js.native
}

