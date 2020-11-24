package typings.typeorm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/commands/MigrationGenerateCommand", JSImport.Namespace)
@js.native
object migrationGenerateCommandMod extends js.Object {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify yargs.CommandModule * / any */ @js.native
  class MigrationGenerateCommand () extends js.Object {
    
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
  @js.native
  object MigrationGenerateCommand extends js.Object {
    
    /**
      * Gets contents of the migration file.
      */
    /* protected */ def getTemplate(name: String, timestamp: Double, upSqls: js.Array[String], downSqls: js.Array[String]): String = js.native
    
    /**
      *
      */
    /* protected */ def prettifyQuery(query: String): String = js.native
    
    /**
      * Formats query parameters for migration queries if parameters actually exist
      */
    /* protected */ def queryParams(): String = js.native
    /* protected */ def queryParams(parameters: js.Array[_]): String = js.native
  }
}
