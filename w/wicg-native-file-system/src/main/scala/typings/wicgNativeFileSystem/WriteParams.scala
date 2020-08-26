package typings.wicgNativeFileSystem

import typings.std.Blob
import typings.std.BufferSource
import typings.wicgNativeFileSystem.wicgNativeFileSystemStrings.seek
import typings.wicgNativeFileSystem.wicgNativeFileSystemStrings.truncate
import typings.wicgNativeFileSystem.wicgNativeFileSystemStrings.write
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.wicgNativeFileSystem.anon.Data
  - typings.wicgNativeFileSystem.anon.Position
  - typings.wicgNativeFileSystem.anon.Size
*/
trait WriteParams extends js.Object

object WriteParams {
  @scala.inline
  def Data(data: BufferSource | Blob | String, `type`: write): WriteParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteParams]
  }
  @scala.inline
  def Position(position: Double, `type`: seek): WriteParams = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteParams]
  }
  @scala.inline
  def Size(size: Double, `type`: truncate): WriteParams = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteParams]
  }
}

