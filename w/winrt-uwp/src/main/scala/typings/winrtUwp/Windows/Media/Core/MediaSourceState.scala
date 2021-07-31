package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaSourceState extends StObject
/** Specifies the state of a MediaSource . */
@JSGlobal("Windows.Media.Core.MediaSourceState")
@js.native
object MediaSourceState extends StObject {
  
  /** The MediaSource has been closed. */
  @js.native
  sealed trait closed
    extends StObject
       with MediaSourceState
  
  /** The MediaSource failed to open the associated media content. */
  @js.native
  sealed trait failed
    extends StObject
       with MediaSourceState
  
  /** The MediaSource has been initialized. */
  @js.native
  sealed trait initial
    extends StObject
       with MediaSourceState
  
  /** The MediaSource has successfully opened the associated media content. */
  @js.native
  sealed trait opened
    extends StObject
       with MediaSourceState
  
  /** The MediaSource is in the process of opening the associated media content. */
  @js.native
  sealed trait opening
    extends StObject
       with MediaSourceState
}
