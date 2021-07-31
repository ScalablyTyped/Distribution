package typings.sugarCore

import typings.std.ArrayConstructor
import typings.std.BooleanConstructor
import typings.std.DateConstructor
import typings.std.ErrorConstructor
import typings.std.FunctionConstructor
import typings.std.Intl.CollatorOptions
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.NumberFormatOptions
import typings.std.NumberConstructor
import typings.std.ObjectConstructor
import typings.std.RegExp
import typings.std.RegExpConstructor
import typings.std.RegExpExecArray
import typings.std.RegExpMatchArray
import typings.std.StringConstructor
import typings.sugarCore.sugarCoreStrings.NFC
import typings.sugarCore.sugarCoreStrings.NFD
import typings.sugarCore.sugarCoreStrings.NFKC
import typings.sugarCore.sugarCoreStrings.NFKD
import typings.sugarCore.sugarjs.Array.Chainable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sugarjs {
  
  object Array {
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.sugarCore.sugarjs.Object.ChainableBase because var conflicts: raw. Inlined  */ @js.native
    trait Chainable[T, RawValue]
      extends StObject
         with ChainableBase[T, RawValue]
    
    @js.native
    trait ChainableBase[T, RawValue] extends StObject {
      
      def concat(items: (js.Array[T] | T)*): SugarDefaultChainable[js.Array[T]] = js.native
      
      def copyWithin(target: Double, start: Double): SugarDefaultChainable[this.type] = js.native
      def copyWithin(target: Double, start: Double, end: Double): SugarDefaultChainable[this.type] = js.native
      
      def every(callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean]): SugarDefaultChainable[Boolean] = js.native
      def every(
        callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean],
        thisArg: js.Any
      ): SugarDefaultChainable[Boolean] = js.native
      
      def fill(value: T): SugarDefaultChainable[this.type] = js.native
      def fill(value: T, start: Double): SugarDefaultChainable[this.type] = js.native
      def fill(value: T, start: Double, end: Double): SugarDefaultChainable[this.type] = js.native
      def fill(value: T, start: Unit, end: Double): SugarDefaultChainable[this.type] = js.native
      
      def filter(callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], js.Any]): SugarDefaultChainable[js.Array[T]] = js.native
      def filter(
        callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], js.Any],
        thisArg: js.Any
      ): SugarDefaultChainable[js.Array[T]] = js.native
      
      def find(predicate: js.Function3[/* value */ T, /* index */ Double, /* obj */ js.Array[T], Boolean]): SugarDefaultChainable[js.UndefOr[T]] = js.native
      def find(
        predicate: js.Function3[/* value */ T, /* index */ Double, /* obj */ js.Array[T], Boolean],
        thisArg: js.Any
      ): SugarDefaultChainable[js.UndefOr[T]] = js.native
      
      def findIndex(predicate: js.Function3[/* value */ T, /* index */ Double, /* obj */ js.Array[T], Boolean]): SugarDefaultChainable[Double] = js.native
      def findIndex(
        predicate: js.Function3[/* value */ T, /* index */ Double, /* obj */ js.Array[T], Boolean],
        thisArg: js.Any
      ): SugarDefaultChainable[Double] = js.native
      
      def forEach(callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit]): SugarDefaultChainable[Unit] = js.native
      def forEach(
        callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit],
        thisArg: js.Any
      ): SugarDefaultChainable[Unit] = js.native
      
      def indexOf(searchElement: T): SugarDefaultChainable[Double] = js.native
      def indexOf(searchElement: T, fromIndex: Double): SugarDefaultChainable[Double] = js.native
      
      def join(): SugarDefaultChainable[String] = js.native
      def join(separator: String): SugarDefaultChainable[String] = js.native
      
      def lastIndexOf(searchElement: T): SugarDefaultChainable[Double] = js.native
      def lastIndexOf(searchElement: T, fromIndex: Double): SugarDefaultChainable[Double] = js.native
      
      def map[U](callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], U]): SugarDefaultChainable[js.Array[U]] = js.native
      def map[U](
        callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], U],
        thisArg: js.Any
      ): SugarDefaultChainable[js.Array[U]] = js.native
      
      def pop(): SugarDefaultChainable[js.UndefOr[T]] = js.native
      
      def push(items: T*): SugarDefaultChainable[Double] = js.native
      
      var raw: RawValue = js.native
      
      def reduce(
        callbackfn: js.Function4[
              /* previousValue */ T, 
              /* currentValue */ T, 
              /* currentIndex */ Double, 
              /* array */ js.Array[T], 
              T
            ]
      ): SugarDefaultChainable[T] = js.native
      def reduce(
        callbackfn: js.Function4[
              /* previousValue */ T, 
              /* currentValue */ T, 
              /* currentIndex */ Double, 
              /* array */ js.Array[T], 
              T
            ],
        initialValue: T
      ): SugarDefaultChainable[T] = js.native
      
      def reduceRight(
        callbackfn: js.Function4[
              /* previousValue */ T, 
              /* currentValue */ T, 
              /* currentIndex */ Double, 
              /* array */ js.Array[T], 
              T
            ]
      ): SugarDefaultChainable[T] = js.native
      def reduceRight(
        callbackfn: js.Function4[
              /* previousValue */ T, 
              /* currentValue */ T, 
              /* currentIndex */ Double, 
              /* array */ js.Array[T], 
              T
            ],
        initialValue: T
      ): SugarDefaultChainable[T] = js.native
      @JSName("reduceRight")
      def reduceRight_U[U](
        callbackfn: js.Function4[
              /* previousValue */ U, 
              /* currentValue */ T, 
              /* currentIndex */ Double, 
              /* array */ js.Array[T], 
              U
            ],
        initialValue: U
      ): SugarDefaultChainable[U] = js.native
      
      @JSName("reduce")
      def reduce_U[U](
        callbackfn: js.Function4[
              /* previousValue */ U, 
              /* currentValue */ T, 
              /* currentIndex */ Double, 
              /* array */ js.Array[T], 
              U
            ],
        initialValue: U
      ): SugarDefaultChainable[U] = js.native
      
      def reverse(): SugarDefaultChainable[js.Array[T]] = js.native
      
      def shift(): SugarDefaultChainable[js.UndefOr[T]] = js.native
      
      def slice(): SugarDefaultChainable[js.Array[T]] = js.native
      def slice(start: Double): SugarDefaultChainable[js.Array[T]] = js.native
      def slice(start: Double, end: Double): SugarDefaultChainable[js.Array[T]] = js.native
      def slice(start: Unit, end: Double): SugarDefaultChainable[js.Array[T]] = js.native
      
      def some(callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean]): SugarDefaultChainable[Boolean] = js.native
      def some(
        callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean],
        thisArg: js.Any
      ): SugarDefaultChainable[Boolean] = js.native
      
      def sort(): SugarDefaultChainable[this.type] = js.native
      def sort(compareFn: js.Function2[/* a */ T, /* b */ T, Double]): SugarDefaultChainable[this.type] = js.native
      
      def splice(start: Double): SugarDefaultChainable[js.Array[T]] = js.native
      def splice(start: Double, deleteCount: Double, items: T*): SugarDefaultChainable[js.Array[T]] = js.native
      
      def unshift(items: T*): SugarDefaultChainable[Double] = js.native
    }
  }
  
  object Date {
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.sugarCore.sugarjs.Object.ChainableBase because var conflicts: raw. Inlined  */ @js.native
    trait Chainable[RawValue]
      extends StObject
         with ChainableBase[RawValue]
    
    @js.native
    trait ChainableBase[RawValue] extends StObject {
      
      def getDate(): SugarDefaultChainable[Double] = js.native
      
      def getDay(): SugarDefaultChainable[Double] = js.native
      
      def getFullYear(): SugarDefaultChainable[Double] = js.native
      
      def getHours(): SugarDefaultChainable[Double] = js.native
      
      def getMilliseconds(): SugarDefaultChainable[Double] = js.native
      
      def getMinutes(): SugarDefaultChainable[Double] = js.native
      
      def getMonth(): SugarDefaultChainable[Double] = js.native
      
      def getSeconds(): SugarDefaultChainable[Double] = js.native
      
      def getTime(): SugarDefaultChainable[Double] = js.native
      
      def getTimezoneOffset(): SugarDefaultChainable[Double] = js.native
      
      def getUTCDate(): SugarDefaultChainable[Double] = js.native
      
      def getUTCDay(): SugarDefaultChainable[Double] = js.native
      
      def getUTCFullYear(): SugarDefaultChainable[Double] = js.native
      
      def getUTCHours(): SugarDefaultChainable[Double] = js.native
      
      def getUTCMilliseconds(): SugarDefaultChainable[Double] = js.native
      
      def getUTCMinutes(): SugarDefaultChainable[Double] = js.native
      
      def getUTCMonth(): SugarDefaultChainable[Double] = js.native
      
      def getUTCSeconds(): SugarDefaultChainable[Double] = js.native
      
      var raw: RawValue = js.native
      
      def setDate(date: Double): SugarDefaultChainable[Double] = js.native
      
      def setFullYear(year: Double): SugarDefaultChainable[Double] = js.native
      def setFullYear(year: Double, month: Double): SugarDefaultChainable[Double] = js.native
      def setFullYear(year: Double, month: Double, date: Double): SugarDefaultChainable[Double] = js.native
      def setFullYear(year: Double, month: Unit, date: Double): SugarDefaultChainable[Double] = js.native
      
      def setHours(hours: Double): SugarDefaultChainable[Double] = js.native
      def setHours(hours: Double, min: Double): SugarDefaultChainable[Double] = js.native
      def setHours(hours: Double, min: Double, sec: Double): SugarDefaultChainable[Double] = js.native
      def setHours(hours: Double, min: Double, sec: Double, ms: Double): SugarDefaultChainable[Double] = js.native
      def setHours(hours: Double, min: Double, sec: Unit, ms: Double): SugarDefaultChainable[Double] = js.native
      def setHours(hours: Double, min: Unit, sec: Double): SugarDefaultChainable[Double] = js.native
      def setHours(hours: Double, min: Unit, sec: Double, ms: Double): SugarDefaultChainable[Double] = js.native
      def setHours(hours: Double, min: Unit, sec: Unit, ms: Double): SugarDefaultChainable[Double] = js.native
      
      def setMilliseconds(ms: Double): SugarDefaultChainable[Double] = js.native
      
      def setMinutes(min: Double): SugarDefaultChainable[Double] = js.native
      def setMinutes(min: Double, sec: Double): SugarDefaultChainable[Double] = js.native
      def setMinutes(min: Double, sec: Double, ms: Double): SugarDefaultChainable[Double] = js.native
      def setMinutes(min: Double, sec: Unit, ms: Double): SugarDefaultChainable[Double] = js.native
      
      def setMonth(month: Double): SugarDefaultChainable[Double] = js.native
      def setMonth(month: Double, date: Double): SugarDefaultChainable[Double] = js.native
      
      def setSeconds(sec: Double): SugarDefaultChainable[Double] = js.native
      def setSeconds(sec: Double, ms: Double): SugarDefaultChainable[Double] = js.native
      
      def setTime(time: Double): SugarDefaultChainable[Double] = js.native
      
      def setUTCDate(date: Double): SugarDefaultChainable[Double] = js.native
      
      def setUTCFullYear(year: Double): SugarDefaultChainable[Double] = js.native
      def setUTCFullYear(year: Double, month: Double): SugarDefaultChainable[Double] = js.native
      def setUTCFullYear(year: Double, month: Double, date: Double): SugarDefaultChainable[Double] = js.native
      def setUTCFullYear(year: Double, month: Unit, date: Double): SugarDefaultChainable[Double] = js.native
      
      def setUTCHours(hours: Double): SugarDefaultChainable[Double] = js.native
      def setUTCHours(hours: Double, min: Double): SugarDefaultChainable[Double] = js.native
      def setUTCHours(hours: Double, min: Double, sec: Double): SugarDefaultChainable[Double] = js.native
      def setUTCHours(hours: Double, min: Double, sec: Double, ms: Double): SugarDefaultChainable[Double] = js.native
      def setUTCHours(hours: Double, min: Double, sec: Unit, ms: Double): SugarDefaultChainable[Double] = js.native
      def setUTCHours(hours: Double, min: Unit, sec: Double): SugarDefaultChainable[Double] = js.native
      def setUTCHours(hours: Double, min: Unit, sec: Double, ms: Double): SugarDefaultChainable[Double] = js.native
      def setUTCHours(hours: Double, min: Unit, sec: Unit, ms: Double): SugarDefaultChainable[Double] = js.native
      
      def setUTCMilliseconds(ms: Double): SugarDefaultChainable[Double] = js.native
      
      def setUTCMinutes(min: Double): SugarDefaultChainable[Double] = js.native
      def setUTCMinutes(min: Double, sec: Double): SugarDefaultChainable[Double] = js.native
      def setUTCMinutes(min: Double, sec: Double, ms: Double): SugarDefaultChainable[Double] = js.native
      def setUTCMinutes(min: Double, sec: Unit, ms: Double): SugarDefaultChainable[Double] = js.native
      
      def setUTCMonth(month: Double): SugarDefaultChainable[Double] = js.native
      def setUTCMonth(month: Double, date: Double): SugarDefaultChainable[Double] = js.native
      
      def setUTCSeconds(sec: Double): SugarDefaultChainable[Double] = js.native
      def setUTCSeconds(sec: Double, ms: Double): SugarDefaultChainable[Double] = js.native
      
      def toDateString(): SugarDefaultChainable[String] = js.native
      
      def toISOString(): SugarDefaultChainable[String] = js.native
      
      def toJSON(): SugarDefaultChainable[String] = js.native
      def toJSON(key: js.Any): SugarDefaultChainable[String] = js.native
      
      def toLocaleDateString(): SugarDefaultChainable[String] = js.native
      def toLocaleDateString(locales: String): SugarDefaultChainable[String] = js.native
      def toLocaleDateString(locales: String, options: DateTimeFormatOptions): SugarDefaultChainable[String] = js.native
      def toLocaleDateString(locales: js.Array[String]): SugarDefaultChainable[String] = js.native
      def toLocaleDateString(locales: js.Array[String], options: DateTimeFormatOptions): SugarDefaultChainable[String] = js.native
      def toLocaleDateString(locales: Unit, options: DateTimeFormatOptions): SugarDefaultChainable[String] = js.native
      
      def toLocaleString(locales: String): SugarDefaultChainable[String] = js.native
      def toLocaleString(locales: String, options: DateTimeFormatOptions): SugarDefaultChainable[String] = js.native
      def toLocaleString(locales: js.Array[String]): SugarDefaultChainable[String] = js.native
      def toLocaleString(locales: js.Array[String], options: DateTimeFormatOptions): SugarDefaultChainable[String] = js.native
      def toLocaleString(locales: Unit, options: DateTimeFormatOptions): SugarDefaultChainable[String] = js.native
      
      def toLocaleTimeString(): SugarDefaultChainable[String] = js.native
      def toLocaleTimeString(locales: String): SugarDefaultChainable[String] = js.native
      def toLocaleTimeString(locales: String, options: DateTimeFormatOptions): SugarDefaultChainable[String] = js.native
      def toLocaleTimeString(locales: js.Array[String]): SugarDefaultChainable[String] = js.native
      def toLocaleTimeString(locales: js.Array[String], options: DateTimeFormatOptions): SugarDefaultChainable[String] = js.native
      def toLocaleTimeString(locales: Unit, options: DateTimeFormatOptions): SugarDefaultChainable[String] = js.native
      
      def toTimeString(): SugarDefaultChainable[String] = js.native
      
      def toUTCString(): SugarDefaultChainable[String] = js.native
    }
  }
  
  trait ExtendOptions extends StObject {
    
    var enhance: js.UndefOr[Boolean] = js.undefined
    
    var enhanceArray: js.UndefOr[Boolean] = js.undefined
    
    var enhanceString: js.UndefOr[Boolean] = js.undefined
    
    var except: js.UndefOr[js.Array[String | NativeConstructor]] = js.undefined
    
    var methods: js.UndefOr[js.Array[String]] = js.undefined
    
    var namespaces: js.UndefOr[js.Array[NativeConstructor]] = js.undefined
    
    var objectPrototype: js.UndefOr[Boolean] = js.undefined
  }
  object ExtendOptions {
    
    @scala.inline
    def apply(): ExtendOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtendOptions]
    }
    
    @scala.inline
    implicit class ExtendOptionsMutableBuilder[Self <: ExtendOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnhance(value: Boolean): Self = StObject.set(x, "enhance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnhanceArray(value: Boolean): Self = StObject.set(x, "enhanceArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnhanceArrayUndefined: Self = StObject.set(x, "enhanceArray", js.undefined)
      
      @scala.inline
      def setEnhanceString(value: Boolean): Self = StObject.set(x, "enhanceString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnhanceStringUndefined: Self = StObject.set(x, "enhanceString", js.undefined)
      
      @scala.inline
      def setEnhanceUndefined: Self = StObject.set(x, "enhance", js.undefined)
      
      @scala.inline
      def setExcept(value: js.Array[String | NativeConstructor]): Self = StObject.set(x, "except", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExceptUndefined: Self = StObject.set(x, "except", js.undefined)
      
      @scala.inline
      def setExceptVarargs(value: (String | NativeConstructor)*): Self = StObject.set(x, "except", js.Array(value :_*))
      
      @scala.inline
      def setMethods(value: js.Array[String]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      @scala.inline
      def setMethodsVarargs(value: String*): Self = StObject.set(x, "methods", js.Array(value :_*))
      
      @scala.inline
      def setNamespaces(value: js.Array[NativeConstructor]): Self = StObject.set(x, "namespaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespacesUndefined: Self = StObject.set(x, "namespaces", js.undefined)
      
      @scala.inline
      def setNamespacesVarargs(value: NativeConstructor*): Self = StObject.set(x, "namespaces", js.Array(value :_*))
      
      @scala.inline
      def setObjectPrototype(value: Boolean): Self = StObject.set(x, "objectPrototype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectPrototypeUndefined: Self = StObject.set(x, "objectPrototype", js.undefined)
    }
  }
  
  object Function {
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.sugarCore.sugarjs.Object.ChainableBase because var conflicts: raw. Inlined  */ @js.native
    trait Chainable[RawValue]
      extends StObject
         with ChainableBase[RawValue]
    
    @js.native
    trait ChainableBase[RawValue] extends StObject {
      
      @JSName("apply")
      def apply(thisArg: js.Any): SugarDefaultChainable[js.Any] = js.native
      @JSName("apply")
      def apply(thisArg: js.Any, argArray: js.Any): SugarDefaultChainable[js.Any] = js.native
      
      def bind(thisArg: js.Any, argArray: js.Any*): SugarDefaultChainable[js.Any] = js.native
      
      def call(thisArg: js.Any, argArray: js.Any*): SugarDefaultChainable[js.Any] = js.native
      
      var raw: RawValue = js.native
    }
  }
  
  type NativeConstructor = ArrayConstructor | DateConstructor | FunctionConstructor | NumberConstructor | ObjectConstructor | RegExpConstructor | StringConstructor | BooleanConstructor | ErrorConstructor
  
  object Number {
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.sugarCore.sugarjs.Object.ChainableBase because var conflicts: raw. Inlined  */ @js.native
    trait Chainable[RawValue]
      extends StObject
         with ChainableBase[RawValue]
    
    @js.native
    trait ChainableBase[RawValue] extends StObject {
      
      var raw: RawValue = js.native
      
      def toExponential(): SugarDefaultChainable[String] = js.native
      def toExponential(fractionDigits: Double): SugarDefaultChainable[String] = js.native
      
      def toFixed(): SugarDefaultChainable[String] = js.native
      def toFixed(fractionDigits: Double): SugarDefaultChainable[String] = js.native
      
      def toLocaleString(locales: String): SugarDefaultChainable[String] = js.native
      def toLocaleString(locales: String, options: NumberFormatOptions): SugarDefaultChainable[String] = js.native
      def toLocaleString(locales: js.Array[String]): SugarDefaultChainable[String] = js.native
      def toLocaleString(locales: js.Array[String], options: NumberFormatOptions): SugarDefaultChainable[String] = js.native
      def toLocaleString(locales: Unit, options: NumberFormatOptions): SugarDefaultChainable[String] = js.native
      
      def toPrecision(): SugarDefaultChainable[String] = js.native
      def toPrecision(precision: Double): SugarDefaultChainable[String] = js.native
    }
  }
  
  object Object {
    
    type Chainable[RawValue] = ChainableBase[RawValue]
    
    trait ChainableBase[RawValue] extends StObject {
      
      var raw: RawValue
    }
    object ChainableBase {
      
      @scala.inline
      def apply[RawValue](raw: RawValue): ChainableBase[RawValue] = {
        val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
        __obj.asInstanceOf[ChainableBase[RawValue]]
      }
      
      @scala.inline
      implicit class ChainableBaseMutableBuilder[Self <: ChainableBase[?], RawValue] (val x: Self & ChainableBase[RawValue]) extends AnyVal {
        
        @scala.inline
        def setRaw(value: RawValue): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object RegExp {
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.sugarCore.sugarjs.Object.ChainableBase because var conflicts: raw. Inlined  */ trait Chainable[RawValue]
      extends StObject
         with ChainableBase[RawValue]
    object Chainable {
      
      @scala.inline
      def apply[RawValue](
        exec: String => SugarDefaultChainable[RegExpExecArray | Null],
        raw: RawValue,
        test: String => SugarDefaultChainable[Boolean]
      ): Chainable[RawValue] = {
        val __obj = js.Dynamic.literal(exec = js.Any.fromFunction1(exec), raw = raw.asInstanceOf[js.Any], test = js.Any.fromFunction1(test))
        __obj.asInstanceOf[Chainable[RawValue]]
      }
    }
    
    trait ChainableBase[RawValue] extends StObject {
      
      def exec(string: String): SugarDefaultChainable[RegExpExecArray | Null]
      
      var raw: RawValue
      
      def test(string: String): SugarDefaultChainable[Boolean]
    }
    object ChainableBase {
      
      @scala.inline
      def apply[RawValue](
        exec: String => SugarDefaultChainable[RegExpExecArray | Null],
        raw: RawValue,
        test: String => SugarDefaultChainable[Boolean]
      ): ChainableBase[RawValue] = {
        val __obj = js.Dynamic.literal(exec = js.Any.fromFunction1(exec), raw = raw.asInstanceOf[js.Any], test = js.Any.fromFunction1(test))
        __obj.asInstanceOf[ChainableBase[RawValue]]
      }
      
      @scala.inline
      implicit class ChainableBaseMutableBuilder[Self <: ChainableBase[?], RawValue] (val x: Self & ChainableBase[RawValue]) extends AnyVal {
        
        @scala.inline
        def setExec(value: String => SugarDefaultChainable[RegExpExecArray | Null]): Self = StObject.set(x, "exec", js.Any.fromFunction1(value))
        
        @scala.inline
        def setRaw(value: RawValue): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTest(value: String => SugarDefaultChainable[Boolean]): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
      }
    }
  }
  
  object String {
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.sugarCore.sugarjs.Object.ChainableBase because var conflicts: raw. Inlined  */ @js.native
    trait Chainable[RawValue]
      extends StObject
         with ChainableBase[RawValue]
    
    @js.native
    trait ChainableBase[RawValue] extends StObject {
      
      def anchor(name: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
      
      def big(): SugarDefaultChainable[java.lang.String] = js.native
      
      def blink(): SugarDefaultChainable[java.lang.String] = js.native
      
      def bold(): SugarDefaultChainable[java.lang.String] = js.native
      
      def charAt(pos: Double): SugarDefaultChainable[java.lang.String] = js.native
      
      def charCodeAt(index: Double): SugarDefaultChainable[Double] = js.native
      
      def codePointAt(pos: Double): SugarDefaultChainable[js.UndefOr[Double]] = js.native
      
      def concat(strings: java.lang.String*): SugarDefaultChainable[java.lang.String] = js.native
      
      def endsWith(searchString: java.lang.String): SugarDefaultChainable[Boolean] = js.native
      def endsWith(searchString: java.lang.String, endPosition: Double): SugarDefaultChainable[Boolean] = js.native
      
      def fixed(): SugarDefaultChainable[java.lang.String] = js.native
      
      def fontcolor(color: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
      
      def fontsize(size: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
      def fontsize(size: Double): SugarDefaultChainable[java.lang.String] = js.native
      
      def includes(searchString: java.lang.String): SugarDefaultChainable[Boolean] = js.native
      def includes(searchString: java.lang.String, position: Double): SugarDefaultChainable[Boolean] = js.native
      
      def indexOf(searchString: java.lang.String): SugarDefaultChainable[Double] = js.native
      def indexOf(searchString: java.lang.String, position: Double): SugarDefaultChainable[Double] = js.native
      
      def italics(): SugarDefaultChainable[java.lang.String] = js.native
      
      def lastIndexOf(searchString: java.lang.String): SugarDefaultChainable[Double] = js.native
      def lastIndexOf(searchString: java.lang.String, position: Double): SugarDefaultChainable[Double] = js.native
      
      def link(url: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
      
      def localeCompare(that: java.lang.String): SugarDefaultChainable[Double] = js.native
      def localeCompare(that: java.lang.String, locales: java.lang.String): SugarDefaultChainable[Double] = js.native
      def localeCompare(that: java.lang.String, locales: java.lang.String, options: CollatorOptions): SugarDefaultChainable[Double] = js.native
      def localeCompare(that: java.lang.String, locales: js.Array[java.lang.String]): SugarDefaultChainable[Double] = js.native
      def localeCompare(that: java.lang.String, locales: js.Array[java.lang.String], options: CollatorOptions): SugarDefaultChainable[Double] = js.native
      def localeCompare(that: java.lang.String, locales: Unit, options: CollatorOptions): SugarDefaultChainable[Double] = js.native
      
      def `match`(regexp: java.lang.String): SugarDefaultChainable[RegExpMatchArray | Null] = js.native
      def `match`(regexp: RegExp): SugarDefaultChainable[RegExpMatchArray | Null] = js.native
      
      def normalize(): SugarDefaultChainable[java.lang.String] = js.native
      def normalize(form: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
      @JSName("normalize")
      def normalize_NFC(form: NFC): SugarDefaultChainable[java.lang.String] = js.native
      @JSName("normalize")
      def normalize_NFD(form: NFD): SugarDefaultChainable[java.lang.String] = js.native
      @JSName("normalize")
      def normalize_NFKC(form: NFKC): SugarDefaultChainable[java.lang.String] = js.native
      @JSName("normalize")
      def normalize_NFKD(form: NFKD): SugarDefaultChainable[java.lang.String] = js.native
      
      var raw: RawValue = js.native
      
      def repeat(count: Double): SugarDefaultChainable[java.lang.String] = js.native
      
      def replace(searchValue: java.lang.String, replaceValue: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
      def replace(
        searchValue: java.lang.String,
        replacer: js.Function2[/* substring */ java.lang.String, /* repeated */ js.Any, java.lang.String]
      ): SugarDefaultChainable[java.lang.String] = js.native
      def replace(searchValue: RegExp, replaceValue: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
      def replace(
        searchValue: RegExp,
        replacer: js.Function2[/* substring */ java.lang.String, /* repeated */ js.Any, java.lang.String]
      ): SugarDefaultChainable[java.lang.String] = js.native
      
      def search(regexp: java.lang.String): SugarDefaultChainable[Double] = js.native
      def search(regexp: RegExp): SugarDefaultChainable[Double] = js.native
      
      def slice(): SugarDefaultChainable[java.lang.String] = js.native
      def slice(start: Double): SugarDefaultChainable[java.lang.String] = js.native
      def slice(start: Double, end: Double): SugarDefaultChainable[java.lang.String] = js.native
      def slice(start: Unit, end: Double): SugarDefaultChainable[java.lang.String] = js.native
      
      def small(): SugarDefaultChainable[java.lang.String] = js.native
      
      def split(separator: java.lang.String): SugarDefaultChainable[js.Array[java.lang.String]] = js.native
      def split(separator: java.lang.String, limit: Double): SugarDefaultChainable[js.Array[java.lang.String]] = js.native
      def split(separator: RegExp): SugarDefaultChainable[js.Array[java.lang.String]] = js.native
      def split(separator: RegExp, limit: Double): SugarDefaultChainable[js.Array[java.lang.String]] = js.native
      
      def startsWith(searchString: java.lang.String): SugarDefaultChainable[Boolean] = js.native
      def startsWith(searchString: java.lang.String, position: Double): SugarDefaultChainable[Boolean] = js.native
      
      def strike(): SugarDefaultChainable[java.lang.String] = js.native
      
      def sub(): SugarDefaultChainable[java.lang.String] = js.native
      
      def substr(from: Double): SugarDefaultChainable[java.lang.String] = js.native
      def substr(from: Double, length: Double): SugarDefaultChainable[java.lang.String] = js.native
      
      def substring(start: Double): SugarDefaultChainable[java.lang.String] = js.native
      def substring(start: Double, end: Double): SugarDefaultChainable[java.lang.String] = js.native
      
      def sup(): SugarDefaultChainable[java.lang.String] = js.native
      
      def toLocaleLowerCase(): SugarDefaultChainable[java.lang.String] = js.native
      
      def toLocaleUpperCase(): SugarDefaultChainable[java.lang.String] = js.native
      
      def toLowerCase(): SugarDefaultChainable[java.lang.String] = js.native
      
      def toUpperCase(): SugarDefaultChainable[java.lang.String] = js.native
      
      def trim(): SugarDefaultChainable[java.lang.String] = js.native
    }
  }
  
  @js.native
  trait Sugar extends StObject {
    
    def apply(): Sugar = js.native
    def apply(opts: ExtendOptions): Sugar = js.native
    
    var Array: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Array.Constructor */ js.Any = js.native
    
    var Date: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Date.Constructor */ js.Any = js.native
    
    var Function: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Function.Constructor */ js.Any = js.native
    
    var Number: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Number.Constructor */ js.Any = js.native
    
    var Object: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object.Constructor */ js.Any = js.native
    
    var RegExp: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RegExp.Constructor */ js.Any = js.native
    
    var String: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify String.Constructor */ js.Any = js.native
    
    def createNamespace(name: String): SugarNamespace = js.native
    
    def extend(): Sugar = js.native
    def extend(opts: ExtendOptions): Sugar = js.native
  }
  
  type SugarDefaultChainable[RawValue] = (Chainable[js.Any, RawValue]) & typings.sugarCore.sugarjs.Date.Chainable[RawValue] & typings.sugarCore.sugarjs.Function.Chainable[RawValue] & typings.sugarCore.sugarjs.Number.Chainable[RawValue] & typings.sugarCore.sugarjs.Object.Chainable[RawValue] & typings.sugarCore.sugarjs.RegExp.Chainable[RawValue] & typings.sugarCore.sugarjs.String.Chainable[RawValue]
  
  @js.native
  trait SugarNamespace extends StObject {
    
    def alias(toName: String, fn: Unit): this.type = js.native
    def alias(toName: String, from: String): this.type = js.native
    def alias(toName: String, from: js.Function): this.type = js.native
    
    def defineInstance(methodName: String, methodFn: js.Function): this.type = js.native
    def defineInstance(methods: js.Object): this.type = js.native
    
    def defineInstanceAndStatic(methodName: String, methodFn: js.Function): this.type = js.native
    def defineInstanceAndStatic(methods: js.Object): this.type = js.native
    
    def defineInstancePolyfill(methodName: String, methodFn: js.Function): this.type = js.native
    def defineInstancePolyfill(methods: js.Object): this.type = js.native
    
    def defineInstanceWithArguments(methodName: String, methodFn: js.Function): this.type = js.native
    def defineInstanceWithArguments(methods: js.Object): this.type = js.native
    
    def defineStatic(methodName: String, methodFn: js.Function): this.type = js.native
    def defineStatic(methods: js.Object): this.type = js.native
    
    def defineStaticPolyfill(methodName: String, methodFn: js.Function): this.type = js.native
    def defineStaticPolyfill(methods: js.Object): this.type = js.native
    
    def defineStaticWithArguments(methodName: String, methodFn: js.Function): this.type = js.native
    def defineStaticWithArguments(methods: js.Object): this.type = js.native
    
    def extend(): this.type = js.native
    def extend(opts: ExtendOptions): this.type = js.native
  }
}
