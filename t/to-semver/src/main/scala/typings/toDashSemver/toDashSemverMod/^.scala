package typings.toDashSemver.toDashSemverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("to-semver", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  Get an array of valid, sorted, and cleaned [semver](https://semver.org/) versions from an array of strings.
  @example
  ```
  import toSemver = require('to-semver');
  toSemver([
  	'v1.3.16',
  	'v1.7.0',
  	'test',
  	'v1.6.9'
  ]);
  // [
  // 	'1.7.0',
  // 	'1.6.9'
  // 	'1.3.16'
  // ]
  ```
  */
  def apply(versions: js.Array[String]): js.Array[String] = js.native
  def apply(versions: js.Array[String], options: Options): js.Array[String] = js.native
}

