package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscriberCreateCommandMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify yargs.CommandModule * / any */ @JSImport("typeorm/commands/SubscriberCreateCommand", "SubscriberCreateCommand")
  @js.native
  class SubscriberCreateCommand () extends StObject {
    
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
  object SubscriberCreateCommand {
    
    @JSImport("typeorm/commands/SubscriberCreateCommand", "SubscriberCreateCommand")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets contents of the entity file.
      */
    @scala.inline
    def getTemplate(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
