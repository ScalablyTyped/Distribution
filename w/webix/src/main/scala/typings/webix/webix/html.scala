package typings.webix.webix

import typings.std.Event
import typings.std.HTMLElement
import typings.webix.anon.End
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait html extends StObject {
  
  def addCss(node: HTMLElement, name: String): Unit = js.native
  
  def addMeta(name: String, value: String): Unit = js.native
  
  def addStyle(css: String): Unit = js.native
  def addStyle(css: String, group_name: String): Unit = js.native
  
  def allowSelect(): Unit = js.native
  
  def create(name: String): HTMLElement = js.native
  def create(name: String, attrs: Unit, html: String): HTMLElement = js.native
  def create(name: String, attrs: obj): HTMLElement = js.native
  def create(name: String, attrs: obj, html: String): HTMLElement = js.native
  
  def createCss(data: obj): String = js.native
  
  def denySelect(): Unit = js.native
  
  def download(obj: Any, name: String): Unit = js.native
  
  def getSelectionRange(node: HTMLElement): End = js.native
  
  def getTextSize(text: String): SizeInfo = js.native
  def getTextSize(text: String, css: String): SizeInfo = js.native
  def getTextSize(text: String, css: String, width: Double): SizeInfo = js.native
  def getTextSize(text: String, css: Unit, width: Double): SizeInfo = js.native
  def getTextSize(text: js.Array[String]): SizeInfo = js.native
  def getTextSize(text: js.Array[String], css: String): SizeInfo = js.native
  def getTextSize(text: js.Array[String], css: String, width: Double): SizeInfo = js.native
  def getTextSize(text: js.Array[String], css: Unit, width: Double): SizeInfo = js.native
  
  def getValue(node: HTMLElement): String = js.native
  
  def index(node: HTMLElement): Double = js.native
  
  def insertBefore(node: HTMLElement, before: HTMLElement): Unit = js.native
  def insertBefore(node: HTMLElement, before: HTMLElement, rescue: HTMLElement): Unit = js.native
  
  def locate(ev: Event, name: String): String = js.native
  def locate(ev: HTMLElement, name: String): String = js.native
  
  def offset(node: HTMLElement): PositionInfo & SizeInfo = js.native
  
  def pos(ev: Event): PositionInfo = js.native
  
  def posRelative(ev: Event): PositionInfo = js.native
  
  def preventEvent(ev: Event): Boolean = js.native
  
  def remove(node: js.Array[HTMLElement]): Unit = js.native
  def remove(node: HTMLElement): Unit = js.native
  
  def removeCss(node: HTMLElement, name: String): Unit = js.native
  
  def removeStyle(): Unit = js.native
  def removeStyle(group_name: String): Unit = js.native
  
  def setSelectionRange(node: HTMLElement): Unit = js.native
  def setSelectionRange(node: HTMLElement, start: Double): Unit = js.native
  def setSelectionRange(node: HTMLElement, start: Double, end: Double): Unit = js.native
  def setSelectionRange(node: HTMLElement, start: Unit, end: Double): Unit = js.native
  
  def stopEvent(ev: Event): Boolean = js.native
  
  def triggerEvent(node: HTMLElement, `type`: String, name: String): Unit = js.native
}
