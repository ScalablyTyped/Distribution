package typings.winrt.Windows.Foundation.Metadata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ThreadingModel extends StObject
@JSGlobal("Windows.Foundation.Metadata.ThreadingModel")
@js.native
object ThreadingModel extends StObject {
  
  @js.native
  sealed trait both extends ThreadingModel
  
  @js.native
  sealed trait invalidThreading extends ThreadingModel
  
  @js.native
  sealed trait mTA extends ThreadingModel
  
  @js.native
  sealed trait sTA extends ThreadingModel
}
