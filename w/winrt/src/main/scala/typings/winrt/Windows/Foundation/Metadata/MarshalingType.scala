package typings.winrt.Windows.Foundation.Metadata

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MarshalingType extends js.Object

@JSGlobal("Windows.Foundation.Metadata.MarshalingType")
@js.native
object MarshalingType extends js.Object {
  @js.native
  sealed trait agile extends MarshalingType
  
  @js.native
  sealed trait invalidMarshaling extends MarshalingType
  
  @js.native
  sealed trait none extends MarshalingType
  
  @js.native
  sealed trait standard extends MarshalingType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MarshalingType with Double] = js.native
  /* 1 */ @js.native
  object agile extends TopLevel[agile with Double]
  
  /* 3 */ @js.native
  object invalidMarshaling extends TopLevel[invalidMarshaling with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 2 */ @js.native
  object standard extends TopLevel[standard with Double]
  
}

