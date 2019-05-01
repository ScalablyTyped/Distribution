package typings
package twilioDashSyncLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libLivequeryMod {
  type InsightsServices = twilioDashSyncLib.libEntityMod.EntityServices
  type ItemsSnapshot = org.scalablytyped.runtime.StringDictionary[js.Object]
  type LiveQueryCreator = js.Function2[
    /* indexName */ java.lang.String, 
    /* queryExpression */ java.lang.String, 
    js.Promise[LiveQuery]
  ]
}
