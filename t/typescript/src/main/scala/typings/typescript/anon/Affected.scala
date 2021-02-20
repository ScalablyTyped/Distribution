package typings.typescript.anon

import typings.typescript.mod.Program
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Affected[T] extends StObject {
  
  var affected: SourceFile | Program = js.native
  
  var result: T = js.native
}
object Affected {
  
  @scala.inline
  def apply[T](affected: SourceFile | Program, result: T): Affected[T] = {
    val __obj = js.Dynamic.literal(affected = affected.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Affected[T]]
  }
  
  @scala.inline
  implicit class AffectedMutableBuilder[Self <: Affected[_], T] (val x: Self with Affected[T]) extends AnyVal {
    
    @scala.inline
    def setAffected(value: SourceFile | Program): Self = StObject.set(x, "affected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: T): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
