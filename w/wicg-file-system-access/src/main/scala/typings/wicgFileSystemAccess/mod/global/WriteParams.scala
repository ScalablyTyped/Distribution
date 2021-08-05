package typings.wicgFileSystemAccess.mod.global

import typings.std.Blob
import typings.std.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.wicgFileSystemAccess.anon.Data
  - typings.wicgFileSystemAccess.anon.Position
  - typings.wicgFileSystemAccess.anon.Size
*/
trait WriteParams extends StObject
object WriteParams {
  
  inline def Data(data: BufferSource | Blob | String): typings.wicgFileSystemAccess.anon.Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("write")
    __obj.asInstanceOf[typings.wicgFileSystemAccess.anon.Data]
  }
  
  inline def Position(position: Double): typings.wicgFileSystemAccess.anon.Position = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("seek")
    __obj.asInstanceOf[typings.wicgFileSystemAccess.anon.Position]
  }
  
  inline def Size(size: Double): typings.wicgFileSystemAccess.anon.Size = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("truncate")
    __obj.asInstanceOf[typings.wicgFileSystemAccess.anon.Size]
  }
}
