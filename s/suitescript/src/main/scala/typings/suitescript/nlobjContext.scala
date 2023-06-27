package typings.suitescript

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Return a new instance of nlobjContext used for user and script context information.
  *
  * @classDescription Utility class providing information about the current user and the script runtime.
  * @return {nlobjContext}
  */
@js.native
trait nlobjContext
  extends StObject
     with /**
  *
  * @return
  */
Instantiable0[Any] {
  
  /**
    * return an array containing the names of all keys used to set session objects
    * @return {string[]}
    *
    * @method
    *
    * @since 2009.2
    */
  def getAllSessionObjects(): Unit = js.native
  
  /**
    * return an Object containing name/value pairs of color groups to their corresponding RGB hex color based on the currenly logged in user's color them preferences.
    * @return {Object}
    *
    * @method
    *
    * @since 2010.1
    * @return
    */
  def getColorPreferences(): Any = js.native
  
  /**
    * return the account ID of the current user.
    * @return {string}
    *
    * @method
    *
    * @since 2007.0
    * @return
    */
  def getCompany(): String = js.native
  
  /**
    * return the internal ID of the contact logged in on behalf of a customer, vendor, or partner. It returns -1 for non-contact logins
    * @return {int}
    *
    * @method
    *
    * @since 2009.1
    * @return
    */
  def getContact(): Any = js.native
  
  /**
    * return the internalId of the current user's department.
    * @return {int}
    *
    * @method
    *
    * @since 2007.0
    * @return
    */
  def getDepartment(): Any = js.native
  
  /**
    * return the deployment ID for the current script
    * @return {string}
    *
    * @method
    *
    * @since 2009.2
    * @return
    */
  def getDeploymentId(): String = js.native
  
  /**
    * return the email address of the current user.
    * @return {string}
    *
    * @method
    *
    * @since 2007.0
    * @return
    */
  def getEmail(): String = js.native
  
  /**
    * return the environment that the script is executing in: SANDBOX, PRODUCTION, BETA, INTERNAL
    * @since 2008.2
    */
  def getEnvironment(): String = js.native
  
  /**
    * return the execution context for this script: webServices|csvImport|client|userInterface|scheduledScript|portlet|suitelet|debugger|custommassupdate
    * @return {string}
    *
    * @method
    *
    * @since 2007.0
    * @return
    */
  def getExecutionContext(): String = js.native
  
  /**
    * return true if feature is enabled, false otherwise
    * @param {string} name
    * @return {boolean}
    *
    * @method
    *
    * @since 2009.2
    * @param name
    * @return
    */
  def getFeature(name: String): Boolean = js.native
  
  /**
    * return the internalId of the current user's location.
    * @return {int}
    *
    * @method
    *
    * @since 2007.0
    * @return
    */
  def getLocation(): Any = js.native
  
  /**
    * return the logging level for the current script execution. Not supported in CLIENT scripts
    * @since 2008.2
    */
  def getLogLevel(): Unit = js.native
  
  /**
    * return the name of the current user.
    * @return {string}
    *
    * @method
    *
    * @since 2007.0
    * @return
    */
  def getName(): String = js.native
  
  /**
    * return the % complete specified for the current scheduled script execution
    * @return {int}
    *
    * @method
    *
    * @since 2009.2
    * @return
    */
  def getPercentComplete(): Any = js.native
  
  /**
    * return current user's permission level (0-4) for this permission
    * @param {string} name
    * @return {int}
    *
    * @method
    *
    * @since 2009.2
    * @param name
    * @return
    */
  def getPermission(name: String): Any = js.native
  
  /**
    * return system or script preference selection for current user
    * @param {string} name
    * @return {string}
    *
    * @method
    *
    * @since 2009.2
    * @param name
    * @return
    */
  def getPreference(name: String): String = js.native
  
  /**
    * return the amount of usage units remaining for this script.
    * @return {int}
    *
    * @method
    *
    * @since 2007.0
    * @return
    */
  def getRemainingUsage(): Any = js.native
  
  /**
    * return the internalId of the current user's role.
    * @return {string}
    *
    * @method
    *
    * @since 2007.0
    * @return
    */
  def getRole(): String = js.native
  
  /**
    * return the internalId of the current user's center type.
    * @return {string}
    *
    * @method
    *
    * @since 2008.2
    * @return
    */
  def getRoleCenter(): String = js.native
  
  /**
    * return the script ID of the current user's role.
    * @return {string}
    *
    * @method
    *
    * @since 2008.2
    * @return
    */
  def getRoleId(): String = js.native
  
  /**
    * return the runtime version of SuiteScript, could be 1.0 or 2.0
    * @return {Object}
    *
    * @method
    *
    * @since 2014.1
    * @return
    */
  def getRuntimeVersion(): Any = js.native
  
  /**
    * return the script ID for the current script
    * @return {string}
    *
    * @method
    *
    * @since 2009.2
    * @return
    */
  def getScriptId(): String = js.native
  
  /**
    * return value of session object set by script
    * @param {string} name
    * @return {string}
    *
    * @method
    *
    * @since 2009.2
    * @param name
    * @return
    */
  def getSessionObject(name: String): String = js.native
  
  /**
    * return a system/script setting. Types are SCRIPT, SESSION, FEATURE, PERMISSION
    *
    * @param {string} type
    * @param {string} name
    * @since 2007.0
    * @deprecated
    * @param type
    * @param name
    */
  def getSetting(`type`: String, name: String): Unit = js.native
  
  /**
    * return the internalId of the current user's subsidiary.
    * @return {int}
    *
    * @method
    *
    * @since 2007.0
    * @return
    */
  def getSubsidiary(): Any = js.native
  
  /**
    * return the internalId of the current user.
    * @return {string}
    *
    * @method
    *
    * @since 2007.0
    * @return
    */
  def getUser(): String = js.native
  
  /**
    * return the NetSuite version for the current account
    * @return {string}
    *
    * @method
    *
    * @since 2009.2
    * @return
    */
  def getVersion(): String = js.native
  
  /**
    * set the % complete for the current scheduled script execution
    * @param {float} ct the percentage of records completed
    * @return {void}
    *
    * @method
    *
    * @since 2009.2
    * @param pct
    * @return
    */
  def setPercentComplete(pct: Any): Any = js.native
  
  /**
    * set the value of a session object using a key.
    * @param {string} name
    * @param {string} value
    * @return {void}
    *
    * @method
    *
    * @since 2009.2
    * @param name
    * @param value
    * @return
    */
  def setSessionObject(name: String, value: String): Any = js.native
  
  /**
    * set a system/script setting. Only supported type is SESSION
    *
    * @param {string} type
    * @param {string} name
    * @param {string} value
    * @since 2007.0
    * @deprecated
    * @param type
    * @param name
    * @param value
    */
  def setSetting(`type`: String, name: String, value: String): Unit = js.native
}
