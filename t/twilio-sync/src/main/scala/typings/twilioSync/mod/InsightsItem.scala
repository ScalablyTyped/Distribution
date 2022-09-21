package typings.twilioSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An individual result from a LiveQuery or InstantQuery result set.
  */
@JSImport("twilio-sync", "InsightsItem")
@js.native
/**
  * @internal
  */
open class InsightsItem () extends StObject {
  
  /**
    * The identifier that maps to this item within the search result.
    */
  var key: String = js.native
  
  /**
    * The contents of the item.
    */
  var value: js.Object = js.native
}
