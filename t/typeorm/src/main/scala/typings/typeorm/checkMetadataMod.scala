package typings.typeorm

import typings.typeorm.anon.EntityMetadata
import typings.typeorm.namingStrategyInterfaceMod.NamingStrategyInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkMetadataMod {
  
  @JSImport("typeorm/browser/metadata/CheckMetadata", "CheckMetadata")
  @js.native
  class CheckMetadata protected () extends StObject {
    def this(options: EntityMetadata) = this()
    
    /**
      * Builds some depend check constraint properties.
      * Must be called after all entity metadata's properties map, columns and relations are built.
      */
    def build(namingStrategy: NamingStrategyInterface): this.type = js.native
    
    /**
      * Entity metadata of the class to which this check constraint is applied.
      */
    var entityMetadata: typings.typeorm.entityMetadataMod.EntityMetadata = js.native
    
    /**
      * Check expression.
      */
    var expression: String = js.native
    
    /**
      * User specified check constraint name.
      */
    var givenName: js.UndefOr[String] = js.native
    
    /**
      * Final check constraint name.
      * If check constraint name was given by a user then it stores normalized (by naming strategy) givenName.
      * If check constraint name was not given then its generated.
      */
    var name: String = js.native
    
    /**
      * Target class to which metadata is applied.
      */
    var target: js.UndefOr[js.Function | String] = js.native
  }
}
