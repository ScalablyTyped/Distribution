package typings.w3cCssTypedObjectModelLevel1

import org.scalablytyped.runtime.NumberDictionary
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO(yavanosta): conflict with base class properties
// Since there is no support for this class in any browser, it's better
// wait for the implementation.
// declare class CSSMathClamp extends CSSMathValue {
// constructor(min: CSSNumberish, val: CSSNumberish, max: CSSNumberish);
//     readonly min: CSSNumericValue;
//     readonly val: CSSNumericValue;
//     readonly max: CSSNumericValue;
// };
@js.native
trait CSSNumericArray
  extends StObject
     with /* index */ NumberDictionary[CSSNumericValue] {
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[CSSNumericValue]] = js.native
  
  val length: Double = js.native
}
