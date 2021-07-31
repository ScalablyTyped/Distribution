package typings.winrtUwp.Windows.Foundation.Metadata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ThreadingModel extends StObject
/** Specifies the threading model. */
@JSGlobal("Windows.Foundation.Metadata.ThreadingModel")
@js.native
object ThreadingModel extends StObject {
  
  /** Both single-threaded and multithreaded apartments. */
  @js.native
  sealed trait both
    extends StObject
       with ThreadingModel
  
  /** No valid threading model applies. */
  @js.native
  sealed trait invalidThreading
    extends StObject
       with ThreadingModel
  
  /** Multithreaded apartment. */
  @js.native
  sealed trait mta
    extends StObject
       with ThreadingModel
  
  /** Single-threaded apartment. */
  @js.native
  sealed trait sta
    extends StObject
       with ThreadingModel
}
