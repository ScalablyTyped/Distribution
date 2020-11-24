package typings.winrtUwp.Windows.Media.ClosedCaptioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ClosedCaptionSize extends js.Object
/** Specifies the size of closed caption text. */
@JSGlobal("Windows.Media.ClosedCaptioning.ClosedCaptionSize")
@js.native
object ClosedCaptionSize extends js.Object {
  
  /** Default text size. */
  @js.native
  sealed trait default extends ClosedCaptionSize
  
  /** 50% text size. */
  @js.native
  sealed trait fiftyPercent extends ClosedCaptionSize
  
  /** 150% text size. */
  @js.native
  sealed trait oneHundredFiftyPercent extends ClosedCaptionSize
  
  /** 100% text size. */
  @js.native
  sealed trait oneHundredPercent extends ClosedCaptionSize
  
  /** 200% text size. */
  @js.native
  sealed trait twoHundredPercent extends ClosedCaptionSize
}
