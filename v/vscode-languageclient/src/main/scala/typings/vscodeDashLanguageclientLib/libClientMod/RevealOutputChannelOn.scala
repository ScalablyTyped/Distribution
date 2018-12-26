package typings
package vscodeDashLanguageclientLib.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RevealOutputChannelOn extends js.Object

@JSImport("vscode-languageclient/lib/client", "RevealOutputChannelOn")
@js.native
object RevealOutputChannelOn extends js.Object {
  @js.native
  sealed trait Error
    extends vscodeDashLanguageclientLib.libClientMod.RevealOutputChannelOn
  
  @js.native
  sealed trait Info
    extends vscodeDashLanguageclientLib.libClientMod.RevealOutputChannelOn
  
  @js.native
  sealed trait Never
    extends vscodeDashLanguageclientLib.libClientMod.RevealOutputChannelOn
  
  @js.native
  sealed trait Warn
    extends vscodeDashLanguageclientLib.libClientMod.RevealOutputChannelOn
  
  /* 3 */ val Error: Error with scala.Double = js.native
  /* 1 */ val Info: Info with scala.Double = js.native
  /* 4 */ val Never: Never with scala.Double = js.native
  /* 2 */ val Warn: Warn with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vscodeDashLanguageclientLib.libClientMod.RevealOutputChannelOn with scala.Double] = js.native
}

