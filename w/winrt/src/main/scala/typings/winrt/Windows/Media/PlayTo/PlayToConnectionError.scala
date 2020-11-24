package typings.winrt.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlayToConnectionError extends js.Object
@JSGlobal("Windows.Media.PlayTo.PlayToConnectionError")
@js.native
object PlayToConnectionError extends js.Object {
  
  @js.native
  sealed trait deviceError extends PlayToConnectionError
  
  @js.native
  sealed trait deviceLocked extends PlayToConnectionError
  
  @js.native
  sealed trait deviceNotResponding extends PlayToConnectionError
  
  @js.native
  sealed trait none extends PlayToConnectionError
}
