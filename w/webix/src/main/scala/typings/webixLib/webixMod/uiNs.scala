package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webix", "ui")
@js.native
object uiNs extends js.Object {
  trait WebixFilter extends js.Object {
    def getValue(node: stdLib.HTMLElement): js.Any
    def refresh(master: baseview, node: stdLib.HTMLElement, value: js.Any): scala.Unit
    def render(master: baseview, config: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String
    def setValue(node: stdLib.HTMLElement, value: js.Any): js.Any
  }
  
  @js.native
  class abslayout () extends baseview {
    @JSName("config")
    var config_abslayout: abslayoutConfig = js.native
    def addView(view: js.Any): java.lang.String | scala.Double = js.native
    def addView(view: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: abslayoutEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: abslayoutEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def index(obj: js.Any): scala.Double = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def reconstruct(): scala.Unit = js.native
    def removeView(id: js.Any): scala.Unit = js.native
    def resizeChildren(): scala.Unit = js.native
    def showBatch(name: java.lang.String): scala.Unit = js.native
    def showBatch(name: java.lang.String, mode: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait abslayoutConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var cells: js.UndefOr[js.Array[_]] = js.undefined
    var cols: js.UndefOr[js.Array[_]] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var responsive: js.UndefOr[java.lang.String] = js.undefined
    var rows: js.UndefOr[js.Array[_]] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var visibleBatch: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onDestruct
  */
  trait abslayoutEventName extends js.Object
  
  @js.native
  class accordion () extends baseview {
    @JSName("config")
    var config_accordion: accordionConfig = js.native
    def addView(view: js.Any): java.lang.String | scala.Double = js.native
    def addView(view: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: accordionEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: accordionEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def index(obj: js.Any): scala.Double = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def reconstruct(): scala.Unit = js.native
    def removeView(id: js.Any): scala.Unit = js.native
    def resizeChildren(): scala.Unit = js.native
    def restore(state: js.Any): scala.Unit = js.native
    def restore(state: js.Any, factory: webixLib.webixMod.WebixCallback): scala.Unit = js.native
    def serialize(): js.Any = js.native
    def serialize(serializer: webixLib.webixMod.WebixCallback): js.Any = js.native
    def showBatch(name: java.lang.String): scala.Unit = js.native
    def showBatch(name: java.lang.String, mode: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait accordionConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var collapsed: js.UndefOr[scala.Boolean] = js.undefined
    var cols: js.UndefOr[js.Array[_]] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var isolate: js.UndefOr[scala.Boolean] = js.undefined
    var margin: js.UndefOr[scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var multi: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var padding: js.UndefOr[scala.Double] = js.undefined
    var paddingX: js.UndefOr[scala.Double] = js.undefined
    var paddingY: js.UndefOr[scala.Double] = js.undefined
    var panelClass: js.UndefOr[java.lang.String] = js.undefined
    var responsive: js.UndefOr[java.lang.String] = js.undefined
    var rows: js.UndefOr[js.Array[_]] = js.undefined
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var visibleBatch: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterCollapse
    - webixLib.webixLibStrings.onAfterExpand
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onDestruct
  */
  trait accordionEventName extends js.Object
  
  @js.native
  class accordionitem () extends baseview {
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_accordionitem: accordionitemConfig = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var on_context: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    @JSName("on_dblclick")
    var on_dblclick_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("on_mouse_move")
    var on_mouse_move_Original: webixLib.webixMod.WebixCallback = js.native
    def attachEvent(`type`: accordionitemEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: accordionitemEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def collapse(): scala.Unit = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def expand(): scala.Unit = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def on_dblclick(args: js.Any*): js.Any = js.native
    def on_mouse_move(args: js.Any*): js.Any = js.native
    def refresh(): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait accordionitemConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var body: js.UndefOr[js.Any] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var collapsed: js.UndefOr[scala.Boolean] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var header: js.UndefOr[scala.Boolean | java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var headerAlt: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var headerAltHeight: js.UndefOr[scala.Double] = js.undefined
    var headerHeight: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var mouseEventDelay: js.UndefOr[scala.Double] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var onClick: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var onContext: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var onDblClick: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var onMouseMove: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterContextMenu
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBeforeContextMenu
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onItemDblClick
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onMouseMove
    - webixLib.webixLibStrings.onMouseMoving
    - webixLib.webixLibStrings.onMouseOut
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait accordionitemEventName extends js.Object
  
  @js.native
  class barcode () extends baseview {
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_barcode: barcodeConfig = js.native
    var types: js.Array[_] = js.native
    def getValue(): java.lang.String = js.native
    def render(): scala.Unit = js.native
    def setValue(value: java.lang.String): scala.Unit = js.native
  }
  
  trait barcodeConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var color: js.UndefOr[java.lang.String] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var paddingX: js.UndefOr[scala.Double] = js.undefined
    var paddingY: js.UndefOr[scala.Double] = js.undefined
    var textHeight: js.UndefOr[scala.Double] = js.undefined
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    var value: js.UndefOr[java.lang.String] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait barcodeEventName extends js.Object
  
  @js.native
  class baselayout () extends baseview {
    @JSName("config")
    var config_baselayout: baselayoutConfig = js.native
    def addView(view: js.Any): java.lang.String | scala.Double = js.native
    def addView(view: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: baselayoutEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: baselayoutEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def index(obj: js.Any): scala.Double = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def reconstruct(): scala.Unit = js.native
    def removeView(id: js.Any): scala.Unit = js.native
    def resizeChildren(): scala.Unit = js.native
    def restore(state: js.Any): scala.Unit = js.native
    def restore(state: js.Any, factory: webixLib.webixMod.WebixCallback): scala.Unit = js.native
    def serialize(): js.Any = js.native
    def serialize(serializer: webixLib.webixMod.WebixCallback): js.Any = js.native
    def showBatch(name: java.lang.String): scala.Unit = js.native
    def showBatch(name: java.lang.String, mode: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait baselayoutConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var cols: js.UndefOr[js.Array[_]] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var responsive: js.UndefOr[java.lang.String] = js.undefined
    var rows: js.UndefOr[js.Array[_]] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var visibleBatch: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onDestruct
  */
  trait baselayoutEventName extends js.Object
  
  @js.native
  trait baseview extends js.Object {
    @JSName("$height")
    var $height: scala.Double = js.native
    @JSName("$skin")
    var $skin_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$view")
    var $view: stdLib.HTMLElement = js.native
    @JSName("$width")
    var $width: scala.Double = js.native
    var config: baseviewConfig = js.native
    var name: java.lang.String = js.native
    @JSName("$getSize")
    def $getSize(): js.Array[_] = js.native
    @JSName("$setSize")
    def $setSize(x: scala.Double, y: scala.Double): scala.Boolean = js.native
    @JSName("$skin")
    def $skin(args: js.Any*): js.Any = js.native
    def adjust(): scala.Unit = js.native
    def bind(target: js.Any): scala.Unit = js.native
    def bind(target: js.Any, rule: webixLib.webixMod.WebixCallback): scala.Unit = js.native
    def bind(target: js.Any, rule: webixLib.webixMod.WebixCallback, format: java.lang.String): scala.Unit = js.native
    def define(property: java.lang.String, value: js.Any): scala.Unit = js.native
    def destructor(): scala.Unit = js.native
    def disable(): scala.Unit = js.native
    def enable(): scala.Unit = js.native
    def getChildViews(): js.Array[_] = js.native
    def getFormView(): baseview = js.native
    def getNode(): js.Any = js.native
    def getParentView(): js.Any = js.native
    def getTopParentView(): baseview = js.native
    def hide(): scala.Unit = js.native
    def isEnabled(): scala.Boolean = js.native
    def isVisible(): scala.Boolean = js.native
    def queryView(config: js.Any): js.Any = js.native
    def queryView(config: js.Any, mode: java.lang.String): js.Any = js.native
    def resize(): scala.Unit = js.native
    def show(): scala.Unit = js.native
    def show(force: scala.Boolean): scala.Unit = js.native
    def show(force: scala.Boolean, animation: scala.Boolean): scala.Unit = js.native
    def unbind(): scala.Unit = js.native
  }
  
  trait baseviewConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onDestruct
  */
  trait baseviewEventName extends js.Object
  
  @js.native
  class bullet () extends baseview {
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_bullet: bulletConfig = js.native
    def attachEvent(`type`: bulletEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: bulletEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def getValue(): scala.Double = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def setValue(new_value: scala.Double): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait bulletConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var bands: js.UndefOr[js.Array[_]] = js.undefined
    var barWidth: js.UndefOr[scala.Double] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var color: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var flowTime: js.UndefOr[scala.Double] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var label: js.UndefOr[java.lang.String] = js.undefined
    var labelHeight: js.UndefOr[scala.Double] = js.undefined
    var labelWidth: js.UndefOr[scala.Double] = js.undefined
    var layout: js.UndefOr[java.lang.String] = js.undefined
    var marker: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxRange: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minRange: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var placeholder: js.UndefOr[java.lang.String] = js.undefined
    var scale: js.UndefOr[js.Any] = js.undefined
    var smoothFlow: js.UndefOr[scala.Boolean] = js.undefined
    var stroke: js.UndefOr[scala.Double] = js.undefined
    var value: js.UndefOr[scala.Double] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait bulletEventName extends js.Object
  
  @js.native
  class button () extends baseview {
    @JSName("$compareValue")
    var $compareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$prepareValue")
    var $prepareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_button: buttonConfig = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var touchable: scala.Boolean = js.native
    @JSName("$compareValue")
    def $compareValue(args: js.Any*): js.Any = js.native
    @JSName("$getValue")
    def $getValue(): java.lang.String = js.native
    @JSName("$prepareValue")
    def $prepareValue(args: js.Any*): js.Any = js.native
    @JSName("$renderInput")
    def $renderInput(config: js.Any): stdLib.HTMLElement = js.native
    @JSName("$setValue")
    def $setValue(value: java.lang.String): scala.Unit = js.native
    def attachEvent(`type`: buttonEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: buttonEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def blur(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def focus(): scala.Unit = js.native
    def getInputNode(): stdLib.HTMLElement = js.native
    def getValue(): java.lang.String = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def refresh(): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def setValue(value: java.lang.String): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait buttonConfig extends js.Object {
    var align: js.UndefOr[java.lang.String] = js.undefined
    var animate: js.UndefOr[js.Any] = js.undefined
    var autowidth: js.UndefOr[scala.Boolean] = js.undefined
    var badge: js.UndefOr[scala.Double | java.lang.String] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var click: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var hotkey: js.UndefOr[java.lang.String] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var image: js.UndefOr[java.lang.String] = js.undefined
    var inputHeight: js.UndefOr[scala.Double] = js.undefined
    var inputWidth: js.UndefOr[scala.Double] = js.undefined
    var label: js.UndefOr[java.lang.String] = js.undefined
    var labelPosition: js.UndefOr[java.lang.String] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var name: js.UndefOr[java.lang.String] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var placeholder: js.UndefOr[java.lang.String] = js.undefined
    var popup: js.UndefOr[java.lang.String] = js.undefined
    var tooltip: js.UndefOr[java.lang.String] = js.undefined
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onChange
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait buttonEventName extends js.Object
  
  @js.native
  class calendar () extends baseview {
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_calendar: calendarConfig = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var on_context: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    @JSName("on_dblclick")
    var on_dblclick_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("on_mouse_move")
    var on_mouse_move_Original: webixLib.webixMod.WebixCallback = js.native
    def attachEvent(`type`: calendarEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: calendarEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def getSelectedDate(): js.Any = js.native
    def getValue(): js.Any = js.native
    def getVisibleDate(): js.Any = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def locate(e: stdLib.Event): java.lang.String | scala.Double = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def moveSelection(direction: java.lang.String): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def on_dblclick(args: js.Any*): js.Any = js.native
    def on_mouse_move(args: js.Any*): js.Any = js.native
    def refresh(): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def selectDate(date: java.lang.String, mode: scala.Boolean): scala.Unit = js.native
    def selectDate(date: webixLib.webixMod.Date, mode: scala.Boolean): scala.Unit = js.native
    def setValue(date: java.lang.String): scala.Unit = js.native
    def setValue(date: webixLib.webixMod.Date): scala.Unit = js.native
    def showCalendar(date: java.lang.String): scala.Unit = js.native
    def showCalendar(date: webixLib.webixMod.Date): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait calendarConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var blockDates: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var calendarHeader: js.UndefOr[java.lang.String] = js.undefined
    var calendarTime: js.UndefOr[java.lang.String] = js.undefined
    var calendarWeekHeader: js.UndefOr[java.lang.String] = js.undefined
    var cellHeight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var date: js.UndefOr[webixLib.webixMod.Date | java.lang.String] = js.undefined
    var dayTemplate: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var events: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var headerHeight: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var icons: js.UndefOr[js.Any] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var maxDate: js.UndefOr[webixLib.webixMod.Date | java.lang.String] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxTime: js.UndefOr[java.lang.String] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minDate: js.UndefOr[webixLib.webixMod.Date | java.lang.String] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minTime: js.UndefOr[java.lang.String] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var minuteStep: js.UndefOr[scala.Double] = js.undefined
    var monthSelect: js.UndefOr[scala.Boolean] = js.undefined
    var mouseEventDelay: js.UndefOr[scala.Double] = js.undefined
    var multiselect: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var navigation: js.UndefOr[scala.Boolean] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var onClick: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var onContext: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var onDblClick: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var onMouseMove: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var select: js.UndefOr[scala.Boolean] = js.undefined
    var skipEmptyWeeks: js.UndefOr[scala.Boolean] = js.undefined
    var timepicker: js.UndefOr[scala.Boolean] = js.undefined
    var timepickerHeight: js.UndefOr[scala.Double] = js.undefined
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var weekHeader: js.UndefOr[scala.Boolean] = js.undefined
    var weekNumber: js.UndefOr[scala.Boolean] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterContextMenu
    - webixLib.webixLibStrings.onAfterDateSelect
    - webixLib.webixLibStrings.onAfterMonthChange
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onAfterZoom
    - webixLib.webixLibStrings.onBeforeContextMenu
    - webixLib.webixLibStrings.onBeforeDateSelect
    - webixLib.webixLibStrings.onBeforeMonthChange
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBeforeZoom
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onChange
    - webixLib.webixLibStrings.onDateClear
    - webixLib.webixLibStrings.onDateSelect
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onItemDblClick
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onMouseMove
    - webixLib.webixLibStrings.onMouseMoving
    - webixLib.webixLibStrings.onMouseOut
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTodaySet
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait calendarEventName extends js.Object
  
  @js.native
  class carousel () extends baseview {
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_carousel: carouselConfig = js.native
    def addView(view: js.Any): java.lang.String | scala.Double = js.native
    def addView(view: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
    def adjustScroll(): scala.Unit = js.native
    def attachEvent(`type`: carouselEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: carouselEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def getActiveId(): java.lang.String = js.native
    def getActiveIndex(): scala.Double = js.native
    def getLayout(): js.Any = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def removeView(id: js.Any): scala.Unit = js.native
    def scrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
    def setActive(id: java.lang.String): scala.Unit = js.native
    def setActiveIndex(index: scala.Double): scala.Unit = js.native
    def showNext(): scala.Unit = js.native
    def showPrev(): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait carouselConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var cols: js.UndefOr[js.Array[_]] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var navigation: js.UndefOr[js.Any] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var rows: js.UndefOr[js.Array[_]] = js.undefined
    var scrollSpeed: js.UndefOr[java.lang.String] = js.undefined
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onShow
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait carouselEventName extends js.Object
  
  @js.native
  class chart () extends baseview {
    @JSName("$scope")
    var $scope: js.Any = js.native
    var colormap: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    @JSName("config")
    var config_chart: chartConfig = js.native
    var data: webixLib.webixMod.DataStore = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var on_context: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    @JSName("on_dblclick")
    var on_dblclick_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("on_mouse_move")
    var on_mouse_move_Original: webixLib.webixMod.WebixCallback = js.native
    var presets: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    var waitData: js.Promise[_] = js.native
    def add(obj: js.Any): java.lang.String | scala.Double = js.native
    def add(obj: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
    def addSeries(obj: js.Any): scala.Unit = js.native
    def attachEvent(`type`: chartEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: chartEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def clearAll(): scala.Unit = js.native
    def clearAll(soft: scala.Boolean): scala.Unit = js.native
    def clearCanvas(): scala.Unit = js.native
    def count(): scala.Double = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def exists(id: java.lang.String): scala.Boolean = js.native
    def exists(id: scala.Double): scala.Boolean = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate): scala.Unit = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate, value: java.lang.String): scala.Unit = js.native
    def filter(
      text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate,
      value: java.lang.String,
      preserve: scala.Boolean
    ): scala.Unit = js.native
    def filter(text: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def find(criterion: webixLib.webixMod.WebixCallback): js.Any = js.native
    def find(criterion: webixLib.webixMod.WebixCallback, first: scala.Boolean): js.Any = js.native
    def getFirstId(): java.lang.String | scala.Double = js.native
    def getIdByIndex(index: scala.Double): java.lang.String | scala.Double = js.native
    def getIndexById(id: java.lang.String): scala.Double = js.native
    def getIndexById(id: scala.Double): scala.Double = js.native
    def getItem(id: java.lang.String): js.Any = js.native
    def getItem(id: scala.Double): js.Any = js.native
    def getLastId(): java.lang.String | scala.Double = js.native
    def getNextId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getNextId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPrevId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPrevId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def group(config: js.Any, mode: scala.Boolean): scala.Unit = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def hideSeries(index: scala.Double): scala.Unit = js.native
    def load(url: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String, callback: webixLib.webixMod.WebixCallback): js.Promise[_] = js.native
    def loadNext(
      count: scala.Double,
      start: scala.Double,
      callback: webixLib.webixMod.WebixCallback,
      url: java.lang.String,
      now: scala.Boolean
    ): scala.Unit = js.native
    def locate(e: stdLib.Event): java.lang.String | scala.Double = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def on_dblclick(args: js.Any*): js.Any = js.native
    def on_mouse_move(args: js.Any*): js.Any = js.native
    def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def refresh(): scala.Unit = js.native
    def refresh(id: java.lang.String): scala.Unit = js.native
    def refresh(id: scala.Double): scala.Unit = js.native
    def remove(id: java.lang.String): scala.Unit = js.native
    def remove(id: scala.Double): scala.Unit = js.native
    def removeAllSeries(): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def serialize(): js.Array[_] = js.native
    def showSeries(index: scala.Double): scala.Unit = js.native
    def sort(by: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String, as: java.lang.String): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def ungroup(mode: scala.Boolean): scala.Unit = js.native
    def updateItem(id: java.lang.String, data: js.Any): scala.Unit = js.native
    def updateItem(id: scala.Double, data: js.Any): scala.Unit = js.native
  }
  
  trait chartConfig extends js.Object {
    var alpha: js.UndefOr[scala.Double] = js.undefined
    var animate: js.UndefOr[js.Any] = js.undefined
    var animateDuration: js.UndefOr[scala.Double] = js.undefined
    var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
    var barWidth: js.UndefOr[scala.Double] = js.undefined
    var border: js.UndefOr[scala.Boolean] = js.undefined
    var borderColor: js.UndefOr[java.lang.String] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var cant: js.UndefOr[scala.Double] = js.undefined
    var cellWidth: js.UndefOr[scala.Double] = js.undefined
    var color: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var data: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
    var datathrottle: js.UndefOr[scala.Double] = js.undefined
    var datatype: js.UndefOr[java.lang.String] = js.undefined
    var disableLines: js.UndefOr[scala.Boolean] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var dynamic: js.UndefOr[scala.Boolean] = js.undefined
    var eventRadius: js.UndefOr[scala.Double] = js.undefined
    var fill: js.UndefOr[java.lang.String] = js.undefined
    var fixOverflow: js.UndefOr[scala.Boolean] = js.undefined
    var gradient: js.UndefOr[scala.Boolean | java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var item: js.UndefOr[js.Any] = js.undefined
    var label: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var labelOffset: js.UndefOr[scala.Double] = js.undefined
    var legend: js.UndefOr[js.Any] = js.undefined
    var line: js.UndefOr[js.Any] = js.undefined
    var lineColor: js.UndefOr[java.lang.String] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var mouseEventDelay: js.UndefOr[scala.Double] = js.undefined
    var offset: js.UndefOr[scala.Boolean] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var onClick: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var onContext: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var onDblClick: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var onMouseMove: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var origin: js.UndefOr[scala.Double] = js.undefined
    var padding: js.UndefOr[js.Any] = js.undefined
    var pieHeight: js.UndefOr[scala.Double] = js.undefined
    var pieInnerText: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var preset: js.UndefOr[java.lang.String] = js.undefined
    var radius: js.UndefOr[scala.Double] = js.undefined
    var ready: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var removeMissed: js.UndefOr[scala.Boolean] = js.undefined
    var save: js.UndefOr[java.lang.String] = js.undefined
    var scale: js.UndefOr[java.lang.String] = js.undefined
    var scheme: js.UndefOr[js.Any] = js.undefined
    var series: js.UndefOr[js.Any] = js.undefined
    var shadow: js.UndefOr[scala.Boolean] = js.undefined
    var tooltip: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    var url: js.UndefOr[js.Any] = js.undefined
    var value: js.UndefOr[java.lang.String | webixLib.webixMod.WebixTemplate] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
    var x: js.UndefOr[scala.Double] = js.undefined
    var xAxis: js.UndefOr[js.Any] = js.undefined
    var xValue: js.UndefOr[java.lang.String] = js.undefined
    var y: js.UndefOr[scala.Double] = js.undefined
    var yAxis: js.UndefOr[js.Any] = js.undefined
    var yValue: js.UndefOr[java.lang.String] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterAdd
    - webixLib.webixLibStrings.onAfterContextMenu
    - webixLib.webixLibStrings.onAfterDelete
    - webixLib.webixLibStrings.onAfterLoad
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onAfterSort
    - webixLib.webixLibStrings.onBeforeAdd
    - webixLib.webixLibStrings.onBeforeContextMenu
    - webixLib.webixLibStrings.onBeforeDelete
    - webixLib.webixLibStrings.onBeforeLoad
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBeforeSort
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDataRequest
    - webixLib.webixLibStrings.onDataUpdate
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onItemDblClick
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLoadError
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onMouseMove
    - webixLib.webixLibStrings.onMouseMoving
    - webixLib.webixLibStrings.onMouseOut
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait chartEventName extends js.Object
  
  @js.native
  class checkbox () extends baseview {
    @JSName("$compareValue")
    var $compareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$prepareValue")
    var $prepareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$renderIcon")
    var $renderIcon_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$render")
    var $render_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_checkbox: checkboxConfig = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var touchable: scala.Boolean = js.native
    @JSName("$compareValue")
    def $compareValue(args: js.Any*): js.Any = js.native
    @JSName("$getValue")
    def $getValue(): java.lang.String = js.native
    @JSName("$prepareValue")
    def $prepareValue(args: js.Any*): js.Any = js.native
    @JSName("$render")
    def $render(args: js.Any*): js.Any = js.native
    @JSName("$renderIcon")
    def $renderIcon(args: js.Any*): js.Any = js.native
    @JSName("$renderInput")
    def $renderInput(obj: js.Any, html: java.lang.String, id: java.lang.String): java.lang.String = js.native
    @JSName("$renderInput")
    def $renderInput(obj: js.Any, html: java.lang.String, id: scala.Double): java.lang.String = js.native
    @JSName("$renderLabel")
    def $renderLabel(config: js.Any, id: java.lang.String): java.lang.String = js.native
    @JSName("$renderLabel")
    def $renderLabel(config: js.Any, id: scala.Double): java.lang.String = js.native
    @JSName("$setValue")
    def $setValue(value: java.lang.String): scala.Unit = js.native
    def attachEvent(`type`: checkboxEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: checkboxEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def blur(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def focus(): scala.Unit = js.native
    def getInputNode(): stdLib.HTMLElement = js.native
    def getValue(): java.lang.String = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def refresh(): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def setBottomText(text: java.lang.String): scala.Unit = js.native
    def setValue(value: java.lang.String): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def toggle(): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def validate(): scala.Boolean = js.native
  }
  
  trait checkboxConfig extends js.Object {
    var align: js.UndefOr[java.lang.String] = js.undefined
    var animate: js.UndefOr[js.Any] = js.undefined
    var attributes: js.UndefOr[js.Any] = js.undefined
    var autowidth: js.UndefOr[scala.Boolean] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var bottomLabel: js.UndefOr[java.lang.String] = js.undefined
    var bottomPadding: js.UndefOr[scala.Double] = js.undefined
    var checkValue: js.UndefOr[java.lang.String] = js.undefined
    var click: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var customCheckbox: js.UndefOr[scala.Boolean] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var format: js.UndefOr[js.Any] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var hotkey: js.UndefOr[java.lang.String] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var inputAlign: js.UndefOr[java.lang.String] = js.undefined
    var inputHeight: js.UndefOr[scala.Double] = js.undefined
    var inputPadding: js.UndefOr[scala.Double] = js.undefined
    var inputWidth: js.UndefOr[scala.Double] = js.undefined
    var invalidMessage: js.UndefOr[java.lang.String] = js.undefined
    var label: js.UndefOr[java.lang.String] = js.undefined
    var labelAlign: js.UndefOr[java.lang.String] = js.undefined
    var labelPosition: js.UndefOr[java.lang.String] = js.undefined
    var labelRight: js.UndefOr[java.lang.String] = js.undefined
    var labelWidth: js.UndefOr[scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var name: js.UndefOr[java.lang.String] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var popup: js.UndefOr[java.lang.String] = js.undefined
    var relatedAction: js.UndefOr[java.lang.String] = js.undefined
    var relatedView: js.UndefOr[java.lang.String] = js.undefined
    var required: js.UndefOr[scala.Boolean] = js.undefined
    var suggest: js.UndefOr[js.Any] = js.undefined
    var tooltip: js.UndefOr[java.lang.String] = js.undefined
    var uncheckValue: js.UndefOr[java.lang.String] = js.undefined
    var validate: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var validateEvent: js.UndefOr[java.lang.String] = js.undefined
    var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onChange
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait checkboxEventName extends js.Object
  
  @js.native
  class checksuggest () extends baseview {
    @JSName("$enterKey")
    var $enterKey_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_checksuggest: checksuggestConfig = js.native
    @JSName("$enterKey")
    def $enterKey(args: js.Any*): js.Any = js.native
    def attachEvent(`type`: checksuggestEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: checksuggestEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def close(): scala.Unit = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def getBody(): js.Any = js.native
    def getButton(): baseview = js.native
    def getHead(): js.Any = js.native
    def getItemId(text: java.lang.String): java.lang.String | scala.Double = js.native
    def getItemText(id: java.lang.String): java.lang.String = js.native
    def getItemText(id: scala.Double): java.lang.String = js.native
    def getList(): baseview = js.native
    def getMasterValue(): js.Any = js.native
    def getSuggestion(): java.lang.String = js.native
    def getValue(): java.lang.String | scala.Double = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def linkInput(input: stdLib.HTMLElement): scala.Unit = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def resizeChildren(): scala.Unit = js.native
    def setMasterValue(value: js.Any): scala.Unit = js.native
    def setPosition(x: scala.Double, y: scala.Double): scala.Unit = js.native
    def setValue(value: java.lang.String): scala.Unit = js.native
    def setValue(value: scala.Double): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait checksuggestConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var autofit: js.UndefOr[scala.Boolean] = js.undefined
    var autofocus: js.UndefOr[scala.Boolean] = js.undefined
    var body: js.UndefOr[java.lang.String | baseview] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var button: js.UndefOr[scala.Boolean] = js.undefined
    var buttonText: js.UndefOr[java.lang.String] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var data: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var filter: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var fitMaster: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var head: js.UndefOr[js.Any] = js.undefined
    var headHeight: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var input: js.UndefOr[stdLib.HTMLElement | java.lang.String] = js.undefined
    var keyPressTimeout: js.UndefOr[scala.Double] = js.undefined
    var left: js.UndefOr[scala.Double] = js.undefined
    var master: js.UndefOr[baseview] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var modal: js.UndefOr[scala.Boolean] = js.undefined
    var move: js.UndefOr[scala.Boolean] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var padding: js.UndefOr[js.Any] = js.undefined
    var point: js.UndefOr[scala.Boolean] = js.undefined
    var position: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var relative: js.UndefOr[java.lang.String] = js.undefined
    var resize: js.UndefOr[scala.Boolean] = js.undefined
    var selectAll: js.UndefOr[scala.Boolean] = js.undefined
    var separator: js.UndefOr[java.lang.String] = js.undefined
    var template: js.UndefOr[java.lang.String | webixLib.webixMod.WebixTemplate] = js.undefined
    var textValue: js.UndefOr[java.lang.String] = js.undefined
    var toFront: js.UndefOr[scala.Boolean] = js.undefined
    var top: js.UndefOr[scala.Double] = js.undefined
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    var url: js.UndefOr[java.lang.String] = js.undefined
    var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
    var zIndex: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBeforeShow
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onHide
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onShow
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onValueSuggest
    - webixLib.webixLibStrings.onViewMove
    - webixLib.webixLibStrings.onViewMoveEnd
    - webixLib.webixLibStrings.onViewResize
  */
  trait checksuggestEventName extends js.Object
  
  @js.native
  class colorboard () extends baseview {
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_colorboard: colorboardConfig = js.native
    @JSName("$setValue")
    def $setValue(value: java.lang.String): scala.Unit = js.native
    def attachEvent(`type`: colorboardEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: colorboardEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def getValue(): java.lang.String = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def moveSelection(direction: java.lang.String): scala.Unit = js.native
    def refresh(): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def setValue(value: java.lang.String): java.lang.String = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait colorboardConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var cols: js.UndefOr[scala.Double] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxLightness: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minLightness: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var navigation: js.UndefOr[scala.Boolean] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var palette: js.UndefOr[js.Array[_]] = js.undefined
    var rows: js.UndefOr[scala.Double] = js.undefined
    var template: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var value: js.UndefOr[java.lang.String] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onSelect
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait colorboardEventName extends js.Object
  
  @js.native
  class colorpicker () extends baseview {
    @JSName("$compareValue")
    var $compareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$prepareValue")
    var $prepareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$renderIcon")
    var $renderIcon_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$render")
    var $render_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_colorpicker: colorpickerConfig = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var touchable: scala.Boolean = js.native
    @JSName("$compareValue")
    def $compareValue(args: js.Any*): js.Any = js.native
    @JSName("$getValue")
    def $getValue(): java.lang.String = js.native
    @JSName("$prepareValue")
    def $prepareValue(args: js.Any*): js.Any = js.native
    @JSName("$render")
    def $render(args: js.Any*): js.Any = js.native
    @JSName("$renderIcon")
    def $renderIcon(args: js.Any*): js.Any = js.native
    @JSName("$renderInput")
    def $renderInput(obj: js.Any, html: java.lang.String, id: java.lang.String): java.lang.String = js.native
    @JSName("$renderInput")
    def $renderInput(obj: js.Any, html: java.lang.String, id: scala.Double): java.lang.String = js.native
    @JSName("$renderLabel")
    def $renderLabel(config: js.Any, id: java.lang.String): java.lang.String = js.native
    @JSName("$renderLabel")
    def $renderLabel(config: js.Any, id: scala.Double): java.lang.String = js.native
    @JSName("$setValue")
    def $setValue(value: java.lang.String): scala.Unit = js.native
    def attachEvent(`type`: colorpickerEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: colorpickerEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def blur(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def focus(): scala.Unit = js.native
    def getInputNode(): stdLib.HTMLElement = js.native
    def getPopup(): baseview = js.native
    def getText(): java.lang.String = js.native
    def getValue(): java.lang.String = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def refresh(): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def setBottomText(text: java.lang.String): scala.Unit = js.native
    def setValue(value: java.lang.String): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def validate(): scala.Boolean = js.native
  }
  
  trait colorpickerConfig extends js.Object {
    var align: js.UndefOr[java.lang.String] = js.undefined
    var animate: js.UndefOr[js.Any] = js.undefined
    var attributes: js.UndefOr[js.Any] = js.undefined
    var autowidth: js.UndefOr[scala.Boolean] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var bottomLabel: js.UndefOr[java.lang.String] = js.undefined
    var bottomPadding: js.UndefOr[scala.Double] = js.undefined
    var click: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var editable: js.UndefOr[scala.Boolean] = js.undefined
    var format: js.UndefOr[java.lang.String] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var hotkey: js.UndefOr[java.lang.String] = js.undefined
    var icons: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var inputAlign: js.UndefOr[java.lang.String] = js.undefined
    var inputHeight: js.UndefOr[scala.Double] = js.undefined
    var inputPadding: js.UndefOr[scala.Double] = js.undefined
    var inputWidth: js.UndefOr[scala.Double] = js.undefined
    var invalid: js.UndefOr[scala.Boolean] = js.undefined
    var invalidMessage: js.UndefOr[java.lang.String] = js.undefined
    var label: js.UndefOr[java.lang.String] = js.undefined
    var labelAlign: js.UndefOr[java.lang.String] = js.undefined
    var labelPosition: js.UndefOr[java.lang.String] = js.undefined
    var labelWidth: js.UndefOr[scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var name: js.UndefOr[java.lang.String] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var placeholder: js.UndefOr[java.lang.String] = js.undefined
    var popup: js.UndefOr[java.lang.String] = js.undefined
    var readonly: js.UndefOr[scala.Boolean] = js.undefined
    var relatedAction: js.UndefOr[java.lang.String] = js.undefined
    var relatedView: js.UndefOr[java.lang.String] = js.undefined
    var required: js.UndefOr[scala.Boolean] = js.undefined
    var stringResult: js.UndefOr[scala.Boolean] = js.undefined
    var suggest: js.UndefOr[js.Any] = js.undefined
    var timepicker: js.UndefOr[scala.Boolean] = js.undefined
    var tooltip: js.UndefOr[java.lang.String] = js.undefined
    var validate: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var validateEvent: js.UndefOr[java.lang.String] = js.undefined
    var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onChange
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait colorpickerEventName extends js.Object
  
  @js.native
  class combo () extends baseview {
    @JSName("$compareValue")
    var $compareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$prepareValue")
    var $prepareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$renderIcon")
    var $renderIcon_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$render")
    var $render_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_combo: comboConfig = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var touchable: scala.Boolean = js.native
    @JSName("$compareValue")
    def $compareValue(args: js.Any*): js.Any = js.native
    @JSName("$getValue")
    def $getValue(): java.lang.String = js.native
    @JSName("$prepareValue")
    def $prepareValue(args: js.Any*): js.Any = js.native
    @JSName("$render")
    def $render(args: js.Any*): js.Any = js.native
    @JSName("$renderIcon")
    def $renderIcon(args: js.Any*): js.Any = js.native
    @JSName("$renderInput")
    def $renderInput(obj: js.Any, html: java.lang.String, id: java.lang.String): java.lang.String = js.native
    @JSName("$renderInput")
    def $renderInput(obj: js.Any, html: java.lang.String, id: scala.Double): java.lang.String = js.native
    @JSName("$renderLabel")
    def $renderLabel(config: js.Any, id: java.lang.String): java.lang.String = js.native
    @JSName("$renderLabel")
    def $renderLabel(config: js.Any, id: scala.Double): java.lang.String = js.native
    @JSName("$setValue")
    def $setValue(value: java.lang.String): scala.Unit = js.native
    def attachEvent(`type`: comboEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: comboEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def blur(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def focus(): scala.Unit = js.native
    def getInputNode(): stdLib.HTMLElement = js.native
    def getList(): baseview = js.native
    def getPopup(): baseview = js.native
    def getText(): java.lang.String = js.native
    def getValue(): java.lang.String = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def refresh(): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def setBottomText(text: java.lang.String): scala.Unit = js.native
    def setValue(value: java.lang.String): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def validate(): scala.Boolean = js.native
  }
  
  trait comboConfig extends js.Object {
    var align: js.UndefOr[java.lang.String] = js.undefined
    var animate: js.UndefOr[js.Any] = js.undefined
    var attributes: js.UndefOr[js.Any] = js.undefined
    var autowidth: js.UndefOr[scala.Boolean] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var bottomLabel: js.UndefOr[java.lang.String] = js.undefined
    var bottomPadding: js.UndefOr[scala.Double] = js.undefined
    var click: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var editable: js.UndefOr[scala.Boolean] = js.undefined
    var format: js.UndefOr[js.Any] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var hotkey: js.UndefOr[java.lang.String] = js.undefined
    var icon: js.UndefOr[java.lang.String] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var inputAlign: js.UndefOr[java.lang.String] = js.undefined
    var inputHeight: js.UndefOr[scala.Double] = js.undefined
    var inputPadding: js.UndefOr[scala.Double] = js.undefined
    var inputWidth: js.UndefOr[scala.Double] = js.undefined
    var invalid: js.UndefOr[scala.Boolean] = js.undefined
    var invalidMessage: js.UndefOr[java.lang.String] = js.undefined
    var label: js.UndefOr[java.lang.String] = js.undefined
    var labelAlign: js.UndefOr[java.lang.String] = js.undefined
    var labelPosition: js.UndefOr[java.lang.String] = js.undefined
    var labelWidth: js.UndefOr[scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var name: js.UndefOr[java.lang.String] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var options: js.UndefOr[js.Any] = js.undefined
    var placeholder: js.UndefOr[java.lang.String] = js.undefined
    var popup: js.UndefOr[java.lang.String] = js.undefined
    var popupWidth: js.UndefOr[scala.Double] = js.undefined
    var readonly: js.UndefOr[scala.Boolean] = js.undefined
    var relatedAction: js.UndefOr[java.lang.String] = js.undefined
    var relatedView: js.UndefOr[java.lang.String] = js.undefined
    var required: js.UndefOr[scala.Boolean] = js.undefined
    var suggest: js.UndefOr[js.Any] = js.undefined
    var tooltip: js.UndefOr[java.lang.String] = js.undefined
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    var validate: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var validateEvent: js.UndefOr[java.lang.String] = js.undefined
    var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onChange
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait comboEventName extends js.Object
  
  @js.native
  class context () extends baseview {
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_context: contextConfig = js.native
    def attachEvent(`type`: contextEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: contextEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def attachTo(view: js.Any): scala.Unit = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def close(): scala.Unit = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def getBody(): js.Any = js.native
    def getContext(): js.Any = js.native
    def getHead(): js.Any = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def resizeChildren(): scala.Unit = js.native
    def setContext(context: js.Any): scala.Unit = js.native
    def setPosition(x: scala.Double, y: scala.Double): scala.Unit = js.native
    def show(node: stdLib.HTMLElement): scala.Unit = js.native
    def show(node: stdLib.HTMLElement, position: js.Any): scala.Unit = js.native
    def show(node: stdLib.HTMLElement, position: js.Any, point: java.lang.String): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait contextConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var autofit: js.UndefOr[scala.Boolean] = js.undefined
    var autofocus: js.UndefOr[scala.Boolean] = js.undefined
    var body: js.UndefOr[java.lang.String | baseview] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var head: js.UndefOr[js.Any] = js.undefined
    var headHeight: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var left: js.UndefOr[scala.Double] = js.undefined
    var master: js.UndefOr[java.lang.String] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var modal: js.UndefOr[scala.Boolean] = js.undefined
    var move: js.UndefOr[scala.Boolean] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var padding: js.UndefOr[js.Any] = js.undefined
    var point: js.UndefOr[scala.Boolean] = js.undefined
    var position: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var relative: js.UndefOr[java.lang.String] = js.undefined
    var resize: js.UndefOr[scala.Boolean] = js.undefined
    var toFront: js.UndefOr[scala.Boolean] = js.undefined
    var top: js.UndefOr[scala.Double] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
    var zIndex: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBeforeShow
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onHide
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onShow
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewMove
    - webixLib.webixLibStrings.onViewMoveEnd
    - webixLib.webixLibStrings.onViewResize
  */
  trait contextEventName extends js.Object
  
  @js.native
  class contextmenu () extends baseview {
    @JSName("$customPrint")
    var $customPrint_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$dragHTML")
    var $dragHTML_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$dropAllow")
    var $dropAllow_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_contextmenu: contextmenuConfig = js.native
    var data: webixLib.webixMod.DataStore = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var on_context: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    @JSName("on_dblclick")
    var on_dblclick_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("on_mouse_move")
    var on_mouse_move_Original: webixLib.webixMod.WebixCallback = js.native
    var `type`: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    var types: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    var waitData: js.Promise[_] = js.native
    @JSName("$customPrint")
    def $customPrint(args: js.Any*): js.Any = js.native
    @JSName("$drag")
    def $drag(source: stdLib.HTMLElement, ev: stdLib.Event): java.lang.String = js.native
    @JSName("$dragHTML")
    def $dragHTML(args: js.Any*): js.Any = js.native
    @JSName("$dragIn")
    def $dragIn(source: stdLib.HTMLElement, target: stdLib.HTMLElement, ev: stdLib.Event): stdLib.HTMLElement = js.native
    @JSName("$dragMark")
    def $dragMark(context: js.Any, ev: stdLib.Event): scala.Boolean = js.native
    @JSName("$dragOut")
    def $dragOut(
      source: stdLib.HTMLElement,
      old_target: stdLib.HTMLElement,
      new_target: stdLib.HTMLElement,
      ev: stdLib.Event
    ): scala.Unit = js.native
    @JSName("$drop")
    def $drop(source: stdLib.HTMLElement, target: stdLib.HTMLElement, ev: stdLib.Event): scala.Unit = js.native
    @JSName("$dropAllow")
    def $dropAllow(args: js.Any*): js.Any = js.native
    def add(obj: js.Any): java.lang.String | scala.Double = js.native
    def add(obj: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
    def addCss(id: java.lang.String, css: java.lang.String): scala.Unit = js.native
    def addCss(id: java.lang.String, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def addCss(id: scala.Double, css: java.lang.String): scala.Unit = js.native
    def addCss(id: scala.Double, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def attachEvent(`type`: contextmenuEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: contextmenuEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def attachTo(view: js.Any): scala.Unit = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def clearAll(): scala.Unit = js.native
    def clearAll(soft: scala.Boolean): scala.Unit = js.native
    def clearCss(css: java.lang.String): scala.Unit = js.native
    def clearCss(css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def clearValidation(): scala.Unit = js.native
    def close(): scala.Unit = js.native
    def copy(sid: java.lang.String, tindex: scala.Double): scala.Unit = js.native
    def copy(sid: java.lang.String, tindex: scala.Double, tobj: js.Any): scala.Unit = js.native
    def copy(sid: java.lang.String, tindex: scala.Double, tobj: js.Any, details: js.Any): scala.Unit = js.native
    def copy(sid: scala.Double, tindex: scala.Double): scala.Unit = js.native
    def copy(sid: scala.Double, tindex: scala.Double, tobj: js.Any): scala.Unit = js.native
    def copy(sid: scala.Double, tindex: scala.Double, tobj: js.Any, details: js.Any): scala.Unit = js.native
    def count(): scala.Double = js.native
    def customize(obj: js.Any): scala.Unit = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def disableItem(id: java.lang.String): scala.Unit = js.native
    def disableItem(id: scala.Double): scala.Unit = js.native
    def enableItem(id: java.lang.String): scala.Unit = js.native
    def enableItem(id: scala.Double): scala.Unit = js.native
    def exists(id: java.lang.String): scala.Boolean = js.native
    def exists(id: scala.Double): scala.Boolean = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate): scala.Unit = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate, value: java.lang.String): scala.Unit = js.native
    def filter(
      text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate,
      value: java.lang.String,
      preserve: scala.Boolean
    ): scala.Unit = js.native
    def filter(text: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def find(criterion: webixLib.webixMod.WebixCallback): js.Any = js.native
    def find(criterion: webixLib.webixMod.WebixCallback, first: scala.Boolean): js.Any = js.native
    def getBody(): js.Any = js.native
    def getContext(): js.Any = js.native
    def getFirstId(): java.lang.String | scala.Double = js.native
    def getHead(): js.Any = js.native
    def getIdByIndex(index: scala.Double): java.lang.String | scala.Double = js.native
    def getIndexById(id: java.lang.String): scala.Double = js.native
    def getIndexById(id: scala.Double): scala.Double = js.native
    def getItem(id: java.lang.String): js.Any = js.native
    def getItem(id: scala.Double): js.Any = js.native
    def getItemNode(id: java.lang.String): stdLib.HTMLElement = js.native
    def getItemNode(id: scala.Double): stdLib.HTMLElement = js.native
    def getLastId(): java.lang.String | scala.Double = js.native
    def getMenu(id: java.lang.String): js.Any = js.native
    def getMenu(id: scala.Double): js.Any = js.native
    def getMenuItem(id: java.lang.String): js.Any = js.native
    def getMenuItem(id: scala.Double): js.Any = js.native
    def getNextId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getNextId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPage(): scala.Double = js.native
    def getPager(): js.Any = js.native
    def getPrevId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPrevId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def getScrollState(): js.Any = js.native
    def getSelectedId(as_array: scala.Boolean): java.lang.String | js.Array[_] = js.native
    def getSelectedItem(as_array: scala.Boolean): js.Any = js.native
    def getSubMenu(id: java.lang.String): js.Any = js.native
    def getSubMenu(id: scala.Double): js.Any = js.native
    def getTopMenu(): js.Any = js.native
    def getVisibleCount(): scala.Double = js.native
    def hasCss(id: java.lang.String, css: java.lang.String): scala.Boolean = js.native
    def hasCss(id: scala.Double, css: java.lang.String): scala.Boolean = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def hideItem(id: java.lang.String): scala.Unit = js.native
    def hideItem(id: scala.Double): scala.Unit = js.native
    def isSelected(id: java.lang.String): scala.Boolean = js.native
    def isSelected(id: scala.Double): scala.Boolean = js.native
    def load(url: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String, callback: webixLib.webixMod.WebixCallback): js.Promise[_] = js.native
    def loadNext(
      count: scala.Double,
      start: scala.Double,
      callback: webixLib.webixMod.WebixCallback,
      url: java.lang.String,
      now: scala.Boolean
    ): scala.Unit = js.native
    def locate(e: stdLib.Event): java.lang.String | scala.Double = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def move(sid: java.lang.String, tindex: scala.Double): java.lang.String = js.native
    def move(sid: java.lang.String, tindex: scala.Double, tobj: js.Any): java.lang.String = js.native
    def move(sid: java.lang.String, tindex: scala.Double, tobj: js.Any, details: js.Any): java.lang.String = js.native
    def moveBottom(id: java.lang.String): scala.Unit = js.native
    def moveBottom(id: scala.Double): scala.Unit = js.native
    def moveDown(id: java.lang.String, step: scala.Double): scala.Unit = js.native
    def moveDown(id: scala.Double, step: scala.Double): scala.Unit = js.native
    def moveSelection(direction: java.lang.String): scala.Unit = js.native
    def moveTop(id: java.lang.String): scala.Unit = js.native
    def moveTop(id: scala.Double): scala.Unit = js.native
    def moveUp(id: java.lang.String, step: scala.Double): scala.Unit = js.native
    def moveUp(id: scala.Double, step: scala.Double): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def on_dblclick(args: js.Any*): js.Any = js.native
    def on_mouse_move(args: js.Any*): js.Any = js.native
    def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def refresh(): scala.Unit = js.native
    def refresh(id: java.lang.String): scala.Unit = js.native
    def refresh(id: scala.Double): scala.Unit = js.native
    def remove(id: java.lang.String): scala.Unit = js.native
    def remove(id: scala.Double): scala.Unit = js.native
    def removeCss(id: java.lang.String, css: java.lang.String): scala.Unit = js.native
    def removeCss(id: java.lang.String, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def removeCss(id: scala.Double, css: java.lang.String): scala.Unit = js.native
    def removeCss(id: scala.Double, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def resizeChildren(): scala.Unit = js.native
    def scrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
    def select(id: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def select(id: js.Array[_], preserve: scala.Boolean): scala.Unit = js.native
    def selectAll(): scala.Unit = js.native
    def selectAll(from: java.lang.String): scala.Unit = js.native
    def selectAll(from: java.lang.String, to: java.lang.String): scala.Unit = js.native
    def serialize(): js.Array[_] = js.native
    def setContext(context: js.Any): scala.Unit = js.native
    def setPage(page: scala.Double): scala.Unit = js.native
    def setPosition(x: scala.Double, y: scala.Double): scala.Unit = js.native
    def show(node: stdLib.HTMLElement): scala.Unit = js.native
    def show(node: stdLib.HTMLElement, position: js.Any): scala.Unit = js.native
    def show(node: stdLib.HTMLElement, position: js.Any, point: java.lang.String): scala.Unit = js.native
    def showItem(id: java.lang.String): scala.Unit = js.native
    def showItem(id: scala.Double): scala.Unit = js.native
    def sizeToContent(): scala.Unit = js.native
    def sort(by: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String, as: java.lang.String): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def unselect(): scala.Unit = js.native
    def unselect(id: java.lang.String): scala.Unit = js.native
    def unselectAll(): scala.Unit = js.native
    def updateItem(id: java.lang.String, data: js.Any): scala.Unit = js.native
    def updateItem(id: scala.Double, data: js.Any): scala.Unit = js.native
    def validate(): scala.Boolean = js.native
    def validate(id: java.lang.String): scala.Boolean = js.native
  }
  
  trait contextmenuConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var autofit: js.UndefOr[scala.Boolean] = js.undefined
    var autofocus: js.UndefOr[scala.Boolean] = js.undefined
    var autoheight: js.UndefOr[scala.Boolean] = js.undefined
    var autowidth: js.UndefOr[scala.Boolean] = js.undefined
    var body: js.UndefOr[java.lang.String | baseview] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var click: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var clipboard: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var data: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
    var dataFeed: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var datafetch: js.UndefOr[scala.Double] = js.undefined
    var datathrottle: js.UndefOr[scala.Double] = js.undefined
    var datatype: js.UndefOr[java.lang.String] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var drag: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var dragscroll: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var dynamic: js.UndefOr[scala.Boolean] = js.undefined
    var externalData: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var head: js.UndefOr[js.Any] = js.undefined
    var headHeight: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var item: js.UndefOr[js.Any] = js.undefined
    var layout: js.UndefOr[java.lang.String] = js.undefined
    var left: js.UndefOr[scala.Double] = js.undefined
    var master: js.UndefOr[java.lang.String] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var modal: js.UndefOr[scala.Boolean] = js.undefined
    var mouseEventDelay: js.UndefOr[scala.Double] = js.undefined
    var move: js.UndefOr[scala.Boolean] = js.undefined
    var multiselect: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
    var navigation: js.UndefOr[scala.Boolean] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var onClick: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var onContext: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var onDblClick: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var onMouseMove: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var openAction: js.UndefOr[java.lang.String] = js.undefined
    var padding: js.UndefOr[js.Any] = js.undefined
    var pager: js.UndefOr[js.Any] = js.undefined
    var point: js.UndefOr[scala.Boolean] = js.undefined
    var position: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var ready: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var relative: js.UndefOr[java.lang.String] = js.undefined
    var removeMissed: js.UndefOr[scala.Boolean] = js.undefined
    var resize: js.UndefOr[scala.Boolean] = js.undefined
    var rules: js.UndefOr[js.Any] = js.undefined
    var save: js.UndefOr[java.lang.String] = js.undefined
    var scheme: js.UndefOr[js.Any] = js.undefined
    var scroll: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var scrollSpeed: js.UndefOr[java.lang.String] = js.undefined
    var select: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var subMenuPos: js.UndefOr[java.lang.String] = js.undefined
    var submenuConfig: js.UndefOr[js.Any] = js.undefined
    var template: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var templateCopy: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var toFront: js.UndefOr[scala.Boolean] = js.undefined
    var tooltip: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
    var top: js.UndefOr[scala.Double] = js.undefined
    var `type`: js.UndefOr[js.Any] = js.undefined
    var url: js.UndefOr[js.Any] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
    var xCount: js.UndefOr[scala.Double] = js.undefined
    var yCount: js.UndefOr[scala.Double] = js.undefined
    var zIndex: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterAdd
    - webixLib.webixLibStrings.onAfterContextMenu
    - webixLib.webixLibStrings.onAfterDelete
    - webixLib.webixLibStrings.onAfterDrop
    - webixLib.webixLibStrings.onAfterDropOrder
    - webixLib.webixLibStrings.onAfterLoad
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onAfterSelect
    - webixLib.webixLibStrings.onAfterSort
    - webixLib.webixLibStrings.onBeforeAdd
    - webixLib.webixLibStrings.onBeforeContextMenu
    - webixLib.webixLibStrings.onBeforeDelete
    - webixLib.webixLibStrings.onBeforeDrag
    - webixLib.webixLibStrings.onBeforeDragIn
    - webixLib.webixLibStrings.onBeforeDrop
    - webixLib.webixLibStrings.onBeforeDropOrder
    - webixLib.webixLibStrings.onBeforeDropOut
    - webixLib.webixLibStrings.onBeforeLoad
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBeforeSelect
    - webixLib.webixLibStrings.onBeforeShow
    - webixLib.webixLibStrings.onBeforeSort
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDataRequest
    - webixLib.webixLibStrings.onDataUpdate
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onDragOut
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onHide
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onItemDblClick
    - webixLib.webixLibStrings.onItemRender
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLoadError
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onMenuItemClick
    - webixLib.webixLibStrings.onMouseMove
    - webixLib.webixLibStrings.onMouseMoving
    - webixLib.webixLibStrings.onMouseOut
    - webixLib.webixLibStrings.onPaste
    - webixLib.webixLibStrings.onSelectChange
    - webixLib.webixLibStrings.onShow
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onValidationError
    - webixLib.webixLibStrings.onValidationSuccess
    - webixLib.webixLibStrings.onViewMove
    - webixLib.webixLibStrings.onViewMoveEnd
    - webixLib.webixLibStrings.onViewResize
  */
  trait contextmenuEventName extends js.Object
  
  @js.native
  class counter () extends baseview {
    @JSName("$compareValue")
    var $compareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$prepareValue")
    var $prepareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$renderIcon")
    var $renderIcon_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$render")
    var $render_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_counter: counterConfig = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var touchable: scala.Boolean = js.native
    @JSName("$compareValue")
    def $compareValue(args: js.Any*): js.Any = js.native
    @JSName("$getValue")
    def $getValue(): java.lang.String = js.native
    @JSName("$prepareValue")
    def $prepareValue(args: js.Any*): js.Any = js.native
    @JSName("$render")
    def $render(args: js.Any*): js.Any = js.native
    @JSName("$renderIcon")
    def $renderIcon(args: js.Any*): js.Any = js.native
    @JSName("$renderInput")
    def $renderInput(obj: js.Any, html: java.lang.String, id: java.lang.String): java.lang.String = js.native
    @JSName("$renderInput")
    def $renderInput(obj: js.Any, html: java.lang.String, id: scala.Double): java.lang.String = js.native
    @JSName("$renderLabel")
    def $renderLabel(config: js.Any, id: java.lang.String): java.lang.String = js.native
    @JSName("$renderLabel")
    def $renderLabel(config: js.Any, id: scala.Double): java.lang.String = js.native
    @JSName("$setValue")
    def $setValue(value: java.lang.String): scala.Unit = js.native
    def attachEvent(`type`: counterEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: counterEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def blur(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def focus(): scala.Unit = js.native
    def getInputNode(): stdLib.HTMLElement = js.native
    def getValue(): scala.Double = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def next(): scala.Unit = js.native
    def next(step: scala.Double): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def prev(): scala.Unit = js.native
    def prev(step: scala.Double): scala.Unit = js.native
    def refresh(): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def setBottomText(text: java.lang.String): scala.Unit = js.native
    def setValue(value: scala.Double): scala.Unit = js.native
    def shift(): scala.Unit = js.native
    def shift(value: scala.Double): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def validate(): scala.Boolean = js.native
  }
  
  trait counterConfig extends js.Object {
    var align: js.UndefOr[java.lang.String] = js.undefined
    var animate: js.UndefOr[js.Any] = js.undefined
    var attributes: js.UndefOr[js.Any] = js.undefined
    var autowidth: js.UndefOr[scala.Boolean] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var bottomLabel: js.UndefOr[java.lang.String] = js.undefined
    var bottomPadding: js.UndefOr[scala.Double] = js.undefined
    var click: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var format: js.UndefOr[js.Any] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var hotkey: js.UndefOr[java.lang.String] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var inputAlign: js.UndefOr[java.lang.String] = js.undefined
    var inputHeight: js.UndefOr[scala.Double] = js.undefined
    var inputPadding: js.UndefOr[scala.Double] = js.undefined
    var inputWidth: js.UndefOr[scala.Double] = js.undefined
    var invalidMessage: js.UndefOr[java.lang.String] = js.undefined
    var label: js.UndefOr[java.lang.String] = js.undefined
    var labelAlign: js.UndefOr[java.lang.String] = js.undefined
    var labelPosition: js.UndefOr[java.lang.String] = js.undefined
    var labelWidth: js.UndefOr[scala.Double] = js.undefined
    var max: js.UndefOr[scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var min: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var name: js.UndefOr[java.lang.String] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var popup: js.UndefOr[java.lang.String] = js.undefined
    var relatedAction: js.UndefOr[java.lang.String] = js.undefined
    var relatedView: js.UndefOr[java.lang.String] = js.undefined
    var required: js.UndefOr[scala.Boolean] = js.undefined
    var step: js.UndefOr[scala.Double] = js.undefined
    var suggest: js.UndefOr[js.Any] = js.undefined
    var tooltip: js.UndefOr[java.lang.String] = js.undefined
    var validate: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var validateEvent: js.UndefOr[java.lang.String] = js.undefined
    var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onChange
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait counterEventName extends js.Object
  
  @js.native
  class dashboard () extends baseview {
    @JSName("$dragPos")
    var $dragPos_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("config")
    var config_dashboard: dashboardConfig = js.native
    @JSName("$dragCreate")
    def $dragCreate(source: stdLib.HTMLElement, event: stdLib.Event): stdLib.HTMLElement = js.native
    @JSName("$dragDestroy")
    def $dragDestroy(target: stdLib.HTMLElement, html: stdLib.HTMLElement, e: stdLib.Event): scala.Unit = js.native
    @JSName("$dragIn")
    def $dragIn(source: stdLib.HTMLElement, target: stdLib.HTMLElement, ev: stdLib.Event): stdLib.HTMLElement = js.native
    @JSName("$dragOut")
    def $dragOut(
      source: stdLib.HTMLElement,
      old_target: stdLib.HTMLElement,
      new_target: stdLib.HTMLElement,
      ev: stdLib.Event
    ): scala.Unit = js.native
    @JSName("$dragPos")
    def $dragPos(args: js.Any*): js.Any = js.native
    @JSName("$drop")
    def $drop(source: stdLib.HTMLElement, target: stdLib.HTMLElement, ev: stdLib.Event): scala.Unit = js.native
    def addView(view: js.Any): java.lang.String | scala.Double = js.native
    def addView(view: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: dashboardEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: dashboardEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def clearAll(): scala.Unit = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def index(obj: js.Any): scala.Double = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def moveView(id: java.lang.String, view: js.Any): scala.Unit = js.native
    def moveView(id: scala.Double, view: js.Any): scala.Unit = js.native
    def reconstruct(): scala.Unit = js.native
    def removeView(id: js.Any): scala.Unit = js.native
    def resizeChildren(): scala.Unit = js.native
    def restore(state: js.Any): scala.Unit = js.native
    def restore(state: js.Any, factory: webixLib.webixMod.WebixCallback): scala.Unit = js.native
    def serialize(): js.Array[_] = js.native
    def serialize(serializer: webixLib.webixMod.WebixCallback): js.Array[_] = js.native
    def showBatch(name: java.lang.String): scala.Unit = js.native
    def showBatch(name: java.lang.String, mode: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait dashboardConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var cellHeight: js.UndefOr[scala.Double] = js.undefined
    var cellWidth: js.UndefOr[scala.Double] = js.undefined
    var cells: js.UndefOr[js.Array[_]] = js.undefined
    var cols: js.UndefOr[js.Array[_]] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var factory: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var gridColumns: js.UndefOr[scala.Double] = js.undefined
    var gridRows: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var margin: js.UndefOr[scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var padding: js.UndefOr[scala.Double] = js.undefined
    var paddingX: js.UndefOr[scala.Double] = js.undefined
    var paddingY: js.UndefOr[scala.Double] = js.undefined
    var responsive: js.UndefOr[java.lang.String] = js.undefined
    var rows: js.UndefOr[js.Array[_]] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var visibleBatch: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onChange
    - webixLib.webixLibStrings.onDestruct
  */
  trait dashboardEventName extends js.Object
  
  @js.native
  class datalayout () extends baseview {
    @JSName("config")
    var config_datalayout: datalayoutConfig = js.native
    var data: webixLib.webixMod.DataStore = js.native
    var waitData: js.Promise[_] = js.native
    def add(obj: js.Any): java.lang.String | scala.Double = js.native
    def add(obj: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
    def addView(view: js.Any): java.lang.String | scala.Double = js.native
    def addView(view: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: datalayoutEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: datalayoutEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def clearAll(): scala.Unit = js.native
    def clearAll(soft: scala.Boolean): scala.Unit = js.native
    def count(): scala.Double = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def exists(id: java.lang.String): scala.Boolean = js.native
    def exists(id: scala.Double): scala.Boolean = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate): scala.Unit = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate, value: java.lang.String): scala.Unit = js.native
    def filter(
      text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate,
      value: java.lang.String,
      preserve: scala.Boolean
    ): scala.Unit = js.native
    def filter(text: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def find(criterion: webixLib.webixMod.WebixCallback): js.Any = js.native
    def find(criterion: webixLib.webixMod.WebixCallback, first: scala.Boolean): js.Any = js.native
    def getFirstId(): java.lang.String | scala.Double = js.native
    def getIdByIndex(index: scala.Double): java.lang.String | scala.Double = js.native
    def getIndexById(id: java.lang.String): scala.Double = js.native
    def getIndexById(id: scala.Double): scala.Double = js.native
    def getItem(id: java.lang.String): js.Any = js.native
    def getItem(id: scala.Double): js.Any = js.native
    def getLastId(): java.lang.String | scala.Double = js.native
    def getNextId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getNextId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPrevId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPrevId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def getValue(): js.Array[_] = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def index(obj: js.Any): scala.Double = js.native
    def load(url: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String, callback: webixLib.webixMod.WebixCallback): js.Promise[_] = js.native
    def loadNext(
      count: scala.Double,
      start: scala.Double,
      callback: webixLib.webixMod.WebixCallback,
      url: java.lang.String,
      now: scala.Boolean
    ): scala.Unit = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def reconstruct(): scala.Unit = js.native
    def refresh(): scala.Unit = js.native
    def refresh(id: java.lang.String): scala.Unit = js.native
    def refresh(id: scala.Double): scala.Unit = js.native
    def remove(id: java.lang.String): scala.Unit = js.native
    def remove(id: scala.Double): scala.Unit = js.native
    def removeView(id: js.Any): scala.Unit = js.native
    def render(id: java.lang.String, obj: js.Any, mode: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, obj: js.Any, mode: java.lang.String): scala.Unit = js.native
    def resizeChildren(): scala.Unit = js.native
    def setValue(values: js.Array[_]): scala.Unit = js.native
    def showBatch(name: java.lang.String): scala.Unit = js.native
    def showBatch(name: java.lang.String, mode: scala.Boolean): scala.Unit = js.native
    def sort(by: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String, as: java.lang.String): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def updateItem(id: java.lang.String, data: js.Any): scala.Unit = js.native
    def updateItem(id: scala.Double, data: js.Any): scala.Unit = js.native
  }
  
  trait datalayoutConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var cols: js.UndefOr[js.Array[_]] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var data: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
    var datathrottle: js.UndefOr[scala.Double] = js.undefined
    var datatype: js.UndefOr[java.lang.String] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var isolate: js.UndefOr[scala.Boolean] = js.undefined
    var margin: js.UndefOr[scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var padding: js.UndefOr[scala.Double] = js.undefined
    var paddingX: js.UndefOr[scala.Double] = js.undefined
    var paddingY: js.UndefOr[scala.Double] = js.undefined
    var ready: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var removeMissed: js.UndefOr[scala.Boolean] = js.undefined
    var responsive: js.UndefOr[java.lang.String] = js.undefined
    var rows: js.UndefOr[js.Array[_]] = js.undefined
    var save: js.UndefOr[java.lang.String] = js.undefined
    var scheme: js.UndefOr[js.Any] = js.undefined
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    var url: js.UndefOr[js.Any] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var visibleBatch: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterAdd
    - webixLib.webixLibStrings.onAfterDelete
    - webixLib.webixLibStrings.onAfterLoad
    - webixLib.webixLibStrings.onAfterSort
    - webixLib.webixLibStrings.onBeforeAdd
    - webixLib.webixLibStrings.onBeforeDelete
    - webixLib.webixLibStrings.onBeforeLoad
    - webixLib.webixLibStrings.onBeforeSort
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onDataRequest
    - webixLib.webixLibStrings.onDataUpdate
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onLoadError
  */
  trait datalayoutEventName extends js.Object
  
  @js.native
  class datasuggest () extends baseview {
    @JSName("$enterKey")
    var $enterKey_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_datasuggest: datasuggestConfig = js.native
    @JSName("$enterKey")
    def $enterKey(args: js.Any*): js.Any = js.native
    def attachEvent(`type`: datasuggestEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: datasuggestEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def close(): scala.Unit = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def getBody(): js.Any = js.native
    def getHead(): js.Any = js.native
    def getItemId(text: java.lang.String): java.lang.String | scala.Double = js.native
    def getItemText(id: java.lang.String): java.lang.String = js.native
    def getItemText(id: scala.Double): java.lang.String = js.native
    def getList(): baseview = js.native
    def getMasterValue(): js.Any = js.native
    def getSuggestion(): java.lang.String = js.native
    def getValue(): java.lang.String | scala.Double = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def linkInput(input: stdLib.HTMLElement): scala.Unit = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def resizeChildren(): scala.Unit = js.native
    def setMasterValue(value: js.Any): scala.Unit = js.native
    def setPosition(x: scala.Double, y: scala.Double): scala.Unit = js.native
    def setValue(value: java.lang.String): scala.Unit = js.native
    def setValue(value: scala.Double): scala.Unit = js.native
    def show(node: stdLib.HTMLElement): scala.Unit = js.native
    def show(node: stdLib.HTMLElement, position: js.Any): scala.Unit = js.native
    def show(node: stdLib.HTMLElement, position: js.Any, point: java.lang.String): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait datasuggestConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var autofit: js.UndefOr[scala.Boolean] = js.undefined
    var autofocus: js.UndefOr[scala.Boolean] = js.undefined
    var body: js.UndefOr[java.lang.String | baseview] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var data: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var filter: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var fitMaster: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var head: js.UndefOr[js.Any] = js.undefined
    var headHeight: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var input: js.UndefOr[stdLib.HTMLElement | java.lang.String] = js.undefined
    var keyPressTimeout: js.UndefOr[scala.Double] = js.undefined
    var left: js.UndefOr[scala.Double] = js.undefined
    var master: js.UndefOr[baseview] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var modal: js.UndefOr[scala.Boolean] = js.undefined
    var move: js.UndefOr[scala.Boolean] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var padding: js.UndefOr[js.Any] = js.undefined
    var point: js.UndefOr[scala.Boolean] = js.undefined
    var position: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var relative: js.UndefOr[java.lang.String] = js.undefined
    var resize: js.UndefOr[scala.Boolean] = js.undefined
    var template: js.UndefOr[java.lang.String | webixLib.webixMod.WebixTemplate] = js.undefined
    var textValue: js.UndefOr[java.lang.String] = js.undefined
    var toFront: js.UndefOr[scala.Boolean] = js.undefined
    var top: js.UndefOr[scala.Double] = js.undefined
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    var url: js.UndefOr[java.lang.String] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
    var zIndex: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBeforeShow
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onHide
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onShow
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onValueSuggest
    - webixLib.webixLibStrings.onViewMove
    - webixLib.webixLibStrings.onViewMoveEnd
    - webixLib.webixLibStrings.onViewResize
  */
  trait datasuggestEventName extends js.Object
  
  @js.native
  class datatable () extends baseview {
    @JSName("$customPrint")
    var $customPrint_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$dragHTML")
    var $dragHTML_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$dropAllow")
    var $dropAllow_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("$touch")
    var $touch_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("config")
    var config_datatable: datatableConfig = js.native
    var data: webixLib.webixMod.DataStore = js.native
    var headerContent: js.Any = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var on_context: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    @JSName("on_dblclick")
    var on_dblclick_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("on_mouse_move")
    var on_mouse_move_Original: webixLib.webixMod.WebixCallback = js.native
    var waitData: js.Promise[_] = js.native
    @JSName("$customPrint")
    def $customPrint(args: js.Any*): js.Any = js.native
    @JSName("$drag")
    def $drag(source: stdLib.HTMLElement, ev: stdLib.Event): java.lang.String = js.native
    @JSName("$dragHTML")
    def $dragHTML(args: js.Any*): js.Any = js.native
    @JSName("$dragIn")
    def $dragIn(source: stdLib.HTMLElement, target: stdLib.HTMLElement, ev: stdLib.Event): stdLib.HTMLElement = js.native
    @JSName("$dragMark")
    def $dragMark(context: js.Any, ev: stdLib.Event): scala.Boolean = js.native
    @JSName("$dragOut")
    def $dragOut(
      source: stdLib.HTMLElement,
      old_target: stdLib.HTMLElement,
      new_target: stdLib.HTMLElement,
      ev: stdLib.Event
    ): scala.Unit = js.native
    @JSName("$drop")
    def $drop(source: stdLib.HTMLElement, target: stdLib.HTMLElement, ev: stdLib.Event): scala.Unit = js.native
    @JSName("$dropAllow")
    def $dropAllow(args: js.Any*): js.Any = js.native
    @JSName("$touch")
    def $touch(args: js.Any*): js.Any = js.native
    def add(obj: js.Any): java.lang.String | scala.Double = js.native
    def add(obj: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
    def addCellCss(id: java.lang.String, name: java.lang.String, css: java.lang.String): scala.Unit = js.native
    def addCss(id: java.lang.String, css: java.lang.String): scala.Unit = js.native
    def addCss(id: java.lang.String, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def addCss(id: scala.Double, css: java.lang.String): scala.Unit = js.native
    def addCss(id: scala.Double, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def addRowCss(id: java.lang.String, css: java.lang.String): scala.Unit = js.native
    def addSelectArea(start: js.Any, end: js.Any, preserve: scala.Boolean): scala.Unit = js.native
    def addSelectArea(start: js.Any, end: js.Any, preserve: scala.Boolean, area_name: java.lang.String): scala.Unit = js.native
    def addSelectArea(
      start: js.Any,
      end: js.Any,
      preserve: scala.Boolean,
      area_name: java.lang.String,
      css: java.lang.String
    ): scala.Unit = js.native
    def addSelectArea(
      start: js.Any,
      end: js.Any,
      preserve: scala.Boolean,
      area_name: java.lang.String,
      css: java.lang.String,
      handle: scala.Boolean
    ): scala.Unit = js.native
    def addSpan(id: js.Any, column: java.lang.String, width: scala.Double, height: scala.Double): scala.Unit = js.native
    def addSpan(
      id: js.Any,
      column: java.lang.String,
      width: scala.Double,
      height: scala.Double,
      value: java.lang.String
    ): scala.Unit = js.native
    def addSpan(
      id: js.Any,
      column: java.lang.String,
      width: scala.Double,
      height: scala.Double,
      value: java.lang.String,
      css: java.lang.String
    ): scala.Unit = js.native
    def adjustColumn(id: java.lang.String): scala.Unit = js.native
    def adjustColumn(id: java.lang.String, mode: java.lang.String): scala.Unit = js.native
    def adjustColumn(id: scala.Double): scala.Unit = js.native
    def adjustColumn(id: scala.Double, mode: java.lang.String): scala.Unit = js.native
    def adjustRowHeight(): scala.Unit = js.native
    def adjustRowHeight(columnId: java.lang.String): scala.Unit = js.native
    def adjustRowHeight(columnId: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def attachEvent(`type`: datatableEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: datatableEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def clearAll(): scala.Unit = js.native
    def clearAll(soft: scala.Boolean): scala.Unit = js.native
    def clearCss(css: java.lang.String): scala.Unit = js.native
    def clearCss(css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def clearSelection(): scala.Unit = js.native
    def clearValidation(): scala.Unit = js.native
    def closeSub(id: java.lang.String): scala.Unit = js.native
    def closeSub(id: scala.Double): scala.Unit = js.native
    def collectValues(id: java.lang.String): js.Array[_] = js.native
    def collectValues(id: scala.Double): js.Array[_] = js.native
    def columnId(index: scala.Double): java.lang.String | scala.Double = js.native
    def copy(sid: java.lang.String, tindex: scala.Double): scala.Unit = js.native
    def copy(sid: java.lang.String, tindex: scala.Double, tobj: js.Any): scala.Unit = js.native
    def copy(sid: java.lang.String, tindex: scala.Double, tobj: js.Any, details: js.Any): scala.Unit = js.native
    def copy(sid: scala.Double, tindex: scala.Double): scala.Unit = js.native
    def copy(sid: scala.Double, tindex: scala.Double, tobj: js.Any): scala.Unit = js.native
    def copy(sid: scala.Double, tindex: scala.Double, tobj: js.Any, details: js.Any): scala.Unit = js.native
    def count(): scala.Double = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def eachColumn(handler: webixLib.webixMod.WebixCallback): scala.Unit = js.native
    def eachColumn(handler: webixLib.webixMod.WebixCallback, all: scala.Boolean): scala.Unit = js.native
    def eachRow(handler: webixLib.webixMod.WebixCallback): scala.Unit = js.native
    def eachRow(handler: webixLib.webixMod.WebixCallback, all: scala.Boolean): scala.Unit = js.native
    def edit(id: js.Any): scala.Unit = js.native
    def editCancel(): scala.Unit = js.native
    def editCell(row: java.lang.String, col: java.lang.String): scala.Unit = js.native
    def editCell(row: java.lang.String, col: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def editCell(row: java.lang.String, col: java.lang.String, preserve: scala.Boolean, show: scala.Boolean): scala.Unit = js.native
    def editCell(row: java.lang.String, col: scala.Double): scala.Unit = js.native
    def editCell(row: java.lang.String, col: scala.Double, preserve: scala.Boolean): scala.Unit = js.native
    def editCell(row: java.lang.String, col: scala.Double, preserve: scala.Boolean, show: scala.Boolean): scala.Unit = js.native
    def editCell(row: scala.Double, col: java.lang.String): scala.Unit = js.native
    def editCell(row: scala.Double, col: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def editCell(row: scala.Double, col: java.lang.String, preserve: scala.Boolean, show: scala.Boolean): scala.Unit = js.native
    def editCell(row: scala.Double, col: scala.Double): scala.Unit = js.native
    def editCell(row: scala.Double, col: scala.Double, preserve: scala.Boolean): scala.Unit = js.native
    def editCell(row: scala.Double, col: scala.Double, preserve: scala.Boolean, show: scala.Boolean): scala.Unit = js.native
    def editColumn(id: java.lang.String): scala.Unit = js.native
    def editNext(): scala.Unit = js.native
    def editRow(id: java.lang.String): scala.Unit = js.native
    def editStop(): scala.Unit = js.native
    def exists(id: java.lang.String): scala.Boolean = js.native
    def exists(id: scala.Double): scala.Boolean = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate): scala.Unit = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate, value: java.lang.String): scala.Unit = js.native
    def filter(
      text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate,
      value: java.lang.String,
      preserve: scala.Boolean
    ): scala.Unit = js.native
    def filter(text: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def filterByAll(): scala.Unit = js.native
    def find(criterion: webixLib.webixMod.WebixCallback): js.Any = js.native
    def find(criterion: webixLib.webixMod.WebixCallback, first: scala.Boolean): js.Any = js.native
    def focusEditor(id: js.Any): scala.Unit = js.native
    def freezeRow(id: java.lang.String, state: scala.Boolean): scala.Unit = js.native
    def freezeRow(id: scala.Double, state: scala.Boolean): scala.Unit = js.native
    def getAllSelectAreas(): js.Any = js.native
    def getColumnConfig(id: java.lang.String): js.Any = js.native
    def getColumnIndex(id: java.lang.String): scala.Double = js.native
    def getColumnIndex(id: scala.Double): scala.Double = js.native
    def getCss(rowId: java.lang.String, columnId: java.lang.String): java.lang.String = js.native
    def getCss(rowId: java.lang.String, columnId: scala.Double): java.lang.String = js.native
    def getCss(rowId: scala.Double, columnId: java.lang.String): java.lang.String = js.native
    def getCss(rowId: scala.Double, columnId: scala.Double): java.lang.String = js.native
    def getEditState(): js.Any = js.native
    def getEditor(): js.Any = js.native
    def getEditor(row: js.Any): js.Any = js.native
    def getEditor(row: js.Any, column: java.lang.String): js.Any = js.native
    def getEditor(row: js.Any, column: scala.Double): js.Any = js.native
    def getEditorValue(): java.lang.String = js.native
    def getFilter(columnID: java.lang.String): js.Any = js.native
    def getFilter(columnID: scala.Double): js.Any = js.native
    def getFirstId(): java.lang.String | scala.Double = js.native
    def getFooterNode(columnId: java.lang.String): stdLib.HTMLElement = js.native
    def getFooterNode(columnId: java.lang.String, rowIndex: scala.Double): stdLib.HTMLElement = js.native
    def getHeaderContent(id: java.lang.String): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    def getHeaderContent(id: scala.Double): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    def getHeaderNode(columnId: java.lang.String): stdLib.HTMLElement = js.native
    def getHeaderNode(columnId: java.lang.String, rowIndex: scala.Double): stdLib.HTMLElement = js.native
    def getIdByIndex(index: scala.Double): java.lang.String | scala.Double = js.native
    def getIndexById(id: java.lang.String): scala.Double = js.native
    def getIndexById(id: scala.Double): scala.Double = js.native
    def getItem(id: java.lang.String): js.Any = js.native
    def getItem(id: scala.Double): js.Any = js.native
    def getItemNode(id: java.lang.String): stdLib.HTMLElement = js.native
    def getItemNode(id: scala.Double): stdLib.HTMLElement = js.native
    def getLastId(): java.lang.String | scala.Double = js.native
    def getNextId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getNextId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPage(): scala.Double = js.native
    def getPager(): js.Any = js.native
    def getPrevId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPrevId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def getScrollState(): js.Any = js.native
    def getSelectArea(area_name: java.lang.String): js.Any = js.native
    def getSelectedId(asArray: scala.Boolean, asString: scala.Boolean): js.Any = js.native
    def getSelectedItem(): js.Any = js.native
    def getSelectedItem(as_array: scala.Boolean): js.Any = js.native
    def getSpan(): js.Array[_] = js.native
    def getSpanNode(id: js.Any): stdLib.HTMLElement = js.native
    def getState(): js.Any = js.native
    def getSubView(id: java.lang.String): js.Any = js.native
    def getSubView(id: scala.Double): js.Any = js.native
    def getText(rowid: java.lang.String, colid: java.lang.String): java.lang.String = js.native
    def getText(rowid: java.lang.String, colid: scala.Double): java.lang.String = js.native
    def getText(rowid: scala.Double, colid: java.lang.String): java.lang.String = js.native
    def getText(rowid: scala.Double, colid: scala.Double): java.lang.String = js.native
    def getVisibleCount(): scala.Double = js.native
    def group(config: js.Any, mode: scala.Boolean): scala.Unit = js.native
    def hasCss(id: java.lang.String, css: java.lang.String): scala.Boolean = js.native
    def hasCss(id: scala.Double, css: java.lang.String): scala.Boolean = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def hideColumn(id: java.lang.String): scala.Unit = js.native
    def hideColumn(id: java.lang.String, options: js.Any): scala.Unit = js.native
    def hideColumn(id: java.lang.String, options: js.Any, silent: scala.Boolean): scala.Unit = js.native
    def hideColumn(id: java.lang.String, options: js.Any, silent: scala.Boolean, mode: scala.Boolean): scala.Unit = js.native
    def hideColumn(id: scala.Double): scala.Unit = js.native
    def hideColumn(id: scala.Double, options: js.Any): scala.Unit = js.native
    def hideColumn(id: scala.Double, options: js.Any, silent: scala.Boolean): scala.Unit = js.native
    def hideColumn(id: scala.Double, options: js.Any, silent: scala.Boolean, mode: scala.Boolean): scala.Unit = js.native
    def hideOverlay(): scala.Unit = js.native
    def isColumnVisible(id: java.lang.String): scala.Boolean = js.native
    def isColumnVisible(id: scala.Double): scala.Boolean = js.native
    def isSelected(id: java.lang.String): scala.Unit = js.native
    def isSelected(id: scala.Double): scala.Unit = js.native
    def load(url: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String, callback: webixLib.webixMod.WebixCallback): js.Promise[_] = js.native
    def loadNext(
      count: scala.Double,
      start: scala.Double,
      callback: webixLib.webixMod.WebixCallback,
      url: java.lang.String,
      now: scala.Boolean
    ): scala.Unit = js.native
    def locate(node: stdLib.Event): js.Any = js.native
    def locate(node: stdLib.HTMLElement): js.Any = js.native
    def mapCells(
      startrow: scala.Double,
      startcol: java.lang.String,
      numrows: scala.Double,
      numcols: scala.Double,
      callback: webixLib.webixMod.WebixCallback
    ): scala.Unit = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def mapSelection(callback: webixLib.webixMod.WebixCallback): scala.Unit = js.native
    def markSorting(column_id: java.lang.String, direction: java.lang.String): scala.Unit = js.native
    def move(sid: java.lang.String, tindex: scala.Double): java.lang.String = js.native
    def move(sid: java.lang.String, tindex: scala.Double, tobj: js.Any): java.lang.String = js.native
    def move(sid: java.lang.String, tindex: scala.Double, tobj: js.Any, details: js.Any): java.lang.String = js.native
    def moveBottom(id: java.lang.String): scala.Unit = js.native
    def moveBottom(id: scala.Double): scala.Unit = js.native
    def moveColumn(id: java.lang.String, index: scala.Double): scala.Unit = js.native
    def moveDown(id: java.lang.String, step: scala.Double): scala.Unit = js.native
    def moveDown(id: scala.Double, step: scala.Double): scala.Unit = js.native
    def moveSelection(direction: java.lang.String): scala.Unit = js.native
    def moveTop(id: java.lang.String): scala.Unit = js.native
    def moveTop(id: scala.Double): scala.Unit = js.native
    def moveUp(id: java.lang.String, step: scala.Double): scala.Unit = js.native
    def moveUp(id: scala.Double, step: scala.Double): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def on_dblclick(args: js.Any*): js.Any = js.native
    def on_mouse_move(args: js.Any*): js.Any = js.native
    def openSub(id: java.lang.String): scala.Unit = js.native
    def openSub(id: scala.Double): scala.Unit = js.native
    def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def refresh(): scala.Unit = js.native
    def refresh(id: java.lang.String): scala.Unit = js.native
    def refresh(id: scala.Double): scala.Unit = js.native
    def refreshColumns(): scala.Unit = js.native
    def refreshColumns(config: js.Array[_]): scala.Unit = js.native
    def refreshColumns(config: js.Array[_], reset: scala.Boolean): scala.Unit = js.native
    def refreshFilter(id: java.lang.String): scala.Unit = js.native
    def refreshFilter(id: scala.Double): scala.Unit = js.native
    def refreshSelectArea(): scala.Unit = js.native
    def registerFilter(`object`: js.Any, config: js.Any, controller: js.Any): scala.Unit = js.native
    def remove(id: java.lang.String): scala.Unit = js.native
    def remove(id: scala.Double): scala.Unit = js.native
    def removeCellCss(id: java.lang.String, name: java.lang.String, css_name: java.lang.String): scala.Unit = js.native
    def removeCss(id: java.lang.String, css: java.lang.String): scala.Unit = js.native
    def removeCss(id: java.lang.String, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def removeCss(id: scala.Double, css: java.lang.String): scala.Unit = js.native
    def removeCss(id: scala.Double, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def removeRowCss(id: java.lang.String, css_name: java.lang.String): scala.Unit = js.native
    def removeSelectArea(area_name: java.lang.String): scala.Unit = js.native
    def removeSpan(id: java.lang.String, column: java.lang.String): scala.Unit = js.native
    def removeSpan(id: scala.Double, column: java.lang.String): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, operation: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, operation: java.lang.String): scala.Unit = js.native
    def resizeSubView(id: java.lang.String): scala.Unit = js.native
    def resizeSubView(id: scala.Double): scala.Unit = js.native
    def scrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
    def select(row_id: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def select(row_id: scala.Double, preserve: scala.Boolean): scala.Unit = js.native
    def selectAll(): scala.Unit = js.native
    def selectRange(row_id: java.lang.String, end_row_id: java.lang.String): scala.Unit = js.native
    def selectRange(row_id: java.lang.String, end_row_id: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def selectRange(row_id: java.lang.String, end_row_id: scala.Double): scala.Unit = js.native
    def selectRange(row_id: java.lang.String, end_row_id: scala.Double, preserve: scala.Boolean): scala.Unit = js.native
    def selectRange(row_id: scala.Double, end_row_id: java.lang.String): scala.Unit = js.native
    def selectRange(row_id: scala.Double, end_row_id: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def selectRange(row_id: scala.Double, end_row_id: scala.Double): scala.Unit = js.native
    def selectRange(row_id: scala.Double, end_row_id: scala.Double, preserve: scala.Boolean): scala.Unit = js.native
    def serialize(): js.Array[_] = js.native
    def setColumnWidth(id: java.lang.String, width: scala.Double): scala.Unit = js.native
    def setColumnWidth(id: scala.Double, width: scala.Double): scala.Unit = js.native
    def setPage(page: scala.Double): scala.Unit = js.native
    def setRowHeight(id: java.lang.String, height: scala.Double): scala.Unit = js.native
    def setRowHeight(id: scala.Double, height: scala.Double): scala.Unit = js.native
    def setState(state: js.Any): scala.Unit = js.native
    def showCell(row: java.lang.String, column: java.lang.String): scala.Unit = js.native
    def showColumn(id: java.lang.String): scala.Unit = js.native
    def showColumn(id: scala.Double): scala.Unit = js.native
    def showColumnBatch(batch: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def showColumnBatch(batch: scala.Double, preserve: scala.Boolean): scala.Unit = js.native
    def showItem(id: java.lang.String): scala.Unit = js.native
    def showItem(id: scala.Double): scala.Unit = js.native
    def showItemByIndex(index: scala.Double): scala.Unit = js.native
    def showOverlay(message: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String, as: java.lang.String): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def ungroup(mode: scala.Boolean): scala.Unit = js.native
    def unselect(row_id: java.lang.String): scala.Unit = js.native
    def unselect(row_id: scala.Double): scala.Unit = js.native
    def unselectAll(): scala.Unit = js.native
    def updateItem(id: java.lang.String, data: js.Any): scala.Unit = js.native
    def updateItem(id: scala.Double, data: js.Any): scala.Unit = js.native
    def validate(): scala.Boolean = js.native
    def validate(id: java.lang.String): scala.Boolean = js.native
    def validateEditor(): scala.Boolean = js.native
    def validateEditor(id: java.lang.String): scala.Boolean = js.native
    def validateEditor(id: scala.Double): scala.Boolean = js.native
  }
  
  trait datatableConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var areaselect: js.UndefOr[scala.Boolean] = js.undefined
    var autoConfig: js.UndefOr[scala.Boolean] = js.undefined
    var autoheight: js.UndefOr[scala.Boolean] = js.undefined
    var autowidth: js.UndefOr[scala.Boolean] = js.undefined
    var blockselect: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var checkboxRefresh: js.UndefOr[scala.Boolean] = js.undefined
    var clipboard: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var columnWidth: js.UndefOr[scala.Double] = js.undefined
    var columns: js.UndefOr[js.Array[_]] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var data: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
    var dataFeed: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var datafetch: js.UndefOr[scala.Double] = js.undefined
    var datathrottle: js.UndefOr[scala.Double] = js.undefined
    var datatype: js.UndefOr[java.lang.String] = js.undefined
    var delimiter: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var drag: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var dragColumn: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var dragscroll: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var editMath: js.UndefOr[scala.Boolean] = js.undefined
    var editValue: js.UndefOr[java.lang.String] = js.undefined
    var editable: js.UndefOr[scala.Boolean] = js.undefined
    var editaction: js.UndefOr[java.lang.String] = js.undefined
    var externalData: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var filterMode: js.UndefOr[js.Any] = js.undefined
    var fixedRowHeight: js.UndefOr[scala.Boolean] = js.undefined
    var footer: js.UndefOr[scala.Boolean] = js.undefined
    var form: js.UndefOr[java.lang.String] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var header: js.UndefOr[scala.Boolean] = js.undefined
    var headerRowHeight: js.UndefOr[scala.Double] = js.undefined
    var headermenu: js.UndefOr[js.Any] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var hover: js.UndefOr[java.lang.String] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var leftSplit: js.UndefOr[scala.Double] = js.undefined
    var liveValidation: js.UndefOr[scala.Boolean] = js.undefined
    var loadahead: js.UndefOr[scala.Double] = js.undefined
    var map: js.UndefOr[js.Any] = js.undefined
    var math: js.UndefOr[scala.Boolean] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minColumnHeight: js.UndefOr[scala.Double] = js.undefined
    var minColumnWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var mouseEventDelay: js.UndefOr[scala.Double] = js.undefined
    var multiselect: js.UndefOr[scala.Boolean] = js.undefined
    var navigation: js.UndefOr[scala.Boolean] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var onClick: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var onContext: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var onDblClick: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var onMouseMove: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var pager: js.UndefOr[js.Any] = js.undefined
    var prerender: js.UndefOr[scala.Boolean] = js.undefined
    var ready: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var removeMissed: js.UndefOr[scala.Boolean] = js.undefined
    var resizeColumn: js.UndefOr[js.Any] = js.undefined
    var resizeRow: js.UndefOr[scala.Boolean] = js.undefined
    var rightSplit: js.UndefOr[scala.Double] = js.undefined
    var rowHeight: js.UndefOr[scala.Double] = js.undefined
    var rowLineHeight: js.UndefOr[scala.Double] = js.undefined
    var rules: js.UndefOr[js.Any] = js.undefined
    var save: js.UndefOr[java.lang.String] = js.undefined
    var scheme: js.UndefOr[js.Any] = js.undefined
    var scroll: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var scrollAlignY: js.UndefOr[scala.Boolean] = js.undefined
    var scrollX: js.UndefOr[scala.Boolean] = js.undefined
    var scrollY: js.UndefOr[scala.Boolean] = js.undefined
    var select: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var spans: js.UndefOr[js.Array[_]] = js.undefined
    var subRowHeight: js.UndefOr[java.lang.String] = js.undefined
    var subrow: js.UndefOr[java.lang.String] = js.undefined
    var subview: js.UndefOr[baseview | webixLib.webixMod.WebixCallback] = js.undefined
    var templateCopy: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var tooltip: js.UndefOr[scala.Boolean] = js.undefined
    var topSplit: js.UndefOr[scala.Double] = js.undefined
    var `type`: js.UndefOr[js.Any] = js.undefined
    var url: js.UndefOr[js.Any] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
    var yCount: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterAdd
    - webixLib.webixLibStrings.onAfterAreaAdd
    - webixLib.webixLibStrings.onAfterAreaRemove
    - webixLib.webixLibStrings.onAfterBlockSelect
    - webixLib.webixLibStrings.onAfterColumnDrop
    - webixLib.webixLibStrings.onAfterColumnDropOrder
    - webixLib.webixLibStrings.onAfterColumnHide
    - webixLib.webixLibStrings.onAfterColumnShow
    - webixLib.webixLibStrings.onAfterContextMenu
    - webixLib.webixLibStrings.onAfterDelete
    - webixLib.webixLibStrings.onAfterDrop
    - webixLib.webixLibStrings.onAfterDropOrder
    - webixLib.webixLibStrings.onAfterEditStart
    - webixLib.webixLibStrings.onAfterEditStop
    - webixLib.webixLibStrings.onAfterFilter
    - webixLib.webixLibStrings.onAfterLoad
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onAfterSelect
    - webixLib.webixLibStrings.onAfterSort
    - webixLib.webixLibStrings.onAfterUnSelect
    - webixLib.webixLibStrings.onAreaDrag
    - webixLib.webixLibStrings.onBeforeAdd
    - webixLib.webixLibStrings.onBeforeAreaAdd
    - webixLib.webixLibStrings.onBeforeAreaRemove
    - webixLib.webixLibStrings.onBeforeBlockSelect
    - webixLib.webixLibStrings.onBeforeColumnDrag
    - webixLib.webixLibStrings.onBeforeColumnDrop
    - webixLib.webixLibStrings.onBeforeColumnDropOrder
    - webixLib.webixLibStrings.onBeforeColumnHide
    - webixLib.webixLibStrings.onBeforeColumnShow
    - webixLib.webixLibStrings.onBeforeContextMenu
    - webixLib.webixLibStrings.onBeforeDelete
    - webixLib.webixLibStrings.onBeforeDrag
    - webixLib.webixLibStrings.onBeforeDragIn
    - webixLib.webixLibStrings.onBeforeDrop
    - webixLib.webixLibStrings.onBeforeDropOrder
    - webixLib.webixLibStrings.onBeforeDropOut
    - webixLib.webixLibStrings.onBeforeEditStart
    - webixLib.webixLibStrings.onBeforeEditStop
    - webixLib.webixLibStrings.onBeforeFilter
    - webixLib.webixLibStrings.onBeforeLoad
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBeforeSelect
    - webixLib.webixLibStrings.onBeforeSort
    - webixLib.webixLibStrings.onBeforeUnSelect
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onCheck
    - webixLib.webixLibStrings.onCollectValues
    - webixLib.webixLibStrings.onColumnResize
    - webixLib.webixLibStrings.onDataRequest
    - webixLib.webixLibStrings.onDataUpdate
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onDragOut
    - webixLib.webixLibStrings.onEditorChange
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onHeaderClick
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onItemDblClick
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLiveEdit
    - webixLib.webixLibStrings.onLoadError
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onMouseMove
    - webixLib.webixLibStrings.onMouseMoving
    - webixLib.webixLibStrings.onMouseOut
    - webixLib.webixLibStrings.onPaste
    - webixLib.webixLibStrings.onResize
    - webixLib.webixLibStrings.onRowResize
    - webixLib.webixLibStrings.onScrollX
    - webixLib.webixLibStrings.onScrollY
    - webixLib.webixLibStrings.onSelectChange
    - webixLib.webixLibStrings.onStructureLoad
    - webixLib.webixLibStrings.onStructureUpdate
    - webixLib.webixLibStrings.onSubViewClose
    - webixLib.webixLibStrings.onSubViewCreate
    - webixLib.webixLibStrings.onSubViewOpen
    - webixLib.webixLibStrings.onSubViewRender
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onValidationError
    - webixLib.webixLibStrings.onValidationSuccess
    - webixLib.webixLibStrings.onViewResize
  */
  trait datatableEventName extends js.Object
  
  @js.native
  class dataview () extends baseview {
    @JSName("$customPrint")
    var $customPrint_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$dragHTML")
    var $dragHTML_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$dropAllow")
    var $dropAllow_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_dataview: dataviewConfig = js.native
    var data: webixLib.webixMod.DataStore = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var on_context: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    @JSName("on_dblclick")
    var on_dblclick_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("on_mouse_move")
    var on_mouse_move_Original: webixLib.webixMod.WebixCallback = js.native
    var `type`: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    var types: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    var waitData: js.Promise[_] = js.native
    @JSName("$customPrint")
    def $customPrint(args: js.Any*): js.Any = js.native
    @JSName("$drag")
    def $drag(source: stdLib.HTMLElement, ev: stdLib.Event): java.lang.String = js.native
    @JSName("$dragHTML")
    def $dragHTML(args: js.Any*): js.Any = js.native
    @JSName("$dragIn")
    def $dragIn(source: stdLib.HTMLElement, target: stdLib.HTMLElement, ev: stdLib.Event): stdLib.HTMLElement = js.native
    @JSName("$dragMark")
    def $dragMark(context: js.Any, ev: stdLib.Event): scala.Boolean = js.native
    @JSName("$dragOut")
    def $dragOut(
      source: stdLib.HTMLElement,
      old_target: stdLib.HTMLElement,
      new_target: stdLib.HTMLElement,
      ev: stdLib.Event
    ): scala.Unit = js.native
    @JSName("$drop")
    def $drop(source: stdLib.HTMLElement, target: stdLib.HTMLElement, ev: stdLib.Event): scala.Unit = js.native
    @JSName("$dropAllow")
    def $dropAllow(args: js.Any*): js.Any = js.native
    def add(obj: js.Any): java.lang.String | scala.Double = js.native
    def add(obj: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
    def addCss(id: java.lang.String, css: java.lang.String): scala.Unit = js.native
    def addCss(id: java.lang.String, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def addCss(id: scala.Double, css: java.lang.String): scala.Unit = js.native
    def addCss(id: scala.Double, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def attachEvent(`type`: dataviewEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: dataviewEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def clearAll(): scala.Unit = js.native
    def clearAll(soft: scala.Boolean): scala.Unit = js.native
    def clearCss(css: java.lang.String): scala.Unit = js.native
    def clearCss(css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def clearValidation(): scala.Unit = js.native
    def copy(sid: java.lang.String, tindex: scala.Double): scala.Unit = js.native
    def copy(sid: java.lang.String, tindex: scala.Double, tobj: js.Any): scala.Unit = js.native
    def copy(sid: java.lang.String, tindex: scala.Double, tobj: js.Any, details: js.Any): scala.Unit = js.native
    def copy(sid: scala.Double, tindex: scala.Double): scala.Unit = js.native
    def copy(sid: scala.Double, tindex: scala.Double, tobj: js.Any): scala.Unit = js.native
    def copy(sid: scala.Double, tindex: scala.Double, tobj: js.Any, details: js.Any): scala.Unit = js.native
    def count(): scala.Double = js.native
    def customize(obj: js.Any): scala.Unit = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def exists(id: java.lang.String): scala.Boolean = js.native
    def exists(id: scala.Double): scala.Boolean = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate): scala.Unit = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate, value: java.lang.String): scala.Unit = js.native
    def filter(
      text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate,
      value: java.lang.String,
      preserve: scala.Boolean
    ): scala.Unit = js.native
    def filter(text: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def find(criterion: webixLib.webixMod.WebixCallback): js.Any = js.native
    def find(criterion: webixLib.webixMod.WebixCallback, first: scala.Boolean): js.Any = js.native
    def getFirstId(): java.lang.String | scala.Double = js.native
    def getIdByIndex(index: scala.Double): java.lang.String | scala.Double = js.native
    def getIndexById(id: java.lang.String): scala.Double = js.native
    def getIndexById(id: scala.Double): scala.Double = js.native
    def getItem(id: java.lang.String): js.Any = js.native
    def getItem(id: scala.Double): js.Any = js.native
    def getItemNode(id: java.lang.String): stdLib.HTMLElement = js.native
    def getItemNode(id: scala.Double): stdLib.HTMLElement = js.native
    def getLastId(): java.lang.String | scala.Double = js.native
    def getNextId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getNextId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPage(): scala.Double = js.native
    def getPager(): js.Any = js.native
    def getPrevId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPrevId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def getScrollState(): js.Any = js.native
    def getSelectedId(as_array: scala.Boolean): java.lang.String | js.Array[_] = js.native
    def getSelectedItem(as_array: scala.Boolean): js.Any = js.native
    def hasCss(id: java.lang.String, css: java.lang.String): scala.Boolean = js.native
    def hasCss(id: scala.Double, css: java.lang.String): scala.Boolean = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def isSelected(id: java.lang.String): scala.Boolean = js.native
    def isSelected(id: scala.Double): scala.Boolean = js.native
    def load(url: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String, callback: webixLib.webixMod.WebixCallback): js.Promise[_] = js.native
    def loadNext(
      count: scala.Double,
      start: scala.Double,
      callback: webixLib.webixMod.WebixCallback,
      url: java.lang.String,
      now: scala.Boolean
    ): scala.Unit = js.native
    def locate(e: stdLib.Event): java.lang.String | scala.Double = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def move(sid: java.lang.String, tindex: scala.Double): java.lang.String = js.native
    def move(sid: java.lang.String, tindex: scala.Double, tobj: js.Any): java.lang.String = js.native
    def move(sid: java.lang.String, tindex: scala.Double, tobj: js.Any, details: js.Any): java.lang.String = js.native
    def moveBottom(id: java.lang.String): scala.Unit = js.native
    def moveBottom(id: scala.Double): scala.Unit = js.native
    def moveDown(id: java.lang.String, step: scala.Double): scala.Unit = js.native
    def moveDown(id: scala.Double, step: scala.Double): scala.Unit = js.native
    def moveSelection(direction: java.lang.String): scala.Unit = js.native
    def moveTop(id: java.lang.String): scala.Unit = js.native
    def moveTop(id: scala.Double): scala.Unit = js.native
    def moveUp(id: java.lang.String, step: scala.Double): scala.Unit = js.native
    def moveUp(id: scala.Double, step: scala.Double): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def on_dblclick(args: js.Any*): js.Any = js.native
    def on_mouse_move(args: js.Any*): js.Any = js.native
    def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def refresh(): scala.Unit = js.native
    def refresh(id: java.lang.String): scala.Unit = js.native
    def refresh(id: scala.Double): scala.Unit = js.native
    def remove(id: java.lang.String): scala.Unit = js.native
    def remove(id: scala.Double): scala.Unit = js.native
    def removeCss(id: java.lang.String, css: java.lang.String): scala.Unit = js.native
    def removeCss(id: java.lang.String, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def removeCss(id: scala.Double, css: java.lang.String): scala.Unit = js.native
    def removeCss(id: scala.Double, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def scrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
    def select(id: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def select(id: js.Array[_], preserve: scala.Boolean): scala.Unit = js.native
    def selectAll(): scala.Unit = js.native
    def selectAll(from: java.lang.String): scala.Unit = js.native
    def selectAll(from: java.lang.String, to: java.lang.String): scala.Unit = js.native
    def serialize(): js.Array[_] = js.native
    def setPage(page: scala.Double): scala.Unit = js.native
    def showItem(id: java.lang.String): scala.Unit = js.native
    def showItem(id: scala.Double): scala.Unit = js.native
    def sort(by: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String, as: java.lang.String): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def unselect(): scala.Unit = js.native
    def unselect(id: java.lang.String): scala.Unit = js.native
    def unselectAll(): scala.Unit = js.native
    def updateItem(id: java.lang.String, data: js.Any): scala.Unit = js.native
    def updateItem(id: scala.Double, data: js.Any): scala.Unit = js.native
    def validate(): scala.Boolean = js.native
    def validate(id: java.lang.String): scala.Boolean = js.native
  }
  
  trait dataviewConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var autoheight: js.UndefOr[scala.Boolean] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var click: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var data: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
    var datafetch: js.UndefOr[scala.Double] = js.undefined
    var datathrottle: js.UndefOr[scala.Double] = js.undefined
    var datatype: js.UndefOr[java.lang.String] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var drag: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var dragscroll: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var externalData: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var item: js.UndefOr[js.Any] = js.undefined
    var loadahead: js.UndefOr[scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var mouseEventDelay: js.UndefOr[scala.Double] = js.undefined
    var multiselect: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
    var navigation: js.UndefOr[scala.Boolean] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var onClick: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var onContext: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var onDblClick: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var onMouseMove: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var pager: js.UndefOr[js.Any] = js.undefined
    var ready: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var removeMissed: js.UndefOr[scala.Boolean] = js.undefined
    var rules: js.UndefOr[js.Any] = js.undefined
    var save: js.UndefOr[java.lang.String] = js.undefined
    var scheme: js.UndefOr[js.Any] = js.undefined
    var scroll: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var scrollSpeed: js.UndefOr[java.lang.String] = js.undefined
    var select: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var template: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var tooltip: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
    var `type`: js.UndefOr[js.Any] = js.undefined
    var url: js.UndefOr[js.Any] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
    var xCount: js.UndefOr[scala.Double] = js.undefined
    var yCount: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterAdd
    - webixLib.webixLibStrings.onAfterContextMenu
    - webixLib.webixLibStrings.onAfterDelete
    - webixLib.webixLibStrings.onAfterDrop
    - webixLib.webixLibStrings.onAfterDropOrder
    - webixLib.webixLibStrings.onAfterLoad
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onAfterSelect
    - webixLib.webixLibStrings.onAfterSort
    - webixLib.webixLibStrings.onBeforeAdd
    - webixLib.webixLibStrings.onBeforeContextMenu
    - webixLib.webixLibStrings.onBeforeDelete
    - webixLib.webixLibStrings.onBeforeDrag
    - webixLib.webixLibStrings.onBeforeDragIn
    - webixLib.webixLibStrings.onBeforeDrop
    - webixLib.webixLibStrings.onBeforeDropOrder
    - webixLib.webixLibStrings.onBeforeDropOut
    - webixLib.webixLibStrings.onBeforeLoad
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBeforeSelect
    - webixLib.webixLibStrings.onBeforeSort
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDataRequest
    - webixLib.webixLibStrings.onDataUpdate
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onDragOut
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onItemDblClick
    - webixLib.webixLibStrings.onItemRender
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLoadError
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onMouseMove
    - webixLib.webixLibStrings.onMouseMoving
    - webixLib.webixLibStrings.onMouseOut
    - webixLib.webixLibStrings.onSelectChange
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onValidationError
    - webixLib.webixLibStrings.onValidationSuccess
    - webixLib.webixLibStrings.onViewResize
  */
  trait dataviewEventName extends js.Object
  
  @js.native
  class datepicker () extends baseview {
    @JSName("$compareValue")
    var $compareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$prepareValue")
    var $prepareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$renderIcon")
    var $renderIcon_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$render")
    var $render_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_datepicker: datepickerConfig = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var touchable: scala.Boolean = js.native
    @JSName("$compareValue")
    def $compareValue(args: js.Any*): js.Any = js.native
    @JSName("$getValue")
    def $getValue(): java.lang.String = js.native
    @JSName("$prepareValue")
    def $prepareValue(args: js.Any*): js.Any = js.native
    @JSName("$render")
    def $render(args: js.Any*): js.Any = js.native
    @JSName("$renderIcon")
    def $renderIcon(args: js.Any*): js.Any = js.native
    @JSName("$renderInput")
    def $renderInput(obj: js.Any, html: java.lang.String, id: java.lang.String): java.lang.String = js.native
    @JSName("$renderInput")
    def $renderInput(obj: js.Any, html: java.lang.String, id: scala.Double): java.lang.String = js.native
    @JSName("$renderLabel")
    def $renderLabel(config: js.Any, id: java.lang.String): java.lang.String = js.native
    @JSName("$renderLabel")
    def $renderLabel(config: js.Any, id: scala.Double): java.lang.String = js.native
    @JSName("$setValue")
    def $setValue(value: java.lang.String): scala.Unit = js.native
    def attachEvent(`type`: datepickerEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: datepickerEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def blur(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def focus(): scala.Unit = js.native
    def getInputNode(): stdLib.HTMLElement = js.native
    def getPopup(): baseview = js.native
    def getText(): java.lang.String = js.native
    def getValue(): java.lang.String = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def refresh(): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def setBottomText(text: java.lang.String): scala.Unit = js.native
    def setValue(value: java.lang.String): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def validate(): scala.Boolean = js.native
  }
  
  trait datepickerConfig extends js.Object {
    var align: js.UndefOr[java.lang.String] = js.undefined
    var animate: js.UndefOr[js.Any] = js.undefined
    var attributes: js.UndefOr[js.Any] = js.undefined
    var autowidth: js.UndefOr[scala.Boolean] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var bottomLabel: js.UndefOr[java.lang.String] = js.undefined
    var bottomPadding: js.UndefOr[scala.Double] = js.undefined
    var click: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var editable: js.UndefOr[scala.Boolean] = js.undefined
    var format: js.UndefOr[js.Any] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var hotkey: js.UndefOr[java.lang.String] = js.undefined
    var icon: js.UndefOr[java.lang.String] = js.undefined
    var icons: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var inputAlign: js.UndefOr[java.lang.String] = js.undefined
    var inputHeight: js.UndefOr[scala.Double] = js.undefined
    var inputPadding: js.UndefOr[scala.Double] = js.undefined
    var inputWidth: js.UndefOr[scala.Double] = js.undefined
    var invalid: js.UndefOr[scala.Boolean] = js.undefined
    var invalidMessage: js.UndefOr[java.lang.String] = js.undefined
    var label: js.UndefOr[java.lang.String] = js.undefined
    var labelAlign: js.UndefOr[java.lang.String] = js.undefined
    var labelPosition: js.UndefOr[java.lang.String] = js.undefined
    var labelWidth: js.UndefOr[scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var multiselect: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var name: js.UndefOr[java.lang.String] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var placeholder: js.UndefOr[java.lang.String] = js.undefined
    var point: js.UndefOr[scala.Boolean] = js.undefined
    var popup: js.UndefOr[java.lang.String] = js.undefined
    var readonly: js.UndefOr[scala.Boolean] = js.undefined
    var relatedAction: js.UndefOr[java.lang.String] = js.undefined
    var relatedView: js.UndefOr[java.lang.String] = js.undefined
    var required: js.UndefOr[scala.Boolean] = js.undefined
    var separator: js.UndefOr[java.lang.String] = js.undefined
    var stringResult: js.UndefOr[scala.Boolean] = js.undefined
    var suggest: js.UndefOr[js.Any] = js.undefined
    var timeIcon: js.UndefOr[java.lang.String] = js.undefined
    var timepicker: js.UndefOr[scala.Boolean] = js.undefined
    var tooltip: js.UndefOr[java.lang.String] = js.undefined
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    var validate: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var validateEvent: js.UndefOr[java.lang.String] = js.undefined
    var value: js.UndefOr[webixLib.webixMod.Date | java.lang.String] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onChange
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait datepickerEventName extends js.Object
  
  @js.native
  class daterange () extends baseview {
    @JSName("config")
    var config_daterange: daterangeConfig = js.native
    def addToRange(dates: java.lang.String): scala.Unit = js.native
    def addToRange(dates: webixLib.webixMod.Date): scala.Unit = js.native
    def attachEvent(`type`: daterangeEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: daterangeEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def getValue(): js.Any = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def refresh(): scala.Unit = js.native
    def setValue(range: js.Any): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait daterangeConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var button: js.UndefOr[scala.Boolean] = js.undefined
    var calendarCount: js.UndefOr[scala.Double] = js.undefined
    var calendarHeight: js.UndefOr[scala.Double] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var icons: js.UndefOr[js.Any] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var padding: js.UndefOr[scala.Double] = js.undefined
    var paddingX: js.UndefOr[scala.Double] = js.undefined
    var paddingY: js.UndefOr[scala.Double] = js.undefined
    var timepicker: js.UndefOr[scala.Boolean] = js.undefined
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    var value: js.UndefOr[js.Any] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterDateSelect
    - webixLib.webixLibStrings.onBeforeDateSelect
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onChange
    - webixLib.webixLibStrings.onDateClear
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onTodaySet
  */
  trait daterangeEventName extends js.Object
  
  @js.native
  class daterangepicker () extends baseview {
    @JSName("$compareValue")
    var $compareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$cssName")
    var $cssName: java.lang.String = js.native
    @JSName("$prepareValue")
    var $prepareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$renderIcon")
    var $renderIcon_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$render")
    var $render_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_daterangepicker: daterangepickerConfig = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var touchable: scala.Boolean = js.native
    @JSName("$compareValue")
    def $compareValue(args: js.Any*): js.Any = js.native
    @JSName("$getValue")
    def $getValue(): java.lang.String = js.native
    @JSName("$prepareValue")
    def $prepareValue(args: js.Any*): js.Any = js.native
    @JSName("$render")
    def $render(args: js.Any*): js.Any = js.native
    @JSName("$renderIcon")
    def $renderIcon(args: js.Any*): js.Any = js.native
    @JSName("$renderInput")
    def $renderInput(config: js.Any): stdLib.HTMLElement = js.native
    @JSName("$renderLabel")
    def $renderLabel(config: js.Any, id: java.lang.String): java.lang.String = js.native
    @JSName("$renderLabel")
    def $renderLabel(config: js.Any, id: scala.Double): java.lang.String = js.native
    @JSName("$setValue")
    def $setValue(value: java.lang.String): scala.Unit = js.native
    def attachEvent(`type`: daterangepickerEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: daterangepickerEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def blur(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def focus(): scala.Unit = js.native
    def getInputNode(): stdLib.HTMLElement = js.native
    def getPopup(): baseview = js.native
    def getText(): java.lang.String = js.native
    def getValue(): java.lang.String = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def refresh(): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def setBottomText(text: java.lang.String): scala.Unit = js.native
    def setValue(value: java.lang.String): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def validate(): scala.Boolean = js.native
  }
  
  trait daterangepickerConfig extends js.Object {
    var align: js.UndefOr[java.lang.String] = js.undefined
    var animate: js.UndefOr[js.Any] = js.undefined
    var attributes: js.UndefOr[js.Any] = js.undefined
    var autowidth: js.UndefOr[scala.Boolean] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var bottomLabel: js.UndefOr[java.lang.String] = js.undefined
    var bottomPadding: js.UndefOr[scala.Double] = js.undefined
    var click: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var editable: js.UndefOr[scala.Boolean] = js.undefined
    var format: js.UndefOr[java.lang.String] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var hotkey: js.UndefOr[java.lang.String] = js.undefined
    var icon: js.UndefOr[java.lang.String] = js.undefined
    var icons: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var inputAlign: js.UndefOr[java.lang.String] = js.undefined
    var inputHeight: js.UndefOr[scala.Double] = js.undefined
    var inputPadding: js.UndefOr[scala.Double] = js.undefined
    var inputWidth: js.UndefOr[scala.Double] = js.undefined
    var invalid: js.UndefOr[scala.Boolean] = js.undefined
    var invalidMessage: js.UndefOr[java.lang.String] = js.undefined
    var label: js.UndefOr[java.lang.String] = js.undefined
    var labelAlign: js.UndefOr[java.lang.String] = js.undefined
    var labelPosition: js.UndefOr[java.lang.String] = js.undefined
    var labelWidth: js.UndefOr[scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var name: js.UndefOr[java.lang.String] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var pattern: js.UndefOr[js.Any] = js.undefined
    var placeholder: js.UndefOr[java.lang.String] = js.undefined
    var popup: js.UndefOr[java.lang.String] = js.undefined
    var readonly: js.UndefOr[scala.Boolean] = js.undefined
    var relatedAction: js.UndefOr[java.lang.String] = js.undefined
    var relatedView: js.UndefOr[java.lang.String] = js.undefined
    var required: js.UndefOr[scala.Boolean] = js.undefined
    var stringResult: js.UndefOr[scala.Boolean] = js.undefined
    var suggest: js.UndefOr[js.Any] = js.undefined
    var timeIcon: js.UndefOr[java.lang.String] = js.undefined
    var timepicker: js.UndefOr[scala.Boolean] = js.undefined
    var tooltip: js.UndefOr[java.lang.String] = js.undefined
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    var validate: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var validateEvent: js.UndefOr[java.lang.String] = js.undefined
    var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onChange
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait daterangepickerEventName extends js.Object
  
  @js.native
  class daterangesuggest () extends baseview {
    @JSName("$enterKey")
    var $enterKey_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_daterangesuggest: daterangesuggestConfig = js.native
    @JSName("$enterKey")
    def $enterKey(args: js.Any*): js.Any = js.native
    def attachEvent(`type`: daterangesuggestEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: daterangesuggestEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def close(): scala.Unit = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def getBody(): js.Any = js.native
    def getButton(): baseview = js.native
    def getHead(): js.Any = js.native
    def getItemId(text: java.lang.String): java.lang.String | scala.Double = js.native
    def getItemText(id: java.lang.String): java.lang.String = js.native
    def getItemText(id: scala.Double): java.lang.String = js.native
    def getList(): baseview = js.native
    def getMasterValue(): js.Any = js.native
    def getRange(): baseview = js.native
    def getSuggestion(): java.lang.String = js.native
    def getValue(): java.lang.String | scala.Double = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def linkInput(input: stdLib.HTMLElement): scala.Unit = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def resizeChildren(): scala.Unit = js.native
    def setMasterValue(value: js.Any): scala.Unit = js.native
    def setPosition(x: scala.Double, y: scala.Double): scala.Unit = js.native
    def setValue(value: java.lang.String): scala.Unit = js.native
    def setValue(value: scala.Double): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait daterangesuggestConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var autofit: js.UndefOr[scala.Boolean] = js.undefined
    var autofocus: js.UndefOr[scala.Boolean] = js.undefined
    var body: js.UndefOr[java.lang.String | baseview] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var data: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var filter: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var fitMaster: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var head: js.UndefOr[js.Any] = js.undefined
    var headHeight: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var input: js.UndefOr[stdLib.HTMLElement | java.lang.String] = js.undefined
    var keyPressTimeout: js.UndefOr[scala.Double] = js.undefined
    var left: js.UndefOr[scala.Double] = js.undefined
    var master: js.UndefOr[baseview] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var modal: js.UndefOr[scala.Boolean] = js.undefined
    var move: js.UndefOr[scala.Boolean] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var padding: js.UndefOr[js.Any] = js.undefined
    var point: js.UndefOr[scala.Boolean] = js.undefined
    var position: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var relative: js.UndefOr[java.lang.String] = js.undefined
    var resize: js.UndefOr[scala.Boolean] = js.undefined
    var template: js.UndefOr[java.lang.String | webixLib.webixMod.WebixTemplate] = js.undefined
    var textValue: js.UndefOr[java.lang.String] = js.undefined
    var toFront: js.UndefOr[scala.Boolean] = js.undefined
    var top: js.UndefOr[scala.Double] = js.undefined
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    var url: js.UndefOr[java.lang.String] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
    var zIndex: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBeforeShow
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onHide
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onShow
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onValueSuggest
    - webixLib.webixLibStrings.onViewMove
    - webixLib.webixLibStrings.onViewMoveEnd
    - webixLib.webixLibStrings.onViewResize
  */
  trait daterangesuggestEventName extends js.Object
  
  @js.native
  class dbllist () extends baseview {
    @JSName("$$")
    var $$: js.Any = js.native
    @JSName("$onLoad")
    var $onLoad_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("config")
    var config_dbllist: dbllistConfig = js.native
    @JSName("$onLoad")
    def $onLoad(args: js.Any*): js.Any = js.native
    def attachEvent(`type`: dbllistEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: dbllistEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def focus(): scala.Unit = js.native
    def getValue(): java.lang.String = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def innerId(id: java.lang.String): scala.Double | java.lang.String = js.native
    def innerId(id: scala.Double): scala.Double | java.lang.String = js.native
    def load(url: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String, callback: webixLib.webixMod.WebixCallback): js.Promise[_] = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def select(id: java.lang.String, mode: scala.Boolean): scala.Unit = js.native
    def select(id: js.Array[_], mode: scala.Boolean): scala.Unit = js.native
    def setValue(ids: java.lang.String): scala.Unit = js.native
    def setValue(ids: js.Array[_]): scala.Unit = js.native
    def ui(view: js.Any): baseview = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait dbllistConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var buttons: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var data: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
    var datatype: js.UndefOr[java.lang.String] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var labelBottomLeft: js.UndefOr[java.lang.String] = js.undefined
    var labelBottomRight: js.UndefOr[java.lang.String] = js.undefined
    var labelLeft: js.UndefOr[java.lang.String] = js.undefined
    var labelRight: js.UndefOr[java.lang.String] = js.undefined
    var list: js.UndefOr[js.Any] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var padding: js.UndefOr[scala.Double] = js.undefined
    var paddingX: js.UndefOr[scala.Double] = js.undefined
    var paddingY: js.UndefOr[scala.Double] = js.undefined
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    var url: js.UndefOr[js.Any] = js.undefined
    var value: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterLoad
    - webixLib.webixLibStrings.onBeforeLoad
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onChange
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onLoadError
  */
  trait dbllistEventName extends js.Object
  
  @js.native
  class excelviewer () extends baseview {
    @JSName("$customPrint")
    var $customPrint_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$dragHTML")
    var $dragHTML_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$dropAllow")
    var $dropAllow_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("$touch")
    var $touch_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("config")
    var config_excelviewer: excelviewerConfig = js.native
    var data: webixLib.webixMod.DataStore = js.native
    var headerContent: js.Any = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var on_context: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    @JSName("on_dblclick")
    var on_dblclick_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("on_mouse_move")
    var on_mouse_move_Original: webixLib.webixMod.WebixCallback = js.native
    var waitData: js.Promise[_] = js.native
    @JSName("$customPrint")
    def $customPrint(args: js.Any*): js.Any = js.native
    @JSName("$drag")
    def $drag(source: stdLib.HTMLElement, ev: stdLib.Event): java.lang.String = js.native
    @JSName("$dragHTML")
    def $dragHTML(args: js.Any*): js.Any = js.native
    @JSName("$dragIn")
    def $dragIn(source: stdLib.HTMLElement, target: stdLib.HTMLElement, ev: stdLib.Event): stdLib.HTMLElement = js.native
    @JSName("$dragMark")
    def $dragMark(context: js.Any, ev: stdLib.Event): scala.Boolean = js.native
    @JSName("$dragOut")
    def $dragOut(
      source: stdLib.HTMLElement,
      old_target: stdLib.HTMLElement,
      new_target: stdLib.HTMLElement,
      ev: stdLib.Event
    ): scala.Unit = js.native
    @JSName("$drop")
    def $drop(source: stdLib.HTMLElement, target: stdLib.HTMLElement, ev: stdLib.Event): scala.Unit = js.native
    @JSName("$dropAllow")
    def $dropAllow(args: js.Any*): js.Any = js.native
    @JSName("$touch")
    def $touch(args: js.Any*): js.Any = js.native
    def add(obj: js.Any): java.lang.String | scala.Double = js.native
    def add(obj: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
    def addCellCss(id: java.lang.String, name: java.lang.String, css: java.lang.String): scala.Unit = js.native
    def addCss(id: java.lang.String, css: java.lang.String): scala.Unit = js.native
    def addCss(id: java.lang.String, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def addCss(id: scala.Double, css: java.lang.String): scala.Unit = js.native
    def addCss(id: scala.Double, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def addRowCss(id: java.lang.String, css: java.lang.String): scala.Unit = js.native
    def addSpan(id: js.Any, column: java.lang.String, width: scala.Double, height: scala.Double): scala.Unit = js.native
    def addSpan(
      id: js.Any,
      column: java.lang.String,
      width: scala.Double,
      height: scala.Double,
      value: java.lang.String
    ): scala.Unit = js.native
    def addSpan(
      id: js.Any,
      column: java.lang.String,
      width: scala.Double,
      height: scala.Double,
      value: java.lang.String,
      css: java.lang.String
    ): scala.Unit = js.native
    def adjustColumn(id: java.lang.String): scala.Unit = js.native
    def adjustColumn(id: java.lang.String, mode: java.lang.String): scala.Unit = js.native
    def adjustColumn(id: scala.Double): scala.Unit = js.native
    def adjustColumn(id: scala.Double, mode: java.lang.String): scala.Unit = js.native
    def adjustRowHeight(): scala.Unit = js.native
    def adjustRowHeight(columnId: java.lang.String): scala.Unit = js.native
    def adjustRowHeight(columnId: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def attachEvent(`type`: excelviewerEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: excelviewerEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def clearAll(): scala.Unit = js.native
    def clearAll(soft: scala.Boolean): scala.Unit = js.native
    def clearCss(css: java.lang.String): scala.Unit = js.native
    def clearCss(css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def clearValidation(): scala.Unit = js.native
    def closeSub(id: java.lang.String): scala.Unit = js.native
    def closeSub(id: scala.Double): scala.Unit = js.native
    def collectValues(id: java.lang.String): js.Array[_] = js.native
    def collectValues(id: scala.Double): js.Array[_] = js.native
    def columnId(index: scala.Double): java.lang.String | scala.Double = js.native
    def copy(sid: java.lang.String, tindex: scala.Double): scala.Unit = js.native
    def copy(sid: java.lang.String, tindex: scala.Double, tobj: js.Any): scala.Unit = js.native
    def copy(sid: java.lang.String, tindex: scala.Double, tobj: js.Any, details: js.Any): scala.Unit = js.native
    def copy(sid: scala.Double, tindex: scala.Double): scala.Unit = js.native
    def copy(sid: scala.Double, tindex: scala.Double, tobj: js.Any): scala.Unit = js.native
    def copy(sid: scala.Double, tindex: scala.Double, tobj: js.Any, details: js.Any): scala.Unit = js.native
    def count(): scala.Double = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def eachColumn(handler: webixLib.webixMod.WebixCallback): scala.Unit = js.native
    def eachColumn(handler: webixLib.webixMod.WebixCallback, all: scala.Boolean): scala.Unit = js.native
    def eachRow(handler: webixLib.webixMod.WebixCallback): scala.Unit = js.native
    def eachRow(handler: webixLib.webixMod.WebixCallback, all: scala.Boolean): scala.Unit = js.native
    def edit(id: js.Any): scala.Unit = js.native
    def editCancel(): scala.Unit = js.native
    def editCell(row: java.lang.String, col: java.lang.String): scala.Unit = js.native
    def editCell(row: java.lang.String, col: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def editCell(row: java.lang.String, col: java.lang.String, preserve: scala.Boolean, show: scala.Boolean): scala.Unit = js.native
    def editCell(row: java.lang.String, col: scala.Double): scala.Unit = js.native
    def editCell(row: java.lang.String, col: scala.Double, preserve: scala.Boolean): scala.Unit = js.native
    def editCell(row: java.lang.String, col: scala.Double, preserve: scala.Boolean, show: scala.Boolean): scala.Unit = js.native
    def editCell(row: scala.Double, col: java.lang.String): scala.Unit = js.native
    def editCell(row: scala.Double, col: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def editCell(row: scala.Double, col: java.lang.String, preserve: scala.Boolean, show: scala.Boolean): scala.Unit = js.native
    def editCell(row: scala.Double, col: scala.Double): scala.Unit = js.native
    def editCell(row: scala.Double, col: scala.Double, preserve: scala.Boolean): scala.Unit = js.native
    def editCell(row: scala.Double, col: scala.Double, preserve: scala.Boolean, show: scala.Boolean): scala.Unit = js.native
    def editColumn(id: java.lang.String): scala.Unit = js.native
    def editNext(): scala.Unit = js.native
    def editRow(id: java.lang.String): scala.Unit = js.native
    def editStop(): scala.Unit = js.native
    def exists(id: java.lang.String): scala.Boolean = js.native
    def exists(id: scala.Double): scala.Boolean = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate): scala.Unit = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate, value: java.lang.String): scala.Unit = js.native
    def filter(
      text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate,
      value: java.lang.String,
      preserve: scala.Boolean
    ): scala.Unit = js.native
    def filter(text: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def filterByAll(): scala.Unit = js.native
    def find(criterion: webixLib.webixMod.WebixCallback): js.Any = js.native
    def find(criterion: webixLib.webixMod.WebixCallback, first: scala.Boolean): js.Any = js.native
    def focusEditor(id: js.Any): scala.Unit = js.native
    def freezeRow(id: java.lang.String, state: scala.Boolean): scala.Unit = js.native
    def freezeRow(id: scala.Double, state: scala.Boolean): scala.Unit = js.native
    def getColumnConfig(id: java.lang.String): js.Any = js.native
    def getColumnIndex(id: java.lang.String): scala.Double = js.native
    def getColumnIndex(id: scala.Double): scala.Double = js.native
    def getCss(rowId: java.lang.String, columnId: java.lang.String): java.lang.String = js.native
    def getCss(rowId: java.lang.String, columnId: scala.Double): java.lang.String = js.native
    def getCss(rowId: scala.Double, columnId: java.lang.String): java.lang.String = js.native
    def getCss(rowId: scala.Double, columnId: scala.Double): java.lang.String = js.native
    def getEditState(): js.Any = js.native
    def getEditor(): js.Any = js.native
    def getEditor(id: java.lang.String): js.Any = js.native
    def getEditorValue(): java.lang.String = js.native
    def getFilter(columnID: java.lang.String): js.Any = js.native
    def getFilter(columnID: scala.Double): js.Any = js.native
    def getFirstId(): java.lang.String | scala.Double = js.native
    def getFooterNode(columnId: java.lang.String): stdLib.HTMLElement = js.native
    def getFooterNode(columnId: java.lang.String, rowIndex: scala.Double): stdLib.HTMLElement = js.native
    def getHeaderContent(id: java.lang.String): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    def getHeaderContent(id: scala.Double): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    def getHeaderNode(columnId: java.lang.String): stdLib.HTMLElement = js.native
    def getHeaderNode(columnId: java.lang.String, rowIndex: scala.Double): stdLib.HTMLElement = js.native
    def getIdByIndex(index: scala.Double): java.lang.String | scala.Double = js.native
    def getIndexById(id: java.lang.String): scala.Double = js.native
    def getIndexById(id: scala.Double): scala.Double = js.native
    def getItem(id: java.lang.String): js.Any = js.native
    def getItem(id: scala.Double): js.Any = js.native
    def getItemNode(id: java.lang.String): stdLib.HTMLElement = js.native
    def getItemNode(id: scala.Double): stdLib.HTMLElement = js.native
    def getLastId(): java.lang.String | scala.Double = js.native
    def getNextId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getNextId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPage(): scala.Double = js.native
    def getPager(): js.Any = js.native
    def getPrevId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPrevId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def getScrollState(): js.Any = js.native
    def getSelectedId(asArray: scala.Boolean, asString: scala.Boolean): js.Any = js.native
    def getSelectedItem(): js.Any = js.native
    def getSelectedItem(as_array: scala.Boolean): js.Any = js.native
    def getSheets(): js.Array[_] = js.native
    def getSpan(): js.Array[_] = js.native
    def getSpanNode(id: js.Any): stdLib.HTMLElement = js.native
    def getState(): js.Any = js.native
    def getSubView(id: java.lang.String): js.Any = js.native
    def getSubView(id: scala.Double): js.Any = js.native
    def getText(rowid: java.lang.String, colid: java.lang.String): java.lang.String = js.native
    def getText(rowid: java.lang.String, colid: scala.Double): java.lang.String = js.native
    def getText(rowid: scala.Double, colid: java.lang.String): java.lang.String = js.native
    def getText(rowid: scala.Double, colid: scala.Double): java.lang.String = js.native
    def getVisibleCount(): scala.Double = js.native
    def group(config: js.Any, mode: scala.Boolean): scala.Unit = js.native
    def hasCss(id: java.lang.String, css: java.lang.String): scala.Boolean = js.native
    def hasCss(id: scala.Double, css: java.lang.String): scala.Boolean = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def hideColumn(id: java.lang.String): scala.Unit = js.native
    def hideColumn(id: java.lang.String, options: js.Any): scala.Unit = js.native
    def hideColumn(id: java.lang.String, options: js.Any, silent: scala.Boolean): scala.Unit = js.native
    def hideColumn(id: java.lang.String, options: js.Any, silent: scala.Boolean, mode: scala.Boolean): scala.Unit = js.native
    def hideColumn(id: scala.Double): scala.Unit = js.native
    def hideColumn(id: scala.Double, options: js.Any): scala.Unit = js.native
    def hideColumn(id: scala.Double, options: js.Any, silent: scala.Boolean): scala.Unit = js.native
    def hideColumn(id: scala.Double, options: js.Any, silent: scala.Boolean, mode: scala.Boolean): scala.Unit = js.native
    def hideOverlay(): scala.Unit = js.native
    def isColumnVisible(id: java.lang.String): scala.Boolean = js.native
    def isColumnVisible(id: scala.Double): scala.Boolean = js.native
    def load(url: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String, callback: webixLib.webixMod.WebixCallback): js.Promise[_] = js.native
    def loadNext(
      count: scala.Double,
      start: scala.Double,
      callback: webixLib.webixMod.WebixCallback,
      url: java.lang.String,
      now: scala.Boolean
    ): scala.Unit = js.native
    def locate(node: stdLib.Event): js.Any = js.native
    def locate(node: stdLib.HTMLElement): js.Any = js.native
    def mapCells(
      startrow: scala.Double,
      startcol: java.lang.String,
      numrows: scala.Double,
      numcols: scala.Double,
      callback: webixLib.webixMod.WebixCallback
    ): scala.Unit = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def markSorting(column_id: java.lang.String, direction: java.lang.String): scala.Unit = js.native
    def move(sid: java.lang.String, tindex: scala.Double): java.lang.String = js.native
    def move(sid: java.lang.String, tindex: scala.Double, tobj: js.Any): java.lang.String = js.native
    def move(sid: java.lang.String, tindex: scala.Double, tobj: js.Any, details: js.Any): java.lang.String = js.native
    def moveBottom(id: java.lang.String): scala.Unit = js.native
    def moveBottom(id: scala.Double): scala.Unit = js.native
    def moveColumn(id: java.lang.String, index: scala.Double): scala.Unit = js.native
    def moveDown(id: java.lang.String, step: scala.Double): scala.Unit = js.native
    def moveDown(id: scala.Double, step: scala.Double): scala.Unit = js.native
    def moveSelection(direction: java.lang.String): scala.Unit = js.native
    def moveTop(id: java.lang.String): scala.Unit = js.native
    def moveTop(id: scala.Double): scala.Unit = js.native
    def moveUp(id: java.lang.String, step: scala.Double): scala.Unit = js.native
    def moveUp(id: scala.Double, step: scala.Double): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def on_dblclick(args: js.Any*): js.Any = js.native
    def on_mouse_move(args: js.Any*): js.Any = js.native
    def openSub(id: java.lang.String): scala.Unit = js.native
    def openSub(id: scala.Double): scala.Unit = js.native
    def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def refresh(): scala.Unit = js.native
    def refresh(id: java.lang.String): scala.Unit = js.native
    def refresh(id: scala.Double): scala.Unit = js.native
    def refreshColumns(): scala.Unit = js.native
    def refreshColumns(config: js.Array[_]): scala.Unit = js.native
    def refreshColumns(config: js.Array[_], reset: scala.Boolean): scala.Unit = js.native
    def refreshFilter(id: java.lang.String): scala.Unit = js.native
    def refreshFilter(id: scala.Double): scala.Unit = js.native
    def registerFilter(`object`: js.Any, config: js.Any, controller: js.Any): scala.Unit = js.native
    def remove(id: java.lang.String): scala.Unit = js.native
    def remove(id: scala.Double): scala.Unit = js.native
    def removeCellCss(id: java.lang.String, name: java.lang.String, css_name: java.lang.String): scala.Unit = js.native
    def removeCss(id: java.lang.String, css: java.lang.String): scala.Unit = js.native
    def removeCss(id: java.lang.String, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def removeCss(id: scala.Double, css: java.lang.String): scala.Unit = js.native
    def removeCss(id: scala.Double, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def removeRowCss(id: java.lang.String, css_name: java.lang.String): scala.Unit = js.native
    def removeSpan(id: java.lang.String, column: java.lang.String): scala.Unit = js.native
    def removeSpan(id: scala.Double, column: java.lang.String): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, operation: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, operation: java.lang.String): scala.Unit = js.native
    def resizeSubView(id: java.lang.String): scala.Unit = js.native
    def resizeSubView(id: scala.Double): scala.Unit = js.native
    def scrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
    def serialize(): js.Array[_] = js.native
    def setColumnWidth(id: java.lang.String, width: scala.Double): scala.Unit = js.native
    def setColumnWidth(id: scala.Double, width: scala.Double): scala.Unit = js.native
    def setPage(page: scala.Double): scala.Unit = js.native
    def setRowHeight(id: java.lang.String, height: scala.Double): scala.Unit = js.native
    def setRowHeight(id: scala.Double, height: scala.Double): scala.Unit = js.native
    def setState(state: js.Any): scala.Unit = js.native
    def showCell(row: java.lang.String, column: java.lang.String): scala.Unit = js.native
    def showColumn(id: java.lang.String): scala.Unit = js.native
    def showColumn(id: scala.Double): scala.Unit = js.native
    def showColumnBatch(batch: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def showColumnBatch(batch: scala.Double, preserve: scala.Boolean): scala.Unit = js.native
    def showItem(id: java.lang.String): scala.Unit = js.native
    def showItem(id: scala.Double): scala.Unit = js.native
    def showItemByIndex(index: scala.Double): scala.Unit = js.native
    def showOverlay(message: java.lang.String): scala.Unit = js.native
    def showSheet(name: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String, as: java.lang.String): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def ungroup(mode: scala.Boolean): scala.Unit = js.native
    def updateItem(id: java.lang.String, data: js.Any): scala.Unit = js.native
    def updateItem(id: scala.Double, data: js.Any): scala.Unit = js.native
    def validate(): scala.Boolean = js.native
    def validate(id: java.lang.String): scala.Boolean = js.native
    def validateEditor(): scala.Boolean = js.native
    def validateEditor(id: java.lang.String): scala.Boolean = js.native
    def validateEditor(id: scala.Double): scala.Boolean = js.native
  }
  
  trait excelviewerConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var areaselect: js.UndefOr[scala.Boolean] = js.undefined
    var autoConfig: js.UndefOr[scala.Boolean] = js.undefined
    var autoheight: js.UndefOr[scala.Boolean] = js.undefined
    var autowidth: js.UndefOr[scala.Boolean] = js.undefined
    var blockselect: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var checkboxRefresh: js.UndefOr[scala.Boolean] = js.undefined
    var clipboard: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var columnWidth: js.UndefOr[scala.Double] = js.undefined
    var columns: js.UndefOr[js.Array[_]] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var data: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
    var datafetch: js.UndefOr[scala.Double] = js.undefined
    var datathrottle: js.UndefOr[scala.Double] = js.undefined
    var datatype: js.UndefOr[java.lang.String] = js.undefined
    var delimiter: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var drag: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var dragColumn: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var dragscroll: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var editMath: js.UndefOr[scala.Boolean] = js.undefined
    var editValue: js.UndefOr[java.lang.String] = js.undefined
    var editable: js.UndefOr[scala.Boolean] = js.undefined
    var editaction: js.UndefOr[java.lang.String] = js.undefined
    var excelHeader: js.UndefOr[scala.Boolean] = js.undefined
    var externalData: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var filterMode: js.UndefOr[js.Any] = js.undefined
    var fixedRowHeight: js.UndefOr[scala.Boolean] = js.undefined
    var footer: js.UndefOr[scala.Boolean] = js.undefined
    var form: js.UndefOr[java.lang.String] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var header: js.UndefOr[scala.Boolean] = js.undefined
    var headerRowHeight: js.UndefOr[scala.Double] = js.undefined
    var headermenu: js.UndefOr[js.Any] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var hover: js.UndefOr[java.lang.String] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var leftSplit: js.UndefOr[scala.Double] = js.undefined
    var liveValidation: js.UndefOr[scala.Boolean] = js.undefined
    var loadahead: js.UndefOr[scala.Double] = js.undefined
    var map: js.UndefOr[js.Any] = js.undefined
    var math: js.UndefOr[scala.Boolean] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minColumnHeight: js.UndefOr[scala.Double] = js.undefined
    var minColumnWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var mouseEventDelay: js.UndefOr[scala.Double] = js.undefined
    var multiselect: js.UndefOr[scala.Boolean] = js.undefined
    var navigation: js.UndefOr[scala.Boolean] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var onClick: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var onContext: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var onDblClick: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var onMouseMove: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var pager: js.UndefOr[js.Any] = js.undefined
    var prerender: js.UndefOr[scala.Boolean] = js.undefined
    var ready: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var removeMissed: js.UndefOr[scala.Boolean] = js.undefined
    var resizeColumn: js.UndefOr[js.Any] = js.undefined
    var resizeRow: js.UndefOr[scala.Boolean] = js.undefined
    var rightSplit: js.UndefOr[scala.Double] = js.undefined
    var rowHeight: js.UndefOr[scala.Double] = js.undefined
    var rowLineHeight: js.UndefOr[scala.Double] = js.undefined
    var rules: js.UndefOr[js.Any] = js.undefined
    var save: js.UndefOr[java.lang.String] = js.undefined
    var scheme: js.UndefOr[js.Any] = js.undefined
    var scroll: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var scrollAlignY: js.UndefOr[scala.Boolean] = js.undefined
    var scrollX: js.UndefOr[scala.Boolean] = js.undefined
    var scrollY: js.UndefOr[scala.Boolean] = js.undefined
    var select: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var spans: js.UndefOr[js.Array[_]] = js.undefined
    var subRowHeight: js.UndefOr[java.lang.String] = js.undefined
    var subrow: js.UndefOr[java.lang.String] = js.undefined
    var subview: js.UndefOr[baseview | webixLib.webixMod.WebixCallback] = js.undefined
    var templateCopy: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var toolbar: js.UndefOr[java.lang.String] = js.undefined
    var tooltip: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
    var topSplit: js.UndefOr[scala.Double] = js.undefined
    var `type`: js.UndefOr[js.Any] = js.undefined
    var url: js.UndefOr[js.Any] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
    var yCount: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterAdd
    - webixLib.webixLibStrings.onAfterAreaAdd
    - webixLib.webixLibStrings.onAfterAreaRemove
    - webixLib.webixLibStrings.onAfterBlockSelect
    - webixLib.webixLibStrings.onAfterColumnDrop
    - webixLib.webixLibStrings.onAfterColumnDropOrder
    - webixLib.webixLibStrings.onAfterColumnHide
    - webixLib.webixLibStrings.onAfterColumnShow
    - webixLib.webixLibStrings.onAfterContextMenu
    - webixLib.webixLibStrings.onAfterDelete
    - webixLib.webixLibStrings.onAfterDrop
    - webixLib.webixLibStrings.onAfterDropOrder
    - webixLib.webixLibStrings.onAfterEditStart
    - webixLib.webixLibStrings.onAfterEditStop
    - webixLib.webixLibStrings.onAfterFilter
    - webixLib.webixLibStrings.onAfterLoad
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onAfterSelect
    - webixLib.webixLibStrings.onAfterSort
    - webixLib.webixLibStrings.onAfterUnSelect
    - webixLib.webixLibStrings.onAreaDrag
    - webixLib.webixLibStrings.onBeforeAdd
    - webixLib.webixLibStrings.onBeforeAreaAdd
    - webixLib.webixLibStrings.onBeforeAreaRemove
    - webixLib.webixLibStrings.onBeforeBlockSelect
    - webixLib.webixLibStrings.onBeforeColumnDrag
    - webixLib.webixLibStrings.onBeforeColumnDrop
    - webixLib.webixLibStrings.onBeforeColumnDropOrder
    - webixLib.webixLibStrings.onBeforeColumnHide
    - webixLib.webixLibStrings.onBeforeColumnShow
    - webixLib.webixLibStrings.onBeforeContextMenu
    - webixLib.webixLibStrings.onBeforeDelete
    - webixLib.webixLibStrings.onBeforeDrag
    - webixLib.webixLibStrings.onBeforeDragIn
    - webixLib.webixLibStrings.onBeforeDrop
    - webixLib.webixLibStrings.onBeforeDropOrder
    - webixLib.webixLibStrings.onBeforeDropOut
    - webixLib.webixLibStrings.onBeforeEditStart
    - webixLib.webixLibStrings.onBeforeEditStop
    - webixLib.webixLibStrings.onBeforeFilter
    - webixLib.webixLibStrings.onBeforeLoad
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBeforeSelect
    - webixLib.webixLibStrings.onBeforeSort
    - webixLib.webixLibStrings.onBeforeUnSelect
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onCheck
    - webixLib.webixLibStrings.onCollectValues
    - webixLib.webixLibStrings.onColumnResize
    - webixLib.webixLibStrings.onDataRequest
    - webixLib.webixLibStrings.onDataUpdate
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onDragOut
    - webixLib.webixLibStrings.onEditorChange
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onHeaderClick
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onItemDblClick
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLiveEdit
    - webixLib.webixLibStrings.onLoadError
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onMouseMove
    - webixLib.webixLibStrings.onMouseMoving
    - webixLib.webixLibStrings.onMouseOut
    - webixLib.webixLibStrings.onPaste
    - webixLib.webixLibStrings.onResize
    - webixLib.webixLibStrings.onRowResize
    - webixLib.webixLibStrings.onScrollX
    - webixLib.webixLibStrings.onScrollY
    - webixLib.webixLibStrings.onSelectChange
    - webixLib.webixLibStrings.onStructureLoad
    - webixLib.webixLibStrings.onStructureUpdate
    - webixLib.webixLibStrings.onSubViewClose
    - webixLib.webixLibStrings.onSubViewCreate
    - webixLib.webixLibStrings.onSubViewOpen
    - webixLib.webixLibStrings.onSubViewRender
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onValidationError
    - webixLib.webixLibStrings.onValidationSuccess
    - webixLib.webixLibStrings.onViewResize
  */
  trait excelviewerEventName extends js.Object
  
  @js.native
  class fieldset () extends baseview {
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_fieldset: fieldsetConfig = js.native
    def getBody(): js.Any = js.native
    def resizeChildren(): scala.Unit = js.native
  }
  
  trait fieldsetConfig extends js.Object {
    @JSName("$cssName")
    var $cssName: js.UndefOr[java.lang.String] = js.undefined
    var animate: js.UndefOr[js.Any] = js.undefined
    var body: js.UndefOr[baseview] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var label: js.UndefOr[java.lang.String] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var paddingX: js.UndefOr[scala.Double] = js.undefined
    var paddingY: js.UndefOr[scala.Double] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait fieldsetEventName extends js.Object
  
  @js.native
  class filemanager () extends baseview {
    @JSName("$$")
    var $$: js.Any = js.native
    @JSName("$dropAllow")
    var $dropAllow_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("config")
    var config_filemanager: filemanagerConfig = js.native
    var data: webixLib.webixMod.DataStore = js.native
    var waitData: js.Promise[_] = js.native
    @JSName("$dropAllow")
    def $dropAllow(args: js.Any*): js.Any = js.native
    def add(obj: js.Any): java.lang.String | scala.Double = js.native
    def add(obj: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: filemanagerEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: filemanagerEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def clearAll(): scala.Unit = js.native
    def clearAll(soft: scala.Boolean): scala.Unit = js.native
    def copy(sid: java.lang.String, tindex: scala.Double): scala.Double = js.native
    def copy(sid: java.lang.String, tindex: scala.Double, tobj: baseview): scala.Double = js.native
    def copy(sid: java.lang.String, tindex: scala.Double, tobj: baseview, details: js.Any): scala.Double = js.native
    def copy(sid: scala.Double, tindex: scala.Double): scala.Double = js.native
    def copy(sid: scala.Double, tindex: scala.Double, tobj: baseview): scala.Double = js.native
    def copy(sid: scala.Double, tindex: scala.Double, tobj: baseview, details: js.Any): scala.Double = js.native
    def copyFile(source: java.lang.String, target: java.lang.String): scala.Unit = js.native
    def copyFile(source: js.Array[_], target: java.lang.String): scala.Unit = js.native
    def count(): scala.Double = js.native
    def createFolder(targetId: java.lang.String): scala.Unit = js.native
    def deleteFile(ids: java.lang.String): scala.Unit = js.native
    def deleteFile(ids: js.Array[_]): scala.Unit = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def download(id: java.lang.String): scala.Unit = js.native
    def editFile(id: java.lang.String): scala.Unit = js.native
    def exists(id: java.lang.String): scala.Boolean = js.native
    def exists(id: scala.Double): scala.Boolean = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate): scala.Unit = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate, value: java.lang.String): scala.Unit = js.native
    def filter(
      text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate,
      value: java.lang.String,
      preserve: scala.Boolean
    ): scala.Unit = js.native
    def filter(text: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def find(criterion: webixLib.webixMod.WebixCallback): js.Any = js.native
    def find(criterion: webixLib.webixMod.WebixCallback, first: scala.Boolean): js.Any = js.native
    def getActive(): java.lang.String = js.native
    def getActiveView(): js.Any = js.native
    def getBranchIndex(id: java.lang.String): scala.Double = js.native
    def getBranchIndex(id: java.lang.String, parent: java.lang.String): scala.Double = js.native
    def getBranchIndex(id: java.lang.String, parent: scala.Double): scala.Double = js.native
    def getBranchIndex(id: scala.Double): scala.Double = js.native
    def getBranchIndex(id: scala.Double, parent: java.lang.String): scala.Double = js.native
    def getBranchIndex(id: scala.Double, parent: scala.Double): scala.Double = js.native
    def getCurrentFolder(): java.lang.String = js.native
    def getFirstChildId(id: java.lang.String): java.lang.String = js.native
    def getFirstChildId(id: scala.Double): java.lang.String = js.native
    def getFirstId(): java.lang.String | scala.Double = js.native
    def getIdByIndex(index: scala.Double): java.lang.String | scala.Double = js.native
    def getIndexById(id: java.lang.String): scala.Double = js.native
    def getIndexById(id: scala.Double): scala.Double = js.native
    def getItem(id: java.lang.String): js.Any = js.native
    def getItem(id: scala.Double): js.Any = js.native
    def getLastId(): java.lang.String | scala.Double = js.native
    def getMenu(): js.Any = js.native
    def getNextId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getNextId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def getNextSiblingId(id: java.lang.String): java.lang.String | scala.Double = js.native
    def getNextSiblingId(id: scala.Double): java.lang.String | scala.Double = js.native
    def getParentId(id: java.lang.String): java.lang.String | scala.Double = js.native
    def getParentId(id: scala.Double): java.lang.String | scala.Double = js.native
    def getPath(id: java.lang.String): js.Array[_] = js.native
    def getPathNames(id: java.lang.String): js.Array[_] = js.native
    def getPrevId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPrevId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPrevSiblingId(id: java.lang.String): java.lang.String | scala.Double = js.native
    def getPrevSiblingId(id: scala.Double): java.lang.String | scala.Double = js.native
    def getSearchData(id: java.lang.String, text: java.lang.String): js.Array[_] = js.native
    def getSelectedFile(): java.lang.String | js.Array[_] = js.native
    def getUploader(): js.Any = js.native
    def goBack(step: scala.Double): scala.Unit = js.native
    def goForward(step: scala.Double): scala.Unit = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def hideProgress(): scala.Unit = js.native
    def hideSearchResults(): scala.Unit = js.native
    def hideTree(): scala.Unit = js.native
    def innerId(id: java.lang.String): scala.Double | java.lang.String = js.native
    def innerId(id: scala.Double): scala.Double | java.lang.String = js.native
    def isBranch(id: java.lang.String): scala.Boolean = js.native
    def isBranch(id: scala.Double): scala.Boolean = js.native
    def levelUp(id: java.lang.String): scala.Unit = js.native
    def load(url: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String, callback: webixLib.webixMod.WebixCallback): js.Promise[_] = js.native
    def loadBranch(id: java.lang.String, callback: webixLib.webixMod.WebixCallback, url: java.lang.String): scala.Unit = js.native
    def loadBranch(id: scala.Double, callback: webixLib.webixMod.WebixCallback, url: java.lang.String): scala.Unit = js.native
    def loadNext(
      count: scala.Double,
      start: scala.Double,
      callback: webixLib.webixMod.WebixCallback,
      url: java.lang.String,
      now: scala.Boolean
    ): scala.Unit = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def markCopy(id: java.lang.String): scala.Unit = js.native
    def markCopy(id: js.Array[_]): scala.Unit = js.native
    def markCut(id: java.lang.String): scala.Unit = js.native
    def markCut(id: js.Array[_]): scala.Unit = js.native
    def move(sid: java.lang.String, tindex: scala.Double): java.lang.String = js.native
    def move(sid: java.lang.String, tindex: scala.Double, tobj: js.Any): java.lang.String = js.native
    def move(sid: java.lang.String, tindex: scala.Double, tobj: js.Any, details: js.Any): java.lang.String = js.native
    def moveFile(source: java.lang.String, target: java.lang.String): scala.Unit = js.native
    def openFolders(folders: js.Array[_]): scala.Unit = js.native
    def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def pasteFile(id: java.lang.String): scala.Unit = js.native
    def refresh(): scala.Unit = js.native
    def refresh(id: java.lang.String): scala.Unit = js.native
    def refresh(id: scala.Double): scala.Unit = js.native
    def remove(id: java.lang.String): scala.Unit = js.native
    def remove(id: scala.Double): scala.Unit = js.native
    def renameFile(id: java.lang.String, name: java.lang.String, property: java.lang.String): scala.Unit = js.native
    def setPath(id: java.lang.String): scala.Unit = js.native
    def showProgress(): scala.Unit = js.native
    def showProgress(config: js.Any): scala.Unit = js.native
    def showSearchResults(text: java.lang.String): scala.Unit = js.native
    def showTree(): scala.Unit = js.native
    def sort(by: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String, as: java.lang.String): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def ui(view: js.Any): baseview = js.native
    def unblockEvent(): scala.Unit = js.native
    def updateItem(id: java.lang.String, data: js.Any): scala.Unit = js.native
    def updateItem(id: scala.Double, data: js.Any): scala.Unit = js.native
    def uploadFile(target: java.lang.String): scala.Unit = js.native
  }
  
  trait filemanagerConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var data: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
    var datathrottle: js.UndefOr[scala.Double] = js.undefined
    var datatype: js.UndefOr[java.lang.String] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var disabledHistory: js.UndefOr[scala.Boolean] = js.undefined
    var filterMode: js.UndefOr[js.Any] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var handlers: js.UndefOr[js.Any] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var icons: js.UndefOr[js.Any] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var legacyUploader: js.UndefOr[scala.Boolean] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var mode: js.UndefOr[java.lang.String] = js.undefined
    var modes: js.UndefOr[js.Array[_]] = js.undefined
    var noFileCache: js.UndefOr[scala.Boolean] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var padding: js.UndefOr[scala.Double] = js.undefined
    var paddingX: js.UndefOr[scala.Double] = js.undefined
    var paddingY: js.UndefOr[scala.Double] = js.undefined
    var readonly: js.UndefOr[scala.Boolean] = js.undefined
    var ready: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var removeMissed: js.UndefOr[scala.Boolean] = js.undefined
    var save: js.UndefOr[java.lang.String] = js.undefined
    var scheme: js.UndefOr[js.Any] = js.undefined
    var structure: js.UndefOr[js.Any] = js.undefined
    var templateCreate: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var templateDate: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var templateIcon: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var templateName: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var templateSize: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var templateType: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    var uploadProgress: js.UndefOr[js.Any] = js.undefined
    var url: js.UndefOr[js.Any] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterAdd
    - webixLib.webixLibStrings.onAfterBack
    - webixLib.webixLibStrings.onAfterCreateFolder
    - webixLib.webixLibStrings.onAfterDelete
    - webixLib.webixLibStrings.onAfterDeleteFile
    - webixLib.webixLibStrings.onAfterDrop
    - webixLib.webixLibStrings.onAfterDynParse
    - webixLib.webixLibStrings.onAfterEditFile
    - webixLib.webixLibStrings.onAfterEditStop
    - webixLib.webixLibStrings.onAfterFileUpload
    - webixLib.webixLibStrings.onAfterHideTree
    - webixLib.webixLibStrings.onAfterLevelDown
    - webixLib.webixLibStrings.onAfterLevelUp
    - webixLib.webixLibStrings.onAfterLoad
    - webixLib.webixLibStrings.onAfterMarkCopy
    - webixLib.webixLibStrings.onAfterMarkCut
    - webixLib.webixLibStrings.onAfterMenu
    - webixLib.webixLibStrings.onAfterModeChange
    - webixLib.webixLibStrings.onAfterPasteFile
    - webixLib.webixLibStrings.onAfterPathClick
    - webixLib.webixLibStrings.onAfterRun
    - webixLib.webixLibStrings.onAfterSearch
    - webixLib.webixLibStrings.onAfterShowTree
    - webixLib.webixLibStrings.onAfterSort
    - webixLib.webixLibStrings.onAfterUploadDialog
    - webixLib.webixLibStrings.onBeforeAdd
    - webixLib.webixLibStrings.onBeforeBack
    - webixLib.webixLibStrings.onBeforeCreateFolder
    - webixLib.webixLibStrings.onBeforeDelete
    - webixLib.webixLibStrings.onBeforeDeleteFile
    - webixLib.webixLibStrings.onBeforeDrag
    - webixLib.webixLibStrings.onBeforeDragIn
    - webixLib.webixLibStrings.onBeforeDrop
    - webixLib.webixLibStrings.onBeforeDynLoad
    - webixLib.webixLibStrings.onBeforeDynParse
    - webixLib.webixLibStrings.onBeforeEditFile
    - webixLib.webixLibStrings.onBeforeEditStop
    - webixLib.webixLibStrings.onBeforeFileUpload
    - webixLib.webixLibStrings.onBeforeHideTree
    - webixLib.webixLibStrings.onBeforeLevelDown
    - webixLib.webixLibStrings.onBeforeLevelUp
    - webixLib.webixLibStrings.onBeforeLoad
    - webixLib.webixLibStrings.onBeforeMarkCopy
    - webixLib.webixLibStrings.onBeforeMarkCut
    - webixLib.webixLibStrings.onBeforeMenu
    - webixLib.webixLibStrings.onBeforeModeChange
    - webixLib.webixLibStrings.onBeforePasteFile
    - webixLib.webixLibStrings.onBeforeRequest
    - webixLib.webixLibStrings.onBeforeRun
    - webixLib.webixLibStrings.onBeforeSearch
    - webixLib.webixLibStrings.onBeforeSearchRequest
    - webixLib.webixLibStrings.onBeforeShowTree
    - webixLib.webixLibStrings.onBeforeSort
    - webixLib.webixLibStrings.onBeforeUploadDialog
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onComponentInit
    - webixLib.webixLibStrings.onCopyError
    - webixLib.webixLibStrings.onDataRequest
    - webixLib.webixLibStrings.onDataUpdate
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onDynLoadError
    - webixLib.webixLibStrings.onErrorResponse
    - webixLib.webixLibStrings.onFolderSelect
    - webixLib.webixLibStrings.onHideSearchResults
    - webixLib.webixLibStrings.onHistoryChange
    - webixLib.webixLibStrings.onItemRename
    - webixLib.webixLibStrings.onItemSelect
    - webixLib.webixLibStrings.onLoadError
    - webixLib.webixLibStrings.onMoveError
    - webixLib.webixLibStrings.onPathComplete
    - webixLib.webixLibStrings.onPathLevel
    - webixLib.webixLibStrings.onShowSearchResults
    - webixLib.webixLibStrings.onSuccessResponse
    - webixLib.webixLibStrings.onViewInit
  */
  trait filemanagerEventName extends js.Object
  
  @js.native
  class form () extends baseview {
    @JSName("config")
    var config_form: formConfig = js.native
    var elements: js.Any = js.native
    def addView(view: js.Any): java.lang.String | scala.Double = js.native
    def addView(view: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: formEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: formEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def clear(): scala.Unit = js.native
    def clearValidation(): scala.Unit = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def focus(item: java.lang.String): scala.Unit = js.native
    def getCleanValues(): js.Any = js.native
    def getDirtyValues(): js.Any = js.native
    def getScrollState(): js.Any = js.native
    def getValues(): js.Any = js.native
    def getValues(details: js.Any): js.Any = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def index(obj: js.Any): scala.Double = js.native
    def isDirty(): scala.Boolean = js.native
    def load(url: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String, callback: webixLib.webixMod.WebixCallback): js.Promise[_] = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def markInvalid(name: java.lang.String): scala.Unit = js.native
    def markInvalid(name: java.lang.String, state: java.lang.String): scala.Unit = js.native
    def markInvalid(name: java.lang.String, state: scala.Boolean): scala.Unit = js.native
    def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def reconstruct(): scala.Unit = js.native
    def refresh(): scala.Unit = js.native
    def removeView(id: js.Any): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def resizeChildren(): scala.Unit = js.native
    def restore(state: js.Any): scala.Unit = js.native
    def restore(state: js.Any, factory: webixLib.webixMod.WebixCallback): scala.Unit = js.native
    def scrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
    def serialize(): js.Any = js.native
    def serialize(serializer: webixLib.webixMod.WebixCallback): js.Any = js.native
    def setDirty(): scala.Unit = js.native
    def setDirty(mark: scala.Boolean): scala.Unit = js.native
    def setValues(values: js.Any): scala.Unit = js.native
    def setValues(values: js.Any, update: scala.Boolean): scala.Unit = js.native
    def showBatch(name: java.lang.String): scala.Unit = js.native
    def showBatch(name: java.lang.String, mode: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def validate(): scala.Boolean = js.native
    def validate(mode: js.Any): scala.Boolean = js.native
  }
  
  trait formConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var autoheight: js.UndefOr[scala.Boolean] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var cols: js.UndefOr[js.Array[_]] = js.undefined
    var complexData: js.UndefOr[scala.Boolean] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var data: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
    var dataFeed: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var datatype: js.UndefOr[java.lang.String] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var elements: js.UndefOr[js.Array[_]] = js.undefined
    var elementsConfig: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var isolate: js.UndefOr[scala.Boolean] = js.undefined
    var margin: js.UndefOr[scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var padding: js.UndefOr[scala.Double] = js.undefined
    var paddingX: js.UndefOr[scala.Double] = js.undefined
    var paddingY: js.UndefOr[scala.Double] = js.undefined
    var responsive: js.UndefOr[java.lang.String] = js.undefined
    var rows: js.UndefOr[js.Array[_]] = js.undefined
    var rules: js.UndefOr[js.Any] = js.undefined
    var scroll: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var scrollSpeed: js.UndefOr[java.lang.String] = js.undefined
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    var url: js.UndefOr[js.Any] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var visibleBatch: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterLoad
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onAfterValidation
    - webixLib.webixLibStrings.onBeforeLoad
    - webixLib.webixLibStrings.onBeforeValidate
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onChange
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onLoadError
    - webixLib.webixLibStrings.onSubmit
    - webixLib.webixLibStrings.onValidationError
    - webixLib.webixLibStrings.onValidationSuccess
    - webixLib.webixLibStrings.onValues
  */
  trait formEventName extends js.Object
  
  @js.native
  class forminput () extends baseview {
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_forminput: forminputConfig = js.native
    def focus(): scala.Unit = js.native
    def getBody(): js.Any = js.native
    def getValue(): java.lang.String = js.native
    def resizeChildren(): scala.Unit = js.native
    def setBottomText(text: java.lang.String): scala.Unit = js.native
    def setValue(value: js.Any): scala.Unit = js.native
  }
  
  trait forminputConfig extends js.Object {
    @JSName("$cssName")
    var $cssName: js.UndefOr[java.lang.String] = js.undefined
    var animate: js.UndefOr[js.Any] = js.undefined
    var body: js.UndefOr[baseview] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var label: js.UndefOr[java.lang.String] = js.undefined
    var labelAlign: js.UndefOr[java.lang.String] = js.undefined
    var labelWidth: js.UndefOr[scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var value: js.UndefOr[js.Any] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait forminputEventName extends js.Object
  
  @js.native
  class gage () extends baseview {
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_gage: gageConfig = js.native
    def attachEvent(`type`: gageEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: gageEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def getValue(): scala.Double = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def setValue(new_value: scala.Double): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait gageConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var label: js.UndefOr[java.lang.String] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxRange: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minRange: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var placeholder: js.UndefOr[java.lang.String] = js.undefined
    var scale: js.UndefOr[scala.Double] = js.undefined
    var smoothFlow: js.UndefOr[scala.Boolean] = js.undefined
    var stroke: js.UndefOr[scala.Double] = js.undefined
    var value: js.UndefOr[scala.Double] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait gageEventName extends js.Object
  
  @js.native
  class geochart () extends baseview {
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_geochart: geochartConfig = js.native
    var data: webixLib.webixMod.DataStore = js.native
    var waitData: js.Promise[_] = js.native
    def add(obj: js.Any): java.lang.String | scala.Double = js.native
    def add(obj: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: geochartEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: geochartEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def clearAll(): scala.Unit = js.native
    def count(): scala.Double = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def exists(id: java.lang.String): scala.Boolean = js.native
    def exists(id: scala.Double): scala.Boolean = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate): scala.Unit = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate, value: java.lang.String): scala.Unit = js.native
    def filter(
      text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate,
      value: java.lang.String,
      preserve: scala.Boolean
    ): scala.Unit = js.native
    def filter(text: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def find(criterion: webixLib.webixMod.WebixCallback): js.Any = js.native
    def find(criterion: webixLib.webixMod.WebixCallback, first: scala.Boolean): js.Any = js.native
    def getFirstId(): java.lang.String | scala.Double = js.native
    def getIdByIndex(index: scala.Double): java.lang.String | scala.Double = js.native
    def getIndexById(id: java.lang.String): scala.Double = js.native
    def getIndexById(id: scala.Double): scala.Double = js.native
    def getItem(id: java.lang.String): js.Any = js.native
    def getItem(id: scala.Double): js.Any = js.native
    def getLastId(): java.lang.String | scala.Double = js.native
    def getMap(): js.Any = js.native
    def getNextId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getNextId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPrevId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPrevId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def load(url: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String, callback: webixLib.webixMod.WebixCallback): js.Promise[_] = js.native
    def loadNext(
      count: scala.Double,
      start: scala.Double,
      callback: webixLib.webixMod.WebixCallback,
      url: java.lang.String,
      now: scala.Boolean
    ): scala.Unit = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def refresh(): scala.Unit = js.native
    def refresh(id: java.lang.String): scala.Unit = js.native
    def refresh(id: scala.Double): scala.Unit = js.native
    def remove(id: java.lang.String): scala.Unit = js.native
    def remove(id: scala.Double): scala.Unit = js.native
    def render(): scala.Unit = js.native
    def serialize(): js.Array[_] = js.native
    def setDisplayMode(mode: java.lang.String): scala.Unit = js.native
    def setRegion(region: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String, as: java.lang.String): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def updateItem(id: java.lang.String, data: js.Any): scala.Unit = js.native
    def updateItem(id: scala.Double, data: js.Any): scala.Unit = js.native
  }
  
  trait geochartConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var chart: js.UndefOr[js.Any] = js.undefined
    var columns: js.UndefOr[js.Array[_]] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var data: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
    var datathrottle: js.UndefOr[scala.Double] = js.undefined
    var datatype: js.UndefOr[java.lang.String] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var key: js.UndefOr[java.lang.String] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var ready: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var removeMissed: js.UndefOr[scala.Boolean] = js.undefined
    var save: js.UndefOr[java.lang.String] = js.undefined
    var scheme: js.UndefOr[js.Any] = js.undefined
    var tooltip: js.UndefOr[java.lang.String] = js.undefined
    var url: js.UndefOr[js.Any] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterAdd
    - webixLib.webixLibStrings.onAfterDelete
    - webixLib.webixLibStrings.onAfterLoad
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onAfterSort
    - webixLib.webixLibStrings.onBeforeAdd
    - webixLib.webixLibStrings.onBeforeDelete
    - webixLib.webixLibStrings.onBeforeLoad
    - webixLib.webixLibStrings.onBeforeSort
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDataRequest
    - webixLib.webixLibStrings.onDataUpdate
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLoadError
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onMapError
    - webixLib.webixLibStrings.onMapReady
    - webixLib.webixLibStrings.onRegionClick
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait geochartEventName extends js.Object
  
  @js.native
  class googleMap () extends baseview {
    @JSName("$onLoad")
    var $onLoad_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_googleMap: googleMapConfig = js.native
    var data: webixLib.webixMod.DataStore = js.native
    var waitData: js.Promise[_] = js.native
    @JSName("$onLoad")
    def $onLoad(args: js.Any*): js.Any = js.native
    def add(obj: js.Any): java.lang.String | scala.Double = js.native
    def add(obj: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: googleMapEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: googleMapEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def clearAll(): scala.Unit = js.native
    def clearAll(soft: scala.Boolean): scala.Unit = js.native
    def count(): scala.Double = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def exists(id: java.lang.String): scala.Boolean = js.native
    def exists(id: scala.Double): scala.Boolean = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate): scala.Unit = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate, value: java.lang.String): scala.Unit = js.native
    def filter(
      text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate,
      value: java.lang.String,
      preserve: scala.Boolean
    ): scala.Unit = js.native
    def filter(text: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def find(criterion: webixLib.webixMod.WebixCallback): js.Any = js.native
    def find(criterion: webixLib.webixMod.WebixCallback, first: scala.Boolean): js.Any = js.native
    def getFirstId(): java.lang.String | scala.Double = js.native
    def getIdByIndex(index: scala.Double): java.lang.String | scala.Double = js.native
    def getIndexById(id: java.lang.String): scala.Double = js.native
    def getIndexById(id: scala.Double): scala.Double = js.native
    def getItem(id: java.lang.String): js.Any = js.native
    def getItem(id: scala.Double): js.Any = js.native
    def getLastId(): java.lang.String | scala.Double = js.native
    def getMap(): js.Any = js.native
    def getNextId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getNextId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPrevId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPrevId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def load(url: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String, callback: webixLib.webixMod.WebixCallback): js.Promise[_] = js.native
    def loadNext(
      count: scala.Double,
      start: scala.Double,
      callback: webixLib.webixMod.WebixCallback,
      url: java.lang.String,
      now: scala.Boolean
    ): scala.Unit = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def refresh(): scala.Unit = js.native
    def refresh(id: java.lang.String): scala.Unit = js.native
    def refresh(id: scala.Double): scala.Unit = js.native
    def remove(id: java.lang.String): scala.Unit = js.native
    def remove(id: scala.Double): scala.Unit = js.native
    def render(): scala.Unit = js.native
    def serialize(): js.Array[_] = js.native
    def sort(by: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String, as: java.lang.String): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def updateItem(id: java.lang.String, data: js.Any): scala.Unit = js.native
    def updateItem(id: scala.Double, data: js.Any): scala.Unit = js.native
  }
  
  trait googleMapConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var center: js.UndefOr[js.Array[_]] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var data: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
    var dataFeed: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var datathrottle: js.UndefOr[scala.Double] = js.undefined
    var datatype: js.UndefOr[java.lang.String] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var heatmapConfig: js.UndefOr[js.Any] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var layerType: js.UndefOr[java.lang.String] = js.undefined
    var mapType: js.UndefOr[java.lang.String] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var ready: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var removeMissed: js.UndefOr[scala.Boolean] = js.undefined
    var save: js.UndefOr[java.lang.String] = js.undefined
    var scheme: js.UndefOr[js.Any] = js.undefined
    var url: js.UndefOr[js.Any] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
    var zoom: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterAdd
    - webixLib.webixLibStrings.onAfterDelete
    - webixLib.webixLibStrings.onAfterLoad
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onAfterSort
    - webixLib.webixLibStrings.onBeforeAdd
    - webixLib.webixLibStrings.onBeforeDelete
    - webixLib.webixLibStrings.onBeforeLoad
    - webixLib.webixLibStrings.onBeforeSort
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDataRequest
    - webixLib.webixLibStrings.onDataUpdate
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onHeatMapRender
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLoadError
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait googleMapEventName extends js.Object
  
  @js.native
  class gridlayout () extends baseview {
    @JSName("config")
    var config_gridlayout: gridlayoutConfig = js.native
    def addView(view: js.Any): java.lang.String | scala.Double = js.native
    def addView(view: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: gridlayoutEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: gridlayoutEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def clearAll(): scala.Unit = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def index(obj: js.Any): scala.Double = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def moveView(id: java.lang.String, view: js.Any): scala.Unit = js.native
    def moveView(id: scala.Double, view: js.Any): scala.Unit = js.native
    def reconstruct(): scala.Unit = js.native
    def removeView(id: js.Any): scala.Unit = js.native
    def resizeChildren(): scala.Unit = js.native
    def restore(state: js.Any): scala.Unit = js.native
    def restore(state: js.Any, factory: webixLib.webixMod.WebixCallback): scala.Unit = js.native
    def serialize(): js.Array[_] = js.native
    def serialize(serializer: webixLib.webixMod.WebixCallback): js.Array[_] = js.native
    def showBatch(name: java.lang.String): scala.Unit = js.native
    def showBatch(name: java.lang.String, mode: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait gridlayoutConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var cellHeight: js.UndefOr[scala.Double] = js.undefined
    var cellWidth: js.UndefOr[scala.Double] = js.undefined
    var cells: js.UndefOr[js.Array[_]] = js.undefined
    var cols: js.UndefOr[js.Array[_]] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var factory: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var gridColumns: js.UndefOr[scala.Double] = js.undefined
    var gridRows: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var margin: js.UndefOr[scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var padding: js.UndefOr[scala.Double] = js.undefined
    var paddingX: js.UndefOr[scala.Double] = js.undefined
    var paddingY: js.UndefOr[scala.Double] = js.undefined
    var responsive: js.UndefOr[java.lang.String] = js.undefined
    var rows: js.UndefOr[js.Array[_]] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var visibleBatch: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onChange
    - webixLib.webixLibStrings.onDestruct
  */
  trait gridlayoutEventName extends js.Object
  
  @js.native
  class gridsuggest () extends baseview {
    @JSName("$enterKey")
    var $enterKey_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_gridsuggest: gridsuggestConfig = js.native
    @JSName("$enterKey")
    def $enterKey(args: js.Any*): js.Any = js.native
    def attachEvent(`type`: gridsuggestEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: gridsuggestEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def close(): scala.Unit = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def getBody(): js.Any = js.native
    def getHead(): js.Any = js.native
    def getItemId(text: java.lang.String): java.lang.String | scala.Double = js.native
    def getItemText(id: java.lang.String): java.lang.String = js.native
    def getItemText(id: scala.Double): java.lang.String = js.native
    def getList(): baseview = js.native
    def getMasterValue(): js.Any = js.native
    def getSuggestion(): java.lang.String = js.native
    def getValue(): java.lang.String | scala.Double = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def linkInput(input: stdLib.HTMLElement): scala.Unit = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def resizeChildren(): scala.Unit = js.native
    def setMasterValue(value: js.Any): scala.Unit = js.native
    def setPosition(x: scala.Double, y: scala.Double): scala.Unit = js.native
    def setValue(value: java.lang.String): scala.Unit = js.native
    def setValue(value: scala.Double): scala.Unit = js.native
    def show(node: stdLib.HTMLElement): scala.Unit = js.native
    def show(node: stdLib.HTMLElement, position: js.Any): scala.Unit = js.native
    def show(node: stdLib.HTMLElement, position: js.Any, point: java.lang.String): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait gridsuggestConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var autofit: js.UndefOr[scala.Boolean] = js.undefined
    var autofocus: js.UndefOr[scala.Boolean] = js.undefined
    var body: js.UndefOr[java.lang.String | baseview] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var data: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var filter: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var fitMaster: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var head: js.UndefOr[js.Any] = js.undefined
    var headHeight: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var input: js.UndefOr[stdLib.HTMLElement | java.lang.String] = js.undefined
    var keyPressTimeout: js.UndefOr[scala.Double] = js.undefined
    var left: js.UndefOr[scala.Double] = js.undefined
    var master: js.UndefOr[baseview] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var modal: js.UndefOr[scala.Boolean] = js.undefined
    var move: js.UndefOr[scala.Boolean] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var padding: js.UndefOr[js.Any] = js.undefined
    var point: js.UndefOr[scala.Boolean] = js.undefined
    var position: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var relative: js.UndefOr[java.lang.String] = js.undefined
    var resize: js.UndefOr[scala.Boolean] = js.undefined
    var template: js.UndefOr[java.lang.String | webixLib.webixMod.WebixTemplate] = js.undefined
    var textValue: js.UndefOr[java.lang.String] = js.undefined
    var toFront: js.UndefOr[scala.Boolean] = js.undefined
    var top: js.UndefOr[scala.Double] = js.undefined
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    var url: js.UndefOr[java.lang.String] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
    var zIndex: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBeforeShow
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onHide
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onShow
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onValueSuggest
    - webixLib.webixLibStrings.onViewMove
    - webixLib.webixLibStrings.onViewMoveEnd
    - webixLib.webixLibStrings.onViewResize
  */
  trait gridsuggestEventName extends js.Object
  
  @js.native
  class grouplist () extends baseview {
    @JSName("$customPrint")
    var $customPrint_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$dragHTML")
    var $dragHTML_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$dropAllow")
    var $dropAllow_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_grouplist: grouplistConfig = js.native
    var data: webixLib.webixMod.DataStore = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var on_context: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    @JSName("on_dblclick")
    var on_dblclick_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("on_mouse_move")
    var on_mouse_move_Original: webixLib.webixMod.WebixCallback = js.native
    var `type`: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    var types: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    var waitData: js.Promise[_] = js.native
    @JSName("$customPrint")
    def $customPrint(args: js.Any*): js.Any = js.native
    @JSName("$drag")
    def $drag(source: stdLib.HTMLElement, ev: stdLib.Event): java.lang.String = js.native
    @JSName("$dragHTML")
    def $dragHTML(args: js.Any*): js.Any = js.native
    @JSName("$dragIn")
    def $dragIn(source: stdLib.HTMLElement, target: stdLib.HTMLElement, ev: stdLib.Event): stdLib.HTMLElement = js.native
    @JSName("$dragMark")
    def $dragMark(context: js.Any, ev: stdLib.Event): scala.Boolean = js.native
    @JSName("$dragOut")
    def $dragOut(
      source: stdLib.HTMLElement,
      old_target: stdLib.HTMLElement,
      new_target: stdLib.HTMLElement,
      ev: stdLib.Event
    ): scala.Unit = js.native
    @JSName("$drop")
    def $drop(source: stdLib.HTMLElement, target: stdLib.HTMLElement, ev: stdLib.Event): scala.Unit = js.native
    @JSName("$dropAllow")
    def $dropAllow(args: js.Any*): js.Any = js.native
    def add(obj: js.Any): java.lang.String | scala.Double = js.native
    def add(obj: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
    def addCss(id: java.lang.String, css: java.lang.String): scala.Unit = js.native
    def addCss(id: java.lang.String, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def addCss(id: scala.Double, css: java.lang.String): scala.Unit = js.native
    def addCss(id: scala.Double, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def attachEvent(`type`: grouplistEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: grouplistEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def clearAll(): scala.Unit = js.native
    def clearAll(soft: scala.Boolean): scala.Unit = js.native
    def clearCss(css: java.lang.String): scala.Unit = js.native
    def clearCss(css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def clearValidation(): scala.Unit = js.native
    def copy(sid: java.lang.String, tindex: scala.Double): scala.Unit = js.native
    def copy(sid: java.lang.String, tindex: scala.Double, tobj: js.Any): scala.Unit = js.native
    def copy(sid: java.lang.String, tindex: scala.Double, tobj: js.Any, details: js.Any): scala.Unit = js.native
    def copy(sid: scala.Double, tindex: scala.Double): scala.Unit = js.native
    def copy(sid: scala.Double, tindex: scala.Double, tobj: js.Any): scala.Unit = js.native
    def copy(sid: scala.Double, tindex: scala.Double, tobj: js.Any, details: js.Any): scala.Unit = js.native
    def count(): scala.Double = js.native
    def customize(obj: js.Any): scala.Unit = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def exists(id: java.lang.String): scala.Boolean = js.native
    def exists(id: scala.Double): scala.Boolean = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate): scala.Unit = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate, value: java.lang.String): scala.Unit = js.native
    def filter(
      text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate,
      value: java.lang.String,
      preserve: scala.Boolean
    ): scala.Unit = js.native
    def filter(text: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def find(criterion: webixLib.webixMod.WebixCallback): js.Any = js.native
    def find(criterion: webixLib.webixMod.WebixCallback, first: scala.Boolean): js.Any = js.native
    def getFirstId(): java.lang.String | scala.Double = js.native
    def getIdByIndex(index: scala.Double): java.lang.String | scala.Double = js.native
    def getIndexById(id: java.lang.String): scala.Double = js.native
    def getIndexById(id: scala.Double): scala.Double = js.native
    def getItem(id: java.lang.String): js.Any = js.native
    def getItem(id: scala.Double): js.Any = js.native
    def getItemNode(id: java.lang.String): stdLib.HTMLElement = js.native
    def getItemNode(id: scala.Double): stdLib.HTMLElement = js.native
    def getLastId(): java.lang.String | scala.Double = js.native
    def getNextId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getNextId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def getOpenState(): js.Any = js.native
    def getPage(): scala.Double = js.native
    def getPager(): js.Any = js.native
    def getPrevId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPrevId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def getScrollState(): js.Any = js.native
    def getSelectedId(as_array: scala.Boolean): java.lang.String | js.Array[_] = js.native
    def getSelectedItem(as_array: scala.Boolean): js.Any = js.native
    def getVisibleCount(): scala.Double = js.native
    def group(config: js.Any, mode: scala.Boolean): scala.Unit = js.native
    def hasCss(id: java.lang.String, css: java.lang.String): scala.Boolean = js.native
    def hasCss(id: scala.Double, css: java.lang.String): scala.Boolean = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def isSelected(id: java.lang.String): scala.Boolean = js.native
    def isSelected(id: scala.Double): scala.Boolean = js.native
    def load(url: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String, callback: webixLib.webixMod.WebixCallback): js.Promise[_] = js.native
    def loadNext(
      count: scala.Double,
      start: scala.Double,
      callback: webixLib.webixMod.WebixCallback,
      url: java.lang.String,
      now: scala.Boolean
    ): scala.Unit = js.native
    def locate(e: stdLib.Event): java.lang.String | scala.Double = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def move(sid: java.lang.String, tindex: scala.Double): java.lang.String = js.native
    def move(sid: java.lang.String, tindex: scala.Double, tobj: js.Any): java.lang.String = js.native
    def move(sid: java.lang.String, tindex: scala.Double, tobj: js.Any, details: js.Any): java.lang.String = js.native
    def moveBottom(id: java.lang.String): scala.Unit = js.native
    def moveBottom(id: scala.Double): scala.Unit = js.native
    def moveDown(id: java.lang.String, step: scala.Double): scala.Unit = js.native
    def moveDown(id: scala.Double, step: scala.Double): scala.Unit = js.native
    def moveSelection(direction: java.lang.String): scala.Unit = js.native
    def moveTop(id: java.lang.String): scala.Unit = js.native
    def moveTop(id: scala.Double): scala.Unit = js.native
    def moveUp(id: java.lang.String, step: scala.Double): scala.Unit = js.native
    def moveUp(id: scala.Double, step: scala.Double): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def on_dblclick(args: js.Any*): js.Any = js.native
    def on_mouse_move(args: js.Any*): js.Any = js.native
    def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def refresh(): scala.Unit = js.native
    def refresh(id: java.lang.String): scala.Unit = js.native
    def refresh(id: scala.Double): scala.Unit = js.native
    def remove(id: java.lang.String): scala.Unit = js.native
    def remove(id: scala.Double): scala.Unit = js.native
    def removeCss(id: java.lang.String, css: java.lang.String): scala.Unit = js.native
    def removeCss(id: java.lang.String, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def removeCss(id: scala.Double, css: java.lang.String): scala.Unit = js.native
    def removeCss(id: scala.Double, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def scrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
    def select(id: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def select(id: js.Array[_], preserve: scala.Boolean): scala.Unit = js.native
    def selectAll(): scala.Unit = js.native
    def selectAll(from: java.lang.String): scala.Unit = js.native
    def selectAll(from: java.lang.String, to: java.lang.String): scala.Unit = js.native
    def serialize(): js.Array[_] = js.native
    def setPage(page: scala.Double): scala.Unit = js.native
    def showItem(id: java.lang.String): scala.Unit = js.native
    def showItem(id: scala.Double): scala.Unit = js.native
    def sort(by: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String, as: java.lang.String): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def ungroup(mode: scala.Boolean): scala.Unit = js.native
    def unselect(): scala.Unit = js.native
    def unselect(id: java.lang.String): scala.Unit = js.native
    def unselectAll(): scala.Unit = js.native
    def updateItem(id: java.lang.String, data: js.Any): scala.Unit = js.native
    def updateItem(id: scala.Double, data: js.Any): scala.Unit = js.native
    def validate(): scala.Boolean = js.native
    def validate(id: java.lang.String): scala.Boolean = js.native
  }
  
  trait grouplistConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var autoheight: js.UndefOr[scala.Boolean] = js.undefined
    var autowidth: js.UndefOr[scala.Boolean] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var click: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var clipboard: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var data: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
    var dataFeed: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var datafetch: js.UndefOr[scala.Double] = js.undefined
    var datathrottle: js.UndefOr[scala.Double] = js.undefined
    var datatype: js.UndefOr[java.lang.String] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var drag: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var dragscroll: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var dynamic: js.UndefOr[scala.Boolean] = js.undefined
    var externalData: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var item: js.UndefOr[js.Any] = js.undefined
    var layout: js.UndefOr[java.lang.String] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var mouseEventDelay: js.UndefOr[scala.Double] = js.undefined
    var multiselect: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
    var navigation: js.UndefOr[scala.Boolean] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var onClick: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var onContext: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var onDblClick: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var onMouseMove: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var pager: js.UndefOr[js.Any] = js.undefined
    var ready: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var removeMissed: js.UndefOr[scala.Boolean] = js.undefined
    var rules: js.UndefOr[js.Any] = js.undefined
    var save: js.UndefOr[java.lang.String] = js.undefined
    var scheme: js.UndefOr[js.Any] = js.undefined
    var scroll: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var scrollSpeed: js.UndefOr[java.lang.String] = js.undefined
    var select: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var template: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var templateBack: js.UndefOr[java.lang.String | webixLib.webixMod.WebixTemplate] = js.undefined
    var templateCopy: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var templateGroup: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var templateItem: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var tooltip: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
    var `type`: js.UndefOr[js.Any] = js.undefined
    var url: js.UndefOr[js.Any] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
    var xCount: js.UndefOr[scala.Double] = js.undefined
    var yCount: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterAdd
    - webixLib.webixLibStrings.onAfterContextMenu
    - webixLib.webixLibStrings.onAfterDelete
    - webixLib.webixLibStrings.onAfterDrop
    - webixLib.webixLibStrings.onAfterDropOrder
    - webixLib.webixLibStrings.onAfterLoad
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onAfterSelect
    - webixLib.webixLibStrings.onAfterSort
    - webixLib.webixLibStrings.onBeforeAdd
    - webixLib.webixLibStrings.onBeforeContextMenu
    - webixLib.webixLibStrings.onBeforeDelete
    - webixLib.webixLibStrings.onBeforeDrag
    - webixLib.webixLibStrings.onBeforeDragIn
    - webixLib.webixLibStrings.onBeforeDrop
    - webixLib.webixLibStrings.onBeforeDropOrder
    - webixLib.webixLibStrings.onBeforeDropOut
    - webixLib.webixLibStrings.onBeforeLoad
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBeforeSelect
    - webixLib.webixLibStrings.onBeforeSort
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDataRequest
    - webixLib.webixLibStrings.onDataUpdate
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onDragOut
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onItemDblClick
    - webixLib.webixLibStrings.onItemRender
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLoadError
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onMouseMove
    - webixLib.webixLibStrings.onMouseMoving
    - webixLib.webixLibStrings.onMouseOut
    - webixLib.webixLibStrings.onPaste
    - webixLib.webixLibStrings.onSelectChange
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onValidationError
    - webixLib.webixLibStrings.onValidationSuccess
    - webixLib.webixLibStrings.onViewResize
  */
  trait grouplistEventName extends js.Object
  
  @js.native
  class headerlayout () extends baseview {
    @JSName("config")
    var config_headerlayout: headerlayoutConfig = js.native
    def addView(view: js.Any): java.lang.String | scala.Double = js.native
    def addView(view: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: headerlayoutEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: headerlayoutEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def index(obj: js.Any): scala.Double = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def reconstruct(): scala.Unit = js.native
    def removeView(id: js.Any): scala.Unit = js.native
    def resizeChildren(): scala.Unit = js.native
    def restore(state: js.Any): scala.Unit = js.native
    def restore(state: js.Any, factory: webixLib.webixMod.WebixCallback): scala.Unit = js.native
    def serialize(): js.Any = js.native
    def serialize(serializer: webixLib.webixMod.WebixCallback): js.Any = js.native
    def showBatch(name: java.lang.String): scala.Unit = js.native
    def showBatch(name: java.lang.String, mode: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait headerlayoutConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var collapsed: js.UndefOr[scala.Boolean] = js.undefined
    var cols: js.UndefOr[js.Array[_]] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var isolate: js.UndefOr[scala.Boolean] = js.undefined
    var margin: js.UndefOr[scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var multi: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var padding: js.UndefOr[scala.Double] = js.undefined
    var paddingX: js.UndefOr[scala.Double] = js.undefined
    var paddingY: js.UndefOr[scala.Double] = js.undefined
    var panelClass: js.UndefOr[java.lang.String] = js.undefined
    var responsive: js.UndefOr[java.lang.String] = js.undefined
    var rows: js.UndefOr[js.Array[_]] = js.undefined
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var visibleBatch: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterCollapse
    - webixLib.webixLibStrings.onAfterExpand
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onDestruct
  */
  trait headerlayoutEventName extends js.Object
  
  @js.native
  class hint () extends baseview {
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_hint: hintConfig = js.native
    def attachEvent(`type`: hintEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: hintEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def end(): scala.Unit = js.native
    def getCurrentStep(): scala.Double = js.native
    def getSteps(): js.Array[_] = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def resume(): scala.Unit = js.native
    def resume(stepNumber: scala.Double): scala.Unit = js.native
    def setSteps(steps: js.Array[_]): scala.Unit = js.native
    def start(): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait hintConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var nextButton: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var prevButton: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var steps: js.UndefOr[js.Array[_]] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onAfterStart
    - webixLib.webixLibStrings.onBeforeStart
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnd
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onNext
    - webixLib.webixLibStrings.onPrevious
    - webixLib.webixLibStrings.onSkip
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait hintEventName extends js.Object
  
  @js.native
  class htmlform () extends baseview {
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_htmlform: htmlformConfig = js.native
    def attachEvent(`type`: htmlformEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: htmlformEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def blur(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def clear(): scala.Unit = js.native
    def clear(all: scala.Boolean): scala.Unit = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def focus(item: java.lang.String): scala.Unit = js.native
    def getCleanValues(): js.Any = js.native
    def getDirtyValues(): js.Any = js.native
    def getScrollState(): js.Any = js.native
    def getValues(): js.Any = js.native
    def getValues(details: js.Any): js.Any = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def isDirty(): scala.Boolean = js.native
    def load(url: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String, callback: webixLib.webixMod.WebixCallback): js.Promise[_] = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def markInvalid(name: java.lang.String): scala.Unit = js.native
    def markInvalid(name: java.lang.String, state: java.lang.String): scala.Unit = js.native
    def markInvalid(name: java.lang.String, state: scala.Boolean): scala.Unit = js.native
    def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def refresh(): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def scrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
    def setContent(node: js.Any): scala.Unit = js.native
    def setDirty(): scala.Unit = js.native
    def setDirty(mark: scala.Boolean): scala.Unit = js.native
    def setHTML(html: java.lang.String): scala.Unit = js.native
    def setValues(values: js.Any): scala.Unit = js.native
    def setValues(values: js.Any, update: scala.Boolean): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait htmlformConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var autoheight: js.UndefOr[scala.Boolean] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var complexData: js.UndefOr[scala.Boolean] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var content: js.UndefOr[java.lang.String | scala.Double | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var data: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
    var datatype: js.UndefOr[java.lang.String] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var onClick: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var scroll: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var scrollSpeed: js.UndefOr[java.lang.String] = js.undefined
    var src: js.UndefOr[java.lang.String] = js.undefined
    var template: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var url: js.UndefOr[js.Any] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterLoad
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBeforeLoad
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onChange
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLoadError
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onValues
    - webixLib.webixLibStrings.onViewResize
  */
  trait htmlformEventName extends js.Object
  
  @js.native
  class icon () extends baseview {
    @JSName("$compareValue")
    var $compareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$prepareValue")
    var $prepareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_icon: iconConfig = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var touchable: scala.Boolean = js.native
    @JSName("$compareValue")
    def $compareValue(args: js.Any*): js.Any = js.native
    @JSName("$getValue")
    def $getValue(): java.lang.String = js.native
    @JSName("$prepareValue")
    def $prepareValue(args: js.Any*): js.Any = js.native
    @JSName("$renderInput")
    def $renderInput(config: js.Any): stdLib.HTMLElement = js.native
    @JSName("$setValue")
    def $setValue(value: java.lang.String): scala.Unit = js.native
    def attachEvent(`type`: iconEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: iconEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def blur(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def focus(): scala.Unit = js.native
    def getInputNode(): stdLib.HTMLElement = js.native
    def getValue(): java.lang.String = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def refresh(): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def setValue(value: java.lang.String): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait iconConfig extends js.Object {
    var align: js.UndefOr[java.lang.String] = js.undefined
    var animate: js.UndefOr[js.Any] = js.undefined
    var autowidth: js.UndefOr[scala.Boolean] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var click: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var hotkey: js.UndefOr[java.lang.String] = js.undefined
    var icon: js.UndefOr[java.lang.String] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var inputHeight: js.UndefOr[scala.Double] = js.undefined
    var inputWidth: js.UndefOr[scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var name: js.UndefOr[java.lang.String] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var popup: js.UndefOr[java.lang.String] = js.undefined
    var tooltip: js.UndefOr[java.lang.String] = js.undefined
    var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onChange
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait iconEventName extends js.Object
  
  @js.native
  class iframe () extends baseview {
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_iframe: iframeConfig = js.native
    def attachEvent(`type`: iframeEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: iframeEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def getIframe(): stdLib.HTMLElement = js.native
    def getWindow(): stdLib.HTMLElement = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def load(value: java.lang.String): scala.Unit = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait iframeConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var src: js.UndefOr[java.lang.String] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterLoad
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBeforeLoad
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait iframeEventName extends js.Object
  
  @js.native
  class kanban () extends baseview {
    @JSName("config")
    var config_kanban: kanbanConfig = js.native
    var data: webixLib.webixMod.DataStore = js.native
    var waitData: js.Promise[_] = js.native
    def add(obj: js.Any): java.lang.String | scala.Double = js.native
    def add(obj: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
    def addView(view: js.Any): java.lang.String | scala.Double = js.native
    def addView(view: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: kanbanEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: kanbanEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def clearAll(): scala.Unit = js.native
    def clearAll(soft: scala.Boolean): scala.Unit = js.native
    def count(): scala.Double = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def eachList(func: webixLib.webixMod.WebixCallback): scala.Unit = js.native
    def exists(id: java.lang.String): scala.Boolean = js.native
    def exists(id: scala.Double): scala.Boolean = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate): scala.Unit = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate, value: java.lang.String): scala.Unit = js.native
    def filter(
      text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate,
      value: java.lang.String,
      preserve: scala.Boolean
    ): scala.Unit = js.native
    def filter(text: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def find(criterion: webixLib.webixMod.WebixCallback): js.Any = js.native
    def find(criterion: webixLib.webixMod.WebixCallback, first: scala.Boolean): js.Any = js.native
    def getFirstId(): java.lang.String | scala.Double = js.native
    def getIdByIndex(index: scala.Double): java.lang.String | scala.Double = js.native
    def getIndexById(id: java.lang.String): scala.Double = js.native
    def getIndexById(id: scala.Double): scala.Double = js.native
    def getItem(id: java.lang.String): js.Any = js.native
    def getItem(id: scala.Double): js.Any = js.native
    def getLastId(): java.lang.String | scala.Double = js.native
    def getNextId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getNextId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def getOwnerList(itemId: java.lang.String): js.Any = js.native
    def getOwnerList(itemId: scala.Double): js.Any = js.native
    def getPrevId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPrevId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def getSelectedId(): java.lang.String | scala.Double = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def index(obj: js.Any): scala.Double = js.native
    def load(url: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String, callback: webixLib.webixMod.WebixCallback): js.Promise[_] = js.native
    def loadNext(
      count: scala.Double,
      start: scala.Double,
      callback: webixLib.webixMod.WebixCallback,
      url: java.lang.String,
      now: scala.Boolean
    ): scala.Unit = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def reconstruct(): scala.Unit = js.native
    def refresh(): scala.Unit = js.native
    def refresh(id: java.lang.String): scala.Unit = js.native
    def refresh(id: scala.Double): scala.Unit = js.native
    def remove(id: java.lang.String): scala.Unit = js.native
    def remove(id: scala.Double): scala.Unit = js.native
    def removeView(id: js.Any): scala.Unit = js.native
    def resizeChildren(): scala.Unit = js.native
    def restore(state: js.Any): scala.Unit = js.native
    def restore(state: js.Any, factory: webixLib.webixMod.WebixCallback): scala.Unit = js.native
    def select(id: java.lang.String): scala.Unit = js.native
    def select(id: scala.Double): scala.Unit = js.native
    def serialize(): js.Array[_] = js.native
    def setIndex(id: java.lang.String, index: scala.Double): scala.Unit = js.native
    def setIndex(id: scala.Double, index: scala.Double): scala.Unit = js.native
    def showBatch(name: java.lang.String): scala.Unit = js.native
    def showBatch(name: java.lang.String, mode: scala.Boolean): scala.Unit = js.native
    def sort(by: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String, as: java.lang.String): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def updateItem(id: java.lang.String, data: js.Any): scala.Unit = js.native
    def updateItem(id: scala.Double, data: js.Any): scala.Unit = js.native
  }
  
  trait kanbanConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var collapsed: js.UndefOr[scala.Boolean] = js.undefined
    var cols: js.UndefOr[js.Array[_]] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var data: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
    var dataFeed: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var datathrottle: js.UndefOr[scala.Double] = js.undefined
    var datatype: js.UndefOr[java.lang.String] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var isolate: js.UndefOr[scala.Boolean] = js.undefined
    var listFilter: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var margin: js.UndefOr[scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var multi: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var padding: js.UndefOr[scala.Double] = js.undefined
    var paddingX: js.UndefOr[scala.Double] = js.undefined
    var paddingY: js.UndefOr[scala.Double] = js.undefined
    var panelClass: js.UndefOr[java.lang.String] = js.undefined
    var ready: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var removeMissed: js.UndefOr[scala.Boolean] = js.undefined
    var responsive: js.UndefOr[java.lang.String] = js.undefined
    var rows: js.UndefOr[js.Array[_]] = js.undefined
    var save: js.UndefOr[java.lang.String] = js.undefined
    var scheme: js.UndefOr[js.Any] = js.undefined
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    var url: js.UndefOr[js.Any] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var visibleBatch: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterAdd
    - webixLib.webixLibStrings.onAfterCollapse
    - webixLib.webixLibStrings.onAfterDelete
    - webixLib.webixLibStrings.onAfterExpand
    - webixLib.webixLibStrings.onAfterLoad
    - webixLib.webixLibStrings.onAfterSort
    - webixLib.webixLibStrings.onAfterStatusChange
    - webixLib.webixLibStrings.onAvatarClick
    - webixLib.webixLibStrings.onBeforeAdd
    - webixLib.webixLibStrings.onBeforeDelete
    - webixLib.webixLibStrings.onBeforeLoad
    - webixLib.webixLibStrings.onBeforeSort
    - webixLib.webixLibStrings.onBeforeStatusChange
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onDataRequest
    - webixLib.webixLibStrings.onDataUpdate
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onListAfterContextMenu
    - webixLib.webixLibStrings.onListAfterDrop
    - webixLib.webixLibStrings.onListAfterSelect
    - webixLib.webixLibStrings.onListBeforeContextMenu
    - webixLib.webixLibStrings.onListBeforeDrag
    - webixLib.webixLibStrings.onListBeforeDragIn
    - webixLib.webixLibStrings.onListBeforeDrop
    - webixLib.webixLibStrings.onListBeforeSelect
    - webixLib.webixLibStrings.onListIconClick
    - webixLib.webixLibStrings.onListItemClick
    - webixLib.webixLibStrings.onListItemDblClick
    - webixLib.webixLibStrings.onLoadError
  */
  trait kanbanEventName extends js.Object
  
  @js.native
  class label () extends baseview {
    @JSName("$compareValue")
    var $compareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$prepareValue")
    var $prepareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_label: labelConfig = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var touchable: scala.Boolean = js.native
    @JSName("$compareValue")
    def $compareValue(args: js.Any*): js.Any = js.native
    @JSName("$getValue")
    def $getValue(): java.lang.String = js.native
    @JSName("$prepareValue")
    def $prepareValue(args: js.Any*): js.Any = js.native
    @JSName("$renderInput")
    def $renderInput(config: js.Any): stdLib.HTMLElement = js.native
    @JSName("$setValue")
    def $setValue(value: java.lang.String): scala.Unit = js.native
    def attachEvent(`type`: labelEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: labelEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def blur(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def focus(): scala.Unit = js.native
    def getInputNode(): stdLib.HTMLElement = js.native
    def getValue(): java.lang.String = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def refresh(): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def setHTML(html: java.lang.String): scala.Unit = js.native
    def setValue(value: java.lang.String): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait labelConfig extends js.Object {
    var align: js.UndefOr[java.lang.String] = js.undefined
    var animate: js.UndefOr[js.Any] = js.undefined
    var autowidth: js.UndefOr[scala.Boolean] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var click: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var hotkey: js.UndefOr[java.lang.String] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var inputHeight: js.UndefOr[scala.Double] = js.undefined
    var inputWidth: js.UndefOr[scala.Double] = js.undefined
    var label: js.UndefOr[java.lang.String] = js.undefined
    var labelPosition: js.UndefOr[java.lang.String] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var name: js.UndefOr[java.lang.String] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var popup: js.UndefOr[java.lang.String] = js.undefined
    var tooltip: js.UndefOr[java.lang.String] = js.undefined
    var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onChange
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait labelEventName extends js.Object
  
  @js.native
  class layout () extends baseview {
    @JSName("config")
    var config_layout: layoutConfig = js.native
    def addView(view: js.Any): java.lang.String | scala.Double = js.native
    def addView(view: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: layoutEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: layoutEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def index(obj: js.Any): scala.Double = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def reconstruct(): scala.Unit = js.native
    def removeView(id: js.Any): scala.Unit = js.native
    def resizeChildren(): scala.Unit = js.native
    def restore(state: js.Any, factory: webixLib.webixMod.WebixCallback, configOnly: scala.Boolean): scala.Unit = js.native
    def serialize(): js.Any = js.native
    def serialize(serializer: webixLib.webixMod.WebixCallback): js.Any = js.native
    def showBatch(name: java.lang.String): scala.Unit = js.native
    def showBatch(name: java.lang.String, mode: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait layoutConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var cols: js.UndefOr[js.Array[_]] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var isolate: js.UndefOr[scala.Boolean] = js.undefined
    var margin: js.UndefOr[scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var padding: js.UndefOr[scala.Double] = js.undefined
    var paddingX: js.UndefOr[scala.Double] = js.undefined
    var paddingY: js.UndefOr[scala.Double] = js.undefined
    var responsive: js.UndefOr[java.lang.String] = js.undefined
    var rows: js.UndefOr[js.Array[_]] = js.undefined
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var visibleBatch: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onDestruct
  */
  trait layoutEventName extends js.Object
  
  @js.native
  class list () extends baseview {
    @JSName("$customPrint")
    var $customPrint_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$dragHTML")
    var $dragHTML_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$dropAllow")
    var $dropAllow_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_list: listConfig = js.native
    var data: webixLib.webixMod.DataStore = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var on_context: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    @JSName("on_dblclick")
    var on_dblclick_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("on_mouse_move")
    var on_mouse_move_Original: webixLib.webixMod.WebixCallback = js.native
    var `type`: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    var types: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    var waitData: js.Promise[_] = js.native
    @JSName("$customPrint")
    def $customPrint(args: js.Any*): js.Any = js.native
    @JSName("$drag")
    def $drag(source: stdLib.HTMLElement, ev: stdLib.Event): java.lang.String = js.native
    @JSName("$dragHTML")
    def $dragHTML(args: js.Any*): js.Any = js.native
    @JSName("$dragIn")
    def $dragIn(source: stdLib.HTMLElement, target: stdLib.HTMLElement, ev: stdLib.Event): stdLib.HTMLElement = js.native
    @JSName("$dragMark")
    def $dragMark(context: js.Any, ev: stdLib.Event): scala.Boolean = js.native
    @JSName("$dragOut")
    def $dragOut(
      source: stdLib.HTMLElement,
      old_target: stdLib.HTMLElement,
      new_target: stdLib.HTMLElement,
      ev: stdLib.Event
    ): scala.Unit = js.native
    @JSName("$drop")
    def $drop(source: stdLib.HTMLElement, target: stdLib.HTMLElement, ev: stdLib.Event): scala.Unit = js.native
    @JSName("$dropAllow")
    def $dropAllow(args: js.Any*): js.Any = js.native
    def add(obj: js.Any): java.lang.String | scala.Double = js.native
    def add(obj: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
    def addCss(id: java.lang.String, css: java.lang.String): scala.Unit = js.native
    def addCss(id: java.lang.String, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def addCss(id: scala.Double, css: java.lang.String): scala.Unit = js.native
    def addCss(id: scala.Double, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def attachEvent(`type`: listEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: listEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def clearAll(): scala.Unit = js.native
    def clearAll(soft: scala.Boolean): scala.Unit = js.native
    def clearCss(css: java.lang.String): scala.Unit = js.native
    def clearCss(css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def clearValidation(): scala.Unit = js.native
    def copy(sid: java.lang.String, tindex: scala.Double): scala.Unit = js.native
    def copy(sid: java.lang.String, tindex: scala.Double, tobj: js.Any): scala.Unit = js.native
    def copy(sid: java.lang.String, tindex: scala.Double, tobj: js.Any, details: js.Any): scala.Unit = js.native
    def copy(sid: scala.Double, tindex: scala.Double): scala.Unit = js.native
    def copy(sid: scala.Double, tindex: scala.Double, tobj: js.Any): scala.Unit = js.native
    def copy(sid: scala.Double, tindex: scala.Double, tobj: js.Any, details: js.Any): scala.Unit = js.native
    def count(): scala.Double = js.native
    def customize(obj: js.Any): scala.Unit = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def exists(id: java.lang.String): scala.Boolean = js.native
    def exists(id: scala.Double): scala.Boolean = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate): scala.Unit = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate, value: java.lang.String): scala.Unit = js.native
    def filter(
      text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate,
      value: java.lang.String,
      preserve: scala.Boolean
    ): scala.Unit = js.native
    def filter(text: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def find(criterion: webixLib.webixMod.WebixCallback): js.Any = js.native
    def find(criterion: webixLib.webixMod.WebixCallback, first: scala.Boolean): js.Any = js.native
    def getFirstId(): java.lang.String | scala.Double = js.native
    def getIdByIndex(index: scala.Double): java.lang.String | scala.Double = js.native
    def getIndexById(id: java.lang.String): scala.Double = js.native
    def getIndexById(id: scala.Double): scala.Double = js.native
    def getItem(id: java.lang.String): js.Any = js.native
    def getItem(id: scala.Double): js.Any = js.native
    def getItemNode(id: java.lang.String): stdLib.HTMLElement = js.native
    def getItemNode(id: scala.Double): stdLib.HTMLElement = js.native
    def getLastId(): java.lang.String | scala.Double = js.native
    def getNextId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getNextId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPage(): scala.Double = js.native
    def getPager(): js.Any = js.native
    def getPrevId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPrevId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def getScrollState(): js.Any = js.native
    def getSelectedId(as_array: scala.Boolean): java.lang.String | js.Array[_] = js.native
    def getSelectedItem(as_array: scala.Boolean): js.Any = js.native
    def getVisibleCount(): scala.Double = js.native
    def hasCss(id: java.lang.String, css: java.lang.String): scala.Boolean = js.native
    def hasCss(id: scala.Double, css: java.lang.String): scala.Boolean = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def isSelected(id: java.lang.String): scala.Boolean = js.native
    def isSelected(id: scala.Double): scala.Boolean = js.native
    def load(url: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String, callback: webixLib.webixMod.WebixCallback): js.Promise[_] = js.native
    def loadNext(
      count: scala.Double,
      start: scala.Double,
      callback: webixLib.webixMod.WebixCallback,
      url: java.lang.String,
      now: scala.Boolean
    ): scala.Unit = js.native
    def locate(e: stdLib.Event): java.lang.String | scala.Double = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def move(sid: java.lang.String, tindex: scala.Double): java.lang.String = js.native
    def move(sid: java.lang.String, tindex: scala.Double, tobj: js.Any): java.lang.String = js.native
    def move(sid: java.lang.String, tindex: scala.Double, tobj: js.Any, details: js.Any): java.lang.String = js.native
    def moveBottom(id: java.lang.String): scala.Unit = js.native
    def moveBottom(id: scala.Double): scala.Unit = js.native
    def moveDown(id: java.lang.String, step: scala.Double): scala.Unit = js.native
    def moveDown(id: scala.Double, step: scala.Double): scala.Unit = js.native
    def moveSelection(direction: java.lang.String): scala.Unit = js.native
    def moveTop(id: java.lang.String): scala.Unit = js.native
    def moveTop(id: scala.Double): scala.Unit = js.native
    def moveUp(id: java.lang.String, step: scala.Double): scala.Unit = js.native
    def moveUp(id: scala.Double, step: scala.Double): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def on_dblclick(args: js.Any*): js.Any = js.native
    def on_mouse_move(args: js.Any*): js.Any = js.native
    def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def refresh(): scala.Unit = js.native
    def refresh(id: java.lang.String): scala.Unit = js.native
    def refresh(id: scala.Double): scala.Unit = js.native
    def remove(id: java.lang.String): scala.Unit = js.native
    def remove(id: scala.Double): scala.Unit = js.native
    def removeCss(id: java.lang.String, css: java.lang.String): scala.Unit = js.native
    def removeCss(id: java.lang.String, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def removeCss(id: scala.Double, css: java.lang.String): scala.Unit = js.native
    def removeCss(id: scala.Double, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def scrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
    def select(id: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def select(id: js.Array[_], preserve: scala.Boolean): scala.Unit = js.native
    def selectAll(): scala.Unit = js.native
    def selectAll(from: java.lang.String): scala.Unit = js.native
    def selectAll(from: java.lang.String, to: java.lang.String): scala.Unit = js.native
    def serialize(): js.Array[_] = js.native
    def setPage(page: scala.Double): scala.Unit = js.native
    def showItem(id: java.lang.String): scala.Unit = js.native
    def showItem(id: scala.Double): scala.Unit = js.native
    def sort(by: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String, as: java.lang.String): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def unselect(): scala.Unit = js.native
    def unselect(id: java.lang.String): scala.Unit = js.native
    def unselectAll(): scala.Unit = js.native
    def updateItem(id: java.lang.String, data: js.Any): scala.Unit = js.native
    def updateItem(id: scala.Double, data: js.Any): scala.Unit = js.native
    def validate(): scala.Boolean = js.native
    def validate(id: java.lang.String): scala.Boolean = js.native
  }
  
  trait listConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var autoheight: js.UndefOr[scala.Boolean] = js.undefined
    var autowidth: js.UndefOr[scala.Boolean] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var click: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var clipboard: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var data: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
    var dataFeed: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var datafetch: js.UndefOr[scala.Double] = js.undefined
    var datathrottle: js.UndefOr[scala.Double] = js.undefined
    var datatype: js.UndefOr[java.lang.String] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var drag: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var dragscroll: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var dynamic: js.UndefOr[scala.Boolean] = js.undefined
    var externalData: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var item: js.UndefOr[js.Any] = js.undefined
    var layout: js.UndefOr[java.lang.String] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var mouseEventDelay: js.UndefOr[scala.Double] = js.undefined
    var multiselect: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
    var navigation: js.UndefOr[scala.Boolean] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var onClick: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var onContext: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var onDblClick: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var onMouseMove: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var pager: js.UndefOr[js.Any] = js.undefined
    var ready: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var removeMissed: js.UndefOr[scala.Boolean] = js.undefined
    var rules: js.UndefOr[js.Any] = js.undefined
    var save: js.UndefOr[java.lang.String] = js.undefined
    var scheme: js.UndefOr[js.Any] = js.undefined
    var scroll: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var scrollSpeed: js.UndefOr[java.lang.String] = js.undefined
    var select: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var template: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var templateCopy: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var tooltip: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
    var `type`: js.UndefOr[js.Any] = js.undefined
    var url: js.UndefOr[js.Any] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
    var xCount: js.UndefOr[scala.Double] = js.undefined
    var yCount: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterAdd
    - webixLib.webixLibStrings.onAfterContextMenu
    - webixLib.webixLibStrings.onAfterDelete
    - webixLib.webixLibStrings.onAfterDrop
    - webixLib.webixLibStrings.onAfterDropOrder
    - webixLib.webixLibStrings.onAfterLoad
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onAfterSelect
    - webixLib.webixLibStrings.onAfterSort
    - webixLib.webixLibStrings.onBeforeAdd
    - webixLib.webixLibStrings.onBeforeContextMenu
    - webixLib.webixLibStrings.onBeforeDelete
    - webixLib.webixLibStrings.onBeforeDrag
    - webixLib.webixLibStrings.onBeforeDragIn
    - webixLib.webixLibStrings.onBeforeDrop
    - webixLib.webixLibStrings.onBeforeDropOrder
    - webixLib.webixLibStrings.onBeforeDropOut
    - webixLib.webixLibStrings.onBeforeLoad
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBeforeSelect
    - webixLib.webixLibStrings.onBeforeSort
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDataRequest
    - webixLib.webixLibStrings.onDataUpdate
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onDragOut
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onItemDblClick
    - webixLib.webixLibStrings.onItemRender
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLoadError
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onMouseMove
    - webixLib.webixLibStrings.onMouseMoving
    - webixLib.webixLibStrings.onMouseOut
    - webixLib.webixLibStrings.onPaste
    - webixLib.webixLibStrings.onSelectChange
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onValidationError
    - webixLib.webixLibStrings.onValidationSuccess
    - webixLib.webixLibStrings.onViewResize
  */
  trait listEventName extends js.Object
  
  @js.native
  class menu () extends baseview {
    @JSName("$customPrint")
    var $customPrint_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$dragHTML")
    var $dragHTML_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$dropAllow")
    var $dropAllow_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_menu: menuConfig = js.native
    var data: webixLib.webixMod.DataStore = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var on_context: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    @JSName("on_dblclick")
    var on_dblclick_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("on_mouse_move")
    var on_mouse_move_Original: webixLib.webixMod.WebixCallback = js.native
    var `type`: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    var types: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    var waitData: js.Promise[_] = js.native
    @JSName("$customPrint")
    def $customPrint(args: js.Any*): js.Any = js.native
    @JSName("$drag")
    def $drag(source: stdLib.HTMLElement, ev: stdLib.Event): java.lang.String = js.native
    @JSName("$dragHTML")
    def $dragHTML(args: js.Any*): js.Any = js.native
    @JSName("$dragIn")
    def $dragIn(source: stdLib.HTMLElement, target: stdLib.HTMLElement, ev: stdLib.Event): stdLib.HTMLElement = js.native
    @JSName("$dragMark")
    def $dragMark(context: js.Any, ev: stdLib.Event): scala.Boolean = js.native
    @JSName("$dragOut")
    def $dragOut(
      source: stdLib.HTMLElement,
      old_target: stdLib.HTMLElement,
      new_target: stdLib.HTMLElement,
      ev: stdLib.Event
    ): scala.Unit = js.native
    @JSName("$drop")
    def $drop(source: stdLib.HTMLElement, target: stdLib.HTMLElement, ev: stdLib.Event): scala.Unit = js.native
    @JSName("$dropAllow")
    def $dropAllow(args: js.Any*): js.Any = js.native
    def add(obj: js.Any): java.lang.String | scala.Double = js.native
    def add(obj: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
    def addCss(id: java.lang.String, css: java.lang.String): scala.Unit = js.native
    def addCss(id: java.lang.String, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def addCss(id: scala.Double, css: java.lang.String): scala.Unit = js.native
    def addCss(id: scala.Double, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def attachEvent(`type`: menuEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: menuEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def clearAll(): scala.Unit = js.native
    def clearAll(soft: scala.Boolean): scala.Unit = js.native
    def clearCss(css: java.lang.String): scala.Unit = js.native
    def clearCss(css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def clearValidation(): scala.Unit = js.native
    def copy(sid: java.lang.String, tindex: scala.Double): scala.Unit = js.native
    def copy(sid: java.lang.String, tindex: scala.Double, tobj: js.Any): scala.Unit = js.native
    def copy(sid: java.lang.String, tindex: scala.Double, tobj: js.Any, details: js.Any): scala.Unit = js.native
    def copy(sid: scala.Double, tindex: scala.Double): scala.Unit = js.native
    def copy(sid: scala.Double, tindex: scala.Double, tobj: js.Any): scala.Unit = js.native
    def copy(sid: scala.Double, tindex: scala.Double, tobj: js.Any, details: js.Any): scala.Unit = js.native
    def count(): scala.Double = js.native
    def customize(obj: js.Any): scala.Unit = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def disableItem(id: java.lang.String): scala.Unit = js.native
    def disableItem(id: scala.Double): scala.Unit = js.native
    def enableItem(id: java.lang.String): scala.Unit = js.native
    def enableItem(id: scala.Double): scala.Unit = js.native
    def exists(id: java.lang.String): scala.Boolean = js.native
    def exists(id: scala.Double): scala.Boolean = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate): scala.Unit = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate, value: java.lang.String): scala.Unit = js.native
    def filter(
      text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate,
      value: java.lang.String,
      preserve: scala.Boolean
    ): scala.Unit = js.native
    def filter(text: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def find(criterion: webixLib.webixMod.WebixCallback): js.Any = js.native
    def find(criterion: webixLib.webixMod.WebixCallback, first: scala.Boolean): js.Any = js.native
    def getFirstId(): java.lang.String | scala.Double = js.native
    def getIdByIndex(index: scala.Double): java.lang.String | scala.Double = js.native
    def getIndexById(id: java.lang.String): scala.Double = js.native
    def getIndexById(id: scala.Double): scala.Double = js.native
    def getItem(id: java.lang.String): js.Any = js.native
    def getItem(id: scala.Double): js.Any = js.native
    def getItemNode(id: java.lang.String): stdLib.HTMLElement = js.native
    def getItemNode(id: scala.Double): stdLib.HTMLElement = js.native
    def getLastId(): java.lang.String | scala.Double = js.native
    def getMenu(id: java.lang.String): js.Any = js.native
    def getMenu(id: scala.Double): js.Any = js.native
    def getMenuItem(id: java.lang.String): js.Any = js.native
    def getMenuItem(id: scala.Double): js.Any = js.native
    def getNextId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getNextId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPage(): scala.Double = js.native
    def getPager(): js.Any = js.native
    def getPrevId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPrevId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def getScrollState(): js.Any = js.native
    def getSelectedId(as_array: scala.Boolean): java.lang.String | js.Array[_] = js.native
    def getSelectedItem(as_array: scala.Boolean): js.Any = js.native
    def getSubMenu(id: java.lang.String): js.Any = js.native
    def getSubMenu(id: scala.Double): js.Any = js.native
    def getTopMenu(): js.Any = js.native
    def getVisibleCount(): scala.Double = js.native
    def hasCss(id: java.lang.String, css: java.lang.String): scala.Boolean = js.native
    def hasCss(id: scala.Double, css: java.lang.String): scala.Boolean = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def hideItem(id: java.lang.String): scala.Unit = js.native
    def hideItem(id: scala.Double): scala.Unit = js.native
    def isSelected(id: java.lang.String): scala.Boolean = js.native
    def isSelected(id: scala.Double): scala.Boolean = js.native
    def load(url: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String, callback: webixLib.webixMod.WebixCallback): js.Promise[_] = js.native
    def loadNext(
      count: scala.Double,
      start: scala.Double,
      callback: webixLib.webixMod.WebixCallback,
      url: java.lang.String,
      now: scala.Boolean
    ): scala.Unit = js.native
    def locate(e: stdLib.Event): java.lang.String | scala.Double = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def move(sid: java.lang.String, tindex: scala.Double): java.lang.String = js.native
    def move(sid: java.lang.String, tindex: scala.Double, tobj: js.Any): java.lang.String = js.native
    def move(sid: java.lang.String, tindex: scala.Double, tobj: js.Any, details: js.Any): java.lang.String = js.native
    def moveBottom(id: java.lang.String): scala.Unit = js.native
    def moveBottom(id: scala.Double): scala.Unit = js.native
    def moveDown(id: java.lang.String, step: scala.Double): scala.Unit = js.native
    def moveDown(id: scala.Double, step: scala.Double): scala.Unit = js.native
    def moveSelection(direction: java.lang.String): scala.Unit = js.native
    def moveTop(id: java.lang.String): scala.Unit = js.native
    def moveTop(id: scala.Double): scala.Unit = js.native
    def moveUp(id: java.lang.String, step: scala.Double): scala.Unit = js.native
    def moveUp(id: scala.Double, step: scala.Double): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def on_dblclick(args: js.Any*): js.Any = js.native
    def on_mouse_move(args: js.Any*): js.Any = js.native
    def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def refresh(): scala.Unit = js.native
    def refresh(id: java.lang.String): scala.Unit = js.native
    def refresh(id: scala.Double): scala.Unit = js.native
    def remove(id: java.lang.String): scala.Unit = js.native
    def remove(id: scala.Double): scala.Unit = js.native
    def removeCss(id: java.lang.String, css: java.lang.String): scala.Unit = js.native
    def removeCss(id: java.lang.String, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def removeCss(id: scala.Double, css: java.lang.String): scala.Unit = js.native
    def removeCss(id: scala.Double, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def scrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
    def select(id: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def select(id: js.Array[_], preserve: scala.Boolean): scala.Unit = js.native
    def selectAll(): scala.Unit = js.native
    def selectAll(from: java.lang.String): scala.Unit = js.native
    def selectAll(from: java.lang.String, to: java.lang.String): scala.Unit = js.native
    def serialize(): js.Array[_] = js.native
    def setPage(page: scala.Double): scala.Unit = js.native
    def showItem(id: java.lang.String): scala.Unit = js.native
    def showItem(id: scala.Double): scala.Unit = js.native
    def sizeToContent(): scala.Unit = js.native
    def sort(by: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String, as: java.lang.String): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def unselect(): scala.Unit = js.native
    def unselect(id: java.lang.String): scala.Unit = js.native
    def unselectAll(): scala.Unit = js.native
    def updateItem(id: java.lang.String, data: js.Any): scala.Unit = js.native
    def updateItem(id: scala.Double, data: js.Any): scala.Unit = js.native
    def validate(): scala.Boolean = js.native
    def validate(id: java.lang.String): scala.Boolean = js.native
  }
  
  trait menuConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var autoheight: js.UndefOr[scala.Boolean] = js.undefined
    var autowidth: js.UndefOr[scala.Boolean] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var click: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var clipboard: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var data: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
    var dataFeed: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var datafetch: js.UndefOr[scala.Double] = js.undefined
    var datathrottle: js.UndefOr[scala.Double] = js.undefined
    var datatype: js.UndefOr[java.lang.String] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var drag: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var dragscroll: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var dynamic: js.UndefOr[scala.Boolean] = js.undefined
    var externalData: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var item: js.UndefOr[js.Any] = js.undefined
    var layout: js.UndefOr[java.lang.String] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var mouseEventDelay: js.UndefOr[scala.Double] = js.undefined
    var multiselect: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
    var navigation: js.UndefOr[scala.Boolean] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var onClick: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var onContext: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var onDblClick: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var onMouseMove: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var openAction: js.UndefOr[java.lang.String] = js.undefined
    var pager: js.UndefOr[js.Any] = js.undefined
    var ready: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var removeMissed: js.UndefOr[scala.Boolean] = js.undefined
    var rules: js.UndefOr[js.Any] = js.undefined
    var save: js.UndefOr[java.lang.String] = js.undefined
    var scheme: js.UndefOr[js.Any] = js.undefined
    var scroll: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var scrollSpeed: js.UndefOr[java.lang.String] = js.undefined
    var select: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var subMenuPos: js.UndefOr[java.lang.String] = js.undefined
    var submenuConfig: js.UndefOr[js.Any] = js.undefined
    var template: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var templateCopy: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var tooltip: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
    var `type`: js.UndefOr[js.Any] = js.undefined
    var url: js.UndefOr[js.Any] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
    var xCount: js.UndefOr[scala.Double] = js.undefined
    var yCount: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterAdd
    - webixLib.webixLibStrings.onAfterContextMenu
    - webixLib.webixLibStrings.onAfterDelete
    - webixLib.webixLibStrings.onAfterDrop
    - webixLib.webixLibStrings.onAfterDropOrder
    - webixLib.webixLibStrings.onAfterLoad
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onAfterSelect
    - webixLib.webixLibStrings.onAfterSort
    - webixLib.webixLibStrings.onBeforeAdd
    - webixLib.webixLibStrings.onBeforeContextMenu
    - webixLib.webixLibStrings.onBeforeDelete
    - webixLib.webixLibStrings.onBeforeDrag
    - webixLib.webixLibStrings.onBeforeDragIn
    - webixLib.webixLibStrings.onBeforeDrop
    - webixLib.webixLibStrings.onBeforeDropOrder
    - webixLib.webixLibStrings.onBeforeDropOut
    - webixLib.webixLibStrings.onBeforeLoad
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBeforeSelect
    - webixLib.webixLibStrings.onBeforeSort
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDataRequest
    - webixLib.webixLibStrings.onDataUpdate
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onDragOut
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onItemDblClick
    - webixLib.webixLibStrings.onItemRender
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLoadError
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onMenuItemClick
    - webixLib.webixLibStrings.onMouseMove
    - webixLib.webixLibStrings.onMouseMoving
    - webixLib.webixLibStrings.onMouseOut
    - webixLib.webixLibStrings.onPaste
    - webixLib.webixLibStrings.onSelectChange
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onValidationError
    - webixLib.webixLibStrings.onValidationSuccess
    - webixLib.webixLibStrings.onViewResize
  */
  trait menuEventName extends js.Object
  
  @js.native
  class multicombo () extends baseview {
    @JSName("$compareValue")
    var $compareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$cssName")
    var $cssName: java.lang.String = js.native
    @JSName("$prepareValue")
    var $prepareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$render")
    var $render_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_multicombo: multicomboConfig = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var touchable: scala.Boolean = js.native
    @JSName("$compareValue")
    def $compareValue(args: js.Any*): js.Any = js.native
    @JSName("$getValue")
    def $getValue(): java.lang.String = js.native
    @JSName("$prepareValue")
    def $prepareValue(args: js.Any*): js.Any = js.native
    @JSName("$render")
    def $render(args: js.Any*): js.Any = js.native
    @JSName("$renderInput")
    def $renderInput(obj: js.Any, html: java.lang.String, id: java.lang.String): java.lang.String = js.native
    @JSName("$renderInput")
    def $renderInput(obj: js.Any, html: java.lang.String, id: scala.Double): java.lang.String = js.native
    @JSName("$renderLabel")
    def $renderLabel(config: js.Any, id: java.lang.String): java.lang.String = js.native
    @JSName("$renderLabel")
    def $renderLabel(config: js.Any, id: scala.Double): java.lang.String = js.native
    @JSName("$setValue")
    def $setValue(value: java.lang.String): scala.Unit = js.native
    def attachEvent(`type`: multicomboEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: multicomboEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def blur(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def focus(): scala.Unit = js.native
    def getInputNode(): stdLib.HTMLElement = js.native
    def getList(): baseview = js.native
    def getPopup(): baseview = js.native
    def getText(): java.lang.String = js.native
    def getValue(): java.lang.String = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def refresh(): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def setBottomText(text: java.lang.String): scala.Unit = js.native
    def setValue(value: java.lang.String): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def validate(): scala.Boolean = js.native
  }
  
  trait multicomboConfig extends js.Object {
    var align: js.UndefOr[java.lang.String] = js.undefined
    var animate: js.UndefOr[js.Any] = js.undefined
    var attributes: js.UndefOr[js.Any] = js.undefined
    var autowidth: js.UndefOr[scala.Boolean] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var bottomLabel: js.UndefOr[java.lang.String] = js.undefined
    var bottomPadding: js.UndefOr[scala.Double] = js.undefined
    var button: js.UndefOr[scala.Boolean] = js.undefined
    var click: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var format: js.UndefOr[js.Any] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var hotkey: js.UndefOr[java.lang.String] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var inputAlign: js.UndefOr[java.lang.String] = js.undefined
    var inputHeight: js.UndefOr[scala.Double] = js.undefined
    var inputPadding: js.UndefOr[scala.Double] = js.undefined
    var inputWidth: js.UndefOr[scala.Double] = js.undefined
    var invalid: js.UndefOr[scala.Boolean] = js.undefined
    var invalidMessage: js.UndefOr[java.lang.String] = js.undefined
    var keepText: js.UndefOr[scala.Boolean] = js.undefined
    var label: js.UndefOr[java.lang.String] = js.undefined
    var labelAlign: js.UndefOr[java.lang.String] = js.undefined
    var labelPosition: js.UndefOr[java.lang.String] = js.undefined
    var labelWidth: js.UndefOr[scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var name: js.UndefOr[java.lang.String] = js.undefined
    var newValues: js.UndefOr[scala.Boolean] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var optionWidth: js.UndefOr[scala.Double] = js.undefined
    var options: js.UndefOr[js.Any] = js.undefined
    var placeholder: js.UndefOr[java.lang.String] = js.undefined
    var popup: js.UndefOr[java.lang.String] = js.undefined
    var popupWidth: js.UndefOr[scala.Double] = js.undefined
    var readonly: js.UndefOr[scala.Boolean] = js.undefined
    var relatedAction: js.UndefOr[java.lang.String] = js.undefined
    var relatedView: js.UndefOr[java.lang.String] = js.undefined
    var required: js.UndefOr[scala.Boolean] = js.undefined
    var separator: js.UndefOr[java.lang.String] = js.undefined
    var suggest: js.UndefOr[js.Any] = js.undefined
    var tagMode: js.UndefOr[scala.Boolean] = js.undefined
    var tagTemplate: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var tooltip: js.UndefOr[java.lang.String] = js.undefined
    var validate: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var validateEvent: js.UndefOr[java.lang.String] = js.undefined
    var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onChange
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait multicomboEventName extends js.Object
  
  @js.native
  class multiselect () extends baseview {
    @JSName("$compareValue")
    var $compareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$cssName")
    var $cssName: java.lang.String = js.native
    @JSName("$prepareValue")
    var $prepareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$renderIcon")
    var $renderIcon_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$render")
    var $render_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_multiselect: multiselectConfig = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var touchable: scala.Boolean = js.native
    @JSName("$compareValue")
    def $compareValue(args: js.Any*): js.Any = js.native
    @JSName("$getValue")
    def $getValue(): java.lang.String = js.native
    @JSName("$prepareValue")
    def $prepareValue(args: js.Any*): js.Any = js.native
    @JSName("$render")
    def $render(args: js.Any*): js.Any = js.native
    @JSName("$renderIcon")
    def $renderIcon(args: js.Any*): js.Any = js.native
    @JSName("$renderInput")
    def $renderInput(obj: js.Any, html: java.lang.String, id: java.lang.String): java.lang.String = js.native
    @JSName("$renderInput")
    def $renderInput(obj: js.Any, html: java.lang.String, id: scala.Double): java.lang.String = js.native
    @JSName("$renderLabel")
    def $renderLabel(config: js.Any, id: java.lang.String): java.lang.String = js.native
    @JSName("$renderLabel")
    def $renderLabel(config: js.Any, id: scala.Double): java.lang.String = js.native
    @JSName("$setValue")
    def $setValue(value: java.lang.String): scala.Unit = js.native
    def attachEvent(`type`: multiselectEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: multiselectEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def blur(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def focus(): scala.Unit = js.native
    def getInputNode(): stdLib.HTMLElement = js.native
    def getList(): baseview = js.native
    def getPopup(): baseview = js.native
    def getText(): java.lang.String = js.native
    def getValue(): java.lang.String = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def refresh(): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def setBottomText(text: java.lang.String): scala.Unit = js.native
    def setValue(value: java.lang.String): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def validate(): scala.Boolean = js.native
  }
  
  trait multiselectConfig extends js.Object {
    var align: js.UndefOr[java.lang.String] = js.undefined
    var animate: js.UndefOr[js.Any] = js.undefined
    var attributes: js.UndefOr[js.Any] = js.undefined
    var autowidth: js.UndefOr[scala.Boolean] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var bottomLabel: js.UndefOr[java.lang.String] = js.undefined
    var bottomPadding: js.UndefOr[scala.Double] = js.undefined
    var click: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var format: js.UndefOr[js.Any] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var hotkey: js.UndefOr[java.lang.String] = js.undefined
    var icon: js.UndefOr[java.lang.String] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var inputAlign: js.UndefOr[java.lang.String] = js.undefined
    var inputHeight: js.UndefOr[scala.Double] = js.undefined
    var inputPadding: js.UndefOr[scala.Double] = js.undefined
    var inputWidth: js.UndefOr[scala.Double] = js.undefined
    var invalid: js.UndefOr[scala.Boolean] = js.undefined
    var invalidMessage: js.UndefOr[java.lang.String] = js.undefined
    var label: js.UndefOr[java.lang.String] = js.undefined
    var labelAlign: js.UndefOr[java.lang.String] = js.undefined
    var labelPosition: js.UndefOr[java.lang.String] = js.undefined
    var labelWidth: js.UndefOr[scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var name: js.UndefOr[java.lang.String] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var optionWidth: js.UndefOr[scala.Double] = js.undefined
    var options: js.UndefOr[js.Any] = js.undefined
    var placeholder: js.UndefOr[java.lang.String] = js.undefined
    var popup: js.UndefOr[java.lang.String] = js.undefined
    var popupWidth: js.UndefOr[scala.Double] = js.undefined
    var readonly: js.UndefOr[scala.Boolean] = js.undefined
    var relatedAction: js.UndefOr[java.lang.String] = js.undefined
    var relatedView: js.UndefOr[java.lang.String] = js.undefined
    var required: js.UndefOr[scala.Boolean] = js.undefined
    var separator: js.UndefOr[java.lang.String] = js.undefined
    var suggest: js.UndefOr[js.Any] = js.undefined
    var tooltip: js.UndefOr[java.lang.String] = js.undefined
    var validate: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var validateEvent: js.UndefOr[java.lang.String] = js.undefined
    var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onChange
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait multiselectEventName extends js.Object
  
  @js.native
  class multisuggest () extends baseview {
    @JSName("$enterKey")
    var $enterKey_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_multisuggest: multisuggestConfig = js.native
    @JSName("$enterKey")
    def $enterKey(args: js.Any*): js.Any = js.native
    def attachEvent(`type`: multisuggestEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: multisuggestEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def close(): scala.Unit = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def getBody(): js.Any = js.native
    def getButton(): baseview = js.native
    def getHead(): js.Any = js.native
    def getItemId(text: java.lang.String): java.lang.String | scala.Double = js.native
    def getItemText(id: java.lang.String): java.lang.String = js.native
    def getItemText(id: scala.Double): java.lang.String = js.native
    def getList(): baseview = js.native
    def getMasterValue(): js.Any = js.native
    def getSuggestion(): java.lang.String = js.native
    def getValue(): java.lang.String | scala.Double = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def linkInput(input: stdLib.HTMLElement): scala.Unit = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def resizeChildren(): scala.Unit = js.native
    def setMasterValue(value: js.Any): scala.Unit = js.native
    def setPosition(x: scala.Double, y: scala.Double): scala.Unit = js.native
    def setValue(value: java.lang.String): scala.Unit = js.native
    def setValue(value: scala.Double): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait multisuggestConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var autofit: js.UndefOr[scala.Boolean] = js.undefined
    var autofocus: js.UndefOr[scala.Boolean] = js.undefined
    var body: js.UndefOr[java.lang.String | baseview] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var button: js.UndefOr[scala.Boolean] = js.undefined
    var buttonText: js.UndefOr[java.lang.String] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var data: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var filter: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var fitMaster: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var head: js.UndefOr[js.Any] = js.undefined
    var headHeight: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var input: js.UndefOr[stdLib.HTMLElement | java.lang.String] = js.undefined
    var keyPressTimeout: js.UndefOr[scala.Double] = js.undefined
    var left: js.UndefOr[scala.Double] = js.undefined
    var master: js.UndefOr[baseview] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var modal: js.UndefOr[scala.Boolean] = js.undefined
    var move: js.UndefOr[scala.Boolean] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var padding: js.UndefOr[js.Any] = js.undefined
    var point: js.UndefOr[scala.Boolean] = js.undefined
    var position: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var relative: js.UndefOr[java.lang.String] = js.undefined
    var resize: js.UndefOr[scala.Boolean] = js.undefined
    var separator: js.UndefOr[java.lang.String] = js.undefined
    var template: js.UndefOr[java.lang.String | webixLib.webixMod.WebixTemplate] = js.undefined
    var textValue: js.UndefOr[java.lang.String] = js.undefined
    var toFront: js.UndefOr[scala.Boolean] = js.undefined
    var top: js.UndefOr[scala.Double] = js.undefined
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    var url: js.UndefOr[java.lang.String] = js.undefined
    var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
    var zIndex: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBeforeShow
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onHide
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onShow
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onValueSuggest
    - webixLib.webixLibStrings.onViewMove
    - webixLib.webixLibStrings.onViewMoveEnd
    - webixLib.webixLibStrings.onViewResize
  */
  trait multisuggestEventName extends js.Object
  
  @js.native
  class multitext () extends baseview {
    @JSName("$compareValue")
    var $compareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$cssName")
    var $cssName: java.lang.String = js.native
    @JSName("$prepareValue")
    var $prepareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$renderIcon")
    var $renderIcon_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$render")
    var $render_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_multitext: multitextConfig = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var touchable: scala.Boolean = js.native
    @JSName("$compareValue")
    def $compareValue(args: js.Any*): js.Any = js.native
    @JSName("$getValue")
    def $getValue(): java.lang.String = js.native
    @JSName("$prepareValue")
    def $prepareValue(args: js.Any*): js.Any = js.native
    @JSName("$render")
    def $render(args: js.Any*): js.Any = js.native
    @JSName("$renderIcon")
    def $renderIcon(args: js.Any*): js.Any = js.native
    @JSName("$renderInput")
    def $renderInput(obj: js.Any, html: java.lang.String, id: java.lang.String): java.lang.String = js.native
    @JSName("$renderInput")
    def $renderInput(obj: js.Any, html: java.lang.String, id: scala.Double): java.lang.String = js.native
    @JSName("$renderLabel")
    def $renderLabel(config: js.Any, id: java.lang.String): java.lang.String = js.native
    @JSName("$renderLabel")
    def $renderLabel(config: js.Any, id: scala.Double): java.lang.String = js.native
    @JSName("$setValue")
    def $setValue(value: java.lang.String): scala.Unit = js.native
    def addSection(): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: multitextEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: multitextEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def blur(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def focus(): scala.Unit = js.native
    def getInputNode(): stdLib.HTMLElement = js.native
    def getValue(): java.lang.String = js.native
    def getValueHere(): java.lang.String = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def refresh(): scala.Unit = js.native
    def removeSection(): scala.Unit = js.native
    def removeSection(id: java.lang.String): scala.Unit = js.native
    def removeSection(id: scala.Double): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def setBottomText(text: java.lang.String): scala.Unit = js.native
    def setValue(value: java.lang.String): scala.Unit = js.native
    def setValueHere(value: java.lang.String): scala.Unit = js.native
    def setValueHere(value: scala.Double): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def validate(): scala.Boolean = js.native
  }
  
  trait multitextConfig extends js.Object {
    var align: js.UndefOr[java.lang.String] = js.undefined
    var animate: js.UndefOr[js.Any] = js.undefined
    var attributes: js.UndefOr[js.Any] = js.undefined
    var autowidth: js.UndefOr[scala.Boolean] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var bottomLabel: js.UndefOr[java.lang.String] = js.undefined
    var bottomPadding: js.UndefOr[scala.Double] = js.undefined
    var click: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var format: js.UndefOr[js.Any] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var hotkey: js.UndefOr[java.lang.String] = js.undefined
    var icon: js.UndefOr[java.lang.String] = js.undefined
    var iconWidth: js.UndefOr[java.lang.String] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var inputAlign: js.UndefOr[java.lang.String] = js.undefined
    var inputHeight: js.UndefOr[scala.Double] = js.undefined
    var inputPadding: js.UndefOr[scala.Double] = js.undefined
    var inputWidth: js.UndefOr[scala.Double] = js.undefined
    var invalid: js.UndefOr[scala.Boolean] = js.undefined
    var invalidMessage: js.UndefOr[java.lang.String] = js.undefined
    var label: js.UndefOr[java.lang.String] = js.undefined
    var labelAlign: js.UndefOr[java.lang.String] = js.undefined
    var labelPosition: js.UndefOr[java.lang.String] = js.undefined
    var labelWidth: js.UndefOr[scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var name: js.UndefOr[java.lang.String] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var placeholder: js.UndefOr[java.lang.String] = js.undefined
    var popup: js.UndefOr[java.lang.String] = js.undefined
    var readonly: js.UndefOr[scala.Boolean] = js.undefined
    var relatedAction: js.UndefOr[java.lang.String] = js.undefined
    var relatedView: js.UndefOr[java.lang.String] = js.undefined
    var required: js.UndefOr[scala.Boolean] = js.undefined
    var separator: js.UndefOr[java.lang.String] = js.undefined
    var subConfig: js.UndefOr[js.Any] = js.undefined
    var suggest: js.UndefOr[js.Any] = js.undefined
    var tooltip: js.UndefOr[java.lang.String] = js.undefined
    var validate: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var validateEvent: js.UndefOr[java.lang.String] = js.undefined
    var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onChange
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onSectionAdd
    - webixLib.webixLibStrings.onSectionRemove
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait multitextEventName extends js.Object
  
  @js.native
  class multiview () extends baseview {
    @JSName("config")
    var config_multiview: multiviewConfig = js.native
    def addView(view: js.Any): java.lang.String | scala.Double = js.native
    def addView(view: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: multiviewEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: multiviewEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def back(step: scala.Double): scala.Unit = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def getActiveId(): scala.Unit = js.native
    def getValue(): java.lang.String | scala.Double = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def index(obj: js.Any): scala.Double = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def reconstruct(): scala.Unit = js.native
    def removeView(id: js.Any): scala.Unit = js.native
    def resizeChildren(): scala.Unit = js.native
    def setValue(id: java.lang.String): scala.Unit = js.native
    def setValue(id: scala.Double): scala.Unit = js.native
    def showBatch(name: java.lang.String): scala.Unit = js.native
    def showBatch(name: java.lang.String, mode: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait multiviewConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var cells: js.UndefOr[js.Any] = js.undefined
    var cols: js.UndefOr[js.Array[_]] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var fitBiggest: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var keepViews: js.UndefOr[scala.Boolean] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var responsive: js.UndefOr[java.lang.String] = js.undefined
    var rows: js.UndefOr[js.Array[_]] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var visibleBatch: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onBeforeBack
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onViewChange
  */
  trait multiviewEventName extends js.Object
  
  @js.native
  class organogram () extends baseview {
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_organogram: organogramConfig = js.native
    var data: webixLib.webixMod.DataStore = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var on_context: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    @JSName("on_dblclick")
    var on_dblclick_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("on_mouse_move")
    var on_mouse_move_Original: webixLib.webixMod.WebixCallback = js.native
    var `type`: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    var types: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    var waitData: js.Promise[_] = js.native
    def add(obj: js.Any): java.lang.String | scala.Double = js.native
    def add(obj: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
    def addCss(id: java.lang.String, css: java.lang.String): scala.Unit = js.native
    def addCss(id: java.lang.String, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def addCss(id: scala.Double, css: java.lang.String): scala.Unit = js.native
    def addCss(id: scala.Double, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def attachEvent(`type`: organogramEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: organogramEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def clearAll(): scala.Unit = js.native
    def clearAll(soft: scala.Boolean): scala.Unit = js.native
    def clearCss(css: java.lang.String): scala.Unit = js.native
    def clearCss(css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def close(id: java.lang.String): scala.Unit = js.native
    def close(id: scala.Double): scala.Unit = js.native
    def closeAll(): scala.Unit = js.native
    def count(): scala.Double = js.native
    def customize(obj: js.Any): scala.Unit = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def exists(id: java.lang.String): scala.Boolean = js.native
    def exists(id: scala.Double): scala.Boolean = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate): scala.Unit = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate, value: java.lang.String): scala.Unit = js.native
    def filter(
      text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate,
      value: java.lang.String,
      preserve: scala.Boolean
    ): scala.Unit = js.native
    def filter(text: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def find(criterion: webixLib.webixMod.WebixCallback): js.Any = js.native
    def find(criterion: webixLib.webixMod.WebixCallback, first: scala.Boolean): js.Any = js.native
    def getBranchIndex(id: java.lang.String): scala.Double = js.native
    def getBranchIndex(id: java.lang.String, parent: java.lang.String): scala.Double = js.native
    def getBranchIndex(id: java.lang.String, parent: scala.Double): scala.Double = js.native
    def getBranchIndex(id: scala.Double): scala.Double = js.native
    def getBranchIndex(id: scala.Double, parent: java.lang.String): scala.Double = js.native
    def getBranchIndex(id: scala.Double, parent: scala.Double): scala.Double = js.native
    def getFirstChildId(id: java.lang.String): java.lang.String = js.native
    def getFirstChildId(id: scala.Double): java.lang.String = js.native
    def getFirstId(): java.lang.String | scala.Double = js.native
    def getIdByIndex(index: scala.Double): java.lang.String | scala.Double = js.native
    def getIndexById(id: java.lang.String): scala.Double = js.native
    def getIndexById(id: scala.Double): scala.Double = js.native
    def getItem(id: java.lang.String): js.Any = js.native
    def getItem(id: scala.Double): js.Any = js.native
    def getItemNode(id: java.lang.String): stdLib.HTMLElement = js.native
    def getItemNode(id: scala.Double): stdLib.HTMLElement = js.native
    def getLastId(): java.lang.String | scala.Double = js.native
    def getNextId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getNextId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def getNextSiblingId(id: java.lang.String): java.lang.String | scala.Double = js.native
    def getNextSiblingId(id: scala.Double): java.lang.String | scala.Double = js.native
    def getOpenItems(): js.Array[_] = js.native
    def getParentId(id: java.lang.String): java.lang.String | scala.Double = js.native
    def getParentId(id: scala.Double): java.lang.String | scala.Double = js.native
    def getPrevId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPrevId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPrevSiblingId(id: java.lang.String): java.lang.String | scala.Double = js.native
    def getPrevSiblingId(id: scala.Double): java.lang.String | scala.Double = js.native
    def getScrollState(): js.Any = js.native
    def getSelectedId(as_array: scala.Boolean): java.lang.String | js.Array[_] = js.native
    def getSelectedItem(as_array: scala.Boolean): js.Any = js.native
    def getState(): js.Any = js.native
    def group(config: js.Any, mode: scala.Boolean): scala.Unit = js.native
    def hasCss(id: java.lang.String, css: java.lang.String): scala.Boolean = js.native
    def hasCss(id: scala.Double, css: java.lang.String): scala.Boolean = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def isBranch(id: java.lang.String): scala.Boolean = js.native
    def isBranch(id: scala.Double): scala.Boolean = js.native
    def isBranchOpen(id: java.lang.String): scala.Boolean = js.native
    def isBranchOpen(id: scala.Double): scala.Boolean = js.native
    def isSelected(id: java.lang.String): scala.Boolean = js.native
    def isSelected(id: scala.Double): scala.Boolean = js.native
    def load(url: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String, callback: webixLib.webixMod.WebixCallback): js.Promise[_] = js.native
    def loadBranch(id: java.lang.String, callback: webixLib.webixMod.WebixCallback, url: java.lang.String): scala.Unit = js.native
    def loadBranch(id: scala.Double, callback: webixLib.webixMod.WebixCallback, url: java.lang.String): scala.Unit = js.native
    def loadNext(
      count: scala.Double,
      start: scala.Double,
      callback: webixLib.webixMod.WebixCallback,
      url: java.lang.String,
      now: scala.Boolean
    ): scala.Unit = js.native
    def locate(e: stdLib.Event): java.lang.String | scala.Double = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def on_dblclick(args: js.Any*): js.Any = js.native
    def on_mouse_move(args: js.Any*): js.Any = js.native
    def open(id: java.lang.String): scala.Unit = js.native
    def open(id: java.lang.String, show: scala.Boolean): scala.Unit = js.native
    def open(id: scala.Double): scala.Unit = js.native
    def open(id: scala.Double, show: scala.Boolean): scala.Unit = js.native
    def openAll(): scala.Unit = js.native
    def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def refresh(): scala.Unit = js.native
    def refresh(id: java.lang.String): scala.Unit = js.native
    def refresh(id: scala.Double): scala.Unit = js.native
    def remove(id: java.lang.String): scala.Unit = js.native
    def remove(id: scala.Double): scala.Unit = js.native
    def removeCss(id: java.lang.String, css: java.lang.String): scala.Unit = js.native
    def removeCss(id: java.lang.String, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def removeCss(id: scala.Double, css: java.lang.String): scala.Unit = js.native
    def removeCss(id: scala.Double, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def scrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
    def select(id: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def select(id: js.Array[_], preserve: scala.Boolean): scala.Unit = js.native
    def selectAll(): scala.Unit = js.native
    def selectAll(from: java.lang.String): scala.Unit = js.native
    def selectAll(from: java.lang.String, to: java.lang.String): scala.Unit = js.native
    def serialize(): js.Array[_] = js.native
    def setState(state: js.Any): scala.Unit = js.native
    def showItem(id: java.lang.String): scala.Unit = js.native
    def showItem(id: scala.Double): scala.Unit = js.native
    def sort(by: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String, as: java.lang.String): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def ungroup(mode: scala.Boolean): scala.Unit = js.native
    def unselect(): scala.Unit = js.native
    def unselect(id: java.lang.String): scala.Unit = js.native
    def unselectAll(): scala.Unit = js.native
    def updateItem(id: java.lang.String, data: js.Any): scala.Unit = js.native
    def updateItem(id: scala.Double, data: js.Any): scala.Unit = js.native
  }
  
  trait organogramConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
    var autoheight: js.UndefOr[scala.Boolean] = js.undefined
    var autowidth: js.UndefOr[scala.Boolean] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var click: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var data: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
    var dataFeed: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var datathrottle: js.UndefOr[scala.Double] = js.undefined
    var datatype: js.UndefOr[java.lang.String] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var filterMode: js.UndefOr[js.Any] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var item: js.UndefOr[js.Any] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var mouseEventDelay: js.UndefOr[scala.Double] = js.undefined
    var multiselect: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var onClick: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var onContext: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var onDblClick: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var onMouseMove: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var ready: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var removeMissed: js.UndefOr[scala.Boolean] = js.undefined
    var save: js.UndefOr[java.lang.String] = js.undefined
    var scheme: js.UndefOr[js.Any] = js.undefined
    var scroll: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var scrollSpeed: js.UndefOr[java.lang.String] = js.undefined
    var select: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var template: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var threeState: js.UndefOr[scala.Boolean] = js.undefined
    var tooltip: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
    var `type`: js.UndefOr[js.Any] = js.undefined
    var url: js.UndefOr[js.Any] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterAdd
    - webixLib.webixLibStrings.onAfterClose
    - webixLib.webixLibStrings.onAfterContextMenu
    - webixLib.webixLibStrings.onAfterDelete
    - webixLib.webixLibStrings.onAfterLoad
    - webixLib.webixLibStrings.onAfterOpen
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onAfterSelect
    - webixLib.webixLibStrings.onAfterSort
    - webixLib.webixLibStrings.onBeforeAdd
    - webixLib.webixLibStrings.onBeforeClose
    - webixLib.webixLibStrings.onBeforeContextMenu
    - webixLib.webixLibStrings.onBeforeDelete
    - webixLib.webixLibStrings.onBeforeLoad
    - webixLib.webixLibStrings.onBeforeOpen
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBeforeSelect
    - webixLib.webixLibStrings.onBeforeSort
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDataRequest
    - webixLib.webixLibStrings.onDataUpdate
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onItemCheck
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onItemDblClick
    - webixLib.webixLibStrings.onItemRender
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLoadError
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onMouseMove
    - webixLib.webixLibStrings.onMouseMoving
    - webixLib.webixLibStrings.onMouseOut
    - webixLib.webixLibStrings.onSelectChange
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait organogramEventName extends js.Object
  
  @js.native
  class pager () extends baseview {
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_pager: pagerConfig = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var on_context: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    @JSName("on_dblclick")
    var on_dblclick_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("on_mouse_move")
    var on_mouse_move_Original: webixLib.webixMod.WebixCallback = js.native
    var `type`: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    def attachEvent(`type`: pagerEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: pagerEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def clone(config: js.Any): js.Any = js.native
    def customize(obj: js.Any): scala.Unit = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def on_dblclick(args: js.Any*): js.Any = js.native
    def on_mouse_move(args: js.Any*): js.Any = js.native
    def refresh(): scala.Unit = js.native
    def refresh(id: java.lang.String): scala.Unit = js.native
    def refresh(id: scala.Double): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def select(page: scala.Double): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait pagerConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var apiOnly: js.UndefOr[scala.Boolean] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var count: js.UndefOr[scala.Double] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var group: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var limit: js.UndefOr[scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var mouseEventDelay: js.UndefOr[scala.Double] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var onClick: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var onContext: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var onDblClick: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var onMouseMove: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var page: js.UndefOr[scala.Double] = js.undefined
    var size: js.UndefOr[scala.Double] = js.undefined
    var template: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterContextMenu
    - webixLib.webixLibStrings.onAfterPageChange
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBeforeContextMenu
    - webixLib.webixLibStrings.onBeforePageChange
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onItemDblClick
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onMouseMove
    - webixLib.webixLibStrings.onMouseMoving
    - webixLib.webixLibStrings.onMouseOut
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait pagerEventName extends js.Object
  
  @js.native
  class panel () extends baseview {
    @JSName("config")
    var config_panel: panelConfig = js.native
    @JSName("$resizeEnd")
    def $resizeEnd(pos: scala.Double): scala.Unit = js.native
    @JSName("$resizeMove")
    def $resizeMove(pos: scala.Double): scala.Unit = js.native
    def attachEvent(`type`: panelEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: panelEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait panelConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var body: js.UndefOr[java.lang.String | baseview] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var icon: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var padding: js.UndefOr[scala.Double] = js.undefined
    var paddingX: js.UndefOr[scala.Double] = js.undefined
    var paddingY: js.UndefOr[scala.Double] = js.undefined
    var resize: js.UndefOr[scala.Boolean] = js.undefined
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onViewResize
  */
  trait panelEventName extends js.Object
  
  @js.native
  class pdfviewer () extends baseview {
    @JSName("$numPages")
    var $numPages: scala.Double = js.native
    @JSName("$onLoad")
    var $onLoad_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$pageNum")
    var $pageNum: scala.Double = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_pdfviewer: pdfviewerConfig = js.native
    @JSName("$onLoad")
    def $onLoad(args: js.Any*): js.Any = js.native
    def attachEvent(`type`: pdfviewerEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: pdfviewerEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def clear(): scala.Unit = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def download(): scala.Unit = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def load(url: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String, callback: webixLib.webixMod.WebixCallback): js.Promise[_] = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def nextPage(): scala.Unit = js.native
    def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def prevPage(): scala.Unit = js.native
    def renderPage(page: scala.Double): scala.Unit = js.native
    def setScale(scale: java.lang.String, update: scala.Boolean): scala.Unit = js.native
    def setScale(scale: scala.Double, update: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def zoomIn(): scala.Unit = js.native
    def zoomOut(): scala.Unit = js.native
  }
  
  trait pdfviewerConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var data: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
    var dataFeed: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var datatype: js.UndefOr[java.lang.String] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var downloadName: js.UndefOr[java.lang.String] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var scale: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var toolbar: js.UndefOr[java.lang.String] = js.undefined
    var url: js.UndefOr[js.Any] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterLoad
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBeforeLoad
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onDocumentReady
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLoadError
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onPageRender
    - webixLib.webixLibStrings.onScaleChange
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait pdfviewerEventName extends js.Object
  
  @js.native
  class pivot () extends baseview {
    @JSName("$$")
    var $$: js.Any = js.native
    @JSName("$divider")
    var $divider: java.lang.String = js.native
    @JSName("config")
    var config_pivot: pivotConfig = js.native
    var data: webixLib.webixMod.DataStore = js.native
    var operations: js.Any = js.native
    var waitData: js.Promise[_] = js.native
    def add(obj: js.Any): java.lang.String | scala.Double = js.native
    def add(obj: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
    def addOperation(name: java.lang.String, operation: webixLib.webixMod.WebixCallback, options: js.Any): scala.Unit = js.native
    def addTotalOperation(name: java.lang.String, operation: webixLib.webixMod.WebixCallback, options: js.Any): scala.Unit = js.native
    def attachEvent(`type`: pivotEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: pivotEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def clearAll(): scala.Unit = js.native
    def clearAll(soft: scala.Boolean): scala.Unit = js.native
    def configure(): scala.Unit = js.native
    def count(): scala.Double = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def exists(id: java.lang.String): scala.Boolean = js.native
    def exists(id: scala.Double): scala.Boolean = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate): scala.Unit = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate, value: java.lang.String): scala.Unit = js.native
    def filter(
      text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate,
      value: java.lang.String,
      preserve: scala.Boolean
    ): scala.Unit = js.native
    def filter(text: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def find(criterion: webixLib.webixMod.WebixCallback): js.Any = js.native
    def find(criterion: webixLib.webixMod.WebixCallback, first: scala.Boolean): js.Any = js.native
    def getConfigWindow(): js.Any = js.native
    def getFields(): js.Any = js.native
    def getFilterView(): js.Any = js.native
    def getFirstId(): java.lang.String | scala.Double = js.native
    def getIdByIndex(index: scala.Double): java.lang.String | scala.Double = js.native
    def getIndexById(id: java.lang.String): scala.Double = js.native
    def getIndexById(id: scala.Double): scala.Double = js.native
    def getItem(id: java.lang.String): js.Any = js.native
    def getItem(id: scala.Double): js.Any = js.native
    def getLastId(): java.lang.String | scala.Double = js.native
    def getNextId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getNextId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPrevId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPrevId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def getStructure(): js.Any = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def innerId(id: java.lang.String): scala.Double | java.lang.String = js.native
    def innerId(id: scala.Double): scala.Double | java.lang.String = js.native
    def load(url: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String, callback: webixLib.webixMod.WebixCallback): js.Promise[_] = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def refresh(): scala.Unit = js.native
    def refresh(id: java.lang.String): scala.Unit = js.native
    def refresh(id: scala.Double): scala.Unit = js.native
    def remove(id: java.lang.String): scala.Unit = js.native
    def remove(id: scala.Double): scala.Unit = js.native
    def render(): scala.Unit = js.native
    def setStructure(config: js.Any): scala.Unit = js.native
    def sort(by: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String, as: java.lang.String): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def ui(view: js.Any): baseview = js.native
    def unblockEvent(): scala.Unit = js.native
    def updateItem(id: java.lang.String, data: js.Any): scala.Unit = js.native
    def updateItem(id: scala.Double, data: js.Any): scala.Unit = js.native
  }
  
  trait pivotConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var columnWidth: js.UndefOr[scala.Double] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var data: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
    var datatype: js.UndefOr[java.lang.String] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var externalProcessing: js.UndefOr[scala.Boolean] = js.undefined
    var fieldMap: js.UndefOr[js.Any] = js.undefined
    var filterLabelAlign: js.UndefOr[java.lang.String] = js.undefined
    var filterLabelWidth: js.UndefOr[scala.Double] = js.undefined
    var filterMap: js.UndefOr[js.Any] = js.undefined
    var filterMinWidth: js.UndefOr[scala.Double] = js.undefined
    var filterPlaceholder: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var filterWidth: js.UndefOr[scala.Double] = js.undefined
    var footer: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
    var format: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var headerTemplate: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var max: js.UndefOr[scala.Boolean] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var min: js.UndefOr[scala.Boolean] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var padding: js.UndefOr[scala.Double] = js.undefined
    var paddingX: js.UndefOr[scala.Double] = js.undefined
    var paddingY: js.UndefOr[scala.Double] = js.undefined
    var ping: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var popup: js.UndefOr[js.Any] = js.undefined
    var profile: js.UndefOr[scala.Boolean] = js.undefined
    var readonly: js.UndefOr[scala.Boolean] = js.undefined
    var readonlyTitle: js.UndefOr[java.lang.String] = js.undefined
    var ready: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var removeMissed: js.UndefOr[scala.Boolean] = js.undefined
    var scheme: js.UndefOr[js.Any] = js.undefined
    var separateLabel: js.UndefOr[scala.Boolean] = js.undefined
    var stableRowId: js.UndefOr[scala.Boolean] = js.undefined
    var structure: js.UndefOr[js.Any] = js.undefined
    var totalColumn: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    var url: js.UndefOr[js.Any] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var webWorker: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
    var yScaleWidth: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterAdd
    - webixLib.webixLibStrings.onAfterDelete
    - webixLib.webixLibStrings.onAfterLoad
    - webixLib.webixLibStrings.onAfterSort
    - webixLib.webixLibStrings.onApply
    - webixLib.webixLibStrings.onBeforeAdd
    - webixLib.webixLibStrings.onBeforeApply
    - webixLib.webixLibStrings.onBeforeCancel
    - webixLib.webixLibStrings.onBeforeDelete
    - webixLib.webixLibStrings.onBeforeLoad
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBeforeSort
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onCancel
    - webixLib.webixLibStrings.onDataRequest
    - webixLib.webixLibStrings.onDataUpdate
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onFilterChange
    - webixLib.webixLibStrings.onFilterCreate
    - webixLib.webixLibStrings.onHeaderInit
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onLoadError
    - webixLib.webixLibStrings.onPopup
    - webixLib.webixLibStrings.onViewInit
    - webixLib.webixLibStrings.onWebWorkerEnd
    - webixLib.webixLibStrings.onWebWorkerStart
  */
  trait pivotEventName extends js.Object
  
  @js.native
  class popup () extends baseview {
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_popup: popupConfig = js.native
    def attachEvent(`type`: popupEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: popupEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def close(): scala.Unit = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def getBody(): js.Any = js.native
    def getHead(): js.Any = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def resizeChildren(): scala.Unit = js.native
    def setPosition(x: scala.Double, y: scala.Double): scala.Unit = js.native
    def show(node: stdLib.HTMLElement): scala.Unit = js.native
    def show(node: stdLib.HTMLElement, position: js.Any): scala.Unit = js.native
    def show(node: stdLib.HTMLElement, position: js.Any, point: java.lang.String): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait popupConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var autofit: js.UndefOr[scala.Boolean] = js.undefined
    var autofocus: js.UndefOr[scala.Boolean] = js.undefined
    var body: js.UndefOr[java.lang.String | baseview] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var head: js.UndefOr[js.Any] = js.undefined
    var headHeight: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var left: js.UndefOr[scala.Double] = js.undefined
    var master: js.UndefOr[java.lang.String] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var modal: js.UndefOr[scala.Boolean] = js.undefined
    var move: js.UndefOr[scala.Boolean] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var padding: js.UndefOr[js.Any] = js.undefined
    var point: js.UndefOr[scala.Boolean] = js.undefined
    var position: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var relative: js.UndefOr[java.lang.String] = js.undefined
    var resize: js.UndefOr[scala.Boolean] = js.undefined
    var toFront: js.UndefOr[scala.Boolean] = js.undefined
    var top: js.UndefOr[scala.Double] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
    var zIndex: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBeforeShow
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onHide
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onShow
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewMove
    - webixLib.webixLibStrings.onViewMoveEnd
    - webixLib.webixLibStrings.onViewResize
  */
  trait popupEventName extends js.Object
  
  @js.native
  class portlet () extends baseview {
    @JSName("config")
    var config_portlet: portletConfig = js.native
    @JSName("$drag")
    def $drag(source: stdLib.HTMLElement, ev: stdLib.Event): java.lang.String = js.native
    def addView(view: js.Any): java.lang.String | scala.Double = js.native
    def addView(view: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: portletEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: portletEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def index(obj: js.Any): scala.Double = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def markDropArea(target: java.lang.String, mode: java.lang.String): scala.Unit = js.native
    def movePortlet(target: java.lang.String, mode: java.lang.String): scala.Unit = js.native
    def reconstruct(): scala.Unit = js.native
    def removeView(id: js.Any): scala.Unit = js.native
    def resizeChildren(): scala.Unit = js.native
    def restore(state: js.Any, factory: webixLib.webixMod.WebixCallback): scala.Unit = js.native
    def serialize(): js.Any = js.native
    def serialize(serializer: webixLib.webixMod.WebixCallback): js.Any = js.native
    def showBatch(name: java.lang.String): scala.Unit = js.native
    def showBatch(name: java.lang.String, mode: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait portletConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var body: js.UndefOr[java.lang.String | baseview] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var cols: js.UndefOr[js.Array[_]] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var icon: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var isolate: js.UndefOr[scala.Boolean] = js.undefined
    var layoutType: js.UndefOr[java.lang.String] = js.undefined
    var margin: js.UndefOr[scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var mode: js.UndefOr[java.lang.String] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var padding: js.UndefOr[scala.Double] = js.undefined
    var paddingX: js.UndefOr[scala.Double] = js.undefined
    var paddingY: js.UndefOr[scala.Double] = js.undefined
    var responsive: js.UndefOr[java.lang.String] = js.undefined
    var rows: js.UndefOr[js.Array[_]] = js.undefined
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var visibleBatch: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterPortletMove
    - webixLib.webixLibStrings.onBeforePortletMove
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onDestruct
  */
  trait portletEventName extends js.Object
  
  @js.native
  class property () extends baseview {
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_property: propertyConfig = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var on_context: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    @JSName("on_dblclick")
    var on_dblclick_Original: webixLib.webixMod.WebixCallback = js.native
    var on_edit: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    @JSName("on_mouse_move")
    var on_mouse_move_Original: webixLib.webixMod.WebixCallback = js.native
    var on_render: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    var `type`: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    def attachEvent(`type`: propertyEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: propertyEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def customize(obj: js.Any): scala.Unit = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def edit(id: js.Any): scala.Unit = js.native
    def editCancel(): scala.Unit = js.native
    def editNext(): scala.Unit = js.native
    def editStop(): scala.Unit = js.native
    def focusEditor(id: js.Any): scala.Unit = js.native
    def getEditState(): js.Any = js.native
    def getEditor(): js.Any = js.native
    def getEditor(id: java.lang.String): js.Any = js.native
    def getEditorValue(): java.lang.String = js.native
    def getItem(id: java.lang.String): js.Any = js.native
    def getItemNode(id: java.lang.String): stdLib.HTMLElement = js.native
    def getItemNode(id: scala.Double): stdLib.HTMLElement = js.native
    def getScrollState(): js.Any = js.native
    def getValues(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def load(url: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String, callback: webixLib.webixMod.WebixCallback): js.Promise[_] = js.native
    def locate(e: stdLib.Event): java.lang.String | scala.Double = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def on_dblclick(args: js.Any*): js.Any = js.native
    def on_mouse_move(args: js.Any*): js.Any = js.native
    def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def refresh(): scala.Unit = js.native
    def refresh(id: java.lang.String): scala.Unit = js.native
    def refresh(id: scala.Double): scala.Unit = js.native
    def registerType(name: java.lang.String, data: js.Any): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def scrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
    def setValues(values: js.Any): scala.Unit = js.native
    def setValues(values: js.Any, update: scala.Boolean): scala.Unit = js.native
    def showItem(id: java.lang.String): scala.Unit = js.native
    def showItem(id: scala.Double): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def updateItem(): scala.Unit = js.native
    def validateEditor(): scala.Boolean = js.native
    def validateEditor(id: java.lang.String): scala.Boolean = js.native
    def validateEditor(id: scala.Double): scala.Boolean = js.native
  }
  
  trait propertyConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var autoheight: js.UndefOr[scala.Boolean] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var complexData: js.UndefOr[scala.Boolean] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var data: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
    var datatype: js.UndefOr[java.lang.String] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var editValue: js.UndefOr[java.lang.String] = js.undefined
    var editable: js.UndefOr[scala.Boolean] = js.undefined
    var editaction: js.UndefOr[java.lang.String] = js.undefined
    var elements: js.UndefOr[js.Any] = js.undefined
    var form: js.UndefOr[java.lang.String] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var map: js.UndefOr[js.Any] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var mouseEventDelay: js.UndefOr[scala.Double] = js.undefined
    var nameWidth: js.UndefOr[scala.Double] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var onClick: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var onContext: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var onDblClick: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var onMouseMove: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var scroll: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var scrollSpeed: js.UndefOr[java.lang.String] = js.undefined
    var template: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var tooltip: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
    var url: js.UndefOr[js.Any] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterContextMenu
    - webixLib.webixLibStrings.onAfterEditStart
    - webixLib.webixLibStrings.onAfterEditStop
    - webixLib.webixLibStrings.onAfterLoad
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBeforeContextMenu
    - webixLib.webixLibStrings.onBeforeEditStart
    - webixLib.webixLibStrings.onBeforeEditStop
    - webixLib.webixLibStrings.onBeforeLoad
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onCheck
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onItemDblClick
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLiveEdit
    - webixLib.webixLibStrings.onLoadError
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onMouseMove
    - webixLib.webixLibStrings.onMouseMoving
    - webixLib.webixLibStrings.onMouseOut
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait propertyEventName extends js.Object
  
  @js.native
  class proto () extends baseview {
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_proto: protoConfig = js.native
    var data: webixLib.webixMod.DataStore = js.native
    var `type`: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    var types: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    var waitData: js.Promise[_] = js.native
    def add(obj: js.Any): java.lang.String | scala.Double = js.native
    def add(obj: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
    def addCss(id: java.lang.String, css: java.lang.String): scala.Unit = js.native
    def addCss(id: java.lang.String, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def addCss(id: scala.Double, css: java.lang.String): scala.Unit = js.native
    def addCss(id: scala.Double, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def attachEvent(`type`: protoEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: protoEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def clearAll(): scala.Unit = js.native
    def clearAll(soft: scala.Boolean): scala.Unit = js.native
    def clearCss(css: java.lang.String): scala.Unit = js.native
    def clearCss(css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def clearValidation(): scala.Unit = js.native
    def count(): scala.Double = js.native
    def customize(obj: js.Any): scala.Unit = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def exists(id: java.lang.String): scala.Boolean = js.native
    def exists(id: scala.Double): scala.Boolean = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate): scala.Unit = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate, value: java.lang.String): scala.Unit = js.native
    def filter(
      text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate,
      value: java.lang.String,
      preserve: scala.Boolean
    ): scala.Unit = js.native
    def filter(text: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def find(criterion: webixLib.webixMod.WebixCallback): js.Any = js.native
    def find(criterion: webixLib.webixMod.WebixCallback, first: scala.Boolean): js.Any = js.native
    def getFirstId(): java.lang.String | scala.Double = js.native
    def getIdByIndex(index: scala.Double): java.lang.String | scala.Double = js.native
    def getIndexById(id: java.lang.String): scala.Double = js.native
    def getIndexById(id: scala.Double): scala.Double = js.native
    def getItem(id: java.lang.String): js.Any = js.native
    def getItem(id: scala.Double): js.Any = js.native
    def getItemNode(id: java.lang.String): stdLib.HTMLElement = js.native
    def getItemNode(id: scala.Double): stdLib.HTMLElement = js.native
    def getLastId(): java.lang.String | scala.Double = js.native
    def getNextId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getNextId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPage(): scala.Double = js.native
    def getPager(): js.Any = js.native
    def getPrevId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPrevId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def hasCss(id: java.lang.String, css: java.lang.String): scala.Boolean = js.native
    def hasCss(id: scala.Double, css: java.lang.String): scala.Boolean = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def load(url: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String, callback: webixLib.webixMod.WebixCallback): js.Promise[_] = js.native
    def loadNext(
      count: scala.Double,
      start: scala.Double,
      callback: webixLib.webixMod.WebixCallback,
      url: java.lang.String,
      now: scala.Boolean
    ): scala.Unit = js.native
    def locate(e: stdLib.Event): java.lang.String | scala.Double = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def refresh(): scala.Unit = js.native
    def refresh(id: java.lang.String): scala.Unit = js.native
    def refresh(id: scala.Double): scala.Unit = js.native
    def remove(id: java.lang.String): scala.Unit = js.native
    def remove(id: scala.Double): scala.Unit = js.native
    def removeCss(id: java.lang.String, css: java.lang.String): scala.Unit = js.native
    def removeCss(id: java.lang.String, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def removeCss(id: scala.Double, css: java.lang.String): scala.Unit = js.native
    def removeCss(id: scala.Double, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def serialize(): js.Array[_] = js.native
    def setPage(page: scala.Double): scala.Unit = js.native
    def showItem(id: java.lang.String): scala.Unit = js.native
    def showItem(id: scala.Double): scala.Unit = js.native
    def sort(by: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String, as: java.lang.String): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def updateItem(id: java.lang.String, data: js.Any): scala.Unit = js.native
    def updateItem(id: scala.Double, data: js.Any): scala.Unit = js.native
    def validate(): scala.Boolean = js.native
    def validate(id: java.lang.String): scala.Boolean = js.native
  }
  
  trait protoConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var click: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var data: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
    var datathrottle: js.UndefOr[scala.Double] = js.undefined
    var datatype: js.UndefOr[java.lang.String] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var item: js.UndefOr[js.Any] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var pager: js.UndefOr[js.Any] = js.undefined
    var ready: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var removeMissed: js.UndefOr[scala.Boolean] = js.undefined
    var rules: js.UndefOr[js.Any] = js.undefined
    var save: js.UndefOr[java.lang.String] = js.undefined
    var scheme: js.UndefOr[js.Any] = js.undefined
    var template: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var tooltip: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
    var `type`: js.UndefOr[js.Any] = js.undefined
    var url: js.UndefOr[js.Any] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterAdd
    - webixLib.webixLibStrings.onAfterDelete
    - webixLib.webixLibStrings.onAfterLoad
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onAfterSort
    - webixLib.webixLibStrings.onBeforeAdd
    - webixLib.webixLibStrings.onBeforeDelete
    - webixLib.webixLibStrings.onBeforeLoad
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBeforeSort
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDataRequest
    - webixLib.webixLibStrings.onDataUpdate
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onItemRender
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLoadError
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onValidationError
    - webixLib.webixLibStrings.onValidationSuccess
    - webixLib.webixLibStrings.onViewResize
  */
  trait protoEventName extends js.Object
  
  @js.native
  class querybuilder () extends baseview {
    @JSName("config")
    var config_querybuilder: querybuilderConfig = js.native
    var sqlOperators: js.Any = js.native
    def attachEvent(`type`: querybuilderEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: querybuilderEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def focus(): scala.Unit = js.native
    def getFilterHelper(): webixLib.webixMod.WebixCallback = js.native
    def getFilters(): js.Array[_] = js.native
    def getSortingElements(): js.Array[_] = js.native
    def getSortingHelper(): webixLib.webixMod.WebixCallback = js.native
    def getValue(): js.Array[_] = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def setFilters(filters: js.Array[_]): scala.Unit = js.native
    def setValue(rules: js.Any, fields: js.Array[_]): scala.Unit = js.native
    def toSQL(): js.Any = js.native
    def toSQL(config: js.Any): js.Any = js.native
    def toSQL(config: js.Any, rules: js.Any): js.Any = js.native
    def unblockEvent(): scala.Unit = js.native
    def validate(): scala.Unit = js.native
  }
  
  trait querybuilderConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var columnMode: js.UndefOr[scala.Boolean] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var fields: js.UndefOr[js.Array[_]] = js.undefined
    var filtering: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var inputMaxWidth: js.UndefOr[scala.Double] = js.undefined
    var inputWidth: js.UndefOr[scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxLevel: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var padding: js.UndefOr[scala.Double] = js.undefined
    var paddingX: js.UndefOr[scala.Double] = js.undefined
    var paddingY: js.UndefOr[scala.Double] = js.undefined
    var sorting: js.UndefOr[scala.Boolean] = js.undefined
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onKeySelect
  */
  trait querybuilderEventName extends js.Object
  
  @js.native
  class radio () extends baseview {
    @JSName("$compareValue")
    var $compareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$prepareValue")
    var $prepareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$renderIcon")
    var $renderIcon_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$render")
    var $render_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_radio: radioConfig = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var touchable: scala.Boolean = js.native
    @JSName("$compareValue")
    def $compareValue(args: js.Any*): js.Any = js.native
    @JSName("$getValue")
    def $getValue(): java.lang.String = js.native
    @JSName("$prepareValue")
    def $prepareValue(args: js.Any*): js.Any = js.native
    @JSName("$render")
    def $render(args: js.Any*): js.Any = js.native
    @JSName("$renderIcon")
    def $renderIcon(args: js.Any*): js.Any = js.native
    @JSName("$renderInput")
    def $renderInput(obj: js.Any, html: java.lang.String, id: java.lang.String): java.lang.String = js.native
    @JSName("$renderInput")
    def $renderInput(obj: js.Any, html: java.lang.String, id: scala.Double): java.lang.String = js.native
    @JSName("$renderLabel")
    def $renderLabel(config: js.Any, id: java.lang.String): java.lang.String = js.native
    @JSName("$renderLabel")
    def $renderLabel(config: js.Any, id: scala.Double): java.lang.String = js.native
    @JSName("$setValue")
    def $setValue(value: java.lang.String): scala.Unit = js.native
    def attachEvent(`type`: radioEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: radioEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def blur(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def focus(): scala.Unit = js.native
    def getInputNode(): stdLib.HTMLElement = js.native
    def getValue(): java.lang.String = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def refresh(): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def setBottomText(text: java.lang.String): scala.Unit = js.native
    def setValue(value: java.lang.String): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def validate(): scala.Boolean = js.native
  }
  
  trait radioConfig extends js.Object {
    var align: js.UndefOr[java.lang.String] = js.undefined
    var animate: js.UndefOr[js.Any] = js.undefined
    var attributes: js.UndefOr[js.Any] = js.undefined
    var autowidth: js.UndefOr[scala.Boolean] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var bottomLabel: js.UndefOr[java.lang.String] = js.undefined
    var bottomPadding: js.UndefOr[scala.Double] = js.undefined
    var click: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var customRadio: js.UndefOr[scala.Boolean] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var format: js.UndefOr[js.Any] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var hotkey: js.UndefOr[java.lang.String] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var inputAlign: js.UndefOr[java.lang.String] = js.undefined
    var inputHeight: js.UndefOr[scala.Double] = js.undefined
    var inputPadding: js.UndefOr[scala.Double] = js.undefined
    var inputWidth: js.UndefOr[scala.Double] = js.undefined
    var invalidMessage: js.UndefOr[java.lang.String] = js.undefined
    var label: js.UndefOr[java.lang.String] = js.undefined
    var labelAlign: js.UndefOr[java.lang.String] = js.undefined
    var labelPosition: js.UndefOr[java.lang.String] = js.undefined
    var labelWidth: js.UndefOr[scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var name: js.UndefOr[java.lang.String] = js.undefined
    var newline: js.UndefOr[scala.Boolean] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var optionHeight: js.UndefOr[scala.Double] = js.undefined
    var options: js.UndefOr[js.Array[_]] = js.undefined
    var popup: js.UndefOr[java.lang.String] = js.undefined
    var relatedAction: js.UndefOr[java.lang.String] = js.undefined
    var relatedView: js.UndefOr[java.lang.String] = js.undefined
    var required: js.UndefOr[scala.Boolean] = js.undefined
    var suggest: js.UndefOr[js.Any] = js.undefined
    var tooltip: js.UndefOr[java.lang.String] = js.undefined
    var validate: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var validateEvent: js.UndefOr[java.lang.String] = js.undefined
    var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var vertical: js.UndefOr[scala.Boolean] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onChange
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait radioEventName extends js.Object
  
  @js.native
  class rangechart () extends baseview {
    @JSName("$scope")
    var $scope: js.Any = js.native
    var colormap: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    @JSName("config")
    var config_rangechart: rangechartConfig = js.native
    var data: webixLib.webixMod.DataStore = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var on_context: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    @JSName("on_dblclick")
    var on_dblclick_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("on_mouse_move")
    var on_mouse_move_Original: webixLib.webixMod.WebixCallback = js.native
    var presets: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    var waitData: js.Promise[_] = js.native
    def add(obj: js.Any): java.lang.String | scala.Double = js.native
    def add(obj: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
    def addSeries(obj: js.Any): scala.Unit = js.native
    def attachEvent(`type`: rangechartEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: rangechartEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def clearAll(): scala.Unit = js.native
    def clearAll(soft: scala.Boolean): scala.Unit = js.native
    def clearCanvas(): scala.Unit = js.native
    def count(): scala.Double = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def exists(id: java.lang.String): scala.Boolean = js.native
    def exists(id: scala.Double): scala.Boolean = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate): scala.Unit = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate, value: java.lang.String): scala.Unit = js.native
    def filter(
      text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate,
      value: java.lang.String,
      preserve: scala.Boolean
    ): scala.Unit = js.native
    def filter(text: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def find(criterion: webixLib.webixMod.WebixCallback): js.Any = js.native
    def find(criterion: webixLib.webixMod.WebixCallback, first: scala.Boolean): js.Any = js.native
    def getFirstId(): java.lang.String | scala.Double = js.native
    def getFrameData(): js.Array[_] = js.native
    def getFrameRange(): js.Any = js.native
    def getIdByIndex(index: scala.Double): java.lang.String | scala.Double = js.native
    def getIndexById(id: java.lang.String): scala.Double = js.native
    def getIndexById(id: scala.Double): scala.Double = js.native
    def getItem(id: java.lang.String): js.Any = js.native
    def getItem(id: scala.Double): js.Any = js.native
    def getLastId(): java.lang.String | scala.Double = js.native
    def getNextId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getNextId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPrevId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPrevId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def group(config: js.Any, mode: scala.Boolean): scala.Unit = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def hideSeries(index: scala.Double): scala.Unit = js.native
    def load(url: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String, callback: webixLib.webixMod.WebixCallback): js.Promise[_] = js.native
    def loadNext(
      count: scala.Double,
      start: scala.Double,
      callback: webixLib.webixMod.WebixCallback,
      url: java.lang.String,
      now: scala.Boolean
    ): scala.Unit = js.native
    def locate(e: stdLib.Event): java.lang.String | scala.Double = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def on_dblclick(args: js.Any*): js.Any = js.native
    def on_mouse_move(args: js.Any*): js.Any = js.native
    def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def refresh(): scala.Unit = js.native
    def refresh(id: java.lang.String): scala.Unit = js.native
    def refresh(id: scala.Double): scala.Unit = js.native
    def remove(id: java.lang.String): scala.Unit = js.native
    def remove(id: scala.Double): scala.Unit = js.native
    def removeAllSeries(): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def serialize(): js.Array[_] = js.native
    def setFrameRange(range: js.Any): scala.Unit = js.native
    def showSeries(index: scala.Double): scala.Unit = js.native
    def sort(by: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String, as: java.lang.String): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def ungroup(mode: scala.Boolean): scala.Unit = js.native
    def updateItem(id: java.lang.String, data: js.Any): scala.Unit = js.native
    def updateItem(id: scala.Double, data: js.Any): scala.Unit = js.native
  }
  
  trait rangechartConfig extends js.Object {
    var alpha: js.UndefOr[scala.Double] = js.undefined
    var animate: js.UndefOr[js.Any] = js.undefined
    var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
    var barWidth: js.UndefOr[scala.Double] = js.undefined
    var border: js.UndefOr[scala.Boolean] = js.undefined
    var borderColor: js.UndefOr[java.lang.String] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var cant: js.UndefOr[scala.Double] = js.undefined
    var color: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var data: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
    var datathrottle: js.UndefOr[scala.Double] = js.undefined
    var datatype: js.UndefOr[java.lang.String] = js.undefined
    var disableLines: js.UndefOr[scala.Boolean] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var eventRadius: js.UndefOr[scala.Double] = js.undefined
    var fill: js.UndefOr[java.lang.String] = js.undefined
    var fixOverflow: js.UndefOr[scala.Boolean] = js.undefined
    var frameId: js.UndefOr[java.lang.String] = js.undefined
    var gradient: js.UndefOr[scala.Boolean | java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var item: js.UndefOr[js.Any] = js.undefined
    var label: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var labelOffset: js.UndefOr[scala.Double] = js.undefined
    var legend: js.UndefOr[js.Any] = js.undefined
    var line: js.UndefOr[js.Any] = js.undefined
    var lineColor: js.UndefOr[java.lang.String] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var mouseEventDelay: js.UndefOr[scala.Double] = js.undefined
    var offset: js.UndefOr[scala.Boolean] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var onClick: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var onContext: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var onDblClick: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var onMouseMove: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var origin: js.UndefOr[scala.Double] = js.undefined
    var padding: js.UndefOr[js.Any] = js.undefined
    var pieHeight: js.UndefOr[scala.Double] = js.undefined
    var pieInnerText: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var preset: js.UndefOr[java.lang.String] = js.undefined
    var radius: js.UndefOr[scala.Double] = js.undefined
    var range: js.UndefOr[js.Any] = js.undefined
    var ready: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var removeMissed: js.UndefOr[scala.Boolean] = js.undefined
    var save: js.UndefOr[java.lang.String] = js.undefined
    var scale: js.UndefOr[java.lang.String] = js.undefined
    var scheme: js.UndefOr[js.Any] = js.undefined
    var series: js.UndefOr[js.Any] = js.undefined
    var shadow: js.UndefOr[scala.Boolean] = js.undefined
    var tooltip: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    var url: js.UndefOr[js.Any] = js.undefined
    var value: js.UndefOr[java.lang.String | webixLib.webixMod.WebixTemplate] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
    var x: js.UndefOr[scala.Double] = js.undefined
    var xAxis: js.UndefOr[js.Any] = js.undefined
    var xValue: js.UndefOr[java.lang.String] = js.undefined
    var y: js.UndefOr[scala.Double] = js.undefined
    var yAxis: js.UndefOr[js.Any] = js.undefined
    var yValue: js.UndefOr[java.lang.String] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterAdd
    - webixLib.webixLibStrings.onAfterContextMenu
    - webixLib.webixLibStrings.onAfterDelete
    - webixLib.webixLibStrings.onAfterLoad
    - webixLib.webixLibStrings.onAfterRangeChange
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onAfterSort
    - webixLib.webixLibStrings.onBeforeAdd
    - webixLib.webixLibStrings.onBeforeContextMenu
    - webixLib.webixLibStrings.onBeforeDelete
    - webixLib.webixLibStrings.onBeforeLoad
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBeforeSort
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDataRequest
    - webixLib.webixLibStrings.onDataUpdate
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onItemDblClick
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLoadError
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onMouseMove
    - webixLib.webixLibStrings.onMouseMoving
    - webixLib.webixLibStrings.onMouseOut
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait rangechartEventName extends js.Object
  
  @js.native
  class rangeslider () extends baseview {
    @JSName("$compareValue")
    var $compareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$cssName")
    var $cssName: java.lang.String = js.native
    @JSName("$prepareValue")
    var $prepareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$renderIcon")
    var $renderIcon_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$render")
    var $render_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("$touchCapture")
    var $touchCapture: scala.Boolean = js.native
    @JSName("config")
    var config_rangeslider: rangesliderConfig = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var touchable: scala.Boolean = js.native
    @JSName("$compareValue")
    def $compareValue(args: js.Any*): js.Any = js.native
    @JSName("$getValue")
    def $getValue(): java.lang.String = js.native
    @JSName("$prepareValue")
    def $prepareValue(args: js.Any*): js.Any = js.native
    @JSName("$render")
    def $render(args: js.Any*): js.Any = js.native
    @JSName("$renderIcon")
    def $renderIcon(args: js.Any*): js.Any = js.native
    @JSName("$renderInput")
    def $renderInput(obj: js.Any, html: java.lang.String, id: java.lang.String): java.lang.String = js.native
    @JSName("$renderInput")
    def $renderInput(obj: js.Any, html: java.lang.String, id: scala.Double): java.lang.String = js.native
    @JSName("$renderLabel")
    def $renderLabel(config: js.Any, id: java.lang.String): java.lang.String = js.native
    @JSName("$renderLabel")
    def $renderLabel(config: js.Any, id: scala.Double): java.lang.String = js.native
    @JSName("$setValue")
    def $setValue(value: java.lang.String): scala.Unit = js.native
    def attachEvent(`type`: rangesliderEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: rangesliderEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def blur(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def focus(): scala.Unit = js.native
    def getInputNode(): stdLib.HTMLElement = js.native
    def getValue(): java.lang.String = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def refresh(): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def setBottomText(text: java.lang.String): scala.Unit = js.native
    def setValue(value: java.lang.String): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def validate(): scala.Boolean = js.native
  }
  
  trait rangesliderConfig extends js.Object {
    var align: js.UndefOr[java.lang.String] = js.undefined
    var animate: js.UndefOr[js.Any] = js.undefined
    var attributes: js.UndefOr[js.Any] = js.undefined
    var autowidth: js.UndefOr[scala.Boolean] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var bottomLabel: js.UndefOr[java.lang.String] = js.undefined
    var bottomPadding: js.UndefOr[scala.Double] = js.undefined
    var click: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var format: js.UndefOr[js.Any] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var hotkey: js.UndefOr[java.lang.String] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var inputAlign: js.UndefOr[java.lang.String] = js.undefined
    var inputHeight: js.UndefOr[scala.Double] = js.undefined
    var inputPadding: js.UndefOr[scala.Double] = js.undefined
    var inputWidth: js.UndefOr[scala.Double] = js.undefined
    var invalidMessage: js.UndefOr[java.lang.String] = js.undefined
    var label: js.UndefOr[java.lang.String] = js.undefined
    var labelAlign: js.UndefOr[java.lang.String] = js.undefined
    var labelPosition: js.UndefOr[java.lang.String] = js.undefined
    var labelWidth: js.UndefOr[scala.Double] = js.undefined
    var max: js.UndefOr[scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var min: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var name: js.UndefOr[java.lang.String] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var popup: js.UndefOr[java.lang.String] = js.undefined
    var relatedAction: js.UndefOr[java.lang.String] = js.undefined
    var relatedView: js.UndefOr[java.lang.String] = js.undefined
    var required: js.UndefOr[scala.Boolean] = js.undefined
    var separator: js.UndefOr[java.lang.String] = js.undefined
    var step: js.UndefOr[scala.Double] = js.undefined
    var stringResult: js.UndefOr[scala.Boolean] = js.undefined
    var suggest: js.UndefOr[js.Any] = js.undefined
    var title: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var tooltip: js.UndefOr[java.lang.String] = js.undefined
    var validate: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var validateEvent: js.UndefOr[java.lang.String] = js.undefined
    var value: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onChange
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onSliderDrag
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait rangesliderEventName extends js.Object
  
  @js.native
  trait resizearea extends js.Object {
    var config: resizeareaConfig = js.native
    var name: java.lang.String = js.native
    def attachEvent(`type`: resizeareaEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: resizeareaEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def define(property: java.lang.String, value: js.Any): scala.Unit = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait resizeareaConfig extends js.Object {
    var border: js.UndefOr[scala.Boolean] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var cursor: js.UndefOr[java.lang.String] = js.undefined
    var dir: js.UndefOr[java.lang.String] = js.undefined
    var eventPos: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var start: js.UndefOr[scala.Double] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onResize
    - webixLib.webixLibStrings.onResizeEnd
  */
  trait resizeareaEventName extends js.Object
  
  @js.native
  class resizer () extends baseview {
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_resizer: resizerConfig = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var on_context: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    @JSName("on_dblclick")
    var on_dblclick_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("on_mouse_move")
    var on_mouse_move_Original: webixLib.webixMod.WebixCallback = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def on_dblclick(args: js.Any*): js.Any = js.native
    def on_mouse_move(args: js.Any*): js.Any = js.native
  }
  
  trait resizerConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var mouseEventDelay: js.UndefOr[scala.Double] = js.undefined
    var onContext: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterContextMenu
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBeforeContextMenu
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onItemDblClick
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onMouseMoving
    - webixLib.webixLibStrings.onMouseOut
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait resizerEventName extends js.Object
  
  @js.native
  class richselect () extends baseview {
    @JSName("$compareValue")
    var $compareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$prepareValue")
    var $prepareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$renderIcon")
    var $renderIcon_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$render")
    var $render_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_richselect: richselectConfig = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var touchable: scala.Boolean = js.native
    @JSName("$compareValue")
    def $compareValue(args: js.Any*): js.Any = js.native
    @JSName("$getValue")
    def $getValue(): java.lang.String = js.native
    @JSName("$prepareValue")
    def $prepareValue(args: js.Any*): js.Any = js.native
    @JSName("$render")
    def $render(args: js.Any*): js.Any = js.native
    @JSName("$renderIcon")
    def $renderIcon(args: js.Any*): js.Any = js.native
    @JSName("$renderInput")
    def $renderInput(obj: js.Any, html: java.lang.String, id: java.lang.String): java.lang.String = js.native
    @JSName("$renderInput")
    def $renderInput(obj: js.Any, html: java.lang.String, id: scala.Double): java.lang.String = js.native
    @JSName("$renderLabel")
    def $renderLabel(config: js.Any, id: java.lang.String): java.lang.String = js.native
    @JSName("$renderLabel")
    def $renderLabel(config: js.Any, id: scala.Double): java.lang.String = js.native
    @JSName("$setValue")
    def $setValue(value: java.lang.String): scala.Unit = js.native
    def attachEvent(`type`: richselectEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: richselectEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def blur(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def focus(): scala.Unit = js.native
    def getInputNode(): stdLib.HTMLElement = js.native
    def getList(): baseview = js.native
    def getPopup(): baseview = js.native
    def getText(): java.lang.String = js.native
    def getValue(): java.lang.String = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def refresh(): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def setBottomText(text: java.lang.String): scala.Unit = js.native
    def setValue(value: java.lang.String): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def validate(): scala.Boolean = js.native
  }
  
  trait richselectConfig extends js.Object {
    var align: js.UndefOr[java.lang.String] = js.undefined
    var animate: js.UndefOr[js.Any] = js.undefined
    var attributes: js.UndefOr[js.Any] = js.undefined
    var autowidth: js.UndefOr[scala.Boolean] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var bottomLabel: js.UndefOr[java.lang.String] = js.undefined
    var bottomPadding: js.UndefOr[scala.Double] = js.undefined
    var click: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var format: js.UndefOr[js.Any] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var hotkey: js.UndefOr[java.lang.String] = js.undefined
    var icon: js.UndefOr[java.lang.String] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var inputAlign: js.UndefOr[java.lang.String] = js.undefined
    var inputHeight: js.UndefOr[scala.Double] = js.undefined
    var inputPadding: js.UndefOr[scala.Double] = js.undefined
    var inputWidth: js.UndefOr[scala.Double] = js.undefined
    var invalid: js.UndefOr[scala.Boolean] = js.undefined
    var invalidMessage: js.UndefOr[java.lang.String] = js.undefined
    var label: js.UndefOr[java.lang.String] = js.undefined
    var labelAlign: js.UndefOr[java.lang.String] = js.undefined
    var labelPosition: js.UndefOr[java.lang.String] = js.undefined
    var labelWidth: js.UndefOr[scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var name: js.UndefOr[java.lang.String] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var options: js.UndefOr[js.Any] = js.undefined
    var placeholder: js.UndefOr[java.lang.String] = js.undefined
    var popup: js.UndefOr[java.lang.String] = js.undefined
    var popupWidth: js.UndefOr[scala.Double] = js.undefined
    var readonly: js.UndefOr[scala.Boolean] = js.undefined
    var relatedAction: js.UndefOr[java.lang.String] = js.undefined
    var relatedView: js.UndefOr[java.lang.String] = js.undefined
    var required: js.UndefOr[scala.Boolean] = js.undefined
    var suggest: js.UndefOr[js.Any] = js.undefined
    var tooltip: js.UndefOr[java.lang.String] = js.undefined
    var validate: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var validateEvent: js.UndefOr[java.lang.String] = js.undefined
    var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onChange
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait richselectEventName extends js.Object
  
  @js.native
  class richtext () extends baseview {
    @JSName("$$")
    var $$: js.Any = js.native
    @JSName("config")
    var config_richtext: richtextConfig = js.native
    def attachEvent(`type`: richtextEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: richtextEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def focus(): scala.Unit = js.native
    def getInputNode(): stdLib.HTMLElement = js.native
    def getValue(): java.lang.String = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def innerId(id: java.lang.String): scala.Double | java.lang.String = js.native
    def innerId(id: scala.Double): scala.Double | java.lang.String = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def refresh(): scala.Unit = js.native
    def setValue(value: java.lang.String): scala.Unit = js.native
    def ui(view: js.Any): baseview = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait richtextConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var label: js.UndefOr[java.lang.String] = js.undefined
    var labelPosition: js.UndefOr[java.lang.String] = js.undefined
    var labelWidth: js.UndefOr[scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var padding: js.UndefOr[scala.Double] = js.undefined
    var paddingX: js.UndefOr[scala.Double] = js.undefined
    var paddingY: js.UndefOr[scala.Double] = js.undefined
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onChange
    - webixLib.webixLibStrings.onDestruct
  */
  trait richtextEventName extends js.Object
  
  @js.native
  class scrollview () extends baseview {
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_scrollview: scrollviewConfig = js.native
    def attachEvent(`type`: scrollviewEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: scrollviewEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def getBody(): js.Any = js.native
    def getScrollState(): js.Any = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def resizeChildren(): scala.Unit = js.native
    def scrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
    def showView(id: java.lang.String): scala.Unit = js.native
    def showView(id: scala.Double): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait scrollviewConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var body: js.UndefOr[js.Any] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var scroll: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var scrollSpeed: js.UndefOr[java.lang.String] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait scrollviewEventName extends js.Object
  
  @js.native
  class search () extends baseview {
    @JSName("$compareValue")
    var $compareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$prepareValue")
    var $prepareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$renderIcon")
    var $renderIcon_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$render")
    var $render_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_search: searchConfig = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var touchable: scala.Boolean = js.native
    @JSName("$compareValue")
    def $compareValue(args: js.Any*): js.Any = js.native
    @JSName("$getValue")
    def $getValue(): java.lang.String = js.native
    @JSName("$prepareValue")
    def $prepareValue(args: js.Any*): js.Any = js.native
    @JSName("$render")
    def $render(args: js.Any*): js.Any = js.native
    @JSName("$renderIcon")
    def $renderIcon(args: js.Any*): js.Any = js.native
    @JSName("$renderInput")
    def $renderInput(obj: js.Any, html: java.lang.String, id: java.lang.String): java.lang.String = js.native
    @JSName("$renderInput")
    def $renderInput(obj: js.Any, html: java.lang.String, id: scala.Double): java.lang.String = js.native
    @JSName("$renderLabel")
    def $renderLabel(config: js.Any, id: java.lang.String): java.lang.String = js.native
    @JSName("$renderLabel")
    def $renderLabel(config: js.Any, id: scala.Double): java.lang.String = js.native
    @JSName("$setValue")
    def $setValue(value: java.lang.String): scala.Unit = js.native
    def attachEvent(`type`: searchEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: searchEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def blur(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def focus(): scala.Unit = js.native
    def getInputNode(): stdLib.HTMLElement = js.native
    def getValue(): java.lang.String = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def refresh(): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def setBottomText(text: java.lang.String): scala.Unit = js.native
    def setValue(value: java.lang.String): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def validate(): scala.Boolean = js.native
  }
  
  trait searchConfig extends js.Object {
    var align: js.UndefOr[java.lang.String] = js.undefined
    var animate: js.UndefOr[js.Any] = js.undefined
    var attributes: js.UndefOr[js.Any] = js.undefined
    var autowidth: js.UndefOr[scala.Boolean] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var bottomLabel: js.UndefOr[java.lang.String] = js.undefined
    var bottomPadding: js.UndefOr[scala.Double] = js.undefined
    var click: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var format: js.UndefOr[js.Any] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var hotkey: js.UndefOr[java.lang.String] = js.undefined
    var icon: js.UndefOr[java.lang.String] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var inputAlign: js.UndefOr[java.lang.String] = js.undefined
    var inputHeight: js.UndefOr[scala.Double] = js.undefined
    var inputPadding: js.UndefOr[scala.Double] = js.undefined
    var inputWidth: js.UndefOr[scala.Double] = js.undefined
    var invalid: js.UndefOr[scala.Boolean] = js.undefined
    var invalidMessage: js.UndefOr[java.lang.String] = js.undefined
    var label: js.UndefOr[java.lang.String] = js.undefined
    var labelAlign: js.UndefOr[java.lang.String] = js.undefined
    var labelPosition: js.UndefOr[java.lang.String] = js.undefined
    var labelWidth: js.UndefOr[scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var name: js.UndefOr[java.lang.String] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var pattern: js.UndefOr[js.Any] = js.undefined
    var placeholder: js.UndefOr[java.lang.String] = js.undefined
    var popup: js.UndefOr[java.lang.String] = js.undefined
    var readonly: js.UndefOr[scala.Boolean] = js.undefined
    var relatedAction: js.UndefOr[java.lang.String] = js.undefined
    var relatedView: js.UndefOr[java.lang.String] = js.undefined
    var required: js.UndefOr[scala.Boolean] = js.undefined
    var suggest: js.UndefOr[js.Any] = js.undefined
    var tooltip: js.UndefOr[java.lang.String] = js.undefined
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    var validate: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var validateEvent: js.UndefOr[java.lang.String] = js.undefined
    var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onChange
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onSearchIconClick
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait searchEventName extends js.Object
  
  @js.native
  class segmented () extends baseview {
    @JSName("$compareValue")
    var $compareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$prepareValue")
    var $prepareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$renderIcon")
    var $renderIcon_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$render")
    var $render_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_segmented: segmentedConfig = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var touchable: scala.Boolean = js.native
    @JSName("$compareValue")
    def $compareValue(args: js.Any*): js.Any = js.native
    @JSName("$getValue")
    def $getValue(): java.lang.String = js.native
    @JSName("$prepareValue")
    def $prepareValue(args: js.Any*): js.Any = js.native
    @JSName("$render")
    def $render(args: js.Any*): js.Any = js.native
    @JSName("$renderIcon")
    def $renderIcon(args: js.Any*): js.Any = js.native
    @JSName("$renderInput")
    def $renderInput(obj: js.Any, html: java.lang.String, id: java.lang.String): java.lang.String = js.native
    @JSName("$renderInput")
    def $renderInput(obj: js.Any, html: java.lang.String, id: scala.Double): java.lang.String = js.native
    @JSName("$renderLabel")
    def $renderLabel(config: js.Any, id: java.lang.String): java.lang.String = js.native
    @JSName("$renderLabel")
    def $renderLabel(config: js.Any, id: scala.Double): java.lang.String = js.native
    @JSName("$setValue")
    def $setValue(value: java.lang.String): scala.Unit = js.native
    def addOption(id: java.lang.String, value: js.Any): scala.Unit = js.native
    def addOption(id: java.lang.String, value: js.Any, show: scala.Boolean): scala.Unit = js.native
    def addOption(id: java.lang.String, value: js.Any, show: scala.Boolean, index: scala.Double): scala.Unit = js.native
    def addOption(id: scala.Double, value: js.Any): scala.Unit = js.native
    def addOption(id: scala.Double, value: js.Any, show: scala.Boolean): scala.Unit = js.native
    def addOption(id: scala.Double, value: js.Any, show: scala.Boolean, index: scala.Double): scala.Unit = js.native
    def addOption(obj: js.Any): scala.Unit = js.native
    def addOption(obj: js.Any, show: scala.Boolean): scala.Unit = js.native
    def addOption(obj: js.Any, show: scala.Boolean, index: scala.Double): scala.Unit = js.native
    def attachEvent(`type`: segmentedEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: segmentedEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def blur(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def focus(): scala.Unit = js.native
    def getInputNode(): stdLib.HTMLElement = js.native
    def getValue(): java.lang.String = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def hideOption(id: java.lang.String): scala.Unit = js.native
    def hideOption(id: scala.Double): scala.Unit = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def optionIndex(ID: java.lang.String): scala.Double = js.native
    def optionIndex(ID: scala.Double): scala.Double = js.native
    def refresh(): scala.Unit = js.native
    def removeOption(id: java.lang.String): scala.Unit = js.native
    def removeOption(id: scala.Double): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def setBottomText(text: java.lang.String): scala.Unit = js.native
    def setValue(value: java.lang.String): scala.Unit = js.native
    def showOption(id: java.lang.String): scala.Unit = js.native
    def showOption(id: scala.Double): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def validate(): scala.Boolean = js.native
  }
  
  trait segmentedConfig extends js.Object {
    var align: js.UndefOr[java.lang.String] = js.undefined
    var animate: js.UndefOr[js.Any] = js.undefined
    var attributes: js.UndefOr[js.Any] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var bottomLabel: js.UndefOr[java.lang.String] = js.undefined
    var bottomPadding: js.UndefOr[scala.Double] = js.undefined
    var click: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var format: js.UndefOr[js.Any] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var hotkey: js.UndefOr[java.lang.String] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var inputAlign: js.UndefOr[java.lang.String] = js.undefined
    var inputHeight: js.UndefOr[scala.Double] = js.undefined
    var inputPadding: js.UndefOr[scala.Double] = js.undefined
    var inputWidth: js.UndefOr[scala.Double] = js.undefined
    var invalidMessage: js.UndefOr[java.lang.String] = js.undefined
    var label: js.UndefOr[java.lang.String] = js.undefined
    var labelAlign: js.UndefOr[java.lang.String] = js.undefined
    var labelPosition: js.UndefOr[java.lang.String] = js.undefined
    var labelWidth: js.UndefOr[scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var multiview: js.UndefOr[scala.Boolean] = js.undefined
    var name: js.UndefOr[java.lang.String] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var optionWidth: js.UndefOr[scala.Double] = js.undefined
    var options: js.UndefOr[js.Any] = js.undefined
    var popup: js.UndefOr[java.lang.String] = js.undefined
    var relatedAction: js.UndefOr[java.lang.String] = js.undefined
    var relatedView: js.UndefOr[java.lang.String] = js.undefined
    var required: js.UndefOr[scala.Boolean] = js.undefined
    var suggest: js.UndefOr[js.Any] = js.undefined
    var tooltip: js.UndefOr[java.lang.String] = js.undefined
    var validate: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var validateEvent: js.UndefOr[java.lang.String] = js.undefined
    var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onAfterTabClick
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBeforeTabClick
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onChange
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onOptionRemove
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait segmentedEventName extends js.Object
  
  @js.native
  class select () extends baseview {
    @JSName("$compareValue")
    var $compareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$prepareValue")
    var $prepareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$renderIcon")
    var $renderIcon_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$render")
    var $render_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_select: selectConfig = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var touchable: scala.Boolean = js.native
    @JSName("$compareValue")
    def $compareValue(args: js.Any*): js.Any = js.native
    @JSName("$getValue")
    def $getValue(): java.lang.String = js.native
    @JSName("$prepareValue")
    def $prepareValue(args: js.Any*): js.Any = js.native
    @JSName("$render")
    def $render(args: js.Any*): js.Any = js.native
    @JSName("$renderIcon")
    def $renderIcon(args: js.Any*): js.Any = js.native
    @JSName("$renderInput")
    def $renderInput(obj: js.Any, html: java.lang.String, id: java.lang.String): java.lang.String = js.native
    @JSName("$renderInput")
    def $renderInput(obj: js.Any, html: java.lang.String, id: scala.Double): java.lang.String = js.native
    @JSName("$renderLabel")
    def $renderLabel(config: js.Any, id: java.lang.String): java.lang.String = js.native
    @JSName("$renderLabel")
    def $renderLabel(config: js.Any, id: scala.Double): java.lang.String = js.native
    @JSName("$setValue")
    def $setValue(value: java.lang.String): scala.Unit = js.native
    def attachEvent(`type`: selectEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: selectEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def blur(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def focus(): scala.Unit = js.native
    def getInputNode(): stdLib.HTMLElement = js.native
    def getValue(): java.lang.String = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def refresh(): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def setBottomText(text: java.lang.String): scala.Unit = js.native
    def setValue(value: java.lang.String): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def validate(): scala.Boolean = js.native
  }
  
  trait selectConfig extends js.Object {
    var align: js.UndefOr[java.lang.String] = js.undefined
    var animate: js.UndefOr[js.Any] = js.undefined
    var attributes: js.UndefOr[js.Any] = js.undefined
    var autowidth: js.UndefOr[scala.Boolean] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var bottomLabel: js.UndefOr[java.lang.String] = js.undefined
    var bottomPadding: js.UndefOr[scala.Double] = js.undefined
    var click: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var format: js.UndefOr[js.Any] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var hotkey: js.UndefOr[java.lang.String] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var inputAlign: js.UndefOr[java.lang.String] = js.undefined
    var inputHeight: js.UndefOr[scala.Double] = js.undefined
    var inputPadding: js.UndefOr[scala.Double] = js.undefined
    var inputWidth: js.UndefOr[scala.Double] = js.undefined
    var invalid: js.UndefOr[scala.Boolean] = js.undefined
    var invalidMessage: js.UndefOr[java.lang.String] = js.undefined
    var label: js.UndefOr[java.lang.String] = js.undefined
    var labelAlign: js.UndefOr[java.lang.String] = js.undefined
    var labelPosition: js.UndefOr[java.lang.String] = js.undefined
    var labelWidth: js.UndefOr[scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var name: js.UndefOr[java.lang.String] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var options: js.UndefOr[js.Array[_] | java.lang.String] = js.undefined
    var placeholder: js.UndefOr[java.lang.String] = js.undefined
    var popup: js.UndefOr[java.lang.String] = js.undefined
    var readonly: js.UndefOr[scala.Boolean] = js.undefined
    var relatedAction: js.UndefOr[java.lang.String] = js.undefined
    var relatedView: js.UndefOr[java.lang.String] = js.undefined
    var required: js.UndefOr[scala.Boolean] = js.undefined
    var suggest: js.UndefOr[js.Any] = js.undefined
    var tooltip: js.UndefOr[java.lang.String] = js.undefined
    var validate: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var validateEvent: js.UndefOr[java.lang.String] = js.undefined
    var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onChange
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait selectEventName extends js.Object
  
  @js.native
  class sidebar () extends baseview {
    @JSName("$dragHTML")
    var $dragHTML_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$dropAllow")
    var $dropAllow_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$fixEditor")
    var $fixEditor_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_sidebar: sidebarConfig = js.native
    var data: webixLib.webixMod.DataStore = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var on_context: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    @JSName("on_dblclick")
    var on_dblclick_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("on_mouse_move")
    var on_mouse_move_Original: webixLib.webixMod.WebixCallback = js.native
    var `type`: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    var types: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    var waitData: js.Promise[_] = js.native
    @JSName("$drag")
    def $drag(source: stdLib.HTMLElement, ev: stdLib.Event): java.lang.String = js.native
    @JSName("$dragHTML")
    def $dragHTML(args: js.Any*): js.Any = js.native
    @JSName("$dragIn")
    def $dragIn(source: stdLib.HTMLElement, target: stdLib.HTMLElement, ev: stdLib.Event): stdLib.HTMLElement = js.native
    @JSName("$dragMark")
    def $dragMark(context: js.Any, ev: stdLib.Event): scala.Boolean = js.native
    @JSName("$dragOut")
    def $dragOut(
      source: stdLib.HTMLElement,
      old_target: stdLib.HTMLElement,
      new_target: stdLib.HTMLElement,
      ev: stdLib.Event
    ): scala.Unit = js.native
    @JSName("$drop")
    def $drop(source: stdLib.HTMLElement, target: stdLib.HTMLElement, ev: stdLib.Event): scala.Unit = js.native
    @JSName("$dropAllow")
    def $dropAllow(args: js.Any*): js.Any = js.native
    @JSName("$fixEditor")
    def $fixEditor(args: js.Any*): js.Any = js.native
    def add(obj: js.Any): java.lang.String | scala.Double = js.native
    def add(obj: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
    def addCss(id: java.lang.String, css: java.lang.String): scala.Unit = js.native
    def addCss(id: java.lang.String, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def addCss(id: scala.Double, css: java.lang.String): scala.Unit = js.native
    def addCss(id: scala.Double, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def attachEvent(`type`: sidebarEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: sidebarEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def checkAll(): scala.Unit = js.native
    def checkAll(id: java.lang.String): scala.Unit = js.native
    def checkAll(id: scala.Double): scala.Unit = js.native
    def checkItem(id: java.lang.String): scala.Unit = js.native
    def clearAll(): scala.Unit = js.native
    def clearAll(soft: scala.Boolean): scala.Unit = js.native
    def clearCss(css: java.lang.String): scala.Unit = js.native
    def clearCss(css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def clearValidation(): scala.Unit = js.native
    def close(id: java.lang.String): scala.Unit = js.native
    def close(id: scala.Double): scala.Unit = js.native
    def closeAll(): scala.Unit = js.native
    def collapse(): scala.Unit = js.native
    def copy(sid: java.lang.String, tindex: scala.Double): scala.Double = js.native
    def copy(sid: java.lang.String, tindex: scala.Double, tobj: baseview): scala.Double = js.native
    def copy(sid: java.lang.String, tindex: scala.Double, tobj: baseview, details: js.Any): scala.Double = js.native
    def copy(sid: scala.Double, tindex: scala.Double): scala.Double = js.native
    def copy(sid: scala.Double, tindex: scala.Double, tobj: baseview): scala.Double = js.native
    def copy(sid: scala.Double, tindex: scala.Double, tobj: baseview, details: js.Any): scala.Double = js.native
    def count(): scala.Double = js.native
    def customize(obj: js.Any): scala.Unit = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def exists(id: java.lang.String): scala.Boolean = js.native
    def exists(id: scala.Double): scala.Boolean = js.native
    def expand(): scala.Unit = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate): scala.Unit = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate, value: java.lang.String): scala.Unit = js.native
    def filter(
      text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate,
      value: java.lang.String,
      preserve: scala.Boolean
    ): scala.Unit = js.native
    def filter(text: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def find(criterion: webixLib.webixMod.WebixCallback): js.Any = js.native
    def find(criterion: webixLib.webixMod.WebixCallback, first: scala.Boolean): js.Any = js.native
    def getBranchIndex(id: java.lang.String): scala.Double = js.native
    def getBranchIndex(id: java.lang.String, parent: java.lang.String): scala.Double = js.native
    def getBranchIndex(id: java.lang.String, parent: scala.Double): scala.Double = js.native
    def getBranchIndex(id: scala.Double): scala.Double = js.native
    def getBranchIndex(id: scala.Double, parent: java.lang.String): scala.Double = js.native
    def getBranchIndex(id: scala.Double, parent: scala.Double): scala.Double = js.native
    def getChecked(): js.Array[_] = js.native
    def getFirstChildId(id: java.lang.String): java.lang.String = js.native
    def getFirstChildId(id: scala.Double): java.lang.String = js.native
    def getFirstId(): java.lang.String | scala.Double = js.native
    def getIdByIndex(index: scala.Double): java.lang.String | scala.Double = js.native
    def getIndexById(id: java.lang.String): scala.Double = js.native
    def getIndexById(id: scala.Double): scala.Double = js.native
    def getItem(id: java.lang.String): js.Any = js.native
    def getItem(id: scala.Double): js.Any = js.native
    def getItemNode(id: java.lang.String): stdLib.HTMLElement = js.native
    def getItemNode(id: scala.Double): stdLib.HTMLElement = js.native
    def getLastId(): java.lang.String | scala.Double = js.native
    def getNextId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getNextId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def getNextSiblingId(id: java.lang.String): java.lang.String | scala.Double = js.native
    def getNextSiblingId(id: scala.Double): java.lang.String | scala.Double = js.native
    def getOpenItems(): js.Array[_] = js.native
    def getPage(): scala.Double = js.native
    def getPager(): js.Any = js.native
    def getParentId(id: java.lang.String): java.lang.String | scala.Double = js.native
    def getParentId(id: scala.Double): java.lang.String | scala.Double = js.native
    def getPopup(): js.Any = js.native
    def getPrevId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPrevId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPrevSiblingId(id: java.lang.String): java.lang.String | scala.Double = js.native
    def getPrevSiblingId(id: scala.Double): java.lang.String | scala.Double = js.native
    def getScrollState(): js.Any = js.native
    def getSelectedId(as_array: scala.Boolean): java.lang.String | js.Array[_] = js.native
    def getSelectedItem(as_array: scala.Boolean): js.Any = js.native
    def getState(): js.Any = js.native
    def group(config: js.Any, mode: scala.Boolean): scala.Unit = js.native
    def hasCss(id: java.lang.String, css: java.lang.String): scala.Boolean = js.native
    def hasCss(id: scala.Double, css: java.lang.String): scala.Boolean = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def isBranch(id: java.lang.String): scala.Boolean = js.native
    def isBranch(id: scala.Double): scala.Boolean = js.native
    def isBranchOpen(id: java.lang.String): scala.Boolean = js.native
    def isBranchOpen(id: scala.Double): scala.Boolean = js.native
    def isChecked(id: java.lang.String): scala.Boolean = js.native
    def isChecked(id: scala.Double): scala.Boolean = js.native
    def isSelected(id: java.lang.String): scala.Boolean = js.native
    def isSelected(id: scala.Double): scala.Boolean = js.native
    def load(url: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String, callback: webixLib.webixMod.WebixCallback): js.Promise[_] = js.native
    def loadBranch(id: java.lang.String, callback: webixLib.webixMod.WebixCallback, url: java.lang.String): scala.Unit = js.native
    def loadBranch(id: scala.Double, callback: webixLib.webixMod.WebixCallback, url: java.lang.String): scala.Unit = js.native
    def loadNext(
      count: scala.Double,
      start: scala.Double,
      callback: webixLib.webixMod.WebixCallback,
      url: java.lang.String,
      now: scala.Boolean
    ): scala.Unit = js.native
    def locate(e: stdLib.Event): java.lang.String | scala.Double = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def move(sid: java.lang.String, tindex: scala.Double): java.lang.String = js.native
    def move(sid: java.lang.String, tindex: scala.Double, tobj: js.Any): java.lang.String = js.native
    def move(sid: java.lang.String, tindex: scala.Double, tobj: js.Any, details: js.Any): java.lang.String = js.native
    def moveSelection(direction: java.lang.String): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def on_dblclick(args: js.Any*): js.Any = js.native
    def on_mouse_move(args: js.Any*): js.Any = js.native
    def open(id: java.lang.String): scala.Unit = js.native
    def open(id: java.lang.String, show: scala.Boolean): scala.Unit = js.native
    def open(id: scala.Double): scala.Unit = js.native
    def open(id: scala.Double, show: scala.Boolean): scala.Unit = js.native
    def openAll(): scala.Unit = js.native
    def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def refresh(): scala.Unit = js.native
    def refresh(id: java.lang.String): scala.Unit = js.native
    def refresh(id: scala.Double): scala.Unit = js.native
    def remove(id: java.lang.String): scala.Unit = js.native
    def remove(id: scala.Double): scala.Unit = js.native
    def removeCss(id: java.lang.String, css: java.lang.String): scala.Unit = js.native
    def removeCss(id: java.lang.String, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def removeCss(id: scala.Double, css: java.lang.String): scala.Unit = js.native
    def removeCss(id: scala.Double, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def scrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
    def select(id: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def select(id: js.Array[_], preserve: scala.Boolean): scala.Unit = js.native
    def selectAll(): scala.Unit = js.native
    def selectAll(from: java.lang.String): scala.Unit = js.native
    def selectAll(from: java.lang.String, to: java.lang.String): scala.Unit = js.native
    def serialize(): js.Array[_] = js.native
    def setPage(page: scala.Double): scala.Unit = js.native
    def setState(state: js.Any): scala.Unit = js.native
    def showItem(id: java.lang.String): scala.Unit = js.native
    def showItem(id: scala.Double): scala.Unit = js.native
    def sort(by: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String, as: java.lang.String): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def toggle(): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def uncheckAll(): scala.Unit = js.native
    def uncheckAll(id: java.lang.String): scala.Unit = js.native
    def uncheckAll(id: scala.Double): scala.Unit = js.native
    def uncheckItem(id: java.lang.String): scala.Unit = js.native
    def ungroup(mode: scala.Boolean): scala.Unit = js.native
    def unselect(): scala.Unit = js.native
    def unselect(id: java.lang.String): scala.Unit = js.native
    def unselectAll(): scala.Unit = js.native
    def updateItem(id: java.lang.String, data: js.Any): scala.Unit = js.native
    def updateItem(id: scala.Double, data: js.Any): scala.Unit = js.native
    def validate(): scala.Boolean = js.native
    def validate(id: java.lang.String): scala.Boolean = js.native
  }
  
  trait sidebarConfig extends js.Object {
    var activeTitle: js.UndefOr[scala.Boolean] = js.undefined
    var animate: js.UndefOr[js.Any] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var click: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var clipboard: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var collapsed: js.UndefOr[scala.Boolean] = js.undefined
    var collapsedWidth: js.UndefOr[scala.Double] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var data: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
    var dataFeed: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var datathrottle: js.UndefOr[scala.Double] = js.undefined
    var datatype: js.UndefOr[java.lang.String] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var drag: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var dragscroll: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var filterMode: js.UndefOr[js.Any] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var item: js.UndefOr[js.Any] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var mouseEventDelay: js.UndefOr[scala.Double] = js.undefined
    var multiselect: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
    var navigation: js.UndefOr[scala.Boolean] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var onClick: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var onContext: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var onDblClick: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var onMouseMove: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var pager: js.UndefOr[js.Any] = js.undefined
    var position: js.UndefOr[java.lang.String] = js.undefined
    var ready: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var removeMissed: js.UndefOr[scala.Boolean] = js.undefined
    var rules: js.UndefOr[js.Any] = js.undefined
    var save: js.UndefOr[java.lang.String] = js.undefined
    var scheme: js.UndefOr[js.Any] = js.undefined
    var scroll: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var scrollSpeed: js.UndefOr[java.lang.String] = js.undefined
    var select: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var template: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var templateCopy: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var threeState: js.UndefOr[scala.Boolean] = js.undefined
    var titleHeight: js.UndefOr[scala.Double] = js.undefined
    var tooltip: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
    var `type`: js.UndefOr[js.Any] = js.undefined
    var url: js.UndefOr[js.Any] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterAdd
    - webixLib.webixLibStrings.onAfterClose
    - webixLib.webixLibStrings.onAfterContextMenu
    - webixLib.webixLibStrings.onAfterDelete
    - webixLib.webixLibStrings.onAfterDrop
    - webixLib.webixLibStrings.onAfterDropOrder
    - webixLib.webixLibStrings.onAfterLoad
    - webixLib.webixLibStrings.onAfterOpen
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onAfterSelect
    - webixLib.webixLibStrings.onAfterSort
    - webixLib.webixLibStrings.onBeforeAdd
    - webixLib.webixLibStrings.onBeforeClose
    - webixLib.webixLibStrings.onBeforeContextMenu
    - webixLib.webixLibStrings.onBeforeDelete
    - webixLib.webixLibStrings.onBeforeDrag
    - webixLib.webixLibStrings.onBeforeDragIn
    - webixLib.webixLibStrings.onBeforeDrop
    - webixLib.webixLibStrings.onBeforeDropOrder
    - webixLib.webixLibStrings.onBeforeDropOut
    - webixLib.webixLibStrings.onBeforeLoad
    - webixLib.webixLibStrings.onBeforeOpen
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBeforeSelect
    - webixLib.webixLibStrings.onBeforeSort
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDataRequest
    - webixLib.webixLibStrings.onDataUpdate
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onDragOut
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onItemCheck
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onItemDblClick
    - webixLib.webixLibStrings.onItemRender
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLoadError
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onMouseMove
    - webixLib.webixLibStrings.onMouseMoving
    - webixLib.webixLibStrings.onMouseOut
    - webixLib.webixLibStrings.onPartialRender
    - webixLib.webixLibStrings.onPaste
    - webixLib.webixLibStrings.onSelectChange
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onValidationError
    - webixLib.webixLibStrings.onValidationSuccess
    - webixLib.webixLibStrings.onViewResize
  */
  trait sidebarEventName extends js.Object
  
  @js.native
  class sidemenu () extends baseview {
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_sidemenu: sidemenuConfig = js.native
    def attachEvent(`type`: sidemenuEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: sidemenuEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def close(): scala.Unit = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def getBody(): js.Any = js.native
    def getHead(): js.Any = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def resizeChildren(): scala.Unit = js.native
    def setPosition(x: scala.Double, y: scala.Double): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait sidemenuConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var autofit: js.UndefOr[scala.Boolean] = js.undefined
    var autofocus: js.UndefOr[scala.Boolean] = js.undefined
    var body: js.UndefOr[java.lang.String | baseview] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var head: js.UndefOr[js.Any] = js.undefined
    var headHeight: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var left: js.UndefOr[scala.Double] = js.undefined
    var master: js.UndefOr[java.lang.String] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var modal: js.UndefOr[scala.Boolean] = js.undefined
    var move: js.UndefOr[scala.Boolean] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var padding: js.UndefOr[js.Any] = js.undefined
    var point: js.UndefOr[scala.Boolean] = js.undefined
    var position: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var relative: js.UndefOr[java.lang.String] = js.undefined
    var resize: js.UndefOr[scala.Boolean] = js.undefined
    var state: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var toFront: js.UndefOr[scala.Boolean] = js.undefined
    var top: js.UndefOr[scala.Double] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
    var zIndex: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBeforeShow
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onHide
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onShow
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewMove
    - webixLib.webixLibStrings.onViewMoveEnd
    - webixLib.webixLibStrings.onViewResize
  */
  trait sidemenuEventName extends js.Object
  
  @js.native
  class slider () extends baseview {
    @JSName("$compareValue")
    var $compareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$prepareValue")
    var $prepareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$renderIcon")
    var $renderIcon_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$render")
    var $render_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("$touchCapture")
    var $touchCapture: scala.Boolean = js.native
    @JSName("config")
    var config_slider: sliderConfig = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var touchable: scala.Boolean = js.native
    @JSName("$compareValue")
    def $compareValue(args: js.Any*): js.Any = js.native
    @JSName("$getValue")
    def $getValue(): java.lang.String = js.native
    @JSName("$prepareValue")
    def $prepareValue(args: js.Any*): js.Any = js.native
    @JSName("$render")
    def $render(args: js.Any*): js.Any = js.native
    @JSName("$renderIcon")
    def $renderIcon(args: js.Any*): js.Any = js.native
    @JSName("$renderInput")
    def $renderInput(obj: js.Any, html: java.lang.String, id: java.lang.String): java.lang.String = js.native
    @JSName("$renderInput")
    def $renderInput(obj: js.Any, html: java.lang.String, id: scala.Double): java.lang.String = js.native
    @JSName("$renderLabel")
    def $renderLabel(config: js.Any, id: java.lang.String): java.lang.String = js.native
    @JSName("$renderLabel")
    def $renderLabel(config: js.Any, id: scala.Double): java.lang.String = js.native
    @JSName("$setValue")
    def $setValue(value: java.lang.String): scala.Unit = js.native
    def attachEvent(`type`: sliderEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: sliderEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def blur(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def focus(): scala.Unit = js.native
    def getInputNode(): stdLib.HTMLElement = js.native
    def getValue(): java.lang.String = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def refresh(): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def setBottomText(text: java.lang.String): scala.Unit = js.native
    def setValue(value: java.lang.String): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def validate(): scala.Boolean = js.native
  }
  
  trait sliderConfig extends js.Object {
    var align: js.UndefOr[java.lang.String] = js.undefined
    var animate: js.UndefOr[js.Any] = js.undefined
    var attributes: js.UndefOr[js.Any] = js.undefined
    var autowidth: js.UndefOr[scala.Boolean] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var bottomLabel: js.UndefOr[java.lang.String] = js.undefined
    var bottomPadding: js.UndefOr[scala.Double] = js.undefined
    var click: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var format: js.UndefOr[js.Any] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var hotkey: js.UndefOr[java.lang.String] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var inputAlign: js.UndefOr[java.lang.String] = js.undefined
    var inputHeight: js.UndefOr[scala.Double] = js.undefined
    var inputPadding: js.UndefOr[scala.Double] = js.undefined
    var inputWidth: js.UndefOr[scala.Double] = js.undefined
    var invalid: js.UndefOr[scala.Boolean] = js.undefined
    var invalidMessage: js.UndefOr[java.lang.String] = js.undefined
    var label: js.UndefOr[java.lang.String] = js.undefined
    var labelAlign: js.UndefOr[java.lang.String] = js.undefined
    var labelPosition: js.UndefOr[java.lang.String] = js.undefined
    var labelWidth: js.UndefOr[scala.Double] = js.undefined
    var max: js.UndefOr[scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var min: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var moveTitle: js.UndefOr[scala.Boolean] = js.undefined
    var name: js.UndefOr[java.lang.String] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var placeholder: js.UndefOr[java.lang.String] = js.undefined
    var popup: js.UndefOr[java.lang.String] = js.undefined
    var readonly: js.UndefOr[scala.Boolean] = js.undefined
    var relatedAction: js.UndefOr[java.lang.String] = js.undefined
    var relatedView: js.UndefOr[java.lang.String] = js.undefined
    var required: js.UndefOr[scala.Boolean] = js.undefined
    var step: js.UndefOr[scala.Double] = js.undefined
    var suggest: js.UndefOr[js.Any] = js.undefined
    var title: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var tooltip: js.UndefOr[java.lang.String] = js.undefined
    var validate: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var validateEvent: js.UndefOr[java.lang.String] = js.undefined
    var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var vertical: js.UndefOr[scala.Boolean] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onChange
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onSliderDrag
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait sliderEventName extends js.Object
  
  @js.native
  class spacer () extends baseview {
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_spacer: spacerConfig = js.native
  }
  
  trait spacerConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait spacerEventName extends js.Object
  
  @js.native
  class spreadsheet () extends baseview {
    @JSName("$$")
    var $$: js.Any = js.native
    @JSName("config")
    var config_spreadsheet: spreadsheetConfig = js.native
    def addFilter(rowId: scala.Double, columnId: scala.Double): scala.Unit = js.native
    def addImage(rowId: scala.Double, columnId: scala.Double, url: java.lang.String): scala.Unit = js.native
    def addSheet(content: js.Any): scala.Unit = js.native
    def addSparkline(rowId: scala.Double, columnId: scala.Double, config: js.Any): scala.Unit = js.native
    def addStyle(styleProps: js.Any, baseStyle: js.Any): scala.Unit = js.native
    def alert(config: js.Any): stdLib.HTMLElement = js.native
    def attachEvent(`type`: spreadsheetEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: spreadsheetEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def clearRange(rangeStr: java.lang.String, `type`: js.Any): scala.Unit = js.native
    def clearSheet(): scala.Unit = js.native
    def combineCells(): scala.Unit = js.native
    def combineCells(range: js.Any): scala.Unit = js.native
    def compactStyles(): scala.Unit = js.native
    def confirm(config: js.Any): scala.Unit = js.native
    def deleteColumn(columnId: scala.Double): scala.Unit = js.native
    def deleteRow(rowId: scala.Double): scala.Unit = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def eachSelectedCell(handler: webixLib.webixMod.WebixCallback): scala.Unit = js.native
    def editSheet(name: java.lang.String): scala.Unit = js.native
    def filterSpreadSheet(): scala.Unit = js.native
    def freezeColumns(columns: scala.Double): scala.Unit = js.native
    def freezeRows(rows: scala.Double): scala.Unit = js.native
    def getActiveSheet(): java.lang.String = js.native
    def getCellEditor(row: scala.Double, column: scala.Double): js.Any = js.native
    def getCellValue(row: scala.Double, column: scala.Double): java.lang.String = js.native
    def getColumn(id: java.lang.String): js.Any = js.native
    def getRow(id: java.lang.String): js.Any = js.native
    def getSelectedId(): js.Array[_] = js.native
    def getSelectedRange(): java.lang.String = js.native
    def getSheetData(sheet_name: java.lang.String): scala.Unit = js.native
    def getStyle(row: scala.Double, column: scala.Double): js.Any = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def hideColumn(columnId: scala.Double, state: scala.Boolean): scala.Unit = js.native
    def hideGridlines(state: scala.Boolean): scala.Unit = js.native
    def hideHeaders(state: scala.Boolean): scala.Unit = js.native
    def hideRow(rowId: scala.Double, state: scala.Boolean): scala.Unit = js.native
    def innerId(id: java.lang.String): scala.Double | java.lang.String = js.native
    def innerId(id: scala.Double): scala.Double | java.lang.String = js.native
    def insertColumn(columnId: scala.Double): scala.Unit = js.native
    def insertRow(rowId: scala.Double): scala.Unit = js.native
    def isCellLocked(rowId: scala.Double, columnId: scala.Double): scala.Boolean = js.native
    def isColumnVisible(columnId: scala.Double): scala.Boolean = js.native
    def isRowVisible(rowId: scala.Double): scala.Boolean = js.native
    def load(url: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String, callback: webixLib.webixMod.WebixCallback): js.Promise[_] = js.native
    def lockCell(row: js.Any, column: js.Any, state: scala.Boolean): scala.Unit = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def recalculate(): scala.Unit = js.native
    def redo(): scala.Unit = js.native
    def refresh(): scala.Unit = js.native
    def registerMathMethod(name: java.lang.String, handler: webixLib.webixMod.WebixCallback): scala.Unit = js.native
    def removeFilter(): scala.Unit = js.native
    def removeSheet(name: java.lang.String): scala.Unit = js.native
    def renameSheet(name: java.lang.String, newName: java.lang.String): scala.Unit = js.native
    def reset(): scala.Unit = js.native
    def resetUndo(): scala.Unit = js.native
    def saveCell(row: scala.Double, column: scala.Double): scala.Unit = js.native
    def serialize(): js.Any = js.native
    def serialize(options: js.Any): js.Any = js.native
    def setCellEditor(rowId: scala.Double, columnId: scala.Double, editorObject: js.Any): scala.Unit = js.native
    def setCellFilter(rowId: scala.Double, columnId: scala.Double, options: java.lang.String): scala.Unit = js.native
    def setCellFilter(rowId: scala.Double, columnId: scala.Double, options: js.Array[_]): scala.Unit = js.native
    def setCellValue(row: scala.Double, column: js.Any, value: java.lang.String): scala.Unit = js.native
    def setFormat(rowId: scala.Double, columnId: scala.Double, format: java.lang.String): scala.Unit = js.native
    def setPlaceholder(placeholder: js.Any): scala.Unit = js.native
    def setRangeStyle(rangeStr: java.lang.String, style: js.Any): scala.Unit = js.native
    def setRangeValue(range: java.lang.String): scala.Unit = js.native
    def setStyle(row: scala.Double, column: scala.Double, style: js.Any): scala.Unit = js.native
    def showSheet(name: java.lang.String): scala.Unit = js.native
    def sortRange(): scala.Unit = js.native
    def sortRange(range: java.lang.String): scala.Unit = js.native
    def sortRange(range: java.lang.String, dir: java.lang.String): scala.Unit = js.native
    def splitCell(row: scala.Double, column: scala.Double): scala.Unit = js.native
    def ui(view: js.Any): baseview = js.native
    def unblockEvent(): scala.Unit = js.native
    def undo(id: java.lang.String): scala.Unit = js.native
  }
  
  trait spreadsheetConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var bottombar: js.UndefOr[scala.Boolean] = js.undefined
    var buttons: js.UndefOr[js.Any] = js.undefined
    var columnCount: js.UndefOr[scala.Double] = js.undefined
    var conditionStyle: js.UndefOr[js.Array[_]] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var data: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
    var datatype: js.UndefOr[java.lang.String] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var liveEditor: js.UndefOr[scala.Boolean] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var menu: js.UndefOr[scala.Boolean] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var padding: js.UndefOr[scala.Double] = js.undefined
    var paddingX: js.UndefOr[scala.Double] = js.undefined
    var paddingY: js.UndefOr[scala.Double] = js.undefined
    var readonly: js.UndefOr[scala.Boolean] = js.undefined
    var resizeCell: js.UndefOr[scala.Boolean] = js.undefined
    var rowCount: js.UndefOr[scala.Double] = js.undefined
    var sheetTabWidth: js.UndefOr[scala.Double] = js.undefined
    var subbar: js.UndefOr[js.Any] = js.undefined
    var toolbar: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    var url: js.UndefOr[js.Any] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterLoad
    - webixLib.webixLibStrings.onAfterSelect
    - webixLib.webixLibStrings.onAfterSheetShow
    - webixLib.webixLibStrings.onBeforeLoad
    - webixLib.webixLibStrings.onBeforeSheetShow
    - webixLib.webixLibStrings.onBeforeSpan
    - webixLib.webixLibStrings.onBeforeSplit
    - webixLib.webixLibStrings.onBeforeValueChange
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onCellChange
    - webixLib.webixLibStrings.onComponentInit
    - webixLib.webixLibStrings.onDataParse
    - webixLib.webixLibStrings.onDataSerialize
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onLoadError
    - webixLib.webixLibStrings.onMathRefresh
    - webixLib.webixLibStrings.onReset
    - webixLib.webixLibStrings.onSheetAdd
    - webixLib.webixLibStrings.onSheetRemove
    - webixLib.webixLibStrings.onSheetRename
    - webixLib.webixLibStrings.onStyleSet
  */
  trait spreadsheetEventName extends js.Object
  
  @js.native
  class submenu () extends baseview {
    @JSName("$customPrint")
    var $customPrint_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$dragHTML")
    var $dragHTML_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$dropAllow")
    var $dropAllow_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_submenu: submenuConfig = js.native
    var data: webixLib.webixMod.DataStore = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var on_context: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    @JSName("on_dblclick")
    var on_dblclick_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("on_mouse_move")
    var on_mouse_move_Original: webixLib.webixMod.WebixCallback = js.native
    var `type`: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    var types: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    var waitData: js.Promise[_] = js.native
    @JSName("$customPrint")
    def $customPrint(args: js.Any*): js.Any = js.native
    @JSName("$drag")
    def $drag(source: stdLib.HTMLElement, ev: stdLib.Event): java.lang.String = js.native
    @JSName("$dragHTML")
    def $dragHTML(args: js.Any*): js.Any = js.native
    @JSName("$dragIn")
    def $dragIn(source: stdLib.HTMLElement, target: stdLib.HTMLElement, ev: stdLib.Event): stdLib.HTMLElement = js.native
    @JSName("$dragMark")
    def $dragMark(context: js.Any, ev: stdLib.Event): scala.Boolean = js.native
    @JSName("$dragOut")
    def $dragOut(
      source: stdLib.HTMLElement,
      old_target: stdLib.HTMLElement,
      new_target: stdLib.HTMLElement,
      ev: stdLib.Event
    ): scala.Unit = js.native
    @JSName("$drop")
    def $drop(source: stdLib.HTMLElement, target: stdLib.HTMLElement, ev: stdLib.Event): scala.Unit = js.native
    @JSName("$dropAllow")
    def $dropAllow(args: js.Any*): js.Any = js.native
    def add(obj: js.Any): java.lang.String | scala.Double = js.native
    def add(obj: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
    def addCss(id: java.lang.String, css: java.lang.String): scala.Unit = js.native
    def addCss(id: java.lang.String, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def addCss(id: scala.Double, css: java.lang.String): scala.Unit = js.native
    def addCss(id: scala.Double, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def attachEvent(`type`: submenuEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: submenuEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def clearAll(): scala.Unit = js.native
    def clearAll(soft: scala.Boolean): scala.Unit = js.native
    def clearCss(css: java.lang.String): scala.Unit = js.native
    def clearCss(css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def clearValidation(): scala.Unit = js.native
    def close(): scala.Unit = js.native
    def copy(sid: java.lang.String, tindex: scala.Double): scala.Unit = js.native
    def copy(sid: java.lang.String, tindex: scala.Double, tobj: js.Any): scala.Unit = js.native
    def copy(sid: java.lang.String, tindex: scala.Double, tobj: js.Any, details: js.Any): scala.Unit = js.native
    def copy(sid: scala.Double, tindex: scala.Double): scala.Unit = js.native
    def copy(sid: scala.Double, tindex: scala.Double, tobj: js.Any): scala.Unit = js.native
    def copy(sid: scala.Double, tindex: scala.Double, tobj: js.Any, details: js.Any): scala.Unit = js.native
    def count(): scala.Double = js.native
    def customize(obj: js.Any): scala.Unit = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def disableItem(id: java.lang.String): scala.Unit = js.native
    def disableItem(id: scala.Double): scala.Unit = js.native
    def enableItem(id: java.lang.String): scala.Unit = js.native
    def enableItem(id: scala.Double): scala.Unit = js.native
    def exists(id: java.lang.String): scala.Boolean = js.native
    def exists(id: scala.Double): scala.Boolean = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate): scala.Unit = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate, value: java.lang.String): scala.Unit = js.native
    def filter(
      text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate,
      value: java.lang.String,
      preserve: scala.Boolean
    ): scala.Unit = js.native
    def filter(text: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def find(criterion: webixLib.webixMod.WebixCallback): js.Any = js.native
    def find(criterion: webixLib.webixMod.WebixCallback, first: scala.Boolean): js.Any = js.native
    def getBody(): js.Any = js.native
    def getFirstId(): java.lang.String | scala.Double = js.native
    def getHead(): js.Any = js.native
    def getIdByIndex(index: scala.Double): java.lang.String | scala.Double = js.native
    def getIndexById(id: java.lang.String): scala.Double = js.native
    def getIndexById(id: scala.Double): scala.Double = js.native
    def getItem(id: java.lang.String): js.Any = js.native
    def getItem(id: scala.Double): js.Any = js.native
    def getItemNode(id: java.lang.String): stdLib.HTMLElement = js.native
    def getItemNode(id: scala.Double): stdLib.HTMLElement = js.native
    def getLastId(): java.lang.String | scala.Double = js.native
    def getMenu(id: java.lang.String): js.Any = js.native
    def getMenu(id: scala.Double): js.Any = js.native
    def getMenuItem(id: java.lang.String): js.Any = js.native
    def getMenuItem(id: scala.Double): js.Any = js.native
    def getNextId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getNextId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPage(): scala.Double = js.native
    def getPager(): js.Any = js.native
    def getPrevId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPrevId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def getScrollState(): js.Any = js.native
    def getSelectedId(as_array: scala.Boolean): java.lang.String | js.Array[_] = js.native
    def getSelectedItem(as_array: scala.Boolean): js.Any = js.native
    def getSubMenu(id: java.lang.String): js.Any = js.native
    def getSubMenu(id: scala.Double): js.Any = js.native
    def getTopMenu(): js.Any = js.native
    def getVisibleCount(): scala.Double = js.native
    def hasCss(id: java.lang.String, css: java.lang.String): scala.Boolean = js.native
    def hasCss(id: scala.Double, css: java.lang.String): scala.Boolean = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def hideItem(id: java.lang.String): scala.Unit = js.native
    def hideItem(id: scala.Double): scala.Unit = js.native
    def isSelected(id: java.lang.String): scala.Boolean = js.native
    def isSelected(id: scala.Double): scala.Boolean = js.native
    def load(url: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String, callback: webixLib.webixMod.WebixCallback): js.Promise[_] = js.native
    def loadNext(
      count: scala.Double,
      start: scala.Double,
      callback: webixLib.webixMod.WebixCallback,
      url: java.lang.String,
      now: scala.Boolean
    ): scala.Unit = js.native
    def locate(e: stdLib.Event): java.lang.String | scala.Double = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def move(sid: java.lang.String, tindex: scala.Double): java.lang.String = js.native
    def move(sid: java.lang.String, tindex: scala.Double, tobj: js.Any): java.lang.String = js.native
    def move(sid: java.lang.String, tindex: scala.Double, tobj: js.Any, details: js.Any): java.lang.String = js.native
    def moveBottom(id: java.lang.String): scala.Unit = js.native
    def moveBottom(id: scala.Double): scala.Unit = js.native
    def moveDown(id: java.lang.String, step: scala.Double): scala.Unit = js.native
    def moveDown(id: scala.Double, step: scala.Double): scala.Unit = js.native
    def moveSelection(direction: java.lang.String): scala.Unit = js.native
    def moveTop(id: java.lang.String): scala.Unit = js.native
    def moveTop(id: scala.Double): scala.Unit = js.native
    def moveUp(id: java.lang.String, step: scala.Double): scala.Unit = js.native
    def moveUp(id: scala.Double, step: scala.Double): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def on_dblclick(args: js.Any*): js.Any = js.native
    def on_mouse_move(args: js.Any*): js.Any = js.native
    def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def refresh(): scala.Unit = js.native
    def refresh(id: java.lang.String): scala.Unit = js.native
    def refresh(id: scala.Double): scala.Unit = js.native
    def remove(id: java.lang.String): scala.Unit = js.native
    def remove(id: scala.Double): scala.Unit = js.native
    def removeCss(id: java.lang.String, css: java.lang.String): scala.Unit = js.native
    def removeCss(id: java.lang.String, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def removeCss(id: scala.Double, css: java.lang.String): scala.Unit = js.native
    def removeCss(id: scala.Double, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def resizeChildren(): scala.Unit = js.native
    def scrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
    def select(id: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def select(id: js.Array[_], preserve: scala.Boolean): scala.Unit = js.native
    def selectAll(): scala.Unit = js.native
    def selectAll(from: java.lang.String): scala.Unit = js.native
    def selectAll(from: java.lang.String, to: java.lang.String): scala.Unit = js.native
    def serialize(): js.Array[_] = js.native
    def setPage(page: scala.Double): scala.Unit = js.native
    def setPosition(x: scala.Double, y: scala.Double): scala.Unit = js.native
    def show(node: stdLib.HTMLElement): scala.Unit = js.native
    def show(node: stdLib.HTMLElement, position: js.Any): scala.Unit = js.native
    def show(node: stdLib.HTMLElement, position: js.Any, point: java.lang.String): scala.Unit = js.native
    def showItem(id: java.lang.String): scala.Unit = js.native
    def showItem(id: scala.Double): scala.Unit = js.native
    def sizeToContent(): scala.Unit = js.native
    def sort(by: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String, as: java.lang.String): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def unselect(): scala.Unit = js.native
    def unselect(id: java.lang.String): scala.Unit = js.native
    def unselectAll(): scala.Unit = js.native
    def updateItem(id: java.lang.String, data: js.Any): scala.Unit = js.native
    def updateItem(id: scala.Double, data: js.Any): scala.Unit = js.native
    def validate(): scala.Boolean = js.native
    def validate(id: java.lang.String): scala.Boolean = js.native
  }
  
  trait submenuConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var autofit: js.UndefOr[scala.Boolean] = js.undefined
    var autofocus: js.UndefOr[scala.Boolean] = js.undefined
    var autoheight: js.UndefOr[scala.Boolean] = js.undefined
    var autowidth: js.UndefOr[scala.Boolean] = js.undefined
    var body: js.UndefOr[java.lang.String | baseview] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var click: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var clipboard: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var data: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
    var dataFeed: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var datafetch: js.UndefOr[scala.Double] = js.undefined
    var datathrottle: js.UndefOr[scala.Double] = js.undefined
    var datatype: js.UndefOr[java.lang.String] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var drag: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var dragscroll: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var dynamic: js.UndefOr[scala.Boolean] = js.undefined
    var externalData: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var head: js.UndefOr[js.Any] = js.undefined
    var headHeight: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var item: js.UndefOr[js.Any] = js.undefined
    var layout: js.UndefOr[java.lang.String] = js.undefined
    var left: js.UndefOr[scala.Double] = js.undefined
    var master: js.UndefOr[java.lang.String] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var modal: js.UndefOr[scala.Boolean] = js.undefined
    var mouseEventDelay: js.UndefOr[scala.Double] = js.undefined
    var move: js.UndefOr[scala.Boolean] = js.undefined
    var multiselect: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
    var navigation: js.UndefOr[scala.Boolean] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var onClick: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var onContext: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var onDblClick: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var onMouseMove: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var openAction: js.UndefOr[java.lang.String] = js.undefined
    var padding: js.UndefOr[js.Any] = js.undefined
    var pager: js.UndefOr[js.Any] = js.undefined
    var point: js.UndefOr[scala.Boolean] = js.undefined
    var position: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var ready: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var relative: js.UndefOr[java.lang.String] = js.undefined
    var removeMissed: js.UndefOr[scala.Boolean] = js.undefined
    var resize: js.UndefOr[scala.Boolean] = js.undefined
    var rules: js.UndefOr[js.Any] = js.undefined
    var save: js.UndefOr[java.lang.String] = js.undefined
    var scheme: js.UndefOr[js.Any] = js.undefined
    var scroll: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var scrollSpeed: js.UndefOr[java.lang.String] = js.undefined
    var select: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var subMenuPos: js.UndefOr[java.lang.String] = js.undefined
    var submenuConfig: js.UndefOr[js.Any] = js.undefined
    var template: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var templateCopy: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var toFront: js.UndefOr[scala.Boolean] = js.undefined
    var tooltip: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
    var top: js.UndefOr[scala.Double] = js.undefined
    var `type`: js.UndefOr[js.Any] = js.undefined
    var url: js.UndefOr[js.Any] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
    var xCount: js.UndefOr[scala.Double] = js.undefined
    var yCount: js.UndefOr[scala.Double] = js.undefined
    var zIndex: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterAdd
    - webixLib.webixLibStrings.onAfterContextMenu
    - webixLib.webixLibStrings.onAfterDelete
    - webixLib.webixLibStrings.onAfterDrop
    - webixLib.webixLibStrings.onAfterDropOrder
    - webixLib.webixLibStrings.onAfterLoad
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onAfterSelect
    - webixLib.webixLibStrings.onAfterSort
    - webixLib.webixLibStrings.onBeforeAdd
    - webixLib.webixLibStrings.onBeforeContextMenu
    - webixLib.webixLibStrings.onBeforeDelete
    - webixLib.webixLibStrings.onBeforeDrag
    - webixLib.webixLibStrings.onBeforeDragIn
    - webixLib.webixLibStrings.onBeforeDrop
    - webixLib.webixLibStrings.onBeforeDropOrder
    - webixLib.webixLibStrings.onBeforeDropOut
    - webixLib.webixLibStrings.onBeforeLoad
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBeforeSelect
    - webixLib.webixLibStrings.onBeforeShow
    - webixLib.webixLibStrings.onBeforeSort
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDataRequest
    - webixLib.webixLibStrings.onDataUpdate
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onDragOut
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onHide
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onItemDblClick
    - webixLib.webixLibStrings.onItemRender
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLoadError
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onMenuItemClick
    - webixLib.webixLibStrings.onMouseMove
    - webixLib.webixLibStrings.onMouseMoving
    - webixLib.webixLibStrings.onMouseOut
    - webixLib.webixLibStrings.onPaste
    - webixLib.webixLibStrings.onSelectChange
    - webixLib.webixLibStrings.onShow
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onValidationError
    - webixLib.webixLibStrings.onValidationSuccess
    - webixLib.webixLibStrings.onViewMove
    - webixLib.webixLibStrings.onViewMoveEnd
    - webixLib.webixLibStrings.onViewResize
  */
  trait submenuEventName extends js.Object
  
  @js.native
  class suggest () extends baseview {
    @JSName("$enterKey")
    var $enterKey_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_suggest: suggestConfig = js.native
    @JSName("$enterKey")
    def $enterKey(args: js.Any*): js.Any = js.native
    def attachEvent(`type`: suggestEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: suggestEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def close(): scala.Unit = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def getBody(): js.Any = js.native
    def getHead(): js.Any = js.native
    def getItemId(text: java.lang.String): java.lang.String | scala.Double = js.native
    def getItemText(id: java.lang.String): java.lang.String = js.native
    def getItemText(id: scala.Double): java.lang.String = js.native
    def getList(): baseview = js.native
    def getMasterValue(): js.Any = js.native
    def getSuggestion(): java.lang.String = js.native
    def getValue(): java.lang.String | scala.Double = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def linkInput(input: stdLib.HTMLElement): scala.Unit = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def resizeChildren(): scala.Unit = js.native
    def setMasterValue(value: js.Any): scala.Unit = js.native
    def setPosition(x: scala.Double, y: scala.Double): scala.Unit = js.native
    def setValue(value: java.lang.String): scala.Unit = js.native
    def setValue(value: scala.Double): scala.Unit = js.native
    def show(node: stdLib.HTMLElement): scala.Unit = js.native
    def show(node: stdLib.HTMLElement, position: js.Any): scala.Unit = js.native
    def show(node: stdLib.HTMLElement, position: js.Any, point: java.lang.String): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait suggestConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var autofit: js.UndefOr[scala.Boolean] = js.undefined
    var autofocus: js.UndefOr[scala.Boolean] = js.undefined
    var body: js.UndefOr[java.lang.String | baseview] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var data: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var filter: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var fitMaster: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var head: js.UndefOr[js.Any] = js.undefined
    var headHeight: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var input: js.UndefOr[stdLib.HTMLElement | java.lang.String] = js.undefined
    var keyPressTimeout: js.UndefOr[scala.Double] = js.undefined
    var left: js.UndefOr[scala.Double] = js.undefined
    var master: js.UndefOr[java.lang.String] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var modal: js.UndefOr[scala.Boolean] = js.undefined
    var move: js.UndefOr[scala.Boolean] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var padding: js.UndefOr[js.Any] = js.undefined
    var point: js.UndefOr[scala.Boolean] = js.undefined
    var position: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var relative: js.UndefOr[java.lang.String] = js.undefined
    var resize: js.UndefOr[scala.Boolean] = js.undefined
    var template: js.UndefOr[java.lang.String | webixLib.webixMod.WebixTemplate] = js.undefined
    var textValue: js.UndefOr[java.lang.String] = js.undefined
    var toFront: js.UndefOr[scala.Boolean] = js.undefined
    var top: js.UndefOr[scala.Double] = js.undefined
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    var url: js.UndefOr[java.lang.String] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
    var zIndex: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBeforeShow
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onHide
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onShow
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onValueSuggest
    - webixLib.webixLibStrings.onViewMove
    - webixLib.webixLibStrings.onViewMoveEnd
    - webixLib.webixLibStrings.onViewResize
  */
  trait suggestEventName extends js.Object
  
  @js.native
  class switchButton () extends baseview {
    @JSName("$compareValue")
    var $compareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$prepareValue")
    var $prepareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$renderIcon")
    var $renderIcon_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$render")
    var $render_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_switchButton: switchButtonConfig = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var touchable: scala.Boolean = js.native
    @JSName("$compareValue")
    def $compareValue(args: js.Any*): js.Any = js.native
    @JSName("$getValue")
    def $getValue(): java.lang.String = js.native
    @JSName("$prepareValue")
    def $prepareValue(args: js.Any*): js.Any = js.native
    @JSName("$render")
    def $render(args: js.Any*): js.Any = js.native
    @JSName("$renderIcon")
    def $renderIcon(args: js.Any*): js.Any = js.native
    @JSName("$renderInput")
    def $renderInput(config: js.Any): stdLib.HTMLElement = js.native
    @JSName("$renderLabel")
    def $renderLabel(config: js.Any, id: java.lang.String): java.lang.String = js.native
    @JSName("$renderLabel")
    def $renderLabel(config: js.Any, id: scala.Double): java.lang.String = js.native
    @JSName("$setValue")
    def $setValue(value: java.lang.String): scala.Unit = js.native
    def attachEvent(`type`: switchButtonEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: switchButtonEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def blur(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def focus(): scala.Unit = js.native
    def getInputNode(): stdLib.HTMLElement = js.native
    def getValue(): java.lang.String = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def refresh(): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def setBottomText(text: java.lang.String): scala.Unit = js.native
    def setValue(value: java.lang.String): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def toggle(): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def validate(): scala.Boolean = js.native
  }
  
  trait switchButtonConfig extends js.Object {
    var align: js.UndefOr[java.lang.String] = js.undefined
    var animate: js.UndefOr[js.Any] = js.undefined
    var attributes: js.UndefOr[js.Any] = js.undefined
    var autowidth: js.UndefOr[scala.Boolean] = js.undefined
    var badge: js.UndefOr[scala.Double | java.lang.String] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var bottomLabel: js.UndefOr[java.lang.String] = js.undefined
    var bottomPadding: js.UndefOr[scala.Double] = js.undefined
    var checkValue: js.UndefOr[java.lang.String] = js.undefined
    var click: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var customCheckbox: js.UndefOr[scala.Boolean] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var format: js.UndefOr[js.Any] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var hotkey: js.UndefOr[java.lang.String] = js.undefined
    var icon: js.UndefOr[java.lang.String] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var image: js.UndefOr[java.lang.String] = js.undefined
    var inputAlign: js.UndefOr[java.lang.String] = js.undefined
    var inputHeight: js.UndefOr[scala.Double] = js.undefined
    var inputPadding: js.UndefOr[scala.Double] = js.undefined
    var inputWidth: js.UndefOr[scala.Double] = js.undefined
    var invalid: js.UndefOr[scala.Boolean] = js.undefined
    var invalidMessage: js.UndefOr[java.lang.String] = js.undefined
    var label: js.UndefOr[java.lang.String] = js.undefined
    var labelAlign: js.UndefOr[java.lang.String] = js.undefined
    var labelPosition: js.UndefOr[java.lang.String] = js.undefined
    var labelRight: js.UndefOr[java.lang.String] = js.undefined
    var labelWidth: js.UndefOr[scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var name: js.UndefOr[java.lang.String] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var pattern: js.UndefOr[js.Any] = js.undefined
    var placeholder: js.UndefOr[java.lang.String] = js.undefined
    var popup: js.UndefOr[java.lang.String] = js.undefined
    var readonly: js.UndefOr[scala.Boolean] = js.undefined
    var relatedAction: js.UndefOr[java.lang.String] = js.undefined
    var relatedView: js.UndefOr[java.lang.String] = js.undefined
    var required: js.UndefOr[scala.Boolean] = js.undefined
    var suggest: js.UndefOr[js.Any] = js.undefined
    var tooltip: js.UndefOr[java.lang.String] = js.undefined
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    var uncheckValue: js.UndefOr[java.lang.String] = js.undefined
    var validate: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var validateEvent: js.UndefOr[java.lang.String] = js.undefined
    var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onChange
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait switchButtonEventName extends js.Object
  
  @js.native
  class tabbar () extends baseview {
    @JSName("$compareValue")
    var $compareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$prepareValue")
    var $prepareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$renderIcon")
    var $renderIcon_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$render")
    var $render_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_tabbar: tabbarConfig = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var touchable: scala.Boolean = js.native
    @JSName("$compareValue")
    def $compareValue(args: js.Any*): js.Any = js.native
    @JSName("$getValue")
    def $getValue(): java.lang.String = js.native
    @JSName("$prepareValue")
    def $prepareValue(args: js.Any*): js.Any = js.native
    @JSName("$render")
    def $render(args: js.Any*): js.Any = js.native
    @JSName("$renderIcon")
    def $renderIcon(args: js.Any*): js.Any = js.native
    @JSName("$renderInput")
    def $renderInput(obj: js.Any, html: java.lang.String, id: java.lang.String): java.lang.String = js.native
    @JSName("$renderInput")
    def $renderInput(obj: js.Any, html: java.lang.String, id: scala.Double): java.lang.String = js.native
    @JSName("$renderLabel")
    def $renderLabel(config: js.Any, id: java.lang.String): java.lang.String = js.native
    @JSName("$renderLabel")
    def $renderLabel(config: js.Any, id: scala.Double): java.lang.String = js.native
    @JSName("$setValue")
    def $setValue(value: java.lang.String): scala.Unit = js.native
    def addOption(id: java.lang.String, value: js.Any): scala.Unit = js.native
    def addOption(id: java.lang.String, value: js.Any, show: scala.Boolean): scala.Unit = js.native
    def addOption(id: java.lang.String, value: js.Any, show: scala.Boolean, index: scala.Double): scala.Unit = js.native
    def addOption(id: scala.Double, value: js.Any): scala.Unit = js.native
    def addOption(id: scala.Double, value: js.Any, show: scala.Boolean): scala.Unit = js.native
    def addOption(id: scala.Double, value: js.Any, show: scala.Boolean, index: scala.Double): scala.Unit = js.native
    def addOption(obj: js.Any): scala.Unit = js.native
    def addOption(obj: js.Any, show: scala.Boolean): scala.Unit = js.native
    def addOption(obj: js.Any, show: scala.Boolean, index: scala.Double): scala.Unit = js.native
    def attachEvent(`type`: tabbarEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: tabbarEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def blur(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def focus(): scala.Unit = js.native
    def getInputNode(): stdLib.HTMLElement = js.native
    def getPopup(): baseview = js.native
    def getValue(): java.lang.String = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def hideOption(id: java.lang.String): scala.Unit = js.native
    def hideOption(id: scala.Double): scala.Unit = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def optionIndex(ID: java.lang.String): scala.Double = js.native
    def optionIndex(ID: scala.Double): scala.Double = js.native
    def refresh(): scala.Unit = js.native
    def removeOption(id: java.lang.String): scala.Unit = js.native
    def removeOption(id: scala.Double): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def setBottomText(text: java.lang.String): scala.Unit = js.native
    def setValue(value: java.lang.String): scala.Unit = js.native
    def showOption(id: java.lang.String): scala.Unit = js.native
    def showOption(id: scala.Double): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def validate(): scala.Boolean = js.native
  }
  
  trait tabbarConfig extends js.Object {
    var align: js.UndefOr[java.lang.String] = js.undefined
    var animate: js.UndefOr[js.Any] = js.undefined
    var attributes: js.UndefOr[js.Any] = js.undefined
    var autowidth: js.UndefOr[scala.Boolean] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var bottomLabel: js.UndefOr[java.lang.String] = js.undefined
    var bottomOffset: js.UndefOr[scala.Double] = js.undefined
    var bottomPadding: js.UndefOr[scala.Double] = js.undefined
    var click: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var format: js.UndefOr[js.Any] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var hotkey: js.UndefOr[java.lang.String] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var inputAlign: js.UndefOr[java.lang.String] = js.undefined
    var inputHeight: js.UndefOr[scala.Double] = js.undefined
    var inputPadding: js.UndefOr[scala.Double] = js.undefined
    var inputWidth: js.UndefOr[scala.Double] = js.undefined
    var invalid: js.UndefOr[scala.Boolean] = js.undefined
    var invalidMessage: js.UndefOr[java.lang.String] = js.undefined
    var label: js.UndefOr[java.lang.String] = js.undefined
    var labelAlign: js.UndefOr[java.lang.String] = js.undefined
    var labelPosition: js.UndefOr[java.lang.String] = js.undefined
    var labelWidth: js.UndefOr[scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var moreTemplate: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var multiview: js.UndefOr[scala.Boolean] = js.undefined
    var name: js.UndefOr[java.lang.String] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var optionWidth: js.UndefOr[scala.Double] = js.undefined
    var options: js.UndefOr[js.Any] = js.undefined
    var placeholder: js.UndefOr[java.lang.String] = js.undefined
    var popup: js.UndefOr[java.lang.String] = js.undefined
    var popupTemplate: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var popupWidth: js.UndefOr[scala.Double] = js.undefined
    var readonly: js.UndefOr[scala.Boolean] = js.undefined
    var relatedAction: js.UndefOr[java.lang.String] = js.undefined
    var relatedView: js.UndefOr[java.lang.String] = js.undefined
    var required: js.UndefOr[scala.Boolean] = js.undefined
    var suggest: js.UndefOr[js.Any] = js.undefined
    var tabMargin: js.UndefOr[scala.Double] = js.undefined
    var tabMinWidth: js.UndefOr[scala.Double] = js.undefined
    var tabMoreWidth: js.UndefOr[scala.Double] = js.undefined
    var tabOffset: js.UndefOr[scala.Double] = js.undefined
    var tabbarPopup: js.UndefOr[baseview] = js.undefined
    var topOffset: js.UndefOr[scala.Double] = js.undefined
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    var validate: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var validateEvent: js.UndefOr[java.lang.String] = js.undefined
    var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
    var yCount: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onAfterTabClick
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBeforeTabClick
    - webixLib.webixLibStrings.onBeforeTabClose
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onChange
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onOptionRemove
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait tabbarEventName extends js.Object
  
  @js.native
  class tabview () extends baseview {
    @JSName("config")
    var config_tabview: tabviewConfig = js.native
    def addView(obj: js.Any): scala.Unit = js.native
    def attachEvent(`type`: tabviewEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: tabviewEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def getMultiview(): js.Any = js.native
    def getTabbar(): js.Any = js.native
    def getValue(): java.lang.String = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def removeView(id: js.Any): scala.Unit = js.native
    def setValue(value: java.lang.String): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait tabviewConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var cells: js.UndefOr[js.Array[_]] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var multiview: js.UndefOr[js.Any] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var padding: js.UndefOr[scala.Double] = js.undefined
    var paddingX: js.UndefOr[scala.Double] = js.undefined
    var paddingY: js.UndefOr[scala.Double] = js.undefined
    var tabbar: js.UndefOr[js.Any] = js.undefined
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onDestruct
  */
  trait tabviewEventName extends js.Object
  
  @js.native
  class template () extends baseview {
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_template: templateConfig = js.native
    def attachEvent(`type`: templateEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: templateEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def getScrollState(): js.Any = js.native
    def getValues(): scala.Unit = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def load(url: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String, callback: webixLib.webixMod.WebixCallback): js.Promise[_] = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def refresh(): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def scrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
    def setContent(node: js.Any): scala.Unit = js.native
    def setHTML(html: java.lang.String): scala.Unit = js.native
    def setValues(obj: js.Any): scala.Unit = js.native
    def setValues(obj: js.Any, update: scala.Boolean): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait templateConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var autoheight: js.UndefOr[scala.Boolean] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var content: js.UndefOr[java.lang.String | scala.Double | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var data: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
    var dataFeed: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var datatype: js.UndefOr[java.lang.String] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var onClick: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var scroll: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var scrollSpeed: js.UndefOr[java.lang.String] = js.undefined
    var src: js.UndefOr[java.lang.String] = js.undefined
    var template: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    var url: js.UndefOr[js.Any] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterLoad
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBeforeLoad
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLoadError
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait templateEventName extends js.Object
  
  @js.native
  class text () extends baseview {
    @JSName("$compareValue")
    var $compareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$prepareValue")
    var $prepareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$renderIcon")
    var $renderIcon_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$render")
    var $render_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_text: textConfig = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var touchable: scala.Boolean = js.native
    @JSName("$compareValue")
    def $compareValue(args: js.Any*): js.Any = js.native
    @JSName("$getValue")
    def $getValue(): java.lang.String = js.native
    @JSName("$prepareValue")
    def $prepareValue(args: js.Any*): js.Any = js.native
    @JSName("$render")
    def $render(args: js.Any*): js.Any = js.native
    @JSName("$renderIcon")
    def $renderIcon(args: js.Any*): js.Any = js.native
    @JSName("$renderInput")
    def $renderInput(config: js.Any): stdLib.HTMLElement = js.native
    @JSName("$renderLabel")
    def $renderLabel(config: js.Any, id: java.lang.String): java.lang.String = js.native
    @JSName("$renderLabel")
    def $renderLabel(config: js.Any, id: scala.Double): java.lang.String = js.native
    @JSName("$setValue")
    def $setValue(value: java.lang.String): scala.Unit = js.native
    def attachEvent(`type`: textEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: textEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def blur(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def focus(): scala.Unit = js.native
    def getInputNode(): stdLib.HTMLElement = js.native
    def getValue(): java.lang.String = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def refresh(): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def setBottomText(text: java.lang.String): scala.Unit = js.native
    def setValue(value: java.lang.String): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def validate(): scala.Boolean = js.native
  }
  
  trait textConfig extends js.Object {
    var align: js.UndefOr[java.lang.String] = js.undefined
    var animate: js.UndefOr[js.Any] = js.undefined
    var attributes: js.UndefOr[js.Any] = js.undefined
    var autowidth: js.UndefOr[scala.Boolean] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var bottomLabel: js.UndefOr[java.lang.String] = js.undefined
    var bottomPadding: js.UndefOr[scala.Double] = js.undefined
    var click: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var format: js.UndefOr[js.Any] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var hotkey: js.UndefOr[java.lang.String] = js.undefined
    var icon: js.UndefOr[java.lang.String] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var inputAlign: js.UndefOr[java.lang.String] = js.undefined
    var inputHeight: js.UndefOr[scala.Double] = js.undefined
    var inputPadding: js.UndefOr[scala.Double] = js.undefined
    var inputWidth: js.UndefOr[scala.Double] = js.undefined
    var invalid: js.UndefOr[scala.Boolean] = js.undefined
    var invalidMessage: js.UndefOr[java.lang.String] = js.undefined
    var label: js.UndefOr[java.lang.String] = js.undefined
    var labelAlign: js.UndefOr[java.lang.String] = js.undefined
    var labelPosition: js.UndefOr[java.lang.String] = js.undefined
    var labelWidth: js.UndefOr[scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var name: js.UndefOr[java.lang.String] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var pattern: js.UndefOr[js.Any] = js.undefined
    var placeholder: js.UndefOr[java.lang.String] = js.undefined
    var popup: js.UndefOr[java.lang.String] = js.undefined
    var readonly: js.UndefOr[scala.Boolean] = js.undefined
    var relatedAction: js.UndefOr[java.lang.String] = js.undefined
    var relatedView: js.UndefOr[java.lang.String] = js.undefined
    var required: js.UndefOr[scala.Boolean] = js.undefined
    var suggest: js.UndefOr[js.Any] = js.undefined
    var tooltip: js.UndefOr[java.lang.String] = js.undefined
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    var validate: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var validateEvent: js.UndefOr[java.lang.String] = js.undefined
    var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onChange
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait textEventName extends js.Object
  
  @js.native
  class textarea () extends baseview {
    @JSName("$compareValue")
    var $compareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$prepareValue")
    var $prepareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$renderIcon")
    var $renderIcon_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$render")
    var $render_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_textarea: textareaConfig = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var touchable: scala.Boolean = js.native
    @JSName("$compareValue")
    def $compareValue(args: js.Any*): js.Any = js.native
    @JSName("$getValue")
    def $getValue(): java.lang.String = js.native
    @JSName("$prepareValue")
    def $prepareValue(args: js.Any*): js.Any = js.native
    @JSName("$render")
    def $render(args: js.Any*): js.Any = js.native
    @JSName("$renderIcon")
    def $renderIcon(args: js.Any*): js.Any = js.native
    @JSName("$renderInput")
    def $renderInput(obj: js.Any, html: java.lang.String, id: java.lang.String): java.lang.String = js.native
    @JSName("$renderInput")
    def $renderInput(obj: js.Any, html: java.lang.String, id: scala.Double): java.lang.String = js.native
    @JSName("$renderLabel")
    def $renderLabel(config: js.Any, id: java.lang.String): java.lang.String = js.native
    @JSName("$renderLabel")
    def $renderLabel(config: js.Any, id: scala.Double): java.lang.String = js.native
    @JSName("$setValue")
    def $setValue(value: java.lang.String): scala.Unit = js.native
    def attachEvent(`type`: textareaEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: textareaEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def blur(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def focus(): scala.Unit = js.native
    def getInputNode(): stdLib.HTMLElement = js.native
    def getValue(): java.lang.String = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def refresh(): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def setBottomText(text: java.lang.String): scala.Unit = js.native
    def setValue(value: java.lang.String): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def validate(): scala.Boolean = js.native
  }
  
  trait textareaConfig extends js.Object {
    var align: js.UndefOr[java.lang.String] = js.undefined
    var animate: js.UndefOr[js.Any] = js.undefined
    var attributes: js.UndefOr[js.Any] = js.undefined
    var autowidth: js.UndefOr[scala.Boolean] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var bottomLabel: js.UndefOr[java.lang.String] = js.undefined
    var bottomPadding: js.UndefOr[scala.Double] = js.undefined
    var click: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var format: js.UndefOr[js.Any] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var hotkey: js.UndefOr[java.lang.String] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var inputAlign: js.UndefOr[java.lang.String] = js.undefined
    var inputHeight: js.UndefOr[scala.Double] = js.undefined
    var inputPadding: js.UndefOr[scala.Double] = js.undefined
    var inputWidth: js.UndefOr[scala.Double] = js.undefined
    var invalid: js.UndefOr[scala.Boolean] = js.undefined
    var invalidMessage: js.UndefOr[java.lang.String] = js.undefined
    var label: js.UndefOr[java.lang.String] = js.undefined
    var labelAlign: js.UndefOr[java.lang.String] = js.undefined
    var labelPosition: js.UndefOr[java.lang.String] = js.undefined
    var labelWidth: js.UndefOr[scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var name: js.UndefOr[java.lang.String] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var pattern: js.UndefOr[js.Any] = js.undefined
    var placeholder: js.UndefOr[java.lang.String] = js.undefined
    var popup: js.UndefOr[java.lang.String] = js.undefined
    var readonly: js.UndefOr[scala.Boolean] = js.undefined
    var relatedAction: js.UndefOr[java.lang.String] = js.undefined
    var relatedView: js.UndefOr[java.lang.String] = js.undefined
    var required: js.UndefOr[scala.Boolean] = js.undefined
    var suggest: js.UndefOr[js.Any] = js.undefined
    var tooltip: js.UndefOr[java.lang.String] = js.undefined
    var validate: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var validateEvent: js.UndefOr[java.lang.String] = js.undefined
    var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onChange
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait textareaEventName extends js.Object
  
  @js.native
  class toggle () extends baseview {
    @JSName("$compareValue")
    var $compareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$prepareValue")
    var $prepareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_toggle: toggleConfig = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var touchable: scala.Boolean = js.native
    @JSName("$compareValue")
    def $compareValue(args: js.Any*): js.Any = js.native
    @JSName("$getValue")
    def $getValue(): java.lang.String = js.native
    @JSName("$prepareValue")
    def $prepareValue(args: js.Any*): js.Any = js.native
    @JSName("$renderInput")
    def $renderInput(config: js.Any): stdLib.HTMLElement = js.native
    @JSName("$setValue")
    def $setValue(value: java.lang.String): scala.Unit = js.native
    def attachEvent(`type`: toggleEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: toggleEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def blur(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def focus(): scala.Unit = js.native
    def getInputNode(): stdLib.HTMLElement = js.native
    def getValue(): java.lang.String = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def refresh(): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def setValue(value: java.lang.String): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def toggle(): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait toggleConfig extends js.Object {
    var align: js.UndefOr[java.lang.String] = js.undefined
    var animate: js.UndefOr[js.Any] = js.undefined
    var autowidth: js.UndefOr[scala.Boolean] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var click: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var hotkey: js.UndefOr[java.lang.String] = js.undefined
    var icon: js.UndefOr[java.lang.String] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var inputHeight: js.UndefOr[scala.Double] = js.undefined
    var inputWidth: js.UndefOr[scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var name: js.UndefOr[java.lang.String] = js.undefined
    var offIcon: js.UndefOr[java.lang.String] = js.undefined
    var offLabel: js.UndefOr[java.lang.String] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var onIcon: js.UndefOr[java.lang.String] = js.undefined
    var onLabel: js.UndefOr[java.lang.String] = js.undefined
    var popup: js.UndefOr[java.lang.String] = js.undefined
    var tooltip: js.UndefOr[java.lang.String] = js.undefined
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onChange
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait toggleEventName extends js.Object
  
  @js.native
  class toolbar () extends baseview {
    @JSName("config")
    var config_toolbar: toolbarConfig = js.native
    def addView(view: js.Any): java.lang.String | scala.Double = js.native
    def addView(view: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: toolbarEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: toolbarEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def clear(): scala.Unit = js.native
    def clearValidation(): scala.Unit = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def focus(item: java.lang.String): scala.Unit = js.native
    def getCleanValues(): js.Any = js.native
    def getDirtyValues(): js.Any = js.native
    def getScrollState(): js.Any = js.native
    def getValues(): js.Any = js.native
    def getValues(details: js.Any): js.Any = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def index(obj: js.Any): scala.Double = js.native
    def isDirty(): scala.Boolean = js.native
    def load(url: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String, callback: webixLib.webixMod.WebixCallback): js.Promise[_] = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def markInvalid(name: java.lang.String): scala.Unit = js.native
    def markInvalid(name: java.lang.String, state: java.lang.String): scala.Unit = js.native
    def markInvalid(name: java.lang.String, state: scala.Boolean): scala.Unit = js.native
    def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def reconstruct(): scala.Unit = js.native
    def refresh(): scala.Unit = js.native
    def removeView(id: js.Any): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def resizeChildren(): scala.Unit = js.native
    def restore(state: js.Any): scala.Unit = js.native
    def restore(state: js.Any, factory: webixLib.webixMod.WebixCallback): scala.Unit = js.native
    def scrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
    def serialize(): js.Any = js.native
    def serialize(serializer: webixLib.webixMod.WebixCallback): js.Any = js.native
    def setDirty(): scala.Unit = js.native
    def setDirty(mark: scala.Boolean): scala.Unit = js.native
    def setValues(values: js.Any): scala.Unit = js.native
    def setValues(values: js.Any, update: scala.Boolean): scala.Unit = js.native
    def showBatch(name: java.lang.String): scala.Unit = js.native
    def showBatch(name: java.lang.String, mode: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def validate(): scala.Boolean = js.native
    def validate(mode: js.Any): scala.Boolean = js.native
  }
  
  trait toolbarConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var cols: js.UndefOr[js.Array[_]] = js.undefined
    var complexData: js.UndefOr[scala.Boolean] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var data: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
    var dataFeed: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var datatype: js.UndefOr[java.lang.String] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var elements: js.UndefOr[js.Array[_]] = js.undefined
    var elementsConfig: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var isolate: js.UndefOr[scala.Boolean] = js.undefined
    var margin: js.UndefOr[scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var padding: js.UndefOr[scala.Double] = js.undefined
    var paddingX: js.UndefOr[scala.Double] = js.undefined
    var paddingY: js.UndefOr[scala.Double] = js.undefined
    var responsive: js.UndefOr[java.lang.String] = js.undefined
    var rows: js.UndefOr[js.Array[_]] = js.undefined
    var rules: js.UndefOr[js.Any] = js.undefined
    var scroll: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var scrollSpeed: js.UndefOr[java.lang.String] = js.undefined
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    var url: js.UndefOr[js.Any] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var visibleBatch: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterLoad
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onAfterValidation
    - webixLib.webixLibStrings.onBeforeLoad
    - webixLib.webixLibStrings.onBeforeValidate
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onChange
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onLoadError
    - webixLib.webixLibStrings.onValidationError
    - webixLib.webixLibStrings.onValidationSuccess
    - webixLib.webixLibStrings.onValues
  */
  trait toolbarEventName extends js.Object
  
  @js.native
  trait tooltip extends js.Object {
    @JSName("$height")
    var $height: scala.Double = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("$skin")
    var $skin_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$view")
    var $view: stdLib.HTMLElement = js.native
    @JSName("$width")
    var $width: scala.Double = js.native
    var config: tooltipConfig = js.native
    var name: java.lang.String = js.native
    var `type`: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    @JSName("$getSize")
    def $getSize(): js.Array[_] = js.native
    @JSName("$setSize")
    def $setSize(x: scala.Double, y: scala.Double): scala.Boolean = js.native
    @JSName("$skin")
    def $skin(args: js.Any*): js.Any = js.native
    def adjust(): scala.Unit = js.native
    def attachEvent(`type`: tooltipEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: tooltipEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def customize(obj: js.Any): scala.Unit = js.native
    def define(property: java.lang.String, value: js.Any): scala.Unit = js.native
    def destructor(): scala.Unit = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def disable(): scala.Unit = js.native
    def enable(): scala.Unit = js.native
    def getChildViews(): js.Array[_] = js.native
    def getFormView(): baseview = js.native
    def getNode(): js.Any = js.native
    def getParentView(): js.Any = js.native
    def getTopParentView(): baseview = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def hide(): scala.Unit = js.native
    def isEnabled(): scala.Boolean = js.native
    def isVisible(): scala.Boolean = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def queryView(config: js.Any): js.Any = js.native
    def queryView(config: js.Any, mode: java.lang.String): js.Any = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def resize(): scala.Unit = js.native
    def show(data: js.Any, position: js.Any): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait tooltipConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var dx: js.UndefOr[scala.Double] = js.undefined
    var dy: js.UndefOr[scala.Double] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var template: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait tooltipEventName extends js.Object
  
  @js.native
  class tree () extends baseview {
    @JSName("$dragHTML")
    var $dragHTML_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$dropAllow")
    var $dropAllow_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$fixEditor")
    var $fixEditor_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_tree: treeConfig = js.native
    var data: webixLib.webixMod.DataStore = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var on_context: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    @JSName("on_dblclick")
    var on_dblclick_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("on_mouse_move")
    var on_mouse_move_Original: webixLib.webixMod.WebixCallback = js.native
    var `type`: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    var types: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    var waitData: js.Promise[_] = js.native
    @JSName("$drag")
    def $drag(source: stdLib.HTMLElement, ev: stdLib.Event): java.lang.String = js.native
    @JSName("$dragHTML")
    def $dragHTML(args: js.Any*): js.Any = js.native
    @JSName("$dragIn")
    def $dragIn(source: stdLib.HTMLElement, target: stdLib.HTMLElement, ev: stdLib.Event): stdLib.HTMLElement = js.native
    @JSName("$dragMark")
    def $dragMark(context: js.Any, ev: stdLib.Event): scala.Boolean = js.native
    @JSName("$dragOut")
    def $dragOut(
      source: stdLib.HTMLElement,
      old_target: stdLib.HTMLElement,
      new_target: stdLib.HTMLElement,
      ev: stdLib.Event
    ): scala.Unit = js.native
    @JSName("$drop")
    def $drop(source: stdLib.HTMLElement, target: stdLib.HTMLElement, ev: stdLib.Event): scala.Unit = js.native
    @JSName("$dropAllow")
    def $dropAllow(args: js.Any*): js.Any = js.native
    @JSName("$fixEditor")
    def $fixEditor(args: js.Any*): js.Any = js.native
    def add(obj: js.Any): java.lang.String = js.native
    def add(obj: js.Any, index: scala.Double): java.lang.String = js.native
    def add(obj: js.Any, index: scala.Double, parentId: java.lang.String): java.lang.String = js.native
    def addCss(id: java.lang.String, css: java.lang.String): scala.Unit = js.native
    def addCss(id: java.lang.String, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def addCss(id: scala.Double, css: java.lang.String): scala.Unit = js.native
    def addCss(id: scala.Double, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def attachEvent(`type`: treeEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: treeEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def checkAll(): scala.Unit = js.native
    def checkAll(id: java.lang.String): scala.Unit = js.native
    def checkAll(id: scala.Double): scala.Unit = js.native
    def checkItem(id: java.lang.String): scala.Unit = js.native
    def clearAll(): scala.Unit = js.native
    def clearAll(soft: scala.Boolean): scala.Unit = js.native
    def clearCss(css: java.lang.String): scala.Unit = js.native
    def clearCss(css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def clearValidation(): scala.Unit = js.native
    def close(id: java.lang.String): scala.Unit = js.native
    def close(id: scala.Double): scala.Unit = js.native
    def closeAll(): scala.Unit = js.native
    def copy(sid: java.lang.String, tindex: scala.Double): scala.Double = js.native
    def copy(sid: java.lang.String, tindex: scala.Double, tobj: baseview): scala.Double = js.native
    def copy(sid: java.lang.String, tindex: scala.Double, tobj: baseview, details: js.Any): scala.Double = js.native
    def copy(sid: scala.Double, tindex: scala.Double): scala.Double = js.native
    def copy(sid: scala.Double, tindex: scala.Double, tobj: baseview): scala.Double = js.native
    def copy(sid: scala.Double, tindex: scala.Double, tobj: baseview, details: js.Any): scala.Double = js.native
    def count(): scala.Double = js.native
    def customize(obj: js.Any): scala.Unit = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def exists(id: java.lang.String): scala.Boolean = js.native
    def exists(id: scala.Double): scala.Boolean = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate): scala.Unit = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate, value: java.lang.String): scala.Unit = js.native
    def filter(
      text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate,
      value: java.lang.String,
      preserve: scala.Boolean
    ): scala.Unit = js.native
    def filter(text: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def find(criterion: webixLib.webixMod.WebixCallback): js.Any = js.native
    def find(criterion: webixLib.webixMod.WebixCallback, first: scala.Boolean): js.Any = js.native
    def getBranchIndex(id: java.lang.String): scala.Double = js.native
    def getBranchIndex(id: java.lang.String, parent: java.lang.String): scala.Double = js.native
    def getBranchIndex(id: java.lang.String, parent: scala.Double): scala.Double = js.native
    def getBranchIndex(id: scala.Double): scala.Double = js.native
    def getBranchIndex(id: scala.Double, parent: java.lang.String): scala.Double = js.native
    def getBranchIndex(id: scala.Double, parent: scala.Double): scala.Double = js.native
    def getChecked(): js.Array[_] = js.native
    def getFirstChildId(id: java.lang.String): java.lang.String = js.native
    def getFirstChildId(id: scala.Double): java.lang.String = js.native
    def getFirstId(): java.lang.String | scala.Double = js.native
    def getIdByIndex(index: scala.Double): java.lang.String | scala.Double = js.native
    def getIndexById(id: java.lang.String): scala.Double = js.native
    def getIndexById(id: scala.Double): scala.Double = js.native
    def getItem(id: java.lang.String): js.Any = js.native
    def getItem(id: scala.Double): js.Any = js.native
    def getItemNode(id: java.lang.String): stdLib.HTMLElement = js.native
    def getItemNode(id: scala.Double): stdLib.HTMLElement = js.native
    def getLastId(): java.lang.String | scala.Double = js.native
    def getNextId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getNextId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def getNextSiblingId(id: java.lang.String): java.lang.String | scala.Double = js.native
    def getNextSiblingId(id: scala.Double): java.lang.String | scala.Double = js.native
    def getOpenItems(): js.Array[_] = js.native
    def getParentId(id: java.lang.String): java.lang.String | scala.Double = js.native
    def getParentId(id: scala.Double): java.lang.String | scala.Double = js.native
    def getPrevId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPrevId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPrevSiblingId(id: java.lang.String): java.lang.String | scala.Double = js.native
    def getPrevSiblingId(id: scala.Double): java.lang.String | scala.Double = js.native
    def getScrollState(): js.Any = js.native
    def getSelectedId(as_array: scala.Boolean): java.lang.String | js.Array[_] = js.native
    def getSelectedItem(as_array: scala.Boolean): js.Any = js.native
    def getState(): js.Any = js.native
    def group(config: js.Any, mode: scala.Boolean): scala.Unit = js.native
    def hasCss(id: java.lang.String, css: java.lang.String): scala.Boolean = js.native
    def hasCss(id: scala.Double, css: java.lang.String): scala.Boolean = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def isBranch(id: java.lang.String): scala.Boolean = js.native
    def isBranch(id: scala.Double): scala.Boolean = js.native
    def isBranchOpen(id: java.lang.String): scala.Boolean = js.native
    def isBranchOpen(id: scala.Double): scala.Boolean = js.native
    def isChecked(id: java.lang.String): scala.Boolean = js.native
    def isChecked(id: scala.Double): scala.Boolean = js.native
    def isSelected(id: java.lang.String): scala.Boolean = js.native
    def isSelected(id: scala.Double): scala.Boolean = js.native
    def load(url: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String, callback: webixLib.webixMod.WebixCallback): js.Promise[_] = js.native
    def loadBranch(id: java.lang.String, callback: webixLib.webixMod.WebixCallback, url: java.lang.String): scala.Unit = js.native
    def loadBranch(id: scala.Double, callback: webixLib.webixMod.WebixCallback, url: java.lang.String): scala.Unit = js.native
    def loadNext(
      count: scala.Double,
      start: scala.Double,
      callback: webixLib.webixMod.WebixCallback,
      url: java.lang.String,
      now: scala.Boolean
    ): scala.Unit = js.native
    def locate(e: stdLib.Event): java.lang.String | scala.Double = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def move(sid: java.lang.String, tindex: scala.Double): java.lang.String = js.native
    def move(sid: java.lang.String, tindex: scala.Double, tobj: js.Any): java.lang.String = js.native
    def move(sid: java.lang.String, tindex: scala.Double, tobj: js.Any, details: js.Any): java.lang.String = js.native
    def moveSelection(direction: java.lang.String): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def on_dblclick(args: js.Any*): js.Any = js.native
    def on_mouse_move(args: js.Any*): js.Any = js.native
    def open(id: java.lang.String): scala.Unit = js.native
    def open(id: java.lang.String, show: scala.Boolean): scala.Unit = js.native
    def open(id: scala.Double): scala.Unit = js.native
    def open(id: scala.Double, show: scala.Boolean): scala.Unit = js.native
    def openAll(): scala.Unit = js.native
    def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def refresh(): scala.Unit = js.native
    def refresh(id: java.lang.String): scala.Unit = js.native
    def refresh(id: scala.Double): scala.Unit = js.native
    def remove(id: java.lang.String): scala.Unit = js.native
    def remove(id: scala.Double): scala.Unit = js.native
    def removeCss(id: java.lang.String, css: java.lang.String): scala.Unit = js.native
    def removeCss(id: java.lang.String, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def removeCss(id: scala.Double, css: java.lang.String): scala.Unit = js.native
    def removeCss(id: scala.Double, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def scrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
    def select(id: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def select(id: js.Array[_], preserve: scala.Boolean): scala.Unit = js.native
    def selectAll(): scala.Unit = js.native
    def selectAll(from: java.lang.String): scala.Unit = js.native
    def selectAll(from: java.lang.String, to: java.lang.String): scala.Unit = js.native
    def serialize(): js.Array[_] = js.native
    def setState(state: js.Any): scala.Unit = js.native
    def showItem(id: java.lang.String): scala.Unit = js.native
    def showItem(id: scala.Double): scala.Unit = js.native
    def sort(by: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String, as: java.lang.String): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def uncheckAll(): scala.Unit = js.native
    def uncheckAll(id: java.lang.String): scala.Unit = js.native
    def uncheckAll(id: scala.Double): scala.Unit = js.native
    def uncheckItem(id: java.lang.String): scala.Unit = js.native
    def ungroup(mode: scala.Boolean): scala.Unit = js.native
    def unselect(): scala.Unit = js.native
    def unselect(id: java.lang.String): scala.Unit = js.native
    def unselectAll(): scala.Unit = js.native
    def updateItem(id: java.lang.String, data: js.Any): scala.Unit = js.native
    def updateItem(id: scala.Double, data: js.Any): scala.Unit = js.native
    def validate(): scala.Boolean = js.native
    def validate(id: java.lang.String): scala.Boolean = js.native
  }
  
  trait treeConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var click: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var clipboard: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var data: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
    var datathrottle: js.UndefOr[scala.Double] = js.undefined
    var datatype: js.UndefOr[java.lang.String] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var drag: js.UndefOr[scala.Boolean] = js.undefined
    var dragscroll: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var filterMode: js.UndefOr[js.Any] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var item: js.UndefOr[js.Any] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var mouseEventDelay: js.UndefOr[scala.Double] = js.undefined
    var multiselect: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var navigation: js.UndefOr[scala.Boolean] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var onClick: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var onContext: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var onDblClick: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var onMouseMove: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var ready: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var removeMissed: js.UndefOr[scala.Boolean] = js.undefined
    var rules: js.UndefOr[js.Any] = js.undefined
    var save: js.UndefOr[java.lang.String] = js.undefined
    var scheme: js.UndefOr[js.Any] = js.undefined
    var scroll: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var scrollSpeed: js.UndefOr[java.lang.String] = js.undefined
    var select: js.UndefOr[scala.Boolean] = js.undefined
    var template: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var templateCopy: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var threeState: js.UndefOr[scala.Boolean] = js.undefined
    var tooltip: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
    var `type`: js.UndefOr[js.Any] = js.undefined
    var url: js.UndefOr[js.Any] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterAdd
    - webixLib.webixLibStrings.onAfterClose
    - webixLib.webixLibStrings.onAfterContextMenu
    - webixLib.webixLibStrings.onAfterDelete
    - webixLib.webixLibStrings.onAfterDrop
    - webixLib.webixLibStrings.onAfterDropOrder
    - webixLib.webixLibStrings.onAfterLoad
    - webixLib.webixLibStrings.onAfterOpen
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onAfterSelect
    - webixLib.webixLibStrings.onAfterSort
    - webixLib.webixLibStrings.onBeforeAdd
    - webixLib.webixLibStrings.onBeforeClose
    - webixLib.webixLibStrings.onBeforeContextMenu
    - webixLib.webixLibStrings.onBeforeDelete
    - webixLib.webixLibStrings.onBeforeDrag
    - webixLib.webixLibStrings.onBeforeDragIn
    - webixLib.webixLibStrings.onBeforeDrop
    - webixLib.webixLibStrings.onBeforeDropOrder
    - webixLib.webixLibStrings.onBeforeDropOut
    - webixLib.webixLibStrings.onBeforeLoad
    - webixLib.webixLibStrings.onBeforeOpen
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBeforeSelect
    - webixLib.webixLibStrings.onBeforeSort
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDataRequest
    - webixLib.webixLibStrings.onDataUpdate
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onDragOut
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onItemCheck
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onItemDblClick
    - webixLib.webixLibStrings.onItemRender
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLoadError
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onMouseMove
    - webixLib.webixLibStrings.onMouseMoving
    - webixLib.webixLibStrings.onMouseOut
    - webixLib.webixLibStrings.onPartialRender
    - webixLib.webixLibStrings.onPaste
    - webixLib.webixLibStrings.onSelectChange
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onValidationError
    - webixLib.webixLibStrings.onValidationSuccess
    - webixLib.webixLibStrings.onViewResize
  */
  trait treeEventName extends js.Object
  
  @js.native
  class treemap () extends baseview {
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_treemap: treemapConfig = js.native
    var data: webixLib.webixMod.DataStore = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var on_context: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    @JSName("on_dblclick")
    var on_dblclick_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("on_mouse_move")
    var on_mouse_move_Original: webixLib.webixMod.WebixCallback = js.native
    var `type`: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    var types: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    var waitData: js.Promise[_] = js.native
    def add(obj: js.Any): java.lang.String | scala.Double = js.native
    def add(obj: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
    def addCss(id: java.lang.String, css: java.lang.String): scala.Unit = js.native
    def addCss(id: java.lang.String, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def addCss(id: scala.Double, css: java.lang.String): scala.Unit = js.native
    def addCss(id: scala.Double, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def attachEvent(`type`: treemapEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: treemapEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def clearAll(): scala.Unit = js.native
    def clearAll(soft: scala.Boolean): scala.Unit = js.native
    def clearCss(css: java.lang.String): scala.Unit = js.native
    def clearCss(css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def clearValidation(): scala.Unit = js.native
    def close(id: java.lang.String): scala.Unit = js.native
    def close(id: scala.Double): scala.Unit = js.native
    def closeAll(): scala.Unit = js.native
    def count(): scala.Double = js.native
    def customize(obj: js.Any): scala.Unit = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def exists(id: java.lang.String): scala.Boolean = js.native
    def exists(id: scala.Double): scala.Boolean = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate): scala.Unit = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate, value: java.lang.String): scala.Unit = js.native
    def filter(
      text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate,
      value: java.lang.String,
      preserve: scala.Boolean
    ): scala.Unit = js.native
    def filter(text: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def find(criterion: webixLib.webixMod.WebixCallback): js.Any = js.native
    def find(criterion: webixLib.webixMod.WebixCallback, first: scala.Boolean): js.Any = js.native
    def getBranchIndex(id: java.lang.String): scala.Double = js.native
    def getBranchIndex(id: java.lang.String, parent: java.lang.String): scala.Double = js.native
    def getBranchIndex(id: java.lang.String, parent: scala.Double): scala.Double = js.native
    def getBranchIndex(id: scala.Double): scala.Double = js.native
    def getBranchIndex(id: scala.Double, parent: java.lang.String): scala.Double = js.native
    def getBranchIndex(id: scala.Double, parent: scala.Double): scala.Double = js.native
    def getFirstChildId(id: java.lang.String): java.lang.String = js.native
    def getFirstChildId(id: scala.Double): java.lang.String = js.native
    def getFirstId(): java.lang.String | scala.Double = js.native
    def getIdByIndex(index: scala.Double): java.lang.String | scala.Double = js.native
    def getIndexById(id: java.lang.String): scala.Double = js.native
    def getIndexById(id: scala.Double): scala.Double = js.native
    def getItem(id: java.lang.String): js.Any = js.native
    def getItem(id: scala.Double): js.Any = js.native
    def getItemNode(id: java.lang.String): stdLib.HTMLElement = js.native
    def getItemNode(id: scala.Double): stdLib.HTMLElement = js.native
    def getLastId(): java.lang.String | scala.Double = js.native
    def getNextId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getNextId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def getNextSiblingId(id: java.lang.String): java.lang.String | scala.Double = js.native
    def getNextSiblingId(id: scala.Double): java.lang.String | scala.Double = js.native
    def getOpenItems(): js.Array[_] = js.native
    def getPage(): scala.Double = js.native
    def getPager(): js.Any = js.native
    def getParentId(id: java.lang.String): java.lang.String | scala.Double = js.native
    def getParentId(id: scala.Double): java.lang.String | scala.Double = js.native
    def getPrevId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPrevId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPrevSiblingId(id: java.lang.String): java.lang.String | scala.Double = js.native
    def getPrevSiblingId(id: scala.Double): java.lang.String | scala.Double = js.native
    def getScrollState(): js.Any = js.native
    def getSelectedId(as_array: scala.Boolean): java.lang.String | js.Array[_] = js.native
    def getSelectedItem(as_array: scala.Boolean): js.Any = js.native
    def getState(): js.Any = js.native
    def group(config: js.Any, mode: scala.Boolean): scala.Unit = js.native
    def hasCss(id: java.lang.String, css: java.lang.String): scala.Boolean = js.native
    def hasCss(id: scala.Double, css: java.lang.String): scala.Boolean = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def isBranch(id: java.lang.String): scala.Boolean = js.native
    def isBranch(id: scala.Double): scala.Boolean = js.native
    def isBranchOpen(id: java.lang.String): scala.Boolean = js.native
    def isBranchOpen(id: scala.Double): scala.Boolean = js.native
    def isSelected(id: java.lang.String): scala.Boolean = js.native
    def isSelected(id: scala.Double): scala.Boolean = js.native
    def load(url: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String, callback: webixLib.webixMod.WebixCallback): js.Promise[_] = js.native
    def loadBranch(id: java.lang.String, callback: webixLib.webixMod.WebixCallback, url: java.lang.String): scala.Unit = js.native
    def loadBranch(id: scala.Double, callback: webixLib.webixMod.WebixCallback, url: java.lang.String): scala.Unit = js.native
    def loadNext(
      count: scala.Double,
      start: scala.Double,
      callback: webixLib.webixMod.WebixCallback,
      url: java.lang.String,
      now: scala.Boolean
    ): scala.Unit = js.native
    def locate(e: stdLib.Event): java.lang.String | scala.Double = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def moveSelection(direction: java.lang.String): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def on_dblclick(args: js.Any*): js.Any = js.native
    def on_mouse_move(args: js.Any*): js.Any = js.native
    def open(id: java.lang.String): scala.Unit = js.native
    def open(id: java.lang.String, show: scala.Boolean): scala.Unit = js.native
    def open(id: scala.Double): scala.Unit = js.native
    def open(id: scala.Double, show: scala.Boolean): scala.Unit = js.native
    def openAll(): scala.Unit = js.native
    def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def refresh(): scala.Unit = js.native
    def refresh(id: java.lang.String): scala.Unit = js.native
    def refresh(id: scala.Double): scala.Unit = js.native
    def remove(id: java.lang.String): scala.Unit = js.native
    def remove(id: scala.Double): scala.Unit = js.native
    def removeCss(id: java.lang.String, css: java.lang.String): scala.Unit = js.native
    def removeCss(id: java.lang.String, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def removeCss(id: scala.Double, css: java.lang.String): scala.Unit = js.native
    def removeCss(id: scala.Double, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def scrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
    def select(id: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def select(id: js.Array[_], preserve: scala.Boolean): scala.Unit = js.native
    def selectAll(): scala.Unit = js.native
    def selectAll(from: java.lang.String): scala.Unit = js.native
    def selectAll(from: java.lang.String, to: java.lang.String): scala.Unit = js.native
    def serialize(): js.Array[_] = js.native
    def setPage(page: scala.Double): scala.Unit = js.native
    def setState(state: js.Any): scala.Unit = js.native
    def showBranch(branchId: java.lang.String): scala.Unit = js.native
    def showBranch(branchId: scala.Double): scala.Unit = js.native
    def showItem(id: java.lang.String): scala.Unit = js.native
    def showItem(id: scala.Double): scala.Unit = js.native
    def sort(by: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String, as: java.lang.String): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def ungroup(mode: scala.Boolean): scala.Unit = js.native
    def unselect(): scala.Unit = js.native
    def unselect(id: java.lang.String): scala.Unit = js.native
    def unselectAll(): scala.Unit = js.native
    def updateItem(id: java.lang.String, data: js.Any): scala.Unit = js.native
    def updateItem(id: scala.Double, data: js.Any): scala.Unit = js.native
    def validate(): scala.Boolean = js.native
    def validate(id: java.lang.String): scala.Boolean = js.native
  }
  
  trait treemapConfig extends js.Object {
    var activeItem: js.UndefOr[scala.Boolean] = js.undefined
    var animate: js.UndefOr[js.Any] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var branch: js.UndefOr[java.lang.String] = js.undefined
    var click: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var clipboard: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var data: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
    var dataFeed: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var datathrottle: js.UndefOr[scala.Double] = js.undefined
    var datatype: js.UndefOr[java.lang.String] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var filterMode: js.UndefOr[js.Any] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var header: js.UndefOr[scala.Boolean] = js.undefined
    var headerHeight: js.UndefOr[scala.Double] = js.undefined
    var headerTemplate: js.UndefOr[java.lang.String] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var item: js.UndefOr[js.Any] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var mouseEventDelay: js.UndefOr[scala.Double] = js.undefined
    var multiselect: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
    var navigation: js.UndefOr[scala.Boolean] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var onClick: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var onContext: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var onDblClick: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var onMouseMove: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var pager: js.UndefOr[js.Any] = js.undefined
    var ready: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var removeMissed: js.UndefOr[scala.Boolean] = js.undefined
    var rules: js.UndefOr[js.Any] = js.undefined
    var save: js.UndefOr[java.lang.String] = js.undefined
    var scheme: js.UndefOr[js.Any] = js.undefined
    var scroll: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var scrollSpeed: js.UndefOr[java.lang.String] = js.undefined
    var select: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var subRender: js.UndefOr[scala.Boolean] = js.undefined
    var template: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var templateCopy: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var threeState: js.UndefOr[scala.Boolean] = js.undefined
    var tooltip: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
    var `type`: js.UndefOr[js.Any] = js.undefined
    var url: js.UndefOr[js.Any] = js.undefined
    var value: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterAdd
    - webixLib.webixLibStrings.onAfterClose
    - webixLib.webixLibStrings.onAfterContextMenu
    - webixLib.webixLibStrings.onAfterDelete
    - webixLib.webixLibStrings.onAfterLoad
    - webixLib.webixLibStrings.onAfterOpen
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onAfterSelect
    - webixLib.webixLibStrings.onAfterSort
    - webixLib.webixLibStrings.onBeforeAdd
    - webixLib.webixLibStrings.onBeforeClose
    - webixLib.webixLibStrings.onBeforeContextMenu
    - webixLib.webixLibStrings.onBeforeDelete
    - webixLib.webixLibStrings.onBeforeLoad
    - webixLib.webixLibStrings.onBeforeOpen
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBeforeSelect
    - webixLib.webixLibStrings.onBeforeSort
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDataRequest
    - webixLib.webixLibStrings.onDataUpdate
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onItemCheck
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onItemDblClick
    - webixLib.webixLibStrings.onItemRender
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLoadError
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onMouseMove
    - webixLib.webixLibStrings.onMouseMoving
    - webixLib.webixLibStrings.onMouseOut
    - webixLib.webixLibStrings.onPartialRender
    - webixLib.webixLibStrings.onPaste
    - webixLib.webixLibStrings.onSelectChange
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onValidationError
    - webixLib.webixLibStrings.onValidationSuccess
    - webixLib.webixLibStrings.onViewResize
  */
  trait treemapEventName extends js.Object
  
  @js.native
  class treetable () extends baseview {
    @JSName("$customPrint")
    var $customPrint_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$dragHTML")
    var $dragHTML_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$dropAllow")
    var $dropAllow_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("$touch")
    var $touch_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("config")
    var config_treetable: treetableConfig = js.native
    var data: webixLib.webixMod.DataStore = js.native
    var headerContent: js.Any = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var on_context: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    @JSName("on_dblclick")
    var on_dblclick_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("on_mouse_move")
    var on_mouse_move_Original: webixLib.webixMod.WebixCallback = js.native
    var waitData: js.Promise[_] = js.native
    @JSName("$customPrint")
    def $customPrint(args: js.Any*): js.Any = js.native
    @JSName("$drag")
    def $drag(source: stdLib.HTMLElement, ev: stdLib.Event): java.lang.String = js.native
    @JSName("$dragHTML")
    def $dragHTML(args: js.Any*): js.Any = js.native
    @JSName("$dragIn")
    def $dragIn(source: stdLib.HTMLElement, target: stdLib.HTMLElement, ev: stdLib.Event): stdLib.HTMLElement = js.native
    @JSName("$dragMark")
    def $dragMark(context: js.Any, ev: stdLib.Event): scala.Boolean = js.native
    @JSName("$dragOut")
    def $dragOut(
      source: stdLib.HTMLElement,
      old_target: stdLib.HTMLElement,
      new_target: stdLib.HTMLElement,
      ev: stdLib.Event
    ): scala.Unit = js.native
    @JSName("$drop")
    def $drop(source: stdLib.HTMLElement, target: stdLib.HTMLElement, ev: stdLib.Event): scala.Unit = js.native
    @JSName("$dropAllow")
    def $dropAllow(args: js.Any*): js.Any = js.native
    @JSName("$touch")
    def $touch(args: js.Any*): js.Any = js.native
    def add(obj: js.Any): java.lang.String = js.native
    def add(obj: js.Any, index: scala.Double): java.lang.String = js.native
    def add(obj: js.Any, index: scala.Double, parentId: java.lang.String): java.lang.String = js.native
    def addCellCss(id: java.lang.String, name: java.lang.String, css: java.lang.String): scala.Unit = js.native
    def addCss(id: java.lang.String, css: java.lang.String): scala.Unit = js.native
    def addCss(id: java.lang.String, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def addCss(id: scala.Double, css: java.lang.String): scala.Unit = js.native
    def addCss(id: scala.Double, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def addRowCss(id: java.lang.String, css: java.lang.String): scala.Unit = js.native
    def adjustColumn(id: java.lang.String): scala.Unit = js.native
    def adjustColumn(id: java.lang.String, mode: java.lang.String): scala.Unit = js.native
    def adjustColumn(id: scala.Double): scala.Unit = js.native
    def adjustColumn(id: scala.Double, mode: java.lang.String): scala.Unit = js.native
    def adjustRowHeight(): scala.Unit = js.native
    def adjustRowHeight(columnId: java.lang.String): scala.Unit = js.native
    def adjustRowHeight(columnId: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def attachEvent(`type`: treetableEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: treetableEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def checkAll(): scala.Unit = js.native
    def checkAll(id: java.lang.String): scala.Unit = js.native
    def checkAll(id: scala.Double): scala.Unit = js.native
    def checkItem(id: java.lang.String): scala.Unit = js.native
    def clearAll(): scala.Unit = js.native
    def clearAll(soft: scala.Boolean): scala.Unit = js.native
    def clearCss(css: java.lang.String): scala.Unit = js.native
    def clearCss(css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def clearSelection(): scala.Unit = js.native
    def clearValidation(): scala.Unit = js.native
    def close(id: java.lang.String): scala.Unit = js.native
    def close(id: scala.Double): scala.Unit = js.native
    def closeAll(): scala.Unit = js.native
    def collectValues(id: java.lang.String): js.Array[_] = js.native
    def collectValues(id: scala.Double): js.Array[_] = js.native
    def columnId(index: scala.Double): java.lang.String | scala.Double = js.native
    def copy(sid: java.lang.String, tindex: scala.Double): scala.Double = js.native
    def copy(sid: java.lang.String, tindex: scala.Double, tobj: baseview): scala.Double = js.native
    def copy(sid: java.lang.String, tindex: scala.Double, tobj: baseview, details: js.Any): scala.Double = js.native
    def copy(sid: scala.Double, tindex: scala.Double): scala.Double = js.native
    def copy(sid: scala.Double, tindex: scala.Double, tobj: baseview): scala.Double = js.native
    def copy(sid: scala.Double, tindex: scala.Double, tobj: baseview, details: js.Any): scala.Double = js.native
    def count(): scala.Double = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def eachColumn(handler: webixLib.webixMod.WebixCallback): scala.Unit = js.native
    def eachColumn(handler: webixLib.webixMod.WebixCallback, all: scala.Boolean): scala.Unit = js.native
    def eachRow(handler: webixLib.webixMod.WebixCallback): scala.Unit = js.native
    def edit(id: js.Any): scala.Unit = js.native
    def editCancel(): scala.Unit = js.native
    def editCell(row: java.lang.String, col: java.lang.String): scala.Unit = js.native
    def editCell(row: java.lang.String, col: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def editCell(row: java.lang.String, col: java.lang.String, preserve: scala.Boolean, show: scala.Boolean): scala.Unit = js.native
    def editCell(row: java.lang.String, col: scala.Double): scala.Unit = js.native
    def editCell(row: java.lang.String, col: scala.Double, preserve: scala.Boolean): scala.Unit = js.native
    def editCell(row: java.lang.String, col: scala.Double, preserve: scala.Boolean, show: scala.Boolean): scala.Unit = js.native
    def editCell(row: scala.Double, col: java.lang.String): scala.Unit = js.native
    def editCell(row: scala.Double, col: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def editCell(row: scala.Double, col: java.lang.String, preserve: scala.Boolean, show: scala.Boolean): scala.Unit = js.native
    def editCell(row: scala.Double, col: scala.Double): scala.Unit = js.native
    def editCell(row: scala.Double, col: scala.Double, preserve: scala.Boolean): scala.Unit = js.native
    def editCell(row: scala.Double, col: scala.Double, preserve: scala.Boolean, show: scala.Boolean): scala.Unit = js.native
    def editColumn(id: java.lang.String): scala.Unit = js.native
    def editNext(): scala.Unit = js.native
    def editRow(id: java.lang.String): scala.Unit = js.native
    def editStop(): scala.Unit = js.native
    def exists(id: java.lang.String): scala.Boolean = js.native
    def exists(id: scala.Double): scala.Boolean = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate): scala.Unit = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate, value: java.lang.String): scala.Unit = js.native
    def filter(
      text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate,
      value: java.lang.String,
      preserve: scala.Boolean
    ): scala.Unit = js.native
    def filter(text: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def filterByAll(): scala.Unit = js.native
    def find(criterion: webixLib.webixMod.WebixCallback): js.Any = js.native
    def find(criterion: webixLib.webixMod.WebixCallback, first: scala.Boolean): js.Any = js.native
    def focusEditor(id: js.Any): scala.Unit = js.native
    def freezeRow(id: java.lang.String, state: scala.Boolean): scala.Unit = js.native
    def freezeRow(id: scala.Double, state: scala.Boolean): scala.Unit = js.native
    def getBranchIndex(id: java.lang.String): scala.Double = js.native
    def getBranchIndex(id: java.lang.String, parent: java.lang.String): scala.Double = js.native
    def getBranchIndex(id: java.lang.String, parent: scala.Double): scala.Double = js.native
    def getBranchIndex(id: scala.Double): scala.Double = js.native
    def getBranchIndex(id: scala.Double, parent: java.lang.String): scala.Double = js.native
    def getBranchIndex(id: scala.Double, parent: scala.Double): scala.Double = js.native
    def getChecked(): js.Array[_] = js.native
    def getColumnConfig(id: java.lang.String): js.Any = js.native
    def getColumnIndex(id: java.lang.String): scala.Double = js.native
    def getColumnIndex(id: scala.Double): scala.Double = js.native
    def getCss(rowId: java.lang.String, columnId: java.lang.String): java.lang.String = js.native
    def getCss(rowId: java.lang.String, columnId: scala.Double): java.lang.String = js.native
    def getCss(rowId: scala.Double, columnId: java.lang.String): java.lang.String = js.native
    def getCss(rowId: scala.Double, columnId: scala.Double): java.lang.String = js.native
    def getEditState(): js.Any = js.native
    def getEditor(): js.Any = js.native
    def getEditor(row: js.Any): js.Any = js.native
    def getEditor(row: js.Any, column: java.lang.String): js.Any = js.native
    def getEditor(row: js.Any, column: scala.Double): js.Any = js.native
    def getEditorValue(): java.lang.String = js.native
    def getFilter(columnID: java.lang.String): js.Any = js.native
    def getFilter(columnID: scala.Double): js.Any = js.native
    def getFirstChildId(id: java.lang.String): java.lang.String = js.native
    def getFirstChildId(id: scala.Double): java.lang.String = js.native
    def getFirstId(): java.lang.String | scala.Double = js.native
    def getFooterNode(columnId: java.lang.String): stdLib.HTMLElement = js.native
    def getFooterNode(columnId: java.lang.String, rowIndex: scala.Double): stdLib.HTMLElement = js.native
    def getHeaderContent(id: java.lang.String): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    def getHeaderContent(id: scala.Double): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    def getHeaderNode(columnId: java.lang.String): stdLib.HTMLElement = js.native
    def getHeaderNode(columnId: java.lang.String, rowIndex: scala.Double): stdLib.HTMLElement = js.native
    def getIdByIndex(index: scala.Double): java.lang.String | scala.Double = js.native
    def getIndexById(id: java.lang.String): scala.Double = js.native
    def getIndexById(id: scala.Double): scala.Double = js.native
    def getItem(id: java.lang.String): js.Any = js.native
    def getItem(id: scala.Double): js.Any = js.native
    def getItemNode(id: java.lang.String): stdLib.HTMLElement = js.native
    def getItemNode(id: scala.Double): stdLib.HTMLElement = js.native
    def getLastId(): java.lang.String | scala.Double = js.native
    def getNextId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getNextId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def getNextSiblingId(id: java.lang.String): java.lang.String | scala.Double = js.native
    def getNextSiblingId(id: scala.Double): java.lang.String | scala.Double = js.native
    def getOpenItems(): js.Array[_] = js.native
    def getPage(): scala.Double = js.native
    def getPager(): js.Any = js.native
    def getParentId(id: java.lang.String): java.lang.String | scala.Double = js.native
    def getParentId(id: scala.Double): java.lang.String | scala.Double = js.native
    def getPrevId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPrevId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPrevSiblingId(id: java.lang.String): java.lang.String | scala.Double = js.native
    def getPrevSiblingId(id: scala.Double): java.lang.String | scala.Double = js.native
    def getScrollState(): js.Any = js.native
    def getSelectedId(asArray: scala.Boolean, asString: scala.Boolean): js.Any = js.native
    def getSelectedItem(): js.Any = js.native
    def getSelectedItem(as_array: scala.Boolean): js.Any = js.native
    def getState(): js.Any = js.native
    def getText(rowid: java.lang.String, colid: java.lang.String): java.lang.String = js.native
    def getText(rowid: java.lang.String, colid: scala.Double): java.lang.String = js.native
    def getText(rowid: scala.Double, colid: java.lang.String): java.lang.String = js.native
    def getText(rowid: scala.Double, colid: scala.Double): java.lang.String = js.native
    def getVisibleCount(): scala.Double = js.native
    def group(config: js.Any, mode: scala.Boolean): scala.Unit = js.native
    def hasCss(id: java.lang.String, css: java.lang.String): scala.Boolean = js.native
    def hasCss(id: scala.Double, css: java.lang.String): scala.Boolean = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def hideColumn(id: java.lang.String): scala.Unit = js.native
    def hideColumn(id: java.lang.String, options: js.Any): scala.Unit = js.native
    def hideColumn(id: java.lang.String, options: js.Any, silent: scala.Boolean): scala.Unit = js.native
    def hideColumn(id: java.lang.String, options: js.Any, silent: scala.Boolean, mode: scala.Boolean): scala.Unit = js.native
    def hideColumn(id: scala.Double): scala.Unit = js.native
    def hideColumn(id: scala.Double, options: js.Any): scala.Unit = js.native
    def hideColumn(id: scala.Double, options: js.Any, silent: scala.Boolean): scala.Unit = js.native
    def hideColumn(id: scala.Double, options: js.Any, silent: scala.Boolean, mode: scala.Boolean): scala.Unit = js.native
    def hideOverlay(): scala.Unit = js.native
    def isBranch(id: java.lang.String): scala.Boolean = js.native
    def isBranch(id: scala.Double): scala.Boolean = js.native
    def isBranchOpen(id: java.lang.String): scala.Boolean = js.native
    def isBranchOpen(id: scala.Double): scala.Boolean = js.native
    def isChecked(id: java.lang.String): scala.Boolean = js.native
    def isChecked(id: scala.Double): scala.Boolean = js.native
    def isColumnVisible(id: java.lang.String): scala.Boolean = js.native
    def isColumnVisible(id: scala.Double): scala.Boolean = js.native
    def isSelected(id: java.lang.String): scala.Unit = js.native
    def isSelected(id: scala.Double): scala.Unit = js.native
    def load(url: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String, callback: webixLib.webixMod.WebixCallback): js.Promise[_] = js.native
    def loadBranch(id: java.lang.String, callback: webixLib.webixMod.WebixCallback, url: java.lang.String): scala.Unit = js.native
    def loadBranch(id: scala.Double, callback: webixLib.webixMod.WebixCallback, url: java.lang.String): scala.Unit = js.native
    def loadNext(
      count: scala.Double,
      start: scala.Double,
      callback: webixLib.webixMod.WebixCallback,
      url: java.lang.String,
      now: scala.Boolean
    ): scala.Unit = js.native
    def locate(node: stdLib.Event): js.Any = js.native
    def locate(node: stdLib.HTMLElement): js.Any = js.native
    def mapCells(
      startrow: scala.Double,
      startcol: java.lang.String,
      numrows: scala.Double,
      numcols: scala.Double,
      callback: webixLib.webixMod.WebixCallback
    ): scala.Unit = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def mapSelection(callback: webixLib.webixMod.WebixCallback): scala.Unit = js.native
    def markSorting(column_id: java.lang.String, direction: java.lang.String): scala.Unit = js.native
    def move(sid: java.lang.String, tindex: scala.Double): java.lang.String | scala.Double = js.native
    def move(sid: java.lang.String, tindex: scala.Double, tobj: baseview): java.lang.String | scala.Double = js.native
    def move(sid: java.lang.String, tindex: scala.Double, tobj: baseview, details: js.Any): java.lang.String | scala.Double = js.native
    def move(sid: scala.Double, tindex: scala.Double): java.lang.String | scala.Double = js.native
    def move(sid: scala.Double, tindex: scala.Double, tobj: baseview): java.lang.String | scala.Double = js.native
    def move(sid: scala.Double, tindex: scala.Double, tobj: baseview, details: js.Any): java.lang.String | scala.Double = js.native
    def moveBottom(id: java.lang.String): scala.Unit = js.native
    def moveBottom(id: scala.Double): scala.Unit = js.native
    def moveColumn(id: java.lang.String, index: scala.Double): scala.Unit = js.native
    def moveDown(id: java.lang.String, step: scala.Double): scala.Unit = js.native
    def moveDown(id: scala.Double, step: scala.Double): scala.Unit = js.native
    def moveSelection(direction: java.lang.String): scala.Unit = js.native
    def moveTop(id: java.lang.String): scala.Unit = js.native
    def moveTop(id: scala.Double): scala.Unit = js.native
    def moveUp(id: java.lang.String, step: scala.Double): scala.Unit = js.native
    def moveUp(id: scala.Double, step: scala.Double): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def on_dblclick(args: js.Any*): js.Any = js.native
    def on_mouse_move(args: js.Any*): js.Any = js.native
    def open(id: java.lang.String): scala.Unit = js.native
    def open(id: java.lang.String, show: scala.Boolean): scala.Unit = js.native
    def open(id: scala.Double): scala.Unit = js.native
    def open(id: scala.Double, show: scala.Boolean): scala.Unit = js.native
    def openAll(): scala.Unit = js.native
    def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def refresh(): scala.Unit = js.native
    def refresh(id: java.lang.String): scala.Unit = js.native
    def refresh(id: scala.Double): scala.Unit = js.native
    def refreshColumns(): scala.Unit = js.native
    def refreshColumns(config: js.Array[_]): scala.Unit = js.native
    def refreshColumns(config: js.Array[_], reset: scala.Boolean): scala.Unit = js.native
    def refreshFilter(id: java.lang.String): scala.Unit = js.native
    def refreshFilter(id: scala.Double): scala.Unit = js.native
    def registerFilter(`object`: js.Any, config: js.Any, controller: js.Any): scala.Unit = js.native
    def remove(id: java.lang.String): scala.Unit = js.native
    def remove(id: scala.Double): scala.Unit = js.native
    def removeCellCss(id: java.lang.String, name: java.lang.String, css_name: java.lang.String): scala.Unit = js.native
    def removeCss(id: java.lang.String, css: java.lang.String): scala.Unit = js.native
    def removeCss(id: java.lang.String, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def removeCss(id: scala.Double, css: java.lang.String): scala.Unit = js.native
    def removeCss(id: scala.Double, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def removeRowCss(id: java.lang.String, css_name: java.lang.String): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, operation: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, operation: java.lang.String): scala.Unit = js.native
    def scrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
    def select(row_id: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def select(row_id: scala.Double, preserve: scala.Boolean): scala.Unit = js.native
    def selectAll(): scala.Unit = js.native
    def selectRange(row_id: java.lang.String, end_row_id: java.lang.String): scala.Unit = js.native
    def selectRange(row_id: java.lang.String, end_row_id: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def selectRange(row_id: java.lang.String, end_row_id: scala.Double): scala.Unit = js.native
    def selectRange(row_id: java.lang.String, end_row_id: scala.Double, preserve: scala.Boolean): scala.Unit = js.native
    def selectRange(row_id: scala.Double, end_row_id: java.lang.String): scala.Unit = js.native
    def selectRange(row_id: scala.Double, end_row_id: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def selectRange(row_id: scala.Double, end_row_id: scala.Double): scala.Unit = js.native
    def selectRange(row_id: scala.Double, end_row_id: scala.Double, preserve: scala.Boolean): scala.Unit = js.native
    def serialize(): js.Array[_] = js.native
    def setColumnWidth(id: java.lang.String, width: scala.Double): scala.Unit = js.native
    def setColumnWidth(id: scala.Double, width: scala.Double): scala.Unit = js.native
    def setPage(page: scala.Double): scala.Unit = js.native
    def setRowHeight(id: java.lang.String, height: scala.Double): scala.Unit = js.native
    def setRowHeight(id: scala.Double, height: scala.Double): scala.Unit = js.native
    def setState(state: js.Any): scala.Unit = js.native
    def showCell(row: java.lang.String, column: java.lang.String): scala.Unit = js.native
    def showColumn(id: java.lang.String): scala.Unit = js.native
    def showColumn(id: scala.Double): scala.Unit = js.native
    def showColumnBatch(batch: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def showColumnBatch(batch: scala.Double, preserve: scala.Boolean): scala.Unit = js.native
    def showItem(id: java.lang.String): scala.Unit = js.native
    def showItem(id: scala.Double): scala.Unit = js.native
    def showItemByIndex(index: scala.Double): scala.Unit = js.native
    def showOverlay(message: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String): scala.Unit = js.native
    def sort(by: java.lang.String, dir: java.lang.String, as: java.lang.String): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def uncheckAll(): scala.Unit = js.native
    def uncheckAll(id: java.lang.String): scala.Unit = js.native
    def uncheckAll(id: scala.Double): scala.Unit = js.native
    def uncheckItem(id: java.lang.String): scala.Unit = js.native
    def ungroup(mode: scala.Boolean): scala.Unit = js.native
    def unselect(row_id: java.lang.String): scala.Unit = js.native
    def unselect(row_id: scala.Double): scala.Unit = js.native
    def unselectAll(): scala.Unit = js.native
    def updateItem(id: java.lang.String, data: js.Any): scala.Unit = js.native
    def updateItem(id: scala.Double, data: js.Any): scala.Unit = js.native
    def validate(): scala.Boolean = js.native
    def validate(id: java.lang.String): scala.Boolean = js.native
    def validateEditor(): scala.Boolean = js.native
    def validateEditor(id: java.lang.String): scala.Boolean = js.native
    def validateEditor(id: scala.Double): scala.Boolean = js.native
  }
  
  trait treetableConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var areaselect: js.UndefOr[scala.Boolean] = js.undefined
    var autoConfig: js.UndefOr[scala.Boolean] = js.undefined
    var autoheight: js.UndefOr[scala.Boolean] = js.undefined
    var autowidth: js.UndefOr[scala.Boolean] = js.undefined
    var blockselect: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var checkboxRefresh: js.UndefOr[scala.Boolean] = js.undefined
    var clipboard: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var columnWidth: js.UndefOr[scala.Double] = js.undefined
    var columns: js.UndefOr[js.Array[_]] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var data: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
    var datafetch: js.UndefOr[scala.Double] = js.undefined
    var datathrottle: js.UndefOr[scala.Double] = js.undefined
    var datatype: js.UndefOr[java.lang.String] = js.undefined
    var delimiter: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var drag: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var dragColumn: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var dragscroll: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var editMath: js.UndefOr[scala.Boolean] = js.undefined
    var editValue: js.UndefOr[java.lang.String] = js.undefined
    var editable: js.UndefOr[scala.Boolean] = js.undefined
    var editaction: js.UndefOr[java.lang.String] = js.undefined
    var externalData: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var filterMode: js.UndefOr[js.Any] = js.undefined
    var fixedRowHeight: js.UndefOr[scala.Boolean] = js.undefined
    var footer: js.UndefOr[scala.Boolean] = js.undefined
    var form: js.UndefOr[java.lang.String] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var header: js.UndefOr[scala.Boolean] = js.undefined
    var headerRowHeight: js.UndefOr[scala.Double] = js.undefined
    var headermenu: js.UndefOr[js.Any] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var hover: js.UndefOr[java.lang.String] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var leftSplit: js.UndefOr[scala.Double] = js.undefined
    var liveValidation: js.UndefOr[scala.Boolean] = js.undefined
    var loadahead: js.UndefOr[scala.Double] = js.undefined
    var map: js.UndefOr[js.Any] = js.undefined
    var math: js.UndefOr[scala.Boolean] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minColumnHeight: js.UndefOr[scala.Double] = js.undefined
    var minColumnWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var mouseEventDelay: js.UndefOr[scala.Double] = js.undefined
    var multiselect: js.UndefOr[scala.Boolean] = js.undefined
    var navigation: js.UndefOr[scala.Boolean] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var onClick: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var onContext: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var onDblClick: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var onMouseMove: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var pager: js.UndefOr[js.Any] = js.undefined
    var prerender: js.UndefOr[scala.Boolean] = js.undefined
    var ready: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var removeMissed: js.UndefOr[scala.Boolean] = js.undefined
    var resizeColumn: js.UndefOr[js.Any] = js.undefined
    var resizeRow: js.UndefOr[scala.Boolean] = js.undefined
    var rightSplit: js.UndefOr[scala.Double] = js.undefined
    var rowHeight: js.UndefOr[scala.Double] = js.undefined
    var rowLineHeight: js.UndefOr[scala.Double] = js.undefined
    var rules: js.UndefOr[js.Any] = js.undefined
    var save: js.UndefOr[java.lang.String] = js.undefined
    var scheme: js.UndefOr[js.Any] = js.undefined
    var scroll: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var scrollAlignY: js.UndefOr[scala.Boolean] = js.undefined
    var scrollX: js.UndefOr[scala.Boolean] = js.undefined
    var scrollY: js.UndefOr[scala.Boolean] = js.undefined
    var select: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var spans: js.UndefOr[js.Array[_]] = js.undefined
    var subRowHeight: js.UndefOr[java.lang.String] = js.undefined
    var subrow: js.UndefOr[java.lang.String] = js.undefined
    var subview: js.UndefOr[baseview | webixLib.webixMod.WebixCallback] = js.undefined
    var templateCopy: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var threeState: js.UndefOr[scala.Boolean] = js.undefined
    var tooltip: js.UndefOr[scala.Boolean] = js.undefined
    var topSplit: js.UndefOr[scala.Double] = js.undefined
    var `type`: js.UndefOr[js.Any] = js.undefined
    var url: js.UndefOr[js.Any] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
    var yCount: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterAdd
    - webixLib.webixLibStrings.onAfterAreaAdd
    - webixLib.webixLibStrings.onAfterAreaRemove
    - webixLib.webixLibStrings.onAfterBlockSelect
    - webixLib.webixLibStrings.onAfterClose
    - webixLib.webixLibStrings.onAfterColumnDrop
    - webixLib.webixLibStrings.onAfterColumnDropOrder
    - webixLib.webixLibStrings.onAfterColumnHide
    - webixLib.webixLibStrings.onAfterColumnShow
    - webixLib.webixLibStrings.onAfterContextMenu
    - webixLib.webixLibStrings.onAfterDelete
    - webixLib.webixLibStrings.onAfterDrop
    - webixLib.webixLibStrings.onAfterDropOrder
    - webixLib.webixLibStrings.onAfterEditStart
    - webixLib.webixLibStrings.onAfterEditStop
    - webixLib.webixLibStrings.onAfterFilter
    - webixLib.webixLibStrings.onAfterLoad
    - webixLib.webixLibStrings.onAfterOpen
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onAfterSelect
    - webixLib.webixLibStrings.onAfterSort
    - webixLib.webixLibStrings.onAfterUnSelect
    - webixLib.webixLibStrings.onAreaDrag
    - webixLib.webixLibStrings.onBeforeAdd
    - webixLib.webixLibStrings.onBeforeAreaAdd
    - webixLib.webixLibStrings.onBeforeAreaRemove
    - webixLib.webixLibStrings.onBeforeBlockSelect
    - webixLib.webixLibStrings.onBeforeClose
    - webixLib.webixLibStrings.onBeforeColumnDrag
    - webixLib.webixLibStrings.onBeforeColumnDrop
    - webixLib.webixLibStrings.onBeforeColumnDropOrder
    - webixLib.webixLibStrings.onBeforeColumnHide
    - webixLib.webixLibStrings.onBeforeColumnShow
    - webixLib.webixLibStrings.onBeforeContextMenu
    - webixLib.webixLibStrings.onBeforeDelete
    - webixLib.webixLibStrings.onBeforeDrag
    - webixLib.webixLibStrings.onBeforeDragIn
    - webixLib.webixLibStrings.onBeforeDrop
    - webixLib.webixLibStrings.onBeforeDropOrder
    - webixLib.webixLibStrings.onBeforeDropOut
    - webixLib.webixLibStrings.onBeforeEditStart
    - webixLib.webixLibStrings.onBeforeEditStop
    - webixLib.webixLibStrings.onBeforeFilter
    - webixLib.webixLibStrings.onBeforeLoad
    - webixLib.webixLibStrings.onBeforeOpen
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBeforeSelect
    - webixLib.webixLibStrings.onBeforeSort
    - webixLib.webixLibStrings.onBeforeUnSelect
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onCheck
    - webixLib.webixLibStrings.onCollectValues
    - webixLib.webixLibStrings.onColumnResize
    - webixLib.webixLibStrings.onDataRequest
    - webixLib.webixLibStrings.onDataUpdate
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onDragOut
    - webixLib.webixLibStrings.onEditorChange
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onHeaderClick
    - webixLib.webixLibStrings.onItemCheck
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onItemDblClick
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLiveEdit
    - webixLib.webixLibStrings.onLoadError
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onMouseMove
    - webixLib.webixLibStrings.onMouseMoving
    - webixLib.webixLibStrings.onMouseOut
    - webixLib.webixLibStrings.onPaste
    - webixLib.webixLibStrings.onResize
    - webixLib.webixLibStrings.onRowResize
    - webixLib.webixLibStrings.onScrollX
    - webixLib.webixLibStrings.onScrollY
    - webixLib.webixLibStrings.onSelectChange
    - webixLib.webixLibStrings.onStructureLoad
    - webixLib.webixLibStrings.onStructureUpdate
    - webixLib.webixLibStrings.onSubViewClose
    - webixLib.webixLibStrings.onSubViewCreate
    - webixLib.webixLibStrings.onSubViewOpen
    - webixLib.webixLibStrings.onSubViewRender
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onValidationError
    - webixLib.webixLibStrings.onValidationSuccess
    - webixLib.webixLibStrings.onViewResize
  */
  trait treetableEventName extends js.Object
  
  @js.native
  class unitlist () extends baseview {
    @JSName("$customPrint")
    var $customPrint_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$dragHTML")
    var $dragHTML_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$dropAllow")
    var $dropAllow_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_unitlist: unitlistConfig = js.native
    var data: webixLib.webixMod.DataStore = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var on_context: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    @JSName("on_dblclick")
    var on_dblclick_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("on_mouse_move")
    var on_mouse_move_Original: webixLib.webixMod.WebixCallback = js.native
    var `type`: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    var types: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    var waitData: js.Promise[_] = js.native
    @JSName("$customPrint")
    def $customPrint(args: js.Any*): js.Any = js.native
    @JSName("$drag")
    def $drag(source: stdLib.HTMLElement, ev: stdLib.Event): java.lang.String = js.native
    @JSName("$dragHTML")
    def $dragHTML(args: js.Any*): js.Any = js.native
    @JSName("$dragIn")
    def $dragIn(source: stdLib.HTMLElement, target: stdLib.HTMLElement, ev: stdLib.Event): stdLib.HTMLElement = js.native
    @JSName("$dragMark")
    def $dragMark(context: js.Any, ev: stdLib.Event): scala.Boolean = js.native
    @JSName("$dragOut")
    def $dragOut(
      source: stdLib.HTMLElement,
      old_target: stdLib.HTMLElement,
      new_target: stdLib.HTMLElement,
      ev: stdLib.Event
    ): scala.Unit = js.native
    @JSName("$drop")
    def $drop(source: stdLib.HTMLElement, target: stdLib.HTMLElement, ev: stdLib.Event): scala.Unit = js.native
    @JSName("$dropAllow")
    def $dropAllow(args: js.Any*): js.Any = js.native
    def add(obj: js.Any): java.lang.String | scala.Double = js.native
    def add(obj: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
    def addCss(id: java.lang.String, css: java.lang.String): scala.Unit = js.native
    def addCss(id: java.lang.String, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def addCss(id: scala.Double, css: java.lang.String): scala.Unit = js.native
    def addCss(id: scala.Double, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def attachEvent(`type`: unitlistEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: unitlistEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def clearAll(): scala.Unit = js.native
    def clearAll(soft: scala.Boolean): scala.Unit = js.native
    def clearCss(css: java.lang.String): scala.Unit = js.native
    def clearCss(css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def clearValidation(): scala.Unit = js.native
    def copy(sid: java.lang.String, tindex: scala.Double): scala.Unit = js.native
    def copy(sid: java.lang.String, tindex: scala.Double, tobj: js.Any): scala.Unit = js.native
    def copy(sid: java.lang.String, tindex: scala.Double, tobj: js.Any, details: js.Any): scala.Unit = js.native
    def copy(sid: scala.Double, tindex: scala.Double): scala.Unit = js.native
    def copy(sid: scala.Double, tindex: scala.Double, tobj: js.Any): scala.Unit = js.native
    def copy(sid: scala.Double, tindex: scala.Double, tobj: js.Any, details: js.Any): scala.Unit = js.native
    def count(): scala.Double = js.native
    def customize(obj: js.Any): scala.Unit = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def exists(id: java.lang.String): scala.Boolean = js.native
    def exists(id: scala.Double): scala.Boolean = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate): scala.Unit = js.native
    def filter(text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate, value: java.lang.String): scala.Unit = js.native
    def filter(
      text: webixLib.webixMod.WebixCallback | webixLib.webixMod.WebixTemplate,
      value: java.lang.String,
      preserve: scala.Boolean
    ): scala.Unit = js.native
    def filter(text: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String): scala.Unit = js.native
    def filter(text: java.lang.String, value: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def find(criterion: webixLib.webixMod.WebixCallback): js.Any = js.native
    def find(criterion: webixLib.webixMod.WebixCallback, first: scala.Boolean): js.Any = js.native
    def getFirstId(): java.lang.String | scala.Double = js.native
    def getIdByIndex(index: scala.Double): java.lang.String | scala.Double = js.native
    def getIndexById(id: java.lang.String): scala.Double = js.native
    def getIndexById(id: scala.Double): scala.Double = js.native
    def getItem(id: java.lang.String): js.Any = js.native
    def getItem(id: scala.Double): js.Any = js.native
    def getItemNode(id: java.lang.String): stdLib.HTMLElement = js.native
    def getItemNode(id: scala.Double): stdLib.HTMLElement = js.native
    def getLastId(): java.lang.String | scala.Double = js.native
    def getNextId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getNextId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPage(): scala.Double = js.native
    def getPager(): js.Any = js.native
    def getPrevId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
    def getPrevId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
    def getScrollState(): js.Any = js.native
    def getSelectedId(as_array: scala.Boolean): java.lang.String | js.Array[_] = js.native
    def getSelectedItem(as_array: scala.Boolean): js.Any = js.native
    def getUnitList(name: java.lang.String): js.Array[_] = js.native
    def getUnits(): js.Array[_] = js.native
    def getVisibleCount(): scala.Double = js.native
    def hasCss(id: java.lang.String, css: java.lang.String): scala.Boolean = js.native
    def hasCss(id: scala.Double, css: java.lang.String): scala.Boolean = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def isSelected(id: java.lang.String): scala.Boolean = js.native
    def isSelected(id: scala.Double): scala.Boolean = js.native
    def load(url: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String): js.Promise[_] = js.native
    def load(url: java.lang.String, `type`: java.lang.String, callback: webixLib.webixMod.WebixCallback): js.Promise[_] = js.native
    def loadNext(
      count: scala.Double,
      start: scala.Double,
      callback: webixLib.webixMod.WebixCallback,
      url: java.lang.String,
      now: scala.Boolean
    ): scala.Unit = js.native
    def locate(e: stdLib.Event): java.lang.String | scala.Double = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def move(sid: java.lang.String, tindex: scala.Double): java.lang.String = js.native
    def move(sid: java.lang.String, tindex: scala.Double, tobj: js.Any): java.lang.String = js.native
    def move(sid: java.lang.String, tindex: scala.Double, tobj: js.Any, details: js.Any): java.lang.String = js.native
    def moveBottom(id: java.lang.String): scala.Unit = js.native
    def moveBottom(id: scala.Double): scala.Unit = js.native
    def moveDown(id: java.lang.String, step: scala.Double): scala.Unit = js.native
    def moveDown(id: scala.Double, step: scala.Double): scala.Unit = js.native
    def moveSelection(direction: java.lang.String): scala.Unit = js.native
    def moveTop(id: java.lang.String): scala.Unit = js.native
    def moveTop(id: scala.Double): scala.Unit = js.native
    def moveUp(id: java.lang.String, step: scala.Double): scala.Unit = js.native
    def moveUp(id: scala.Double, step: scala.Double): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def on_dblclick(args: js.Any*): js.Any = js.native
    def on_mouse_move(args: js.Any*): js.Any = js.native
    def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def refresh(): scala.Unit = js.native
    def refresh(id: java.lang.String): scala.Unit = js.native
    def refresh(id: scala.Double): scala.Unit = js.native
    def remove(id: java.lang.String): scala.Unit = js.native
    def remove(id: scala.Double): scala.Unit = js.native
    def removeCss(id: java.lang.String, css: java.lang.String): scala.Unit = js.native
    def removeCss(id: java.lang.String, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def removeCss(id: scala.Double, css: java.lang.String): scala.Unit = js.native
    def removeCss(id: scala.Double, css: java.lang.String, silent: scala.Boolean): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def scrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
    def select(id: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
    def select(id: js.Array[_], preserve: scala.Boolean): scala.Unit = js.native
    def selectAll(): scala.Unit = js.native
    def selectAll(from: java.lang.String): scala.Unit = js.native
    def selectAll(from: java.lang.String, to: java.lang.String): scala.Unit = js.native
    def serialize(): js.Array[_] = js.native
    def setPage(page: scala.Double): scala.Unit = js.native
    def showItem(id: java.lang.String): scala.Unit = js.native
    def showItem(id: scala.Double): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
    def unselect(): scala.Unit = js.native
    def unselect(id: java.lang.String): scala.Unit = js.native
    def unselectAll(): scala.Unit = js.native
    def updateItem(id: java.lang.String, data: js.Any): scala.Unit = js.native
    def updateItem(id: scala.Double, data: js.Any): scala.Unit = js.native
    def validate(): scala.Boolean = js.native
    def validate(id: java.lang.String): scala.Boolean = js.native
  }
  
  trait unitlistConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var autoheight: js.UndefOr[scala.Boolean] = js.undefined
    var autowidth: js.UndefOr[scala.Boolean] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var click: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var clipboard: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var data: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
    var datafetch: js.UndefOr[scala.Double] = js.undefined
    var datathrottle: js.UndefOr[scala.Double] = js.undefined
    var datatype: js.UndefOr[java.lang.String] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var drag: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var dragscroll: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var dynamic: js.UndefOr[scala.Boolean] = js.undefined
    var externalData: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var item: js.UndefOr[js.Any] = js.undefined
    var layout: js.UndefOr[java.lang.String] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var mouseEventDelay: js.UndefOr[scala.Double] = js.undefined
    var multiselect: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
    var navigation: js.UndefOr[scala.Boolean] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var onClick: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var onContext: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var onDblClick: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var onMouseMove: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var pager: js.UndefOr[js.Any] = js.undefined
    var ready: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var removeMissed: js.UndefOr[scala.Boolean] = js.undefined
    var rules: js.UndefOr[js.Any] = js.undefined
    var save: js.UndefOr[java.lang.String] = js.undefined
    var scheme: js.UndefOr[js.Any] = js.undefined
    var scroll: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var scrollSpeed: js.UndefOr[java.lang.String] = js.undefined
    var select: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    var template: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var templateCopy: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var tooltip: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
    var `type`: js.UndefOr[js.Any] = js.undefined
    var uniteBy: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var url: js.UndefOr[js.Any] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
    var xCount: js.UndefOr[scala.Double] = js.undefined
    var yCount: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterAdd
    - webixLib.webixLibStrings.onAfterContextMenu
    - webixLib.webixLibStrings.onAfterDelete
    - webixLib.webixLibStrings.onAfterDrop
    - webixLib.webixLibStrings.onAfterDropOrder
    - webixLib.webixLibStrings.onAfterLoad
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onAfterSelect
    - webixLib.webixLibStrings.onAfterSort
    - webixLib.webixLibStrings.onBeforeAdd
    - webixLib.webixLibStrings.onBeforeContextMenu
    - webixLib.webixLibStrings.onBeforeDelete
    - webixLib.webixLibStrings.onBeforeDrag
    - webixLib.webixLibStrings.onBeforeDragIn
    - webixLib.webixLibStrings.onBeforeDrop
    - webixLib.webixLibStrings.onBeforeDropOrder
    - webixLib.webixLibStrings.onBeforeDropOut
    - webixLib.webixLibStrings.onBeforeLoad
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBeforeSelect
    - webixLib.webixLibStrings.onBeforeSort
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDataRequest
    - webixLib.webixLibStrings.onDataUpdate
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onDragOut
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onItemDblClick
    - webixLib.webixLibStrings.onItemRender
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLoadError
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onMouseMove
    - webixLib.webixLibStrings.onMouseMoving
    - webixLib.webixLibStrings.onMouseOut
    - webixLib.webixLibStrings.onPaste
    - webixLib.webixLibStrings.onSelectChange
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onValidationError
    - webixLib.webixLibStrings.onValidationSuccess
    - webixLib.webixLibStrings.onViewResize
  */
  trait unitlistEventName extends js.Object
  
  @js.native
  class uploader () extends baseview {
    @JSName("$compareValue")
    var $compareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$cssName")
    var $cssName: java.lang.String = js.native
    @JSName("$onUploadComplete")
    var $onUploadComplete_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$prepareValue")
    var $prepareValue_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("$updateProgress")
    var $updateProgress_Original: webixLib.webixMod.WebixCallback = js.native
    @JSName("config")
    var config_uploader: uploaderConfig = js.native
    @JSName("on_click")
    var on_click_Original: webixLib.webixMod.WebixCallback = js.native
    var touchable: scala.Boolean = js.native
    @JSName("$compareValue")
    def $compareValue(args: js.Any*): js.Any = js.native
    @JSName("$getValue")
    def $getValue(): java.lang.String = js.native
    @JSName("$onUploadComplete")
    def $onUploadComplete(args: js.Any*): js.Any = js.native
    @JSName("$prepareValue")
    def $prepareValue(args: js.Any*): js.Any = js.native
    @JSName("$renderInput")
    def $renderInput(config: js.Any): stdLib.HTMLElement = js.native
    @JSName("$setValue")
    def $setValue(value: java.lang.String): scala.Unit = js.native
    @JSName("$updateProgress")
    def $updateProgress(args: js.Any*): js.Any = js.native
    def addDropZone(element: stdLib.HTMLElement): scala.Unit = js.native
    def addFile(name: java.lang.String, size: scala.Double): scala.Unit = js.native
    def addFile(name: java.lang.String, size: scala.Double, `type`: java.lang.String): scala.Unit = js.native
    def attachEvent(`type`: uploaderEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: uploaderEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def blur(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def fileDialog(): scala.Unit = js.native
    def fileDialog(content: js.Any): scala.Unit = js.native
    def focus(): scala.Unit = js.native
    def getInputNode(): stdLib.HTMLElement = js.native
    def getValue(): java.lang.String = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def isUploaded(): scala.Boolean = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def on_click(args: js.Any*): js.Any = js.native
    def refresh(): scala.Unit = js.native
    def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
    def send(id: java.lang.String): scala.Unit = js.native
    def send(id: scala.Double): scala.Unit = js.native
    def send(id: webixLib.webixMod.WebixCallback): scala.Unit = js.native
    def setValue(value: java.lang.String): scala.Unit = js.native
    def stopUpload(id: java.lang.String): scala.Unit = js.native
    def stopUpload(id: scala.Double): scala.Unit = js.native
    def sync(source: js.Any, filter: webixLib.webixMod.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait uploaderConfig extends js.Object {
    var accept: js.UndefOr[java.lang.String] = js.undefined
    var align: js.UndefOr[java.lang.String] = js.undefined
    var animate: js.UndefOr[js.Any] = js.undefined
    var apiOnly: js.UndefOr[scala.Boolean] = js.undefined
    var autosend: js.UndefOr[scala.Boolean] = js.undefined
    var autowidth: js.UndefOr[scala.Boolean] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var click: js.UndefOr[webixLib.webixMod.WebixCallback] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var datatype: js.UndefOr[java.lang.String] = js.undefined
    var directory: js.UndefOr[java.lang.String] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var formData: js.UndefOr[js.Any] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var hotkey: js.UndefOr[java.lang.String] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var inputHeight: js.UndefOr[scala.Double] = js.undefined
    var inputName: js.UndefOr[java.lang.String] = js.undefined
    var inputWidth: js.UndefOr[scala.Double] = js.undefined
    var label: js.UndefOr[java.lang.String] = js.undefined
    var link: js.UndefOr[java.lang.String] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var multiple: js.UndefOr[scala.Boolean] = js.undefined
    var name: js.UndefOr[java.lang.String] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var popup: js.UndefOr[java.lang.String] = js.undefined
    var tooltip: js.UndefOr[java.lang.String] = js.undefined
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    var upload: js.UndefOr[java.lang.String] = js.undefined
    var urlData: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterFileAdd
    - webixLib.webixLibStrings.onAfterRender
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBeforeFileAdd
    - webixLib.webixLibStrings.onBeforeRender
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFileUpload
    - webixLib.webixLibStrings.onFileUploadError
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onItemClick
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onUploadComplete
    - webixLib.webixLibStrings.onViewResize
  */
  trait uploaderEventName extends js.Object
  
  @js.native
  class video () extends baseview {
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_video: videoConfig = js.native
    def getVideo(): scala.Unit = js.native
  }
  
  trait videoConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var controls: js.UndefOr[scala.Boolean] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var src: js.UndefOr[java.lang.String] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait videoEventName extends js.Object
  
  @js.native
  class view () extends baseview {
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_view: viewConfig = js.native
  }
  
  trait viewConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewResize
  */
  trait viewEventName extends js.Object
  
  @js.native
  trait vscroll extends js.Object {
    var config: vscrollConfig = js.native
    var name: java.lang.String = js.native
    def activeArea(node: stdLib.HTMLElement): scala.Unit = js.native
    def attachEvent(`type`: vscrollEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: vscrollEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def define(property: java.lang.String, value: js.Any): scala.Unit = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def getScroll(): scala.Double = js.native
    def getSize(): scala.Double = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def reset(): scala.Unit = js.native
    def scrollTo(pos: scala.Double): scala.Unit = js.native
    def sizeTo(size: scala.Double): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait vscrollConfig extends js.Object {
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var scroll: js.UndefOr[java.lang.String] = js.undefined
    var scrollHeight: js.UndefOr[scala.Double] = js.undefined
    var scrollPos: js.UndefOr[scala.Double] = js.undefined
    var scrollSize: js.UndefOr[scala.Double] = js.undefined
    var scrollStep: js.UndefOr[scala.Double] = js.undefined
    var scrollVisible: js.UndefOr[scala.Boolean] = js.undefined
    var scrollWidth: js.UndefOr[scala.Double] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var zoom: js.UndefOr[scala.Double] = js.undefined
  }
  
  @js.native
  class window () extends baseview {
    @JSName("$scope")
    var $scope: js.Any = js.native
    @JSName("config")
    var config_window: windowConfig = js.native
    def attachEvent(`type`: windowEventName, functor: webixLib.webixMod.WebixCallback): java.lang.String | scala.Double = js.native
    def attachEvent(`type`: windowEventName, functor: webixLib.webixMod.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
    def blockEvent(): scala.Unit = js.native
    def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
    def close(): scala.Unit = js.native
    def detachEvent(id: java.lang.String): scala.Unit = js.native
    def getBody(): js.Any = js.native
    def getHead(): js.Any = js.native
    def hasEvent(name: java.lang.String): scala.Boolean = js.native
    def mapEvent(map: js.Any): scala.Unit = js.native
    def resizeChildren(): scala.Unit = js.native
    def setPosition(x: scala.Double, y: scala.Double): scala.Unit = js.native
    def show(node: stdLib.HTMLElement): scala.Unit = js.native
    def show(node: stdLib.HTMLElement, position: js.Any): scala.Unit = js.native
    def show(node: stdLib.HTMLElement, position: js.Any, point: java.lang.String): scala.Unit = js.native
    def unblockEvent(): scala.Unit = js.native
  }
  
  trait windowConfig extends js.Object {
    var animate: js.UndefOr[js.Any] = js.undefined
    var autofit: js.UndefOr[scala.Boolean] = js.undefined
    var autofocus: js.UndefOr[scala.Boolean] = js.undefined
    var body: js.UndefOr[java.lang.String | baseview] = js.undefined
    var borderless: js.UndefOr[scala.Boolean] = js.undefined
    var container: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
    var css: js.UndefOr[js.Any] = js.undefined
    var disabled: js.UndefOr[scala.Boolean] = js.undefined
    var fullscreen: js.UndefOr[scala.Boolean] = js.undefined
    var gravity: js.UndefOr[scala.Double] = js.undefined
    var head: js.UndefOr[js.Any] = js.undefined
    var headHeight: js.UndefOr[scala.Double] = js.undefined
    var height: js.UndefOr[scala.Double] = js.undefined
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var left: js.UndefOr[scala.Double] = js.undefined
    var master: js.UndefOr[java.lang.String] = js.undefined
    var maxHeight: js.UndefOr[scala.Double] = js.undefined
    var maxWidth: js.UndefOr[scala.Double] = js.undefined
    var minHeight: js.UndefOr[scala.Double] = js.undefined
    var minWidth: js.UndefOr[scala.Double] = js.undefined
    var modal: js.UndefOr[scala.Boolean] = js.undefined
    var move: js.UndefOr[scala.Boolean] = js.undefined
    var on: js.UndefOr[webixLib.webixMod.EventHash] = js.undefined
    var padding: js.UndefOr[js.Any] = js.undefined
    var point: js.UndefOr[scala.Boolean] = js.undefined
    var position: js.UndefOr[java.lang.String | webixLib.webixMod.WebixCallback] = js.undefined
    var relative: js.UndefOr[java.lang.String] = js.undefined
    var resize: js.UndefOr[scala.Boolean] = js.undefined
    var toFront: js.UndefOr[scala.Boolean] = js.undefined
    var top: js.UndefOr[scala.Double] = js.undefined
    var view: js.UndefOr[java.lang.String] = js.undefined
    var width: js.UndefOr[scala.Double] = js.undefined
    var zIndex: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - webixLib.webixLibStrings.onAfterScroll
    - webixLib.webixLibStrings.onBeforeShow
    - webixLib.webixLibStrings.onBindRequest
    - webixLib.webixLibStrings.onBlur
    - webixLib.webixLibStrings.onDestruct
    - webixLib.webixLibStrings.onEnter
    - webixLib.webixLibStrings.onFocus
    - webixLib.webixLibStrings.onHide
    - webixLib.webixLibStrings.onKeyPress
    - webixLib.webixLibStrings.onLongTouch
    - webixLib.webixLibStrings.onShow
    - webixLib.webixLibStrings.onSwipeX
    - webixLib.webixLibStrings.onSwipeY
    - webixLib.webixLibStrings.onTimedKeyPress
    - webixLib.webixLibStrings.onTouchEnd
    - webixLib.webixLibStrings.onTouchMove
    - webixLib.webixLibStrings.onTouchStart
    - webixLib.webixLibStrings.onViewMove
    - webixLib.webixLibStrings.onViewMoveEnd
    - webixLib.webixLibStrings.onViewResize
  */
  trait windowEventName extends js.Object
  
  var scrollSize: scala.Double = js.native
  var zIndexBase: scala.Double = js.native
  def delay(config: js.Any): scala.Unit = js.native
  def fullScreen(): scala.Unit = js.native
  def hasMethod(name: java.lang.String, method_name: java.lang.String): scala.Boolean = js.native
  def resize(): scala.Unit = js.native
  def zIndex(): scala.Double = js.native
  @JSName("datafilter")
  @js.native
  object datafilterNs extends js.Object {
    @js.native
    class columnGroup () extends textFilter
    
    @js.native
    class dateFilter () extends textFilter
    
    @js.native
    class dateRangeFilter () extends textFilter
    
    @js.native
    class datepickerFilter () extends textFilter
    
    @js.native
    class masterCheckbox () extends textFilter
    
    @js.native
    class multiComboFilter () extends textFilter
    
    @js.native
    class multiSelectFilter () extends textFilter
    
    @js.native
    class numberFilter () extends textFilter
    
    @js.native
    class selectFilter () extends textFilter
    
    @js.native
    class serverFilter () extends textFilter
    
    @js.native
    class serverMultiSelectFilter () extends textFilter
    
    @js.native
    class serverSelectFilter () extends textFilter
    
    @js.native
    class summColumn () extends textFilter
    
    @js.native
    class textFilter ()
      extends webixLib.webixMod.uiNs.WebixFilter {
      def getInputNode(node: stdLib.HTMLElement): stdLib.HTMLElement = js.native
      /* CompleteClass */
      override def getValue(node: stdLib.HTMLElement): js.Any = js.native
      /* CompleteClass */
      override def refresh(master: webixLib.webixMod.uiNs.baseview, node: stdLib.HTMLElement, value: js.Any): scala.Unit = js.native
      /* CompleteClass */
      override def render(
        master: webixLib.webixMod.uiNs.baseview,
        config: org.scalablytyped.runtime.StringDictionary[js.Any]
      ): java.lang.String = js.native
      /* CompleteClass */
      override def setValue(node: stdLib.HTMLElement, value: js.Any): js.Any = js.native
    }
    
  }
  
  type vscrollEventName = webixLib.webixLibStrings.onScroll
}

