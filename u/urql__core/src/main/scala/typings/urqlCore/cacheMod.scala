package typings.urqlCore

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import typings.std.Set
import typings.urqlCore.anon.FnCallT
import typings.urqlCore.clientMod.Client
import typings.urqlCore.typesMod.Exchange
import typings.urqlCore.typesMod.OperationResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@urql/core/dist/types/exchanges/cache", JSImport.Namespace)
@js.native
object cacheMod extends js.Object {
  val cacheExchange: Exchange = js.native
  def afterMutation(resultCache: ResultCache, operationCache: OperationCache, client: Client, dispatchDebug: FnCallT): js.Function1[/* response */ OperationResult[_], Unit] = js.native
  type OperationCache = StringDictionary[Set[Double]]
  type ResultCache = Map[Double, OperationResult[js.Any]]
}

