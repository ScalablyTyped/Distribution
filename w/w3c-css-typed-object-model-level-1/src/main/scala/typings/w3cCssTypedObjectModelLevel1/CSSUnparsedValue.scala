package typings.w3cCssTypedObjectModelLevel1

import org.scalablytyped.runtime.NumberDictionary
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSSUnparsedValue
  extends CSSStyleValue
     with /* idx */ NumberDictionary[CSSUnparsedSegment] {
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[CSSUnparsedSegment]] = js.native
  
  val length: Double = js.native
}
