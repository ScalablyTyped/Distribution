package typings.typeorm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/commands/VersionCommand", JSImport.Namespace)
@js.native
object versionCommandMod extends js.Object {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify yargs.CommandModule * / any */ @js.native
  class VersionCommand () extends js.Object {
    
    var command: String = js.native
    
    var describe: String = js.native
    
    def handler(): js.Promise[Unit] = js.native
  }
  /* static members */
  @js.native
  object VersionCommand extends js.Object {
    
    /* protected */ def executeCommand(command: String): js.Promise[String] = js.native
  }
}
