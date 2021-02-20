package typings.superstruct

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.Iterable
import typings.std.IterableIterator
import typings.superstruct.anon.PartialStructFailurePath
import typings.superstruct.anon.Refiner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object structMod {
  
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
    extends Error
       with /* key */ StringDictionary[js.Any] {
    def this(failure: StructFailure, moreFailures: IterableIterator[StructFailure]) = this()
    
    var branch: js.Array[_] = js.native
    
    def failures(): js.Array[StructFailure] = js.native
    
    var path: js.Array[Double | String] = js.native
    
    var `type`: String = js.native
    
    var value: js.Any = js.native
  }
  
  @JSImport("superstruct/lib/struct", "assert")
  @js.native
  def assert[T](value: js.Any, struct: Struct[T, _]): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  
  @JSImport("superstruct/lib/struct", "coerce")
  @js.native
  def coerce[T](value: js.Any, struct: Struct[T, _]): T = js.native
  
  @JSImport("superstruct/lib/struct", "is")
  @js.native
  def is[T](value: js.Any, struct: Struct[T, _]): /* is T */ Boolean = js.native
  
  @JSImport("superstruct/lib/struct", "validate")
  @js.native
  def validate[T](value: js.Any, struct: Struct[T, _]): js.Tuple2[js.UndefOr[StructError], js.UndefOr[T]] = js.native
  @JSImport("superstruct/lib/struct", "validate")
  @js.native
  def validate[T](value: js.Any, struct: Struct[T, _], coercing: Boolean): js.Tuple2[js.UndefOr[StructError], js.UndefOr[T]] = js.native
  
  @js.native
  trait StructContext extends StObject {
    
    var branch: js.Array[_] = js.native
    
    def check(value: js.Any, struct: Struct[_ | scala.Nothing, _]): IterableIterator[StructFailure] = js.native
    def check(
      value: js.Any,
      struct: Struct[_ | scala.Nothing, _],
      parent: js.UndefOr[scala.Nothing],
      key: String
    ): IterableIterator[StructFailure] = js.native
    def check(
      value: js.Any,
      struct: Struct[_ | scala.Nothing, _],
      parent: js.UndefOr[scala.Nothing],
      key: Double
    ): IterableIterator[StructFailure] = js.native
    def check(value: js.Any, struct: Struct[_ | scala.Nothing, _], parent: js.Any): IterableIterator[StructFailure] = js.native
    def check(value: js.Any, struct: Struct[_ | scala.Nothing, _], parent: js.Any, key: String): IterableIterator[StructFailure] = js.native
    def check(value: js.Any, struct: Struct[_ | scala.Nothing, _], parent: js.Any, key: Double): IterableIterator[StructFailure] = js.native
    
    def fail(): StructFailure = js.native
    def fail(props: PartialStructFailurePath): StructFailure = js.native
    
    var path: js.Array[String | Double] = js.native
    
    var `type`: String = js.native
    
    var value: js.Any = js.native
  }
  
  @js.native
  trait StructFailure
    extends /* key */ StringDictionary[js.Any] {
    
    var branch: js.Array[_] = js.native
    
    var path: js.Array[String | Double] = js.native
    
    var `type`: String = js.native
    
    var value: /* import warning: importer.ImportType#apply Failed type conversion: superstruct.superstruct/lib/struct.StructContext['value'] */ js.Any = js.native
  }
  object StructFailure {
    
    @scala.inline
    def apply(
      branch: js.Array[_],
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
      def setBranch(value: js.Array[_]): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
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
  
  type StructType[T /* <: Struct[_, _] */] = /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T['refiner']>[0] */ js.Any
}
