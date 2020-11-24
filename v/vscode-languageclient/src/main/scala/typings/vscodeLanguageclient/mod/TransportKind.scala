package typings.vscodeLanguageclient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TransportKind extends Transport
@JSImport("vscode-languageclient", "TransportKind")
@js.native
object TransportKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TransportKind with Double] = js.native
  
  @js.native
  sealed trait ipc extends TransportKind
  /* 1 */ @js.native
  object ipc extends TopLevel[ipc with Double]
  
  @js.native
  sealed trait pipe extends TransportKind
  /* 2 */ @js.native
  object pipe extends TopLevel[pipe with Double]
  
  @js.native
  sealed trait socket extends TransportKind
  /* 3 */ @js.native
  object socket extends TopLevel[socket with Double]
  
  @js.native
  sealed trait stdio extends TransportKind
  /* 0 */ @js.native
  object stdio extends TopLevel[stdio with Double]
}
