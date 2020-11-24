package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Summary of the document usage statistics for the environment. */
@js.native
trait EnvironmentDocuments extends js.Object {
  
  /** Number of documents indexed for the environment. */
  var indexed: js.UndefOr[Double] = js.native
  
  /** Total number of documents allowed in the environment's capacity. */
  var maximum_allowed: js.UndefOr[Double] = js.native
}
object EnvironmentDocuments {
  
  @scala.inline
  def apply(): EnvironmentDocuments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentDocuments]
  }
  
  @scala.inline
  implicit class EnvironmentDocumentsOps[Self <: EnvironmentDocuments] (val x: Self) extends AnyVal {
    
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
    def setIndexed(value: Double): Self = this.set("indexed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexed: Self = this.set("indexed", js.undefined)
    
    @scala.inline
    def setMaximum_allowed(value: Double): Self = this.set("maximum_allowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximum_allowed: Self = this.set("maximum_allowed", js.undefined)
  }
}
