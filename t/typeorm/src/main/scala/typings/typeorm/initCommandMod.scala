package typings.typeorm

import typings.typeorm.anon.Docker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/commands/InitCommand", JSImport.Namespace)
@js.native
object initCommandMod extends js.Object {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify yargs.CommandModule * / any */ @js.native
  class InitCommand () extends js.Object {
    
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
  object InitCommand extends js.Object {
    
    /**
      * Appends to a given package.json template everything needed.
      */
    /* protected */ def appendPackageJson(packageJsonContents: String, database: String, express: Boolean): String = js.native
    
    /**
      * Gets contents of the main (index) application file.
      */
    /* protected */ def getAppIndexTemplate(express: Boolean): String = js.native
    
    /**
      * Gets contents of the user controller file (used when express is enabled).
      */
    /* protected */ def getControllerTemplate(): String = js.native
    
    /**
      * Gets contents of the new docker-compose.yml file.
      */
    /* protected */ def getDockerComposeTemplate(database: String): String = js.native
    
    /**
      * Gets contents of the .gitignore file.
      */
    /* protected */ def getGitIgnoreFile(): String = js.native
    
    /**
      * Gets contents of the ormconfig file.
      */
    /* protected */ def getOrmConfigTemplate(database: String): String = js.native
    
    /**
      * Gets contents of the new package.json file.
      */
    /* protected */ def getPackageJsonTemplate(): String = js.native
    /* protected */ def getPackageJsonTemplate(projectName: String): String = js.native
    
    /**
      * Gets contents of the new readme.md file.
      */
    /* protected */ def getReadmeTemplate(options: Docker): String = js.native
    
    /**
      * Gets contents of the route file (used when express is enabled).
      */
    /* protected */ def getRoutesTemplate(): String = js.native
    
    /**
      * Gets contents of the ormconfig file.
      */
    /* protected */ def getTsConfigTemplate(): String = js.native
    
    /**
      * Gets contents of the user entity.
      */
    /* protected */ def getUserEntityTemplate(database: String): String = js.native
  }
}
