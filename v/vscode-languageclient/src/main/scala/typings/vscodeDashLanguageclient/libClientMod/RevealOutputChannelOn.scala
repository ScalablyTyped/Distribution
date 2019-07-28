package typings.vscodeDashLanguageclient.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RevealOutputChannelOn extends js.Object

@JSImport("vscode-languageclient/lib/client", "RevealOutputChannelOn")
@js.native
object RevealOutputChannelOn extends js.Object {
  @js.native
  sealed trait Error extends RevealOutputChannelOn
  
  @js.native
  sealed trait Info extends RevealOutputChannelOn
  
  @js.native
  sealed trait Never extends RevealOutputChannelOn
  
  @js.native
  sealed trait Warn extends RevealOutputChannelOn
  
  /* 3 */ val Error: typings.vscodeDashLanguageclient.libClientMod.RevealOutputChannelOn.Error with Double = js.native
  /* 1 */ val Info: typings.vscodeDashLanguageclient.libClientMod.RevealOutputChannelOn.Info with Double = js.native
  /* 4 */ val Never: typings.vscodeDashLanguageclient.libClientMod.RevealOutputChannelOn.Never with Double = js.native
  /* 2 */ val Warn: typings.vscodeDashLanguageclient.libClientMod.RevealOutputChannelOn.Warn with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RevealOutputChannelOn with Double] = js.native
}

