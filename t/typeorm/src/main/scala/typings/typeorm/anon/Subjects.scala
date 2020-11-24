package typings.typeorm.anon

import typings.typeorm.subjectMod.Subject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subjects extends js.Object {
  
  var subjects: js.Array[Subject] = js.native
  
  var target: js.Function | String = js.native
}
object Subjects {
  
  @scala.inline
  def apply(subjects: js.Array[Subject], target: js.Function | String): Subjects = {
    val __obj = js.Dynamic.literal(subjects = subjects.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subjects]
  }
  
  @scala.inline
  implicit class SubjectsOps[Self <: Subjects] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSubjectsVarargs(value: Subject*): Self = this.set("subjects", js.Array(value :_*))
    
    @scala.inline
    def setSubjects(value: js.Array[Subject]): Self = this.set("subjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: js.Function | String): Self = this.set("target", value.asInstanceOf[js.Any])
  }
}
