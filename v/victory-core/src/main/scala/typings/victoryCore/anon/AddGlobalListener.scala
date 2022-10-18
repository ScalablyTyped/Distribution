package typings.victoryCore.anon

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.DetailedReactHTMLElement
import typings.react.mod.ErrorInfo
import typings.react.mod.ReactElement
import typings.react.mod.ReactInstance
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.std.Pick
import typings.std.Record
import typings.victoryCore.libVictoryUtilAddEventsMod.EventMixinCalculatedValues
import typings.victoryCore.libVictoryUtilAddEventsMod.EventMixinCommonProps
import typings.victoryCore.libVictoryUtilEventsMod.ComponentEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddGlobalListener[TProps /* <: EventMixinCommonProps */] extends StObject {
  
  var UNSAFE_componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var UNSAFE_componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ TProps, /* nextContext */ Any, Unit]] = js.native
  
  var UNSAFE_componentWillUpdate: js.UndefOr[
    js.Function3[/* nextProps */ TProps, /* nextState */ js.Object, /* nextContext */ Any, Unit]
  ] = js.native
  
  def addGlobalListener(key: Any): Unit = js.native
  
  def animateComponent(props: TProps, defaultAnimationWhitelist: js.Array[String]): ReactElement = js.native
  
  def applyExternalMutations(props: Any, externalMutations: Any): Unit = js.native
  
  var baseProps: Record[String, js.Object] = js.native
  
  def cacheValues(obj: Any): Unit = js.native
  
  var componentDidCatch: js.UndefOr[js.Function2[/* error */ js.Error, /* errorInfo */ ErrorInfo, Unit]] = js.native
  
  def componentDidMount(): Unit = js.native
  
  def componentDidUpdate(prevProps: Any): Unit = js.native
  
  var componentEvents: js.Array[ComponentEvent] = js.native
  
  var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ TProps, /* nextContext */ Any, Unit]] = js.native
  
  def componentWillUnmount(): Unit = js.native
  
  var componentWillUpdate: js.UndefOr[
    js.Function3[/* nextProps */ TProps, /* nextState */ js.Object, /* nextContext */ Any, Unit]
  ] = js.native
  
  var context: Any = js.native
  
  var dataKeys: js.Array[String] = js.native
  
  var events: Any = js.native
  
  var externalMutations: js.UndefOr[js.Object] = js.native
  
  def forceUpdate(): Unit = js.native
  def forceUpdate(callback: js.Function0[Unit]): Unit = js.native
  
  def getAllEvents(props: Any): Any = js.native
  
  def getBaseProps(props: Any, getSharedEventState: Any): Record[String, js.Object] = js.native
  
  def getCalculatedValues(props: Any): EventMixinCalculatedValues = js.native
  
  def getComponentProps(component: Any, `type`: Any, index: Any): Any = js.native
  
  def getEventState(eventKey: String, namespace: String): Any = js.native
  def getEventState(eventKey: String, namespace: String, childType: String): Any = js.native
  def getEventState(eventKey: Double, namespace: String): Any = js.native
  def getEventState(eventKey: Double, namespace: String, childType: String): Any = js.native
  
  def getEvents(p: Any, target: Any, eventKey: Any): Any = js.native
  
  def getExternalMutations(props: TProps): js.UndefOr[js.Object] = js.native
  
  def getScopedEvents(events: Any, namespace: Any, childType: Any, baseProps: Any): js.Object = js.native
  
  def getSharedEventState(key: String, value: String): Any = js.native
  
  var getSnapshotBeforeUpdate: js.UndefOr[js.Function2[/* prevProps */ TProps, /* prevState */ js.Object, Any]] = js.native
  
  def getStateChanges(props: Any): js.Object = js.native
  
  var hasEvents: Any = js.native
  
  var prevGlobalEventKeys: js.Array[String] = js.native
  
  val props: TProps = js.native
  
  var refs: StringDictionary[ReactInstance] = js.native
  
  def removeGlobalListener(key: Any): Unit = js.native
  
  def render(): ReactNode = js.native
  
  def renderContainer(component: Any, children: Any): DetailedReactHTMLElement[Any, HTMLElement] = js.native
  
  def renderContinuousData(props: TProps): DetailedReactHTMLElement[Any, HTMLElement] = js.native
  
  def renderData(props: Any): DetailedReactHTMLElement[Any, HTMLElement] = js.native
  def renderData(props: Any, shouldRenderDatum: js.Function1[/* datum */ Any, Boolean]): DetailedReactHTMLElement[Any, HTMLElement] = js.native
  
  def setState[K /* <: scala.Nothing */](): Unit = js.native
  def setState[K /* <: scala.Nothing */](state: js.Object | (Pick[js.Object, K])): Unit = js.native
  def setState[K /* <: scala.Nothing */](state: js.Object | (Pick[js.Object, K]), callback: js.Function0[Unit]): Unit = js.native
  def setState[K /* <: scala.Nothing */](
    state: js.Function2[
      /* prevState */ js.Object, 
      /* props */ TProps, 
      js.Object | (Pick[js.Object, K]) | Null
    ]
  ): Unit = js.native
  def setState[K /* <: scala.Nothing */](
    state: js.Function2[
      /* prevState */ js.Object, 
      /* props */ TProps, 
      js.Object | (Pick[js.Object, K]) | Null
    ],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def setState[K /* <: scala.Nothing */](state: Null, callback: js.Function0[Unit]): Unit = js.native
  
  def shouldComponentUpdate(nextProps: TProps): Boolean = js.native
}
