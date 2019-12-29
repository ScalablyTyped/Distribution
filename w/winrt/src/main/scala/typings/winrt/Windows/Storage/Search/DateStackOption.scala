package typings.winrt.Windows.Storage.Search

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DateStackOption with Double] = js.native
  /* 2 */ @js.native
  object month extends TopLevel[month with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object year extends TopLevel[year with Double]
  
}

