package typings.tizenCommonWeb.tvinfoMod

import typings.tizenCommonWeb.tizenCommonWebStrings.CAPTION_BG_COLOR_KEY
import typings.tizenCommonWeb.tizenCommonWebStrings.CAPTION_BG_OPACITY_KEY
import typings.tizenCommonWeb.tizenCommonWebStrings.CAPTION_EDGE_COLOR_KEY
import typings.tizenCommonWeb.tizenCommonWebStrings.CAPTION_EDGE_TYPE_KEY
import typings.tizenCommonWeb.tizenCommonWebStrings.CAPTION_FONT_COLOR_KEY
import typings.tizenCommonWeb.tizenCommonWebStrings.CAPTION_FONT_OPACITY_KEY
import typings.tizenCommonWeb.tizenCommonWebStrings.CAPTION_FONT_SIZE_KEY
import typings.tizenCommonWeb.tizenCommonWebStrings.CAPTION_FONT_STYLE_KEY
import typings.tizenCommonWeb.tizenCommonWebStrings.CAPTION_MODE_KEY
import typings.tizenCommonWeb.tizenCommonWebStrings.CAPTION_ONOFF_KEY
import typings.tizenCommonWeb.tizenCommonWebStrings.CAPTION_WINDOW_COLOR_KEY
import typings.tizenCommonWeb.tizenCommonWebStrings.CAPTION_WINDOW_OPACITY_KEY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TVInfoManager extends js.Object {
  
  /**
    * Adds a listener to be called when given caption menu key value changes.
    * @returns CaptionValue value for given caption menu key
    * @param key Caption menu key which changes will be observed by this listener
    * @param callback Callback method to be invoked when the value changes
    * @throw WebAPIException TypeMismatchError, InvalidValuesError, UnknownError
    * @since 2.4
    */
  def addCaptionValueChangeListener(key: CaptionInfoKey, callback: CaptionValueChangeCallback): Double = js.native
  @JSName("addCaptionValueChangeListener")
  def addCaptionValueChangeListener_CAPTIONBGCOLORKEY(key: CAPTION_BG_COLOR_KEY, callback: CaptionValueChangeCallback): Double = js.native
  @JSName("addCaptionValueChangeListener")
  def addCaptionValueChangeListener_CAPTIONBGOPACITYKEY(key: CAPTION_BG_OPACITY_KEY, callback: CaptionValueChangeCallback): Double = js.native
  @JSName("addCaptionValueChangeListener")
  def addCaptionValueChangeListener_CAPTIONEDGECOLORKEY(key: CAPTION_EDGE_COLOR_KEY, callback: CaptionValueChangeCallback): Double = js.native
  @JSName("addCaptionValueChangeListener")
  def addCaptionValueChangeListener_CAPTIONEDGETYPEKEY(key: CAPTION_EDGE_TYPE_KEY, callback: CaptionValueChangeCallback): Double = js.native
  @JSName("addCaptionValueChangeListener")
  def addCaptionValueChangeListener_CAPTIONFONTCOLORKEY(key: CAPTION_FONT_COLOR_KEY, callback: CaptionValueChangeCallback): Double = js.native
  @JSName("addCaptionValueChangeListener")
  def addCaptionValueChangeListener_CAPTIONFONTOPACITYKEY(key: CAPTION_FONT_OPACITY_KEY, callback: CaptionValueChangeCallback): Double = js.native
  @JSName("addCaptionValueChangeListener")
  def addCaptionValueChangeListener_CAPTIONFONTSIZEKEY(key: CAPTION_FONT_SIZE_KEY, callback: CaptionValueChangeCallback): Double = js.native
  @JSName("addCaptionValueChangeListener")
  def addCaptionValueChangeListener_CAPTIONFONTSTYLEKEY(key: CAPTION_FONT_STYLE_KEY, callback: CaptionValueChangeCallback): Double = js.native
  @JSName("addCaptionValueChangeListener")
  def addCaptionValueChangeListener_CAPTIONMODEKEY(key: CAPTION_MODE_KEY, callback: CaptionValueChangeCallback): Double = js.native
  @JSName("addCaptionValueChangeListener")
  def addCaptionValueChangeListener_CAPTIONONOFFKEY(key: CAPTION_ONOFF_KEY, callback: CaptionValueChangeCallback): Double = js.native
  @JSName("addCaptionValueChangeListener")
  def addCaptionValueChangeListener_CAPTIONWINDOWCOLORKEY(key: CAPTION_WINDOW_COLOR_KEY, callback: CaptionValueChangeCallback): Double = js.native
  @JSName("addCaptionValueChangeListener")
  def addCaptionValueChangeListener_CAPTIONWINDOWOPACITYKEY(key: CAPTION_WINDOW_OPACITY_KEY, callback: CaptionValueChangeCallback): Double = js.native
  
  /**
    * Method returns the value for corresponding caption menu key.
    * @returns CaptionValue value for given caption menu key
    * @param key Caption menu
    * @throw WebAPIException TypeMismatchError, UnknownError
    * @since 2.4
    */
  def getCaptionValue(key: CaptionInfoKey): CaptionState with CaptionMode with CaptionFontSize with CaptionFontStyle with CaptionColor with CaptionOpacity with CaptionEdge = js.native
  @JSName("getCaptionValue")
  def getCaptionValue_CAPTIONBGCOLORKEY(key: CAPTION_BG_COLOR_KEY): CaptionState with CaptionMode with CaptionFontSize with CaptionFontStyle with CaptionColor with CaptionOpacity with CaptionEdge = js.native
  @JSName("getCaptionValue")
  def getCaptionValue_CAPTIONBGOPACITYKEY(key: CAPTION_BG_OPACITY_KEY): CaptionState with CaptionMode with CaptionFontSize with CaptionFontStyle with CaptionColor with CaptionOpacity with CaptionEdge = js.native
  @JSName("getCaptionValue")
  def getCaptionValue_CAPTIONEDGECOLORKEY(key: CAPTION_EDGE_COLOR_KEY): CaptionState with CaptionMode with CaptionFontSize with CaptionFontStyle with CaptionColor with CaptionOpacity with CaptionEdge = js.native
  @JSName("getCaptionValue")
  def getCaptionValue_CAPTIONEDGETYPEKEY(key: CAPTION_EDGE_TYPE_KEY): CaptionState with CaptionMode with CaptionFontSize with CaptionFontStyle with CaptionColor with CaptionOpacity with CaptionEdge = js.native
  @JSName("getCaptionValue")
  def getCaptionValue_CAPTIONFONTCOLORKEY(key: CAPTION_FONT_COLOR_KEY): CaptionState with CaptionMode with CaptionFontSize with CaptionFontStyle with CaptionColor with CaptionOpacity with CaptionEdge = js.native
  @JSName("getCaptionValue")
  def getCaptionValue_CAPTIONFONTOPACITYKEY(key: CAPTION_FONT_OPACITY_KEY): CaptionState with CaptionMode with CaptionFontSize with CaptionFontStyle with CaptionColor with CaptionOpacity with CaptionEdge = js.native
  @JSName("getCaptionValue")
  def getCaptionValue_CAPTIONFONTSIZEKEY(key: CAPTION_FONT_SIZE_KEY): CaptionState with CaptionMode with CaptionFontSize with CaptionFontStyle with CaptionColor with CaptionOpacity with CaptionEdge = js.native
  @JSName("getCaptionValue")
  def getCaptionValue_CAPTIONFONTSTYLEKEY(key: CAPTION_FONT_STYLE_KEY): CaptionState with CaptionMode with CaptionFontSize with CaptionFontStyle with CaptionColor with CaptionOpacity with CaptionEdge = js.native
  @JSName("getCaptionValue")
  def getCaptionValue_CAPTIONMODEKEY(key: CAPTION_MODE_KEY): CaptionState with CaptionMode with CaptionFontSize with CaptionFontStyle with CaptionColor with CaptionOpacity with CaptionEdge = js.native
  @JSName("getCaptionValue")
  def getCaptionValue_CAPTIONONOFFKEY(key: CAPTION_ONOFF_KEY): CaptionState with CaptionMode with CaptionFontSize with CaptionFontStyle with CaptionColor with CaptionOpacity with CaptionEdge = js.native
  @JSName("getCaptionValue")
  def getCaptionValue_CAPTIONWINDOWCOLORKEY(key: CAPTION_WINDOW_COLOR_KEY): CaptionState with CaptionMode with CaptionFontSize with CaptionFontStyle with CaptionColor with CaptionOpacity with CaptionEdge = js.native
  @JSName("getCaptionValue")
  def getCaptionValue_CAPTIONWINDOWOPACITYKEY(key: CAPTION_WINDOW_OPACITY_KEY): CaptionState with CaptionMode with CaptionFontSize with CaptionFontStyle with CaptionColor with CaptionOpacity with CaptionEdge = js.native
  
  /**
    * Removes a listener.
    * Calling this function has no effect if there is no listener with given id.
    * @param watchId Identifier of the subscription returned by addCaptionValueChangeListener()
    * @throw WebAPIException UnknownError
    * @since 2.4
    */
  def removeCaptionValueChangeListener(watchId: Double): Unit = js.native
}
