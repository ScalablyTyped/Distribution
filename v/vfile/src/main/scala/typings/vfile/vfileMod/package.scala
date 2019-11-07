package typings.vfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object vfileMod {
  import typings.node.Buffer

  /* Rewritten from type alias, can be one of: 
    - typings.vfile.vfileMod.VFile
    - typings.vfile.vfileMod.VFileOptions
    - typings.vfile.vfileMod.VFileContents
  */
  type VFileCompatible = _VFileCompatible | VFileContents
  type VFileContents = String | Buffer
}
