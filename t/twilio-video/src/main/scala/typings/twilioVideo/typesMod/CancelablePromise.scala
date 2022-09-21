package typings.twilioVideo.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelablePromise[T]
  extends js.Promise[T] {
  
  def cancel(): Unit = js.native
}
