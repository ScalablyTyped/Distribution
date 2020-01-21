package typings.swfobject.swfobject

import typings.std.Event_
import typings.std.HTMLElement
import typings.swfobject.AnonIe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwfObject extends js.Object {
  var ua: AnonIe = js.native
  def addDomLoadEvent(fn: js.Function0[Unit]): Unit = js.native
  def addLoadEvent(fn: js.Function1[/* event */ js.UndefOr[Event_], Unit]): Unit = js.native
  def createCSS(selStr: String, declStr: String): Unit = js.native
  def createCSS(selStr: String, declStr: String, mediaStr: String): Unit = js.native
  def createCSS(selStr: String, declStr: String, mediaStr: String, newStyleBoolean: Boolean): Unit = js.native
  def createSWF(attObj: ISwfObjectAttribute, parObj: ISwfObjectParameter, replaceElemIdStr: String): HTMLElement = js.native
  def embedSWF(
    swfUrlStr: String,
    replaceElemIdStr: String,
    widthStr: String,
    heightStr: String,
    swfVersionStr: String
  ): Unit = js.native
  def embedSWF(
    swfUrlStr: String,
    replaceElemIdStr: String,
    widthStr: String,
    heightStr: String,
    swfVersionStr: String,
    xiSwfUrlStr: String
  ): Unit = js.native
  def embedSWF(
    swfUrlStr: String,
    replaceElemIdStr: String,
    widthStr: String,
    heightStr: String,
    swfVersionStr: String,
    xiSwfUrlStr: String,
    flashvarsObj: js.Object
  ): Unit = js.native
  def embedSWF(
    swfUrlStr: String,
    replaceElemIdStr: String,
    widthStr: String,
    heightStr: String,
    swfVersionStr: String,
    xiSwfUrlStr: String,
    flashvarsObj: js.Object,
    parObj: js.Object
  ): Unit = js.native
  def embedSWF(
    swfUrlStr: String,
    replaceElemIdStr: String,
    widthStr: String,
    heightStr: String,
    swfVersionStr: String,
    xiSwfUrlStr: String,
    flashvarsObj: js.Object,
    parObj: js.Object,
    attObj: js.Object
  ): Unit = js.native
  def embedSWF(
    swfUrlStr: String,
    replaceElemIdStr: String,
    widthStr: String,
    heightStr: String,
    swfVersionStr: String,
    xiSwfUrlStr: String,
    flashvarsObj: js.Object,
    parObj: js.Object,
    attObj: js.Object,
    callbackFn: js.Function1[/* callbackObj */ ICallbackObj, Unit]
  ): Unit = js.native
  def getFlashPlayerVersion(): IFlashPlayerVersion = js.native
  def getObjectById(objectIdStr: String): HTMLElement = js.native
  def getQueryParamValue(): String = js.native
  def getQueryParamValue(param: String): String = js.native
  def hasFlashPlayerVersion(rv: String): Boolean = js.native
  def registerObject(objectIdStr: String, swfVersionStr: String): Unit = js.native
  def registerObject(objectIdStr: String, swfVersionStr: String, xiSwfUrlStr: String): Unit = js.native
  def registerObject(
    objectIdStr: String,
    swfVersionStr: String,
    xiSwfUrlStr: String,
    callbackFn: js.Function1[/* callbackObj */ ICallbackObj, Unit]
  ): Unit = js.native
  def removeSWF(objElemIdStr: String): Unit = js.native
  def showExpressInstall(att: ISwfObjectAttribute, par: ISwfObjectParameter, replaceElemIdStr: String): Unit = js.native
  def showExpressInstall(
    att: ISwfObjectAttribute,
    par: ISwfObjectParameter,
    replaceElemIdStr: String,
    callbackFn: js.Function1[/* callbackObj */ ICallbackObj, Unit]
  ): Unit = js.native
  def switchOffAutoHideShow(): Unit = js.native
}

