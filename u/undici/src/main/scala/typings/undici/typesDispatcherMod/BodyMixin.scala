package typings.undici.typesDispatcherMod

import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @link https://fetch.spec.whatwg.org/#body-mixin
  */
trait BodyMixin extends StObject {
  
  def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer]
  
  def blob(): js.Promise[Blob]
  
  val body: js.UndefOr[scala.Nothing] = js.undefined
  
  // throws on node v16.6.0
  val bodyUsed: Boolean
  
  def formData(): js.Promise[scala.Nothing]
  
  def json(): js.Promise[Any]
  
  def text(): js.Promise[String]
}
object BodyMixin {
  
  inline def apply(
    arrayBuffer: () => js.Promise[js.typedarray.ArrayBuffer],
    blob: () => js.Promise[Blob],
    bodyUsed: Boolean,
    formData: () => js.Promise[scala.Nothing],
    json: () => js.Promise[Any],
    text: () => js.Promise[String]
  ): BodyMixin = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], formData = js.Any.fromFunction0(formData), json = js.Any.fromFunction0(json), text = js.Any.fromFunction0(text))
    __obj.asInstanceOf[BodyMixin]
  }
  
  extension [Self <: BodyMixin](x: Self) {
    
    inline def setArrayBuffer(value: () => js.Promise[js.typedarray.ArrayBuffer]): Self = StObject.set(x, "arrayBuffer", js.Any.fromFunction0(value))
    
    inline def setBlob(value: () => js.Promise[Blob]): Self = StObject.set(x, "blob", js.Any.fromFunction0(value))
    
    inline def setBodyUsed(value: Boolean): Self = StObject.set(x, "bodyUsed", value.asInstanceOf[js.Any])
    
    inline def setFormData(value: () => js.Promise[scala.Nothing]): Self = StObject.set(x, "formData", js.Any.fromFunction0(value))
    
    inline def setJson(value: () => js.Promise[Any]): Self = StObject.set(x, "json", js.Any.fromFunction0(value))
    
    inline def setText(value: () => js.Promise[String]): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
  }
}
