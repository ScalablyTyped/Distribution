package typings.svgSpriteLoader

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("svg-sprite-loader", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(source: String): js.UndefOr[String | Buffer | Unit] = js.native
  def apply(source: Buffer): js.UndefOr[String | Buffer | Unit] = js.native
}

