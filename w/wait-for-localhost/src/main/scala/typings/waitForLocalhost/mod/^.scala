package typings.waitForLocalhost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wait-for-localhost", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
  	Wait for localhost to be ready.
  	@example
  	```
  	import waitForLocalhost = require('wait-for-localhost');
  	(async () => {
  		await waitForLocalhost({port: 8080});
  		console.log('Server is ready');
  	})();
  	```
  	 */
  def apply(): js.Promise[Unit] = js.native
  def apply(options: Options): js.Promise[Unit] = js.native
  
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function waitForLocalhost(
  // 	options?: waitForLocalhost.Options
  // ): Promise<void>;
  // export = waitForLocalhost;
  var default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof waitForLocalhost */ js.Any = js.native
}
