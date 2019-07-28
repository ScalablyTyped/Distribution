package typings.windowsDash1251

import typings.windowsDash1251.windowsDash1251Mod.DecoderMode
import typings.windowsDash1251.windowsDash1251Mod.EncoderMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object windowsDash1251Strings {
  @js.native
  sealed trait fatal
    extends DecoderMode
       with EncoderMode
  
  @js.native
  sealed trait html extends EncoderMode
  
  @js.native
  sealed trait replacement extends DecoderMode
  
  @scala.inline
  def fatal: fatal = "fatal".asInstanceOf[fatal]
  @scala.inline
  def html: html = "html".asInstanceOf[html]
  @scala.inline
  def replacement: replacement = "replacement".asInstanceOf[replacement]
}

