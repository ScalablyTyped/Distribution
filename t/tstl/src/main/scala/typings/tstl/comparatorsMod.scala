package typings.tstl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/functional/comparators", JSImport.Namespace)
@js.native
object comparatorsMod extends js.Object {
  
  @JSName("equal_to")
  def equalTo[T](x: T, y: T): Boolean = js.native
  
  def greater[T](x: T, y: T): Boolean = js.native
  
  @JSName("greater_equal")
  def greaterEqual[T](x: T, y: T): Boolean = js.native
  
  def less[T](x: T, y: T): Boolean = js.native
  
  @JSName("less_equal")
  def lessEqual[T](x: T, y: T): Boolean = js.native
  
  @JSName("not_equal_to")
  def notEqualTo[T](x: T, y: T): Boolean = js.native
}
