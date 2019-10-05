package typings.transducersDotJs.transducersDotJsMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers.js", "into")
@js.native
object into extends js.Object {
  def apply[TInput](to: String, xf: Transducer[TInput, String], from: Iterable[TInput]): String = js.native
  def apply[TInput, TOutput](to: js.Array[TOutput], xf: Transducer[TInput, TOutput], from: Iterable[TInput]): js.Array[TOutput] = js.native
  def apply[TInput, TOutput](
    to: StringDictionary[TOutput],
    xf: Transducer[TInput, js.Tuple2[String, TOutput]],
    from: Iterable[TInput]
  ): StringDictionary[TOutput] = js.native
}

