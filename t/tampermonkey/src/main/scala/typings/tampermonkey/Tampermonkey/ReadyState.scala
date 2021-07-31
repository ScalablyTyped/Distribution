package typings.tampermonkey.Tampermonkey

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReadyState extends StObject
// Response
@JSGlobal("Tampermonkey.ReadyState")
@js.native
object ReadyState extends StObject {
  
  @js.native
  sealed trait Done
    extends StObject
       with ReadyState
  
  @js.native
  sealed trait HeadersReceived
    extends StObject
       with ReadyState
  
  @js.native
  sealed trait Loading
    extends StObject
       with ReadyState
  
  @js.native
  sealed trait Opened
    extends StObject
       with ReadyState
  
  @js.native
  sealed trait Unsent
    extends StObject
       with ReadyState
}
