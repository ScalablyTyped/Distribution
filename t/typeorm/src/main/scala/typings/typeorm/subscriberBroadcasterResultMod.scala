package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscriberBroadcasterResultMod {
  
  @JSImport("typeorm/subscriber/BroadcasterResult", "BroadcasterResult")
  @js.native
  class BroadcasterResult () extends StObject {
    
    /**
      * Number of executed listeners and subscribers.
      */
    var count: Double = js.native
    
    /**
      * Promises returned by listeners and subscribers which needs to be awaited.
      */
    var promises: js.Array[js.Promise[js.Any]] = js.native
  }
}
