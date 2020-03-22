package typings.v8ToIstanbul

import typings.v8ToIstanbul.mod.Sources
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOriginalSource extends Sources {
  var originalSource: String
  var source: String
  var sourceMap: AnonSourcemap
}

object AnonOriginalSource {
  @scala.inline
  def apply(originalSource: String, source: String, sourceMap: AnonSourcemap): AnonOriginalSource = {
    val __obj = js.Dynamic.literal(originalSource = originalSource.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceMap = sourceMap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOriginalSource]
  }
}

