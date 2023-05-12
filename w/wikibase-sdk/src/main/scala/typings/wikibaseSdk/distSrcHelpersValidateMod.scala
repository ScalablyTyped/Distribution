package typings.wikibaseSdk

import typings.wikibaseSdk.distSrcTypesEntityMod.EntityId
import typings.wikibaseSdk.distSrcTypesEntityMod.EntityPageTitle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcHelpersValidateMod {
  
  @JSImport("wikibase-sdk/dist/src/helpers/validate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def entityId(value: EntityId): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("entityId")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def entityPageTitle(value: EntityPageTitle): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("entityPageTitle")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def propertyId(value: /* template literal string: P${number} */ String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("propertyId")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def revisionId(value: /* template literal string: ${number} */ String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("revisionId")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
