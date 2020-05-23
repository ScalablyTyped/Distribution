package typings.v8ToIstanbul.anon

import typings.v8ToIstanbul.mod.Sources
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginalSource extends Sources {
  var originalSource: String
  var source: String
  var sourceMap: Sourcemap
}

object OriginalSource {
  @scala.inline
  def apply(originalSource: String, source: String, sourceMap: Sourcemap): OriginalSource = {
    val __obj = js.Dynamic.literal(originalSource = originalSource.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceMap = sourceMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalSource]
  }
}

