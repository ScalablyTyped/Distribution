package typings
package wonderDashFrpLib.distCommonjsGlobalOperatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/global/Operator", JSImport.Namespace)
@js.native
object distCommonjsGlobalOperatorModMembers extends js.Object {
  var callFunc: js.Function2[
    /* func */ js.Function, 
    /* context */ js.UndefOr[js.Any], 
    wonderDashFrpLib.distCommonjsStreamAnonymousStreamMod.AnonymousStream
  ] = js.native
  var createStream: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Operator.createStream */ js.Any = js.native
  var defer: js.Function1[
    /* buildStreamFunc */ js.Function, 
    wonderDashFrpLib.distCommonjsStreamDeferStreamMod.DeferStream
  ] = js.native
  var empty: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Operator.empty */ js.Any = js.native
  var fromArray: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Operator.fromArray */ js.Any = js.native
  var fromEvent: js.Function2[
    /* dom */ stdLib.HTMLElement, 
    /* eventName */ java.lang.String, 
    wonderDashFrpLib.distCommonjsStreamFromEventPatternStreamMod.FromEventPatternStream
  ] = js.native
  var fromEventPattern: js.Function2[
    /* addHandler */ js.Function, 
    /* removeHandler */ js.Function, 
    wonderDashFrpLib.distCommonjsStreamFromEventPatternStreamMod.FromEventPatternStream
  ] = js.native
  var fromPromise: js.Function2[
    /* promise */ js.Any, 
    /* scheduler */ js.UndefOr[wonderDashFrpLib.distCommonjsCoreSchedulerMod.Scheduler], 
    wonderDashFrpLib.distCommonjsStreamFromPromiseStreamMod.FromPromiseStream
  ] = js.native
  var interval: js.Function2[
    /* interval */ js.Any, 
    /* scheduler */ js.UndefOr[wonderDashFrpLib.distCommonjsCoreSchedulerMod.Scheduler], 
    wonderDashFrpLib.distCommonjsStreamIntervalStreamMod.IntervalStream
  ] = js.native
  var intervalRequest: js.Function1[
    /* scheduler */ js.UndefOr[wonderDashFrpLib.distCommonjsCoreSchedulerMod.Scheduler], 
    wonderDashFrpLib.distCommonjsStreamIntervalRequestStreamMod.IntervalRequestStream
  ] = js.native
  var judge: js.Function3[
    /* condition */ js.Function, 
    /* thenSource */ js.Function, 
    /* elseSource */ js.Function, 
    js.Any
  ] = js.native
  var just: js.Function1[
    /* returnValue */ js.Any, 
    wonderDashFrpLib.distCommonjsStreamAnonymousStreamMod.AnonymousStream
  ] = js.native
  var timeout: js.Function2[
    /* time */ js.Any, 
    /* scheduler */ js.UndefOr[wonderDashFrpLib.distCommonjsCoreSchedulerMod.Scheduler], 
    wonderDashFrpLib.distCommonjsStreamTimeoutStreamMod.TimeoutStream
  ] = js.native
}

