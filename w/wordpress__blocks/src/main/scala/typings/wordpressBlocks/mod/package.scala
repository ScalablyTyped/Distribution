package typings.wordpressBlocks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typings.wordpressBlocks.mod.AttributeSource.Attribute
    - typings.wordpressBlocks.mod.AttributeSource.Children
    - typings.wordpressBlocks.mod.AttributeSource.HTML
    - typings.wordpressBlocks.mod.AttributeSource.Meta
    - typings.wordpressBlocks.mod.AttributeSource.Query[T]
    - typings.wordpressBlocks.mod.AttributeSource.Text
    - typings.wordpressBlocks.mod.AttributeSource.None
  */
  type BlockAttribute[T] = typings.wordpressBlocks.mod._BlockAttribute[T] | typings.wordpressBlocks.mod.AttributeSource.Attribute | typings.wordpressBlocks.mod.AttributeSource.None
}
