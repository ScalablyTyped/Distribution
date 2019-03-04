package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClearOldDataAtStartUp extends js.Object {
  /**
    * If true, all data stored for jobs 
    * (jobInfos, outputs, workerInfos, etc.) 
    * is cleared when the server starts.
    *   config.executor.clearOldDataAtStartUp = false;
    */
  var clearOldDataAtStartUp: scala.Boolean
  /**
    * Time in milliseconds that output is stored after a job has finished.
    *   config.executor.clearOutputTimeout = 60000;
    */
  var clearOutputTimeout: scala.Double
  /**
    *  If true will enable the executor.
    *   config.executor.enable = false;
    */
  var enable: scala.Boolean
  /**
    * Path to configuration file for label jobs for the workers.
    *   config.executor.labelJobs = './labelJobs.json';
    */
  var labelJobs: java.lang.String
  /**
    * If defined this is the secret shared between the server and attached workers.
    *   config.executor.nonce = null;
    */
  var nonce: scala.Null | java.lang.String
  /**
    * Time interval in milliseconds that attached 
    * workers will request jobs from the server.
    *   config.executor.workerRefreshInterval = 5000;
    */
  var workerRefreshInterval: scala.Double
}

object Anon_ClearOldDataAtStartUp {
  @scala.inline
  def apply(
    clearOldDataAtStartUp: scala.Boolean,
    clearOutputTimeout: scala.Double,
    enable: scala.Boolean,
    labelJobs: java.lang.String,
    workerRefreshInterval: scala.Double,
    nonce: java.lang.String = null
  ): Anon_ClearOldDataAtStartUp = {
    val __obj = js.Dynamic.literal(clearOldDataAtStartUp = clearOldDataAtStartUp, clearOutputTimeout = clearOutputTimeout, enable = enable, labelJobs = labelJobs, workerRefreshInterval = workerRefreshInterval)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    __obj.asInstanceOf[Anon_ClearOldDataAtStartUp]
  }
}

