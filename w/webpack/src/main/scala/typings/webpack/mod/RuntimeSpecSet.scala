package typings.webpack.mod

import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuntimeSpecSet extends StObject {
  
  def add(): Unit = js.native
  def add(runtime: Any): Unit = js.native
  
  def has(): Boolean = js.native
  def has(runtime: Any): Boolean = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[RuntimeSpec]] = js.native
  
  def size: Double = js.native
}
