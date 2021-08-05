package typings.wonka

import typings.wonka.wonkaNumbers.`0`
import typings.wonka.wonkaNumbers.`1`
import typings.wonka.wonkaNumbers.`2`
import typings.wonka.wonkaTypesMod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaCallbagMod {
  
  @JSImport("wonka/src/web/wonka_callbag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromCallbag[T](callbag: Callbag[Unit, T]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCallbag")(callbag.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  inline def toCallbag[T](source: Source[T]): Callbag[Unit, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toCallbag")(source.asInstanceOf[js.Any]).asInstanceOf[Callbag[Unit, T]]
  
  @js.native
  trait Callbag[I, O] extends StObject {
    
    def apply(t: `0`, d: Callbag[O, I]): Unit = js.native
    def apply(t: `1`, d: I): Unit = js.native
    def apply(t: `2`): Unit = js.native
    def apply(t: `2`, d: js.Any): Unit = js.native
  }
}
