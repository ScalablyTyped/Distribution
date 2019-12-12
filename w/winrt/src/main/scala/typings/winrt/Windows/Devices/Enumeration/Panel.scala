package typings.winrt.Windows.Devices.Enumeration

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Devices.Enumeration.Panel.back
import typings.winrt.Windows.Devices.Enumeration.Panel.bottom
import typings.winrt.Windows.Devices.Enumeration.Panel.front
import typings.winrt.Windows.Devices.Enumeration.Panel.left
import typings.winrt.Windows.Devices.Enumeration.Panel.right
import typings.winrt.Windows.Devices.Enumeration.Panel.top
import typings.winrt.Windows.Devices.Enumeration.Panel.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Panel extends js.Object

@JSGlobal("Windows.Devices.Enumeration.Panel")
@js.native
object Panel extends js.Object {
  @js.native
  sealed trait back extends Panel
  
  @js.native
  sealed trait bottom extends Panel
  
  @js.native
  sealed trait front extends Panel
  
  @js.native
  sealed trait left extends Panel
  
  @js.native
  sealed trait right extends Panel
  
  @js.native
  sealed trait top extends Panel
  
  @js.native
  sealed trait unknown extends Panel
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Panel with Double] = js.native
  /* 2 */ @js.native
  object back extends TopLevel[back with Double]
  
  /* 4 */ @js.native
  object bottom extends TopLevel[bottom with Double]
  
  /* 1 */ @js.native
  object front extends TopLevel[front with Double]
  
  /* 5 */ @js.native
  object left extends TopLevel[left with Double]
  
  /* 6 */ @js.native
  object right extends TopLevel[right with Double]
  
  /* 3 */ @js.native
  object top extends TopLevel[top with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

