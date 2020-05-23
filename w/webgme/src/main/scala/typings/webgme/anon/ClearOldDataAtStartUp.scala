package typings.webgme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearOldDataAtStartUp extends js.Object {
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

object ClearOldDataAtStartUp {
  @scala.inline
  def apply(
    clearOldDataAtStartUp: Boolean,
    clearOutputTimeout: Double,
    enable: Boolean,
    labelJobs: String,
    workerRefreshInterval: Double,
    nonce: String = null
  ): ClearOldDataAtStartUp = {
    val __obj = js.Dynamic.literal(clearOldDataAtStartUp = clearOldDataAtStartUp.asInstanceOf[js.Any], clearOutputTimeout = clearOutputTimeout.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], labelJobs = labelJobs.asInstanceOf[js.Any], workerRefreshInterval = workerRefreshInterval.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearOldDataAtStartUp]
  }
}

