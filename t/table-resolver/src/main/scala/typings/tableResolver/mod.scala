package typings.tableResolver

import typings.tableResolver.anon.Column
import typings.tableResolver.anon.Columns
import typings.tableResolver.anon.Method
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("table-resolver", "columnChildren")
  @js.native
  def columnChildren[T](args: Columns[T]): js.Array[T] = js.native
  
  @JSImport("table-resolver", "headerRows")
  @js.native
  def headerRows[T](args: Columns[T]): js.Array[T] = js.native
  
  @JSImport("table-resolver", "nested")
  @js.native
  def nested[T](args: Column[T]): T = js.native
  
  @JSImport("table-resolver", "resolve")
  @js.native
  def resolve[T](args: Method[T]): js.Function1[/* data */ js.Any, js.Array[T]] = js.native
}
