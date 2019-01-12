package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait html extends js.Object {
  def addCss(node: stdLib.HTMLElement, name: java.lang.String): scala.Unit = js.native
  def addMeta(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def addStyle(css: java.lang.String): scala.Unit = js.native
  def allowSelect(): scala.Unit = js.native
  def create(name: java.lang.String, attrs: js.Any): stdLib.HTMLElement = js.native
  def create(name: java.lang.String, attrs: js.Any, html: java.lang.String): stdLib.HTMLElement = js.native
  def createCss(data: js.Any): java.lang.String = js.native
  def denySelect(): scala.Unit = js.native
  def getTextSize(text: java.lang.String): webixLib.SizeInfo = js.native
  def getTextSize(text: java.lang.String, css: java.lang.String): webixLib.SizeInfo = js.native
  def getTextSize(text: java.lang.String, css: java.lang.String, width: scala.Double): webixLib.SizeInfo = js.native
  def getTextSize(text: js.Array[java.lang.String]): webixLib.SizeInfo = js.native
  def getTextSize(text: js.Array[java.lang.String], css: java.lang.String): webixLib.SizeInfo = js.native
  def getTextSize(text: js.Array[java.lang.String], css: java.lang.String, width: scala.Double): webixLib.SizeInfo = js.native
  def getValue(node: stdLib.HTMLElement): java.lang.String = js.native
  def index(node: stdLib.HTMLElement): scala.Double = js.native
  def insertBefore(node: stdLib.HTMLElement, before: stdLib.HTMLElement): scala.Unit = js.native
  def insertBefore(node: stdLib.HTMLElement, before: stdLib.HTMLElement, rescue: stdLib.HTMLElement): scala.Unit = js.native
  def locate(ev: stdLib.Event, name: java.lang.String): java.lang.String = js.native
  def locate(ev: stdLib.HTMLElement, name: java.lang.String): java.lang.String = js.native
  def offset(node: stdLib.HTMLElement): js.Any = js.native
  def pos(ev: stdLib.Event): js.Any = js.native
  def posRelative(ev: stdLib.Event): js.Any = js.native
  def preventEvent(ev: stdLib.Event): scala.Boolean = js.native
  def remove(node: js.Array[stdLib.HTMLElement]): scala.Unit = js.native
  def remove(node: stdLib.HTMLElement): scala.Unit = js.native
  def removeCss(node: stdLib.HTMLElement, name: java.lang.String): scala.Unit = js.native
  def stopEvent(ev: stdLib.Event): scala.Boolean = js.native
}

