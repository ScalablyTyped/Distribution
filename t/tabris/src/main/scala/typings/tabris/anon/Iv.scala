package typings.tabris.anon

import typings.tabris.TypedArray
import typings.tabris.tabrisStrings.`AES-GCM`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Iv extends StObject {
  
  var iv: js.typedarray.ArrayBuffer | TypedArray
  
  var name: `AES-GCM`
  
  var tagLength: js.UndefOr[Double] = js.undefined
}
object Iv {
  
  inline def apply(iv: js.typedarray.ArrayBuffer | TypedArray): Iv = {
    val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any], name = "AES-GCM")
    __obj.asInstanceOf[Iv]
  }
  
  extension [Self <: Iv](x: Self) {
    
    inline def setIv(value: js.typedarray.ArrayBuffer | TypedArray): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    inline def setName(value: `AES-GCM`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTagLength(value: Double): Self = StObject.set(x, "tagLength", value.asInstanceOf[js.Any])
    
    inline def setTagLengthUndefined: Self = StObject.set(x, "tagLength", js.undefined)
  }
}
