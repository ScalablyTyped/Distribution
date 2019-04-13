package typings
package ynLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Default extends js.Object {
  def apply(input: js.Any): scala.Boolean | scala.Null = js.native
  def apply(input: js.Any, options: ynLib.ynMod.Options): scala.Boolean | scala.Null = js.native
  /**
  	Parse yes/no like values.
  	The following case-insensitive values are recognized: `'y', 'yes', 'true', true, '1', 1, 'n', 'no', 'false', false, '0', 0`
  	@param input - Value that should be converted.
  	@returns The parsed input if it can be parsed or the default value defined in the `default` option.
  	@example
  	```
  	import yn = require('yn');
  	yn('y');
  	//=> true
  	yn('NO');
  	//=> false
  	yn(true);
  	//=> true
  	yn('abomasum');
  	//=> null
  	yn('abomasum', {default: false});
  	//=> false
  	yn('mo', {lenient: true});
  	//=> false
  	```
  	*/
  def apply(input: js.Any, options: ynLib.ynMod.OptionsWithDefault): scala.Boolean = js.native
}

