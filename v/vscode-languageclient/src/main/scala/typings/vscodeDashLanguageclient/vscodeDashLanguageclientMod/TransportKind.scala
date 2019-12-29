package typings.vscodeDashLanguageclient.vscodeDashLanguageclientMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TransportKind extends Transport

@JSImport("vscode-languageclient", "TransportKind")
@js.native
object TransportKind extends js.Object {
  @js.native
  sealed trait ipc extends TransportKind
  
  @js.native
  sealed trait pipe extends TransportKind
  
  @js.native
  sealed trait socket extends TransportKind
  
  @js.native
  sealed trait stdio extends TransportKind
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TransportKind with Double] = js.native
  /* 1 */ @js.native
  object ipc extends TopLevel[ipc with Double]
  
  /* 2 */ @js.native
  object pipe extends TopLevel[pipe with Double]
  
  /* 3 */ @js.native
  object socket extends TopLevel[socket with Double]
  
  /* 0 */ @js.native
  object stdio extends TopLevel[stdio with Double]
  
}

