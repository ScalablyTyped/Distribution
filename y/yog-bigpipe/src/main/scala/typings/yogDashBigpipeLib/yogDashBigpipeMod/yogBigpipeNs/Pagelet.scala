package typings
package yogDashBigpipeLib.yogDashBigpipeMod.yogBigpipeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pagelet
  extends nodeLib.eventsMod.EventEmitter {
  var compiled: scala.Boolean = js.native
  var container: java.lang.String = js.native
  var css: js.Array[java.lang.String] = js.native
  var html: java.lang.String = js.native
  var id: java.lang.String = js.native
  @JSName("js")
  var `js_`: js.Array[java.lang.String] = js.native
  var mode: yogDashBigpipeLib.yogDashBigpipeMod.yogBigpipeNs.PageletNs.mode = js.native
  var reqID: java.lang.String = js.native
  var scripts: js.Array[java.lang.String] = js.native
  var skipAnalysis: scala.Boolean = js.native
  var state: yogDashBigpipeLib.yogDashBigpipeMod.yogBigpipeNs.PageletNs.status = js.native
  var styles: js.Array[java.lang.String] = js.native
  def addCss(css: java.lang.String): scala.Unit = js.native
  def addCss(css: js.Array[java.lang.String]): scala.Unit = js.native
  def addCsses(css: java.lang.String): scala.Unit = js.native
  def addCsses(css: js.Array[java.lang.String]): scala.Unit = js.native
  def addJs(css: java.lang.String): scala.Unit = js.native
  def addJs(css: js.Array[java.lang.String]): scala.Unit = js.native
  def addJses(css: java.lang.String): scala.Unit = js.native
  def addJses(css: js.Array[java.lang.String]): scala.Unit = js.native
  def addScript(css: java.lang.String): scala.Unit = js.native
  def addScript(css: js.Array[java.lang.String]): scala.Unit = js.native
  def addScripts(css: java.lang.String): scala.Unit = js.native
  def addScripts(css: js.Array[java.lang.String]): scala.Unit = js.native
  def addStyle(css: java.lang.String): scala.Unit = js.native
  def addStyle(css: js.Array[java.lang.String]): scala.Unit = js.native
  def addStyles(css: java.lang.String): scala.Unit = js.native
  def addStyles(css: js.Array[java.lang.String]): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def start(provider: js.Promise[_], sync: scala.Boolean): scala.Unit = js.native
  def toJson(): PageletData = js.native
}

