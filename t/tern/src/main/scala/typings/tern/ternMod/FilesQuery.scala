package typings.tern.ternMod

import typings.tern.ternStrings.files
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilesQuery
  extends BaseQuery
     with Query {
  
  @JSName("docFormat")
  var docFormat_FilesQuery: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("lineCharPositions")
  var lineCharPositions_FilesQuery: js.UndefOr[scala.Nothing] = js.native
  
  /** Get the files that the server currently holds in its set of analyzed files. */
  @JSName("type")
  var type_FilesQuery: files = js.native
}
object FilesQuery {
  
  @scala.inline
  def apply(`type`: files): FilesQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilesQuery]
  }
  
  @scala.inline
  implicit class FilesQueryMutableBuilder[Self <: FilesQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: files): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
