package typings.vfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typings.vfile.mod.VFile
    - typings.vfile.mod.VFileOptions
    - typings.vfile.mod.VFileContents
  */
  type VFileCompatible = typings.vfile.mod._VFileCompatible | typings.vfile.mod.VFileContents
  type VFileContents = java.lang.String | typings.node.Buffer
}
