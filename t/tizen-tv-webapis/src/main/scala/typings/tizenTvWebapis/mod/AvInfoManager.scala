package typings.tizenTvWebapis.mod

import typings.tizenTvWebapis.anon.DOLBYDIGITALCOMPMODELINE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvInfoManager extends StObject {
  
  /**
    * This interface defines the digital mode
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var AvInfoDigitalCompMode: DOLBYDIGITALCOMPMODELINE
  
  /**
    * This method get dolby digital component mode.
    *
    * @returns dolby digital component mode
    *
    * @throw WebAPIException with error type NotSupportedError, this feature doesn't be supported since 2016
    *
    * @since 2.3
    *
    * @version 1.0
    *
    * @note `deprecated` 4.0
    *
    */
  def getDolbyDigitalCompMode(): AvInfoDigitalCompMode
  
  /**
    * This method get the plugin's version number.
    *
    * @returns return value of plugin's version
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method
    *
    * @since 2.3
    *
    * @version 1.0
    *
    */
  def getVersion(): String
  
  /**
    * This method is to check whether the HDR is supported or not.
    *
    * @returns return value of boolean
    * - true is support
    * - false is not support
    *
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method
    *
    * @since 2.3
    *
    * @version 1.0
    *
    */
  def isHdrTvSupport(): Boolean
}
object AvInfoManager {
  
  inline def apply(
    AvInfoDigitalCompMode: DOLBYDIGITALCOMPMODELINE,
    getDolbyDigitalCompMode: () => AvInfoDigitalCompMode,
    getVersion: () => String,
    isHdrTvSupport: () => Boolean
  ): AvInfoManager = {
    val __obj = js.Dynamic.literal(AvInfoDigitalCompMode = AvInfoDigitalCompMode.asInstanceOf[js.Any], getDolbyDigitalCompMode = js.Any.fromFunction0(getDolbyDigitalCompMode), getVersion = js.Any.fromFunction0(getVersion), isHdrTvSupport = js.Any.fromFunction0(isHdrTvSupport))
    __obj.asInstanceOf[AvInfoManager]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AvInfoManager] (val x: Self) extends AnyVal {
    
    inline def setAvInfoDigitalCompMode(value: DOLBYDIGITALCOMPMODELINE): Self = StObject.set(x, "AvInfoDigitalCompMode", value.asInstanceOf[js.Any])
    
    inline def setGetDolbyDigitalCompMode(value: () => AvInfoDigitalCompMode): Self = StObject.set(x, "getDolbyDigitalCompMode", js.Any.fromFunction0(value))
    
    inline def setGetVersion(value: () => String): Self = StObject.set(x, "getVersion", js.Any.fromFunction0(value))
    
    inline def setIsHdrTvSupport(value: () => Boolean): Self = StObject.set(x, "isHdrTvSupport", js.Any.fromFunction0(value))
  }
}
