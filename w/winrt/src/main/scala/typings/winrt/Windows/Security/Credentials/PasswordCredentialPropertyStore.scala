package typings.winrt.Windows.Security.Credentials

import typings.winrt.Windows.Foundation.Collections.IIterator
import typings.winrt.Windows.Foundation.Collections.IKeyValuePair
import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.Collections.IPropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PasswordCredentialPropertyStore
  extends StObject
     with IPropertySet
object PasswordCredentialPropertyStore {
  
  inline def apply(
    clear: () => Unit,
    first: () => IIterator[IKeyValuePair[String, Any]],
    getView: () => IMapView[String, Any],
    hasKey: String => Boolean,
    insert: (String, Any) => Boolean,
    lookup: String => Any,
    onmapchanged: Any,
    remove: String => Unit,
    size: Double
  ): PasswordCredentialPropertyStore = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), first = js.Any.fromFunction0(first), getView = js.Any.fromFunction0(getView), hasKey = js.Any.fromFunction1(hasKey), insert = js.Any.fromFunction2(insert), lookup = js.Any.fromFunction1(lookup), onmapchanged = onmapchanged.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordCredentialPropertyStore]
  }
}
