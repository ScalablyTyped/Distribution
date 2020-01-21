package typings.wonderFrp.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var callFunc: js.Function2[
    /* func */ js.Function, 
    /* context */ js.UndefOr[js.Any], 
    typings.wonderFrp.anonymousStreamMod.AnonymousStream
  ] = js.native
  var createStream: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Operator.createStream */ js.Any = js.native
  var defer: js.Function1[/* buildStreamFunc */ js.Function, typings.wonderFrp.deferStreamMod.DeferStream] = js.native
  var empty: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Operator.empty */ js.Any = js.native
  var fromArray: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Operator.fromArray */ js.Any = js.native
  var fromEvent: js.Function2[
    /* dom */ HTMLElement, 
    /* eventName */ String, 
    typings.wonderFrp.fromEventPatternStreamMod.FromEventPatternStream
  ] = js.native
  var fromEventPattern: js.Function2[
    /* addHandler */ js.Function, 
    /* removeHandler */ js.Function, 
    typings.wonderFrp.fromEventPatternStreamMod.FromEventPatternStream
  ] = js.native
  var fromNodeCallback: js.Function2[
    /* func */ js.Function, 
    /* context */ js.UndefOr[js.Any], 
    js.Function1[/* repeated */ js.Any, typings.wonderFrp.anonymousStreamMod.AnonymousStream]
  ] = js.native
  var fromPromise: js.Function2[
    /* promise */ js.Any, 
    /* scheduler */ js.UndefOr[typings.wonderFrp.schedulerMod.Scheduler], 
    typings.wonderFrp.fromPromiseStreamMod.FromPromiseStream
  ] = js.native
  var fromReadableStream: js.Function1[/* stream */ js.Any, typings.wonderFrp.anonymousStreamMod.AnonymousStream] = js.native
  var fromStream: js.Function2[
    /* stream */ js.Any, 
    /* finishEventName */ js.UndefOr[String], 
    typings.wonderFrp.anonymousStreamMod.AnonymousStream
  ] = js.native
  var fromTransformStream: js.Function1[/* stream */ js.Any, typings.wonderFrp.anonymousStreamMod.AnonymousStream] = js.native
  var fromWritableStream: js.Function1[/* stream */ js.Any, typings.wonderFrp.anonymousStreamMod.AnonymousStream] = js.native
  var interval: js.Function2[
    /* interval */ js.Any, 
    /* scheduler */ js.UndefOr[typings.wonderFrp.schedulerMod.Scheduler], 
    typings.wonderFrp.intervalStreamMod.IntervalStream
  ] = js.native
  var intervalRequest: js.Function1[
    /* scheduler */ js.UndefOr[typings.wonderFrp.schedulerMod.Scheduler], 
    typings.wonderFrp.intervalRequestStreamMod.IntervalRequestStream
  ] = js.native
  var judge: js.Function3[
    /* condition */ js.Function, 
    /* thenSource */ js.Function, 
    /* elseSource */ js.Function, 
    js.Any
  ] = js.native
  var just: js.Function1[/* returnValue */ js.Any, typings.wonderFrp.anonymousStreamMod.AnonymousStream] = js.native
  var root: js.Any = js.native
  var timeout: js.Function2[
    /* time */ js.Any, 
    /* scheduler */ js.UndefOr[typings.wonderFrp.schedulerMod.Scheduler], 
    typings.wonderFrp.timeoutStreamMod.TimeoutStream
  ] = js.native
}

