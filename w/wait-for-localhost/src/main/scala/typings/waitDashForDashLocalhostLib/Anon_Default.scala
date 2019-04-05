package typings
package waitDashForDashLocalhostLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Default extends js.Object {
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
}

