package typings.winrt.Windows.ApplicationModel.Resources

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceLoader
  extends StObject
     with IResourceLoader
object ResourceLoader {
  
  @scala.inline
  def apply(getString: String => String): ResourceLoader = {
    val __obj = js.Dynamic.literal(getString = js.Any.fromFunction1(getString))
    __obj.asInstanceOf[ResourceLoader]
  }
}
