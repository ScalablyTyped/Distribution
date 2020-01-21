package typings.twilioSync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object livequeryMod {
  type InsightsServices = typings.twilioSync.entityMod.EntityServices
  type ItemsSnapshot = org.scalablytyped.runtime.StringDictionary[js.Object]
  type LiveQueryCreator = js.Function2[
    /* indexName */ java.lang.String, 
    /* queryExpression */ java.lang.String, 
    js.Promise[typings.twilioSync.livequeryMod.LiveQuery]
  ]
}
