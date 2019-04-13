package typings
package windowsDash1251Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object windowsDash1251LibStrings {
  @js.native
  sealed trait fatal
    extends windowsDash1251Lib.windowsDash1251Mod.DecoderMode
       with windowsDash1251Lib.windowsDash1251Mod.EncoderMode
  
  @js.native
  sealed trait html
    extends windowsDash1251Lib.windowsDash1251Mod.EncoderMode
  
  @js.native
  sealed trait replacement
    extends windowsDash1251Lib.windowsDash1251Mod.DecoderMode
  
  @scala.inline
  def fatal: fatal = "fatal".asInstanceOf[fatal]
  @scala.inline
  def html: html = "html".asInstanceOf[html]
  @scala.inline
  def replacement: replacement = "replacement".asInstanceOf[replacement]
}

