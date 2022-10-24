package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollapseExpand extends StObject {
  
  var collapse: typings.wixStyleReact.distTypesTransitionTransitionDottypesMod.Collapse
  
  var expand: typings.wixStyleReact.distTypesTransitionTransitionDottypesMod.Expand
  
  var `type`: String
}
object CollapseExpand {
  
  inline def apply(
    collapse: typings.wixStyleReact.distTypesTransitionTransitionDottypesMod.Collapse,
    expand: typings.wixStyleReact.distTypesTransitionTransitionDottypesMod.Expand,
    `type`: String
  ): CollapseExpand = {
    val __obj = js.Dynamic.literal(collapse = collapse.asInstanceOf[js.Any], expand = expand.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollapseExpand]
  }
  
  extension [Self <: CollapseExpand](x: Self) {
    
    inline def setCollapse(value: typings.wixStyleReact.distTypesTransitionTransitionDottypesMod.Collapse): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
    
    inline def setExpand(value: typings.wixStyleReact.distTypesTransitionTransitionDottypesMod.Expand): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
