package typings.typeorm

import typings.typeorm.anon.Docker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("typeorm/commands/InitCommand", "InitCommand")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Appends to a given package.json template everything needed.
      */
    @scala.inline
    def appendPackageJson(packageJsonContents: String, database: String, express: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("appendPackageJson")(packageJsonContents.asInstanceOf[js.Any], database.asInstanceOf[js.Any], express.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Gets contents of the main (index) application file.
      */
    @scala.inline
    def getAppIndexTemplate(express: Boolean): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppIndexTemplate")(express.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Gets contents of the user controller file (used when express is enabled).
      */
    @scala.inline
    def getControllerTemplate(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getControllerTemplate")().asInstanceOf[String]
    
    /**
      * Gets contents of the new docker-compose.yml file.
      */
    @scala.inline
    def getDockerComposeTemplate(database: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDockerComposeTemplate")(database.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Gets contents of the .gitignore file.
      */
    @scala.inline
    def getGitIgnoreFile(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getGitIgnoreFile")().asInstanceOf[String]
    
    /**
      * Gets contents of the ormconfig file.
      */
    @scala.inline
    def getOrmConfigTemplate(database: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrmConfigTemplate")(database.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Gets contents of the new package.json file.
      */
    @scala.inline
    def getPackageJsonTemplate(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPackageJsonTemplate")().asInstanceOf[String]
    @scala.inline
    def getPackageJsonTemplate(projectName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPackageJsonTemplate")(projectName.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Gets contents of the new readme.md file.
      */
    @scala.inline
    def getReadmeTemplate(options: Docker): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getReadmeTemplate")(options.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Gets contents of the route file (used when express is enabled).
      */
    @scala.inline
    def getRoutesTemplate(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRoutesTemplate")().asInstanceOf[String]
    
    /**
      * Gets contents of the ormconfig file.
      */
    @scala.inline
    def getTsConfigTemplate(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTsConfigTemplate")().asInstanceOf[String]
    
    /**
      * Gets contents of the user entity.
      */
    @scala.inline
    def getUserEntityTemplate(database: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserEntityTemplate")(database.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
