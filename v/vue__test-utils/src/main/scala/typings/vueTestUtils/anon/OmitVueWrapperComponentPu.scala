package typings.vueTestUtils.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import typings.std.Omit
import typings.std.Record
import typings.vueRuntimeCore.mod.App
import typings.vueRuntimeCore.mod.ComponentInternalInstance
import typings.vueRuntimeCore.mod.ComponentOptionsBase
import typings.vueRuntimeCore.mod.ComponentPublicInstance
import typings.vueTestUtils.distConstantsDomEventsMod.DomEventNameWithModifier
import typings.vueTestUtils.distCreateDomEventMod.TriggerOptions
import typings.vueTestUtils.distDomWrapperMod.DOMWrapper
import typings.vueTestUtils.distInterfacesWrapperLikeMod.WrapperLike
import typings.vueTestUtils.vueTestUtilsBooleans.`false`
import typings.vueTestUtils.vueTestUtilsStrings.exists
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@vue/test-utils.@vue/test-utils/dist/vueWrapper.VueWrapper<vue.vue.ComponentPublicInstance<{}, {}, {}, {}, {}, {}, {}, {}, false, @vue/runtime-core.@vue/runtime-core.ComponentOptionsBase<any, any, any, any, any, any, any, any, any, {}>>>, 'exists'> */
trait OmitVueWrapperComponentPu extends StObject {
  
  var __app: Any
  
  var __setProps: Any
  
  var attachNativeEventListener: Any
  
  def attributes(): StringDictionary[String]
  @JSName("attributes")
  var attributes_Original: js.Function0[StringDictionary[String]]
  
  def classes(): js.Array[String]
  @JSName("classes")
  var classes_Original: js.Function0[js.Array[String]]
  
  var cleanUpCallbacks: Any
  
  var componentVM: Any
  
  @JSName("constructor")
  var constructor_Original: js.Function3[
    /* app */ App[Any] | Null, 
    /* vm */ ComponentPublicInstance[
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ], 
    /* setProps */ js.UndefOr[js.Function1[/* props */ Record[String, Any], Unit]], 
    Any
  ]
  
  def element(): Element
  @JSName("element")
  var element_Original: js.Function0[Element]
  
  def emitted[T](): Record[String, js.Array[T]]
  @JSName("emitted")
  var emitted_Original: js.Function0[Record[String, js.Array[Any]]]
  
  def find[K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.vueTestUtils.vueTestUtilsStrings.a, typings.vueTestUtils.vueTestUtilsStrings.abbr, typings.vueTestUtils.vueTestUtilsStrings.address */ Any */](selector: K): DOMWrapper[
    /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementTagNameMap[K] */ js.Any
  ]
  
  def findAll[K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.vueTestUtils.vueTestUtilsStrings.a, typings.vueTestUtils.vueTestUtilsStrings.abbr, typings.vueTestUtils.vueTestUtilsStrings.address */ Any */](selector: K): js.Array[
    DOMWrapper[
      /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementTagNameMap[K] */ js.Any
    ]
  ]
  
  def findAllComponents[T /* <: scala.Nothing */](selector: String): js.Array[WrapperLike]
  @JSName("findAllComponents")
  var findAllComponents_Original: js.Function1[/* selector */ String, js.Array[WrapperLike]]
  
  def findAllDOMElements(selector: String): js.Array[Element]
  @JSName("findAllDOMElements")
  var findAllDOMElements_Original: js.Function1[/* selector */ String, js.Array[Element]]
  
  @JSName("findAll")
  var findAll_Original: js.Function1[
    /* selector */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.vueTestUtils.vueTestUtilsStrings.a, typings.vueTestUtils.vueTestUtilsStrings.abbr, typings.vueTestUtils.vueTestUtilsStrings.address */ Any, 
    js.Array[
      DOMWrapper[
        /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementTagNameMap['a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'slot' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr'] */ js.Any
      ]
    ]
  ]
  
  def findComponent[T /* <: scala.Nothing */](selector: String): WrapperLike
  @JSName("findComponent")
  var findComponent_Original: js.Function1[/* selector */ String, WrapperLike]
  
  @JSName("find")
  var find_Original: js.Function1[
    /* selector */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.vueTestUtils.vueTestUtilsStrings.a, typings.vueTestUtils.vueTestUtilsStrings.abbr, typings.vueTestUtils.vueTestUtilsStrings.address */ Any, 
    DOMWrapper[
      /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementTagNameMap['a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'slot' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr'] */ js.Any
    ]
  ]
  
  def get[K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.vueTestUtils.vueTestUtilsStrings.a, typings.vueTestUtils.vueTestUtilsStrings.abbr, typings.vueTestUtils.vueTestUtilsStrings.address */ Any */](selector: K): Omit[
    DOMWrapper[
      /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementTagNameMap[K] */ js.Any
    ], 
    exists
  ]
  
