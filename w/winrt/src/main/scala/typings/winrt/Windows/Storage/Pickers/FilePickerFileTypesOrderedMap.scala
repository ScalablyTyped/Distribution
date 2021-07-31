package typings.winrt.Windows.Storage.Pickers

import typings.winrt.Windows.Foundation.Collections.IIterator
import typings.winrt.Windows.Foundation.Collections.IKeyValuePair
import typings.winrt.Windows.Foundation.Collections.IMap
import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilePickerFileTypesOrderedMap
  extends StObject
     with IMap[String, IVector[String]]
object FilePickerFileTypesOrderedMap {
  
  @scala.inline
  def apply(
    clear: () => Unit,
    first: () => IIterator[IKeyValuePair[String, IVector[String]]],
    getView: () => IMapView[String, IVector[String]],
    hasKey: String => Boolean,
    insert: (String, IVector[String]) => Boolean,
    lookup: String => IVector[String],
    remove: String => Unit,
    size: Double
  ): FilePickerFileTypesOrderedMap = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), first = js.Any.fromFunction0(first), getView = js.Any.fromFunction0(getView), hasKey = js.Any.fromFunction1(hasKey), insert = js.Any.fromFunction2(insert), lookup = js.Any.fromFunction1(lookup), remove = js.Any.fromFunction1(remove), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePickerFileTypesOrderedMap]
  }
}
