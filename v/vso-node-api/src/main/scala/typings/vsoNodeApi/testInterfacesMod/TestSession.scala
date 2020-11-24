package typings.vsoNodeApi.testInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestSession extends js.Object {
  
  /**
    * Area path of the test session
    */
  var area: ShallowReference = js.native
  
  /**
    * Comments in the test session
    */
  var comment: String = js.native
  
  /**
    * Duration of the session
    */
  var endDate: Date = js.native
  
  /**
    * Id of the test session
    */
  var id: Double = js.native
  
  /**
    * Last Updated By  Reference
    */
  var lastUpdatedBy: IdentityRef = js.native
  
  /**
    * Last updated date
    */
  var lastUpdatedDate: Date = js.native
  
  /**
    * Owner of the test session
    */
  var owner: IdentityRef = js.native
  
  /**
    * Project to which the test session belongs
    */
  var project: ShallowReference = js.native
  
  /**
    * Generic store for test session data
    */
  var propertyBag: PropertyBag = js.native
  
  /**
    * Revision of the test session
    */
  var revision: Double = js.native
  
  /**
    * Source of the test session
    */
  var source: TestSessionSource = js.native
  
  /**
    * Start date
    */
  var startDate: Date = js.native
  
  /**
    * State of the test session
    */
  var state: TestSessionState = js.native
  
  /**
    * Title of the test session
    */
  var title: String = js.native
  
  /**
    * Url of Test Session Resource
    */
  var url: String = js.native
}
object TestSession {
  
  @scala.inline
  def apply(
    area: ShallowReference,
    comment: String,
    endDate: Date,
    id: Double,
    lastUpdatedBy: IdentityRef,
    lastUpdatedDate: Date,
    owner: IdentityRef,
    project: ShallowReference,
    propertyBag: PropertyBag,
    revision: Double,
    source: TestSessionSource,
    startDate: Date,
    state: TestSessionState,
    title: String,
    url: String
  ): TestSession = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastUpdatedBy = lastUpdatedBy.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], propertyBag = propertyBag.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestSession]
  }
  
  @scala.inline
  implicit class TestSessionOps[Self <: TestSession] (val x: Self) extends AnyVal {
    
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
    def setArea(value: ShallowReference): Self = this.set("area", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDate(value: Date): Self = this.set("endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedBy(value: IdentityRef): Self = this.set("lastUpdatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDate(value: Date): Self = this.set("lastUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: IdentityRef): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProject(value: ShallowReference): Self = this.set("project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyBag(value: PropertyBag): Self = this.set("propertyBag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: Double): Self = this.set("revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: TestSessionSource): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDate(value: Date): Self = this.set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: TestSessionState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
