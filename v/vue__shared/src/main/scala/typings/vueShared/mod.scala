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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@vue/shared", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@vue/shared", "EMPTY_ARR")
  @js.native
  val EMPTY_ARR: js.Array[scala.Nothing] = js.native
  
  inline def NO(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("NO")().asInstanceOf[Boolean]
  
  inline def NOOP(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("NOOP")().asInstanceOf[Unit]
  
  @JSImport("@vue/shared", "babelParserDefaultPlugins")
  @js.native
  val babelParserDefaultPlugins: js.Tuple3[bigInt, optionalChaining, nullishCoalescingOperator] = js.native
  
  inline def camelize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def capitalize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("capitalize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def `def`(obj: js.Object, key: String, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("def")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def `def`(obj: js.Object, key: js.Symbol, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("def")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def escapeHtml(string: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeHtml")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def escapeHtmlComment(src: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeHtmlComment")(src.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def extend(target: js.Object, sources: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any], sources.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def extend[T, U](target: T, source: U): T & U = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & U]
  inline def extend[T_1, U_1, V](target: T_1, source1: U_1, source2: V): T_1 & U_1 & V = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any])).asInstanceOf[T_1 & U_1 & V]
  inline def extend[T_2, U_2, V_1, W](target: T_2, source1: U_2, source2: V_1, source3: W): T_2 & U_2 & V_1 & W = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any], source3.asInstanceOf[js.Any])).asInstanceOf[T_2 & U_2 & V_1 & W]
  
  inline def generateCodeFrame(source: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateCodeFrame")(source.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def generateCodeFrame(source: String, start: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCodeFrame")(source.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def generateCodeFrame(source: String, start: Double, end: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCodeFrame")(source.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def generateCodeFrame(source: String, start: Unit, end: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCodeFrame")(source.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getGlobalThis(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalThis")().asInstanceOf[js.Any]
  
  inline def hasChanged(value: js.Any, oldValue: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasChanged")(value.asInstanceOf[js.Any], oldValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hasOwn(`val`: js.Object, key: String): /* is never */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwn")(`val`.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[/* is never */ Boolean]
  inline def hasOwn(`val`: js.Object, key: js.Symbol): /* is never */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwn")(`val`.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[/* is never */ Boolean]
  
  inline def hyphenate(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hyphenate")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def invokeArrayFns(fns: js.Array[js.Function]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("invokeArrayFns")(fns.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def invokeArrayFns(fns: js.Array[js.Function], arg: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("invokeArrayFns")(fns.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isArray(arg: js.Any): /* is std.Array<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<any> */ Boolean]
  
  inline def isBooleanAttr(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBooleanAttr")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDate(`val`: js.Any): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]
  
  inline def isFunction(`val`: js.Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  inline def isGloballyWhitelisted(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGloballyWhitelisted")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isHTMLTag(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHTMLTag")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isIntegerKey(key: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIntegerKey")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isKnownAttr(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKnownAttr")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMap(`val`: js.Any): /* is std.Map<any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMap")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Map<any, any> */ Boolean]
  
  inline def isModelListener(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModelListener")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNoUnitNumericStyleProp(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNoUnitNumericStyleProp")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObject(`val`: js.Any): /* is std.Record<any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Record<any, any> */ Boolean]
  
  inline def isOn(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOn")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPlainObject(`val`: js.Any): /* is object */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is object */ Boolean]
  
  inline def isPromise[T](`val`: js.Any): /* is std.Promise<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Promise<T> */ Boolean]
  
  inline def isReservedProp(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReservedProp")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSSRSafeAttrName(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSSRSafeAttrName")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSVGTag(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSVGTag")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSet(`val`: js.Any): /* is std.Set<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSet")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Set<any> */ Boolean]
  
  inline def isSpecialBooleanAttr(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSpecialBooleanAttr")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isString(`val`: js.Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def isSymbol(`val`: js.Any): /* is symbol */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSymbol")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is symbol */ Boolean]
  
  inline def isVoidTag(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVoidTag")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def looseEqual(a: js.Any, b: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("looseEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def looseIndexOf(arr: js.Array[js.Any], `val`: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("looseIndexOf")(arr.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def makeMap(str: String): js.Function1[/* key */ String, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeMap")(str.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* key */ String, Boolean]]
  inline def makeMap(str: String, expectsLowerCase: Boolean): js.Function1[/* key */ String, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeMap")(str.asInstanceOf[js.Any], expectsLowerCase.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* key */ String, Boolean]]
  
  inline def normalizeClass(value: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeClass")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def normalizeStyle(value: js.Any): js.UndefOr[NormalizedStyle] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeStyle")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[NormalizedStyle]]
  
  inline def objectToString(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("objectToString")().asInstanceOf[String]
  
  inline def parseStringStyle(cssText: String): NormalizedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("parseStringStyle")(cssText.asInstanceOf[js.Any]).asInstanceOf[NormalizedStyle]
  
  @JSImport("@vue/shared", "propsToAttrMap")
  @js.native
  val propsToAttrMap: Record[String, js.UndefOr[String]] = js.native
  
  inline def remove[T](arr: js.Array[T], el: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(arr.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def stringifyStyle(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyStyle")().asInstanceOf[String]
  inline def stringifyStyle(styles: NormalizedStyle): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyStyle")(styles.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toDisplayString(`val`: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toDisplayString")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toHandlerKey(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHandlerKey")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toNumber(`val`: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toNumber")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def toRawType(value: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toRawType")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toTypeString(value: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toTypeString")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
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
    
    inline def BAIL: `-2` = -2.asInstanceOf[`-2`]
    
    inline def CLASS: `2` = 2.asInstanceOf[`2`]
    
    inline def DYNAMIC_SLOTS: `1024` = 1024.asInstanceOf[`1024`]
    
    inline def FULL_PROPS: `16` = 16.asInstanceOf[`16`]
    
    inline def HOISTED: `-1` = -1.asInstanceOf[`-1`]
    
    inline def HYDRATE_EVENTS: `32` = 32.asInstanceOf[`32`]
    
    inline def KEYED_FRAGMENT: `128` = 128.asInstanceOf[`128`]
    
    inline def NEED_PATCH: `512` = 512.asInstanceOf[`512`]
    
    inline def PROPS: `8` = 8.asInstanceOf[`8`]
    
    inline def STABLE_FRAGMENT: `64` = 64.asInstanceOf[`64`]
    
    inline def STYLE: `4` = 4.asInstanceOf[`4`]
    
    inline def TEXT: `1` = 1.asInstanceOf[`1`]
    
    inline def UNKEYED_FRAGMENT: `256` = 256.asInstanceOf[`256`]
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
    
    inline def ARRAY_CHILDREN: `16` = 16.asInstanceOf[`16`]
    
    inline def COMPONENT: `6` = 6.asInstanceOf[`6`]
    
    inline def COMPONENT_KEPT_ALIVE: `512` = 512.asInstanceOf[`512`]
    
    inline def COMPONENT_SHOULD_KEEP_ALIVE: `256` = 256.asInstanceOf[`256`]
    
    inline def ELEMENT: `1` = 1.asInstanceOf[`1`]
    
    inline def FUNCTIONAL_COMPONENT: `2` = 2.asInstanceOf[`2`]
    
    inline def SLOTS_CHILDREN: `32` = 32.asInstanceOf[`32`]
    
    inline def STATEFUL_COMPONENT: `4` = 4.asInstanceOf[`4`]
    
    inline def SUSPENSE: `128` = 128.asInstanceOf[`128`]
    
    inline def TELEPORT: `64` = 64.asInstanceOf[`64`]
    
    inline def TEXT_CHILDREN: `8` = 8.asInstanceOf[`8`]
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
    inline def DYNAMIC: `2` = 2.asInstanceOf[`2`]
    
    /**
      * `<slot/>` being forwarded into a child component. Whether the parent needs
      * to update the child is dependent on what kind of slots the parent itself
      * received. This has to be refined at runtime, when the child's vnode
      * is being created (in `normalizeChildren`)
      */
    inline def FORWARDED: `3` = 3.asInstanceOf[`3`]
    
    /**
      * Stable slots that only reference slot props or context state. The slot
      * can fully capture its own dependencies so when passed down the parent won't
      * need to force the child to update.
      */
    inline def STABLE: `1` = 1.asInstanceOf[`1`]
  }
}
