package typings.ts3NodejsLibrary.enumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextMessageTargetMode extends StObject
@JSImport("ts3-nodejs-library/lib/types/enum", "TextMessageTargetMode")
@js.native
object TextMessageTargetMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextMessageTargetMode with Double] = js.native
  
  /** target is a channel */
  @js.native
  sealed trait CHANNEL extends TextMessageTargetMode
  /* 2 */ val CHANNEL: typings.ts3NodejsLibrary.enumMod.TextMessageTargetMode.CHANNEL with Double = js.native
  
  /** target is a client */
  @js.native
  sealed trait CLIENT extends TextMessageTargetMode
  /* 1 */ val CLIENT: typings.ts3NodejsLibrary.enumMod.TextMessageTargetMode.CLIENT with Double = js.native
  
  /** target is a virtual server */
  @js.native
  sealed trait SERVER extends TextMessageTargetMode
  /* 3 */ val SERVER: typings.ts3NodejsLibrary.enumMod.TextMessageTargetMode.SERVER with Double = js.native
}
