package typings.tizenTvWebapis.avinfoMod

import typings.tizenTvWebapis.anon.DOLBYDIGITALCOMPMODELINE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AVInfoManager extends js.Object {
  
  var AvInfoDigitalCompMode: DOLBYDIGITALCOMPMODELINE = js.native
  
  /**
    * This method get dolby digital component mode.
    * @returns AvInfoDigitalCompMode dolby digital component mode
    * @throw WebAPIException NotSupportedError
    * @since 2.3
    * @note `deprecated` 4.0
    */
  def getDolbyDigitalCompMode(): AvInfoDigitalCompMode = js.native
  
  /**
    * This method get the plugin's version number.
    * @returns string value of plugin's version
    * @throw WebAPIException SecurityError
    * @since 2.3
    */
  def getVersion(): String = js.native
  
  /**
    * This method is to check whether the HDR is supported or not.
    * @returns boolean. true is support, false is not support.
    * @throw WebAPIException SecurityError
    * @since 2.3
    */
  def isHdrTvSupport(): Boolean = js.native
}
object AVInfoManager {
  
  @scala.inline
  def apply(
    AvInfoDigitalCompMode: DOLBYDIGITALCOMPMODELINE,
    getDolbyDigitalCompMode: () => AvInfoDigitalCompMode,
    getVersion: () => String,
    isHdrTvSupport: () => Boolean
  ): AVInfoManager = {
    val __obj = js.Dynamic.literal(AvInfoDigitalCompMode = AvInfoDigitalCompMode.asInstanceOf[js.Any], getDolbyDigitalCompMode = js.Any.fromFunction0(getDolbyDigitalCompMode), getVersion = js.Any.fromFunction0(getVersion), isHdrTvSupport = js.Any.fromFunction0(isHdrTvSupport))
    __obj.asInstanceOf[AVInfoManager]
  }
  
  @scala.inline
  implicit class AVInfoManagerOps[Self <: AVInfoManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAvInfoDigitalCompMode(value: DOLBYDIGITALCOMPMODELINE): Self = this.set("AvInfoDigitalCompMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDolbyDigitalCompMode(value: () => AvInfoDigitalCompMode): Self = this.set("getDolbyDigitalCompMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVersion(value: () => String): Self = this.set("getVersion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsHdrTvSupport(value: () => Boolean): Self = this.set("isHdrTvSupport", js.Any.fromFunction0(value))
  }
}
