package typings.vueShared

import typings.std.Record
import typings.vueShared.vueSharedNumbers.`-1`
import typings.vueShared.vueSharedNumbers.`-2`
import typings.vueShared.vueSharedNumbers.`1024`
import typings.vueShared.vueSharedNumbers.`128`
import typings.vueShared.vueSharedNumbers.`16`
import typings.vueShared.vueSharedNumbers.`1`
import typings.vueShared.vueSharedNumbers.`256`
import typings.vueShared.vueSharedNumbers.`2`
import typings.vueShared.vueSharedNumbers.`32`
import typings.vueShared.vueSharedNumbers.`3`
import typings.vueShared.vueSharedNumbers.`4`
import typings.vueShared.vueSharedNumbers.`512`
import typings.vueShared.vueSharedNumbers.`64`
import typings.vueShared.vueSharedNumbers.`6`
import typings.vueShared.vueSharedNumbers.`8`
import typings.vueShared.vueSharedStrings.bigInt
import typings.vueShared.vueSharedStrings.nullishCoalescingOperator
import typings.vueShared.vueSharedStrings.optionalChaining
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@vue/shared", "EMPTY_ARR")
  @js.native
  val EMPTY_ARR: js.Array[scala.Nothing] = js.native
  
  @JSImport("@vue/shared", "NO")
  @js.native
  def NO(): Boolean = js.native
  
  @JSImport("@vue/shared", "NOOP")
  @js.native
  def NOOP(): Unit = js.native
  
  @JSImport("@vue/shared", "babelParserDefaultPlugins")
  @js.native
  val babelParserDefaultPlugins: js.Tuple3[bigInt, optionalChaining, nullishCoalescingOperator] = js.native
  
  @JSImport("@vue/shared", "camelize")
  @js.native
  def camelize(str: String): String = js.native
  
  @JSImport("@vue/shared", "capitalize")
  @js.native
  def capitalize(str: String): String = js.native
  
  @JSImport("@vue/shared", "escapeHtml")
  @js.native
  def escapeHtml(string: js.Any): String = js.native
  
  @JSImport("@vue/shared", "escapeHtmlComment")
  @js.native
  def escapeHtmlComment(src: String): String = js.native
  
  @JSImport("@vue/shared", "extend")
  @js.native
  def extend(target: js.Object, sources: js.Any*): js.Any = js.native
  @JSImport("@vue/shared", "extend")
  @js.native
  def extend[T, U](target: T, source: U): T with U = js.native
  @JSImport("@vue/shared", "extend")
  @js.native
  def extend[T_1, U_1, V](target: T_1, source1: U_1, source2: V): T_1 with U_1 with V = js.native
  @JSImport("@vue/shared", "extend")
  @js.native
  def extend[T_2, U_2, V_1, W](target: T_2, source1: U_2, source2: V_1, source3: W): T_2 with U_2 with V_1 with W = js.native
  
  @JSImport("@vue/shared", "generateCodeFrame")
  @js.native
  def generateCodeFrame(source: String): String = js.native
  @JSImport("@vue/shared", "generateCodeFrame")
  @js.native
  def generateCodeFrame(source: String, start: js.UndefOr[scala.Nothing], end: Double): String = js.native
  @JSImport("@vue/shared", "generateCodeFrame")
  @js.native
  def generateCodeFrame(source: String, start: Double): String = js.native
  @JSImport("@vue/shared", "generateCodeFrame")
  @js.native
  def generateCodeFrame(source: String, start: Double, end: Double): String = js.native
  
  @JSImport("@vue/shared", "getGlobalThis")
  @js.native
  def getGlobalThis(): js.Any = js.native
  
  @JSImport("@vue/shared", "hasChanged")
  @js.native
  def hasChanged(value: js.Any, oldValue: js.Any): Boolean = js.native
  
  @JSImport("@vue/shared", "hasOwn")
  @js.native
  def hasOwn(`val`: js.Object, key: String): /* is never */ Boolean = js.native
  @JSImport("@vue/shared", "hasOwn")
  @js.native
  def hasOwn(`val`: js.Object, key: js.Symbol): /* is never */ Boolean = js.native
  
  @JSImport("@vue/shared", "hyphenate")
  @js.native
  def hyphenate(str: String): String = js.native
  
  @JSImport("@vue/shared", "invokeArrayFns")
  @js.native
  def invokeArrayFns(fns: js.Array[js.Function]): Unit = js.native
  @JSImport("@vue/shared", "invokeArrayFns")
  @js.native
  def invokeArrayFns(fns: js.Array[js.Function], arg: js.Any): Unit = js.native
  
  @JSImport("@vue/shared", "isArray")
  @js.native
  def isArray(arg: js.Any): /* is std.Array<any> */ Boolean = js.native
  
  @JSImport("@vue/shared", "isBooleanAttr")
  @js.native
  def isBooleanAttr(key: String): Boolean = js.native
  
  @JSImport("@vue/shared", "isDate")
  @js.native
  def isDate(`val`: js.Any): /* is std.Date */ Boolean = js.native
  
  @JSImport("@vue/shared", "isFunction")
  @js.native
  def isFunction(`val`: js.Any): /* is std.Function */ Boolean = js.native
  
  @JSImport("@vue/shared", "isGloballyWhitelisted")
  @js.native
  def isGloballyWhitelisted(key: String): Boolean = js.native
  
  @JSImport("@vue/shared", "isHTMLTag")
  @js.native
  def isHTMLTag(key: String): Boolean = js.native
  
  @JSImport("@vue/shared", "isIntegerKey")
  @js.native
  def isIntegerKey(key: js.Any): Boolean = js.native
  
  @JSImport("@vue/shared", "isKnownAttr")
  @js.native
  def isKnownAttr(key: String): Boolean = js.native
  
  @JSImport("@vue/shared", "isMap")
  @js.native
  def isMap(`val`: js.Any): /* is std.Map<any, any> */ Boolean = js.native
  
  @JSImport("@vue/shared", "isModelListener")
  @js.native
  def isModelListener(key: String): Boolean = js.native
  
  @JSImport("@vue/shared", "isNoUnitNumericStyleProp")
  @js.native
  def isNoUnitNumericStyleProp(key: String): Boolean = js.native
  
  @JSImport("@vue/shared", "isObject")
  @js.native
  def isObject(`val`: js.Any): /* is std.Record<any, any> */ Boolean = js.native
  
  @JSImport("@vue/shared", "isOn")
  @js.native
  def isOn(key: String): Boolean = js.native
  
  @JSImport("@vue/shared", "isPlainObject")
  @js.native
  def isPlainObject(`val`: js.Any): /* is object */ Boolean = js.native
  
  @JSImport("@vue/shared", "isPromise")
  @js.native
  def isPromise[T](`val`: js.Any): /* is std.Promise<T> */ Boolean = js.native
  
  @JSImport("@vue/shared", "isReservedProp")
  @js.native
  def isReservedProp(key: String): Boolean = js.native
  
  @JSImport("@vue/shared", "isSSRSafeAttrName")
  @js.native
  def isSSRSafeAttrName(name: String): Boolean = js.native
  
  @JSImport("@vue/shared", "isSVGTag")
  @js.native
  def isSVGTag(key: String): Boolean = js.native
  
  @JSImport("@vue/shared", "isSet")
  @js.native
  def isSet(`val`: js.Any): /* is std.Set<any> */ Boolean = js.native
  
  @JSImport("@vue/shared", "isSpecialBooleanAttr")
  @js.native
  def isSpecialBooleanAttr(key: String): Boolean = js.native
  
  @JSImport("@vue/shared", "isString")
  @js.native
  def isString(`val`: js.Any): /* is string */ Boolean = js.native
  
  @JSImport("@vue/shared", "isSymbol")
  @js.native
  def isSymbol(`val`: js.Any): /* is symbol */ Boolean = js.native
  
  @JSImport("@vue/shared", "isVoidTag")
  @js.native
  def isVoidTag(key: String): Boolean = js.native
  
  @JSImport("@vue/shared", "looseEqual")
  @js.native
  def looseEqual(a: js.Any, b: js.Any): Boolean = js.native
  
  @JSImport("@vue/shared", "looseIndexOf")
  @js.native
  def looseIndexOf(arr: js.Array[_], `val`: js.Any): Double = js.native
  
  @JSImport("@vue/shared", "makeMap")
  @js.native
  def makeMap(str: String): js.Function1[/* key */ String, Boolean] = js.native
  @JSImport("@vue/shared", "makeMap")
  @js.native
  def makeMap(str: String, expectsLowerCase: Boolean): js.Function1[/* key */ String, Boolean] = js.native
  
  @JSImport("@vue/shared", "normalizeClass")
  @js.native
  def normalizeClass(value: js.Any): String = js.native
  
  @JSImport("@vue/shared", "normalizeStyle")
  @js.native
  def normalizeStyle(value: js.Any): js.UndefOr[NormalizedStyle] = js.native
  
  @JSImport("@vue/shared", "objectToString")
  @js.native
  def objectToString(): String = js.native
  
  @JSImport("@vue/shared", "parseStringStyle")
  @js.native
  def parseStringStyle(cssText: String): NormalizedStyle = js.native
  
  @JSImport("@vue/shared", "propsToAttrMap")
  @js.native
  val propsToAttrMap: Record[String, js.UndefOr[String]] = js.native
  
  @JSImport("@vue/shared", "remove")
  @js.native
  def remove[T](arr: js.Array[T], el: T): Unit = js.native
  
  @JSImport("@vue/shared", "stringifyStyle")
  @js.native
  def stringifyStyle(): String = js.native
  @JSImport("@vue/shared", "stringifyStyle")
  @js.native
  def stringifyStyle(styles: NormalizedStyle): String = js.native
  
  @JSImport("@vue/shared", "toDisplayString")
  @js.native
  def toDisplayString(`val`: js.Any): String = js.native
  
  @JSImport("@vue/shared", "toHandlerKey")
  @js.native
  def toHandlerKey(str: String): String = js.native
  
  @JSImport("@vue/shared", "toNumber")
  @js.native
  def toNumber(`val`: js.Any): js.Any = js.native
  
  @JSImport("@vue/shared", "toRawType")
  @js.native
  def toRawType(value: js.Any): String = js.native
  
  @JSImport("@vue/shared", "toTypeString")
  @js.native
  def toTypeString(value: js.Any): String = js.native
  
  type NormalizedStyle = Record[String, String | Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.vueShared.vueSharedNumbers.`1`
    - typings.vueShared.vueSharedNumbers.`2`
    - typings.vueShared.vueSharedNumbers.`4`
    - typings.vueShared.vueSharedNumbers.`8`
    - typings.vueShared.vueSharedNumbers.`16`
    - typings.vueShared.vueSharedNumbers.`32`
    - typings.vueShared.vueSharedNumbers.`64`
    - typings.vueShared.vueSharedNumbers.`128`
    - typings.vueShared.vueSharedNumbers.`256`
    - typings.vueShared.vueSharedNumbers.`512`
    - typings.vueShared.vueSharedNumbers.`1024`
    - typings.vueShared.vueSharedNumbers.`-1`
    - typings.vueShared.vueSharedNumbers.`-2`
  */
  trait PatchFlags extends StObject
  object PatchFlags {
    
    @scala.inline
    def BAIL: `-2` = -2.asInstanceOf[`-2`]
    
    @scala.inline
    def CLASS: `2` = 2.asInstanceOf[`2`]
    
    @scala.inline
    def DYNAMIC_SLOTS: `1024` = 1024.asInstanceOf[`1024`]
    
    @scala.inline
    def FULL_PROPS: `16` = 16.asInstanceOf[`16`]
    
    @scala.inline
    def HOISTED: `-1` = -1.asInstanceOf[`-1`]
    
    @scala.inline
    def HYDRATE_EVENTS: `32` = 32.asInstanceOf[`32`]
    
    @scala.inline
    def KEYED_FRAGMENT: `128` = 128.asInstanceOf[`128`]
    
    @scala.inline
    def NEED_PATCH: `512` = 512.asInstanceOf[`512`]
    
    @scala.inline
    def PROPS: `8` = 8.asInstanceOf[`8`]
    
    @scala.inline
    def STABLE_FRAGMENT: `64` = 64.asInstanceOf[`64`]
    
    @scala.inline
    def STYLE: `4` = 4.asInstanceOf[`4`]
    
    @scala.inline
    def TEXT: `1` = 1.asInstanceOf[`1`]
    
    @scala.inline
    def UNKEYED_FRAGMENT: `256` = 256.asInstanceOf[`256`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vueShared.vueSharedNumbers.`1`
    - typings.vueShared.vueSharedNumbers.`2`
    - typings.vueShared.vueSharedNumbers.`4`
    - typings.vueShared.vueSharedNumbers.`8`
    - typings.vueShared.vueSharedNumbers.`16`
    - typings.vueShared.vueSharedNumbers.`32`
    - typings.vueShared.vueSharedNumbers.`64`
    - typings.vueShared.vueSharedNumbers.`128`
    - typings.vueShared.vueSharedNumbers.`256`
    - typings.vueShared.vueSharedNumbers.`512`
    - typings.vueShared.vueSharedNumbers.`6`
  */
  trait ShapeFlags extends StObject
  object ShapeFlags {
    
    @scala.inline
    def ARRAY_CHILDREN: `16` = 16.asInstanceOf[`16`]
    
    @scala.inline
    def COMPONENT: `6` = 6.asInstanceOf[`6`]
    
    @scala.inline
    def COMPONENT_KEPT_ALIVE: `512` = 512.asInstanceOf[`512`]
    
    @scala.inline
    def COMPONENT_SHOULD_KEEP_ALIVE: `256` = 256.asInstanceOf[`256`]
    
    @scala.inline
    def ELEMENT: `1` = 1.asInstanceOf[`1`]
    
    @scala.inline
    def FUNCTIONAL_COMPONENT: `2` = 2.asInstanceOf[`2`]
    
    @scala.inline
    def SLOTS_CHILDREN: `32` = 32.asInstanceOf[`32`]
    
    @scala.inline
    def STATEFUL_COMPONENT: `4` = 4.asInstanceOf[`4`]
    
    @scala.inline
    def SUSPENSE: `128` = 128.asInstanceOf[`128`]
    
    @scala.inline
    def TELEPORT: `64` = 64.asInstanceOf[`64`]
    
    @scala.inline
    def TEXT_CHILDREN: `8` = 8.asInstanceOf[`8`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vueShared.vueSharedNumbers.`1`
    - typings.vueShared.vueSharedNumbers.`2`
    - typings.vueShared.vueSharedNumbers.`3`
  */
  trait SlotFlags extends StObject
  object SlotFlags {
    
    /**
      * Slots that reference scope variables (v-for or an outer slot prop), or
      * has conditional structure (v-if, v-for). The parent will need to force
      * the child to update because the slot does not fully capture its dependencies.
      */
    @scala.inline
    def DYNAMIC: `2` = 2.asInstanceOf[`2`]
    
    /**
      * `<slot/>` being forwarded into a child component. Whether the parent needs
      * to update the child is dependent on what kind of slots the parent itself
      * received. This has to be refined at runtime, when the child's vnode
      * is being created (in `normalizeChildren`)
      */
    @scala.inline
    def FORWARDED: `3` = 3.asInstanceOf[`3`]
    
    /**
      * Stable slots that only reference slot props or context state. The slot
      * can fully capture its own dependencies so when passed down the parent won't
      * need to force the child to update.
      */
    @scala.inline
    def STABLE: `1` = 1.asInstanceOf[`1`]
  }
  
  @JSImport("@vue/shared", "def")
  @js.native
  def `def`(obj: js.Object, key: String, value: js.Any): Unit = js.native
  @JSImport("@vue/shared", "def")
  @js.native
  def `def`(obj: js.Object, key: js.Symbol, value: js.Any): Unit = js.native
}
