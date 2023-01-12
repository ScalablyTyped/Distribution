package typings.vueTestUtils.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.Node
import typings.std.Omit
import typings.vueTestUtils.distConstantsDomEventsMod.DomEventNameWithModifier
import typings.vueTestUtils.distCreateDomEventMod.TriggerOptions
import typings.vueTestUtils.distDomWrapperMod.DOMWrapper
import typings.vueTestUtils.vueTestUtilsStrings.exists
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@vue/test-utils.@vue/test-utils/dist/interfaces/wrapperLike.WrapperLike, 'exists'> */
trait OmitWrapperLikeexistsAttributes extends StObject {
  
  def attributes(): StringDictionary[String]
  @JSName("attributes")
  var attributes_Original: js.Function0[StringDictionary[String]]
  
  def classes(): js.Array[String]
  @JSName("classes")
  var classes_Original: js.Function0[js.Array[String]]
  
  var element: Node
  
  def find[K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.vueTestUtils.vueTestUtilsStrings.a, typings.vueTestUtils.vueTestUtilsStrings.abbr, typings.vueTestUtils.vueTestUtilsStrings.address */ Any */](selector: K): DOMWrapper[
    /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementTagNameMap[K] */ js.Any
  ]
  
  def findAll[K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.vueTestUtils.vueTestUtilsStrings.a, typings.vueTestUtils.vueTestUtilsStrings.abbr, typings.vueTestUtils.vueTestUtilsStrings.address */ Any */](selector: K): js.Array[
    DOMWrapper[
      /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementTagNameMap[K] */ js.Any
    ]
  ]
  
  def findAllComponents[T /* <: scala.Nothing */](selector: String): js.Array[this.type]
  @JSName("findAllComponents")
  var findAllComponents_Original: js.Function1[/* selector */ String, js.Array[this.type]]
  
  @JSName("findAll")
  var findAll_Original: js.Function1[
    /* selector */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.vueTestUtils.vueTestUtilsStrings.a, typings.vueTestUtils.vueTestUtilsStrings.abbr, typings.vueTestUtils.vueTestUtilsStrings.address */ Any, 
    js.Array[
      DOMWrapper[
        /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementTagNameMap['a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'slot' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr'] */ js.Any
      ]
    ]
  ]
  
  def findComponent[T /* <: scala.Nothing */](selector: String): this.type
  @JSName("findComponent")
  var findComponent_Original: js.Function1[/* selector */ String, this.type]
  
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
  
  def getComponent[T /* <: scala.Nothing */](selector: String): Omit[this.type, exists]
  @JSName("getComponent")
  var getComponent_Original: js.Function1[/* selector */ String, Omit[this.type, exists]]
  
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
  @JSName("html")
  var html_Original: js.Function0[String]
  
  def isVisible(): Boolean
  @JSName("isVisible")
  var isVisible_Original: js.Function0[Boolean]
  
  def setValue(value: Any): js.Promise[Unit]
  @JSName("setValue")
  var setValue_Original: js.Function1[/* value */ Any, js.Promise[Unit]]
  
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
}
object OmitWrapperLikeexistsAttributes {
  
  inline def apply(
    attributes: () => StringDictionary[String],
    classes: () => js.Array[String],
    element: Node,
    find: /* selector */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.vueTestUtils.vueTestUtilsStrings.a, typings.vueTestUtils.vueTestUtilsStrings.abbr, typings.vueTestUtils.vueTestUtilsStrings.address */ Any => DOMWrapper[
      /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementTagNameMap['a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'slot' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr'] */ js.Any
    ],
    findAll: /* selector */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.vueTestUtils.vueTestUtilsStrings.a, typings.vueTestUtils.vueTestUtilsStrings.abbr, typings.vueTestUtils.vueTestUtilsStrings.address */ Any => js.Array[
      DOMWrapper[
        /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementTagNameMap['a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'slot' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr'] */ js.Any
      ]
    ],
    findAllComponents: /* selector */ String => js.Array[OmitWrapperLikeexistsAttributes],
    findComponent: /* selector */ String => OmitWrapperLikeexistsAttributes,
    get: /* selector */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.vueTestUtils.vueTestUtilsStrings.a, typings.vueTestUtils.vueTestUtilsStrings.abbr, typings.vueTestUtils.vueTestUtilsStrings.address */ Any => Omit[
      DOMWrapper[
        /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementTagNameMap['a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'slot' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr'] */ js.Any
      ], 
      exists
    ],
    getComponent: /* selector */ String => Omit[OmitWrapperLikeexistsAttributes, exists],
    html: () => String,
    isVisible: () => Boolean,
    setValue: /* value */ Any => js.Promise[Unit],
    text: () => String,
    trigger: (/* eventString */ DomEventNameWithModifier, /* options */ js.UndefOr[TriggerOptions]) => js.Promise[Unit]
  ): OmitWrapperLikeexistsAttributes = {
    val __obj = js.Dynamic.literal(attributes = js.Any.fromFunction0(attributes), classes = js.Any.fromFunction0(classes), element = element.asInstanceOf[js.Any], find = js.Any.fromFunction1(find), findAll = js.Any.fromFunction1(findAll), findAllComponents = js.Any.fromFunction1(findAllComponents), findComponent = js.Any.fromFunction1(findComponent), get = js.Any.fromFunction1(get), getComponent = js.Any.fromFunction1(getComponent), html = js.Any.fromFunction0(html), isVisible = js.Any.fromFunction0(isVisible), setValue = js.Any.fromFunction1(setValue), text = js.Any.fromFunction0(text), trigger = js.Any.fromFunction2(trigger))
    __obj.asInstanceOf[OmitWrapperLikeexistsAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitWrapperLikeexistsAttributes] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: () => StringDictionary[String]): Self = StObject.set(x, "attributes", js.Any.fromFunction0(value))
    
    inline def setClasses(value: () => js.Array[String]): Self = StObject.set(x, "classes", js.Any.fromFunction0(value))
    
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
    
    inline def setFindAllComponents(value: /* selector */ String => js.Array[OmitWrapperLikeexistsAttributes]): Self = StObject.set(x, "findAllComponents", js.Any.fromFunction1(value))
    
    inline def setFindComponent(value: /* selector */ String => OmitWrapperLikeexistsAttributes): Self = StObject.set(x, "findComponent", js.Any.fromFunction1(value))
    
    inline def setGet(
      value: /* selector */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typings.vueTestUtils.vueTestUtilsStrings.a, typings.vueTestUtils.vueTestUtilsStrings.abbr, typings.vueTestUtils.vueTestUtilsStrings.address */ Any => Omit[
          DOMWrapper[
            /* import warning: importer.ImportType#apply Failed type conversion: std.HTMLElementTagNameMap['a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'slot' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr'] */ js.Any
          ], 
          exists
        ]
    ): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetComponent(value: /* selector */ String => Omit[OmitWrapperLikeexistsAttributes, exists]): Self = StObject.set(x, "getComponent", js.Any.fromFunction1(value))
    
    inline def setHtml(value: () => String): Self = StObject.set(x, "html", js.Any.fromFunction0(value))
    
    inline def setIsVisible(value: () => Boolean): Self = StObject.set(x, "isVisible", js.Any.fromFunction0(value))
    
    inline def setSetValue(value: /* value */ Any => js.Promise[Unit]): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    inline def setText(value: () => String): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
    
    inline def setTrigger(
      value: (/* eventString */ DomEventNameWithModifier, /* options */ js.UndefOr[TriggerOptions]) => js.Promise[Unit]
    ): Self = StObject.set(x, "trigger", js.Any.fromFunction2(value))
  }
}
