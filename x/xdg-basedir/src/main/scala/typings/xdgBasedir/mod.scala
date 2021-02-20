package typings.xdgBasedir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Directory for user-specific non-essential data files.
  	@example
  	```js
  	import xdgBasedir = require('xdg-basedir');
  	xdgBasedir.cache;
  	//=> '/home/sindresorhus/.cache'
  	```
  	*/
  @JSImport("xdg-basedir", "cache")
  @js.native
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
  @JSImport("xdg-basedir", "config")
  @js.native
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
  @JSImport("xdg-basedir", "configDirs")
  @js.native
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
  @JSImport("xdg-basedir", "data")
  @js.native
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
  @JSImport("xdg-basedir", "dataDirs")
  @js.native
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
  @JSImport("xdg-basedir", "runtime")
  @js.native
  val runtime: js.UndefOr[String] = js.native
}
