package typings.superstruct

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import typings.superstruct.anon.PartialFailure
import typings.superstruct.structMod.Struct
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsMod {
  
  type Coercer = js.Function1[/* value */ js.Any, js.Any]
  
  @js.native
  trait Context extends StObject {
    
    var branch: js.Array[_] = js.native
    
    def check[T, S](value: js.Any, struct: Struct[T, S]): Iterable[Failure] = js.native
    def check[T, S](value: js.Any, struct: Struct[T, S], parent: js.UndefOr[scala.Nothing], key: String): Iterable[Failure] = js.native
    def check[T, S](value: js.Any, struct: Struct[T, S], parent: js.UndefOr[scala.Nothing], key: Double): Iterable[Failure] = js.native
    def check[T, S](value: js.Any, struct: Struct[T, S], parent: js.Any): Iterable[Failure] = js.native
    def check[T, S](value: js.Any, struct: Struct[T, S], parent: js.Any, key: String): Iterable[Failure] = js.native
    def check[T, S](value: js.Any, struct: Struct[T, S], parent: js.Any, key: Double): Iterable[Failure] = js.native
    
    def fail(): Failure = js.native
    def fail(props: PartialFailure): Failure = js.native
    
    var path: js.Array[String | Double] = js.native
    
    var refinement: js.UndefOr[String] = js.native
    
    var `type`: String = js.native
    
    var value: js.Any = js.native
  }
  
  @js.native
  trait Failure
    extends /* key */ StringDictionary[js.Any] {
    
    var branch: js.Array[_] = js.native
    
    var path: js.Array[String | Double] = js.native
    
    var refinement: js.UndefOr[String] = js.native
    
    var `type`: String = js.native
    
    var value: /* import warning: importer.ImportType#apply Failed type conversion: superstruct.superstruct/lib/typings.Context['value'] */ js.Any = js.native
  }
  object Failure {
    
    @scala.inline
    def apply(
      branch: js.Array[_],
      path: js.Array[String | Double],
      `type`: String,
      value: /* import warning: importer.ImportType#apply Failed type conversion: superstruct.superstruct/lib/typings.Context['value'] */ js.Any
    ): Failure = {
      val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Failure]
    }
    
    @scala.inline
    implicit class FailureMutableBuilder[Self <: Failure] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBranch(value: js.Array[_]): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBranchVarargs(value: js.Any*): Self = StObject.set(x, "branch", js.Array(value :_*))
      
      @scala.inline
      def setPath(value: js.Array[String | Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathVarargs(value: (String | Double)*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setRefinement(value: String): Self = StObject.set(x, "refinement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefinementUndefined: Self = StObject.set(x, "refinement", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(
        value: /* import warning: importer.ImportType#apply Failed type conversion: superstruct.superstruct/lib/typings.Context['value'] */ js.Any
      ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type Infer[T /* <: Struct[_, _] */] = /* import warning: importer.ImportType#apply Failed type conversion: T['TYPE'] */ js.Any
  
  type Refiner[T] = js.Function2[/* value */ T, /* context */ Context, Result]
  
  type Result = Boolean | Iterable[Failure]
  
  type Validator = js.Function2[/* value */ js.Any, /* context */ Context, Result]
}
