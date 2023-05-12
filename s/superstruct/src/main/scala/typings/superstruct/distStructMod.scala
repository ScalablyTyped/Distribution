package typings.superstruct

import typings.superstruct.anon.Coerce
import typings.superstruct.anon.Message
import typings.superstruct.anon.PartialFailure
import typings.superstruct.distErrorMod.Failure
import typings.superstruct.distErrorMod.StructError
import typings.superstruct.distUtilsMod.StructSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distStructMod {
  
  @JSImport("superstruct/dist/struct", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("superstruct/dist/struct", "Struct")
  @js.native
  open class Struct[T, S] protected () extends StObject {
    def this(props: typings.superstruct.anon.Coercer[S, T]) = this()
    
    val TYPE: T = js.native
    
    /**
      * Assert that a value passes the struct's validation, throwing if it doesn't.
      */
    def assert(value: Any): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
    def assert(value: Any, message: String): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
    
    def coercer(value: Any, context: Context): Any = js.native
    
    /**
      * Create a value with the struct's coercion logic, then validate it.
      */
    def create(value: Any): T = js.native
    def create(value: Any, message: String): T = js.native
    
    def entries(value: Any, context: Context): js.Iterable[js.Tuple3[String | Double, Any, Struct[Any | scala.Nothing, Any]]] = js.native
    
    /**
      * Check if a value passes the struct's validation.
      */
    def is(value: Any): /* is T */ Boolean = js.native
    
    /**
      * Mask a value, coercing and validating it, but returning only the subset of
      * properties defined by the struct's schema.
      */
    def mask(value: Any): T = js.native
    def mask(value: Any, message: String): T = js.native
    
    def refiner(value: T, context: Context): js.Iterable[Failure] = js.native
    
    var schema: S = js.native
    
    var `type`: String = js.native
    
    /**
      * Validate a value with the struct's validation logic, returning a tuple
      * representing the result.
      *
      * You may optionally pass `true` for the `withCoercion` argument to coerce
      * the value before attempting to validate it. If you do, the result will
      * contain the coerced result when successful.
      */
    def validate(value: Any): js.Tuple2[StructError | Unit, T | Unit] = js.native
    def validate(value: Any, options: Message): js.Tuple2[StructError | Unit, T | Unit] = js.native
    
    def validator(value: Any, context: Context): js.Iterable[Failure] = js.native
  }
  
  inline def assert[T, S](value: Any, struct: Struct[T, S]): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(value.asInstanceOf[js.Any], struct.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean]
  inline def assert[T, S](value: Any, struct: Struct[T, S], message: String): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(value.asInstanceOf[js.Any], struct.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean]
  
  inline def create[T, S](value: Any, struct: Struct[T, S]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(value.asInstanceOf[js.Any], struct.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def create[T, S](value: Any, struct: Struct[T, S], message: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(value.asInstanceOf[js.Any], struct.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def is[T, S](value: Any, struct: Struct[T, S]): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any], struct.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]
  
  inline def mask[T, S](value: Any, struct: Struct[T, S]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mask")(value.asInstanceOf[js.Any], struct.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def mask[T, S](value: Any, struct: Struct[T, S], message: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mask")(value.asInstanceOf[js.Any], struct.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def validate[T, S](value: Any, struct: Struct[T, S]): js.Tuple2[StructError | Unit, T | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(value.asInstanceOf[js.Any], struct.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[StructError | Unit, T | Unit]]
  inline def validate[T, S](value: Any, struct: Struct[T, S], options: Coerce): js.Tuple2[StructError | Unit, T | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(value.asInstanceOf[js.Any], struct.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[StructError | Unit, T | Unit]]
  
  type Coercer[T] = js.Function2[/* value */ T, /* context */ Context, Any]
  
  trait Context extends StObject {
    
    var branch: js.Array[Any]
    
    var path: js.Array[Any]
  }
  object Context {
    
    inline def apply(branch: js.Array[Any], path: js.Array[Any]): Context = {
      val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      inline def setBranch(value: js.Array[Any]): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      inline def setBranchVarargs(value: Any*): Self = StObject.set(x, "branch", js.Array(value*))
      
      inline def setPath(value: js.Array[Any]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: Any*): Self = StObject.set(x, "path", js.Array(value*))
    }
  }
  
  type Describe[T] = Struct[T, StructSchema[T]]
  
  type Infer[T /* <: Struct[Any, Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: T['TYPE'] */ js.Any
  
  type Refiner[T] = js.Function2[/* value */ T, /* context */ Context, Result]
  
  type Result = Boolean | String | PartialFailure | (js.Iterable[Boolean | String | PartialFailure])
  
  type Validator = js.Function2[/* value */ Any, /* context */ Context, Result]
}
