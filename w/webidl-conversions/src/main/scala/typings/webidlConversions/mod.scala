package typings.webidlConversions

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.std.ArrayBuffer
import typings.std.ArrayBufferLike
import typings.std.ArrayBufferView
import typings.webidlConversions.anon.BufferSourceOptionsallowS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webidl-conversions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def ArrayBuffer(V: js.Any): typings.std.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("ArrayBuffer")(V.asInstanceOf[js.Any]).asInstanceOf[typings.std.ArrayBuffer]
  @scala.inline
  def ArrayBuffer(V: js.Any, opts: BufferSourceOptionsallowS): typings.std.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("ArrayBuffer")(V.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.std.ArrayBuffer]
  @scala.inline
  def ArrayBuffer(V: js.Any, opts: BufferSourceOptions): ArrayBufferLike = (^.asInstanceOf[js.Dynamic].applyDynamic("ArrayBuffer")(V.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ArrayBufferLike]
  
  @scala.inline
  def ArrayBufferView(V: js.Any): typings.std.ArrayBufferView = ^.asInstanceOf[js.Dynamic].applyDynamic("ArrayBufferView")(V.asInstanceOf[js.Any]).asInstanceOf[typings.std.ArrayBufferView]
  @scala.inline
  def ArrayBufferView(V: js.Any, opts: BufferSourceOptions): typings.std.ArrayBufferView = (^.asInstanceOf[js.Dynamic].applyDynamic("ArrayBufferView")(V.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.std.ArrayBufferView]
  
  @scala.inline
  def ArrayBuffer_ArrayBufferLike(V: js.Any): ArrayBufferLike = ^.asInstanceOf[js.Dynamic].applyDynamic("ArrayBuffer")(V.asInstanceOf[js.Any]).asInstanceOf[ArrayBufferLike]
  
  @scala.inline
  def BufferSource(V: js.Any): ArrayBuffer | ArrayBufferView = ^.asInstanceOf[js.Dynamic].applyDynamic("BufferSource")(V.asInstanceOf[js.Any]).asInstanceOf[ArrayBuffer | ArrayBufferView]
  @scala.inline
  def BufferSource(V: js.Any, opts: BufferSourceOptionsallowS): ArrayBuffer | ArrayBufferView = (^.asInstanceOf[js.Dynamic].applyDynamic("BufferSource")(V.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ArrayBuffer | ArrayBufferView]
  @scala.inline
  def BufferSource(V: js.Any, opts: BufferSourceOptions): ArrayBufferLike | ArrayBufferView = (^.asInstanceOf[js.Dynamic].applyDynamic("BufferSource")(V.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ArrayBufferLike | ArrayBufferView]
  
  @scala.inline
  def ByteString(V: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ByteString")(V.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def ByteString(V: js.Any, opts: StringOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ByteString")(V.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def DOMString(V: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("DOMString")(V.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def DOMString(V: js.Any, opts: StringOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("DOMString")(V.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def DOMTimeStamp(V: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("DOMTimeStamp")(V.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def DOMTimeStamp(V: js.Any, opts: Options): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("DOMTimeStamp")(V.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def DataView(V: js.Any): typings.std.DataView = ^.asInstanceOf[js.Dynamic].applyDynamic("DataView")(V.asInstanceOf[js.Any]).asInstanceOf[typings.std.DataView]
  @scala.inline
  def DataView(V: js.Any, opts: BufferSourceOptions): typings.std.DataView = (^.asInstanceOf[js.Dynamic].applyDynamic("DataView")(V.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.std.DataView]
  
  @scala.inline
  def Float32Array(V: js.Any): typings.std.Float32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("Float32Array")(V.asInstanceOf[js.Any]).asInstanceOf[typings.std.Float32Array]
  @scala.inline
  def Float32Array(V: js.Any, opts: BufferSourceOptions): typings.std.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("Float32Array")(V.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.std.Float32Array]
  
  @scala.inline
  def Float64Array(V: js.Any): typings.std.Float64Array = ^.asInstanceOf[js.Dynamic].applyDynamic("Float64Array")(V.asInstanceOf[js.Any]).asInstanceOf[typings.std.Float64Array]
  @scala.inline
  def Float64Array(V: js.Any, opts: BufferSourceOptions): typings.std.Float64Array = (^.asInstanceOf[js.Dynamic].applyDynamic("Float64Array")(V.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.std.Float64Array]
  
  // tslint:disable:ban-types
  /** @deprecated Will be removed in v7.0 */
  @scala.inline
  def Function[V](V: V): js.Function | V = ^.asInstanceOf[js.Dynamic].applyDynamic("Function")(V.asInstanceOf[js.Any]).asInstanceOf[js.Function | V]
  @scala.inline
  def Function[V](V: V, opts: Options): js.Function | V = (^.asInstanceOf[js.Dynamic].applyDynamic("Function")(V.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Function | V]
  
  @scala.inline
  def Int16Array(V: js.Any): typings.std.Int16Array = ^.asInstanceOf[js.Dynamic].applyDynamic("Int16Array")(V.asInstanceOf[js.Any]).asInstanceOf[typings.std.Int16Array]
  @scala.inline
  def Int16Array(V: js.Any, opts: BufferSourceOptions): typings.std.Int16Array = (^.asInstanceOf[js.Dynamic].applyDynamic("Int16Array")(V.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.std.Int16Array]
  
  @scala.inline
  def Int32Array(V: js.Any): typings.std.Int32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("Int32Array")(V.asInstanceOf[js.Any]).asInstanceOf[typings.std.Int32Array]
  @scala.inline
  def Int32Array(V: js.Any, opts: BufferSourceOptions): typings.std.Int32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("Int32Array")(V.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.std.Int32Array]
  
  @scala.inline
  def Int8Array(V: js.Any): typings.std.Int8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("Int8Array")(V.asInstanceOf[js.Any]).asInstanceOf[typings.std.Int8Array]
  @scala.inline
  def Int8Array(V: js.Any, opts: BufferSourceOptions): typings.std.Int8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("Int8Array")(V.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.std.Int8Array]
  
  @scala.inline
  def USVString(V: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("USVString")(V.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def USVString(V: js.Any, opts: StringOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("USVString")(V.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def Uint16Array(V: js.Any): typings.std.Uint16Array = ^.asInstanceOf[js.Dynamic].applyDynamic("Uint16Array")(V.asInstanceOf[js.Any]).asInstanceOf[typings.std.Uint16Array]
  @scala.inline
  def Uint16Array(V: js.Any, opts: BufferSourceOptions): typings.std.Uint16Array = (^.asInstanceOf[js.Dynamic].applyDynamic("Uint16Array")(V.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint16Array]
  
  @scala.inline
  def Uint32Array(V: js.Any): typings.std.Uint32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("Uint32Array")(V.asInstanceOf[js.Any]).asInstanceOf[typings.std.Uint32Array]
  @scala.inline
  def Uint32Array(V: js.Any, opts: BufferSourceOptions): typings.std.Uint32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("Uint32Array")(V.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint32Array]
  
  @scala.inline
  def Uint8Array(V: js.Any): typings.std.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("Uint8Array")(V.asInstanceOf[js.Any]).asInstanceOf[typings.std.Uint8Array]
  @scala.inline
  def Uint8Array(V: js.Any, opts: BufferSourceOptions): typings.std.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("Uint8Array")(V.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]
  
  @scala.inline
  def Uint8ClampedArray(V: js.Any): typings.std.Uint8ClampedArray = ^.asInstanceOf[js.Dynamic].applyDynamic("Uint8ClampedArray")(V.asInstanceOf[js.Any]).asInstanceOf[typings.std.Uint8ClampedArray]
  @scala.inline
  def Uint8ClampedArray(V: js.Any, opts: BufferSourceOptions): typings.std.Uint8ClampedArray = (^.asInstanceOf[js.Dynamic].applyDynamic("Uint8ClampedArray")(V.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8ClampedArray]
  
  /** @deprecated Will be removed in v7.0 */
  @scala.inline
  def VoidFunction[V](V: V): js.Function | (js.Function1[/* args */ Parameters[V], Unit]) = ^.asInstanceOf[js.Dynamic].applyDynamic("VoidFunction")(V.asInstanceOf[js.Any]).asInstanceOf[js.Function | (js.Function1[/* args */ Parameters[V], Unit])]
  @scala.inline
  def VoidFunction[V](V: V, opts: Options): js.Function | (js.Function1[/* args */ Parameters[V], Unit]) = (^.asInstanceOf[js.Dynamic].applyDynamic("VoidFunction")(V.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Function | (js.Function1[/* args */ Parameters[V], Unit])]
  
  @scala.inline
  def any[V](V: V): V = ^.asInstanceOf[js.Dynamic].applyDynamic("any")(V.asInstanceOf[js.Any]).asInstanceOf[V]
  @scala.inline
  def any[V](V: V, opts: Options): V = (^.asInstanceOf[js.Dynamic].applyDynamic("any")(V.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[V]
  
  @scala.inline
  def boolean(V: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("boolean")(V.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def boolean(V: js.Any, opts: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("boolean")(V.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def byte(V: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("byte")(V.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def byte(V: js.Any, opts: IntegerOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("byte")(V.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def double(V: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("double")(V.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def double(V: js.Any, opts: Options): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("double")(V.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def float(V: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("float")(V.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def float(V: js.Any, opts: Options): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("float")(V.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def long(V: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("long")(V.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def long(V: js.Any, opts: IntegerOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("long")(V.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def longLong(V: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("long long")(V.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def longLong(V: js.Any, opts: IntegerOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("long long")(V.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def `object`[V](V: V): (V & js.Object) | V = ^.asInstanceOf[js.Dynamic].applyDynamic("object")(V.asInstanceOf[js.Any]).asInstanceOf[(V & js.Object) | V]
  @scala.inline
  def `object`[V](V: V, opts: Options): (V & js.Object) | V = (^.asInstanceOf[js.Dynamic].applyDynamic("object")(V.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[(V & js.Object) | V]
  
  @scala.inline
  def octet(V: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("octet")(V.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def octet(V: js.Any, opts: IntegerOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("octet")(V.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def short(V: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("short")(V.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def short(V: js.Any, opts: IntegerOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("short")(V.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def unrestrictedDouble(V: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("unrestricted double")(V.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def unrestrictedDouble(V: js.Any, opts: Options): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("unrestricted double")(V.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def unrestrictedFloat(V: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("unrestricted float")(V.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def unrestrictedFloat(V: js.Any, opts: Options): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("unrestricted float")(V.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def unsignedLong(V: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("unsigned long")(V.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def unsignedLong(V: js.Any, opts: IntegerOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("unsigned long")(V.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def unsignedLongLong(V: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("unsigned long long")(V.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def unsignedLongLong(V: js.Any, opts: IntegerOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("unsigned long long")(V.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def unsignedShort(V: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("unsigned short")(V.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def unsignedShort(V: js.Any, opts: IntegerOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("unsigned short")(V.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def void(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("void")().asInstanceOf[Unit]
  @scala.inline
  def void(V: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("void")(V.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def void(V: js.Any, opts: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("void")(V.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def void(V: Unit, opts: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("void")(V.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait BufferSourceOptions
    extends StObject
       with Options {
    
    var allowShared: js.UndefOr[Boolean] = js.undefined
  }
  object BufferSourceOptions {
    
    @scala.inline
    def apply(): BufferSourceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BufferSourceOptions]
    }
    
    @scala.inline
    implicit class BufferSourceOptionsMutableBuilder[Self <: BufferSourceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowShared(value: Boolean): Self = StObject.set(x, "allowShared", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowSharedUndefined: Self = StObject.set(x, "allowShared", js.undefined)
    }
  }
  
  @js.native
  trait Globals
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    def Number(): Double = js.native
    def Number(value: js.Any): Double = js.native
    
    def String(): java.lang.String = js.native
    def String(value: js.Any): java.lang.String = js.native
    
    var TypeError: Instantiable1[/* message */ js.UndefOr[String], typings.std.TypeError] = js.native
  }
  
  type IntegerConversion = js.Function2[/* V */ js.Any, /* opts */ js.UndefOr[IntegerOptions], Double]
  
  trait IntegerOptions
    extends StObject
       with Options {
    
    var clamp: js.UndefOr[Boolean] = js.undefined
    
    var enforceRange: js.UndefOr[Boolean] = js.undefined
  }
  object IntegerOptions {
    
    @scala.inline
    def apply(): IntegerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IntegerOptions]
    }
    
    @scala.inline
    implicit class IntegerOptionsMutableBuilder[Self <: IntegerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClamp(value: Boolean): Self = StObject.set(x, "clamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClampUndefined: Self = StObject.set(x, "clamp", js.undefined)
      
      @scala.inline
      def setEnforceRange(value: Boolean): Self = StObject.set(x, "enforceRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnforceRangeUndefined: Self = StObject.set(x, "enforceRange", js.undefined)
    }
  }
  
  type NumberConversion = js.Function2[/* V */ js.Any, /* opts */ js.UndefOr[Options], Double]
  
  trait Options extends StObject {
    
    var context: js.UndefOr[String] = js.undefined
    
    var globals: js.UndefOr[Globals] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setGlobals(value: Globals): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
    }
  }
  
  type Parameters[T /* <: js.Function1[/* repeated */ js.Any, js.Any] */] = js.Any
  
  type StringConversion = js.Function2[/* V */ js.Any, /* opts */ js.UndefOr[StringOptions], String]
  
  trait StringOptions
    extends StObject
       with Options {
    
    var treatNullAsEmptyString: js.UndefOr[Boolean] = js.undefined
  }
  object StringOptions {
    
    @scala.inline
    def apply(): StringOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StringOptions]
    }
    
    @scala.inline
    implicit class StringOptionsMutableBuilder[Self <: StringOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTreatNullAsEmptyString(value: Boolean): Self = StObject.set(x, "treatNullAsEmptyString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreatNullAsEmptyStringUndefined: Self = StObject.set(x, "treatNullAsEmptyString", js.undefined)
    }
  }
}
