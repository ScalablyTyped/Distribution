package typings.w3cWebNfc

import typings.std.Event
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NDEFReader
  extends StObject
     with EventTarget {
  
  def makeReadOnly(): js.Promise[Unit] = js.native
  def makeReadOnly(options: NDEFMakeReadOnlyOptions): js.Promise[Unit] = js.native
  
  def onreading(event: NDEFReadingEvent): Any = js.native
  
  def onreadingerror(error: Event): Any = js.native
  
  def scan(): js.Promise[Unit] = js.native
  def scan(options: NDEFScanOptions): js.Promise[Unit] = js.native
  
  def write(message: NDEFMessageSource): js.Promise[Unit] = js.native
  def write(message: NDEFMessageSource, options: NDEFWriteOptions): js.Promise[Unit] = js.native
}
