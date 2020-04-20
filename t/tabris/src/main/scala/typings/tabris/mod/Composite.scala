package typings.tabris.mod

import org.scalablytyped.runtime.StringDictionary
import typings.tabris.Anon3
import typings.tabris.AnonLayout
import typings.tabris.OmitCompositeWidgetset
import typings.tabris.OmitWidgetsetAbsoluteBounds
import typings.tabris.tabrisStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "Composite")
@js.native
class Composite[ChildType /* <: Widget */] () extends Widget {
  def this(properties: Properties[Composite[Widget], OmitCompositeWidgetset[ChildType]]) = this()
  @JSName("$children")
  var $children: js.Array[Widget] = js.native
  var _layout: Layout = js.native
  /**
    * @constant
    */
  @JSName("jsxAttributes")
  val jsxAttributes_Composite: (JSXAttributes[this.type, Omit[this.type, set | typings.tabris.tabrisStrings.jsxAttributes]]) with Anon3[ChildType] = js.native
  /**
    * The layout manager responsible for interpreting the [`layoutData`](./Widget.md#layoutdata) of the
    * child widgets of this Composite.
    * @constant
    */
  var layout: Layout | Null = js.native
  /**
    * Fired when a child is added to this widget.
    */
  var onAddChild: Listeners[CompositeAddChildEvent[this.type]] = js.native
  /**
    * Fired when a child is removed from this widget.
    */
  var onRemoveChild: Listeners[CompositeRemoveChildEvent[this.type]] = js.native
  @JSName("$flushChildren")
  /* private */ def $flushChildren(): Unit = js.native
  /**
    * Called by the framework with each widget that is about to be added as a child of this composite. May
    * be overwritten to reject some or all children by returning `false`.
    * @param child
    */
  /* protected */ def _acceptChild(child: Widget): Boolean = js.native
  /**
    * Called by the framework with a child to be assigned to this composite. Triggers the 'addChild' event.
    * May be overwritten to run any code prior or after the child is inserted.
    * @param child
    * @param index
    */
  /* protected */ def _addChild(child: Widget): Unit = js.native
  /* protected */ def _addChild(child: Widget, index: Double): Unit = js.native
  /**
    * Identical to the `apply` method, but intended to be used by subclasses in case the `children` method
    * was overwritten . See `children` for details.
    * @param properties
    */
  /* protected */ def _apply(properties: StringDictionary[Properties[Widget, OmitWidgetsetAbsoluteBounds[ChildType]]]): this.type = js.native
  /**
    * Called by the framework with the layout about to be assigned to this composite. May be overwritten to
    * reject a layout by throwing an Error.
    * @param value
    */
  /* protected */ def _checkLayout(value: Layout): Unit = js.native
  /**
    * Identical to the `children` method, but intended to be used by subclasses in case the `children`
    * method was overwritten. See `children` for details.
    * @param selector A selector expression or a predicate function to filter the results.
    */
  /* protected */ def _children[Result /* <: ChildType */](): WidgetCollection[Result] = js.native
  /* protected */ def _children[Result /* <: ChildType */](selector: Selector[ChildType, Result]): WidgetCollection[Result] = js.native
  /**
    * Identical to the `find` method, but intended to be used by subclasses in case the `children` method
    * was overwritten. See `children` for details.
    * @param selector A selector expression or a predicate function to filter the results.
    */
  /* protected */ def _find[Result /* <: Widget */](): WidgetCollection[Result] = js.native
  /* protected */ def _find[Result /* <: Widget */](selector: Selector[Widget, Result]): WidgetCollection[Result] = js.native
  /**
    * Called with the constructor paramter (if any) to initialize the composite's layout manager. May be
    * overwritten to customize/replace the layout. The new implementation must make a super call to
    * initialize the layout.
    * @param props
    */
  /* protected */ def _initLayout(): Unit = js.native
  /* protected */ def _initLayout(props: AnonLayout): Unit = js.native
  /**
    * Called by the framework with a child to be removed from this composite. Triggers the 'removeChild'
    * event. May be overwritten to run any code prior or after the child is removed.
    * @param child
    */
  /* protected */ def _removeChild(child: Widget): Unit = js.native
  /* private */ def _scheduleRenderChildren(): Unit = js.native
  /**
    * Adds the given widgets to the composite.
    * @param widgets
    */
  def append(widgets: ChildType*): this.type = js.native
  /**
    * Adds all widgets in the given array to the composite.
    * @param widgets
    */
  def append(widgets: js.Array[ChildType]): this.type = js.native
  /**
    * Adds all widgets in the given collection to the composite.
    * @param widgets
    */
  def append(widgets: WidgetCollection[ChildType]): this.type = js.native
  /**
    * Applies the given properties to all descendants that match the associated selector(s).
    * If you wish to always exclude specific "internal" children from this, overwrite the `children` method
    * on their parent. See `children` for details.
    * @param properties
    */
  @JSName("apply")
  def apply(properties: StringDictionary[Properties[Widget, OmitWidgetsetAbsoluteBounds[ChildType]]]): this.type = js.native
  /**
    * Returns a (possibly empty) collection of all children of this widget that match the given selector.
    * When writing custom UI components it may be useful to overwrite this method to prevent access to the
    * internal children by external code. Doing so also affects `find` and `apply`, on this widget as well
    * as on all parents, thereby preventing accidental clashes of widget id or class values. See also
    * `_children`, `_find` and `_apply`.
    * @param selector A selector expression or a predicate function to filter the results.
    */
  def children[Result /* <: ChildType */](): WidgetCollection[Result] = js.native
  def children[Result /* <: ChildType */](selector: Selector[ChildType, Result]): WidgetCollection[Result] = js.native
  /**
    * Returns a collection containing all descendants of all widgets in this collection that match the
    * given selector.
    * If you wish to always exclude specific "internal" children from the result, overwrite the `children`
    * method on their parent. See `children` for details.
    * @param selector A selector expression or a predicate function to filter the results.
    */
  def find[Result /* <: ChildType */](): WidgetCollection[Result] = js.native
  def find[Result /* <: ChildType */](selector: Selector[Widget, Result]): WidgetCollection[Result] = js.native
}

