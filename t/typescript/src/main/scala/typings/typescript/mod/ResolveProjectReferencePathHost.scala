package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolveProjectReferencePathHost extends js.Object {
  
  def fileExists(fileName: java.lang.String): Boolean = js.native
}
object ResolveProjectReferencePathHost {
  
  @scala.inline
  def apply(fileExists: java.lang.String => Boolean): ResolveProjectReferencePathHost = {
    val __obj = js.Dynamic.literal(fileExists = js.Any.fromFunction1(fileExists))
    __obj.asInstanceOf[ResolveProjectReferencePathHost]
  }
  
  @scala.inline
  implicit class ResolveProjectReferencePathHostOps[Self <: ResolveProjectReferencePathHost] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFileExists(value: java.lang.String => Boolean): Self = this.set("fileExists", js.Any.fromFunction1(value))
  }
}
