package typings.windows1251

import typings.windows1251.mod.DecoderMode
import typings.windows1251.mod.EncoderMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object windows1251Strings {
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

