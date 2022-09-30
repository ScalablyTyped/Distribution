package typings.testcafeSafeStorage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templateMod {
  
  @JSImport("testcafe-safe-storage/lib/utils/template", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def T[TT /* <: js.Array[Any] */](x: String): Template[TT] = ^.asInstanceOf[js.Dynamic].applyDynamic("T")(x.asInstanceOf[js.Any]).asInstanceOf[Template[TT]]
  inline def T[TT /* <: js.Array[Any] */](x: TemplateLambda[TT]): Template[TT] = ^.asInstanceOf[js.Dynamic].applyDynamic("T")(x.asInstanceOf[js.Any]).asInstanceOf[Template[TT]]
  
  @JSImport("testcafe-safe-storage/lib/utils/template", "Template")
  @js.native
  open class Template[T /* <: js.Array[Any] */] protected () extends StObject {
    /* protected */ def this(t: TemplateLambda[T]) = this()
    
    def format(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
    ): String = js.native
    
    /* private */ var template: Any = js.native
  }
  /* static members */
  object Template {
    
    @JSImport("testcafe-safe-storage/lib/utils/template", "Template")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create[T /* <: js.Array[Any] */](x: String): Template[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any]).asInstanceOf[Template[T]]
    inline def create[T /* <: js.Array[Any] */](x: TemplateLambda[T]): Template[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any]).asInstanceOf[Template[T]]
  }
  
  type TemplateLambda[T /* <: js.Array[Any] */] = js.Function1[/* args */ T, String]
}
