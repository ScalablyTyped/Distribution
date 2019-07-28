package typings.twilioDashSync

import org.scalablytyped.runtime.StringDictionary
import typings.twilioDashSync.libEntityMod.EntityServices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libLivequeryMod {
  type InsightsServices = EntityServices
  type ItemsSnapshot = StringDictionary[js.Object]
  type LiveQueryCreator = js.Function2[/* indexName */ String, /* queryExpression */ String, js.Promise[LiveQuery]]
}
