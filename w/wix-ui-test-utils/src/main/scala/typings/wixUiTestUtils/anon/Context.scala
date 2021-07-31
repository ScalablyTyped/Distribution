package typings.wixUiTestUtils.anon

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactInstance
import typings.std.Pick
import typings.wixUiTestUtils.helpersMod.ControlledChangeEvent
import typings.wixUiTestUtils.helpersMod.ControlledComponentState
import typings.wixUiTestUtils.wixUiTestUtilsStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context extends StObject {
  
  def _onChange(e: ControlledChangeEvent[js.Any]): Unit = js.native
  
  var context: js.Any = js.native
  
  def forceUpdate(): Unit = js.native
  def forceUpdate(callback: js.Function0[Unit]): Unit = js.native
  
  val props: ReadonlyControlledComponeChildren = js.native
  
  var refs: StringDictionary[ReactInstance] = js.native
  
  def render(): typings.react.mod.global.JSX.Element = js.native
  
  def setState[K /* <: value */](): Unit = js.native
  def setState[K /* <: value */](
    state: js.Function2[
      /* prevState */ ReadonlyControlledComponeValue, 
      /* props */ ReadonlyControlledCompone, 
      ControlledComponentState | (Pick[ControlledComponentState, K]) | Null
    ]
  ): Unit = js.native
  def setState[K /* <: value */](
    state: js.Function2[
      /* prevState */ ReadonlyControlledComponeValue, 
      /* props */ ReadonlyControlledCompone, 
      ControlledComponentState | (Pick[ControlledComponentState, K]) | Null
    ],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def setState[K /* <: value */](state: Null, callback: js.Function0[Unit]): Unit = js.native
  def setState[K /* <: value */](state: Pick[ControlledComponentState, K]): Unit = js.native
  def setState[K /* <: value */](state: Pick[ControlledComponentState, K], callback: js.Function0[Unit]): Unit = js.native
  def setState[K /* <: value */](state: ControlledComponentState): Unit = js.native
  def setState[K /* <: value */](state: ControlledComponentState, callback: js.Function0[Unit]): Unit = js.native
  
  var state: Value = js.native
}
