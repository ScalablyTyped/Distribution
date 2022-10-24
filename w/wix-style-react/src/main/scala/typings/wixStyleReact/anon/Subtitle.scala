package typings.wixStyleReact.anon

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subtitle extends StObject {
  
  /** A content of the item */
  var content: Requireable[ReactNodeLike]
  
  /** Is item disabled */
  var disabled: Requireable[Boolean]
  
  /** An index of the item in the items list */
  var idx: Requireable[Double]
  
  /** A callback which is invoked every time the selection of the item is changed */
  var onChange: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  /** A flag that indicates a open state */
  var open: Requireable[Boolean]
  
  /** An optional second row of the header */
  var subtitle: Requireable[ReactNodeLike]
  
  /** A title of the item */
  var title: Requireable[ReactNodeLike]
  
  /** A type can be ether radio, checkbox, or toggle, which will effect the way an accordion item is selected */
  var `type`: Requireable[String]
  
  /** Extra space on top and bottom of selectable accordion item */
  var verticalPadding: Requireable[String]
}
object Subtitle {
  
  inline def apply(
    content: Requireable[ReactNodeLike],
    disabled: Requireable[Boolean],
    idx: Requireable[Double],
    onChange: Requireable[js.Function1[/* repeated */ Any, Any]],
    open: Requireable[Boolean],
    subtitle: Requireable[ReactNodeLike],
    title: Requireable[ReactNodeLike],
    `type`: Requireable[String],
    verticalPadding: Requireable[String]
  ): Subtitle = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], idx = idx.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], verticalPadding = verticalPadding.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subtitle]
  }
  
  extension [Self <: Subtitle](x: Self) {
    
    inline def setContent(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Requireable[Boolean]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setIdx(value: Requireable[Double]): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: Requireable[Boolean]): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setSubtitle(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: Requireable[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVerticalPadding(value: Requireable[String]): Self = StObject.set(x, "verticalPadding", value.asInstanceOf[js.Any])
  }
}
