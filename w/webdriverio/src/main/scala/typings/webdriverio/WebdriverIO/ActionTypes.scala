package typings.webdriverio.WebdriverIO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.webdriverio.webdriverioStrings.press
  - typings.webdriverio.webdriverioStrings.longPress
  - typings.webdriverio.webdriverioStrings.tap
  - typings.webdriverio.webdriverioStrings.moveTo
  - typings.webdriverio.webdriverioStrings.wait
  - typings.webdriverio.webdriverioStrings.release
*/
trait ActionTypes extends js.Object

object ActionTypes {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def longPress: typings.webdriverio.webdriverioStrings.longPress = this.cast("longPress")
  @scala.inline
  def moveTo: typings.webdriverio.webdriverioStrings.moveTo = this.cast("moveTo")
  @scala.inline
  def press: typings.webdriverio.webdriverioStrings.press = this.cast("press")
  @scala.inline
  def release: typings.webdriverio.webdriverioStrings.release = this.cast("release")
  @scala.inline
  def tap: typings.webdriverio.webdriverioStrings.tap = this.cast("tap")
}

