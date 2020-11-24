package typings.superstruct.typingsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Failure
  extends /* key */ StringDictionary[js.Any] {
  
  var branch: js.Array[_] = js.native
  
  var path: js.Array[String | Double] = js.native
  
  var refinement: js.UndefOr[String] = js.native
  
  var `type`: String = js.native
  
  var value: /* import warning: importer.ImportType#apply Failed type conversion: superstruct.superstruct/lib/typings.Context['value'] */ js.Any = js.native
}
object Failure {
  
  @scala.inline
  def apply(
    branch: js.Array[_],
    path: js.Array[String | Double],
    `type`: String,
    value: /* import warning: importer.ImportType#apply Failed type conversion: superstruct.superstruct/lib/typings.Context['value'] */ js.Any
  ): Failure = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Failure]
  }
  
  @scala.inline
  implicit class FailureOps[Self <: Failure] (val x: Self) extends AnyVal {
    
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
    def setBranchVarargs(value: js.Any*): Self = this.set("branch", js.Array(value :_*))
    
    @scala.inline
    def setBranch(value: js.Array[_]): Self = this.set("branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: (String | Double)*): Self = this.set("path", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: js.Array[String | Double]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(
      value: /* import warning: importer.ImportType#apply Failed type conversion: superstruct.superstruct/lib/typings.Context['value'] */ js.Any
    ): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefinement(value: String): Self = this.set("refinement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefinement: Self = this.set("refinement", js.undefined)
  }
}
