package typings.subscriptionsTransportWs

import typings.std.IteratorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("subscriptions-transport-ws/dist/utils/empty-iterable", JSImport.Namespace)
@js.native
object emptyIterableMod extends js.Object {
  /* Inlined std.AsyncIterator<any, any, undefined> & {[$$asyncIterator] : any} */
  @js.native
  trait EmptyIterable extends js.Object {
    var `return`: js.UndefOr[
        js.Function1[/* value */ js.UndefOr[js.Any | js.Thenable[_]], js.Promise[IteratorResult[_, _]]]
      ] = js.native
    var `throw`: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], js.Promise[IteratorResult[_, _]]]] = js.native
    // NOTE: 'next' is defined using a tuple to ensure we report the correct assignability errors in all places.
    def next(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [] | [TNext] is not an array type */ args: js.Array[js.UndefOr[js.Any]]
    ): js.Promise[IteratorResult[_, _]] = js.native
  }
  
  def createEmptyIterable(): EmptyIterable = js.native
}

