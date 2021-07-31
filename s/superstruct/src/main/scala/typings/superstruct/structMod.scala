package typings.superstruct

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.Iterable
import typings.std.IterableIterator
import typings.superstruct.anon.PartialStructFailurePath
import typings.superstruct.anon.Refiner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object structMod {
  
  @JSImport("superstruct/lib/struct", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("superstruct/lib/struct", "Struct")
  @js.native
  class Struct[T, S] protected () extends StObject {
    def this(props: Refiner[S, T]) = this()
    
    def coercer(value: js.Any): js.Any = js.native
    
    def refiner(value: T, context: StructContext): StructResult = js.native
    
    var schema: S = js.native
    
    var `type`: String = js.native
    
    def validator(value: js.Any, context: StructContext): StructResult = js.native
  }
  
  @JSImport("superstruct/lib/struct", "StructError")
  @js.native
  class StructError protected ()
    extends StObject
       with Error
       with /* key */ StringDictionary[js.Any] {
    def this(failure: StructFailure, moreFailures: IterableIterator[StructFailure]) = this()
    
    var branch: js.Array[js.Any] = js.native
    
    def failures(): js.Array[StructFailure] = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    var path: js.Array[Double | String] = js.native
    
    var `type`: String = js.native
    
    var value: js.Any = js.native
  }
  
  @scala.inline
  def assert[T](value: js.Any, struct: Struct[T, js.Any]): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(value.asInstanceOf[js.Any], struct.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean]
  
  @scala.inline
  def coerce[T](value: js.Any, struct: Struct[T, js.Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("coerce")(value.asInstanceOf[js.Any], struct.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def is[T](value: js.Any, struct: Struct[T, js.Any]): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any], struct.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]
  
  @scala.inline
  def validate[T](value: js.Any, struct: Struct[T, js.Any]): js.Tuple2[StructError | Unit, T | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(value.asInstanceOf[js.Any], struct.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[StructError | Unit, T | Unit]]
  @scala.inline
  def validate[T](value: js.Any, struct: Struct[T, js.Any], coercing: Boolean): js.Tuple2[StructError | Unit, T | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(value.asInstanceOf[js.Any], struct.asInstanceOf[js.Any], coercing.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[StructError | Unit, T | Unit]]
  
  @js.native
  trait StructContext extends StObject {
    
    var branch: js.Array[js.Any] = js.native
    
    def check(value: js.Any, struct: Struct[js.Any | scala.Nothing, js.Any]): IterableIterator[StructFailure] = js.native
    def check(value: js.Any, struct: Struct[js.Any | scala.Nothing, js.Any], parent: js.Any): IterableIterator[StructFailure] = js.native
    def check(value: js.Any, struct: Struct[js.Any | scala.Nothing, js.Any], parent: js.Any, key: String): IterableIterator[StructFailure] = js.native
    def check(value: js.Any, struct: Struct[js.Any | scala.Nothing, js.Any], parent: js.Any, key: Double): IterableIterator[StructFailure] = js.native
    def check(value: js.Any, struct: Struct[js.Any | scala.Nothing, js.Any], parent: Unit, key: String): IterableIterator[StructFailure] = js.native
    def check(value: js.Any, struct: Struct[js.Any | scala.Nothing, js.Any], parent: Unit, key: Double): IterableIterator[StructFailure] = js.native
    
    def fail(): StructFailure = js.native
    def fail(props: PartialStructFailurePath): StructFailure = js.native
    
    var path: js.Array[String | Double] = js.native
    
    var `type`: String = js.native
    
    var value: js.Any = js.native
  }
  
  trait StructFailure
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var branch: js.Array[js.Any]
    
    var path: js.Array[String | Double]
    
    var `type`: String
    
    var value: /* import warning: importer.ImportType#apply Failed type conversion: superstruct.superstruct/lib/struct.StructContext['value'] */ js.Any
  }
  object StructFailure {
    
    @scala.inline
    def apply(
      branch: js.Array[js.Any],
      path: js.Array[String | Double],
      `type`: String,
      value: /* import warning: importer.ImportType#apply Failed type conversion: superstruct.superstruct/lib/struct.StructContext['value'] */ js.Any
    ): StructFailure = {
      val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StructFailure]
    }
    
    @scala.inline
    implicit class StructFailureMutableBuilder[Self <: StructFailure] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBranch(value: js.Array[js.Any]): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBranchVarargs(value: js.Any*): Self = StObject.set(x, "branch", js.Array(value :_*))
      
      @scala.inline
      def setPath(value: js.Array[String | Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathVarargs(value: (String | Double)*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(
        value: /* import warning: importer.ImportType#apply Failed type conversion: superstruct.superstruct/lib/struct.StructContext['value'] */ js.Any
      ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type StructResult = Boolean | Iterable[StructFailure]
  
  type StructType[T /* <: Struct[js.Any, js.Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T['refiner']>[0] */ js.Any
}
