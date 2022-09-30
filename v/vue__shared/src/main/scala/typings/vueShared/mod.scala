package typings.vueShared

import org.scalablytyped.runtime.TopLevel
import typings.std.Record
import typings.vueShared.vueSharedInts.`-1`
import typings.vueShared.vueSharedInts.`-2`
import typings.vueShared.vueSharedInts.`1024`
import typings.vueShared.vueSharedInts.`128`
import typings.vueShared.vueSharedInts.`16`
import typings.vueShared.vueSharedInts.`1`
import typings.vueShared.vueSharedInts.`2048`
import typings.vueShared.vueSharedInts.`256`
import typings.vueShared.vueSharedInts.`2`
import typings.vueShared.vueSharedInts.`32`
import typings.vueShared.vueSharedInts.`3`
import typings.vueShared.vueSharedInts.`4`
import typings.vueShared.vueSharedInts.`512`
import typings.vueShared.vueSharedInts.`64`
import typings.vueShared.vueSharedInts.`6`
import typings.vueShared.vueSharedInts.`8`
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
  
  inline def camelize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def capitalize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("capitalize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def `def`(obj: js.Object, key: String, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("def")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def `def`(obj: js.Object, key: js.Symbol, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("def")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def escapeHtml(string: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeHtml")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def escapeHtmlComment(src: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeHtmlComment")(src.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def extend(target: js.Object, sources: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(scala.List(target.asInstanceOf[js.Any]).`++`(sources.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  inline def extend[T /* <: js.Object */, U](target: T, source: U): T & U = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & U]
  inline def extend[T_1 /* <: js.Object */, U_1, V](target: T_1, source1: U_1, source2: V): T_1 & U_1 & V = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any])).asInstanceOf[T_1 & U_1 & V]
  inline def extend[T_2 /* <: js.Object */, U_2, V_1, W](target: T_2, source1: U_2, source2: V_1, source3: W): T_2 & U_2 & V_1 & W = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any], source3.asInstanceOf[js.Any])).asInstanceOf[T_2 & U_2 & V_1 & W]
  
  inline def genPropsAccessExp(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("genPropsAccessExp")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def generateCodeFrame(source: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateCodeFrame")(source.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def generateCodeFrame(source: String, start: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCodeFrame")(source.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def generateCodeFrame(source: String, start: Double, end: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCodeFrame")(source.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def generateCodeFrame(source: String, start: Unit, end: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCodeFrame")(source.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getGlobalThis(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalThis")().asInstanceOf[Any]
  
  inline def hasChanged(value: Any, oldValue: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasChanged")(value.asInstanceOf[js.Any], oldValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hasOwn(`val`: js.Object, key: String): /* is never */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwn")(`val`.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[/* is never */ Boolean]
  inline def hasOwn(`val`: js.Object, key: js.Symbol): /* is never */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwn")(`val`.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[/* is never */ Boolean]
  
  inline def hyphenate(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hyphenate")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def includeBooleanAttr(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("includeBooleanAttr")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def invokeArrayFns(fns: js.Array[js.Function]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("invokeArrayFns")(fns.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def invokeArrayFns(fns: js.Array[js.Function], arg: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("invokeArrayFns")(fns.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isArray(arg: Any): /* is std.Array<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<any> */ Boolean]
  
  inline def isBooleanAttr(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBooleanAttr")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBuiltInDirective(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBuiltInDirective")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDate(`val`: Any): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]
  
  inline def isFunction(`val`: Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  inline def isGloballyWhitelisted(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGloballyWhitelisted")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isHTMLTag(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHTMLTag")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isIntegerKey(key: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIntegerKey")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isKnownHtmlAttr(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKnownHtmlAttr")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isKnownSvgAttr(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKnownSvgAttr")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMap(`val`: Any): /* is std.Map<any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMap")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Map<any, any> */ Boolean]
  
  inline def isModelListener(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModelListener")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNoUnitNumericStyleProp(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNoUnitNumericStyleProp")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObject(`val`: Any): /* is std.Record<any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Record<any, any> */ Boolean]
  
  inline def isOn(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOn")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPlainObject(`val`: Any): /* is object */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is object */ Boolean]
  
  inline def isPromise[T](`val`: Any): /* is std.Promise<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Promise<T> */ Boolean]
  
  inline def isReservedProp(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReservedProp")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSSRSafeAttrName(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSSRSafeAttrName")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSVGTag(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSVGTag")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSet(`val`: Any): /* is std.Set<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSet")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Set<any> */ Boolean]
  
  inline def isSpecialBooleanAttr(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSpecialBooleanAttr")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isString(`val`: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def isSymbol(`val`: Any): /* is symbol */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSymbol")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is symbol */ Boolean]
  
  inline def isVoidTag(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVoidTag")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def looseEqual(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("looseEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def looseIndexOf(arr: js.Array[Any], `val`: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("looseIndexOf")(arr.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def makeMap(str: String): js.Function1[/* key */ String, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeMap")(str.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* key */ String, Boolean]]
  inline def makeMap(str: String, expectsLowerCase: Boolean): js.Function1[/* key */ String, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeMap")(str.asInstanceOf[js.Any], expectsLowerCase.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* key */ String, Boolean]]
  
  inline def normalizeClass(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeClass")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def normalizeProps(): (Record[String, Any]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeProps")().asInstanceOf[(Record[String, Any]) | Null]
  inline def normalizeProps(props: Record[String, Any]): (Record[String, Any]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeProps")(props.asInstanceOf[js.Any]).asInstanceOf[(Record[String, Any]) | Null]
  
  inline def normalizeStyle(value: Any): js.UndefOr[NormalizedStyle | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeStyle")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[NormalizedStyle | String]]
  
  inline def objectToString(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("objectToString")().asInstanceOf[String]
  
  inline def parseStringStyle(cssText: String): NormalizedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("parseStringStyle")(cssText.asInstanceOf[js.Any]).asInstanceOf[NormalizedStyle]
  
  @JSImport("@vue/shared", "propsToAttrMap")
  @js.native
  val propsToAttrMap: Record[String, js.UndefOr[String]] = js.native
  
  inline def remove[T](arr: js.Array[T], el: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(arr.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object slotFlagsText {
    
    @JSImport("@vue/shared", "slotFlagsText.1")
    @js.native
    val `1`: String = js.native
    
    @JSImport("@vue/shared", "slotFlagsText.2")
    @js.native
    val `2`: String = js.native
    
    @JSImport("@vue/shared", "slotFlagsText.3")
    @js.native
    val `3`: String = js.native
  }
  
  inline def stringifyStyle(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyStyle")().asInstanceOf[String]
  inline def stringifyStyle(styles: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyStyle")(styles.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringifyStyle(styles: NormalizedStyle): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyStyle")(styles.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toDisplayString(`val`: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toDisplayString")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toHandlerKey(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHandlerKey")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toNumber(`val`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toNumber")(`val`.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def toRawType(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toRawType")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toTypeString(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toTypeString")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type IfAny[T, Y, N] = N | Y
  
  type LooseRequired[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string & keyof T ]: T[P]}
    */ typings.vueShared.vueSharedStrings.LooseRequired & TopLevel[T]
  
  type NormalizedStyle = Record[String, String | Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.vueShared.vueSharedInts.`1`
    - typings.vueShared.vueSharedInts.`2`
    - typings.vueShared.vueSharedInts.`4`
    - typings.vueShared.vueSharedInts.`8`
    - typings.vueShared.vueSharedInts.`16`
    - typings.vueShared.vueSharedInts.`32`
    - typings.vueShared.vueSharedInts.`64`
    - typings.vueShared.vueSharedInts.`128`
    - typings.vueShared.vueSharedInts.`256`
    - typings.vueShared.vueSharedInts.`512`
    - typings.vueShared.vueSharedInts.`1024`
    - typings.vueShared.vueSharedInts.`2048`
    - typings.vueShared.vueSharedInts.`-1`
    - typings.vueShared.vueSharedInts.`-2`
  */
  trait PatchFlags extends StObject
  object PatchFlags {
    
    /**
      * A special flag that indicates that the diffing algorithm should bail out
      * of optimized mode. For example, on block fragments created by renderSlot()
      * when encountering non-compiler generated slots (i.e. manually written
      * render functions, which should always be fully diffed)
      * OR manually cloneVNodes
      */
    inline def BAIL: `-2` = -2.asInstanceOf[`-2`]
    
    /**
      * Indicates an element with dynamic class binding.
      */
    inline def CLASS: `2` = 2.asInstanceOf[`2`]
    
    /**
      * Indicates a fragment that was created only because the user has placed
      * comments at the root level of a template. This is a dev-only flag since
      * comments are stripped in production.
      */
    inline def DEV_ROOT_FRAGMENT: `2048` = 2048.asInstanceOf[`2048`]
    
    /**
      * Indicates a component with dynamic slots (e.g. slot that references a v-for
      * iterated value, or dynamic slot names).
      * Components with this flag are always force updated.
      */
    inline def DYNAMIC_SLOTS: `1024` = 1024.asInstanceOf[`1024`]
    
    /**
      * Indicates an element with props with dynamic keys. When keys change, a full
      * diff is always needed to remove the old key. This flag is mutually
      * exclusive with CLASS, STYLE and PROPS.
      */
    inline def FULL_PROPS: `16` = 16.asInstanceOf[`16`]
    
    /**
      * SPECIAL FLAGS -------------------------------------------------------------
      * Special flags are negative integers. They are never matched against using
      * bitwise operators (bitwise matching should only happen in branches where
      * patchFlag > 0), and are mutually exclusive. When checking for a special
      * flag, simply check patchFlag === FLAG.
      */
    /**
      * Indicates a hoisted static vnode. This is a hint for hydration to skip
      * the entire sub tree since static content never needs to be updated.
      */
    inline def HOISTED: `-1` = -1.asInstanceOf[`-1`]
    
    /**
      * Indicates an element with event listeners (which need to be attached
      * during hydration)
      */
    inline def HYDRATE_EVENTS: `32` = 32.asInstanceOf[`32`]
    
    /**
      * Indicates a fragment with keyed or partially keyed children
      */
    inline def KEYED_FRAGMENT: `128` = 128.asInstanceOf[`128`]
    
    /**
      * Indicates an element that only needs non-props patching, e.g. ref or
      * directives (onVnodeXXX hooks). since every patched vnode checks for refs
      * and onVnodeXXX hooks, it simply marks the vnode so that a parent block
      * will track it.
      */
    inline def NEED_PATCH: `512` = 512.asInstanceOf[`512`]
    
    /**
      * Indicates an element that has non-class/style dynamic props.
      * Can also be on a component that has any dynamic props (includes
      * class/style). when this flag is present, the vnode also has a dynamicProps
      * array that contains the keys of the props that may change so the runtime
      * can diff them faster (without having to worry about removed props)
      */
    inline def PROPS: `8` = 8.asInstanceOf[`8`]
    
    /**
      * Indicates a fragment whose children order doesn't change.
      */
    inline def STABLE_FRAGMENT: `64` = 64.asInstanceOf[`64`]
    
    /**
      * Indicates an element with dynamic style
      * The compiler pre-compiles static string styles into static objects
      * + detects and hoists inline static objects
      * e.g. `style="color: red"` and `:style="{ color: 'red' }"` both get hoisted
      * as:
      * ```js
      * const style = { color: 'red' }
      * render() { return e('div', { style }) }
      * ```
      */
    inline def STYLE: `4` = 4.asInstanceOf[`4`]
    
    /**
      * Indicates an element with dynamic textContent (children fast path)
      */
    inline def TEXT: `1` = 1.asInstanceOf[`1`]
    
    /**
      * Indicates a fragment with unkeyed children.
      */
    inline def UNKEYED_FRAGMENT: `256` = 256.asInstanceOf[`256`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vueShared.vueSharedInts.`1`
    - typings.vueShared.vueSharedInts.`2`
    - typings.vueShared.vueSharedInts.`4`
    - typings.vueShared.vueSharedInts.`8`
    - typings.vueShared.vueSharedInts.`16`
    - typings.vueShared.vueSharedInts.`32`
    - typings.vueShared.vueSharedInts.`64`
    - typings.vueShared.vueSharedInts.`128`
    - typings.vueShared.vueSharedInts.`256`
    - typings.vueShared.vueSharedInts.`512`
    - typings.vueShared.vueSharedInts.`6`
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
    - typings.vueShared.vueSharedInts.`1`
    - typings.vueShared.vueSharedInts.`2`
    - typings.vueShared.vueSharedInts.`3`
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
  
  type UnionToIntersection[U] = Any
}
