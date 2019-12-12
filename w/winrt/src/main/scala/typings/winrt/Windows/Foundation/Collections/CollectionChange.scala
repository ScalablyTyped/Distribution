package typings.winrt.Windows.Foundation.Collections

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Foundation.Collections.CollectionChange.itemChanged
import typings.winrt.Windows.Foundation.Collections.CollectionChange.itemInserted
import typings.winrt.Windows.Foundation.Collections.CollectionChange.itemRemoved
import typings.winrt.Windows.Foundation.Collections.CollectionChange.reset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CollectionChange extends js.Object

@JSGlobal("Windows.Foundation.Collections.CollectionChange")
@js.native
object CollectionChange extends js.Object {
  @js.native
  sealed trait itemChanged extends CollectionChange
  
  @js.native
  sealed trait itemInserted extends CollectionChange
  
  @js.native
  sealed trait itemRemoved extends CollectionChange
  
  @js.native
  sealed trait reset extends CollectionChange
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CollectionChange with Double] = js.native
  /* 3 */ @js.native
  object itemChanged extends TopLevel[itemChanged with Double]
  
  /* 1 */ @js.native
  object itemInserted extends TopLevel[itemInserted with Double]
  
  /* 2 */ @js.native
  object itemRemoved extends TopLevel[itemRemoved with Double]
  
  /* 0 */ @js.native
  object reset extends TopLevel[reset with Double]
  
}

