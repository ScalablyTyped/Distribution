package typings.vsoNodeApi.interfacesTestInterfacesMod

import typings.vsoNodeApi.interfacesCommonVssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestSession extends StObject {
  
  /**
    * Area path of the test session
    */
  var area: ShallowReference
  
  /**
    * Comments in the test session
    */
  var comment: String
  
  /**
    * Duration of the session
    */
  var endDate: js.Date
  
  /**
    * Id of the test session
    */
  var id: Double
  
  /**
    * Last Updated By  Reference
    */
  var lastUpdatedBy: IdentityRef
  
  /**
    * Last updated date
    */
  var lastUpdatedDate: js.Date
  
  /**
    * Owner of the test session
    */
  var owner: IdentityRef
  
  /**
    * Project to which the test session belongs
    */
  var project: ShallowReference
  
  /**
    * Generic store for test session data
    */
  var propertyBag: PropertyBag
  
  /**
    * Revision of the test session
    */
  var revision: Double
  
  /**
    * Source of the test session
    */
  var source: TestSessionSource
  
  /**
    * Start date
    */
  var startDate: js.Date
  
  /**
    * State of the test session
    */
  var state: TestSessionState
  
  /**
    * Title of the test session
    */
  var title: String
  
  /**
    * Url of Test Session Resource
    */
  var url: String
}
object TestSession {
  
  inline def apply(
    area: ShallowReference,
    comment: String,
    endDate: js.Date,
    id: Double,
    lastUpdatedBy: IdentityRef,
    lastUpdatedDate: js.Date,
    owner: IdentityRef,
    project: ShallowReference,
    propertyBag: PropertyBag,
    revision: Double,
    source: TestSessionSource,
    startDate: js.Date,
    state: TestSessionState,
    title: String,
    url: String
  ): TestSession = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastUpdatedBy = lastUpdatedBy.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], propertyBag = propertyBag.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestSession]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestSession] (val x: Self) extends AnyVal {
    
    inline def setArea(value: ShallowReference): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedBy(value: IdentityRef): Self = StObject.set(x, "lastUpdatedBy", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDate(value: js.Date): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: IdentityRef): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setProject(value: ShallowReference): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setPropertyBag(value: PropertyBag): Self = StObject.set(x, "propertyBag", value.asInstanceOf[js.Any])
    
    inline def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setSource(value: TestSessionSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setState(value: TestSessionState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
