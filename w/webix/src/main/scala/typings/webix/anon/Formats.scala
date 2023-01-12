package typings.webix.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Formats extends StObject {
  
  var formats: Currencies
  
  var labels: Addchart
  
  var liveEditor: Edit
  
  var menus: Adddropdown
  
  var table: Formaterror
  
  var tooltips: Addcomment
}
object Formats {
  
  inline def apply(
    formats: Currencies,
    labels: Addchart,
    liveEditor: Edit,
    menus: Adddropdown,
    table: Formaterror,
    tooltips: Addcomment
  ): Formats = {
    val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], liveEditor = liveEditor.asInstanceOf[js.Any], menus = menus.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], tooltips = tooltips.asInstanceOf[js.Any])
    __obj.asInstanceOf[Formats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Formats] (val x: Self) extends AnyVal {
    
    inline def setFormats(value: Currencies): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    inline def setLabels(value: Addchart): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLiveEditor(value: Edit): Self = StObject.set(x, "liveEditor", value.asInstanceOf[js.Any])
    
    inline def setMenus(value: Adddropdown): Self = StObject.set(x, "menus", value.asInstanceOf[js.Any])
    
    inline def setTable(value: Formaterror): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTooltips(value: Addcomment): Self = StObject.set(x, "tooltips", value.asInstanceOf[js.Any])
  }
}
