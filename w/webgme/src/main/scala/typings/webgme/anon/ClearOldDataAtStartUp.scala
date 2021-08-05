package typings.webgme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearOldDataAtStartUp extends StObject {
  
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
  
  inline def apply(
    clearOldDataAtStartUp: Boolean,
    clearOutputTimeout: Double,
    enable: Boolean,
    labelJobs: String,
    workerRefreshInterval: Double
  ): ClearOldDataAtStartUp = {
    val __obj = js.Dynamic.literal(clearOldDataAtStartUp = clearOldDataAtStartUp.asInstanceOf[js.Any], clearOutputTimeout = clearOutputTimeout.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], labelJobs = labelJobs.asInstanceOf[js.Any], workerRefreshInterval = workerRefreshInterval.asInstanceOf[js.Any], nonce = null)
    __obj.asInstanceOf[ClearOldDataAtStartUp]
  }
  
  extension [Self <: ClearOldDataAtStartUp](x: Self) {
    
    inline def setClearOldDataAtStartUp(value: Boolean): Self = StObject.set(x, "clearOldDataAtStartUp", value.asInstanceOf[js.Any])
    
    inline def setClearOutputTimeout(value: Double): Self = StObject.set(x, "clearOutputTimeout", value.asInstanceOf[js.Any])
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setLabelJobs(value: String): Self = StObject.set(x, "labelJobs", value.asInstanceOf[js.Any])
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceNull: Self = StObject.set(x, "nonce", null)
    
    inline def setWorkerRefreshInterval(value: Double): Self = StObject.set(x, "workerRefreshInterval", value.asInstanceOf[js.Any])
  }
}
