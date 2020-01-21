package typings.trash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("trash", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  Move files and folders to the trash.
  @param input - Accepts paths and [glob patterns](https://github.com/sindresorhus/globby#globbing-patterns).
  @example
  ```
  import trash = require('trash');
  (async () => {
  	await trash(['*.png', '!rainbow.png']);
  })();
  ```
  */
  def apply(input: String): js.Promise[Unit] = js.native
  def apply(input: String, options: Options): js.Promise[Unit] = js.native
  def apply(input: js.Array[String]): js.Promise[Unit] = js.native
  def apply(input: js.Array[String], options: Options): js.Promise[Unit] = js.native
}

