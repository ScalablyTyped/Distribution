package typings.wonka

import typings.wonka.typesMod.Source
import typings.wonka.wonkaNumbers.`0`
import typings.wonka.wonkaNumbers.`1`
import typings.wonka.wonkaNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object callbagMod {
  
  @JSImport("wonka/dist/types/callbag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromCallbag[T](callbag: Callbag[Any, T]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCallbag")(callbag.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  inline def toCallbag[T](source: Source[T]): Callbag[Any, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toCallbag")(source.asInstanceOf[js.Any]).asInstanceOf[Callbag[Any, T]]
  
  @js.native
  trait Callbag[I, O] extends StObject {
    
    def apply(t: `0`, d: Callbag[O, I]): Unit = js.native
    def apply(t: `1`, d: I): Unit = js.native
    def apply(t: `2`): Unit = js.native
    def apply(t: `2`, d: Any): Unit = js.native
  }
}
