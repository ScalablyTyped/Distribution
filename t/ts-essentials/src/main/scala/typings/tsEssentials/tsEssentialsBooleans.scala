package typings.tsEssentials

import typings.tsEssentials.literalTypesMod.IncludesSeparator
import typings.tsEssentials.literalTypesMod.IsCamelCase
import typings.tsEssentials.literalTypesMod.IsOneWord
import typings.tsEssentials.literalTypesMod.IsPascalCase
import typings.tsEssentials.literalTypesMod.IsStringLiteral
import typings.tsEssentials.typesMod.IsAny
import typings.tsEssentials.typesMod.IsEqualConsideringWritability
import typings.tsEssentials.typesMod.IsNever
import typings.tsEssentials.typesMod.IsUnknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsEssentialsBooleans {
  
  @js.native
  sealed trait `false`
    extends StObject
       with IncludesSeparator[Any]
       with IsAny[Any]
       with IsCamelCase[Any]
       with IsEqualConsideringWritability[Any, Any]
       with IsNever[Any]
       with IsOneWord[Any]
       with IsPascalCase[Any]
       with IsStringLiteral[Any]
       with IsUnknown[Any]
  inline def `false`: `false` = false.asInstanceOf[`false`]
  
  @js.native
  sealed trait `true`
    extends StObject
       with IncludesSeparator[Any]
       with IsAny[Any]
       with IsCamelCase[Any]
       with IsEqualConsideringWritability[Any, Any]
       with IsNever[Any]
       with IsOneWord[Any]
       with IsPascalCase[Any]
       with IsStringLiteral[Any]
       with IsUnknown[Any]
  inline def `true`: `true` = true.asInstanceOf[`true`]
}
