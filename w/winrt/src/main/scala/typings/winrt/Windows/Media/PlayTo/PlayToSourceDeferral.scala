package typings.winrt.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayToSourceDeferral
  extends StObject
     with IPlayToSourceDeferral
object PlayToSourceDeferral {
  
  inline def apply(complete: () => Unit): PlayToSourceDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[PlayToSourceDeferral]
  }
}
