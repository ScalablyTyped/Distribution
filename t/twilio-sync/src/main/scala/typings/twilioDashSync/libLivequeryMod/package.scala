package typings.twilioDashSync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libLivequeryMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.twilioDashSync.libEntityMod.EntityServices

  type InsightsServices = EntityServices
  type ItemsSnapshot = StringDictionary[js.Object]
  type LiveQueryCreator = js.Function2[/* indexName */ String, /* queryExpression */ String, js.Promise[LiveQuery]]
}
