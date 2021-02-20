package typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Page extends StObject {
  
  /**
    * Contribution for the page.
    */
  var contribution: WitContribution = js.native
  
  /**
    * The id for the layout node.
    */
  var id: String = js.native
  
  /**
    * A value indicating whether this layout node has been inherited from a parent layout.  This is expected to only be only set by the combiner.
    */
  var inherited: Boolean = js.native
  
  /**
    * A value indicating if the layout node is contribution are not.
    */
  var isContribution: Boolean = js.native
  
  /**
    * The label for the page.
    */
  var label: String = js.native
  
  /**
    * A value indicating whether any user operations are permitted on this page and the contents of this page
    */
  var locked: Boolean = js.native
  
  /**
    * Order in which the page should appear in the layout.
    */
  var order: Double = js.native
  
  /**
    * A value indicating whether this layout node has been overridden by a child layout.
    */
  var overridden: Boolean = js.native
  
  /**
    * The icon for the page.
    */
  var pageType: PageType = js.native
  
  /**
    * The sections of the page.
    */
  var sections: js.Array[Section] = js.native
  
  /**
    * A value indicating if the page should be hidden or not.
    */
  var visible: Boolean = js.native
}
object Page {
  
  @scala.inline
  def apply(
    contribution: WitContribution,
    id: String,
    inherited: Boolean,
    isContribution: Boolean,
    label: String,
    locked: Boolean,
    order: Double,
    overridden: Boolean,
    pageType: PageType,
    sections: js.Array[Section],
    visible: Boolean
  ): Page = {
    val __obj = js.Dynamic.literal(contribution = contribution.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inherited = inherited.asInstanceOf[js.Any], isContribution = isContribution.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], overridden = overridden.asInstanceOf[js.Any], pageType = pageType.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page]
  }
  
  @scala.inline
  implicit class PageMutableBuilder[Self <: Page] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContribution(value: WitContribution): Self = StObject.set(x, "contribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInherited(value: Boolean): Self = StObject.set(x, "inherited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsContribution(value: Boolean): Self = StObject.set(x, "isContribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridden(value: Boolean): Self = StObject.set(x, "overridden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageType(value: PageType): Self = StObject.set(x, "pageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSections(value: js.Array[Section]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionsVarargs(value: Section*): Self = StObject.set(x, "sections", js.Array(value :_*))
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
