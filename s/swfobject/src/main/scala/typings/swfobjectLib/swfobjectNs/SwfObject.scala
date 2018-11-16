package typings
package swfobjectLib.swfobjectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwfObject extends js.Object {
  var ua: swfobjectLib.Anon_Win = js.native
  def addDomLoadEvent(fn: js.Function0[scala.Unit]): scala.Unit = js.native
  def addLoadEvent(fn: js.Function1[/* event */ js.UndefOr[stdLib.Event], scala.Unit]): scala.Unit = js.native
  def createCSS(selStr: java.lang.String, declStr: java.lang.String): scala.Unit = js.native
  def createCSS(selStr: java.lang.String, declStr: java.lang.String, mediaStr: java.lang.String): scala.Unit = js.native
  def createCSS(
    selStr: java.lang.String,
    declStr: java.lang.String,
    mediaStr: java.lang.String,
    newStyleBoolean: scala.Boolean
  ): scala.Unit = js.native
  def createSWF(attObj: ISwfObjectAttribute, parObj: ISwfObjectParameter, replaceElemIdStr: java.lang.String): stdLib.HTMLElement = js.native
  def embedSWF(
    swfUrlStr: java.lang.String,
    replaceElemIdStr: java.lang.String,
    widthStr: java.lang.String,
    heightStr: java.lang.String,
    swfVersionStr: java.lang.String
  ): scala.Unit = js.native
  def embedSWF(
    swfUrlStr: java.lang.String,
    replaceElemIdStr: java.lang.String,
    widthStr: java.lang.String,
    heightStr: java.lang.String,
    swfVersionStr: java.lang.String,
    xiSwfUrlStr: java.lang.String
  ): scala.Unit = js.native
  def embedSWF(
    swfUrlStr: java.lang.String,
    replaceElemIdStr: java.lang.String,
    widthStr: java.lang.String,
    heightStr: java.lang.String,
    swfVersionStr: java.lang.String,
    xiSwfUrlStr: java.lang.String,
    flashvarsObj: js.Object
  ): scala.Unit = js.native
  def embedSWF(
    swfUrlStr: java.lang.String,
    replaceElemIdStr: java.lang.String,
    widthStr: java.lang.String,
    heightStr: java.lang.String,
    swfVersionStr: java.lang.String,
    xiSwfUrlStr: java.lang.String,
    flashvarsObj: js.Object,
    parObj: js.Object
  ): scala.Unit = js.native
  def embedSWF(
    swfUrlStr: java.lang.String,
    replaceElemIdStr: java.lang.String,
    widthStr: java.lang.String,
    heightStr: java.lang.String,
    swfVersionStr: java.lang.String,
    xiSwfUrlStr: java.lang.String,
    flashvarsObj: js.Object,
    parObj: js.Object,
    attObj: js.Object
  ): scala.Unit = js.native
  def embedSWF(
    swfUrlStr: java.lang.String,
    replaceElemIdStr: java.lang.String,
    widthStr: java.lang.String,
    heightStr: java.lang.String,
    swfVersionStr: java.lang.String,
    xiSwfUrlStr: java.lang.String,
    flashvarsObj: js.Object,
    parObj: js.Object,
    attObj: js.Object,
    callbackFn: js.Function1[/* callbackObj */ ICallbackObj, scala.Unit]
  ): scala.Unit = js.native
  def getFlashPlayerVersion(): IFlashPlayerVersion = js.native
  def getObjectById(objectIdStr: java.lang.String): stdLib.HTMLElement = js.native
  def getQueryParamValue(): java.lang.String = js.native
  def getQueryParamValue(param: java.lang.String): java.lang.String = js.native
  def hasFlashPlayerVersion(rv: java.lang.String): scala.Boolean = js.native
  def registerObject(objectIdStr: java.lang.String, swfVersionStr: java.lang.String): scala.Unit = js.native
  def registerObject(objectIdStr: java.lang.String, swfVersionStr: java.lang.String, xiSwfUrlStr: java.lang.String): scala.Unit = js.native
  def registerObject(
    objectIdStr: java.lang.String,
    swfVersionStr: java.lang.String,
    xiSwfUrlStr: java.lang.String,
    callbackFn: js.Function1[/* callbackObj */ ICallbackObj, scala.Unit]
  ): scala.Unit = js.native
  def removeSWF(objElemIdStr: java.lang.String): scala.Unit = js.native
  def showExpressInstall(att: ISwfObjectAttribute, par: ISwfObjectParameter, replaceElemIdStr: java.lang.String): scala.Unit = js.native
  def showExpressInstall(
    att: ISwfObjectAttribute,
    par: ISwfObjectParameter,
    replaceElemIdStr: java.lang.String,
    callbackFn: js.Function1[/* callbackObj */ ICallbackObj, scala.Unit]
  ): scala.Unit = js.native
  def switchOffAutoHideShow(): scala.Unit = js.native
}

