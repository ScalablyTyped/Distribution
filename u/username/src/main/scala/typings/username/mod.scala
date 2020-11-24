package typings.username

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("username", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
  	Get the username of the current user.
  	It first tries to get the username from the `SUDO_USER` `LOGNAME` `USER` `LNAME` `USERNAME` environment variables. Then falls back to `$ id -un` on macOS / Linux and `$ whoami` on Windows, in the rare case none of the environment variables are set. The result is cached.
  	@returns The username.
  	@example
  	```
  	import username = require('username');
  	(async () => {
  		console.log(await username());
  		//=> 'sindresorhus'
  	})();
  	```
  	*/
  def apply(): js.Promise[js.UndefOr[String]] = js.native
  
  /**
  	Synchronously get the username of the current user.
  	It first tries to get the username from the `SUDO_USER` `LOGNAME` `USER` `LNAME` `USERNAME` environment variables. Then falls back to `$ id -un` on macOS / Linux and `$ whoami` on Windows, in the rare case none of the environment variables are set. The result is cached.
  	@returns The username.
  	@example
  	```
  	import username = require('username');
  	console.log(username.sync());
  	//=> 'sindresorhus'
  	```
  	*/
  def sync(): js.UndefOr[String] = js.native
}
