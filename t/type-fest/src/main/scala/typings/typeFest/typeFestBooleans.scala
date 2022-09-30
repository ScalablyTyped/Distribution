package typings.typeFest

import typings.typeFest.conditionalPickDeepMod.AssertCondition
import typings.typeFest.emptyObjectMod.IsEmptyObject
import typings.typeFest.getMod.ConsistsOnlyOf
import typings.typeFest.hasOptionalKeysMod.HasOptionalKeys
import typings.typeFest.hasRequiredKeysMod.HasRequiredKeys
import typings.typeFest.includesMod.Includes
import typings.typeFest.internalMod.IsEqual
import typings.typeFest.readonlyDeepMod.HasMultipleCallSignatures
import typings.typeFest.screamingSnakeCaseMod.IsScreamingSnakeCase
import typings.typeFest.setReturnTypeMod.IsAny
import typings.typeFest.setReturnTypeMod.IsNever
import typings.typeFest.setReturnTypeMod.IsUnknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeFestBooleans {
  
  @js.native
  sealed trait `false`
    extends StObject
       with AssertCondition[Any, Any, Any]
       with ConsistsOnlyOf[Any, Any]
       with HasMultipleCallSignatures[Any]
       with HasOptionalKeys[Any]
       with HasRequiredKeys[Any]
       with Includes[Any, Any]
       with IsAny[Any]
       with IsEmptyObject[Any]
       with IsEqual[Any, Any]
       with IsNever[Any]
       with IsScreamingSnakeCase[Any]
       with IsUnknown[Any]
  inline def `false`: `false` = false.asInstanceOf[`false`]
  
  @js.native
  sealed trait `true`
    extends StObject
       with AssertCondition[Any, Any, Any]
       with ConsistsOnlyOf[Any, Any]
       with HasMultipleCallSignatures[Any]
       with HasOptionalKeys[Any]
       with HasRequiredKeys[Any]
       with Includes[Any, Any]
       with IsAny[Any]
       with IsEmptyObject[Any]
       with IsEqual[Any, Any]
       with IsNever[Any]
       with IsScreamingSnakeCase[Any]
       with IsUnknown[Any]
  inline def `true`: `true` = true.asInstanceOf[`true`]
}
