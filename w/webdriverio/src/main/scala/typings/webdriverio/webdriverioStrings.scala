package typings.webdriverio

import typings.webdriverio.WebdriverIO.ActionTypes
import typings.webdriverio.WebdriverIO.LocationParam
import typings.webdriverio.WebdriverIO.SizeParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object webdriverioStrings {
  @js.native
  sealed trait height extends SizeParam
  
  @js.native
  sealed trait longPress extends ActionTypes
  
  @js.native
  sealed trait moveTo extends ActionTypes
  
  @js.native
  sealed trait press extends ActionTypes
  
  @js.native
  sealed trait release extends ActionTypes
  
  @js.native
  sealed trait tap extends ActionTypes
  
  @js.native
  sealed trait wait extends ActionTypes
  
  @js.native
  sealed trait width extends SizeParam
  
  @js.native
  sealed trait x extends LocationParam
  
  @js.native
  sealed trait y extends LocationParam
  
  @scala.inline
  def height: height = "height".asInstanceOf[height]
  @scala.inline
  def longPress: longPress = "longPress".asInstanceOf[longPress]
  @scala.inline
  def moveTo: moveTo = "moveTo".asInstanceOf[moveTo]
  @scala.inline
  def press: press = "press".asInstanceOf[press]
  @scala.inline
  def release: release = "release".asInstanceOf[release]
  @scala.inline
  def tap: tap = "tap".asInstanceOf[tap]
  @scala.inline
  def width: width = "width".asInstanceOf[width]
  @scala.inline
  def x: x = "x".asInstanceOf[x]
  @scala.inline
  def y: y = "y".asInstanceOf[y]
}

