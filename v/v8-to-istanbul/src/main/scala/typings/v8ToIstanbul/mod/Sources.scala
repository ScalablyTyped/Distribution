package typings.v8ToIstanbul.mod

import typings.v8ToIstanbul.AnonSourcemap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.v8ToIstanbul.AnonSource
  - typings.v8ToIstanbul.AnonOriginalSource
*/
trait Sources extends js.Object

object Sources {
  @scala.inline
  def AnonSource(source: String): Sources = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Sources]
  }
  @scala.inline
  def AnonOriginalSource(originalSource: String, source: String, sourceMap: AnonSourcemap): Sources = {
    val __obj = js.Dynamic.literal(originalSource = originalSource.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceMap = sourceMap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Sources]
  }
}

