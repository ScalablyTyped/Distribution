package typings.typeorm

import typings.typeorm.anon.Docker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object initCommandMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify yargs.CommandModule * / any */ @JSImport("typeorm/commands/InitCommand", "InitCommand")
  @js.native
  class InitCommand () extends StObject {
    
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
  object InitCommand {
    
    /**
      * Appends to a given package.json template everything needed.
      */
    @JSImport("typeorm/commands/InitCommand", "InitCommand.appendPackageJson")
    @js.native
    def appendPackageJson(packageJsonContents: String, database: String, express: Boolean): String = js.native
    
    /**
      * Gets contents of the main (index) application file.
      */
    @JSImport("typeorm/commands/InitCommand", "InitCommand.getAppIndexTemplate")
    @js.native
    def getAppIndexTemplate(express: Boolean): String = js.native
    
    /**
      * Gets contents of the user controller file (used when express is enabled).
      */
    @JSImport("typeorm/commands/InitCommand", "InitCommand.getControllerTemplate")
    @js.native
    def getControllerTemplate(): String = js.native
    
    /**
      * Gets contents of the new docker-compose.yml file.
      */
    @JSImport("typeorm/commands/InitCommand", "InitCommand.getDockerComposeTemplate")
    @js.native
    def getDockerComposeTemplate(database: String): String = js.native
    
    /**
      * Gets contents of the .gitignore file.
      */
    @JSImport("typeorm/commands/InitCommand", "InitCommand.getGitIgnoreFile")
    @js.native
    def getGitIgnoreFile(): String = js.native
    
    /**
      * Gets contents of the ormconfig file.
      */
    @JSImport("typeorm/commands/InitCommand", "InitCommand.getOrmConfigTemplate")
    @js.native
    def getOrmConfigTemplate(database: String): String = js.native
    
    /**
      * Gets contents of the new package.json file.
      */
    @JSImport("typeorm/commands/InitCommand", "InitCommand.getPackageJsonTemplate")
    @js.native
    def getPackageJsonTemplate(): String = js.native
    @JSImport("typeorm/commands/InitCommand", "InitCommand.getPackageJsonTemplate")
    @js.native
    def getPackageJsonTemplate(projectName: String): String = js.native
    
    /**
      * Gets contents of the new readme.md file.
      */
    @JSImport("typeorm/commands/InitCommand", "InitCommand.getReadmeTemplate")
    @js.native
    def getReadmeTemplate(options: Docker): String = js.native
    
    /**
      * Gets contents of the route file (used when express is enabled).
      */
    @JSImport("typeorm/commands/InitCommand", "InitCommand.getRoutesTemplate")
    @js.native
    def getRoutesTemplate(): String = js.native
    
    /**
      * Gets contents of the ormconfig file.
      */
    @JSImport("typeorm/commands/InitCommand", "InitCommand.getTsConfigTemplate")
    @js.native
    def getTsConfigTemplate(): String = js.native
    
    /**
      * Gets contents of the user entity.
      */
    @JSImport("typeorm/commands/InitCommand", "InitCommand.getUserEntityTemplate")
    @js.native
    def getUserEntityTemplate(database: String): String = js.native
  }
}
