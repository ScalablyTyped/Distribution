package typings.waitDashForDashLocalhost

import typings.waitDashForDashLocalhost.waitDashForDashLocalhostMod.Options
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
  def apply(): js.Promise[Unit] = js.native
  def apply(options: Options): js.Promise[Unit] = js.native
}

