package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnsupportedFilter
  extends StObject
     with BaseSubscriptionFilter
object UnsupportedFilter {
  
  inline def apply(eventType: String, `type`: String): UnsupportedFilter = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsupportedFilter]
  }
}
