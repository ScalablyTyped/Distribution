package typings.tern.ternMod

import typings.tern.ternStrings.files
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilesQuery
  extends StObject
     with BaseQuery
     with Query {
  
  @JSName("docFormat")
  var docFormat_FilesQuery: js.UndefOr[scala.Nothing] = js.undefined
  
  @JSName("lineCharPositions")
  var lineCharPositions_FilesQuery: js.UndefOr[scala.Nothing] = js.undefined
  
  /** Get the files that the server currently holds in its set of analyzed files. */
  @JSName("type")
  var type_FilesQuery: files
}
object FilesQuery {
  
  @scala.inline
  def apply(): FilesQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("files")
    __obj.asInstanceOf[FilesQuery]
  }
  
  @scala.inline
  implicit class FilesQueryMutableBuilder[Self <: FilesQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: files): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
