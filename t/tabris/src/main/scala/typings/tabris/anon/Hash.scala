package typings.tabris.anon

import typings.tabris.TypedArray
import typings.tabris.tabrisStrings.HKDF
import typings.tabris.tabrisStrings.`SHA-1`
import typings.tabris.tabrisStrings.`SHA-256`
import typings.tabris.tabrisStrings.`SHA-384`
import typings.tabris.tabrisStrings.`SHA-512`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hash extends StObject {
  
  var hash: `SHA-1` | `SHA-256` | `SHA-384` | `SHA-512`
  
  var info: js.typedarray.ArrayBuffer | TypedArray
  
  var name: HKDF
  
  var salt: js.typedarray.ArrayBuffer | TypedArray
}
object Hash {
  
  inline def apply(
    hash: `SHA-1` | `SHA-256` | `SHA-384` | `SHA-512`,
    info: js.typedarray.ArrayBuffer | TypedArray,
    salt: js.typedarray.ArrayBuffer | TypedArray
  ): Hash = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], name = "HKDF", salt = salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hash]
  }
  
  extension [Self <: Hash](x: Self) {
    
    inline def setHash(value: `SHA-1` | `SHA-256` | `SHA-384` | `SHA-512`): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: js.typedarray.ArrayBuffer | TypedArray): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setName(value: HKDF): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSalt(value: js.typedarray.ArrayBuffer | TypedArray): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
  }
}
