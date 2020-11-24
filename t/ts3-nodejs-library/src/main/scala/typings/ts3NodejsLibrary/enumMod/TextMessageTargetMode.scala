package typings.ts3NodejsLibrary.enumMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextMessageTargetMode extends js.Object
@JSImport("ts3-nodejs-library/lib/types/enum", "TextMessageTargetMode")
@js.native
object TextMessageTargetMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextMessageTargetMode with Double] = js.native
  
  /** target is a channel */
  @js.native
  sealed trait CHANNEL extends TextMessageTargetMode
  /* 2 */ @js.native
  object CHANNEL extends TopLevel[CHANNEL with Double]
  
  /** target is a client */
  @js.native
  sealed trait CLIENT extends TextMessageTargetMode
  /* 1 */ @js.native
  object CLIENT extends TopLevel[CLIENT with Double]
  
  /** target is a virtual server */
  @js.native
  sealed trait SERVER extends TextMessageTargetMode
  /* 3 */ @js.native
  object SERVER extends TopLevel[SERVER with Double]
}
