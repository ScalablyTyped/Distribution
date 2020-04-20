package typings.urqlCore

import typings.urqlCore.typesMod.PromisifiedSource
import typings.wonka.wonkaTypesGenMod.sourceT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@urql/core/dist/types/utils/withPromise", JSImport.Namespace)
@js.native
object withPromiseMod extends js.Object {
  def withPromise[T](source$: sourceT[T]): PromisifiedSource[T] = js.native
}

