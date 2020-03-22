package typings.yn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yn", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(input: js.Any): js.UndefOr[Boolean] = js.native
  def apply(input: js.Any, options: Options): js.UndefOr[Boolean] = js.native
  /**
  Parse yes/no like values.
  The following case-insensitive values are recognized: `'y', 'yes', 'true', true, '1', 1, 'n', 'no', 'false', false, '0', 0`, 'on', 'off'
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
  //=> undefined
  yn('abomasum', {default: false});
  //=> false
  yn('mo', {lenient: true});
  //=> false
  ```
  */
  def apply(input: js.Any, options: OptionsWithDefault): Boolean = js.native
}

