package typings
package tingleDotJsLib.tingleDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tingle.js", "modal")
@js.native
class modal () extends js.Object {
  def this(options: Options) = this()
  def addFooterBtn(label: java.lang.String): stdLib.HTMLButtonElement = js.native
  def addFooterBtn(
    label: java.lang.String,
    cssClass: js.UndefOr[scala.Nothing],
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _]
  ): stdLib.HTMLButtonElement = js.native
  def addFooterBtn(label: java.lang.String, cssClass: java.lang.String): stdLib.HTMLButtonElement = js.native
  def addFooterBtn(
    label: java.lang.String,
    cssClass: java.lang.String,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.MouseEvent, _]
  ): stdLib.HTMLButtonElement = js.native
  def checkOverflow(): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def getContent(): stdLib.HTMLDivElement = js.native
  def getFooterContent(): js.UndefOr[stdLib.HTMLDivElement] = js.native
  def isOpen(): scala.Boolean = js.native
  def isOverflow(): scala.Boolean = js.native
  def open(): scala.Unit = js.native
  def setContent(content: java.lang.String): scala.Unit = js.native
  def setContent(content: stdLib.Element): scala.Unit = js.native
  def setFooterContent(content: java.lang.String): scala.Unit = js.native
  def setStickyFooter(sticky: scala.Boolean): scala.Unit = js.native
}

