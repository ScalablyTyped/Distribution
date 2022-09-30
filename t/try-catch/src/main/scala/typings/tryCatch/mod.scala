package typings.tryCatch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(fn: js.Function1[/* repeated */ Any, Any], args: Any*): js.Tuple2[/* error */ js.Error, /* result */ js.UndefOr[Any]] = ^.asInstanceOf[js.Dynamic].apply(scala.List(fn.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Tuple2[/* error */ js.Error, /* result */ js.UndefOr[Any]]]
  
  @JSImport("try-catch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
