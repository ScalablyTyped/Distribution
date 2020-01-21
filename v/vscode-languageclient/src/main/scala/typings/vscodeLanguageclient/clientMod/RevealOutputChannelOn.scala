package typings.vscodeLanguageclient.clientMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RevealOutputChannelOn with Double] = js.native
  /* 3 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  /* 1 */ @js.native
  object Info extends TopLevel[Info with Double]
  
  /* 4 */ @js.native
  object Never extends TopLevel[Never with Double]
  
  /* 2 */ @js.native
  object Warn extends TopLevel[Warn with Double]
  
}

