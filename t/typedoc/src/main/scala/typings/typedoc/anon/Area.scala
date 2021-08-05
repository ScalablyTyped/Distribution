package typings.typedoc.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Area extends StObject {
  
  var area: Boolean
  
  var base: Boolean
  
  var br: Boolean
  
  var col: Boolean
  
  var command: Boolean
  
  var embed: Boolean
  
  var hr: Boolean
  
  var img: Boolean
  
  var input: Boolean
  
  var link: Boolean
  
  var meta: Boolean
  
  var param: Boolean
  
  var source: Boolean
  
  var wbr: Boolean
}
object Area {
  
  inline def apply(
    area: Boolean,
    base: Boolean,
    br: Boolean,
    col: Boolean,
    command: Boolean,
    embed: Boolean,
    hr: Boolean,
    img: Boolean,
    input: Boolean,
    link: Boolean,
    meta: Boolean,
    param: Boolean,
    source: Boolean,
    wbr: Boolean
  ): Area = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], br = br.asInstanceOf[js.Any], col = col.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], embed = embed.asInstanceOf[js.Any], hr = hr.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], wbr = wbr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Area]
  }
  
  extension [Self <: Area](x: Self) {
    
    inline def setArea(value: Boolean): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    inline def setBase(value: Boolean): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBr(value: Boolean): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
    
    inline def setCol(value: Boolean): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: Boolean): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setEmbed(value: Boolean): Self = StObject.set(x, "embed", value.asInstanceOf[js.Any])
    
    inline def setHr(value: Boolean): Self = StObject.set(x, "hr", value.asInstanceOf[js.Any])
    
    inline def setImg(value: Boolean): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
    
    inline def setInput(value: Boolean): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setLink(value: Boolean): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: Boolean): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setParam(value: Boolean): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Boolean): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setWbr(value: Boolean): Self = StObject.set(x, "wbr", value.asInstanceOf[js.Any])
  }
}
