package typings.wicgFileSystemAccess.mod.global

import typings.std.Blob
import typings.std.BufferSource
import typings.wicgFileSystemAccess.wicgFileSystemAccessStrings.seek
import typings.wicgFileSystemAccess.wicgFileSystemAccessStrings.truncate
import typings.wicgFileSystemAccess.wicgFileSystemAccessStrings.write
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.wicgFileSystemAccess.anon.Data
  - typings.wicgFileSystemAccess.anon.Position
  - typings.wicgFileSystemAccess.anon.Size
*/
trait WriteParams extends StObject
object WriteParams {
  
  @scala.inline
  def Data(data: BufferSource | Blob | String, `type`: write): typings.wicgFileSystemAccess.anon.Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.wicgFileSystemAccess.anon.Data]
  }
  
  @scala.inline
  def Position(position: Double, `type`: seek): typings.wicgFileSystemAccess.anon.Position = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.wicgFileSystemAccess.anon.Position]
  }
  
  @scala.inline
  def Size(size: Double, `type`: truncate): typings.wicgFileSystemAccess.anon.Size = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.wicgFileSystemAccess.anon.Size]
  }
}
