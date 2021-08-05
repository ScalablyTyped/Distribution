package typings.tableResolver

import typings.tableResolver.anon.Column
import typings.tableResolver.anon.Columns
import typings.tableResolver.anon.Method
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("table-resolver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def columnChildren[T](args: Columns[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("columnChildren")(args.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def headerRows[T](args: Columns[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("headerRows")(args.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def nested[T](args: Column[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("nested")(args.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def resolve[T](args: Method[T]): js.Function1[/* data */ js.Any, js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(args.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* data */ js.Any, js.Array[T]]]
}
