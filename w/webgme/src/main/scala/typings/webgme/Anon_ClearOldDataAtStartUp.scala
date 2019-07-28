package typings.webgme

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
  var clearOldDataAtStartUp: Boolean
  /**
    * Time in milliseconds that output is stored after a job has finished.
    *   config.executor.clearOutputTimeout = 60000;
    */
  var clearOutputTimeout: Double
  /**
    *  If true will enable the executor.
    *   config.executor.enable = false;
    */
  var enable: Boolean
  /**
    * Path to configuration file for label jobs for the workers.
    *   config.executor.labelJobs = './labelJobs.json';
    */
  var labelJobs: String
  /**
    * If defined this is the secret shared between the server and attached workers.
    *   config.executor.nonce = null;
    */
  var nonce: Null | String
  /**
    * Time interval in milliseconds that attached 
    * workers will request jobs from the server.
    *   config.executor.workerRefreshInterval = 5000;
    */
  var workerRefreshInterval: Double
}

object Anon_ClearOldDataAtStartUp {
  @scala.inline
  def apply(
    clearOldDataAtStartUp: Boolean,
    clearOutputTimeout: Double,
    enable: Boolean,
    labelJobs: String,
    workerRefreshInterval: Double,
    nonce: String = null
  ): Anon_ClearOldDataAtStartUp = {
    val __obj = js.Dynamic.literal(clearOldDataAtStartUp = clearOldDataAtStartUp, clearOutputTimeout = clearOutputTimeout, enable = enable, labelJobs = labelJobs, workerRefreshInterval = workerRefreshInterval)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    __obj.asInstanceOf[Anon_ClearOldDataAtStartUp]
  }
}

