package typings.tizenCommonWeb

import typings.tizenCommonWeb.tizenCommonWebStrings.CHECKER_BD
import typings.tizenCommonWeb.tizenCommonWebStrings.FRAME_SEQUENCE
import typings.tizenCommonWeb.tizenCommonWebStrings.FROM_2D_TO_3D
import typings.tizenCommonWeb.tizenCommonWebStrings.LINE_BY_LINE
import typings.tizenCommonWeb.tizenCommonWebStrings.NOT_CONNECTED
import typings.tizenCommonWeb.tizenCommonWebStrings.NOT_SUPPORTED
import typings.tizenCommonWeb.tizenCommonWebStrings.OFF
import typings.tizenCommonWeb.tizenCommonWebStrings.READY
import typings.tizenCommonWeb.tizenCommonWebStrings.SIDE_BY_SIDE
import typings.tizenCommonWeb.tizenCommonWebStrings.TOP_BOTTOM
import typings.tizenCommonWeb.tizenCommonWebStrings.VERTICAL_STRIPE
import typings.tizenCommonWeb.tizenMod.ErrorCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tvdisplaycontrolMod {
  
  @js.native
  sealed trait Display3DEffectMode extends StObject
  @JSImport("tizen-common-web/tvdisplaycontrol", "Display3DEffectMode")
  @js.native
  object Display3DEffectMode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Display3DEffectMode with String] = js.native
    
    @js.native
    sealed trait CHECKER_BD extends Display3DEffectMode
    /* "CHECKER_BD" */ val CHECKER_BD: typings.tizenCommonWeb.tvdisplaycontrolMod.Display3DEffectMode.CHECKER_BD with String = js.native
    
    @js.native
    sealed trait FRAME_SEQUENCE extends Display3DEffectMode
    /* "FRAME_SEQUENCE" */ val FRAME_SEQUENCE: typings.tizenCommonWeb.tvdisplaycontrolMod.Display3DEffectMode.FRAME_SEQUENCE with String = js.native
    
    @js.native
    sealed trait FROM_2D_TO_3D extends Display3DEffectMode
    /* "FROM_2D_TO_3D" */ val FROM_2D_TO_3D: typings.tizenCommonWeb.tvdisplaycontrolMod.Display3DEffectMode.FROM_2D_TO_3D with String = js.native
    
    @js.native
    sealed trait LINE_BY_LINE extends Display3DEffectMode
    /* "LINE_BY_LINE" */ val LINE_BY_LINE: typings.tizenCommonWeb.tvdisplaycontrolMod.Display3DEffectMode.LINE_BY_LINE with String = js.native
    
    @js.native
    sealed trait OFF extends Display3DEffectMode
    /* "OFF" */ val OFF: typings.tizenCommonWeb.tvdisplaycontrolMod.Display3DEffectMode.OFF with String = js.native
    
    @js.native
    sealed trait SIDE_BY_SIDE extends Display3DEffectMode
    /* "SIDE_BY_SIDE" */ val SIDE_BY_SIDE: typings.tizenCommonWeb.tvdisplaycontrolMod.Display3DEffectMode.SIDE_BY_SIDE with String = js.native
    
    @js.native
    sealed trait TOP_BOTTOM extends Display3DEffectMode
    /* "TOP_BOTTOM" */ val TOP_BOTTOM: typings.tizenCommonWeb.tvdisplaycontrolMod.Display3DEffectMode.TOP_BOTTOM with String = js.native
    
    @js.native
    sealed trait VERTICAL_STRIPE extends Display3DEffectMode
    /* "VERTICAL_STRIPE" */ val VERTICAL_STRIPE: typings.tizenCommonWeb.tvdisplaycontrolMod.Display3DEffectMode.VERTICAL_STRIPE with String = js.native
  }
  
  @js.native
  sealed trait Display3DModeState extends StObject
  @JSImport("tizen-common-web/tvdisplaycontrol", "Display3DModeState")
  @js.native
  object Display3DModeState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Display3DModeState with String] = js.native
    
    @js.native
    sealed trait NOT_CONNECTED extends Display3DModeState
    /* "NOT_CONNECTED" */ val NOT_CONNECTED: typings.tizenCommonWeb.tvdisplaycontrolMod.Display3DModeState.NOT_CONNECTED with String = js.native
    
    @js.native
    sealed trait NOT_SUPPORTED extends Display3DModeState
    /* "NOT_SUPPORTED" */ val NOT_SUPPORTED: typings.tizenCommonWeb.tvdisplaycontrolMod.Display3DModeState.NOT_SUPPORTED with String = js.native
    
    @js.native
    sealed trait READY extends Display3DModeState
    /* "READY" */ val READY: typings.tizenCommonWeb.tvdisplaycontrolMod.Display3DModeState.READY with String = js.native
  }
  
  type Mode3DEffectListSupportCallback = js.Function1[/* mode3DEffects */ js.Array[Display3DEffectMode], Unit]
  
  @js.native
  trait TVDisplayControlManager extends StObject {
    
    /**
      * Gets the current 3D effect mode.
      *
      * @returns Display3DEffectMode The current mode of 3D effect.
      * @throw WebAPIException  `SecurityError`, `NotSupportedError`, `UnknownError`.
      * @privilegeLevel 5.0 public
      * @privilegeName 5.0 http://tizen.org/privilege/tv.display
      * @warning 5.0 http://tizen.org/privilege/tv.display (public level) has been deprecated since 5.0.
      */
    def get3DEffectMode(): Display3DEffectMode | OFF | TOP_BOTTOM | SIDE_BY_SIDE | LINE_BY_LINE | VERTICAL_STRIPE | FRAME_SEQUENCE | CHECKER_BD | FROM_2D_TO_3D = js.native
    
    /**
      * Gets the supported 3D effects.
      *
      * @param successCallback The method to invoke when a list of supported 3D modes is retrieved successfully.
      * @param errorCallback The method to invoke when an error occurs.
      * @throw WebAPIException `TypeMismatchError`, `SecurityError`
      * @privilegeLevel 5.0 public
      * @privilegeName 5.0 http://tizen.org/privilege/tv.display
      * @warning 5.0 http://tizen.org/privilege/tv.display (public level) has been deprecated since 5.0.
      */
    def getSupported3DEffectModeList(successCallback: Mode3DEffectListSupportCallback): Unit = js.native
    def getSupported3DEffectModeList(successCallback: Mode3DEffectListSupportCallback, errorCallback: ErrorCallback): Unit = js.native
    
    /**
      * Checks whether playing 3D mode is available or not.
      *
      * @returns Display3DModeState The current state to display 3D contents.
      * @throw WebAPIException `SecurityError`, `NotSupportedError`, `UnknownError`
      * @privilegeLevel 5.0 public
      * @privilegeName 5.0 http://tizen.org/privilege/tv.display
      * @warning 5.0 http://tizen.org/privilege/tv.display (public level) has been deprecated since 5.0.
      */
    def is3DModeEnabled(): Display3DModeState | NOT_CONNECTED | NOT_SUPPORTED | READY = js.native
  }
}
