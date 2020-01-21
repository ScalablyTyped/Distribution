package typings.tsMockito

import typings.tsMockito.mockMod.Mocker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-mockito/lib/Spy", JSImport.Namespace)
@js.native
object spyMod extends js.Object {
  @js.native
  class Spy protected () extends Mocker {
    def this(instance: js.Any) = this()
    var realMethods: js.Any = js.native
  }
  
}

