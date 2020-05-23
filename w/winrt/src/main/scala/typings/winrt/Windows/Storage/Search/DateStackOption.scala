package typings.winrt.Windows.Storage.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DateStackOption extends js.Object

@JSGlobal("Windows.Storage.Search.DateStackOption")
@js.native
object DateStackOption extends js.Object {
  @js.native
  sealed trait month extends DateStackOption
  
  @js.native
  sealed trait none extends DateStackOption
  
  @js.native
  sealed trait year extends DateStackOption
  
}

