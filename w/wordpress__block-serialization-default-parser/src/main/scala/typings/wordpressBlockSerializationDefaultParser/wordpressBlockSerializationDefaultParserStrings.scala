package typings.wordpressBlockSerializationDefaultParser

import typings.wordpressBlockSerializationDefaultParser.mod.TokenType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wordpressBlockSerializationDefaultParserStrings {
  
  @js.native
  sealed trait `block-closer`
    extends StObject
       with TokenType
  inline def `block-closer`: `block-closer` = "block-closer".asInstanceOf[`block-closer`]
  
  @js.native
  sealed trait `block-opener`
    extends StObject
       with TokenType
  inline def `block-opener`: `block-opener` = "block-opener".asInstanceOf[`block-opener`]
  
  @js.native
  sealed trait `no-more-tokens`
    extends StObject
       with TokenType
  inline def `no-more-tokens`: `no-more-tokens` = "no-more-tokens".asInstanceOf[`no-more-tokens`]
  
  @js.native
  sealed trait `void-block`
    extends StObject
       with TokenType
  inline def `void-block`: `void-block` = "void-block".asInstanceOf[`void-block`]
}
