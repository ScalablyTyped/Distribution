package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    /**
      * Gets contents of the migration file.
      */
    @JSImport("typeorm/commands/MigrationGenerateCommand", "MigrationGenerateCommand.getTemplate")
    @js.native
    def getTemplate(name: String, timestamp: Double, upSqls: js.Array[String], downSqls: js.Array[String]): String = js.native
    
    /**
      *
      */
    @JSImport("typeorm/commands/MigrationGenerateCommand", "MigrationGenerateCommand.prettifyQuery")
    @js.native
    def prettifyQuery(query: String): String = js.native
    
    /**
      * Formats query parameters for migration queries if parameters actually exist
      */
    @JSImport("typeorm/commands/MigrationGenerateCommand", "MigrationGenerateCommand.queryParams")
    @js.native
    def queryParams(): String = js.native
    @JSImport("typeorm/commands/MigrationGenerateCommand", "MigrationGenerateCommand.queryParams")
    @js.native
    def queryParams(parameters: js.Array[_]): String = js.native
  }
}
