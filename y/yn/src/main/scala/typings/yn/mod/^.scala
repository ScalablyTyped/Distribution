package typings.yn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yn", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function yn(input: unknown, options: yn.OptionsWithDefault): boolean;
  // declare function yn(input: unknown, options?: yn.Options): boolean | null;
  // export = yn;
  var default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof yn */ js.Any = js.native
  def apply(input: js.Any): Boolean | Null = js.native
  def apply(input: js.Any, options: Options): Boolean | Null = js.native
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
  def apply(input: js.Any, options: OptionsWithDefault): Boolean = js.native
}

