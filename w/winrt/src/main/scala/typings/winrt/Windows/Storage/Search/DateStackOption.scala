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
  
  /* 2 */ val month: typings.winrt.Windows.Storage.Search.DateStackOption.month with Double = js.native
  /* 0 */ val none: typings.winrt.Windows.Storage.Search.DateStackOption.none with Double = js.native
  /* 1 */ val year: typings.winrt.Windows.Storage.Search.DateStackOption.year with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DateStackOption with Double] = js.native
}

