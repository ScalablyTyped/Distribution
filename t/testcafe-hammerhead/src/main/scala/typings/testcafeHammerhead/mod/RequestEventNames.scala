package typings.testcafeHammerhead.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RequestEventNames extends StObject
@JSImport("testcafe-hammerhead", "RequestEventNames")
@js.native
object RequestEventNames extends StObject {
  
  @js.native
  sealed trait onConfigureResponse
    extends StObject
       with RequestEventNames
  
  @js.native
  sealed trait onRequest
    extends StObject
       with RequestEventNames
  
  @js.native
  sealed trait onResponse
    extends StObject
       with RequestEventNames
}
