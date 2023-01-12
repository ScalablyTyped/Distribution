package typings.superstruct

import org.scalablytyped.runtime.Instantiable1
import typings.superstruct.libStructMod.Context
import typings.superstruct.libStructMod.Refiner
import typings.superstruct.libStructMod.Result
import typings.superstruct.libStructMod.Struct
import typings.superstruct.libStructMod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var coerce: js.UndefOr[Boolean] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def setCoerce(value: Boolean): Self = StObject.set(x, "coerce", value.asInstanceOf[js.Any])
      
      inline def setCoerceUndefined: Self = StObject.set(x, "coerce", js.undefined)
    }
  }
  
  trait Branch extends StObject {
    
    var branch: js.UndefOr[js.Array[Any]] = js.undefined
    
    var coerce: js.UndefOr[Boolean] = js.undefined
    
    var mask: js.UndefOr[Boolean] = js.undefined
    
    var path: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object Branch {
    
    inline def apply(): Branch = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Branch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Branch] (val x: Self) extends AnyVal {
      
      inline def setBranch(value: js.Array[Any]): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      inline def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
      
      inline def setBranchVarargs(value: Any*): Self = StObject.set(x, "branch", js.Array(value*))
      
      inline def setCoerce(value: Boolean): Self = StObject.set(x, "coerce", value.asInstanceOf[js.Any])
      
      inline def setCoerceUndefined: Self = StObject.set(x, "coerce", js.undefined)
      
      inline def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setPath(value: js.Array[Any]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPathVarargs(value: Any*): Self = StObject.set(x, "path", js.Array(value*))
    }
  }
  
  trait Coerce extends StObject {
    
    var coerce: js.UndefOr[Boolean] = js.undefined
    
    var mask: js.UndefOr[Boolean] = js.undefined
  }
  object Coerce {
    
    inline def apply(): Coerce = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Coerce]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Coerce] (val x: Self) extends AnyVal {
      
      inline def setCoerce(value: Boolean): Self = StObject.set(x, "coerce", value.asInstanceOf[js.Any])
      
      inline def setCoerceUndefined: Self = StObject.set(x, "coerce", js.undefined)
      
      inline def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    }
  }
  
  trait Coercer[S, T] extends StObject {
    
    var coercer: js.UndefOr[typings.superstruct.libStructMod.Coercer[Any]] = js.undefined
    
    var entries: js.UndefOr[
        js.Function2[
          /* value */ Any, 
          /* context */ Context, 
          js.Iterable[js.Tuple3[String | Double, Any, Struct[Any | scala.Nothing, Any]]]
        ]
      ] = js.undefined
    
    var refiner: js.UndefOr[Refiner[T]] = js.undefined
    
    var schema: S
    
    var `type`: String
    
    var validator: js.UndefOr[Validator] = js.undefined
  }
  object Coercer {
    
    inline def apply[S, T](schema: S, `type`: String): Coercer[S, T] = {
      val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Coercer[S, T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Coercer[?, ?], S, T] (val x: Self & (Coercer[S, T])) extends AnyVal {
      
      inline def setCoercer(value: (Any, /* context */ Context) => Any): Self = StObject.set(x, "coercer", js.Any.fromFunction2(value))
      
      inline def setCoercerUndefined: Self = StObject.set(x, "coercer", js.undefined)
      
      inline def setEntries(
        value: (/* value */ Any, /* context */ Context) => js.Iterable[js.Tuple3[String | Double, Any, Struct[Any | scala.Nothing, Any]]]
      ): Self = StObject.set(x, "entries", js.Any.fromFunction2(value))
      
      inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
      
      inline def setRefiner(value: (T, /* context */ Context) => Result): Self = StObject.set(x, "refiner", js.Any.fromFunction2(value))
      
      inline def setRefinerUndefined: Self = StObject.set(x, "refiner", js.undefined)
      
      inline def setSchema(value: S): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValidator(value: (/* value */ Any, /* context */ Context) => Result): Self = StObject.set(x, "validator", js.Any.fromFunction2(value))
      
      inline def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
    }
  }
  
  trait Exclusive extends StObject {
    
    var exclusive: js.UndefOr[Boolean] = js.undefined
  }
  object Exclusive {
    
    inline def apply(): Exclusive = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Exclusive]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Exclusive] (val x: Self) extends AnyVal {
      
      inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      inline def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
    }
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable1[/* args */ Any, Any]
  
  /* Inlined std.Partial<superstruct.superstruct/lib/error.Failure> */
  trait PartialFailure extends StObject {
    
    var branch: js.UndefOr[js.Array[Any]] = js.undefined
    
    var key: js.UndefOr[Any] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[js.Array[Any]] = js.undefined
    
    var refinement: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[Any] = js.undefined
  }
  object PartialFailure {
    
    inline def apply(): PartialFailure = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFailure]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialFailure] (val x: Self) extends AnyVal {
      
      inline def setBranch(value: js.Array[Any]): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      inline def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
      
      inline def setBranchVarargs(value: Any*): Self = StObject.set(x, "branch", js.Array(value*))
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setPath(value: js.Array[Any]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPathVarargs(value: Any*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setRefinement(value: String): Self = StObject.set(x, "refinement", value.asInstanceOf[js.Any])
      
      inline def setRefinementUndefined: Self = StObject.set(x, "refinement", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Strict extends StObject {
    
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object Strict {
    
    inline def apply(): Strict = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Strict]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Strict] (val x: Self) extends AnyVal {
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
}
