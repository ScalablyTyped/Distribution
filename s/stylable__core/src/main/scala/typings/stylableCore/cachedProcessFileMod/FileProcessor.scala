package typings.stylableCore.cachedProcessFileMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileProcessor[T] extends js.Object {
  
  def add(fullpath: String, value: T): Unit = js.native
  
  var cache: Record[String, CacheItem[T]] = js.native
  
  var postProcessors: js.Array[js.Function2[/* value */ T, /* path */ String, T]] = js.native
  
  def process(fullpath: String): T = js.native
  def process(fullpath: String, ignoreCache: js.UndefOr[scala.Nothing], context: String): T = js.native
  def process(fullpath: String, ignoreCache: Boolean): T = js.native
  def process(fullpath: String, ignoreCache: Boolean, context: String): T = js.native
  
  def processContent(content: String, fullpath: String): T = js.native
  
  def resolvePath(path: String): String = js.native
  def resolvePath(path: String, context: String): String = js.native
}
