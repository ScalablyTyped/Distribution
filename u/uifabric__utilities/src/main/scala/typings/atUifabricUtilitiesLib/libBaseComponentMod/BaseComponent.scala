package typings
package atUifabricUtilitiesLib.libBaseComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/BaseComponent", "BaseComponent")
@js.native
class BaseComponent[TProps /* <: IBaseProps[_] */, TState] protected ()
  extends reactLib.reactMod.Component[TProps, TState, js.Any] {
  /**
    * BaseComponent constructor
    * @param props - The props for the component.
    * @param context - The context for the component.
    */
  def this(props: TProps) = this()
  def this(props: TProps, context: js.Any) = this()
  var __async: js.Any = js.native
  var __className: js.Any = js.native
  var __disposables: js.Any = js.native
  var __events: js.Any = js.native
  var __resolves: js.Any = js.native
  /**
    * Gets the async instance associated with the component, created on demand. The async instance gives
    * subclasses a way to execute setTimeout/setInterval async calls safely, where the callbacks
    * will be cleared/ignored automatically after unmounting. The helpers within the async object also
    * preserve the this pointer so that you don't need to "bind" the callbacks.
    */
  val _async: atUifabricUtilitiesLib.libAsyncMod.Async = js.native
  /**
    * Allows subclasses to push things to this._disposables to be auto disposed.
    */
  val _disposables: js.Array[atUifabricUtilitiesLib.libIDisposableMod.IDisposable] = js.native
  /**
    * Gets the event group instance assocaited with the component, created on demand. The event instance
    * provides on/off methods for listening to DOM (or regular javascript object) events. The event callbacks
    * will be automatically disconnected after unmounting. The helpers within the events object also
    * preserve the this reference so that you don't need to "bind" the callbacks.
    */
  val _events: atUifabricUtilitiesLib.libEventGroupMod.EventGroup = js.native
  /**
    * Controls whether the componentRef prop will be resolved by this component instance. If you are
    * implementing a passthrough (higher-order component), you would set this to false and pass through
    * the props to the inner component, allowing it to resolve the componentRef.
    */
  var _skipComponentRefResolution: scala.Boolean = js.native
  /**
    * Gets the object's class name.
    */
  val className: java.lang.String = js.native
  /**
    * Helper to return a memoized ref resolver function.
    * @param refName - Name of the member to assign the ref to.
    * @returns A function instance keyed from the given refname.
    * @deprecated Use `createRef` from React.createRef.
    */
  /* protected */ def _resolveRef(refName: java.lang.String): js.Function1[/* ref */ reactLib.reactMod.ReactNs.ReactNode, reactLib.reactMod.ReactNs.ReactNode] = js.native
  /* private */ def _setComponentRef[TRefInterface](ref: js.Any, value: js.Any): js.Any = js.native
  /**
    * Updates the componentRef (by calling it with "this" when necessary.)
    */
  /* protected */ def _updateComponentRef(currentProps: IBaseProps[_]): scala.Unit = js.native
  /* protected */ def _updateComponentRef(currentProps: IBaseProps[_], newProps: IBaseProps[_]): scala.Unit = js.native
  /**
    * Warns when props are required if a condition is met.
    *
    * @param requiredProps - The name of the props that are required when the condition is met.
    * @param conditionalPropName - The name of the prop that the condition is based on.
    * @param condition - Whether the condition is met.
    */
  /* protected */ def _warnConditionallyRequiredProps(
    requiredProps: js.Array[java.lang.String],
    conditionalPropName: java.lang.String,
    condition: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Warns when a deprecated props are being used.
    *
    * @param deprecationMap - The map of deprecations, where key is the prop name and the value is
    * either null or a replacement prop name.
    */
  /* protected */ def _warnDeprecations(deprecationMap: atUifabricUtilitiesLib.libWarnMod.ISettingsMap[TProps]): scala.Unit = js.native
  /**
    * Warns when props which are mutually exclusive with each other are both used.
    *
    * @param mutuallyExclusiveMap - The map of mutually exclusive props.
    */
  /* protected */ def _warnMutuallyExclusive(mutuallyExclusiveMap: atUifabricUtilitiesLib.libWarnMod.ISettingsMap[TProps]): scala.Unit = js.native
  /**
    * When the component has mounted, update the componentRef.
    */
  @JSName("componentDidMount")
  def componentDidMount_MBaseComponent(): scala.Unit = js.native
  /**
    * When the component receives props, make sure the componentRef is updated.
    */
  @JSName("componentDidUpdate")
  def componentDidUpdate_MBaseComponent(prevProps: TProps, prevState: TState): scala.Unit = js.native
  /**
    * If we have disposables, dispose them automatically on unmount.
    */
  @JSName("componentWillUnmount")
  def componentWillUnmount_MBaseComponent(): scala.Unit = js.native
}

/* static members */
@JSImport("@uifabric/utilities/lib/BaseComponent", "BaseComponent")
@js.native
object BaseComponent extends js.Object {
  /**
    * @deprecated Use React's error boundaries instead.
    */
  def onError(): scala.Unit = js.native
  def onError(errorMessage: java.lang.String): scala.Unit = js.native
  def onError(errorMessage: java.lang.String, ex: js.Any): scala.Unit = js.native
}

