package typings.typpy

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.std.ArrayConstructor
import typings.std.BooleanConstructor
import typings.std.FunctionConstructor
import typings.std.NumberConstructor
import typings.std.ObjectConstructor
import typings.std.RegExpConstructor
import typings.std.StringConstructor
import typings.typpy.typpyBooleans.`false`
import typings.typpy.typpyBooleans.`true`
import typings.typpy.typpyStrings.`null`
import typings.typpy.typpyStrings.`object`
import typings.typpy.typpyStrings.array
import typings.typpy.typpyStrings.boolean
import typings.typpy.typpyStrings.function
import typings.typpy.typpyStrings.nan
import typings.typpy.typpyStrings.number
import typings.typpy.typpyStrings.regexp
import typings.typpy.typpyStrings.string
import typings.typpy.typpyStrings.undefined
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("typpy", JSImport.Namespace)
  @js.native
  val ^ : js.Object & TyppyFn = js.native
  
  @js.native
  trait CompareFn extends StObject {
    
    def apply(): `true` = js.native
    def apply(input: String, compareTo: StringConstructor): `true` = js.native
    def apply(input: String, compareTo: string): `true` = js.native
    def apply(input: js.Array[Any], compareTo: ArrayConstructor): `true` = js.native
    def apply(input: js.Array[Any], compareTo: array): `true` = js.native
    def apply(input: js.Function, compareTo: FunctionConstructor): `true` = js.native
    def apply(input: js.Function, compareTo: function): `true` = js.native
    def apply(input: js.Object, compareTo: ObjectConstructor): Boolean = js.native
    def apply(input: js.Object, compareTo: `object`): Boolean = js.native
    def apply(input: js.RegExp, compareTo: RegExpConstructor): `true` = js.native
    def apply(input: js.RegExp, compareTo: regexp): `true` = js.native
    def apply(input: Any, compareTo: Any): Boolean = js.native
    def apply(input: Boolean, compareTo: BooleanConstructor): `true` = js.native
    def apply(input: Boolean, compareTo: boolean): `true` = js.native
    def apply(input: Double, compareTo: number | nan): Boolean = js.native
    def apply(input: Double, compareTo: Double): Boolean = js.native
    // tslint:disable-line:ban-types
    def apply(input: Double, compareTo: NumberConstructor): Boolean = js.native
    def apply(input: Null, compareTo: `null`): `true` = js.native
    def apply(input: Unit, compareTo: undefined): `true` = js.native
  }
  
  @js.native
  trait ConstructorFn
    extends StObject
       with Instantiable1[/* args (repeated) */ Any, Any]
  
  @js.native
  trait GetFn extends StObject {
    
    def apply(): Null = js.native
    def apply(input: String): StringConstructor = js.native
    def apply(input: String, asString: `false`): StringConstructor = js.native
    def apply(input: String, asString: `true`): string = js.native
    def apply(input: js.Array[Any]): ArrayConstructor = js.native
    def apply(input: js.Array[Any], asString: `false`): ArrayConstructor = js.native
    def apply(input: js.Array[Any], asString: `true`): array = js.native
    def apply(input: js.Function): FunctionConstructor = js.native
    def apply(input: js.Function, asString: `false`): FunctionConstructor = js.native
    def apply(input: js.Function, asString: `true`): function = js.native
    def apply(input: js.RegExp): RegExpConstructor = js.native
    def apply(input: js.RegExp, asString: `false`): RegExpConstructor = js.native
    def apply(input: js.RegExp, asString: `true`): regexp = js.native
    // tslint:disable-line:ban-types
    def apply(input: Any): ConstructorFn = js.native
    def apply(input: Any, asString: `false`): ConstructorFn = js.native
    // tslint:disable-line:ban-types
    def apply(input: Any, asString: `true`): String = js.native
    def apply(input: Boolean): BooleanConstructor = js.native
    def apply(input: Boolean, asString: `false`): BooleanConstructor = js.native
    def apply(input: Boolean, asString: `true`): boolean = js.native
    def apply(input: Double): NumberConstructor | Double = js.native
    def apply(input: Double, asString: `false`): NumberConstructor | Double = js.native
    def apply(input: Double, asString: `true`): number | nan = js.native
    def apply(input: Null, asString: `false`): Null = js.native
    def apply(input: Null, asString: `true`): `null` = js.native
    def apply(input: Unit, asString: `false`): Unit = js.native
    def apply(input: Unit, asString: `true`): undefined = js.native
  }
  
  @js.native
  trait IsFn extends StObject {
    
    def apply(input: String): string = js.native
    def apply(input: js.Array[Any]): array = js.native
    def apply(input: js.Function): function = js.native
    def apply(input: js.RegExp): regexp = js.native
    def apply(input: Any): String = js.native
    def apply(input: Boolean): boolean = js.native
    // tslint:disable-line:ban-types
    def apply(input: Double): number | nan = js.native
    def apply(input: Null): `null` = js.native
    def apply(input: Unit): undefined = js.native
  }
  
  @js.native
  trait TyppyFn
    extends StObject
       with IsFn
       with CompareFn {
    
    def get(): Null = js.native
    def get(input: String): StringConstructor = js.native
    def get(input: js.Array[Any]): ArrayConstructor = js.native
    def get(input: js.Function): FunctionConstructor = js.native
    def get(input: js.RegExp): RegExpConstructor = js.native
    // tslint:disable-line:ban-types
    def get(input: Any): ConstructorFn = js.native
    def get(input: Boolean): BooleanConstructor = js.native
    def get(input: Double): NumberConstructor | Double = js.native
    @JSName("get")
    var get_Original: GetFn = js.native
    @JSName("get")
    def get_Unit(): Unit = js.native
    @JSName("get")
    def get_false(input: String, asString: `false`): StringConstructor = js.native
    @JSName("get")
    def get_false(input: js.Array[Any], asString: `false`): ArrayConstructor = js.native
    @JSName("get")
    def get_false(input: js.Function, asString: `false`): FunctionConstructor = js.native
    @JSName("get")
    def get_false(input: js.RegExp, asString: `false`): RegExpConstructor = js.native
    @JSName("get")
    def get_false(input: Any, asString: `false`): ConstructorFn = js.native
    @JSName("get")
    def get_false(input: Boolean, asString: `false`): BooleanConstructor = js.native
    @JSName("get")
    def get_false(input: Double, asString: `false`): NumberConstructor | Double = js.native
    @JSName("get")
    def get_false(input: Null, asString: `false`): Null = js.native
    @JSName("get")
    def get_false(input: Unit, asString: `false`): Unit = js.native
    @JSName("get")
    def get_true(input: String, asString: `true`): string = js.native
    @JSName("get")
    def get_true(input: js.Array[Any], asString: `true`): array = js.native
    @JSName("get")
    def get_true(input: js.Function, asString: `true`): function = js.native
    @JSName("get")
    def get_true(input: js.RegExp, asString: `true`): regexp = js.native
    // tslint:disable-line:ban-types
    @JSName("get")
    def get_true(input: Any, asString: `true`): String = js.native
    @JSName("get")
    def get_true(input: Boolean, asString: `true`): boolean = js.native
    @JSName("get")
    def get_true(input: Double, asString: `true`): number | nan = js.native
    @JSName("get")
    def get_true(input: Null, asString: `true`): `null` = js.native
    @JSName("get")
    def get_true(input: Unit, asString: `true`): undefined = js.native
    
    def is(): `true` = js.native
    def is(input: String, compareTo: StringConstructor): `true` = js.native
    def is(input: js.Array[Any], compareTo: ArrayConstructor): `true` = js.native
    def is(input: js.Function, compareTo: FunctionConstructor): `true` = js.native
    def is(input: js.Object, compareTo: ObjectConstructor): Boolean = js.native
    def is(input: js.RegExp, compareTo: RegExpConstructor): `true` = js.native
    def is(input: Any, compareTo: Any): Boolean = js.native
    def is(input: Boolean, compareTo: BooleanConstructor): `true` = js.native
    def is(input: Double, compareTo: number | nan): Boolean = js.native
    def is(input: Double, compareTo: Double): Boolean = js.native
    // tslint:disable-line:ban-types
    def is(input: Double, compareTo: NumberConstructor): Boolean = js.native
    @JSName("is")
    var is_Original: CompareFn = js.native
    @JSName("is")
    def is_array(input: js.Array[Any], compareTo: array): `true` = js.native
    @JSName("is")
    def is_boolean(input: Boolean, compareTo: boolean): `true` = js.native
    @JSName("is")
    def is_function(input: js.Function, compareTo: function): `true` = js.native
    @JSName("is")
    def is_null(input: Null, compareTo: `null`): `true` = js.native
    @JSName("is")
    def is_object(input: js.Object, compareTo: `object`): Boolean = js.native
    @JSName("is")
    def is_regexp(input: js.RegExp, compareTo: regexp): `true` = js.native
    @JSName("is")
    def is_string(input: String, compareTo: string): `true` = js.native
    @JSName("is")
    def is_undefined(input: Unit, compareTo: undefined): `true` = js.native
  }
  
  type _To = js.Object & TyppyFn
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & TyppyFn = ^
}
