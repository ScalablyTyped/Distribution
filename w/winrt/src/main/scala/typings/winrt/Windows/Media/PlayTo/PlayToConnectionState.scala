package typings.winrt.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlayToConnectionState extends StObject
@JSGlobal("Windows.Media.PlayTo.PlayToConnectionState")
@js.native
object PlayToConnectionState extends StObject {
  
  @js.native
  sealed trait connected extends PlayToConnectionState
  
  @js.native
  sealed trait disconnected extends PlayToConnectionState
  
  @js.native
  sealed trait rendering extends PlayToConnectionState
}
