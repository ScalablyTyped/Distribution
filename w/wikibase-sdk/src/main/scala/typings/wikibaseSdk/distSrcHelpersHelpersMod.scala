package typings.wikibaseSdk

import typings.wikibaseSdk.distSrcTypesEntityMod.EntityId
import typings.wikibaseSdk.distSrcTypesEntityMod.Guid
import typings.wikibaseSdk.distSrcTypesEntityMod.NumericId
import typings.wikibaseSdk.distSrcTypesOptionsMod.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcHelpersHelpersMod {
  
  @JSImport("wikibase-sdk/dist/src/helpers/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEntityIdFromGuid(guid: Guid): EntityId = ^.asInstanceOf[js.Dynamic].applyDynamic("getEntityIdFromGuid")(guid.asInstanceOf[js.Any]).asInstanceOf[EntityId]
  
  inline def getImageUrl(filename: String): Url = ^.asInstanceOf[js.Dynamic].applyDynamic("getImageUrl")(filename.asInstanceOf[js.Any]).asInstanceOf[Url]
  inline def getImageUrl(filename: String, width: Double): Url = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageUrl")(filename.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Url]
  
  inline def getNumericId(id: String): NumericId = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumericId")(id.asInstanceOf[js.Any]).asInstanceOf[NumericId]
  
  inline def isEntityId(id: String): /* is wikibase-sdk.wikibase-sdk/dist/src/types/entity.EntityId */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEntityId")(id.asInstanceOf[js.Any]).asInstanceOf[/* is wikibase-sdk.wikibase-sdk/dist/src/types/entity.EntityId */ Boolean]
  
  inline def isEntityPageTitle(title: String): /* is wikibase-sdk.wikibase-sdk/dist/src/types/entity.EntityPageTitle */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEntityPageTitle")(title.asInstanceOf[js.Any]).asInstanceOf[/* is wikibase-sdk.wikibase-sdk/dist/src/types/entity.EntityPageTitle */ Boolean]
  
  inline def isEntitySchemaId(id: String): /* is / * template literal string: E${number} * / string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEntitySchemaId")(id.asInstanceOf[js.Any]).asInstanceOf[/* is / * template literal string: E${number} * / string */ Boolean]
  
  inline def isFormId(id: String): /* is / * template literal string: L${number}-F${number} * / string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFormId")(id.asInstanceOf[js.Any]).asInstanceOf[/* is / * template literal string: L${number}-F${number} * / string */ Boolean]
  
  inline def isGuid(id: String): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGuid")(id.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def isHash(id: String): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHash")(id.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def isItemId(id: String): /* is / * template literal string: Q${number} * / string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isItemId")(id.asInstanceOf[js.Any]).asInstanceOf[/* is / * template literal string: Q${number} * / string */ Boolean]
  
  inline def isLexemeId(id: String): /* is / * template literal string: L${number} * / string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLexemeId")(id.asInstanceOf[js.Any]).asInstanceOf[/* is / * template literal string: L${number} * / string */ Boolean]
  
  inline def isMediaInfoId(id: String): /* is / * template literal string: M${number} * / string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaInfoId")(id.asInstanceOf[js.Any]).asInstanceOf[/* is / * template literal string: M${number} * / string */ Boolean]
  
  inline def isNonNestedEntityId(id: String): /* is wikibase-sdk.wikibase-sdk/dist/src/types/entity.NonNestedEntityId */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNonNestedEntityId")(id.asInstanceOf[js.Any]).asInstanceOf[/* is wikibase-sdk.wikibase-sdk/dist/src/types/entity.NonNestedEntityId */ Boolean]
  
  inline def isNumericId(id: String): /* is / * template literal string: ${number} * / string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumericId")(id.asInstanceOf[js.Any]).asInstanceOf[/* is / * template literal string: ${number} * / string */ Boolean]
  
  inline def isPropertyClaimsId(id: String): /* is wikibase-sdk.wikibase-sdk/dist/src/types/entity.PropertyClaimsId */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPropertyClaimsId")(id.asInstanceOf[js.Any]).asInstanceOf[/* is wikibase-sdk.wikibase-sdk/dist/src/types/entity.PropertyClaimsId */ Boolean]
  
  inline def isPropertyId(id: String): /* is / * template literal string: P${number} * / string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPropertyId")(id.asInstanceOf[js.Any]).asInstanceOf[/* is / * template literal string: P${number} * / string */ Boolean]
  
  inline def isRevisionId(id: String): /* is / * template literal string: ${number} * / string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRevisionId")(id.asInstanceOf[js.Any]).asInstanceOf[/* is / * template literal string: ${number} * / string */ Boolean]
  
  inline def isSenseId(id: String): /* is / * template literal string: L${number}-S${number} * / string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSenseId")(id.asInstanceOf[js.Any]).asInstanceOf[/* is / * template literal string: L${number}-S${number} * / string */ Boolean]
}
