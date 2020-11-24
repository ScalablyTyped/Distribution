package typings.winrt.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlayToConnectionState extends js.Object
@JSGlobal("Windows.Media.PlayTo.PlayToConnectionState")
@js.native
object PlayToConnectionState extends js.Object {
  
  @js.native
  sealed trait connected extends PlayToConnectionState
  
  @js.native
  sealed trait disconnected extends PlayToConnectionState
  
  @js.native
  sealed trait rendering extends PlayToConnectionState
}
