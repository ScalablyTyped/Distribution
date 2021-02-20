package typings.wonka

import typings.wonka.wonkaNumbers.`0`
import typings.wonka.wonkaNumbers.`1`
import typings.wonka.wonkaNumbers.`2`
import typings.wonka.wonkaTypesMod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaCallbagMod {
  
  @JSImport("wonka/src/web/wonka_callbag", "fromCallbag")
  @js.native
  def fromCallbag[T](callbag: Callbag[Unit, T]): Source[T] = js.native
  
  @JSImport("wonka/src/web/wonka_callbag", "toCallbag")
  @js.native
  def toCallbag[T](source: Source[T]): Callbag[Unit, T] = js.native
  
  @js.native
  trait Callbag[I, O] extends StObject {
    
    def apply(t: `0`, d: Callbag[O, I]): Unit = js.native
    def apply(t: `1`, d: I): Unit = js.native
    def apply(t: `2`): Unit = js.native
    def apply(t: `2`, d: js.Any): Unit = js.native
  }
}
