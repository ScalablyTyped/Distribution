package typings.vueTestUtils.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import typings.std.Node
import typings.std.Omit
import typings.vueRuntimeCore.mod.ComponentInternalInstance
import typings.vueTestUtils.distConstantsDomEventsMod.DomEventNameWithModifier
import typings.vueTestUtils.distCreateDomEventMod.TriggerOptions
import typings.vueTestUtils.distDomWrapperMod.DOMWrapper
import typings.vueTestUtils.distInterfacesWrapperLikeMod.WrapperLike
import typings.vueTestUtils.vueTestUtilsStrings.exists
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@vue/test-utils.@vue/test-utils/dist/domWrapper.DOMWrapper<std.Element>, 'exists'> */
trait OmitDOMWrapperElementexisAttributes extends StObject {
  
  def attributes(): StringDictionary[String]
  @JSName("attributes")
  var attributes_Original: js.Function0[StringDictionary[String]]
  
  def classes(): js.Array[String]
  @JSName("classes")
  var classes_Original: js.Function0[js.Array[String]]
  
  @JSName("constructor")
  var constructor_Original: js.Function1[/* element */ Element, Any]
  
  var element: Node
  
  def find[K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.vueTestUtils.vueTestUtilsStrings.a, typings.vueTestUtils.vueTestUtilsStrings.abbr, typings.vueTestUtils.vueTestUtilsStrings.address */ Any */](selector: K): DOMWrapper[
    /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementTagNameMap[K] */ js.Any
  ]
  
  def findAll[K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.vueTestUtils.vueTestUtilsStrings.a, typings.vueTestUtils.vueTestUtilsStrings.abbr, typings.vueTestUtils.vueTestUtilsStrings.address */ Any */](selector: K): js.Array[
    DOMWrapper[
      /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementTagNameMap[K] */ js.Any
    ]
  ]
  
  def findAllComponents(selector: Any): Any
  @JSName("findAllComponents")
  var findAllComponents_Original: js.Function1[/* selector */ Any, Any]
  
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
  
  def getComponent[T /* <: scala.Nothing */](selector: String): OmitdefaultexistsAttributes
  @JSName("getComponent")
  var getComponent_Original: js.Function1[/* selector */ String, OmitdefaultexistsAttributes]
  
  def getCurrentComponent(): js.UndefOr[ComponentInternalInstance]
  @JSName("getCurrentComponent")
  var getCurrentComponent_Original: js.Function0[js.UndefOr[ComponentInternalInstance]]
  
  def getRootNodes(): js.Array[VueNodeElement]
  @JSName("getRootNodes")
  var getRootNodes_Original: js.Function0[js.Array[VueNodeElement]]
  
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
  
  var setChecked: Any
  
  var setSelected: Any
  
  def setValue(): js.Promise[Unit]
  def setValue(value: Any): js.Promise[Unit]
  @JSName("setValue")
  var setValue_Original: js.Function1[/* value */ js.UndefOr[Any], js.Promise[Unit]]
  
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
  
  var wrapperElement: VueNodeElement
}
object OmitDOMWrapperElementexisAttributes {
  
