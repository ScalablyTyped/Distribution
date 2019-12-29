package typings.winrt.Windows.ApplicationModel.DataTransfer

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataPackageOperation extends js.Object

@JSGlobal("Windows.ApplicationModel.DataTransfer.DataPackageOperation")
@js.native
object DataPackageOperation extends js.Object {
  @js.native
  sealed trait copy extends DataPackageOperation
  
  @js.native
  sealed trait link extends DataPackageOperation
  
  @js.native
  sealed trait move extends DataPackageOperation
  
  @js.native
  sealed trait none extends DataPackageOperation
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DataPackageOperation with Double] = js.native
  /* 1 */ @js.native
  object copy extends TopLevel[copy with Double]
  
  /* 3 */ @js.native
  object link extends TopLevel[link with Double]
  
  /* 2 */ @js.native
  object move extends TopLevel[move with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

