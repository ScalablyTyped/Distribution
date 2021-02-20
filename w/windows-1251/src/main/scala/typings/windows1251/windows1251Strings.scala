package typings.windows1251

import typings.windows1251.mod.DecoderMode
import typings.windows1251.mod.EncoderMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object windows1251Strings {
  
  @js.native
  sealed trait fatal
    extends DecoderMode
       with EncoderMode
  @scala.inline
  def fatal: fatal = "fatal".asInstanceOf[fatal]
  
  @js.native
  sealed trait html extends EncoderMode
  @scala.inline
  def html: html = "html".asInstanceOf[html]
  
  @js.native
  sealed trait replacement extends DecoderMode
  @scala.inline
  def replacement: replacement = "replacement".asInstanceOf[replacement]
}
