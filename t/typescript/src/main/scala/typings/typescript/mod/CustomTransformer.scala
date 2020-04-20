package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomTransformer extends js.Object {
  def transformBundle(node: Bundle): Bundle
  def transformSourceFile(node: SourceFile): SourceFile
}

object CustomTransformer {
  @scala.inline
  def apply(transformBundle: Bundle => Bundle, transformSourceFile: SourceFile => SourceFile): CustomTransformer = {
    val __obj = js.Dynamic.literal(transformBundle = js.Any.fromFunction1(transformBundle), transformSourceFile = js.Any.fromFunction1(transformSourceFile))
    __obj.asInstanceOf[CustomTransformer]
  }
}

