package typings.tizenTvWebapis

import typings.tizenTvWebapis.anon.DOLBYDIGITALCOMPMODELINE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object avinfoMod {
  
  @js.native
  sealed trait AvInfoDigitalCompMode extends StObject
  @JSImport("tizen-tv-webapis/avinfo", "AvInfoDigitalCompMode")
  @js.native
  object AvInfoDigitalCompMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[AvInfoDigitalCompMode with Double] = js.native
    
    /**
      * line mode
      * @since 2.3
      */
    @js.native
    sealed trait DOLBY_DIGITAL_COMP_MODE_LINE extends AvInfoDigitalCompMode
    /* 0 */ val DOLBY_DIGITAL_COMP_MODE_LINE: typings.tizenTvWebapis.avinfoMod.AvInfoDigitalCompMode.DOLBY_DIGITAL_COMP_MODE_LINE with Double = js.native
    
    /**
      * rf mode
      * @since 2.3
      */
    @js.native
    sealed trait DOLBY_DIGITAL_COMP_MODE_RF extends AvInfoDigitalCompMode
    /* 1 */ val DOLBY_DIGITAL_COMP_MODE_RF: typings.tizenTvWebapis.avinfoMod.AvInfoDigitalCompMode.DOLBY_DIGITAL_COMP_MODE_RF with Double = js.native
  }
  
  @js.native
  trait AVInfoManager extends StObject {
    
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
    implicit class AVInfoManagerMutableBuilder[Self <: AVInfoManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvInfoDigitalCompMode(value: DOLBYDIGITALCOMPMODELINE): Self = StObject.set(x, "AvInfoDigitalCompMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetDolbyDigitalCompMode(value: () => AvInfoDigitalCompMode): Self = StObject.set(x, "getDolbyDigitalCompMode", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetVersion(value: () => String): Self = StObject.set(x, "getVersion", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsHdrTvSupport(value: () => Boolean): Self = StObject.set(x, "isHdrTvSupport", js.Any.fromFunction0(value))
    }
  }
}
