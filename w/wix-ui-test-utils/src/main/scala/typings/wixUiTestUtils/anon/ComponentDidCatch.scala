package typings.wixUiTestUtils.anon

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ErrorInfo
import typings.react.mod.ReactInstance
import typings.std.Pick
import typings.wixUiTestUtils.helpersMod.ControlledChangeEvent
import typings.wixUiTestUtils.helpersMod.ControlledComponentProps
import typings.wixUiTestUtils.helpersMod.ControlledComponentState
import typings.wixUiTestUtils.wixUiTestUtilsStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentDidCatch[T /* <: ControlledComponentProps */] extends StObject {
  
  var UNSAFE_componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var UNSAFE_componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ T, /* nextContext */ Any, Unit]] = js.native
  
  var UNSAFE_componentWillUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ T, 
      /* nextState */ ReadonlyControlledCompone, 
      /* nextContext */ Any, 
      Unit
    ]
  ] = js.native
  
  def _onChange(e: ControlledChangeEvent[Any]): Unit = js.native
  
  var componentDidCatch: js.UndefOr[js.Function2[/* error */ js.Error, /* errorInfo */ ErrorInfo, Unit]] = js.native
  
  var componentDidMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentDidUpdate: js.UndefOr[
    js.Function3[
      /* prevProps */ T, 
      /* prevState */ ReadonlyControlledCompone, 
      /* snapshot */ js.UndefOr[Any], 
      Unit
    ]
  ] = js.native
  
  var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ T, /* nextContext */ Any, Unit]] = js.native
  
  var componentWillUnmount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentWillUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ T, 
      /* nextState */ ReadonlyControlledCompone, 
      /* nextContext */ Any, 
      Unit
    ]
  ] = js.native
  
  var context: Any = js.native
  
  def forceUpdate(): Unit = js.native
  def forceUpdate(callback: js.Function0[Unit]): Unit = js.native
  
  var getSnapshotBeforeUpdate: js.UndefOr[js.Function2[/* prevProps */ T, /* prevState */ ReadonlyControlledCompone, Any]] = js.native
  
  val props: T & ReadonlychildrenReactNode = js.native
  
  var refs: StringDictionary[ReactInstance] = js.native
  
  def render(): typings.react.mod.global.JSX.Element = js.native
  
  def setState[K /* <: value */](): Unit = js.native
  def setState[K /* <: value */](
    state: js.Function2[
      /* prevState */ ReadonlyControlledCompone, 
      /* props */ T, 
      ControlledComponentState | (Pick[ControlledComponentState, K]) | Null
    ]
  ): Unit = js.native
  def setState[K /* <: value */](
    state: js.Function2[
      /* prevState */ ReadonlyControlledCompone, 
      /* props */ T, 
      ControlledComponentState | (Pick[ControlledComponentState, K]) | Null
    ],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def setState[K /* <: value */](state: Null, callback: js.Function0[Unit]): Unit = js.native
  def setState[K /* <: value */](state: Pick[ControlledComponentState, K]): Unit = js.native
  def setState[K /* <: value */](state: Pick[ControlledComponentState, K], callback: js.Function0[Unit]): Unit = js.native
  def setState[K /* <: value */](state: ControlledComponentState): Unit = js.native
  def setState[K /* <: value */](state: ControlledComponentState, callback: js.Function0[Unit]): Unit = js.native
  
  var shouldComponentUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ T, 
      /* nextState */ ReadonlyControlledCompone, 
      /* nextContext */ Any, 
      Boolean
    ]
  ] = js.native
  
  var state: Value = js.native
}
