package typings.windows1251

import typings.windows1251.mod.DecoderMode
import typings.windows1251.mod.EncoderMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object windows1251Strings {
  
  @js.native
  sealed trait fatal
    extends StObject
       with DecoderMode
       with EncoderMode
  inline def fatal: fatal = "fatal".asInstanceOf[fatal]
  
  @js.native
  sealed trait html
    extends StObject
       with EncoderMode
  inline def html: html = "html".asInstanceOf[html]
  
  @js.native
  sealed trait replacement
    extends StObject
       with DecoderMode
  inline def replacement: replacement = "replacement".asInstanceOf[replacement]
}
