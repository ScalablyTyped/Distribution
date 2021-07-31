package typings.typeorm

import typings.typeorm.connectionMod.Connection
import typings.typeorm.migrationMod.Migration
import typings.typeorm.queryRunnerMod.QueryRunner
import typings.typeorm.typeormStrings.all
import typings.typeorm.typeormStrings.each
import typings.typeorm.typeormStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object migrationExecutorMod {
  
  @JSImport("typeorm/browser/migration/MigrationExecutor", "MigrationExecutor")
  @js.native
  class MigrationExecutor protected () extends StObject {
    def this(connection: Connection) = this()
    def this(connection: Connection, queryRunner: QueryRunner) = this()
    
    /* protected */ def checkForDuplicateMigrations(migrations: js.Array[Migration]): Unit = js.native
    
    var connection: Connection = js.native
    
    /**
      * Creates table "migrations" that will store information about executed migrations.
      */
    /* protected */ def createMigrationsTableIfNotExist(queryRunner: QueryRunner): js.Promise[Unit] = js.native
    
    /**
      * Delete previously executed migration's data from the migrations table.
      */
    /* protected */ def deleteExecutedMigration(queryRunner: QueryRunner, migration: Migration): js.Promise[Unit] = js.native
    
    /**
      * Deletes an executed migration.
      */
    def deleteMigration(migration: Migration): js.Promise[Unit] = js.native
    
    /**
      * Tries to execute a single migration given.
      */
    def executeMigration(migration: Migration): js.Promise[Migration] = js.native
    
    /**
      * Executes all pending migrations. Pending migrations are migrations that are not yet executed,
      * thus not saved in the database.
      */
    def executePendingMigrations(): js.Promise[js.Array[Migration]] = js.native
    
    /**
      * Returns an array of all migrations.
      */
    def getAllMigrations(): js.Promise[js.Array[Migration]] = js.native
    
    /**
      * Returns an array of all executed migrations.
      */
    def getExecutedMigrations(): js.Promise[js.Array[Migration]] = js.native
    
    /**
      * Finds the latest migration in the given array of migrations.
      * PRE: Migration array must be sorted by descending id.
      */
    /* protected */ def getLatestExecutedMigration(sortedMigrations: js.Array[Migration]): js.UndefOr[Migration] = js.native
    
    /**
      * Finds the latest migration (sorts by timestamp) in the given array of migrations.
      */
    /* protected */ def getLatestTimestampMigration(migrations: js.Array[Migration]): js.UndefOr[Migration] = js.native
    
    /**
      * Gets all migrations that setup for this connection.
      */
    /* protected */ def getMigrations(): js.Array[Migration] = js.native
    
    /**
      * Returns an array of all pending migrations.
      */
    def getPendingMigrations(): js.Promise[js.Array[Migration]] = js.native
    
    /**
      * Inserts new executed migration's data into migrations table.
      */
    /* protected */ def insertExecutedMigration(queryRunner: QueryRunner, migration: Migration): js.Promise[Unit] = js.native
    
    /**
      * Inserts an executed migration.
      */
    def insertMigration(migration: Migration): js.Promise[Unit] = js.native
    
    /**
      * Loads all migrations that were executed and saved into the database (sorts by id).
      */
    /* protected */ def loadExecutedMigrations(queryRunner: QueryRunner): js.Promise[js.Array[Migration]] = js.native
    
    val migrationsTable: js.Any = js.native
    
    val migrationsTableName: js.Any = js.native
    
    var queryRunner: js.UndefOr[QueryRunner] = js.native
    
    /**
      * Lists all migrations and whether they have been executed or not
      * returns true if there are unapplied migrations
      */
    def showMigrations(): js.Promise[Boolean] = js.native
    
    /**
      * Indicates how migrations should be run in transactions.
      *   all: all migrations are run in a single transaction
      *   none: all migrations are run without a transaction
      *   each: each migration is run in a separate transaction
      */
    var transaction: all | none | each = js.native
    
    /**
      * Reverts last migration that were run.
      */
    def undoLastMigration(): js.Promise[Unit] = js.native
    
    /* protected */ def withQueryRunner[T /* <: js.Any */](callback: js.Function1[/* queryRunner */ QueryRunner, T]): js.Promise[T] = js.native
  }
}