  def getComponent[T /* <: scala.Nothing */](selector: String): Omitdefaultexists
  @JSName("getComponent")
  var getComponent_Original: js.Function1[/* selector */ String, Omitdefaultexists]
  
  def getCurrentComponent(): ComponentInternalInstance
  @JSName("getCurrentComponent")
  var getCurrentComponent_Original: js.Function0[ComponentInternalInstance]
  
  def getRootNodes(): js.Array[VueNodeNode]
  @JSName("getRootNodes")
  var getRootNodes_Original: js.Function0[js.Array[VueNodeNode]]
  
  @JSName("get")
  var get_Original: js.Function1[
    /* selector */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.vueTestUtils.vueTestUtilsStrings.a, typings.vueTestUtils.vueTestUtilsStrings.abbr, typings.vueTestUtils.vueTestUtilsStrings.address */ Any, 
    Omit[
      DOMWrapper[
        /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementTagNameMap['a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'slot' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr'] */ js.Any
      ], 
      exists
    ]
  ]
  
  def hasMultipleRoots(): Any
  @JSName("hasMultipleRoots")
  var hasMultipleRoots_Original: js.Function0[Any]
  
  def html(): String
  def html(options: Raw): String
  @JSName("html")
  var html_Original: js.Function1[/* options */ js.UndefOr[Raw], String]
  
  def isDisabled(): Boolean
  @JSName("isDisabled")
  var isDisabled_Original: js.Function0[Boolean]
  
  def isVisible(): Boolean
  @JSName("isVisible")
  var isVisible_Original: js.Function0[Boolean]
  
  def parentElement(): Any
  @JSName("parentElement")
  var parentElement_Original: js.Function0[Any]
  
  def props(): StringDictionary[Any]
  @JSName("props")
  var props_Original: js.Function0[StringDictionary[Any]]
  
  var rootVM: Any
  
  def setData(data: Record[String, Any]): js.Promise[Unit]
  @JSName("setData")
  var setData_Original: js.Function1[/* data */ Record[String, Any], js.Promise[Unit]]
  
  def setProps(props: Record[String, Any]): js.Promise[Unit]
  @JSName("setProps")
  var setProps_Original: js.Function1[/* props */ Record[String, Any], js.Promise[Unit]]
  
  def setValue(value: Any): js.Promise[Unit]
  def setValue(value: Any, prop: String): js.Promise[Unit]
  @JSName("setValue")
  var setValue_Original: js.Function2[/* value */ Any, /* prop */ js.UndefOr[String], js.Promise[Unit]]
  
  def text(): String
  @JSName("text")
  var text_Original: js.Function0[String]
  
  def trigger(eventString: DomEventNameWithModifier): js.Promise[Unit]
  def trigger(eventString: DomEventNameWithModifier, options: TriggerOptions): js.Promise[Unit]
  @JSName("trigger")
  var trigger_Original: js.Function2[
    /* eventString */ DomEventNameWithModifier, 
    /* options */ js.UndefOr[TriggerOptions], 
    js.Promise[Unit]
  ]
  
  def unmount(): Unit
  @JSName("unmount")
  var unmount_Original: js.Function0[Unit]
  
  def vm(): ComponentPublicInstance[
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    `false`, 
    ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
  ]
  @JSName("vm")
  var vm_Original: js.Function0[
    ComponentPublicInstance[
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ]
  ]
  
  var wrapperElement: VueNodeNode
}
object OmitVueWrapperComponentPu {
  
