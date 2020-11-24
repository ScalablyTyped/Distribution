package typings.v8ToIstanbul.mod

import typings.v8ToIstanbul.anon.Sourcemap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.v8ToIstanbul.anon.Source
  - typings.v8ToIstanbul.anon.OriginalSource
*/
trait Sources extends js.Object
object Sources {
  
  @scala.inline
  def Source(source: String): Sources = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sources]
  }
  
  @scala.inline
  def OriginalSource(originalSource: String, source: String, sourceMap: Sourcemap): Sources = {
    val __obj = js.Dynamic.literal(originalSource = originalSource.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceMap = sourceMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sources]
  }
}
