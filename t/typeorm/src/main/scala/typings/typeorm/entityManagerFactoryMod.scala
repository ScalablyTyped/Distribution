package typings.typeorm

import typings.typeorm.connectionMod.Connection
import typings.typeorm.entityManagerMod.EntityManager
import typings.typeorm.queryRunnerMod.QueryRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityManagerFactoryMod {
  
  @JSImport("typeorm/browser/entity-manager/EntityManagerFactory", "EntityManagerFactory")
  @js.native
  class EntityManagerFactory () extends StObject {
    
    /**
      * Creates a new entity manager depend on a given connection's driver.
      */
    def create(connection: Connection): EntityManager = js.native
    def create(connection: Connection, queryRunner: QueryRunner): EntityManager = js.native
  }
}
