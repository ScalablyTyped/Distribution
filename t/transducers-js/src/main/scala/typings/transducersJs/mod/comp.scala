package typings.transducersJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("transducers-js", "comp")
@js.native
object comp extends js.Object {
  
  def apply(args: (js.Function1[/* x */ js.Any, _])*): js.Function1[/* x */ js.Any, _] = js.native
  def apply[A, B, C](a: Transducer[A, B], b: Transducer[B, C]): Transducer[A, C] = js.native
  def apply[A, B, C](b: js.Function1[/* b */ B, C], a: js.Function1[/* a */ A, B]): js.Function1[/* a */ A, C] = js.native
  def apply[A, B, C, D](a: Transducer[A, B], b: Transducer[B, C], c: Transducer[C, D]): Transducer[A, D] = js.native
  def apply[A, B, C, D](c: js.Function1[/* c */ C, D], b: js.Function1[/* b */ B, C], a: js.Function1[/* a */ A, B]): js.Function1[/* a */ A, D] = js.native
  def apply[A, B, C, D, E](a: Transducer[A, B], b: Transducer[B, C], c: Transducer[C, D], d: Transducer[D, E]): Transducer[A, E] = js.native
  def apply[A, B, C, D, E](
    d: js.Function1[/* d */ D, E],
    c: js.Function1[/* c */ C, D],
    b: js.Function1[/* b */ B, C],
    a: js.Function1[/* a */ A, B]
  ): js.Function1[/* a */ A, E] = js.native
}
