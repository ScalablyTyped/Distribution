package typings.superstruct

import org.scalablytyped.runtime.Instantiable1
import typings.superstruct.indexCjsMod.StructContext
import typings.superstruct.indexCjsMod.StructResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Coercer[S, T] extends StObject {
    
    var coercer: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.native
    
    var refiner: js.UndefOr[js.Function2[/* value */ T, /* context */ StructContext, StructResult]] = js.native
    
    var schema: S = js.native
    
    var `type`: String = js.native
    
    var validator: js.UndefOr[js.Function2[/* value */ js.Any, /* context */ StructContext, StructResult]] = js.native
  }
  object Coercer {
    
    @scala.inline
    def apply[S, T](schema: S, `type`: String): Coercer[S, T] = {
      val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Coercer[S, T]]
    }
    
    @scala.inline
    implicit class CoercerMutableBuilder[Self <: Coercer[_, _], S, T] (val x: Self with (Coercer[S, T])) extends AnyVal {
      
      @scala.inline
      def setCoercer(value: /* value */ js.Any => _): Self = StObject.set(x, "coercer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCoercerUndefined: Self = StObject.set(x, "coercer", js.undefined)
      
      @scala.inline
      def setRefiner(value: (/* value */ T, /* context */ StructContext) => StructResult): Self = StObject.set(x, "refiner", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRefinerUndefined: Self = StObject.set(x, "refiner", js.undefined)
      
      @scala.inline
      def setSchema(value: S): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidator(value: (/* value */ js.Any, /* context */ StructContext) => StructResult): Self = StObject.set(x, "validator", js.Any.fromFunction2(value))
      
      @scala.inline
      def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
    }
  }
  
  @js.native
  trait Instantiable
    extends Instantiable1[/* args */ js.Any, js.Any]
  
  /* Inlined std.Partial<superstruct.superstruct/lib/typings.Failure> */
  @js.native
  trait PartialFailure extends StObject {
    
    var branch: js.UndefOr[js.Array[_]] = js.native
    
    var path: js.UndefOr[js.Array[String | Double]] = js.native
    
    var refinement: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: superstruct.superstruct/lib/typings.Context['value'] */ js.Any
      ] = js.native
  }
  object PartialFailure {
    
    @scala.inline
    def apply(): PartialFailure = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFailure]
    }
    
    @scala.inline
    implicit class PartialFailureMutableBuilder[Self <: PartialFailure] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBranch(value: js.Array[_]): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
      
      @scala.inline
      def setBranchVarargs(value: js.Any*): Self = StObject.set(x, "branch", js.Array(value :_*))
      
      @scala.inline
      def setPath(value: js.Array[String | Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPathVarargs(value: (String | Double)*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setRefinement(value: String): Self = StObject.set(x, "refinement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefinementUndefined: Self = StObject.set(x, "refinement", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(
        value: /* import warning: importer.ImportType#apply Failed type conversion: superstruct.superstruct/lib/typings.Context['value'] */ js.Any
      ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined std.Partial<superstruct.superstruct/lib/index.cjs.StructFailure> */
  @js.native
  trait PartialStructFailure extends StObject {
    
    var branch: js.UndefOr[js.Array[_]] = js.native
    
    var path: js.UndefOr[js.Array[String | Double]] = js.native
    
    var `type`: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: superstruct.superstruct/lib/index.cjs.StructContext['value'] */ js.Any
      ] = js.native
  }
  object PartialStructFailure {
    
    @scala.inline
    def apply(): PartialStructFailure = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialStructFailure]
    }
    
    @scala.inline
    implicit class PartialStructFailureMutableBuilder[Self <: PartialStructFailure] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBranch(value: js.Array[_]): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
      
      @scala.inline
      def setBranchVarargs(value: js.Any*): Self = StObject.set(x, "branch", js.Array(value :_*))
      
      @scala.inline
      def setPath(value: js.Array[String | Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPathVarargs(value: (String | Double)*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(
        value: /* import warning: importer.ImportType#apply Failed type conversion: superstruct.superstruct/lib/index.cjs.StructContext['value'] */ js.Any
      ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined std.Partial<superstruct.superstruct/lib/index.es.StructFailure> */
  @js.native
  trait PartialStructFailureBranch extends StObject {
    
    var branch: js.UndefOr[js.Array[_]] = js.native
    
    var path: js.UndefOr[js.Array[String | Double]] = js.native
    
    var `type`: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: superstruct.superstruct/lib/index.es.StructContext['value'] */ js.Any
      ] = js.native
  }
  object PartialStructFailureBranch {
    
    @scala.inline
    def apply(): PartialStructFailureBranch = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialStructFailureBranch]
    }
    
    @scala.inline
    implicit class PartialStructFailureBranchMutableBuilder[Self <: PartialStructFailureBranch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBranch(value: js.Array[_]): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
      
      @scala.inline
      def setBranchVarargs(value: js.Any*): Self = StObject.set(x, "branch", js.Array(value :_*))
      
      @scala.inline
      def setPath(value: js.Array[String | Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPathVarargs(value: (String | Double)*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(
        value: /* import warning: importer.ImportType#apply Failed type conversion: superstruct.superstruct/lib/index.es.StructContext['value'] */ js.Any
      ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined std.Partial<superstruct.superstruct/lib/struct.StructFailure> */
  @js.native
  trait PartialStructFailurePath extends StObject {
    
    var branch: js.UndefOr[js.Array[_]] = js.native
    
    var path: js.UndefOr[js.Array[String | Double]] = js.native
    
    var `type`: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: superstruct.superstruct/lib/struct.StructContext['value'] */ js.Any
      ] = js.native
  }
  object PartialStructFailurePath {
    
    @scala.inline
    def apply(): PartialStructFailurePath = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialStructFailurePath]
    }
    
    @scala.inline
    implicit class PartialStructFailurePathMutableBuilder[Self <: PartialStructFailurePath] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBranch(value: js.Array[_]): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
      
      @scala.inline
      def setBranchVarargs(value: js.Any*): Self = StObject.set(x, "branch", js.Array(value :_*))
      
      @scala.inline
      def setPath(value: js.Array[String | Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPathVarargs(value: (String | Double)*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(
        value: /* import warning: importer.ImportType#apply Failed type conversion: superstruct.superstruct/lib/struct.StructContext['value'] */ js.Any
      ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait Refiner[S, T] extends StObject {
    
    var coercer: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.native
    
    var refiner: js.UndefOr[
        js.Function2[
          /* value */ T, 
          /* context */ typings.superstruct.structMod.StructContext, 
          typings.superstruct.structMod.StructResult
        ]
      ] = js.native
    
    var schema: S = js.native
    
    var `type`: String = js.native
    
    var validator: js.UndefOr[
        js.Function2[
          /* value */ js.Any, 
          /* context */ typings.superstruct.structMod.StructContext, 
          typings.superstruct.structMod.StructResult
        ]
      ] = js.native
  }
  object Refiner {
    
    @scala.inline
    def apply[S, T](schema: S, `type`: String): Refiner[S, T] = {
      val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Refiner[S, T]]
    }
    
    @scala.inline
    implicit class RefinerMutableBuilder[Self <: Refiner[_, _], S, T] (val x: Self with (Refiner[S, T])) extends AnyVal {
      
      @scala.inline
      def setCoercer(value: /* value */ js.Any => _): Self = StObject.set(x, "coercer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCoercerUndefined: Self = StObject.set(x, "coercer", js.undefined)
      
      @scala.inline
      def setRefiner(
        value: (/* value */ T, /* context */ typings.superstruct.structMod.StructContext) => typings.superstruct.structMod.StructResult
      ): Self = StObject.set(x, "refiner", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRefinerUndefined: Self = StObject.set(x, "refiner", js.undefined)
      
      @scala.inline
      def setSchema(value: S): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidator(
        value: (/* value */ js.Any, /* context */ typings.superstruct.structMod.StructContext) => typings.superstruct.structMod.StructResult
      ): Self = StObject.set(x, "validator", js.Any.fromFunction2(value))
      
      @scala.inline
      def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
    }
  }
  
  @js.native
  trait Schema[S, T] extends StObject {
    
    var coercer: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.native
    
    var refiner: js.UndefOr[
        js.Function2[
          /* value */ T, 
          /* context */ typings.superstruct.indexEsMod.StructContext, 
          typings.superstruct.indexEsMod.StructResult
        ]
      ] = js.native
    
    var schema: S = js.native
    
    var `type`: String = js.native
    
    var validator: js.UndefOr[
        js.Function2[
          /* value */ js.Any, 
          /* context */ typings.superstruct.indexEsMod.StructContext, 
          typings.superstruct.indexEsMod.StructResult
        ]
      ] = js.native
  }
  object Schema {
    
    @scala.inline
    def apply[S, T](schema: S, `type`: String): Schema[S, T] = {
      val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Schema[S, T]]
    }
    
    @scala.inline
    implicit class SchemaMutableBuilder[Self <: Schema[_, _], S, T] (val x: Self with (Schema[S, T])) extends AnyVal {
      
      @scala.inline
      def setCoercer(value: /* value */ js.Any => _): Self = StObject.set(x, "coercer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCoercerUndefined: Self = StObject.set(x, "coercer", js.undefined)
      
      @scala.inline
      def setRefiner(
        value: (/* value */ T, /* context */ typings.superstruct.indexEsMod.StructContext) => typings.superstruct.indexEsMod.StructResult
      ): Self = StObject.set(x, "refiner", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRefinerUndefined: Self = StObject.set(x, "refiner", js.undefined)
      
      @scala.inline
      def setSchema(value: S): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidator(
        value: (/* value */ js.Any, /* context */ typings.superstruct.indexEsMod.StructContext) => typings.superstruct.indexEsMod.StructResult
      ): Self = StObject.set(x, "validator", js.Any.fromFunction2(value))
      
      @scala.inline
      def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
    }
  }
}
