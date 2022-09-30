package typings.typeFest.anon

import org.scalablytyped.runtime.NumberDictionary
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictindex[Element, Length /* <: Double */]
  extends StObject
     with /* index */ NumberDictionary[Element] {
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[Element]] = js.native
  
  val length: Length = js.native
}
