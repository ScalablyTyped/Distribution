package typings.tabris.mod

import typings.tabris.Crypto
import typings.tabris.SubtleCrypto
import typings.tabris.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Crypto
/**
  * The global `crypto` object provides an implementation of the `RandomSource` interface that can be
  * used to generate cryptographically secure random numbers.
  */
/* was `typeof Crypto` */
@JSImport("tabris", "Crypto")
@js.native
/**
  * The global `crypto` object provides an implementation of the `RandomSource` interface that can be
  * used to generate cryptographically secure random numbers.
  */
/* private */ open class Crypto_ ()
  extends StObject
     with Crypto {
  
  /**
    * Generates random numbers.
    * @param typedArray A typed array which will be filled with random numbers. The *same* array is also returned by this method.
    */
  /* CompleteClass */
  override def getRandomValues(typedArray: TypedArray): TypedArray = js.native
  
  /**
    * @constant
    */
  /* CompleteClass */
  override val subtle: SubtleCrypto = js.native
}
