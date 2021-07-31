package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object migrationGenerateCommandMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify yargs.CommandModule * / any */ @JSImport("typeorm/commands/MigrationGenerateCommand", "MigrationGenerateCommand")
  @js.native
  class MigrationGenerateCommand () extends StObject {
    
    var aliases: String = js.native
    
    def builder(
      args: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify yargs.Argv */ js.Any
    ): js.Any = js.native
    
    var command: String = js.native
    
    var describe: String = js.native
    
    def handler(
      args: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify yargs.Arguments */ js.Any
    ): js.Promise[Unit] = js.native
  }
  /* static members */
  object MigrationGenerateCommand {
    
    @JSImport("typeorm/commands/MigrationGenerateCommand", "MigrationGenerateCommand")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets contents of the migration file.
      */
    @scala.inline
    def getTemplate(name: String, timestamp: Double, upSqls: js.Array[String], downSqls: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any], upSqls.asInstanceOf[js.Any], downSqls.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      *
      */
    @scala.inline
    def prettifyQuery(query: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("prettifyQuery")(query.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Formats query parameters for migration queries if parameters actually exist
      */
    @scala.inline
    def queryParams(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("queryParams")().asInstanceOf[String]
    @scala.inline
    def queryParams(parameters: js.Array[js.Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("queryParams")(parameters.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
