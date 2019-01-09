package typings
package wonderDashFrpLib.distEs2015GlobalOperatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/global/Operator", JSImport.Namespace)
@js.native
object distEs2015GlobalOperatorModMembers extends js.Object {
  var callFunc: js.Function2[
    /* func */ js.Function, 
    /* context */ js.UndefOr[js.Any], 
    wonderDashFrpLib.distEs2015StreamAnonymousStreamMod.AnonymousStream
  ] = js.native
  var createStream: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Operator.createStream */ js.Any = js.native
  var defer: js.Function1[
    /* buildStreamFunc */ js.Function, 
    wonderDashFrpLib.distEs2015StreamDeferStreamMod.DeferStream
  ] = js.native
  var empty: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Operator.empty */ js.Any = js.native
  var fromArray: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Operator.fromArray */ js.Any = js.native
  var fromEvent: js.Function2[
    /* dom */ stdLib.HTMLElement, 
    /* eventName */ java.lang.String, 
    wonderDashFrpLib.distEs2015StreamFromEventPatternStreamMod.FromEventPatternStream
  ] = js.native
  var fromEventPattern: js.Function2[
    /* addHandler */ js.Function, 
    /* removeHandler */ js.Function, 
    wonderDashFrpLib.distEs2015StreamFromEventPatternStreamMod.FromEventPatternStream
  ] = js.native
  var fromPromise: js.Function2[
    /* promise */ js.Any, 
    /* scheduler */ js.UndefOr[wonderDashFrpLib.distEs2015CoreSchedulerMod.Scheduler], 
    wonderDashFrpLib.distEs2015StreamFromPromiseStreamMod.FromPromiseStream
  ] = js.native
  var interval: js.Function2[
    /* interval */ js.Any, 
    /* scheduler */ js.UndefOr[wonderDashFrpLib.distEs2015CoreSchedulerMod.Scheduler], 
    wonderDashFrpLib.distEs2015StreamIntervalStreamMod.IntervalStream
  ] = js.native
  var intervalRequest: js.Function1[
    /* scheduler */ js.UndefOr[wonderDashFrpLib.distEs2015CoreSchedulerMod.Scheduler], 
    wonderDashFrpLib.distEs2015StreamIntervalRequestStreamMod.IntervalRequestStream
  ] = js.native
  var judge: js.Function3[
    /* condition */ js.Function, 
    /* thenSource */ js.Function, 
    /* elseSource */ js.Function, 
    js.Any
  ] = js.native
  var just: js.Function1[
    /* returnValue */ js.Any, 
    wonderDashFrpLib.distEs2015StreamAnonymousStreamMod.AnonymousStream
  ] = js.native
  var timeout: js.Function2[
    /* time */ js.Any, 
    /* scheduler */ js.UndefOr[wonderDashFrpLib.distEs2015CoreSchedulerMod.Scheduler], 
    wonderDashFrpLib.distEs2015StreamTimeoutStreamMod.TimeoutStream
  ] = js.native
}

