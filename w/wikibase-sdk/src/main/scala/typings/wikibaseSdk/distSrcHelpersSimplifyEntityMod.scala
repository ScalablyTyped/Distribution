package typings.wikibaseSdk

import typings.std.Record
import typings.wikibaseSdk.distSrcTypesEntityMod.Entities
import typings.wikibaseSdk.distSrcTypesEntityMod.Entity
import typings.wikibaseSdk.distSrcTypesEntityMod.SimplifiedEntity
import typings.wikibaseSdk.distSrcTypesOptionsMod.SimplifyEntityOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcHelpersSimplifyEntityMod {
  
  @JSImport("wikibase-sdk/dist/src/helpers/simplify_entity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def simplifyEntities(entities: Entities): Record[String, SimplifiedEntity] = ^.asInstanceOf[js.Dynamic].applyDynamic("simplifyEntities")(entities.asInstanceOf[js.Any]).asInstanceOf[Record[String, SimplifiedEntity]]
  inline def simplifyEntities(entities: Entities, options: SimplifyEntityOptions): Record[String, SimplifiedEntity] = (^.asInstanceOf[js.Dynamic].applyDynamic("simplifyEntities")(entities.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Record[String, SimplifiedEntity]]
  
  inline def simplifyEntity(entity: Entity): SimplifiedEntity = ^.asInstanceOf[js.Dynamic].applyDynamic("simplifyEntity")(entity.asInstanceOf[js.Any]).asInstanceOf[SimplifiedEntity]
  inline def simplifyEntity(entity: Entity, options: SimplifyEntityOptions): SimplifiedEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("simplifyEntity")(entity.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SimplifiedEntity]
}
