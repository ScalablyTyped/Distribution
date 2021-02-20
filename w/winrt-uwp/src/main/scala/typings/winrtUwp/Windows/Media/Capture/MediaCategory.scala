package typings.winrtUwp.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaCategory extends StObject
/** Defines values for types of media categories. */
@JSGlobal("Windows.Media.Capture.MediaCategory")
@js.native
object MediaCategory extends StObject {
  
  /** Media is intended for real-time communications. */
  @js.native
  sealed trait communications extends MediaCategory
  
  /** Media is game chat. */
  @js.native
  sealed trait gameChat extends MediaCategory
  
  /** General media. */
  @js.native
  sealed trait media extends MediaCategory
  
  /** Media category is other. */
  @js.native
  sealed trait other extends MediaCategory
  
  /** Media is speech. */
  @js.native
  sealed trait speech extends MediaCategory
}
