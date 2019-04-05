package typings
package waitDashForDashLocalhostLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DefaultOptions extends js.Object {
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
  def apply(): js.Promise[scala.Unit] = js.native
  def apply(options: waitDashForDashLocalhostLib.waitDashForDashLocalhostMod.waitForLocalhostNs.Options): js.Promise[scala.Unit] = js.native
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
  def default(): js.Promise[scala.Unit] = js.native
  def default(options: waitDashForDashLocalhostLib.waitDashForDashLocalhostMod.waitForLocalhostNs.Options): js.Promise[scala.Unit] = js.native
}

