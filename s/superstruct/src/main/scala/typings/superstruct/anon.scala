package typings.superstruct

import org.scalablytyped.runtime.Instantiable1
import typings.superstruct.indexCjsMod.StructContext
import typings.superstruct.indexCjsMod.StructResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Coercer[S, T] extends StObject {
    
    var coercer: js.UndefOr[js.Function1[/* value */ js.Any, js.Any]] = js.undefined
    
    var refiner: js.UndefOr[js.Function2[/* value */ T, /* context */ StructContext, StructResult]] = js.undefined
    
    var schema: S
    
    var `type`: String
    
    var validator: js.UndefOr[js.Function2[/* value */ js.Any, /* context */ StructContext, StructResult]] = js.undefined
  }
  object Coercer {
    
    inline def apply[S, T](schema: S, `type`: String): Coercer[S, T] = {
      val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Coercer[S, T]]
    }
    
    extension [Self <: Coercer[?, ?], S, T](x: Self & (Coercer[S, T])) {
      
      inline def setCoercer(value: /* value */ js.Any => js.Any): Self = StObject.set(x, "coercer", js.Any.fromFunction1(value))
      
      inline def setCoercerUndefined: Self = StObject.set(x, "coercer", js.undefined)
      
      inline def setRefiner(value: (/* value */ T, /* context */ StructContext) => StructResult): Self = StObject.set(x, "refiner", js.Any.fromFunction2(value))
      
      inline def setRefinerUndefined: Self = StObject.set(x, "refiner", js.undefined)
      
      inline def setSchema(value: S): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValidator(value: (/* value */ js.Any, /* context */ StructContext) => StructResult): Self = StObject.set(x, "validator", js.Any.fromFunction2(value))
      
      inline def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
    }
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable1[/* args */ js.Any, js.Any]
  
  /* Inlined std.Partial<superstruct.superstruct/lib/typings.Failure> */
  trait PartialFailure extends StObject {
    
    var branch: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var path: js.UndefOr[js.Array[String | Double]] = js.undefined
    
    var refinement: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: superstruct.superstruct/lib/typings.Context['value'] */ js.Any
      ] = js.undefined
  }
  object PartialFailure {
    
    inline def apply(): PartialFailure = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFailure]
    }
    
    extension [Self <: PartialFailure](x: Self) {
      
      inline def setBranch(value: js.Array[js.Any]): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      inline def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
      
      inline def setBranchVarargs(value: js.Any*): Self = StObject.set(x, "branch", js.Array(value :_*))
      
      inline def setPath(value: js.Array[String | Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPathVarargs(value: (String | Double)*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      inline def setRefinement(value: String): Self = StObject.set(x, "refinement", value.asInstanceOf[js.Any])
      
      inline def setRefinementUndefined: Self = StObject.set(x, "refinement", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(
        value: /* import warning: importer.ImportType#apply Failed type conversion: superstruct.superstruct/lib/typings.Context['value'] */ js.Any
      ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined std.Partial<superstruct.superstruct/lib/index.cjs.StructFailure> */
  trait PartialStructFailure extends StObject {
    
    var branch: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var path: js.UndefOr[js.Array[String | Double]] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: superstruct.superstruct/lib/index.cjs.StructContext['value'] */ js.Any
      ] = js.undefined
  }
  object PartialStructFailure {
    
    inline def apply(): PartialStructFailure = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialStructFailure]
    }
    
    extension [Self <: PartialStructFailure](x: Self) {
      
      inline def setBranch(value: js.Array[js.Any]): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      inline def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
      
      inline def setBranchVarargs(value: js.Any*): Self = StObject.set(x, "branch", js.Array(value :_*))
      
      inline def setPath(value: js.Array[String | Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPathVarargs(value: (String | Double)*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(
        value: /* import warning: importer.ImportType#apply Failed type conversion: superstruct.superstruct/lib/index.cjs.StructContext['value'] */ js.Any
      ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined std.Partial<superstruct.superstruct/lib/index.es.StructFailure> */
  trait PartialStructFailureBranch extends StObject {
    
    var branch: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var path: js.UndefOr[js.Array[String | Double]] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: superstruct.superstruct/lib/index.es.StructContext['value'] */ js.Any
      ] = js.undefined
  }
  object PartialStructFailureBranch {
    
    inline def apply(): PartialStructFailureBranch = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialStructFailureBranch]
    }
    
    extension [Self <: PartialStructFailureBranch](x: Self) {
      
      inline def setBranch(value: js.Array[js.Any]): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      inline def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
      
      inline def setBranchVarargs(value: js.Any*): Self = StObject.set(x, "branch", js.Array(value :_*))
      
      inline def setPath(value: js.Array[String | Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPathVarargs(value: (String | Double)*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(
        value: /* import warning: importer.ImportType#apply Failed type conversion: superstruct.superstruct/lib/index.es.StructContext['value'] */ js.Any
      ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined std.Partial<superstruct.superstruct/lib/struct.StructFailure> */
  trait PartialStructFailurePath extends StObject {
    
    var branch: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var path: js.UndefOr[js.Array[String | Double]] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: superstruct.superstruct/lib/struct.StructContext['value'] */ js.Any
      ] = js.undefined
  }
  object PartialStructFailurePath {
    
    inline def apply(): PartialStructFailurePath = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialStructFailurePath]
    }
    
    extension [Self <: PartialStructFailurePath](x: Self) {
      
      inline def setBranch(value: js.Array[js.Any]): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      inline def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
      
      inline def setBranchVarargs(value: js.Any*): Self = StObject.set(x, "branch", js.Array(value :_*))
      
      inline def setPath(value: js.Array[String | Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPathVarargs(value: (String | Double)*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(
        value: /* import warning: importer.ImportType#apply Failed type conversion: superstruct.superstruct/lib/struct.StructContext['value'] */ js.Any
      ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Refiner[S, T] extends StObject {
    
    var coercer: js.UndefOr[js.Function1[/* value */ js.Any, js.Any]] = js.undefined
    
    var refiner: js.UndefOr[
        js.Function2[
          /* value */ T, 
          /* context */ typings.superstruct.structMod.StructContext, 
          typings.superstruct.structMod.StructResult
        ]
      ] = js.undefined
    
    var schema: S
    
    var `type`: String
    
    var validator: js.UndefOr[
        js.Function2[
          /* value */ js.Any, 
          /* context */ typings.superstruct.structMod.StructContext, 
          typings.superstruct.structMod.StructResult
        ]
      ] = js.undefined
  }
  object Refiner {
    
    inline def apply[S, T](schema: S, `type`: String): Refiner[S, T] = {
      val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Refiner[S, T]]
    }
    
    extension [Self <: Refiner[?, ?], S, T](x: Self & (Refiner[S, T])) {
      
      inline def setCoercer(value: /* value */ js.Any => js.Any): Self = StObject.set(x, "coercer", js.Any.fromFunction1(value))
      
      inline def setCoercerUndefined: Self = StObject.set(x, "coercer", js.undefined)
      
      inline def setRefiner(
        value: (/* value */ T, /* context */ typings.superstruct.structMod.StructContext) => typings.superstruct.structMod.StructResult
      ): Self = StObject.set(x, "refiner", js.Any.fromFunction2(value))
      
      inline def setRefinerUndefined: Self = StObject.set(x, "refiner", js.undefined)
      
      inline def setSchema(value: S): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValidator(
        value: (/* value */ js.Any, /* context */ typings.superstruct.structMod.StructContext) => typings.superstruct.structMod.StructResult
      ): Self = StObject.set(x, "validator", js.Any.fromFunction2(value))
      
      inline def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
    }
  }
  
  trait Schema[S, T] extends StObject {
    
    var coercer: js.UndefOr[js.Function1[/* value */ js.Any, js.Any]] = js.undefined
    
    var refiner: js.UndefOr[
        js.Function2[
          /* value */ T, 
          /* context */ typings.superstruct.indexEsMod.StructContext, 
          typings.superstruct.indexEsMod.StructResult
        ]
      ] = js.undefined
    
    var schema: S
    
    var `type`: String
    
    var validator: js.UndefOr[
        js.Function2[
          /* value */ js.Any, 
          /* context */ typings.superstruct.indexEsMod.StructContext, 
          typings.superstruct.indexEsMod.StructResult
        ]
      ] = js.undefined
  }
  object Schema {
    
    inline def apply[S, T](schema: S, `type`: String): Schema[S, T] = {
      val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Schema[S, T]]
    }
    
    extension [Self <: Schema[?, ?], S, T](x: Self & (Schema[S, T])) {
      
      inline def setCoercer(value: /* value */ js.Any => js.Any): Self = StObject.set(x, "coercer", js.Any.fromFunction1(value))
      
      inline def setCoercerUndefined: Self = StObject.set(x, "coercer", js.undefined)
      
      inline def setRefiner(
        value: (/* value */ T, /* context */ typings.superstruct.indexEsMod.StructContext) => typings.superstruct.indexEsMod.StructResult
      ): Self = StObject.set(x, "refiner", js.Any.fromFunction2(value))
      
      inline def setRefinerUndefined: Self = StObject.set(x, "refiner", js.undefined)
      
      inline def setSchema(value: S): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValidator(
        value: (/* value */ js.Any, /* context */ typings.superstruct.indexEsMod.StructContext) => typings.superstruct.indexEsMod.StructResult
      ): Self = StObject.set(x, "validator", js.Any.fromFunction2(value))
      
      inline def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
    }
  }
}
