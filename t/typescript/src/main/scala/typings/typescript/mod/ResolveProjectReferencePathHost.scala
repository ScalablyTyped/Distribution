package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolveProjectReferencePathHost extends StObject {
  
  def fileExists(fileName: java.lang.String): Boolean = js.native
}
object ResolveProjectReferencePathHost {
  
  @scala.inline
  def apply(fileExists: java.lang.String => Boolean): ResolveProjectReferencePathHost = {
    val __obj = js.Dynamic.literal(fileExists = js.Any.fromFunction1(fileExists))
    __obj.asInstanceOf[ResolveProjectReferencePathHost]
  }
  
  @scala.inline
  implicit class ResolveProjectReferencePathHostMutableBuilder[Self <: ResolveProjectReferencePathHost] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileExists(value: java.lang.String => Boolean): Self = StObject.set(x, "fileExists", js.Any.fromFunction1(value))
  }
}
