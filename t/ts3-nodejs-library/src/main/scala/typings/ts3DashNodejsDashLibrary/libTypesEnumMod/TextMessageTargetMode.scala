package typings.ts3DashNodejsDashLibrary.libTypesEnumMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextMessageTargetMode extends js.Object

@JSImport("ts3-nodejs-library/lib/types/enum", "TextMessageTargetMode")
@js.native
object TextMessageTargetMode extends js.Object {
  /** target is a channel */
  @js.native
  sealed trait CHANNEL extends TextMessageTargetMode
  
  /** target is a client */
  @js.native
  sealed trait CLIENT extends TextMessageTargetMode
  
  /** target is a virtual server */
  @js.native
  sealed trait SERVER extends TextMessageTargetMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextMessageTargetMode with Double] = js.native
  /* 2 */ @js.native
  object CHANNEL extends TopLevel[CHANNEL with Double]
  
  /* 1 */ @js.native
  object CLIENT extends TopLevel[CLIENT with Double]
  
  /* 3 */ @js.native
  object SERVER extends TopLevel[SERVER with Double]
  
}

