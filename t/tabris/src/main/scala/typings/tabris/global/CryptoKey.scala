package typings.tabris.global

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
@JSGlobal("CryptoKey")
@js.native
/**
  * Represents an in-memory cryptographic key to be used with the ${doc:SubtleCrypto} API.
  */
/* private */ open class CryptoKey ()
  extends StObject
     with typings.tabris.CryptoKey {
  
  /**
    * @constant
    */
  /* CompleteClass */
  override val algorithm: NamedCurve = js.native
  
  /* CompleteClass */
  var extractable: Boolean = js.native
  
  /**
    * @constant
    */
  /* CompleteClass */
  override val `type`: secret | `private` | public = js.native
  
  /**
    * @constant
    */
  /* CompleteClass */
  override val usages: js.Array[String] = js.native
}
