package typings.winrt.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlayToConnectionState extends StObject
@JSGlobal("Windows.Media.PlayTo.PlayToConnectionState")
@js.native
object PlayToConnectionState extends StObject {
  
  @js.native
  sealed trait connected
    extends StObject
       with PlayToConnectionState
  
  @js.native
  sealed trait disconnected
    extends StObject
       with PlayToConnectionState
  
  @js.native
  sealed trait rendering
    extends StObject
       with PlayToConnectionState
}
