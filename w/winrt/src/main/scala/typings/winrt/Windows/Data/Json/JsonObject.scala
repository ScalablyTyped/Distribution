package typings.winrt.Windows.Data.Json

import typings.winrt.Windows.Foundation.Collections.IIterator
import typings.winrt.Windows.Foundation.Collections.IKeyValuePair
import typings.winrt.Windows.Foundation.Collections.IMap
import typings.winrt.Windows.Foundation.Collections.IMapView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonObject
  extends StObject
     with IJsonObject
     with IMap[String, IJsonValue]
object JsonObject {
  
  inline def apply(
    clear: () => Unit,
    first: () => IIterator[IKeyValuePair[String, IJsonValue]],
    getArray: () => JsonArray,
    getBoolean: () => Boolean,
    getNamedArray: String => JsonArray,
    getNamedBoolean: String => Boolean,
    getNamedNumber: String => Double,
    getNamedObject: String => JsonObject,
    getNamedString: String => String,
    getNamedValue: String => JsonValue,
    getNumber: () => Double,
    getObject: () => JsonObject,
    getString: () => String,
    getView: () => IMapView[String, IJsonValue],
    hasKey: String => Boolean,
    insert: (String, IJsonValue) => Boolean,
    lookup: String => IJsonValue,
    remove: String => Unit,
    setNamedValue: (String, IJsonValue) => Unit,
    size: Double,
    stringify: () => String,
    valueType: JsonValueType
  ): JsonObject = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), first = js.Any.fromFunction0(first), getArray = js.Any.fromFunction0(getArray), getBoolean = js.Any.fromFunction0(getBoolean), getNamedArray = js.Any.fromFunction1(getNamedArray), getNamedBoolean = js.Any.fromFunction1(getNamedBoolean), getNamedNumber = js.Any.fromFunction1(getNamedNumber), getNamedObject = js.Any.fromFunction1(getNamedObject), getNamedString = js.Any.fromFunction1(getNamedString), getNamedValue = js.Any.fromFunction1(getNamedValue), getNumber = js.Any.fromFunction0(getNumber), getObject = js.Any.fromFunction0(getObject), getString = js.Any.fromFunction0(getString), getView = js.Any.fromFunction0(getView), hasKey = js.Any.fromFunction1(hasKey), insert = js.Any.fromFunction2(insert), lookup = js.Any.fromFunction1(lookup), remove = js.Any.fromFunction1(remove), setNamedValue = js.Any.fromFunction2(setNamedValue), size = size.asInstanceOf[js.Any], stringify = js.Any.fromFunction0(stringify), valueType = valueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonObject]
  }
}
