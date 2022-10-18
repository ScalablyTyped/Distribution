package typings.webdriverio.buildTypesMod

import typings.webdriverio.webdriverioBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof webdriverio.webdriverio/build/types.InstanceBase, 'sessionId'> ]: webdriverio.webdriverio/build/types.InstanceBase[P]} */ @js.native
trait MultiRemoteBase
  extends StObject
     with CustomInstanceCommands[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.MultiRemoteBrowser */ Any
    ] {
  
  /**
    * multiremote browser instance names
    */
  var instances: js.Array[String] = js.native
  
  /**
    * flag to indicate multiremote browser session
    */
  var isMultiremote: `true` = js.native
}
