package typings.waitDashForDashLocalhost.waitDashForDashLocalhostMod

import typings.waitDashForDashLocalhost.Anon_Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wait-for-localhost", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function waitForLocalhost(
  // 	options?: waitForLocalhost.Options
  // ): Promise<void>;
  // export = waitForLocalhost;
  @JSName("default")
  var default_Original: Anon_Default = js.native
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
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function waitForLocalhost(
  // 	options?: waitForLocalhost.Options
  // ): Promise<void>;
  // export = waitForLocalhost;
  def default(): js.Promise[Unit] = js.native
  def default(options: Options): js.Promise[Unit] = js.native
}

