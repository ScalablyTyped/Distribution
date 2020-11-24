package typings.vscodeLanguageclient.clientMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RevealOutputChannelOn extends js.Object
@JSImport("vscode-languageclient/lib/client", "RevealOutputChannelOn")
@js.native
object RevealOutputChannelOn extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RevealOutputChannelOn with Double] = js.native
  
  @js.native
  sealed trait Error extends RevealOutputChannelOn
  /* 3 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  @js.native
  sealed trait Info extends RevealOutputChannelOn
  /* 1 */ @js.native
  object Info extends TopLevel[Info with Double]
  
  @js.native
  sealed trait Never extends RevealOutputChannelOn
  /* 4 */ @js.native
  object Never extends TopLevel[Never with Double]
  
  @js.native
  sealed trait Warn extends RevealOutputChannelOn
  /* 2 */ @js.native
  object Warn extends TopLevel[Warn with Double]
}