  inline def apply(
    __app: Any,
    __setProps: Any,
    attachNativeEventListener: Any,
    attributes: () => StringDictionary[String],
    classes: () => js.Array[String],
    cleanUpCallbacks: Any,
    componentVM: Any,
    constructor: (/* app */ App[Any] | Null, /* vm */ ComponentPublicInstance[
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ], /* setProps */ js.UndefOr[js.Function1[/* props */ Record[String, Any], Unit]]) => Any,
    element: () => Element,
    emitted: () => Record[String, js.Array[Any]],
    find: /* selector */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.vueTestUtils.vueTestUtilsStrings.a, typings.vueTestUtils.vueTestUtilsStrings.abbr, typings.vueTestUtils.vueTestUtilsStrings.address */ Any => DOMWrapper[
      /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementTagNameMap['a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'slot' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr'] */ js.Any
    ],
    findAll: /* selector */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.vueTestUtils.vueTestUtilsStrings.a, typings.vueTestUtils.vueTestUtilsStrings.abbr, typings.vueTestUtils.vueTestUtilsStrings.address */ Any => js.Array[
      DOMWrapper[
        /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementTagNameMap['a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'slot' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr'] */ js.Any
      ]
    ],
    findAllComponents: /* selector */ String => js.Array[WrapperLike],
    findAllDOMElements: /* selector */ String => js.Array[Element],
    findComponent: /* selector */ String => WrapperLike,
    get: /* selector */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.vueTestUtils.vueTestUtilsStrings.a, typings.vueTestUtils.vueTestUtilsStrings.abbr, typings.vueTestUtils.vueTestUtilsStrings.address */ Any => Omit[
      DOMWrapper[
        /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementTagNameMap['a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'slot' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr'] */ js.Any
      ], 
      exists
    ],
    getComponent: /* selector */ String => Omitdefaultexists,
    getCurrentComponent: () => ComponentInternalInstance,
    getRootNodes: () => js.Array[VueNodeNode],
    hasMultipleRoots: () => Any,
    html: /* options */ js.UndefOr[Raw] => String,
    isDisabled: () => Boolean,
    isVisible: () => Boolean,
    parentElement: () => Any,
    props: () => StringDictionary[Any],
    rootVM: Any,
    setData: /* data */ Record[String, Any] => js.Promise[Unit],
    setProps: /* props */ Record[String, Any] => js.Promise[Unit],
    setValue: (/* value */ Any, /* prop */ js.UndefOr[String]) => js.Promise[Unit],
    text: () => String,
    trigger: (/* eventString */ DomEventNameWithModifier, /* options */ js.UndefOr[TriggerOptions]) => js.Promise[Unit],
    unmount: () => Unit,
    vm: () => ComponentPublicInstance[
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
    ],
    wrapperElement: VueNodeNode
  ): OmitVueWrapperComponentPu = {
    val __obj = js.Dynamic.literal(__app = __app.asInstanceOf[js.Any], __setProps = __setProps.asInstanceOf[js.Any], attachNativeEventListener = attachNativeEventListener.asInstanceOf[js.Any], attributes = js.Any.fromFunction0(attributes), classes = js.Any.fromFunction0(classes), cleanUpCallbacks = cleanUpCallbacks.asInstanceOf[js.Any], componentVM = componentVM.asInstanceOf[js.Any], constructor = js.Any.fromFunction3(constructor), element = js.Any.fromFunction0(element), emitted = js.Any.fromFunction0(emitted), find = js.Any.fromFunction1(find), findAll = js.Any.fromFunction1(findAll), findAllComponents = js.Any.fromFunction1(findAllComponents), findAllDOMElements = js.Any.fromFunction1(findAllDOMElements), findComponent = js.Any.fromFunction1(findComponent), get = js.Any.fromFunction1(get), getComponent = js.Any.fromFunction1(getComponent), getCurrentComponent = js.Any.fromFunction0(getCurrentComponent), getRootNodes = js.Any.fromFunction0(getRootNodes), hasMultipleRoots = js.Any.fromFunction0(hasMultipleRoots), html = js.Any.fromFunction1(html), isDisabled = js.Any.fromFunction0(isDisabled), isVisible = js.Any.fromFunction0(isVisible), parentElement = js.Any.fromFunction0(parentElement), props = js.Any.fromFunction0(props), rootVM = rootVM.asInstanceOf[js.Any], setData = js.Any.fromFunction1(setData), setProps = js.Any.fromFunction1(setProps), setValue = js.Any.fromFunction2(setValue), text = js.Any.fromFunction0(text), trigger = js.Any.fromFunction2(trigger), unmount = js.Any.fromFunction0(unmount), vm = js.Any.fromFunction0(vm), wrapperElement = wrapperElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitVueWrapperComponentPu]
  }
  
  extension [Self <: OmitVueWrapperComponentPu](x: Self) {
    
    inline def setAttachNativeEventListener(value: Any): Self = StObject.set(x, "attachNativeEventListener", value.asInstanceOf[js.Any])
    
    inline def setAttributes(value: () => StringDictionary[String]): Self = StObject.set(x, "attributes", js.Any.fromFunction0(value))
    
    inline def setClasses(value: () => js.Array[String]): Self = StObject.set(x, "classes", js.Any.fromFunction0(value))
    
    inline def setCleanUpCallbacks(value: Any): Self = StObject.set(x, "cleanUpCallbacks", value.asInstanceOf[js.Any])
    
    inline def setComponentVM(value: Any): Self = StObject.set(x, "componentVM", value.asInstanceOf[js.Any])
    
    inline def setConstructor(
      value: (/* app */ App[Any] | Null, /* vm */ ComponentPublicInstance[
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          `false`, 
          ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
        ], /* setProps */ js.UndefOr[js.Function1[/* props */ Record[String, Any], Unit]]) => Any
    ): Self = StObject.set(x, "constructor", js.Any.fromFunction3(value))
    
    inline def setElement(value: () => Element): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
    
