package typings.winrt.Windows.Storage.Provider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileUpdateRequestDeferral
  extends StObject
     with IFileUpdateRequestDeferral
object FileUpdateRequestDeferral {
  
  @scala.inline
  def apply(complete: () => Unit): FileUpdateRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[FileUpdateRequestDeferral]
  }
}
