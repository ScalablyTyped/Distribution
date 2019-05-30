package typings
package trashLib.trashMod

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
  def apply(
    input: java.lang.String | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify readonly */ js.Any),
    string: js.Any,
    has: js.Any
  ): js.Promise[scala.Unit] = js.native
  def apply(
    input: java.lang.String | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify readonly */ js.Any),
    string: js.Any,
    has: js.Any,
    options: Options
  ): js.Promise[scala.Unit] = js.native
}