    inline def setEmitted(value: () => Record[String, js.Array[Any]]): Self = StObject.set(x, "emitted", js.Any.fromFunction0(value))
    
    inline def setFind(
      value: /* selector */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.vueTestUtils.vueTestUtilsStrings.a, typings.vueTestUtils.vueTestUtilsStrings.abbr, typings.vueTestUtils.vueTestUtilsStrings.address */ Any => DOMWrapper[
          /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementTagNameMap['a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'slot' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr'] */ js.Any
        ]
    ): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
    
    inline def setFindAll(
      value: /* selector */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.vueTestUtils.vueTestUtilsStrings.a, typings.vueTestUtils.vueTestUtilsStrings.abbr, typings.vueTestUtils.vueTestUtilsStrings.address */ Any => js.Array[
          DOMWrapper[
            /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementTagNameMap['a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'slot' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr'] */ js.Any
          ]
        ]
    ): Self = StObject.set(x, "findAll", js.Any.fromFunction1(value))
    
    inline def setFindAllComponents(value: /* selector */ String => js.Array[WrapperLike]): Self = StObject.set(x, "findAllComponents", js.Any.fromFunction1(value))
    
    inline def setFindAllDOMElements(value: /* selector */ String => js.Array[Element]): Self = StObject.set(x, "findAllDOMElements", js.Any.fromFunction1(value))
    
    inline def setFindComponent(value: /* selector */ String => WrapperLike): Self = StObject.set(x, "findComponent", js.Any.fromFunction1(value))
    
    inline def setGet(
      value: /* selector */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.vueTestUtils.vueTestUtilsStrings.a, typings.vueTestUtils.vueTestUtilsStrings.abbr, typings.vueTestUtils.vueTestUtilsStrings.address */ Any => Omit[
          DOMWrapper[
            /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementTagNameMap['a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'slot' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr'] */ js.Any
          ], 
          exists
        ]
    ): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetComponent(value: /* selector */ String => Omitdefaultexists): Self = StObject.set(x, "getComponent", js.Any.fromFunction1(value))
    
    inline def setGetCurrentComponent(value: () => ComponentInternalInstance): Self = StObject.set(x, "getCurrentComponent", js.Any.fromFunction0(value))
    
    inline def setGetRootNodes(value: () => js.Array[VueNodeNode]): Self = StObject.set(x, "getRootNodes", js.Any.fromFunction0(value))
    
    inline def setHasMultipleRoots(value: () => Any): Self = StObject.set(x, "hasMultipleRoots", js.Any.fromFunction0(value))
    
    inline def setHtml(value: /* options */ js.UndefOr[Raw] => String): Self = StObject.set(x, "html", js.Any.fromFunction1(value))
    
    inline def setIsDisabled(value: () => Boolean): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
    
    inline def setIsVisible(value: () => Boolean): Self = StObject.set(x, "isVisible", js.Any.fromFunction0(value))
    
    inline def setParentElement(value: () => Any): Self = StObject.set(x, "parentElement", js.Any.fromFunction0(value))
    
    inline def setProps(value: () => StringDictionary[Any]): Self = StObject.set(x, "props", js.Any.fromFunction0(value))
    
    inline def setRootVM(value: Any): Self = StObject.set(x, "rootVM", value.asInstanceOf[js.Any])
    
    inline def setSetData(value: /* data */ Record[String, Any] => js.Promise[Unit]): Self = StObject.set(x, "setData", js.Any.fromFunction1(value))
    
    inline def setSetProps(value: /* props */ Record[String, Any] => js.Promise[Unit]): Self = StObject.set(x, "setProps", js.Any.fromFunction1(value))
    
    inline def setSetValue(value: (/* value */ Any, /* prop */ js.UndefOr[String]) => js.Promise[Unit]): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
    
    inline def setText(value: () => String): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
    
    inline def setTrigger(
      value: (/* eventString */ DomEventNameWithModifier, /* options */ js.UndefOr[TriggerOptions]) => js.Promise[Unit]
    ): Self = StObject.set(x, "trigger", js.Any.fromFunction2(value))
    
    inline def setUnmount(value: () => Unit): Self = StObject.set(x, "unmount", js.Any.fromFunction0(value))
    
    inline def setVm(
      value: () => ComponentPublicInstance[
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          `false`, 
          ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
        ]
    ): Self = StObject.set(x, "vm", js.Any.fromFunction0(value))
    
    inline def setWrapperElement(value: VueNodeNode): Self = StObject.set(x, "wrapperElement", value.asInstanceOf[js.Any])
    
    inline def set__app(value: Any): Self = StObject.set(x, "__app", value.asInstanceOf[js.Any])
    
    inline def set__setProps(value: Any): Self = StObject.set(x, "__setProps", value.asInstanceOf[js.Any])
  }
}
