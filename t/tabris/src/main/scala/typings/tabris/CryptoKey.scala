package typings.tabris

import typings.tabris.anon.NamedCurve
import typings.tabris.tabrisStrings.`private`
import typings.tabris.tabrisStrings.public
import typings.tabris.tabrisStrings.secret
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// CryptoKey
/**
  * Represents an in-memory cryptographic key to be used with the ${doc:SubtleCrypto} API.
  */
trait CryptoKey extends StObject {
  
  /**
    * @constant
    */
  val algorithm: NamedCurve
  
  var extractable: Boolean
  
  /**
    * @constant
    */
  val `type`: secret | `private` | public
  
  /**
    * @constant
    */
  val usages: js.Array[String]
}
object CryptoKey {
  
  inline def apply(
    algorithm: NamedCurve,
    extractable: Boolean,
    `type`: secret | `private` | public,
    usages: js.Array[String]
  ): CryptoKey = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], extractable = extractable.asInstanceOf[js.Any], usages = usages.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoKey]
  }
  
  extension [Self <: CryptoKey](x: Self) {
    
    inline def setAlgorithm(value: NamedCurve): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setExtractable(value: Boolean): Self = StObject.set(x, "extractable", value.asInstanceOf[js.Any])
    
    inline def setType(value: secret | `private` | public): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUsages(value: js.Array[String]): Self = StObject.set(x, "usages", value.asInstanceOf[js.Any])
    
    inline def setUsagesVarargs(value: String*): Self = StObject.set(x, "usages", js.Array(value*))
  }
}
