package typings.wordpressCompose

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.Context
import typings.react.mod.ErrorInfo
import typings.react.mod.FunctionComponent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactInstance
import typings.react.mod.global.JSX.Element
import typings.std.DragEvent
import typings.std.MouseEvent
import typings.std.Parameters
import typings.std.Pick
import typings.std.ReturnType
import typings.wordpressCompose.buildTypesHigherOrderWithSafeTimeoutMod.TimeoutProps
import typings.wordpressCompose.buildTypesUtilsCreateHigherOrderComponentMod.WithoutInjectedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call[FunctionT /* <: js.Function1[/* repeated */ Any, Any] */] extends StObject {
    
    def apply(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<FunctionT> is not an array type */ args: Parameters[FunctionT]
    ): ReturnType[FunctionT] = js.native
    
    def cancel(): Unit = js.native
    
    def flush(): ReturnType[FunctionT] = js.native
    
    def pending(): Boolean = js.native
  }
  
  @js.native
  trait ClearTimeout extends StObject {
    
    var UNSAFE_componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var UNSAFE_componentWillReceiveProps: js.UndefOr[
        js.Function2[
          /* nextProps */ WithoutInjectedProps[
            ComponentClass[(WithoutInjectedProps[Any, TimeoutProps]) & TimeoutProps, ComponentState], 
            TimeoutProps
          ], 
          /* nextContext */ Any, 
          Unit
        ]
      ] = js.native
    
    var UNSAFE_componentWillUpdate: js.UndefOr[
        js.Function3[
          /* nextProps */ WithoutInjectedProps[
            ComponentClass[(WithoutInjectedProps[Any, TimeoutProps]) & TimeoutProps, ComponentState], 
            TimeoutProps
          ], 
          /* nextState */ js.Object, 
          /* nextContext */ Any, 
          Unit
        ]
      ] = js.native
    
    def clearTimeout(id: Double): Unit = js.native
    
    var componentDidCatch: js.UndefOr[js.Function2[/* error */ js.Error, /* errorInfo */ ErrorInfo, Unit]] = js.native
    
    var componentDidMount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var componentDidUpdate: js.UndefOr[
        js.Function3[
          /* prevProps */ WithoutInjectedProps[
            ComponentClass[(WithoutInjectedProps[Any, TimeoutProps]) & TimeoutProps, ComponentState], 
            TimeoutProps
          ], 
          /* prevState */ js.Object, 
          /* snapshot */ js.UndefOr[Any], 
          Unit
        ]
      ] = js.native
    
    var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var componentWillReceiveProps: js.UndefOr[
        js.Function2[
          /* nextProps */ WithoutInjectedProps[
            ComponentClass[(WithoutInjectedProps[Any, TimeoutProps]) & TimeoutProps, ComponentState], 
            TimeoutProps
          ], 
          /* nextContext */ Any, 
          Unit
        ]
      ] = js.native
    
    def componentWillUnmount(): Unit = js.native
    
    var componentWillUpdate: js.UndefOr[
        js.Function3[
          /* nextProps */ WithoutInjectedProps[
            ComponentClass[(WithoutInjectedProps[Any, TimeoutProps]) & TimeoutProps, ComponentState], 
            TimeoutProps
          ], 
          /* nextState */ js.Object, 
          /* nextContext */ Any, 
          Unit
        ]
      ] = js.native
    
    var context: Any = js.native
    
    def forceUpdate(): Unit = js.native
    def forceUpdate(callback: js.Function0[Unit]): Unit = js.native
    
    var getSnapshotBeforeUpdate: js.UndefOr[
        js.Function2[
          /* prevProps */ WithoutInjectedProps[
            ComponentClass[(WithoutInjectedProps[Any, TimeoutProps]) & TimeoutProps, ComponentState], 
            TimeoutProps
          ], 
          /* prevState */ js.Object, 
          Any
        ]
      ] = js.native
    
    val props: WithoutInjectedProps[
        ComponentClass[(WithoutInjectedProps[Any, TimeoutProps]) & TimeoutProps, ComponentState], 
        TimeoutProps
      ] = js.native
    
    var refs: StringDictionary[ReactInstance] = js.native
    
    def render(): Element = js.native
    
    def setState[K /* <: scala.Nothing */](): Unit = js.native
    def setState[K /* <: scala.Nothing */](state: js.Object | (Pick[js.Object, K])): Unit = js.native
    def setState[K /* <: scala.Nothing */](state: js.Object | (Pick[js.Object, K]), callback: js.Function0[Unit]): Unit = js.native
    def setState[K /* <: scala.Nothing */](
      state: js.Function2[
          /* prevState */ js.Object, 
          /* props */ WithoutInjectedProps[
            ComponentClass[(WithoutInjectedProps[Any, TimeoutProps]) & TimeoutProps, ComponentState], 
            TimeoutProps
          ], 
          js.Object | (Pick[js.Object, K]) | Null
        ]
    ): Unit = js.native
    def setState[K /* <: scala.Nothing */](
      state: js.Function2[
          /* prevState */ js.Object, 
          /* props */ WithoutInjectedProps[
            ComponentClass[(WithoutInjectedProps[Any, TimeoutProps]) & TimeoutProps, ComponentState], 
            TimeoutProps
          ], 
          js.Object | (Pick[js.Object, K]) | Null
        ],
      callback: js.Function0[Unit]
    ): Unit = js.native
    def setState[K /* <: scala.Nothing */](state: Null, callback: js.Function0[Unit]): Unit = js.native
    
    def setTimeout(fn: js.Function0[Unit], delay: Double): Double = js.native
    
    var shouldComponentUpdate: js.UndefOr[
        js.Function3[
          /* nextProps */ WithoutInjectedProps[
            ComponentClass[(WithoutInjectedProps[Any, TimeoutProps]) & TimeoutProps, ComponentState], 
            TimeoutProps
          ], 
          /* nextState */ js.Object, 
          /* nextContext */ Any, 
          Boolean
        ]
      ] = js.native
    
    var timeouts: js.Array[Double] = js.native
  }
  
  @js.native
  trait ComponentDidCatch extends StObject {
    
    var UNSAFE_componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var UNSAFE_componentWillReceiveProps: js.UndefOr[
        js.Function2[
          /* nextProps */ WithoutInjectedProps[
            FunctionComponent[(WithoutInjectedProps[Any, TimeoutProps]) & TimeoutProps], 
            TimeoutProps
          ], 
          /* nextContext */ Any, 
          Unit
        ]
      ] = js.native
    
    var UNSAFE_componentWillUpdate: js.UndefOr[
        js.Function3[
          /* nextProps */ WithoutInjectedProps[
            FunctionComponent[(WithoutInjectedProps[Any, TimeoutProps]) & TimeoutProps], 
            TimeoutProps
          ], 
          /* nextState */ js.Object, 
          /* nextContext */ Any, 
          Unit
        ]
      ] = js.native
    
    def clearTimeout(id: Double): Unit = js.native
    
    var componentDidCatch: js.UndefOr[js.Function2[/* error */ js.Error, /* errorInfo */ ErrorInfo, Unit]] = js.native
    
    var componentDidMount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var componentDidUpdate: js.UndefOr[
        js.Function3[
          /* prevProps */ WithoutInjectedProps[
            FunctionComponent[(WithoutInjectedProps[Any, TimeoutProps]) & TimeoutProps], 
            TimeoutProps
          ], 
          /* prevState */ js.Object, 
          /* snapshot */ js.UndefOr[Any], 
          Unit
        ]
      ] = js.native
    
    var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var componentWillReceiveProps: js.UndefOr[
        js.Function2[
          /* nextProps */ WithoutInjectedProps[
            FunctionComponent[(WithoutInjectedProps[Any, TimeoutProps]) & TimeoutProps], 
            TimeoutProps
          ], 
          /* nextContext */ Any, 
          Unit
        ]
      ] = js.native
    
    def componentWillUnmount(): Unit = js.native
    
    var componentWillUpdate: js.UndefOr[
        js.Function3[
          /* nextProps */ WithoutInjectedProps[
            FunctionComponent[(WithoutInjectedProps[Any, TimeoutProps]) & TimeoutProps], 
            TimeoutProps
          ], 
          /* nextState */ js.Object, 
          /* nextContext */ Any, 
          Unit
        ]
      ] = js.native
    
    var context: Any = js.native
    
    def forceUpdate(): Unit = js.native
    def forceUpdate(callback: js.Function0[Unit]): Unit = js.native
    
    var getSnapshotBeforeUpdate: js.UndefOr[
        js.Function2[
          /* prevProps */ WithoutInjectedProps[
            FunctionComponent[(WithoutInjectedProps[Any, TimeoutProps]) & TimeoutProps], 
            TimeoutProps
          ], 
          /* prevState */ js.Object, 
          Any
        ]
      ] = js.native
    
    val props: WithoutInjectedProps[
        FunctionComponent[(WithoutInjectedProps[Any, TimeoutProps]) & TimeoutProps], 
        TimeoutProps
      ] = js.native
    
    var refs: StringDictionary[ReactInstance] = js.native
    
    def render(): Element = js.native
    
    def setState[K /* <: scala.Nothing */](): Unit = js.native
    def setState[K /* <: scala.Nothing */](state: js.Object | (Pick[js.Object, K])): Unit = js.native
    def setState[K /* <: scala.Nothing */](state: js.Object | (Pick[js.Object, K]), callback: js.Function0[Unit]): Unit = js.native
    def setState[K /* <: scala.Nothing */](
      state: js.Function2[
          /* prevState */ js.Object, 
          /* props */ WithoutInjectedProps[
            FunctionComponent[(WithoutInjectedProps[Any, TimeoutProps]) & TimeoutProps], 
            TimeoutProps
          ], 
          js.Object | (Pick[js.Object, K]) | Null
        ]
    ): Unit = js.native
    def setState[K /* <: scala.Nothing */](
      state: js.Function2[
          /* prevState */ js.Object, 
          /* props */ WithoutInjectedProps[
            FunctionComponent[(WithoutInjectedProps[Any, TimeoutProps]) & TimeoutProps], 
            TimeoutProps
          ], 
          js.Object | (Pick[js.Object, K]) | Null
        ],
      callback: js.Function0[Unit]
    ): Unit = js.native
    def setState[K /* <: scala.Nothing */](state: Null, callback: js.Function0[Unit]): Unit = js.native
    
    def setTimeout(fn: js.Function0[Unit], delay: Double): Double = js.native
    
    var shouldComponentUpdate: js.UndefOr[
        js.Function3[
          /* nextProps */ WithoutInjectedProps[
            FunctionComponent[(WithoutInjectedProps[Any, TimeoutProps]) & TimeoutProps], 
            TimeoutProps
          ], 
          /* nextState */ js.Object, 
          /* nextContext */ Any, 
          Boolean
        ]
      ] = js.native
    
    var timeouts: js.Array[Double] = js.native
  }
  
  @js.native
  trait ContextType
    extends StObject
       with Instantiable1[
          /* props */ WithoutInjectedProps[
            FunctionComponent[(WithoutInjectedProps[Any, TimeoutProps]) & TimeoutProps], 
            TimeoutProps
          ], 
          ComponentDidCatch
        ] {
    
    var contextType: js.UndefOr[Context[Any]] = js.native
  }
  
  @js.native
  trait EndDrag extends StObject {
    
    def endDrag(): Unit = js.native
    def endDrag(e: MouseEvent): Unit = js.native
    
    var isDragging: Boolean = js.native
    
    def startDrag(e: typings.react.mod.MouseEvent[typings.std.Element, NativeMouseEvent]): Unit = js.native
  }
  
  trait Height extends StObject {
    
    var height: Double | Null
    
    var width: Double | Null
  }
  object Height {
    
    inline def apply(): Height = {
      val __obj = js.Dynamic.literal(height = null, width = null)
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightNull: Self = StObject.set(x, "height", null)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthNull: Self = StObject.set(x, "width", null)
    }
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable1[
          /* props */ WithoutInjectedProps[
            ComponentClass[(WithoutInjectedProps[Any, TimeoutProps]) & TimeoutProps, ComponentState], 
            TimeoutProps
          ], 
          ClearTimeout
        ] {
    
    var contextType: js.UndefOr[Context[Any]] = js.native
  }
  
  trait IsDisabled extends StObject {
    
    var isDisabled: js.UndefOr[Boolean] = js.undefined
  }
  object IsDisabled {
    
    inline def apply(): IsDisabled = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IsDisabled]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsDisabled] (val x: Self) extends AnyVal {
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
    }
  }
  
  @js.native
  trait OnDragEnd extends StObject {
    
    def onDragEnd(): Unit = js.native
    def onDragEnd(e: MouseEvent): Unit = js.native
    
    def onDragMove(e: MouseEvent): Unit = js.native
    
    def onDragStart(e: typings.react.mod.MouseEvent[typings.std.Element, NativeMouseEvent]): Unit = js.native
  }
  
  trait OnDragEnter extends StObject {
    
    var isDisabled: js.UndefOr[Boolean] = js.undefined
    
    var onDragEnd: js.UndefOr[js.Function1[/* e */ MouseEvent, Unit]] = js.undefined
    
    var onDragEnter: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.undefined
    
    var onDragLeave: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.undefined
    
    var onDragOver: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.undefined
    
    var onDragStart: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.undefined
    
    var onDrop: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.undefined
  }
  object OnDragEnter {
    
    inline def apply(): OnDragEnter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnDragEnter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnDragEnter] (val x: Self) extends AnyVal {
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
      
      inline def setOnDragEnd(value: /* e */ MouseEvent => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragEnter(value: /* e */ DragEvent => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      inline def setOnDragLeave(value: /* e */ DragEvent => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      inline def setOnDragOver(value: /* e */ DragEvent => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      inline def setOnDragStart(value: /* e */ DragEvent => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDrop(value: /* e */ DragEvent => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@wordpress/compose.@wordpress/compose/build-types/utils/debounce.DebounceOptions> */
  trait PartialDebounceOptions extends StObject {
    
    var leading: js.UndefOr[Boolean] = js.undefined
    
    var maxWait: js.UndefOr[Double] = js.undefined
    
    var trailing: js.UndefOr[Boolean] = js.undefined
  }
  object PartialDebounceOptions {
    
    inline def apply(): PartialDebounceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDebounceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialDebounceOptions] (val x: Self) extends AnyVal {
      
      inline def setLeading(value: Boolean): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      inline def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
      
      inline def setMaxWait(value: Double): Self = StObject.set(x, "maxWait", value.asInstanceOf[js.Any])
      
      inline def setMaxWaitUndefined: Self = StObject.set(x, "maxWait", js.undefined)
      
      inline def setTrailing(value: Boolean): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
      
      inline def setTrailingUndefined: Self = StObject.set(x, "trailing", js.undefined)
    }
  }
  
  /* Inlined std.Pick<std.HTMLElement, 'tabIndex'> */
  trait PickHTMLElementtabIndex extends StObject {
    
    var tabIndex: Double
  }
  object PickHTMLElementtabIndex {
    
    inline def apply(tabIndex: Double): PickHTMLElementtabIndex = {
      val __obj = js.Dynamic.literal(tabIndex = tabIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickHTMLElementtabIndex]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickHTMLElementtabIndex] (val x: Self) extends AnyVal {
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Record<keyof std.GlobalEventHandlersEventMap, string> */
  trait RecordkeyofGlobalEventHan extends StObject {
    
    var abort: String
    
    var animationcancel: String
    
    var animationend: String
    
    var animationiteration: String
    
    var animationstart: String
    
    var auxclick: String
    
    var beforeinput: String
    
    var blur: String
    
    var cancel: String
    
    var canplay: String
    
    var canplaythrough: String
    
    var change: String
    
    var click: String
    
    var close: String
    
    var compositionend: String
    
    var compositionstart: String
    
    var compositionupdate: String
    
    var contextmenu: String
    
    var copy: String
    
    var cuechange: String
    
    var cut: String
    
    var dblclick: String
    
    var drag: String
    
    var dragend: String
    
    var dragenter: String
    
    var dragleave: String
    
    var dragover: String
    
    var dragstart: String
    
    var drop: String
    
    var durationchange: String
    
    var emptied: String
    
    var ended: String
    
    var error: String
    
    var focus: String
    
    var focusin: String
    
    var focusout: String
    
    var formdata: String
    
    var gotpointercapture: String
    
    var input: String
    
    var invalid: String
    
    var keydown: String
    
    var keypress: String
    
    var keyup: String
    
    var load: String
    
    var loadeddata: String
    
    var loadedmetadata: String
    
    var loadstart: String
    
    var lostpointercapture: String
    
    var mousedown: String
    
    var mouseenter: String
    
    var mouseleave: String
    
    var mousemove: String
    
    var mouseout: String
    
    var mouseover: String
    
    var mouseup: String
    
    var paste: String
    
    var pause: String
    
    var play: String
    
    var playing: String
    
    var pointercancel: String
    
    var pointerdown: String
    
    var pointerenter: String
    
    var pointerleave: String
    
    var pointermove: String
    
    var pointerout: String
    
    var pointerover: String
    
    var pointerup: String
    
    var progress: String
    
    var ratechange: String
    
    var reset: String
    
    var resize: String
    
    var scroll: String
    
    var securitypolicyviolation: String
    
    var seeked: String
    
    var seeking: String
    
    var select: String
    
    var selectionchange: String
    
    var selectstart: String
    
    var slotchange: String
    
    var stalled: String
    
    var submit: String
    
    var suspend: String
    
    var timeupdate: String
    
    var toggle: String
    
    var touchcancel: String
    
    var touchend: String
    
    var touchmove: String
    
    var touchstart: String
    
    var transitioncancel: String
    
    var transitionend: String
    
    var transitionrun: String
    
    var transitionstart: String
    
    var volumechange: String
    
    var waiting: String
    
    var webkitanimationend: String
    
    var webkitanimationiteration: String
    
    var webkitanimationstart: String
    
    var webkittransitionend: String
    
    var wheel: String
  }
  object RecordkeyofGlobalEventHan {
    
    inline def apply(
      abort: String,
      animationcancel: String,
      animationend: String,
      animationiteration: String,
      animationstart: String,
      auxclick: String,
      beforeinput: String,
      blur: String,
      cancel: String,
      canplay: String,
      canplaythrough: String,
      change: String,
      click: String,
      close: String,
      compositionend: String,
      compositionstart: String,
      compositionupdate: String,
      contextmenu: String,
      copy: String,
      cuechange: String,
      cut: String,
      dblclick: String,
      drag: String,
      dragend: String,
      dragenter: String,
      dragleave: String,
      dragover: String,
      dragstart: String,
      drop: String,
      durationchange: String,
      emptied: String,
      ended: String,
      error: String,
      focus: String,
      focusin: String,
      focusout: String,
      formdata: String,
      gotpointercapture: String,
      input: String,
      invalid: String,
      keydown: String,
      keypress: String,
      keyup: String,
      load: String,
      loadeddata: String,
      loadedmetadata: String,
      loadstart: String,
      lostpointercapture: String,
      mousedown: String,
      mouseenter: String,
      mouseleave: String,
      mousemove: String,
      mouseout: String,
      mouseover: String,
      mouseup: String,
      paste: String,
      pause: String,
      play: String,
      playing: String,
      pointercancel: String,
      pointerdown: String,
      pointerenter: String,
      pointerleave: String,
      pointermove: String,
      pointerout: String,
      pointerover: String,
      pointerup: String,
      progress: String,
      ratechange: String,
      reset: String,
      resize: String,
      scroll: String,
      securitypolicyviolation: String,
      seeked: String,
      seeking: String,
      select: String,
      selectionchange: String,
      selectstart: String,
      slotchange: String,
      stalled: String,
      submit: String,
      suspend: String,
      timeupdate: String,
      toggle: String,
      touchcancel: String,
      touchend: String,
      touchmove: String,
      touchstart: String,
      transitioncancel: String,
      transitionend: String,
      transitionrun: String,
      transitionstart: String,
      volumechange: String,
      waiting: String,
      webkitanimationend: String,
      webkitanimationiteration: String,
      webkitanimationstart: String,
      webkittransitionend: String,
      wheel: String
    ): RecordkeyofGlobalEventHan = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], beforeinput = beforeinput.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], compositionend = compositionend.asInstanceOf[js.Any], compositionstart = compositionstart.asInstanceOf[js.Any], compositionupdate = compositionupdate.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], formdata = formdata.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], slotchange = slotchange.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], webkitanimationend = webkitanimationend.asInstanceOf[js.Any], webkitanimationiteration = webkitanimationiteration.asInstanceOf[js.Any], webkitanimationstart = webkitanimationstart.asInstanceOf[js.Any], webkittransitionend = webkittransitionend.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordkeyofGlobalEventHan]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RecordkeyofGlobalEventHan] (val x: Self) extends AnyVal {
      
      inline def setAbort(value: String): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
      
      inline def setAnimationcancel(value: String): Self = StObject.set(x, "animationcancel", value.asInstanceOf[js.Any])
      
      inline def setAnimationend(value: String): Self = StObject.set(x, "animationend", value.asInstanceOf[js.Any])
      
      inline def setAnimationiteration(value: String): Self = StObject.set(x, "animationiteration", value.asInstanceOf[js.Any])
      
      inline def setAnimationstart(value: String): Self = StObject.set(x, "animationstart", value.asInstanceOf[js.Any])
      
      inline def setAuxclick(value: String): Self = StObject.set(x, "auxclick", value.asInstanceOf[js.Any])
      
      inline def setBeforeinput(value: String): Self = StObject.set(x, "beforeinput", value.asInstanceOf[js.Any])
      
      inline def setBlur(value: String): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
      
      inline def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCanplay(value: String): Self = StObject.set(x, "canplay", value.asInstanceOf[js.Any])
      
      inline def setCanplaythrough(value: String): Self = StObject.set(x, "canplaythrough", value.asInstanceOf[js.Any])
      
      inline def setChange(value: String): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
      
      inline def setClick(value: String): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      inline def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCompositionend(value: String): Self = StObject.set(x, "compositionend", value.asInstanceOf[js.Any])
      
      inline def setCompositionstart(value: String): Self = StObject.set(x, "compositionstart", value.asInstanceOf[js.Any])
      
      inline def setCompositionupdate(value: String): Self = StObject.set(x, "compositionupdate", value.asInstanceOf[js.Any])
      
      inline def setContextmenu(value: String): Self = StObject.set(x, "contextmenu", value.asInstanceOf[js.Any])
      
      inline def setCopy(value: String): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      inline def setCuechange(value: String): Self = StObject.set(x, "cuechange", value.asInstanceOf[js.Any])
      
      inline def setCut(value: String): Self = StObject.set(x, "cut", value.asInstanceOf[js.Any])
      
      inline def setDblclick(value: String): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
      
      inline def setDrag(value: String): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
      
      inline def setDragend(value: String): Self = StObject.set(x, "dragend", value.asInstanceOf[js.Any])
      
      inline def setDragenter(value: String): Self = StObject.set(x, "dragenter", value.asInstanceOf[js.Any])
      
      inline def setDragleave(value: String): Self = StObject.set(x, "dragleave", value.asInstanceOf[js.Any])
      
      inline def setDragover(value: String): Self = StObject.set(x, "dragover", value.asInstanceOf[js.Any])
      
      inline def setDragstart(value: String): Self = StObject.set(x, "dragstart", value.asInstanceOf[js.Any])
      
      inline def setDrop(value: String): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
      
      inline def setDurationchange(value: String): Self = StObject.set(x, "durationchange", value.asInstanceOf[js.Any])
      
      inline def setEmptied(value: String): Self = StObject.set(x, "emptied", value.asInstanceOf[js.Any])
      
      inline def setEnded(value: String): Self = StObject.set(x, "ended", value.asInstanceOf[js.Any])
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setFocus(value: String): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setFocusin(value: String): Self = StObject.set(x, "focusin", value.asInstanceOf[js.Any])
      
      inline def setFocusout(value: String): Self = StObject.set(x, "focusout", value.asInstanceOf[js.Any])
      
      inline def setFormdata(value: String): Self = StObject.set(x, "formdata", value.asInstanceOf[js.Any])
      
      inline def setGotpointercapture(value: String): Self = StObject.set(x, "gotpointercapture", value.asInstanceOf[js.Any])
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInvalid(value: String): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      inline def setKeydown(value: String): Self = StObject.set(x, "keydown", value.asInstanceOf[js.Any])
      
      inline def setKeypress(value: String): Self = StObject.set(x, "keypress", value.asInstanceOf[js.Any])
      
      inline def setKeyup(value: String): Self = StObject.set(x, "keyup", value.asInstanceOf[js.Any])
      
      inline def setLoad(value: String): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
      
      inline def setLoadeddata(value: String): Self = StObject.set(x, "loadeddata", value.asInstanceOf[js.Any])
      
      inline def setLoadedmetadata(value: String): Self = StObject.set(x, "loadedmetadata", value.asInstanceOf[js.Any])
      
      inline def setLoadstart(value: String): Self = StObject.set(x, "loadstart", value.asInstanceOf[js.Any])
      
      inline def setLostpointercapture(value: String): Self = StObject.set(x, "lostpointercapture", value.asInstanceOf[js.Any])
      
      inline def setMousedown(value: String): Self = StObject.set(x, "mousedown", value.asInstanceOf[js.Any])
      
      inline def setMouseenter(value: String): Self = StObject.set(x, "mouseenter", value.asInstanceOf[js.Any])
      
      inline def setMouseleave(value: String): Self = StObject.set(x, "mouseleave", value.asInstanceOf[js.Any])
      
      inline def setMousemove(value: String): Self = StObject.set(x, "mousemove", value.asInstanceOf[js.Any])
      
      inline def setMouseout(value: String): Self = StObject.set(x, "mouseout", value.asInstanceOf[js.Any])
      
      inline def setMouseover(value: String): Self = StObject.set(x, "mouseover", value.asInstanceOf[js.Any])
      
      inline def setMouseup(value: String): Self = StObject.set(x, "mouseup", value.asInstanceOf[js.Any])
      
      inline def setPaste(value: String): Self = StObject.set(x, "paste", value.asInstanceOf[js.Any])
      
      inline def setPause(value: String): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
      
      inline def setPlay(value: String): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
      
      inline def setPlaying(value: String): Self = StObject.set(x, "playing", value.asInstanceOf[js.Any])
      
      inline def setPointercancel(value: String): Self = StObject.set(x, "pointercancel", value.asInstanceOf[js.Any])
      
      inline def setPointerdown(value: String): Self = StObject.set(x, "pointerdown", value.asInstanceOf[js.Any])
      
      inline def setPointerenter(value: String): Self = StObject.set(x, "pointerenter", value.asInstanceOf[js.Any])
      
      inline def setPointerleave(value: String): Self = StObject.set(x, "pointerleave", value.asInstanceOf[js.Any])
      
      inline def setPointermove(value: String): Self = StObject.set(x, "pointermove", value.asInstanceOf[js.Any])
      
      inline def setPointerout(value: String): Self = StObject.set(x, "pointerout", value.asInstanceOf[js.Any])
      
      inline def setPointerover(value: String): Self = StObject.set(x, "pointerover", value.asInstanceOf[js.Any])
      
      inline def setPointerup(value: String): Self = StObject.set(x, "pointerup", value.asInstanceOf[js.Any])
      
      inline def setProgress(value: String): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setRatechange(value: String): Self = StObject.set(x, "ratechange", value.asInstanceOf[js.Any])
      
      inline def setReset(value: String): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
      
      inline def setResize(value: String): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setScroll(value: String): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      inline def setSecuritypolicyviolation(value: String): Self = StObject.set(x, "securitypolicyviolation", value.asInstanceOf[js.Any])
      
      inline def setSeeked(value: String): Self = StObject.set(x, "seeked", value.asInstanceOf[js.Any])
      
      inline def setSeeking(value: String): Self = StObject.set(x, "seeking", value.asInstanceOf[js.Any])
      
      inline def setSelect(value: String): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      inline def setSelectionchange(value: String): Self = StObject.set(x, "selectionchange", value.asInstanceOf[js.Any])
      
      inline def setSelectstart(value: String): Self = StObject.set(x, "selectstart", value.asInstanceOf[js.Any])
      
      inline def setSlotchange(value: String): Self = StObject.set(x, "slotchange", value.asInstanceOf[js.Any])
      
      inline def setStalled(value: String): Self = StObject.set(x, "stalled", value.asInstanceOf[js.Any])
      
      inline def setSubmit(value: String): Self = StObject.set(x, "submit", value.asInstanceOf[js.Any])
      
      inline def setSuspend(value: String): Self = StObject.set(x, "suspend", value.asInstanceOf[js.Any])
      
      inline def setTimeupdate(value: String): Self = StObject.set(x, "timeupdate", value.asInstanceOf[js.Any])
      
      inline def setToggle(value: String): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      
      inline def setTouchcancel(value: String): Self = StObject.set(x, "touchcancel", value.asInstanceOf[js.Any])
      
      inline def setTouchend(value: String): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
      
      inline def setTouchmove(value: String): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
      
      inline def setTouchstart(value: String): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
      
      inline def setTransitioncancel(value: String): Self = StObject.set(x, "transitioncancel", value.asInstanceOf[js.Any])
      
      inline def setTransitionend(value: String): Self = StObject.set(x, "transitionend", value.asInstanceOf[js.Any])
      
      inline def setTransitionrun(value: String): Self = StObject.set(x, "transitionrun", value.asInstanceOf[js.Any])
      
      inline def setTransitionstart(value: String): Self = StObject.set(x, "transitionstart", value.asInstanceOf[js.Any])
      
      inline def setVolumechange(value: String): Self = StObject.set(x, "volumechange", value.asInstanceOf[js.Any])
      
      inline def setWaiting(value: String): Self = StObject.set(x, "waiting", value.asInstanceOf[js.Any])
      
      inline def setWebkitanimationend(value: String): Self = StObject.set(x, "webkitanimationend", value.asInstanceOf[js.Any])
      
      inline def setWebkitanimationiteration(value: String): Self = StObject.set(x, "webkitanimationiteration", value.asInstanceOf[js.Any])
      
      inline def setWebkitanimationstart(value: String): Self = StObject.set(x, "webkitanimationstart", value.asInstanceOf[js.Any])
      
      inline def setWebkittransitionend(value: String): Self = StObject.set(x, "webkittransitionend", value.asInstanceOf[js.Any])
      
      inline def setWheel(value: String): Self = StObject.set(x, "wheel", value.asInstanceOf[js.Any])
    }
  }
}
