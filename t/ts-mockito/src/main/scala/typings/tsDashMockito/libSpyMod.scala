package typings.tsDashMockito

import typings.tsDashMockito.libMockMod.Mocker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-mockito/lib/Spy", JSImport.Namespace)
@js.native
object libSpyMod extends js.Object {
  @js.native
  class Spy protected () extends Mocker {
    def this(instance: js.Any) = this()
    var realMethods: js.Any = js.native
  }
  
}

