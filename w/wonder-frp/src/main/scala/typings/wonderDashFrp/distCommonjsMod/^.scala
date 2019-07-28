package typings.wonderDashFrp.distCommonjsMod

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
    typings.wonderDashFrp.distCommonjsStreamAnonymousStreamMod.AnonymousStream
  ] = js.native
  var createStream: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Operator.createStream */ js.Any = js.native
  var defer: js.Function1[
    /* buildStreamFunc */ js.Function, 
    typings.wonderDashFrp.distCommonjsStreamDeferStreamMod.DeferStream
  ] = js.native
  var empty: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Operator.empty */ js.Any = js.native
  var fromArray: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Operator.fromArray */ js.Any = js.native
  var fromEvent: js.Function2[
    /* dom */ HTMLElement, 
    /* eventName */ String, 
    typings.wonderDashFrp.distCommonjsStreamFromEventPatternStreamMod.FromEventPatternStream
  ] = js.native
  var fromEventPattern: js.Function2[
    /* addHandler */ js.Function, 
    /* removeHandler */ js.Function, 
    typings.wonderDashFrp.distCommonjsStreamFromEventPatternStreamMod.FromEventPatternStream
  ] = js.native
  var fromNodeCallback: js.Function2[
    /* func */ js.Function, 
    /* context */ js.UndefOr[js.Any], 
    js.Function1[
      /* repeated */ js.Any, 
      typings.wonderDashFrp.distCommonjsStreamAnonymousStreamMod.AnonymousStream
    ]
  ] = js.native
  var fromPromise: js.Function2[
    /* promise */ js.Any, 
    /* scheduler */ js.UndefOr[typings.wonderDashFrp.distCommonjsCoreSchedulerMod.Scheduler], 
    typings.wonderDashFrp.distCommonjsStreamFromPromiseStreamMod.FromPromiseStream
  ] = js.native
  var fromReadableStream: js.Function1[
    /* stream */ js.Any, 
    typings.wonderDashFrp.distCommonjsStreamAnonymousStreamMod.AnonymousStream
  ] = js.native
  var fromStream: js.Function2[
    /* stream */ js.Any, 
    /* finishEventName */ js.UndefOr[String], 
    typings.wonderDashFrp.distCommonjsStreamAnonymousStreamMod.AnonymousStream
  ] = js.native
  var fromTransformStream: js.Function1[
    /* stream */ js.Any, 
    typings.wonderDashFrp.distCommonjsStreamAnonymousStreamMod.AnonymousStream
  ] = js.native
  var fromWritableStream: js.Function1[
    /* stream */ js.Any, 
    typings.wonderDashFrp.distCommonjsStreamAnonymousStreamMod.AnonymousStream
  ] = js.native
  var interval: js.Function2[
    /* interval */ js.Any, 
    /* scheduler */ js.UndefOr[typings.wonderDashFrp.distCommonjsCoreSchedulerMod.Scheduler], 
    typings.wonderDashFrp.distCommonjsStreamIntervalStreamMod.IntervalStream
  ] = js.native
  var intervalRequest: js.Function1[
    /* scheduler */ js.UndefOr[typings.wonderDashFrp.distCommonjsCoreSchedulerMod.Scheduler], 
    typings.wonderDashFrp.distCommonjsStreamIntervalRequestStreamMod.IntervalRequestStream
  ] = js.native
  var judge: js.Function3[
    /* condition */ js.Function, 
    /* thenSource */ js.Function, 
    /* elseSource */ js.Function, 
    js.Any
  ] = js.native
  var just: js.Function1[
    /* returnValue */ js.Any, 
    typings.wonderDashFrp.distCommonjsStreamAnonymousStreamMod.AnonymousStream
  ] = js.native
  var root: js.Any = js.native
  var timeout: js.Function2[
    /* time */ js.Any, 
    /* scheduler */ js.UndefOr[typings.wonderDashFrp.distCommonjsCoreSchedulerMod.Scheduler], 
    typings.wonderDashFrp.distCommonjsStreamTimeoutStreamMod.TimeoutStream
  ] = js.native
  def assert(cond: Boolean): Unit = js.native
  def assert(cond: Boolean, message: String): Unit = js.native
  def ensure(OutFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
  def ensureGetter(OutFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
  def ensureSetter(OutFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
  def invariant(func: js.Any): js.Function1[/* target */ js.Any, Unit] = js.native
  def registerClass(className: String): js.Function1[/* target */ js.Any, Unit] = js.native
  def requireCheck(InFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
  def requireGetter(InFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
  def requireSetter(InFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
  def virtual(target: js.Any, name: js.Any, descriptor: js.Any): js.Any = js.native
}

