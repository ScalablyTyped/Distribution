package typings.typeorm

import typings.typeorm.queryRunnerMod.QueryRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object migrationInterfaceMod {
  
  trait MigrationInterface extends StObject {
    
    /**
      * Reverse the migrations.
      */
    def down(queryRunner: QueryRunner): js.Promise[js.Any]
    
    /**
      * Optional migration name, defaults to class name.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Run the migrations.
      */
    def up(queryRunner: QueryRunner): js.Promise[js.Any]
  }
  object MigrationInterface {
    
    @scala.inline
    def apply(down: QueryRunner => js.Promise[js.Any], up: QueryRunner => js.Promise[js.Any]): MigrationInterface = {
      val __obj = js.Dynamic.literal(down = js.Any.fromFunction1(down), up = js.Any.fromFunction1(up))
      __obj.asInstanceOf[MigrationInterface]
    }
    
    @scala.inline
    implicit class MigrationInterfaceMutableBuilder[Self <: MigrationInterface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDown(value: QueryRunner => js.Promise[js.Any]): Self = StObject.set(x, "down", js.Any.fromFunction1(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setUp(value: QueryRunner => js.Promise[js.Any]): Self = StObject.set(x, "up", js.Any.fromFunction1(value))
    }
  }
}
