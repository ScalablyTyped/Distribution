package typings.tampermonkey.Tampermonkey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReadyState extends js.Object
// Response
@JSGlobal("Tampermonkey.ReadyState")
@js.native
object ReadyState extends js.Object {
  
  @js.native
  sealed trait Done extends ReadyState
  
  @js.native
  sealed trait HeadersReceived extends ReadyState
  
  @js.native
  sealed trait Loading extends ReadyState
  
  @js.native
  sealed trait Opened extends ReadyState
  
  @js.native
  sealed trait Unsent extends ReadyState
}