  inline def apply(
    attributes: () => StringDictionary[String],
    classes: () => js.Array[String],
    constructor: /* element */ Element => Any,
    element: Node,
    find: /* selector */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.vueTestUtils.vueTestUtilsStrings.a, typings.vueTestUtils.vueTestUtilsStrings.abbr, typings.vueTestUtils.vueTestUtilsStrings.address */ Any => DOMWrapper[
      /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementTagNameMap['a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'slot' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr'] */ js.Any
    ],
    findAll: /* selector */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.vueTestUtils.vueTestUtilsStrings.a, typings.vueTestUtils.vueTestUtilsStrings.abbr, typings.vueTestUtils.vueTestUtilsStrings.address */ Any => js.Array[
      DOMWrapper[
        /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementTagNameMap['a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'slot' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr'] */ js.Any
      ]
    ],
    findAllComponents: /* selector */ Any => Any,
    findAllDOMElements: /* selector */ String => js.Array[Element],
    findComponent: /* selector */ String => WrapperLike,
    get: /* selector */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.vueTestUtils.vueTestUtilsStrings.a, typings.vueTestUtils.vueTestUtilsStrings.abbr, typings.vueTestUtils.vueTestUtilsStrings.address */ Any => Omit[
      DOMWrapper[
        /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementTagNameMap['a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'slot' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr'] */ js.Any
      ], 
      exists
    ],
    getComponent: /* selector */ String => OmitdefaultexistsAttributes,
    getCurrentComponent: () => js.UndefOr[ComponentInternalInstance],
    getRootNodes: () => js.Array[VueNodeElement],
    html: /* options */ js.UndefOr[Raw] => String,
    isDisabled: () => Boolean,
    isVisible: () => Boolean,
    setChecked: Any,
    setSelected: Any,
    setValue: /* value */ js.UndefOr[Any] => js.Promise[Unit],
    text: () => String,
    trigger: (/* eventString */ DomEventNameWithModifier, /* options */ js.UndefOr[TriggerOptions]) => js.Promise[Unit],
    wrapperElement: VueNodeElement
  ): OmitDOMWrapperElementexisAttributes = {
    val __obj = js.Dynamic.literal(attributes = js.Any.fromFunction0(attributes), classes = js.Any.fromFunction0(classes), constructor = js.Any.fromFunction1(constructor), element = element.asInstanceOf[js.Any], find = js.Any.fromFunction1(find), findAll = js.Any.fromFunction1(findAll), findAllComponents = js.Any.fromFunction1(findAllComponents), findAllDOMElements = js.Any.fromFunction1(findAllDOMElements), findComponent = js.Any.fromFunction1(findComponent), get = js.Any.fromFunction1(get), getComponent = js.Any.fromFunction1(getComponent), getCurrentComponent = js.Any.fromFunction0(getCurrentComponent), getRootNodes = js.Any.fromFunction0(getRootNodes), html = js.Any.fromFunction1(html), isDisabled = js.Any.fromFunction0(isDisabled), isVisible = js.Any.fromFunction0(isVisible), setChecked = setChecked.asInstanceOf[js.Any], setSelected = setSelected.asInstanceOf[js.Any], setValue = js.Any.fromFunction1(setValue), text = js.Any.fromFunction0(text), trigger = js.Any.fromFunction2(trigger), wrapperElement = wrapperElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitDOMWrapperElementexisAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitDOMWrapperElementexisAttributes] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: () => StringDictionary[String]): Self = StObject.set(x, "attributes", js.Any.fromFunction0(value))
    
    inline def setClasses(value: () => js.Array[String]): Self = StObject.set(x, "classes", js.Any.fromFunction0(value))
    
    inline def setConstructor(value: /* element */ Element => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setElement(value: Node): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
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
    
    inline def setFindAllComponents(value: /* selector */ Any => Any): Self = StObject.set(x, "findAllComponents", js.Any.fromFunction1(value))
    
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
    
    inline def setGetComponent(value: /* selector */ String => OmitdefaultexistsAttributes): Self = StObject.set(x, "getComponent", js.Any.fromFunction1(value))
    
    inline def setGetCurrentComponent(value: () => js.UndefOr[ComponentInternalInstance]): Self = StObject.set(x, "getCurrentComponent", js.Any.fromFunction0(value))
    
    inline def setGetRootNodes(value: () => js.Array[VueNodeElement]): Self = StObject.set(x, "getRootNodes", js.Any.fromFunction0(value))
    
    inline def setHtml(value: /* options */ js.UndefOr[Raw] => String): Self = StObject.set(x, "html", js.Any.fromFunction1(value))
    
    inline def setIsDisabled(value: () => Boolean): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
    
    inline def setIsVisible(value: () => Boolean): Self = StObject.set(x, "isVisible", js.Any.fromFunction0(value))
    
    inline def setSetChecked(value: Any): Self = StObject.set(x, "setChecked", value.asInstanceOf[js.Any])
    
    inline def setSetSelected(value: Any): Self = StObject.set(x, "setSelected", value.asInstanceOf[js.Any])
    
    inline def setSetValue(value: /* value */ js.UndefOr[Any] => js.Promise[Unit]): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    inline def setText(value: () => String): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
    
    inline def setTrigger(
      value: (/* eventString */ DomEventNameWithModifier, /* options */ js.UndefOr[TriggerOptions]) => js.Promise[Unit]
    ): Self = StObject.set(x, "trigger", js.Any.fromFunction2(value))
    
    inline def setWrapperElement(value: VueNodeElement): Self = StObject.set(x, "wrapperElement", value.asInstanceOf[js.Any])
  }
}
