package typings.yandexMaps.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.yandexMaps.mod.vow.Deferred
import typings.yandexMaps.mod.vow.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofvow extends StObject {
  
  var Deferred: Instantiable0[typings.yandexMaps.mod.vow.Deferred]
  
  var Promise: Instantiable1[/* resolver */ js.UndefOr[js.Function0[Unit]], typings.yandexMaps.mod.vow.Promise]
}
object Typeofvow {
  
  inline def apply(
    Deferred: Instantiable0[Deferred],
    Promise: Instantiable1[/* resolver */ js.UndefOr[js.Function0[Unit]], Promise]
  ): Typeofvow = {
    val __obj = js.Dynamic.literal(Deferred = Deferred.asInstanceOf[js.Any], Promise = Promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofvow]
  }
  
  extension [Self <: Typeofvow](x: Self) {
    
    inline def setDeferred(value: Instantiable0[Deferred]): Self = StObject.set(x, "Deferred", value.asInstanceOf[js.Any])
    
    inline def setPromise(value: Instantiable1[/* resolver */ js.UndefOr[js.Function0[Unit]], Promise]): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
  }
}
