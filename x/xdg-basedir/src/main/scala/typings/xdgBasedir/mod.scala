package typings.xdgBasedir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xdg-basedir", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
  	Directory for user-specific non-essential data files.
  	@example
  	```js
  	import xdgBasedir = require('xdg-basedir');
  	xdgBasedir.cache;
  	//=> '/home/sindresorhus/.cache'
  	```
  	*/
  val cache: js.UndefOr[String] = js.native
  
  /**
  	Directory for user-specific configuration files.
  	@example
  	```js
  	import xdgBasedir = require('xdg-basedir');
  	xdgBasedir.config;
  	//=> '/home/sindresorhus/.config'
  	```
  	*/
  val config: js.UndefOr[String] = js.native
  
  /**
  	Preference-ordered array of base directories to search for configuration files in addition to `.config`.
  	@example
  	```js
  	import xdgBasedir = require('xdg-basedir');
  	xdgBasedir.configDirs;
  	//=> ['/home/sindresorhus/.config', '/etc/xdg']
  	```
  	*/
  val configDirs: js.Array[String] = js.native
  
  /**
  	Directory for user-specific data files.
  	@example
  	```js
  	import xdgBasedir = require('xdg-basedir');
  	xdgBasedir.data;
  	//=> '/home/sindresorhus/.local/share'
  	```
  	*/
  val data: js.UndefOr[String] = js.native
  
  /**
  	Preference-ordered array of base directories to search for data files in addition to `.data`.
  	@example
  	```js
  	import xdgBasedir = require('xdg-basedir');
  	xdgBasedir.dataDirs
  	//=> ['/home/sindresorhus/.local/share', '/usr/local/share/', '/usr/share/']
  	```
  	*/
  val dataDirs: js.Array[String] = js.native
  
  /**
  	Directory for user-specific non-essential runtime files and other file objects (such as sockets, named pipes, etc).
  	@example
  	```js
  	import xdgBasedir = require('xdg-basedir');
  	xdgBasedir.runtime;
  	//=> '/run/user/sindresorhus'
  	```
  	*/
  val runtime: js.UndefOr[String] = js.native
}
