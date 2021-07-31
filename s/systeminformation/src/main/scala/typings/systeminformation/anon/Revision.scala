package typings.systeminformation.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Revision extends StObject {
  
  var revision: Double
  
  var table: js.Array[Flags]
}
object Revision {
  
  @scala.inline
  def apply(revision: Double, table: js.Array[Flags]): Revision = {
    val __obj = js.Dynamic.literal(revision = revision.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[Revision]
  }
  
  @scala.inline
  implicit class RevisionMutableBuilder[Self <: Revision] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTable(value: js.Array[Flags]): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableVarargs(value: Flags*): Self = StObject.set(x, "table", js.Array(value :_*))
  }
}
